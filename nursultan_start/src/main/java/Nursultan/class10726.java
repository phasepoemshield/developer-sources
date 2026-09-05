/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07689
 *  org.joml.Vector2d
 */
package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07689;
import org.joml.Vector2d;

public class class10726
implements ArgumentType<Vector2d> {
    public static Vector2d N(CommandContext<class07689> commandContext, String string) {
        return (Vector2d)commandContext.getArgument(string, Vector2d.class);
    }

    public Vector2d parse(StringReader stringReader) throws CommandSyntaxException {
        double d;
        double d2;
        class06202 class062022 = class06202.Nq();
        if (stringReader.peek() == '~') {
            d2 = ((class04453)class062022.T_4).method_23317();
            stringReader.skip();
        } else {
            d2 = stringReader.readDouble();
        }
        if (stringReader.peek() == ' ') {
            stringReader.skip();
        }
        if (stringReader.peek() == '~') {
            d = ((class04453)class062022.T_4).method_23321();
            stringReader.skip();
        } else {
            d = stringReader.readDouble();
        }
        return new Vector2d(d2, d);
    }
}

