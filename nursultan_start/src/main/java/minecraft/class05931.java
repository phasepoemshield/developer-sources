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
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class04770
 *  minecraft.class07049
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
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
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class07049;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class05931 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.spectate.self"));
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.spectate.not_spectator", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.spectate.cannot_spectate", (Object[])new Object[]{object}));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"spectate").requires((Predicate)class07686.N((class08164)class07686.u))).executes(commandContext -> class05931.N((class07701)commandContext.getSource(), null, ((class07701)commandContext.getSource()).Z()))).then(((RequiredArgumentBuilder)class07686.N((String)"target", (ArgumentType)class07680.N()).executes(commandContext -> class05931.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), ((class07701)commandContext.getSource()).Z()))).then(class07686.N((String)"player", (ArgumentType)class07680.L()).executes(commandContext -> class05931.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), class07680.i((CommandContext)commandContext, (String)"player"))))));
    }

    private static int N(class07701 class077012, @Nullable class07049 class070492, class04770 class047702) throws CommandSyntaxException {
        if (class047702 == class070492) {
            throw N.create();
        }
        if (!class047702.method_7325()) {
            throw y.create((Object)class047702.method_5476());
        }
        if (class070492 != null && class070492.method_5864().W() == 0) {
            throw L.create((Object)class070492.method_5476());
        }
        class047702.method_14224(class070492);
        if (class070492 != null) {
            class077012.N(() -> class00392.N((String)"commands.spectate.success.started", (Object[])new Object[]{class070492.method_5476()}), false);
        } else {
            class077012.N(() -> class00392.L((String)"commands.spectate.success.stopped"), false);
        }
        return 1;
    }
}

