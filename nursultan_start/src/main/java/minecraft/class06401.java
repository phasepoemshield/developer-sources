/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01517
 *  minecraft.class01568
 *  minecraft.class02796
 *  minecraft.class04681
 *  minecraft.class06808
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01517;
import minecraft.class01568;
import minecraft.class02796;
import minecraft.class04681;
import minecraft.class06388;
import minecraft.class06808;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import org.slf4j.Logger;

public class class06401 {
    static final Logger N = LogUtils.getLogger();
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.debug.notRunning"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.debug.alreadyRunning"));
    static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.debug.function.noRecursion"));
    static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.debug.function.noReturnRun"));

    private static int y(class07701 class077012) throws CommandSyntaxException {
        class02796 class027962 = class077012.W();
        if (!class027962.yY()) {
            throw u.create();
        }
        class04681 class046812 = class027962.yO();
        double d = (double)class046812.M() / (double)class01517.N;
        double d2 = (double)class046812.R() / d;
        class077012.N(() -> class00392.N((String)"commands.debug.stopped", (Object[])new Object[]{String.format(Locale.ROOT, "%.2f", d), class046812.R(), String.format(Locale.ROOT, "%.2f", d2)}), true);
        return (int)d2;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"debug").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.y((String)"start").executes(commandContext -> class06401.N((class07701)commandContext.getSource())))).then(class07686.y((String)"stop").executes(commandContext -> class06401.y((class07701)commandContext.getSource())))).then(((LiteralArgumentBuilder)class07686.y((String)"function").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.N((String)"name", (ArgumentType)class06808.N()).suggests(class01568.L).executes((Command)new class06388()))));
    }

    private static int N(class07701 class077012) throws CommandSyntaxException {
        class02796 class027962 = class077012.W();
        if (class027962.yY()) {
            throw i.create();
        }
        class027962.yQ();
        class077012.N(() -> class00392.L((String)"commands.debug.started"), true);
        return 0;
    }
}

