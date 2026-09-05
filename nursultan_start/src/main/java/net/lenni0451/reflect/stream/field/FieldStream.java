/*
 * Decompiled with CFR 0.152.
 */
package net.lenni0451.reflect.stream.field;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.lenni0451.reflect.Fields;
import net.lenni0451.reflect.exceptions.FieldNotFoundException;
import net.lenni0451.reflect.stream.RStream;
import net.lenni0451.reflect.stream.field.FieldWrapper;

public class FieldStream {
    private final RStream parent;
    private final List<FieldWrapper> fields;

    public FieldStream(RStream parent, boolean withSuper) {
        this.parent = parent;
        this.fields = new ArrayList<FieldWrapper>();
        Class<?> clazz = parent.clazz();
        do {
            for (Field field : Fields.getDeclaredFields(clazz)) {
                this.fields.add(new FieldWrapper(this, field));
            }
        } while (withSuper && (clazz = clazz.getSuperclass()) != null);
    }

    private FieldStream(RStream parent, List<FieldWrapper> fields) {
        this.parent = parent;
        this.fields = fields;
    }

    public RStream parent() {
        return this.parent;
    }

    public int size() {
        return this.fields.size();
    }

    public Iterator<FieldWrapper> iterator() {
        return this.fields.iterator();
    }

    public <T> Stream<T> map(Function<FieldWrapper, T> mapFunction) {
        return this.jstream().map(mapFunction);
    }

    @Deprecated
    public FieldStream filter(boolean isStatic) {
        return this.filterStatic(isStatic);
    }

    @Deprecated
    public FieldStream filter(Class<?> type) {
        return this.filterType(type);
    }

    public FieldStream filter(Predicate<FieldWrapper> filter) {
        this.fields.removeIf(filter.negate());
        return this;
    }

    @Deprecated
    public FieldStream filter(String ... names) {
        return this.filterNames(names);
    }

    @Deprecated
    public FieldStream filter(Collection<String> names) {
        return this.filterNames(names);
    }

    public FieldStream forEach(Consumer<FieldWrapper> consumer) {
        this.fields.forEach(consumer);
        return this;
    }

    public FieldStream copy() {
        return new FieldStream(this.parent, new ArrayList<FieldWrapper>(this.fields));
    }

    public FieldStream filterType(Class<?> clazz) {
        return this.filter((FieldWrapper field) -> field.type().equals(clazz));
    }

    public Optional<FieldWrapper> opt(int index) {
        if (index < 0 || index > this.fields.size()) {
            return Optional.empty();
        }
        return Optional.of(this.fields.get(index));
    }

    public Optional<FieldWrapper> opt(String name) {
        for (FieldWrapper field : this.fields) {
            if (!field.name().equals(name)) continue;
            return Optional.of(field);
        }
        return Optional.empty();
    }

    public FieldWrapper by(String name) {
        return this.opt(name).orElseThrow(() -> new FieldNotFoundException(this.parent.clazz().getName(), name));
    }

    public FieldWrapper by(int index) {
        return this.opt(index).orElseThrow(() -> new FieldNotFoundException(this.parent.clazz().getName(), String.valueOf(index)));
    }

    public FieldStream filterNames(String ... names) {
        return this.filter(Arrays.asList(names));
    }

    public FieldStream filterNames(Collection<String> names) {
        return this.filter((FieldWrapper f) -> names.contains(f.name()));
    }

    public FieldStream filterAnnotation(Class<?> annotation) {
        return this.filter((FieldWrapper field) -> field.annotations().anyMatch(a -> a.annotationType().equals(annotation)));
    }

    public FieldStream filterStatic(boolean isStatic) {
        return this.filter((FieldWrapper field) -> field.modifier().isStatic() == isStatic);
    }

    public Stream<FieldWrapper> jstream() {
        return this.fields.stream();
    }
}

