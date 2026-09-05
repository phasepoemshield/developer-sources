/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10742
 *  Nursultan.class11303
 *  Nursultan.class11921
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  minecraft.class00392
 *  minecraft.class06541
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class10626;
import Nursultan.class10742;
import Nursultan.class11303;
import Nursultan.class11921;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.util.List;
import java.util.Map;
import minecraft.class00392;
import minecraft.class06541;
import minecraft.class07689;

public class class10691
extends class10742 {
    static {
        class10691.y();
    }

    private int y(CommandContext<class07689> commandContext) {
        CommandDispatcher commandDispatcher = (CommandDispatcher)class10626.N_0;
        for (String string : commandDispatcher.getSmartUsage((CommandNode)commandDispatcher.getRoot(), (Object)((class07689)commandContext.getSource())).values()) {
            this.N("", string);
        }
        return 1;
    }

    private static void y() {
    }

    private int y(CommandContext<class07689> commandContext, String string) {
        ParseResults parseResults = ((CommandDispatcher)class10626.N_0).parse(string, (Object)((class07689)commandContext.getSource()));
        List list = parseResults.getContext().getNodes();
        if (list.isEmpty()) {
            class11303.y((Object)class11921.N((String)"help.not-found", (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1061)}).N(class06541.field_1061));
            return 0;
        }
        CommandNode commandNode = ((ParsedCommandNode)list.get(list.size() - 1)).getNode();
        Map map = ((CommandDispatcher)class10626.N_0).getSmartUsage(commandNode, (Object)((class07689)commandContext.getSource()));
        String string2 = parseResults.getReader().getString() + " ";
        if (map.isEmpty()) {
            this.N("", parseResults.getReader().getString());
            return 1;
        }
        for (String string3 : map.values()) {
            this.N(string2, string3);
        }
        return map.size();
    }

    private void N(String string, String string2) {
        String string3 = (string + string2).replace("|", " | ");
        int n = string3.indexOf(" ");
        String string4 = string3;
        String string5 = "";
        if (n != -1) {
            string4 = string3.substring(0, n);
            string5 = string3.substring(n);
        }
        class11303.y((Object)class00392.y((String)(((Character)class10626.N_1).charValue() + string4)).N(class06541.field_1068).y((class00392)class00392.y((String)string5).N(class06541.field_1080)));
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("help").executes(this::y)).then(this.R()));
    }

    private RequiredArgumentBuilder<class07689, String> R() {
        return (RequiredArgumentBuilder)this.N("command", (ArgumentType)StringArgumentType.greedyString()).executes(commandContext -> this.y((CommandContext<class07689>)commandContext, StringArgumentType.getString((CommandContext)commandContext, (String)"command")));
    }
}

