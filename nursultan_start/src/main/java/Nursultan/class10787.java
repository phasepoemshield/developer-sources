/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12020
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  minecraft.class00392
 */
package Nursultan;

import Nursultan.class12020;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import minecraft.class00392;

public class class10787
implements ArgumentType<Character> {
    public static Object N_0;

    static {
        class10787.N();
        class10787.u();
        N_0 = new DynamicCommandExceptionType(object -> class00392.y((String)class12020.N((String)"prefix.error")));
    }

    private static void u() {
        N_0 = null;
    }

    public Character parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.getRemaining();
        if (string.isBlank() || string.equals("/") || string.equals("#")) {
            throw ((DynamicCommandExceptionType)N_0).create((Object)string);
        }
        stringReader.setCursor(stringReader.getCursor() + 1);
        return Character.valueOf(string.charAt(0));
    }

    private static void N() {
    }

    public static Character N(CommandContext<?> commandContext, String string) {
        return (Character)commandContext.getArgument(string, Character.class);
    }
}

