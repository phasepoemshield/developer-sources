/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01081
 *  minecraft.class01603
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.resource.v1.ResourceLoader
 */
package net.fabricmc.fabric.impl.tag;

import minecraft.class01081;
import minecraft.class01603;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.impl.tag.TagAliasLoader;

public final class TagInit
implements ModInitializer {
    public void onInitialize() {
        ResourceLoader.get((class01603)class01603.field_14190).registerReloader(TagAliasLoader.ID, (class01081)new TagAliasLoader());
    }
}

