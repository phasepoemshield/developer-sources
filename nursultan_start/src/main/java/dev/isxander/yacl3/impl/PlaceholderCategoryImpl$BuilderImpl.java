/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.PlaceholderCategory
 *  dev.isxander.yacl3.api.PlaceholderCategory$Builder
 *  dev.isxander.yacl3.gui.YACLScreen
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class06202
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.PlaceholderCategory;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.impl.PlaceholderCategoryImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class06202;
import org.apache.commons.lang3.Validate;

public final class PlaceholderCategoryImpl$BuilderImpl
implements PlaceholderCategory.Builder {
    private class00392 name;
    private final List<class00392> tooltipLines = new ArrayList<class00392>();
    private BiFunction<class06202, YACLScreen, class05096> screenFunction;

    public PlaceholderCategory.Builder name(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"`name` cannot be null", (Object[])new Object[0]);
        this.name = class003922;
        return this;
    }

    public PlaceholderCategory build() {
        Validate.notNull((Object)this.name, (String)"`name` must not be null to build `ConfigCategory`", (Object[])new Object[0]);
        class05216 class052162 = class00392.i();
        boolean bl = true;
        for (class00392 class003922 : this.tooltipLines) {
            if (!bl) {
                class052162.i("\n");
            }
            bl = false;
            class052162.y(class003922);
        }
        return new PlaceholderCategoryImpl(this.name, this.screenFunction, (class00392)class052162);
    }

    public PlaceholderCategory.Builder tooltip(class00392 ... class00392Array) {
        Validate.notEmpty((Object[])class00392Array, (String)"`tooltips` cannot be empty", (Object[])new Object[0]);
        this.tooltipLines.addAll(List.of(class00392Array));
        return this;
    }

    public PlaceholderCategory.Builder screen(BiFunction<class06202, YACLScreen, class05096> biFunction) {
        Validate.notNull(biFunction, (String)"`screenFunction` cannot be null", (Object[])new Object[0]);
        this.screenFunction = biFunction;
        return this;
    }
}

