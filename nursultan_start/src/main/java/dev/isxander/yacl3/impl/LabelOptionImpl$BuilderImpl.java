/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.api.LabelOption
 *  dev.isxander.yacl3.api.LabelOption$Builder
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.StateManager
 *  minecraft.class00392
 *  minecraft.class05216
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableSet;
import dev.isxander.yacl3.api.LabelOption;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.impl.LabelOptionImpl;
import dev.isxander.yacl3.impl.SelfContainedBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import minecraft.class00392;
import minecraft.class05216;
import org.apache.commons.lang3.Validate;

public final class LabelOptionImpl$BuilderImpl
implements LabelOption.Builder {
    private StateManager<class00392> stateManager;
    private final List<class00392> lines = new ArrayList<class00392>();

    public LabelOption.Builder lines(Collection<? extends class00392> collection) {
        Validate.isTrue((this.stateManager == null ? 1 : 0) != 0, (String)".lines() is a helper to create a state manager for you at build. If you have defined a custom state manager, do not use .lines()", (Object[])new Object[0]);
        this.lines.addAll(collection);
        return this;
    }

    public LabelOption.Builder line(class00392 class003922) {
        Validate.isTrue((this.stateManager == null ? 1 : 0) != 0, (String)".line() is a helper to create a state manager for you at build. If you have defined a custom state manager, do not use .line()", (Object[])new Object[0]);
        Validate.notNull((Object)class003922, (String)"`line` must not be null", (Object[])new Object[0]);
        this.lines.add(class003922);
        return this;
    }

    public LabelOption.Builder state(StateManager<class00392> stateManager) {
        Validate.notNull(stateManager, (String)"`stateManager` must not be null", (Object[])new Object[0]);
        Validate.isTrue((boolean)this.lines.isEmpty(), (String)"Cannot set state manager if lines have already been defined", (Object[])new Object[0]);
        this.stateManager = stateManager;
        return this;
    }

    public LabelOption build() {
        Validate.isTrue((this.stateManager != null || !this.lines.isEmpty() ? 1 : 0) != 0, (String)"Cannot build label option without a state manager or lines", (Object[])new Object[0]);
        if (!this.lines.isEmpty()) {
            class05216 class052162 = class00392.i();
            Iterator<class00392> iterator = this.lines.iterator();
            while (iterator.hasNext()) {
                class052162.y(iterator.next());
                if (!iterator.hasNext()) continue;
                class052162.i("\n");
            }
            this.stateManager = StateManager.createSimple(new SelfContainedBinding<class05216>(class052162));
        }
        return new LabelOptionImpl(this.stateManager, (Collection<OptionEventListener<class00392>>)ImmutableSet.of());
    }
}

