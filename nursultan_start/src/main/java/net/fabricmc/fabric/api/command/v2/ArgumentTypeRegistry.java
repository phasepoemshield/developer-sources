/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06763
 *  minecraft.class06799
 *  net.fabricmc.fabric.mixin.command.ArgumentTypeInfosAccessor
 */
package net.fabricmc.fabric.api.command.v2;

import com.mojang.brigadier.arguments.ArgumentType;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06763;
import minecraft.class06799;
import net.fabricmc.fabric.mixin.command.ArgumentTypeInfosAccessor;

public final class ArgumentTypeRegistry {
    private ArgumentTypeRegistry() {
    }

    public static <A extends ArgumentType<?>, T extends class06763<A>> void registerArgumentType(class01894 class018942, Class<? extends A> clazz, class06799<A, T> class067992) {
        ArgumentTypeInfosAccessor.fabric_getClassMap().put(clazz, class067992);
        class00751.N((class00751)class04206.t, (class01894)class018942, class067992);
    }
}

