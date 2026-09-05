/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00881
 *  minecraft.class04206
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class06889
 *  minecraft.class07126
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07772
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00881;
import minecraft.class04206;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class06889;
import minecraft.class07126;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07772;
import minecraft.class08164;

public class class01575 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.particle.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"particle").requires((Predicate)class07686.N((class08164)class07686.u))).then(((RequiredArgumentBuilder)class07686.N((String)"name", (ArgumentType)class07772.N((class04348)class043482)).executes(commandContext -> class01575.N((class07701)commandContext.getSource(), class07772.N((CommandContext)commandContext, (String)"name"), ((class07701)commandContext.getSource()).i(), class06889.L, 0.0f, 0, false, ((class07701)commandContext.getSource()).W().Nm().v()))).then(((RequiredArgumentBuilder)class07686.N((String)"pos", (ArgumentType)class00881.N()).executes(commandContext -> class01575.N((class07701)commandContext.getSource(), class07772.N((CommandContext)commandContext, (String)"name"), class00881.N((CommandContext)commandContext, (String)"pos"), class06889.L, 0.0f, 0, false, ((class07701)commandContext.getSource()).W().Nm().v()))).then(class07686.N((String)"delta", (ArgumentType)class00881.N((boolean)false)).then(class07686.N((String)"speed", (ArgumentType)FloatArgumentType.floatArg((float)0.0f)).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"count", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class01575.N((class07701)commandContext.getSource(), class07772.N((CommandContext)commandContext, (String)"name"), class00881.N((CommandContext)commandContext, (String)"pos"), class00881.N((CommandContext)commandContext, (String)"delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), false, ((class07701)commandContext.getSource()).W().Nm().v()))).then(((LiteralArgumentBuilder)class07686.y((String)"force").executes(commandContext -> class01575.N((class07701)commandContext.getSource(), class07772.N((CommandContext)commandContext, (String)"name"), class00881.N((CommandContext)commandContext, (String)"pos"), class00881.N((CommandContext)commandContext, (String)"delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), true, ((class07701)commandContext.getSource()).W().Nm().v()))).then(class07686.N((String)"viewers", (ArgumentType)class07680.u()).executes(commandContext -> class01575.N((class07701)commandContext.getSource(), class07772.N((CommandContext)commandContext, (String)"name"), class00881.N((CommandContext)commandContext, (String)"pos"), class00881.N((CommandContext)commandContext, (String)"delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), true, class07680.R((CommandContext)commandContext, (String)"viewers")))))).then(((LiteralArgumentBuilder)class07686.y((String)"normal").executes(commandContext -> class01575.N((class07701)commandContext.getSource(), class07772.N((CommandContext)commandContext, (String)"name"), class00881.N((CommandContext)commandContext, (String)"pos"), class00881.N((CommandContext)commandContext, (String)"delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), false, ((class07701)commandContext.getSource()).W().Nm().v()))).then(class07686.N((String)"viewers", (ArgumentType)class07680.u()).executes(commandContext -> class01575.N((class07701)commandContext.getSource(), class07772.N((CommandContext)commandContext, (String)"name"), class00881.N((CommandContext)commandContext, (String)"pos"), class00881.N((CommandContext)commandContext, (String)"delta"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), false, class07680.R((CommandContext)commandContext, (String)"viewers")))))))))));
    }

    private static int N(class07701 class077012, class07126 class071262, class06889 class068892, class06889 class068893, float f, int n, boolean bl, Collection<class04770> collection) throws CommandSyntaxException {
        int n2 = 0;
        for (class04770 class047702 : collection) {
            if (!class077012.R().method_14166(class047702, class071262, bl, false, class068892.M, class068892.B, class068892.Z, n, class068893.M, class068893.B, class068893.Z, (double)f)) continue;
            ++n2;
        }
        if (n2 == 0) {
            throw N.create();
        }
        class077012.N(() -> class00392.N((String)"commands.particle.success", (Object[])new Object[]{class04206.z.y((Object)class071262.method_10295()).toString()}), true);
        return n2;
    }
}

