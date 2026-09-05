/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ConfigScreen
 *  me.shedaniel.clothconfig2.gui.ClothConfigScreen$ListWidget
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class04995
 *  minecraft.class06202
 */
package me.shedaniel.clothconfig2.gui.widget;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigScreen;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen;
import me.shedaniel.clothconfig2.gui.widget.SearchFieldEntry$1;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class06202;

public class SearchFieldEntry
extends AbstractConfigListEntry<Object> {
    final class04927 editBox;
    private String[] lowerCases;

    public SearchFieldEntry(ConfigScreen configScreen, ClothConfigScreen.ListWidget<AbstractConfigEntry<AbstractConfigEntry<?>>> listWidget) {
        super((class00392)class00392.i(), false);
        this.editBox = new class04927((class01590)class06202.Nq().i_3, 0, 0, 100, 18, (class00392)class00392.i());
        this.lowerCases = this.editBox.method_1882().isEmpty() ? new String[]{} : this.editBox.method_1882().toLowerCase(Locale.ROOT).split(" ");
        this.editBox.method_1863(string -> {
            this.lowerCases = string.isEmpty() ? new String[]{} : string.toLowerCase(Locale.ROOT).split(" ");
        });
        listWidget.entriesTransformer = list -> new SearchFieldEntry$1(this, (List)list, configScreen);
    }

    public Object getValue() {
        return null;
    }

    public Optional<Object> getDefaultValue() {
        return Optional.empty();
    }

    public List<? extends class04654> method_25396() {
        return Collections.singletonList(this.editBox);
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.editBox.method_25358(class04995.N((int)(n4 - 10), (int)0, (int)500));
        this.editBox.method_46421(n3 + n4 / 2 - this.editBox.method_25368() / 2);
        this.editBox.method_46419(n2 + n5 / 2 - 9);
        this.editBox.method_25394(class010542, n6, n7, f);
        if (this.editBox.method_1882().isEmpty()) {
            this.editBox.method_1887("Search...");
        } else {
            this.editBox.method_1887(null);
        }
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
    }

    public boolean matchesSearch(Iterator<String> iterator) {
        if (this.lowerCases.length == 0) {
            return true;
        }
        if (!iterator.hasNext()) {
            return true;
        }
        for (String string : this.lowerCases) {
            boolean bl = false;
            for (String string2 : () -> iterator) {
                if (!string2.toLowerCase(Locale.ROOT).contains(string)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public List<? extends class03434> narratables() {
        return Collections.singletonList(this.editBox);
    }
}

