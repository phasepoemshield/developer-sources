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
 *  org.joml.Vector3d
 */
package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07689;
import org.joml.Vector3d;

public class class09387
implements ArgumentType<Vector3d> {
    public Vector3d parse(StringReader stringReader) throws CommandSyntaxException {
        int n;
        int n2;
        int n3;
        class06202 class062022 = class06202.Nq();
        if (stringReader.peek() == '~') {
            n3 = (int)((class04453)class062022.T_4).method_23317();
            stringReader.skip();
        } else {
            n3 = stringReader.readInt();
        }
        if (stringReader.peek() == ' ') {
            stringReader.skip();
        }
        if (stringReader.peek() == '~') {
            n2 = (int)((class04453)class062022.T_4).method_23318();
            stringReader.skip();
        } else {
            n2 = stringReader.readInt();
        }
        if (stringReader.peek() == ' ') {
            stringReader.skip();
        }
        if (stringReader.peek() == '~') {
            n = (int)((class04453)class062022.T_4).method_23321();
            stringReader.skip();
        } else {
            n = stringReader.readInt();
        }
        return new Vector3d((double)n3, (double)n2, (double)n);
    }

    public static Vector3d N(CommandContext<class07689> commandContext, String string) {
        return (Vector3d)commandContext.getArgument(string, Vector3d.class);
    }
}

