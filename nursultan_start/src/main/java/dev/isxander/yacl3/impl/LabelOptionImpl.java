/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.api.LabelOption
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.StateManager
 *  dev.isxander.yacl3.gui.controllers.LabelController
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableSet;
import dev.isxander.yacl3.api.LabelOption;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.gui.controllers.LabelController;
import dev.isxander.yacl3.impl.OptionImpl;
import java.util.Collection;
import minecraft.class00392;

public class LabelOptionImpl
extends OptionImpl<class00392>
implements LabelOption {
    public LabelOptionImpl(StateManager<class00392> stateManager, Collection<OptionEventListener<class00392>> collection) {
        super((class00392)class00392.y((String)"Label Option"), class003922 -> OptionDescription.of((class00392[])new class00392[]{class003922}), LabelController::new, stateManager, true, (ImmutableSet<OptionFlag>)ImmutableSet.of(), collection);
    }

    public LabelOptionImpl(class00392 class003922) {
        this((StateManager<class00392>)StateManager.createImmutable((Object)class003922), (Collection<OptionEventListener<class00392>>)ImmutableSet.of());
    }

    public class00392 label() {
        return (class00392)this.stateManager().get();
    }

    @Override
    public void setAvailable(boolean bl) {
        throw new UnsupportedOperationException("Cannot change availability of label option");
    }
}

