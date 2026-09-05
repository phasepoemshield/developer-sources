/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10580
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class00392
 *  minecraft.class06790
 *  minecraft.class06794
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class10580;
import Nursultan.class10620;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import minecraft.class00392;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class07689;

public class class10684
implements ArgumentType<class10620> {
    public class10620 parse(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.getString().substring(stringReader.getCursor(), stringReader.getTotalLength());
        ArrayList arrayList = Lists.newArrayList();
        int n = stringReader.getCursor();
        while (true) {
            class06794 class067942;
            int n2;
            block6: {
                if (!stringReader.canRead()) {
                    return new class10620(string, arrayList.toArray(new class10580[0]));
                }
                if (stringReader.peek() == '@') {
                    n2 = stringReader.getCursor();
                    try {
                        class067942 = new class06790(stringReader, true).v();
                        break block6;
                    }
                    catch (CommandSyntaxException commandSyntaxException) {
                        if (commandSyntaxException.getType() != class06790.B && commandSyntaxException.getType() != class06790.R) {
                            throw commandSyntaxException;
                        }
                        stringReader.setCursor(n2 + 1);
                        continue;
                    }
                }
                stringReader.skip();
                continue;
            }
            arrayList.add(new class10580(n2 - n, stringReader.getCursor() - n, class067942));
        }
    }

    public static class00392 N(CommandContext<class07689> commandContext, String string) {
        return ((class10620)commandContext.getArgument(string, class10620.class)).N((class07689)commandContext.getSource(), true);
    }
}

