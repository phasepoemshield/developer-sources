/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.RedirectModifier
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.tree.CommandNode
 *  minecraft.class01711
 *  minecraft.class03468
 *  minecraft.class03478
 *  minecraft.class03483
 *  minecraft.class07686
 *  minecraft.class08164
 */
package Nursultan;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import java.util.function.Predicate;
import minecraft.class01711;
import minecraft.class03468;
import minecraft.class03478;
import minecraft.class03483;
import minecraft.class07686;
import minecraft.class08164;

public class class10206 {
    public static <T extends class01711<T>> void N(CommandDispatcher<T> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)LiteralArgumentBuilder.literal((String)"return").requires((Predicate)class07686.N((class08164)class07686.u))).then(RequiredArgumentBuilder.argument((String)"value", (ArgumentType)IntegerArgumentType.integer()).executes((Command)new class03478()))).then(LiteralArgumentBuilder.literal((String)"fail").executes((Command)new class03468()))).then(LiteralArgumentBuilder.literal((String)"run").forward((CommandNode)commandDispatcher.getRoot(), (RedirectModifier)new class03483(), false)));
    }
}

