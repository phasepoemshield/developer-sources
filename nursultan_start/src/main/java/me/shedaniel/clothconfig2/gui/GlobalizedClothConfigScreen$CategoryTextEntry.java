/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05936
 *  minecraft.class06202
 */
package me.shedaniel.clothconfig2.gui;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05936;
import minecraft.class06202;

class GlobalizedClothConfigScreen$CategoryTextEntry
extends AbstractConfigListEntry<Object> {
    final class00392 category;
    private final class00392 text;

    public GlobalizedClothConfigScreen$CategoryTextEntry(class00392 class003922, class00392 class003923) {
        super((class00392)class00392.y((String)UUID.randomUUID().toString()), false);
        this.category = class003922;
        this.text = class003923;
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
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        int n8 = n2 + 2;
        List list = ((class01590)class06202.Nq().i_3).L((class05936)this.text, this.getParent().getItemWidth());
        for (class01028 class010282 : list) {
            class010542.y((class01590)class06202.Nq().i_3, class010282, n3 - 4 + n4 / 2 - ((class01590)class06202.Nq().i_3).N(class010282) / 2, n8, -1);
            n8 += 10;
        }
    }

    public boolean isMouseInside(int n, int n2, int n3, int n4, int n5, int n6) {
        return false;
    }

    public int getItemHeight() {
        List list = ((class01590)class06202.Nq().i_3).L((class05936)this.text, this.getParent().getItemWidth());
        if (list.isEmpty()) {
            return 0;
        }
        return 4 + list.size() * 10;
    }

    public List<? extends class03434> narratables() {
        return Collections.emptyList();
    }
}

