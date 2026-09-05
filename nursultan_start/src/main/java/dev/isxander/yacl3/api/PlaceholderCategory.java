/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.YACLScreen
 *  dev.isxander.yacl3.impl.PlaceholderCategoryImpl$BuilderImpl
 *  minecraft.class05096
 *  minecraft.class06202
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.PlaceholderCategory$Builder;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.impl.PlaceholderCategoryImpl;
import java.util.function.BiFunction;
import minecraft.class05096;
import minecraft.class06202;

public interface PlaceholderCategory
extends ConfigCategory {
    public static PlaceholderCategory$Builder createBuilder() {
        return new PlaceholderCategoryImpl.BuilderImpl();
    }

    public BiFunction<class06202, YACLScreen, class05096> screen();
}

