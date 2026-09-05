/*
 * Decompiled with CFR 0.152.
 */
package net.lenni0451.reflect.stream.field;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.stream.Stream;
import net.lenni0451.reflect.Fields;
import net.lenni0451.reflect.stream.RStream;
import net.lenni0451.reflect.stream.field.FieldStream;
import net.lenni0451.reflect.stream.general.ModifierWrapper;

public class FieldWrapper {
    private final FieldStream parent;
    private final Field field;
    private final ModifierWrapper modifier;

    public Stream<Annotation> annotations() {
        return Arrays.stream(this.field.getDeclaredAnnotations());
    }

    public FieldWrapper(FieldStream parent, Field field) {
        this.parent = parent;
        this.field = field;
        this.modifier = new ModifierWrapper(this.field.getModifiers());
    }

    public String name() {
        return this.field.getName();
    }

    public FieldStream parent() {
        return this.parent;
    }

    public <T> T get(Object instance) {
        return Fields.get(instance, this.field);
    }

    public <T> T get() {
        if (!this.modifier.isStatic() && this.parent.parent().instance() == null) {
            throw new IllegalStateException("Can not get non static field if no instance is provided");
        }
        return Fields.get(this.parent.parent().instance(), this.field);
    }

    public Class<?> type() {
        return this.field.getType();
    }

    public boolean equals(Object obj) {
        if (obj instanceof FieldWrapper) {
            return this.field.equals(((FieldWrapper)obj).field);
        }
        if (obj instanceof Field) {
            return this.field.equals(obj);
        }
        return false;
    }

    public String toString() {
        return this.field.toString();
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    public RStream stream(Class<?> clazz) {
        return RStream.of(clazz, this.get());
    }

    public RStream stream(Class<?> clazz, Object instance) {
        return RStream.of(clazz, this.get(instance));
    }

    public RStream stream(Object instance) {
        return RStream.of(this.get(instance));
    }

    public RStream stream() {
        return RStream.of(this.get());
    }

    public void set(Object value) {
        if (!this.modifier.isStatic() && this.parent.parent().instance() == null) {
            throw new IllegalStateException("Can not set non-static field if no instance is provided");
        }
        Fields.set(this.parent.parent().instance(), this.field, value);
    }

    public void set(Object instance, Object value) {
        Fields.set(instance, this.field, value);
    }

    public Class<?> owner() {
        return this.field.getDeclaringClass();
    }

    public void copy(Object instance, Object target) {
        if (this.modifier.isStatic()) {
            throw new IllegalStateException("Can not copy static field");
        }
        Fields.copy(instance, target, this.field);
    }

    public void copy(Object target) {
        if (this.modifier.isStatic()) {
            throw new IllegalStateException("Can not copy static field");
        }
        if (this.parent.parent().instance() == null) {
            throw new IllegalStateException("Can not copy field if no instance is provided");
        }
        Fields.copy(this.parent.parent().instance(), target, this.field);
    }

    public Field raw() {
        return this.field;
    }

    public ModifierWrapper modifier() {
        return this.modifier;
    }

    public Type[] genericTypes() {
        if (this.field.getGenericType() instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)this.field.getGenericType();
            return parameterizedType.getActualTypeArguments();
        }
        return new Type[0];
    }
}

