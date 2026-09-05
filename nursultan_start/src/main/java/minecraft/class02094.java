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
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07680
 *  minecraft.class07686
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
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class02094 {
    private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.ride.not_riding", (Object[])new Object[]{object}));
    private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.ride.already_riding", (Object[])new Object[]{object, object2}));
    private static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.ride.mount.failure.generic", (Object[])new Object[]{object, object2}));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.ride.mount.failure.cant_ride_players"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.ride.mount.failure.loop"));
    private static final SimpleCommandExceptionType R = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.ride.mount.failure.wrong_dimension"));

    private static int N(class07701 class077012, class07049 class070492, class07049 class070494) throws CommandSyntaxException {
        class07049 class070495 = class070492.method_5854();
        if (class070495 != null) {
            throw y.create((Object)class070492.method_5476(), (Object)class070495.method_5476());
        }
        if (class070494.method_5864() == class07078.Ly) {
            throw u.create();
        }
        if (class070492.method_24204().anyMatch(class070493 -> class070493 == class070494)) {
            throw i.create();
        }
        if (class070492.method_73183() != class070494.method_73183()) {
            throw R.create();
        }
        if (!class070492.method_5873(class070494, true, true)) {
            throw L.create((Object)class070492.method_5476(), (Object)class070494.method_5476());
        }
        class077012.N(() -> class00392.N((String)"commands.ride.mount.success", (Object[])new Object[]{class070492.method_5476(), class070494.method_5476()}), true);
        return 1;
    }

    private static int N(class07701 class077012, class07049 class070492) throws CommandSyntaxException {
        class07049 class070493 = class070492.method_5854();
        if (class070493 == null) {
            throw N.create((Object)class070492.method_5476());
        }
        class070492.method_5848();
        class077012.N(() -> class00392.N((String)"commands.ride.dismount.success", (Object[])new Object[]{class070492.method_5476(), class070493.method_5476()}), true);
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"ride").requires((Predicate)class07686.N((class08164)class07686.u))).then(((RequiredArgumentBuilder)class07686.N((String)"target", (ArgumentType)class07680.N()).then(class07686.y((String)"mount").then(class07686.N((String)"vehicle", (ArgumentType)class07680.N()).executes(commandContext -> class02094.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), class07680.N((CommandContext)commandContext, (String)"vehicle")))))).then(class07686.y((String)"dismount").executes(commandContext -> class02094.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"))))));
    }
}

