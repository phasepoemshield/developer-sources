/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class05170
 *  minecraft.class07659
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class08164
 *  minecraft.class08774
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class05170;
import minecraft.class07659;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class08164;
import minecraft.class08774;

public class class01538 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.pardon.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"pardon").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.N((String)"targets", (ArgumentType)class07659.N()).suggests((commandContext, suggestionsBuilder) -> class07689.N((String[])((class07701)commandContext.getSource()).W().Nm().M().y(), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class01538.N((class07701)commandContext.getSource(), class07659.N((CommandContext)commandContext, (String)"targets")))));
    }

    private static int N(class07701 class077012, Collection<class08774> collection) throws CommandSyntaxException {
        class05170 class051702 = class077012.W().Nm().M();
        int n = 0;
        for (class08774 class087742 : collection) {
            if (!class051702.N(class087742)) continue;
            class051702.L(class087742);
            ++n;
            class077012.N(() -> class00392.N((String)"commands.pardon.success", (Object[])new Object[]{class00392.y((String)class087742.y())}), true);
        }
        if (n == 0) {
            throw N.create();
        }
        return n;
    }
}

