/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09980;
import Nursultan.class09987;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.ToIntFunction;

final class class09984 {
    private class09984() {
    }

    static <T> BiPredicate<class09980, class09980> N(Function<class09980, T> function) {
        return (class099802, class099803) -> !Objects.equals(function.apply((class09980)class099802), function.apply((class09980)class099803));
    }

    static BiPredicate<class09980, class09980> N(ToIntFunction<class09980> toIntFunction) {
        return (class099802, class099803) -> toIntFunction.applyAsInt((class09980)class099802) != toIntFunction.applyAsInt((class09980)class099803);
    }

    static BiPredicate<class09980, class09980> N(class09987 class099872) {
        return (class099802, class099803) -> Float.compare(class099872.get((class09980)class099802), class099872.get((class09980)class099803)) != 0;
    }
}

