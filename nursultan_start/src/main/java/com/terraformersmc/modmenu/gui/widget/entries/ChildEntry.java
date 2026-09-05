/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class06601
 */
package com.terraformersmc.modmenu.gui.widget.entries;

import com.terraformersmc.modmenu.gui.widget.ModListWidget;
import com.terraformersmc.modmenu.gui.widget.entries.ModListEntry;
import com.terraformersmc.modmenu.gui.widget.entries.ParentEntry;
import com.terraformersmc.modmenu.util.mod.Mod;
import minecraft.class01054;
import minecraft.class06601;

public class ChildEntry
extends ModListEntry {
    private final boolean bottomChild;
    private final ParentEntry parent;

    public ChildEntry(Mod mod, ParentEntry parentEntry, ModListWidget modListWidget, boolean bl) {
        super(mod, modListWidget);
        this.bottomChild = bl;
        this.parent = parentEntry;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.R()) {
            this.list.setSelected(this.parent);
            this.list.ensureVisible(this.parent);
            return true;
        }
        return false;
    }

    @Override
    public int getXOffset() {
        return 13;
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        super.method_25343(class010542, n, n2, bl, f);
        int n3 = this.method_73380() - 2;
        int n4 = this.method_73382() + this.getYOffset();
        int n5 = this.method_73384();
        int n6 = -6250336;
        class010542.N(n3, n4 - 2, n3 + 1, n4 + (this.bottomChild ? n5 / 2 : n5 + 2), n6);
        class010542.N(n3, n4 + n5 / 2, n3 + 7, n4 + n5 / 2 + 1, n6);
    }
}

