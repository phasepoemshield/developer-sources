/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05729
 *  minecraft.class06478
 */
package de.maxhenkel.voicechat.gui.widgets;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05729;
import minecraft.class06478;

public abstract class ListScreenEntryBase<T extends class05729<T>>
extends class05729<T> {
    protected final List<class06478> children = Lists.newArrayList();

    public List<? extends class04654> method_25396() {
        return this.children;
    }

    public List<? extends class03434> method_37025() {
        return this.children;
    }
}

