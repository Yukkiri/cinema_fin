package ru.puchkova.restcinemahometask.infrastructure;

import java.util.Optional;
import java.util.function.Supplier;

public class CommonUtils {

    public static <T> T safeGet(T object, Supplier<? extends RuntimeException> exceptionSupplier) {
        return Optional.ofNullable(object).orElseThrow(exceptionSupplier);
    }
}
