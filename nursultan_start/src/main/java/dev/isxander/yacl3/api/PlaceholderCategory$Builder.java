/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.YACLScreen
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class06202
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.PlaceholderCategory;
import dev.isxander.yacl3.gui.YACLScreen;
import java.util.function.BiFunction;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06202;

public interface PlaceholderCategory$Builder {
    public PlaceholderCategory$Builder name(class00392 var1);

    public PlaceholderCategory build();

    public PlaceholderCategory$Builder tooltip(class00392 ... var1);

    public PlaceholderCategory$Builder screen(BiFunction<class06202, YACLScreen, class05096> var1);
}

