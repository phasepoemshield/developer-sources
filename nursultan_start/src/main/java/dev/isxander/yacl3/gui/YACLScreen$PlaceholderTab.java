/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.PlaceholderCategory
 *  minecraft.class00392
 *  minecraft.class03255
 *  minecraft.class04141
 *  minecraft.class05096
 *  minecraft.class06478
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.PlaceholderCategory;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.tab.TabExt;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class03255;
import minecraft.class04141;
import minecraft.class05096;
import minecraft.class06478;

public class YACLScreen$PlaceholderTab
implements TabExt {
    private final YACLScreen screen;
    private final PlaceholderCategory category;
    private final class04141 tooltip;

    public class00392 method_48610() {
        return this.category.name();
    }

    public void method_48612(Consumer<class06478> consumer) {
    }

    public void method_48611(class03255 class032552) {
        YACLScreen.access$300(this.screen).N((class05096)this.category.screen().apply(YACLScreen.access$200(this.screen), this.screen));
    }

    public YACLScreen$PlaceholderTab(PlaceholderCategory placeholderCategory, YACLScreen yACLScreen) {
        this.screen = yACLScreen;
        this.category = placeholderCategory;
        this.tooltip = class04141.N((class00392)placeholderCategory.tooltip());
    }

    @Override
    public class04141 getTooltip() {
        return this.tooltip;
    }
}

