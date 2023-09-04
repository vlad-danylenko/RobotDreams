package src.reflection.homework;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class LengthNameInterceptor {
    public void checkForNameValidation(Object object) {
        checkIfSerializable(object);
        validateFullName(object);
    }

    private void checkIfSerializable(Object object) {
        if (Objects.isNull(object)) {
            throw new LengthNameException("Can't validate a null object");
        }
    }

    private void validateFullName(Object object) {
        Class<?> clazz = object.getClass();
        Arrays.stream(clazz.getDeclaredFields()).forEach(
                field -> {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(LengthNameValidator.class)) {
                        try {
                            String fullName = (String) field.get(object);
                            validatePersonFullName(fullName, field);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
    }

    private void validatePersonFullName(String fullName, Field field) {
        if (fullName.length()>30) {
            throw new LengthNameException("Provided name " + fullName + " for " + field.getName() + " field is too long");
        } else {
            System.out.println("Name: " + fullName + " is accepted");
        }
    }
}


