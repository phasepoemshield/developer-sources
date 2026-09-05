/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.impl.OptionImpl$BuilderImpl
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import com.google.common.collect.ImmutableSet;
import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option$Builder;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.impl.OptionImpl;
import java.util.function.BiConsumer;
import minecraft.class00392;

public interface Option<T> {
    public void addEventListener(OptionEventListener<T> var1);

    @Deprecated
    public void addListener(BiConsumer<Option<T>, T> var1);

    public OptionDescription description();

    public class00392 name();

    public ImmutableSet<OptionFlag> flags();

    @Deprecated
    public Binding<T> binding();

    public boolean available();

    public boolean changed();

    @Deprecated
    public class00392 tooltip();

    public static <T> Option$Builder<T> createBuilder() {
        return new OptionImpl.BuilderImpl();
    }

    @Deprecated
    public static <T> Option$Builder<T> createBuilder(Class<T> clazz) {
        return Option.createBuilder();
    }

    public boolean applyValue();

    public void requestSet(T var1);

    public boolean isPendingValueDefault();

    public Controller<T> controller();

    public StateManager<T> stateManager();

    public void setAvailable(boolean var1);

    default public boolean canResetToDefault() {
        return true;
    }

    public T pendingValue();

    public void forgetPendingValue();

    public void requestSetDefault();
}

