/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03434
 *  minecraft.class04654
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03434;
import minecraft.class04654;

public class EmptyEntry
extends AbstractConfigListEntry<Object> {
    private final int height;

    public EmptyEntry(int n) {
        super((class00392)class00392.y((String)UUID.randomUUID().toString()), false);
        this.height = n;
    }

    public Object getValue() {
        return null;
    }

    public Optional<Object> getDefaultValue() {
        return Optional.empty();
    }

    public List<? extends class04654> method_25396() {
        return Collections.emptyList();
    }

    public class02106 method_48205(class02089 class020892) {
        return null;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
    }

    public boolean isMouseInside(int n, int n2, int n3, int n4, int n5, int n6) {
        return false;
    }

    public int getItemHeight() {
        return this.height;
    }

    public Iterator<String> getSearchTags() {
        return Collections.emptyIterator();
    }

    public List<? extends class03434> narratables() {
        return Collections.emptyList();
    }
}

