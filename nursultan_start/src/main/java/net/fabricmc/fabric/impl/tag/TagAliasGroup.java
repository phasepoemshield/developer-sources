/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class03530
 *  minecraft.class05946
 */
package net.fabricmc.fabric.impl.tag;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class00751;
import minecraft.class03530;
import minecraft.class05946;

public record TagAliasGroup<T>(List<class03530<T>> tags) {
    public static <T> Codec<TagAliasGroup<T>> codec(class05946<? extends class00751<T>> class059462) {
        return class03530.N(class059462).listOf().fieldOf("tags").xmap(TagAliasGroup::new, TagAliasGroup::tags).codec();
    }
}

