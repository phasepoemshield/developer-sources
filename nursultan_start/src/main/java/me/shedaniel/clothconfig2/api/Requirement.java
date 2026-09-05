/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import me.shedaniel.clothconfig2.api.ValueHolder;

@FunctionalInterface
public interface Requirement {
    public static <T> Requirement matches(ValueHolder<T> valueHolder, ValueHolder<T> valueHolder2) {
        return () -> Objects.equals(valueHolder.getValue(), valueHolder2.getValue());
    }

    public boolean check();

    public static Requirement all(Requirement ... requirementArray) {
        return () -> Arrays.stream(requirementArray).allMatch(Requirement::check);
    }

    public static Requirement not(Requirement requirement) {
        return () -> !requirement.check();
    }

    public static Requirement one(Requirement ... requirementArray) {
        return () -> {
            boolean bl = false;
            for (Requirement requirement : requirementArray) {
                if (!requirement.check()) continue;
                if (bl) {
                    return false;
                }
                bl = true;
            }
            return bl;
        };
    }

    public static Requirement any(Requirement ... requirementArray) {
        return () -> Arrays.stream(requirementArray).anyMatch(Requirement::check);
    }

    public static Requirement none(Requirement ... requirementArray) {
        return () -> Arrays.stream(requirementArray).noneMatch(Requirement::check);
    }

    public static Requirement isTrue(ValueHolder<Boolean> valueHolder) {
        return () -> Boolean.TRUE.equals(valueHolder.getValue());
    }

    public static Requirement isFalse(ValueHolder<Boolean> valueHolder) {
        return () -> Boolean.FALSE.equals(valueHolder.getValue());
    }

    @SafeVarargs
    public static <T> Requirement isValue(ValueHolder<T> valueHolder, T t, T ... TArray) {
        Set set = Stream.concat(Stream.of(t), Arrays.stream(TArray)).collect(Collectors.toCollection(HashSet::new));
        return () -> set.contains(valueHolder.getValue());
    }
}

