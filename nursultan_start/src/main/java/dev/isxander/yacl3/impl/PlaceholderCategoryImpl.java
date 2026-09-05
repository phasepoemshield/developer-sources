/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.PlaceholderCategory
 *  dev.isxander.yacl3.gui.YACLScreen
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class06202
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.PlaceholderCategory;
import dev.isxander.yacl3.gui.YACLScreen;
import java.util.function.BiFunction;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06202;

public final class PlaceholderCategoryImpl
implements PlaceholderCategory {
    private final class00392 name;
    private final BiFunction<class06202, YACLScreen, class05096> screen;
    private final class00392 tooltip;

    public PlaceholderCategoryImpl(class00392 class003922, BiFunction<class06202, YACLScreen, class05096> biFunction, class00392 class003923) {
        this.name = class003922;
        this.screen = biFunction;
        this.tooltip = class003923;
    }

    public class00392 name() {
        return this.name;
    }

    public ImmutableList<OptionGroup> groups() {
        return ImmutableList.of();
    }

    public class00392 tooltip() {
        return this.tooltip;
    }

    public BiFunction<class06202, YACLScreen, class05096> screen() {
        return this.screen;
    }
}

