/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class01765
 *  minecraft.class07802
 */
package Nursultan;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class01765;
import minecraft.class07802;

@FunctionalInterface
public interface class10790
extends class07802 {
    public int apply(int var1, int var2) throws CommandSyntaxException;

    default public void apply(class01765 class017652, class01765 class017653) throws CommandSyntaxException {
        class017652.N(this.apply(class017652.N(), class017653.N()));
    }
}

