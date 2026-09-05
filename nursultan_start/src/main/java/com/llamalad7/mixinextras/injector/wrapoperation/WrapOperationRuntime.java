/*
 * Decompiled with CFR 0.152.
 */
package com.llamalad7.mixinextras.injector.wrapoperation;

import com.llamalad7.mixinextras.injector.wrapoperation.IncorrectArgumentCountException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class WrapOperationRuntime {
    public static void checkArgumentCount(Object[] objectArray, int n, String string) {
        if (objectArray.length != n) {
            WrapOperationRuntime.throwIncorrectArgumentCount(objectArray, n, string);
        }
    }

    private static void throwIncorrectArgumentCount(Object[] objectArray, int n, String string) {
        String string2 = Arrays.stream(objectArray).map(object -> object == null ? "null" : object.getClass().getName()).collect(Collectors.joining(", ", "[", "]"));
        throw new IncorrectArgumentCountException(String.format("Incorrect number of arguments passed to Operation::call! Expected %s but got %s. Expected types were %s, actual types were %s.", n, objectArray.length, string, string2));
    }
}

