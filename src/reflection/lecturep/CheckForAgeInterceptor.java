package src.reflection.lecturep;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class CheckForAgeInterceptor {
    public void checkForAgeValidation(Object object) {
        checkIfSerializable(object);
        validateAge(object);
    }

    private void checkIfSerializable(Object object) {
        if (Objects.isNull(object)) {
            throw new CheckForAgeException("Can't validate a null object");
        }

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(ShouldBeValidated.class)) {
            throw new CheckForAgeException("This class" + clazz.getSimpleName() + " is not annotated with ShouldBeValidated");
        }
    }

    private void validateAge(Object object) {
        Class<?> clazz = object.getClass();
        Arrays.stream(clazz.getDeclaredFields()).forEach(
                field -> {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(CheckForAge.class) && field.getAnnotation(CheckForAge.class).validate()) {
                        try {
                            int age = (Integer) field.get(object);
                            validateHumanAge(age,field);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
    }
    private void validateHumanAge(int age, Field field) {
        if(age < 1 || age > 100) {
            throw new CheckForAgeException("age is not related to human" + field.getDeclaringClass().getTypeName() + " " + age);
        } else {
            System.out.println("age is OK: " + field.getDeclaringClass().getTypeName() + " " + age);
        }
    }
}
