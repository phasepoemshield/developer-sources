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
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07690
 *  minecraft.class07701
 *  minecraft.class08164
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
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07690;
import minecraft.class07701;
import minecraft.class08164;

public class class01544 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.kick.owner.failed"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.kick.singleplayer.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"kick").requires((Predicate)class07686.N((class08164)class07686.i))).then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).executes(commandContext -> class01544.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), (class00392)class00392.L((String)"multiplayer.disconnect.kicked")))).then(class07686.N((String)"reason", (ArgumentType)class07690.N()).executes(commandContext -> class01544.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class07690.N((CommandContext)commandContext, (String)"reason"))))));
    }

    private static int N(class07701 class077012, Collection<class04770> collection, class00392 class003922) throws CommandSyntaxException {
        if (!class077012.W().P()) {
            throw y.create();
        }
        int n = 0;
        for (class04770 class047702 : collection) {
            if (class077012.W().N(class047702.method_72498())) continue;
            class047702.field_13987.method_52396(class003922);
            class077012.N(() -> class00392.N((String)"commands.kick.success", (Object[])new Object[]{class047702.method_5476(), class003922}), true);
            ++n;
        }
        if (n == 0) {
            throw N.create();
        }
        return n;
    }
}

