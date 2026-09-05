/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.ButtonOption
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.StateManager
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableSet;
import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.ActionController;
import dev.isxander.yacl3.impl.ButtonOptionImpl$EmptyBinderImpl;
import java.util.function.BiConsumer;
import minecraft.class00392;

public final class ButtonOptionImpl
implements ButtonOption {
    private final class00392 name;
    private final OptionDescription description;
    private final StateManager<BiConsumer<YACLScreen, ButtonOption>> stateManager;
    private boolean available;
    private final Controller<BiConsumer<YACLScreen, ButtonOption>> controller;

    public void addEventListener(OptionEventListener<BiConsumer<YACLScreen, ButtonOption>> optionEventListener) {
    }

    public void addListener(BiConsumer<Option<BiConsumer<YACLScreen, ButtonOption>>, BiConsumer<YACLScreen, ButtonOption>> biConsumer) {
    }

    public OptionDescription description() {
        return this.description;
    }

    public ButtonOptionImpl(class00392 class003922, OptionDescription optionDescription, BiConsumer<YACLScreen, ButtonOption> biConsumer, class00392 class003923, boolean bl) {
        this.name = class003922;
        this.description = optionDescription;
        this.stateManager = StateManager.createImmutable(biConsumer);
        this.available = bl;
        this.controller = class003923 != null ? new ActionController(this, class003923) : new ActionController(this);
    }

    public class00392 name() {
        return this.name;
    }

    public ImmutableSet<OptionFlag> flags() {
        return ImmutableSet.of();
    }

    public BiConsumer<YACLScreen, ButtonOption> action() {
        return (BiConsumer)this.stateManager().get();
    }

    public Binding<BiConsumer<YACLScreen, ButtonOption>> binding() {
        return new ButtonOptionImpl$EmptyBinderImpl();
    }

    public boolean available() {
        return this.available;
    }

    public boolean changed() {
        return false;
    }

    public class00392 tooltip() {
        return this.description().text();
    }

    public boolean applyValue() {
        return false;
    }

    public void requestSet(BiConsumer<YACLScreen, ButtonOption> biConsumer) {
        throw new UnsupportedOperationException();
    }

    public boolean isPendingValueDefault() {
        throw new UnsupportedOperationException();
    }

    public Controller<BiConsumer<YACLScreen, ButtonOption>> controller() {
        return this.controller;
    }

    public StateManager<BiConsumer<YACLScreen, ButtonOption>> stateManager() {
        return this.stateManager;
    }

    public void setAvailable(boolean bl) {
        this.available = bl;
    }

    public BiConsumer<YACLScreen, ButtonOption> pendingValue() {
        throw new UnsupportedOperationException();
    }

    public void forgetPendingValue() {
    }

    public void requestSetDefault() {
    }
}

