/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.LabelOption;
import dev.isxander.yacl3.api.StateManager;
import java.util.Collection;
import minecraft.class00392;

public interface LabelOption$Builder {
    public LabelOption$Builder lines(Collection<? extends class00392> var1);

    public LabelOption$Builder line(class00392 var1);

    public LabelOption$Builder state(StateManager<class00392> var1);

    public LabelOption build();
}

