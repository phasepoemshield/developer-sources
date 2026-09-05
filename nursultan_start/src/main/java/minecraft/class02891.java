/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class04770
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class02870;
import minecraft.class04770;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class02891 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.transfer.error.no_players"));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"transfer").requires((Predicate)class07686.N((class08164)class07686.i))).then(((RequiredArgumentBuilder)class07686.N((String)"hostname", (ArgumentType)StringArgumentType.string()).executes(commandContext -> class02891.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"hostname"), 25565, List.of(((class07701)commandContext.getSource()).Z())))).then(((RequiredArgumentBuilder)class07686.N((String)"port", (ArgumentType)IntegerArgumentType.integer((int)1, (int)65535)).executes(commandContext -> class02891.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"hostname"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"port"), List.of(((class07701)commandContext.getSource()).Z())))).then(class07686.N((String)"players", (ArgumentType)class07680.u()).executes(commandContext -> class02891.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"hostname"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"port"), class07680.R((CommandContext)commandContext, (String)"players")))))));
    }

    private static int N(class07701 class077012, String string, int n, Collection<class04770> collection) throws CommandSyntaxException {
        if (collection.isEmpty()) {
            throw N.create();
        }
        Iterator<class04770> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field_13987.method_14364((class00381)new class02870(string, n));
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.transfer.success.single", (Object[])new Object[]{((class04770)collection.iterator().next()).method_5476(), string, n}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.transfer.success.multiple", (Object[])new Object[]{collection.size(), string, n}), true);
        }
        return collection.size();
    }
}

