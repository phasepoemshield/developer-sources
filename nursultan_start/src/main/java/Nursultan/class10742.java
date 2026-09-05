/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11303
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class11303;
import Nursultan.class11921;
import Nursultan.class11938;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07689;

public abstract class class10742 {
    public Object y_0;
    public static Object L_0;

    public class10742() {
        this.u();
        this.y_0 = class06202.Nq();
    }

    static {
        class10742.y();
    }

    private void u() {
    }

    private static void y() {
        L_0 = 1;
    }

    public <T> RequiredArgumentBuilder<class07689, T> N(String string, ArgumentType<T> argumentType) {
        return RequiredArgumentBuilder.argument((String)string, argumentType);
    }

    public static String N(CommandContext<?> commandContext, String string) {
        return (String)commandContext.getArgument(string, String.class);
    }

    public LiteralArgumentBuilder<class07689> N(String string) {
        return LiteralArgumentBuilder.literal((String)string);
    }

    public boolean N() {
        if (class11938.z().R()) {
            return true;
        }
        class11303.y((Object)class11921.N((String)"socket.not-connected").N(class06541.field_1061));
        return false;
    }

    public abstract void N(CommandDispatcher<class07689> var1);
}

