/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.GenericBindingImpl
 *  dev.isxander.yacl3.mixin.OptionInstanceAccessor
 *  minecraft.class04370
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.impl.GenericBindingImpl;
import dev.isxander.yacl3.mixin.OptionInstanceAccessor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class04370;
import org.apache.commons.lang3.Validate;

public interface Binding<T> {
    public static <T> Binding<T> generic(T t2, Supplier<T> supplier, Consumer<T> consumer) {
        Validate.notNull(t2, (String)"`def` must not be null", (Object[])new Object[0]);
        Validate.notNull(supplier, (String)"`getter` must not be null", (Object[])new Object[0]);
        Validate.notNull(consumer, (String)"`setter` must not be null", (Object[])new Object[0]);
        return new GenericBindingImpl(t2, supplier, consumer);
    }

    public static <T> Binding<T> minecraft(class04370<T> class043702) {
        Validate.notNull(class043702, (String)"`minecraftOption` must not be null", (Object[])new Object[0]);
        return new GenericBindingImpl(((OptionInstanceAccessor)class043702).getInitialValue(), () -> class043702.method_41753(), arg_0 -> class043702.method_41748(arg_0));
    }

    public T getValue();

    public T defaultValue();

    public void setValue(T var1);

    public static <T> Binding<T> immutable(T t2) {
        Validate.notNull(t2, (String)"`value` must not be null", (Object[])new Object[0]);
        return new GenericBindingImpl(t2, () -> t2, object -> {});
    }

    default public <U> Binding<U> xmap(Function<T, U> function, Function<U, T> function2) {
        return Binding.generic(function.apply(this.defaultValue()), () -> function.apply(this.getValue()), object -> this.setValue(function2.apply(object)));
    }
}

