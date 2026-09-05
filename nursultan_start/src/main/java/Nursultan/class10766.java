/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10626
 *  Nursultan.class11303
 *  Nursultan.class11847
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class11951
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  minecraft.class06541
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class10626;
import Nursultan.class10742;
import Nursultan.class10787;
import Nursultan.class11303;
import Nursultan.class11847;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class11951;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import minecraft.class06541;
import minecraft.class07689;

public class class10766
extends class10742 {
    private RequiredArgumentBuilder<class07689, Character> y() {
        return (RequiredArgumentBuilder)this.N("prefix", new class10787()).executes(commandContext -> this.N(class10787.N(commandContext, "prefix").charValue()));
    }

    @Override
    public void N(CommandDispatcher<class07689> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)this.N("prefix").then(this.y()));
    }

    private int N(char c) {
        class10626.N_1 = Character.valueOf(c);
        class11303.y((Object)class11921.N((String)"prefix", (Object[])new Object[]{" '%s'".formatted(new Object[]{Character.valueOf(c)})}).N(class06541.field_1080));
        class11938.z().N((class11951)class11847.N());
        return 1;
    }
}

