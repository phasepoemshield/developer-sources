/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class01086
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01086;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class08164;

public class class01566 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.pardonip.invalid"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.pardonip.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"pardon-ip").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.N((String)"target", (ArgumentType)StringArgumentType.word()).suggests((commandContext, suggestionsBuilder) -> class07689.N((String[])((class07701)commandContext.getSource()).W().Nm().B().y(), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class01566.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"target")))));
    }

    private static int N(class07701 class077012, String string) throws CommandSyntaxException {
        if (!InetAddresses.isInetAddress((String)string)) {
            throw N.create();
        }
        class01086 class010862 = class077012.W().Nm().B();
        if (!class010862.N(string)) {
            throw y.create();
        }
        class010862.y(string);
        class077012.N(() -> class00392.N((String)"commands.pardonip.success", (Object[])new Object[]{string}), true);
        return 1;
    }
}

