/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01997
 *  minecraft.class03530
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class07135
 *  net.fabricmc.fabric.impl.tag.TagAliasGroup
 */
package net.fabricmc.fabric.impl.datagen;

import com.mojang.serialization.Codec;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01997;
import minecraft.class03530;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class07135;
import net.fabricmc.fabric.impl.tag.TagAliasGroup;

public final class TagAliasGenerator {
    public static String getDirectory(class05946<? extends class00751<?>> class059462) {
        Object object = "fabric/tag_aliases/";
        class01894 class018942 = class059462.N();
        if (!"minecraft".equals(class018942.y())) {
            object = (String)object + class018942.y() + "/";
        }
        return (String)object + class018942.N();
    }

    public static <T> CompletableFuture<?> writeTagAlias(class04476 class044762, class01997 class019972, class05946<? extends class00751<T>> class059462, class01894 class018942, List<class03530<T>> list) {
        Path path = class019972.N(class018942);
        return class07135.N((class04476)class044762, (Codec)TagAliasGroup.codec(class059462), (Object)new TagAliasGroup(list), (Path)path);
    }
}

