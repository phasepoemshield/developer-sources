/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  minecraft.class00392
 *  minecraft.class07686
 *  minecraft.class07701
 *  net.fabricmc.fabric.mixin.command.HelpCommandAccessor
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import java.util.Map;
import minecraft.class00392;
import minecraft.class07686;
import minecraft.class07701;
import net.fabricmc.fabric.mixin.command.HelpCommandAccessor;

public class class01543
implements HelpCommandAccessor {
    public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.help.failed"));

    public static /* synthetic */ SimpleCommandExceptionType N() {
        return N;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"help").executes(commandContext -> {
            Map map = commandDispatcher.getSmartUsage((CommandNode)commandDispatcher.getRoot(), (Object)((class07701)commandContext.getSource()));
            for (String string : map.values()) {
                ((class07701)commandContext.getSource()).N(() -> class00392.y((String)("/" + string)), false);
            }
            return map.size();
        })).then(class07686.N((String)"command", (ArgumentType)StringArgumentType.greedyString()).executes(commandContext -> {
            ParseResults parseResults = commandDispatcher.parse(StringArgumentType.getString((CommandContext)commandContext, (String)"command"), (Object)((class07701)commandContext.getSource()));
            if (parseResults.getContext().getNodes().isEmpty()) {
                throw N.create();
            }
            Map map = commandDispatcher.getSmartUsage(((ParsedCommandNode)Iterables.getLast((Iterable)parseResults.getContext().getNodes())).getNode(), (Object)((class07701)commandContext.getSource()));
            for (String string : map.values()) {
                ((class07701)commandContext.getSource()).N(() -> class00392.y((String)("/" + parseResults.getReader().getString() + " " + string)), false);
            }
            return map.size();
        })));
    }
}

