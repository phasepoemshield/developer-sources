/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.lenni0451.reflect.stream.constructor.ConstructorStream
 *  net.lenni0451.reflect.stream.method.MethodStream
 */
package net.lenni0451.reflect.stream;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.lenni0451.reflect.Classes;
import net.lenni0451.reflect.stream.constructor.ConstructorStream;
import net.lenni0451.reflect.stream.field.FieldStream;
import net.lenni0451.reflect.stream.method.MethodStream;

public class RStream {
    private final Class<?> clazz;
    private final Object instance;
    private boolean withSuper;

    public Class<?> clazz() {
        return this.clazz;
    }

    private RStream(@Nonnull Class<?> clazz, @Nullable Object instance) {
        this.clazz = clazz;
        this.instance = instance;
        Classes.ensureInitialized(this.clazz);
    }

    public static RStream of(@Nonnull Class<?> clazz) {
        return new RStream(clazz, null);
    }

    public static RStream of(@Nonnull Object instance) {
        return new RStream(instance.getClass(), instance);
    }

    public static RStream of(@Nonnull Class<?> clazz, @Nullable Object instance) {
        return new RStream(clazz, instance);
    }

    public static RStream of(@Nonnull String className) {
        return RStream.of(className, null);
    }

    public static RStream of(@Nonnull String className, @Nullable Object instance) {
        return RStream.of(Classes.forName(className), instance);
    }

    public MethodStream methods() {
        return new MethodStream(this, this.withSuper);
    }

    public FieldStream fields() {
        return new FieldStream(this, this.withSuper);
    }

    public ConstructorStream constructors() {
        return new ConstructorStream(this);
    }

    @Nullable
    public Object instance() {
        return this.instance;
    }

    public RStream withSuper() {
        if (this.withSuper) {
            return this;
        }
        this.withSuper = true;
        return this;
    }
}

