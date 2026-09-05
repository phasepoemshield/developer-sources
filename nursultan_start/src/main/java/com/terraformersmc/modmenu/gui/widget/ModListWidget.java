/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05724
 *  minecraft.class06202
 *  minecraft.class06601
 *  org.jspecify.annotations.Nullable
 */
package com.terraformersmc.modmenu.gui.widget;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.gui.widget.entries.ChildEntry;
import com.terraformersmc.modmenu.gui.widget.entries.IndependentEntry;
import com.terraformersmc.modmenu.gui.widget.entries.ModListEntry;
import com.terraformersmc.modmenu.gui.widget.entries.ParentEntry;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import com.terraformersmc.modmenu.util.mod.ModSearch;
import com.terraformersmc.modmenu.util.mod.fabric.FabricIconHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05724;
import minecraft.class06202;
import minecraft.class06601;
import org.jspecify.annotations.Nullable;

public class ModListWidget
extends class05724<ModListEntry>
implements AutoCloseable {
    public static final boolean DEBUG = Boolean.getBoolean("modmenu.debug");
    private final ModsScreen parent;
    private List<Mod> mods = null;
    private final Set<Mod> addedMods = new HashSet<Mod>();
    private String selectedModId = null;
    private final FabricIconHandler iconHandler = new FabricIconHandler();
    private Double restoreScrollY = null;

    protected void removeEntry(ModListEntry modListEntry) {
        this.addedMods.remove(modListEntry.mod);
        super.method_25330((class01202)modListEntry);
    }

    public void select(ModListEntry modListEntry) {
        this.setSelected(modListEntry);
        if (modListEntry != null) {
            Mod mod = modListEntry.getMod();
            this.field_22740.NT().y((class00392)class00392.N((String)"narrator.select", (Object[])new Object[]{mod.getTranslatedName()}));
        }
    }

    public ModListWidget(class06202 class062022, int n, int n2, int n3, int n4, ModListWidget modListWidget, ModsScreen modsScreen) {
        super(class062022, n, n2, n3, n4);
        this.parent = modsScreen;
        if (modListWidget != null) {
            this.mods = modListWidget.mods;
            this.restoreScrollY = modListWidget.method_44387();
        }
    }

    protected void remove(int n) {
        ModListEntry modListEntry = (ModListEntry)((Object)this.method_25396().get(n));
        this.addedMods.remove(modListEntry.mod);
        super.method_25330((class01202)modListEntry);
    }

    public void filter(String string, boolean bl) {
        this.filter(string, bl, true);
    }

    public void filter(String string, boolean bl, boolean bl2) {
        this.method_25339();
        this.addedMods.clear();
        ArrayList arrayList = (ArrayList)((Object)ModMenu.MODS.values().stream().filter(mod -> {
            if (ModMenuConfig.CONFIG_MODE.getValue()) {
                return this.parent.getModHasConfigScreen(mod.getId());
            }
            return !mod.isHidden();
        }).collect(Collectors.toSet()));
        if (DEBUG) {
            arrayList = new ArrayList(arrayList);
        }
        if (this.mods == null || bl) {
            this.mods = new ArrayList<Mod>();
            this.mods.addAll(arrayList);
            this.mods.sort(ModMenuConfig.SORTING.getValue().getComparator());
        }
        for (Object object : ModSearch.search(this.parent, string, this.mods)) {
            String string2 = object.getId();
            if (object.getBadges().contains((Object)Mod$Badge.LIBRARY) && !ModMenuConfig.SHOW_LIBRARIES.getValue() || ModMenu.PARENT_MAP.values().contains(object)) continue;
            if (ModMenu.PARENT_MAP.keySet().contains(object) && this.hasVisibleChildMods((Mod)object)) {
                List list = ModMenu.PARENT_MAP.get(object);
                list.sort(ModMenuConfig.SORTING.getValue().getComparator());
                ParentEntry parentEntry = new ParentEntry((Mod)object, list, this);
                this.addEntry(parentEntry);
                if (!this.parent.showModChildren.contains(string2)) continue;
                List<Mod> list2 = ModSearch.search(this.parent, string, list);
                for (Mod mod2 : list2) {
                    this.addEntry(new ChildEntry(mod2, parentEntry, this, list2.indexOf(mod2) == list2.size() - 1));
                }
                continue;
            }
            this.addEntry(new IndependentEntry((Mod)object, this));
        }
        if (!bl2) {
            return;
        }
        if (this.parent.getSelectedEntry() != null && !this.method_25396().isEmpty() || this.method_25334() != null && ((ModListEntry)this.method_25334()).getMod() != this.parent.getSelectedEntry().getMod()) {
            for (Object object : this.method_25396()) {
                if (!((ModListEntry)((Object)object)).getMod().equals(this.parent.getSelectedEntry().getMod())) continue;
                this.setSelected((ModListEntry)((Object)object));
            }
        } else if (this.method_25334() == null && !this.method_25396().isEmpty() && this.getEntry(0) != null) {
            this.setSelected(this.getEntry(0));
        }
        if (this.method_44387() > (double)Math.max(0, this.method_44395() - (this.method_55443() - this.method_46427() - 4))) {
            this.method_44382(Math.max(0, this.method_44395() - (this.method_55443() - this.method_46427() - 4)));
        }
    }

    public ModsScreen getParent() {
        return this.parent;
    }

    @Override
    public void close() {
        this.iconHandler.close();
    }

    public int addEntry(ModListEntry modListEntry) {
        if (this.addedMods.contains(modListEntry.mod)) {
            return 0;
        }
        this.addedMods.add(modListEntry.mod);
        int n = super.method_25321((class01202)modListEntry);
        if (modListEntry.getMod().getId().equals(this.selectedModId)) {
            this.setSelected(modListEntry);
        }
        return n;
    }

    public ModListEntry getEntry(int n) {
        if (this.method_25396().size() > n) {
            return (ModListEntry)((Object)this.method_25396().get(n));
        }
        return null;
    }

    public void ensureVisible(ModListEntry modListEntry) {
        int n;
        int n2 = this.method_25337(this.method_25396().indexOf((Object)modListEntry));
        int n3 = n2 - this.method_46427() - 4 - this.field_62109;
        if (n3 < 0) {
            this.method_44382(this.method_44387() + (double)n3);
        }
        if ((n = this.method_55443() - n2 - this.field_62109 * 2) < 0) {
            this.method_44382(this.method_44387() - (double)n);
        }
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.B() || class066012.Z()) {
            return super.method_25404(class066012);
        }
        if (this.method_25334() != null) {
            return ((ModListEntry)this.method_25334()).method_25404(class066012);
        }
        return false;
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    public boolean method_25370() {
        return this.parent.method_25399() == this;
    }

    public void reloadFilters() {
        this.filter(this.parent.getSearchInput(), true, false);
    }

    public final ModListEntry getEntryAtPos(double d, double d2) {
        int n = class04995.N((double)(d2 - (double)this.method_46427())) + (int)this.method_44387() - 4;
        int n2 = n / this.field_62109;
        return d < (double)this.method_65507() && d >= (double)this.method_25342() && d <= (double)(this.method_25342() + this.method_25322()) && n2 >= 0 && n >= 0 && n2 < this.method_25340() ? (ModListEntry)((Object)this.method_25396().get(n2)) : null;
    }

    protected boolean isSelectedEntry(int n) {
        ModListEntry modListEntry = (ModListEntry)this.method_25334();
        ModListEntry modListEntry2 = this.getEntry(n);
        return modListEntry != null && modListEntry2 != null && modListEntry.getMod().getId().equals(modListEntry2.getMod().getId());
    }

    public void finalizeInit() {
        this.reloadFilters();
        if (this.restoreScrollY != null) {
            this.method_44382(this.restoreScrollY);
            this.restoreScrollY = null;
        }
    }

    public int getDisplayedCountFor(Set<String> set) {
        int n = 0;
        for (ModListEntry modListEntry : this.method_25396()) {
            if (!set.contains(modListEntry.getMod().getId())) continue;
            ++n;
        }
        return n;
    }

    private boolean hasVisibleChildMods(Mod mod2) {
        List list = ModMenu.PARENT_MAP.get((Object)mod2);
        boolean bl = !ModMenuConfig.SHOW_LIBRARIES.getValue();
        return !list.stream().allMatch(mod -> mod.isHidden() || bl && mod.getBadges().contains((Object)Mod$Badge.LIBRARY));
    }

    public FabricIconHandler getFabricIconHandler() {
        return this.iconHandler;
    }

    public void method_44382(double d) {
        super.method_44382(d);
        int n = Math.max(0, this.method_44395() - (this.method_55443() - this.method_46427() - 4));
        if (n == 0) {
            this.parent.updateScrollPercent(0.0);
        } else {
            this.parent.updateScrollPercent(this.method_44387() / (double)Math.max(0, this.method_44395() - (this.method_55443() - this.method_46427() - 4)));
        }
    }

    protected void drawSelectionHighlight(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6) {
        class010542.N(n, n2 - 2, n + n3, n2 + n4 + 2, n5);
        class010542.N(n + 1, n2 - 1, n + n3 - 1, n2 + n4 + 1, n6);
    }

    public /* synthetic */ int method_25321(class01202 class012022) {
        return this.addEntry((ModListEntry)class012022);
    }

    public void method_25339() {
        this.setSelected(null);
        this.addedMods.clear();
        super.method_25339();
    }

    public int method_25342() {
        return this.method_46426() + 6;
    }

    public /* synthetic */ void method_25313(class01202 class012022) {
        this.setSelected((ModListEntry)class012022);
    }

    public int method_25322() {
        return this.field_22758 - (Math.max(0, this.method_44395() - (this.method_55443() - this.method_46427() - 4)) > 0 ? 18 : 12);
    }

    public void method_25311(class01054 class010542, int n, int n2, float f) {
        int n3 = this.method_25342();
        int n4 = this.method_25322();
        int n5 = this.field_62109 - 4;
        int n6 = this.method_25340();
        int n7 = this.method_46426();
        int n8 = this.method_46427();
        int n9 = 2;
        for (int i = 0; i < n6; ++i) {
            ModListEntry modListEntry;
            int n10 = this.method_25337(i) + 2;
            int n11 = this.method_25319(i);
            if (n11 < n8 || n10 > this.method_55443() || (modListEntry = this.getEntry(i)) == null) continue;
            if (this.isSelectedEntry(i)) {
                int n12 = n3 + modListEntry.getXOffset() - 2;
                int n13 = n4 - modListEntry.getXOffset() + 4;
                this.drawSelectionHighlight(class010542, n12, n10 + n9, n13, n5, this.method_25370() ? -1 : -8355712, -16777216);
            }
            modListEntry.setYOffset(n9);
            modListEntry.method_25343(class010542, n, n2, this.method_25405(n, n2) && Objects.equals((Object)this.getEntryAtPos(n, n2), (Object)modListEntry), f);
        }
    }

    public int method_65507() {
        return this.field_22758 - 6;
    }

    public int method_44395() {
        return super.method_44395() + 4;
    }

    public /* synthetic */ void method_25330(class01202 class012022) {
        this.removeEntry((ModListEntry)class012022);
    }

    public void setSelected(ModListEntry modListEntry) {
        super.method_25313((class01202)modListEntry);
        this.selectedModId = modListEntry == null ? null : modListEntry.getMod().getId();
        this.parent.updateSelectedEntry((ModListEntry)this.method_25334());
    }
}

