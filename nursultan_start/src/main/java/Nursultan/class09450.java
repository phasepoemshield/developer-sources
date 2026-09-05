/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01207
 *  minecraft.class01894
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class01207;
import minecraft.class01894;

public final class class09450
extends Record {
    private final Function<class01894, Optional<class01207>> loader;
    private final Supplier<Stream<class01894>> lister;

    public class09450(Function<class01894, Optional<class01207>> function, Supplier<Stream<class01894>> supplier) {
        this.loader = function;
        this.lister = supplier;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09450.class, "loader;lister", "loader", "lister"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09450.class, "loader;lister", "loader", "lister"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09450.class, "loader;lister", "loader", "lister"}, this);
    }

    public Supplier<Stream<class01894>> y() {
        return this.lister;
    }

    public Function<class01894, Optional<class01207>> N() {
        return this.loader;
    }
}

