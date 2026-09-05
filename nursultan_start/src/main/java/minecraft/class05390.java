/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07536
 *  minecraft.class08084
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class07536;
import minecraft.class08084;

public final class class05390
extends Record {
    private final List<class08084<?>> values;
    public static final class05390 N = new class05390(List.of());
    private static final Comparator<class08084<?>> L = Comparator.comparing(class080842 -> class080842.N().R());

    public class05390(List<class08084<?>> list) {
        this.values = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05390.class, "values", "values"}, this, object);
    }

    public String toString() {
        return this.N();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05390.class, "values", "values"}, this);
    }

    public List<class08084<?>> y() {
        return this.values;
    }

    public class05390 N(class05390 class053902) {
        return new class05390((List<class08084<?>>)ImmutableList.builder().addAll(this.values).addAll(class053902.values).build());
    }

    public class05390 N(class08084<?> class080842) {
        return new class05390(class07536.N(this.values, class080842));
    }

    public static class05390 N(class08084<?> ... class08084Array) {
        return new class05390(List.of(class08084Array));
    }

    public String N() {
        return this.values.stream().sorted(L).map(class08084::toString).collect(Collectors.joining(","));
    }
}

