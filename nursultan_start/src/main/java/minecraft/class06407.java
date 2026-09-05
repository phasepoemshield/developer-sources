/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class04770
 *  minecraft.class05157
 *  minecraft.class05170
 *  minecraft.class07659
 *  minecraft.class07686
 *  minecraft.class07690
 *  minecraft.class07701
 *  minecraft.class08164
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class05157;
import minecraft.class05170;
import minecraft.class07659;
import minecraft.class07686;
import minecraft.class07690;
import minecraft.class07701;
import minecraft.class08164;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;

public class class06407 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.ban.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"ban").requires((Predicate)class07686.N((class08164)class07686.i))).then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07659.N()).executes(commandContext -> class06407.N((class07701)commandContext.getSource(), class07659.N((CommandContext)commandContext, (String)"targets"), null))).then(class07686.N((String)"reason", (ArgumentType)class07690.N()).executes(commandContext -> class06407.N((class07701)commandContext.getSource(), class07659.N((CommandContext)commandContext, (String)"targets"), class07690.N((CommandContext)commandContext, (String)"reason"))))));
    }

    private static int N(class07701 class077012, Collection<class08774> collection, @Nullable class00392 class003922) throws CommandSyntaxException {
        class05170 class051702 = class077012.W().Nm().M();
        int n = 0;
        for (class08774 class087742 : collection) {
            if (class051702.N(class087742)) continue;
            class05157 class051572 = new class05157(class087742, null, class077012.u(), null, class003922 == null ? null : class003922.getString());
            class051702.N(class051572);
            ++n;
            class077012.N(() -> class00392.N((String)"commands.ban.success", (Object[])new Object[]{class00392.y((String)class087742.y()), class051572.i()}), true);
            class04770 class047702 = class077012.W().Nm().y(class087742.N());
            if (class047702 == null) continue;
            class047702.field_13987.method_52396((class00392)class00392.L((String)"multiplayer.disconnect.banned"));
        }
        if (n == 0) {
            throw N.create();
        }
        return n;
    }
}

