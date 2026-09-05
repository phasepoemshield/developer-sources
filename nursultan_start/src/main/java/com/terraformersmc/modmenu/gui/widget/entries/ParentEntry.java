/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07536
 *  minecraft.class08394
 */
package com.terraformersmc.modmenu.gui.widget.entries;

import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.gui.widget.ModListWidget;
import com.terraformersmc.modmenu.gui.widget.entries.ModListEntry;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.ModSearch;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07536;
import minecraft.class08394;

public class ParentEntry
extends ModListEntry {
    private static final class01894 PARENT_MOD_TEXTURE = class01894.N((String)"modmenu", (String)"textures/gui/parent_mod.png");
    protected List<Mod> children;
    protected ModListWidget list;
    protected boolean hoveringIcon = false;

    public List<Mod> getChildren() {
        return this.children;
    }

    public ParentEntry(Mod mod, List<Mod> list, ModListWidget modListWidget) {
        super(mod, modListWidget);
        this.children = list;
        this.list = modListWidget;
    }

    public boolean method_25404(class06601 class066012) {
        String string = this.getMod().getId();
        if (class066012.L()) {
            if (this.list.getParent().showModChildren.contains(string)) {
                this.list.getParent().showModChildren.remove(string);
            } else {
                this.list.getParent().showModChildren.add(string);
            }
            this.list.filter(this.list.getParent().getSearchInput(), false);
            return true;
        }
        if (class066012.R()) {
            if (this.list.getParent().showModChildren.contains(string)) {
                this.list.getParent().showModChildren.remove(string);
                this.list.filter(this.list.getParent().getSearchInput(), false);
            }
            return true;
        }
        if (class066012.M()) {
            if (!this.list.getParent().showModChildren.contains(string)) {
                this.list.getParent().showModChildren.add(string);
                this.list.filter(this.list.getParent().getSearchInput(), false);
                return true;
            }
            return this.list.method_25404(new class06601(264, 0, 0));
        }
        return super.method_25404(class066012);
    }

    public boolean method_25405(double d, double d2) {
        return Objects.equals((Object)this.list.getEntryAtPos(d, d2), (Object)this);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        int n = ModMenuConfig.COMPACT_LIST.getValue() ? 19 : 32;
        boolean bl2 = ModMenuConfig.QUICK_CONFIGURE.getValue();
        if (class066132.n() - (double)this.list.method_25342() <= (double)n) {
            this.toggleChildren();
            return true;
        }
        if (!bl2 && class07536.L() - this.sinceLastClick < 250L) {
            this.toggleChildren();
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public void setChildren(List<Mod> list) {
        this.children = list;
    }

    public void addChildren(Mod ... modArray) {
        this.children.addAll(Arrays.asList(modArray));
    }

    public void addChildren(List<Mod> list) {
        this.children.addAll(list);
    }

    private void toggleChildren() {
        String string = this.getMod().getId();
        if (this.list.getParent().showModChildren.contains(string)) {
            this.list.getParent().showModChildren.remove(string);
        } else {
            this.list.getParent().showModChildren.add(string);
        }
        this.list.filter(this.list.getParent().getSearchInput(), false, false);
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        super.method_25343(class010542, n, n2, bl, f);
        class01590 class015902 = (class01590)this.client.i_3;
        int n3 = this.method_73380() - 2;
        int n4 = this.method_73382() + this.getYOffset();
        Objects.requireNonNull(class015902);
        int n5 = 9;
        Objects.requireNonNull(class015902);
        int n6 = 9;
        int n7 = ModSearch.search(this.list.getParent(), this.list.getParent().getSearchInput(), this.getChildren()).size();
        class05216 class052162 = n7 == this.children.size() ? class00392.y((String)String.valueOf(n7)) : class00392.y((String)(n7 + "/" + this.children.size()));
        int n8 = class015902.N((class05936)class052162) - 1;
        if (n6 < n8 + 4) {
            n6 = n8 + 4;
        }
        int n9 = ModMenuConfig.COMPACT_LIST.getValue() ? 19 : 32;
        int n10 = n3 + n9 - n6;
        int n11 = n4 + n9 - n5;
        int n12 = -15698860;
        int n13 = -16172759;
        class010542.N(n10 + 1, n11, n10 + n6 - 1, n11 + 1, n12);
        class010542.N(n10, n11 + 1, n10 + 1, n11 + n5 - 1, n12);
        class010542.N(n10 + n6 - 1, n11 + 1, n10 + n6, n11 + n5 - 1, n12);
        class010542.N(n10 + 1, n11 + 1, n10 + n6 - 1, n11 + n5 - 1, n13);
        class010542.N(n10 + 1, n11 + n5 - 1, n10 + n6 - 1, n11 + n5, n12);
        class010542.N(class015902, class052162.method_30937(), (int)((float)n10 + (float)n6 / 2.0f - (float)n8 / 2.0f), n11 + 1, -3487030, false);
        boolean bl2 = this.hoveringIcon = n >= n3 - 1 && n <= n3 - 1 + n9 && n2 >= n4 - 1 && n2 <= n4 - 1 + n9;
        if (this.method_25405(n, n2)) {
            class010542.N(n3, n4, n3 + n9, n4 + n9, -1601138544);
            int n14 = this.list.getParent().showModChildren.contains(this.getMod().getId()) ? n9 : 0;
            int n15 = this.hoveringIcon ? n9 : 0;
            class010542.N(class08394.Na, PARENT_MOD_TEXTURE, n3, n4, (float)n14, (float)n15, n9 + n14, n9 + n15, ModMenuConfig.COMPACT_LIST.getValue() ? 152 : 256, ModMenuConfig.COMPACT_LIST.getValue() ? 152 : 256, -1);
        }
    }
}

