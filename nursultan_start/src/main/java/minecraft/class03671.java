/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00881
 *  minecraft.class03556
 *  minecraft.class03784
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class05946
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00881;
import minecraft.class03556;
import minecraft.class03784;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class05946;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class03671 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.damage.invulnerable"));

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"damage").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"target", (ArgumentType)class07680.N()).then(((RequiredArgumentBuilder)class07686.N((String)"amount", (ArgumentType)FloatArgumentType.floatArg((float)0.0f)).executes(commandContext -> class03671.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"amount"), ((class07701)commandContext.getSource()).R().method_48963().s()))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"damageType", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.yN)).executes(commandContext -> class03671.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"amount"), new class07072((class03556)class03784.N((CommandContext)commandContext, (String)"damageType", (class05946)class04227.yN))))).then(class07686.y((String)"at").then(class07686.N((String)"location", (ArgumentType)class00881.N()).executes(commandContext -> class03671.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"amount"), new class07072((class03556)class03784.N((CommandContext)commandContext, (String)"damageType", (class05946)class04227.yN), class00881.N((CommandContext)commandContext, (String)"location"))))))).then(class07686.y((String)"by").then(((RequiredArgumentBuilder)class07686.N((String)"entity", (ArgumentType)class07680.N()).executes(commandContext -> class03671.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"amount"), new class07072((class03556)class03784.N((CommandContext)commandContext, (String)"damageType", (class05946)class04227.yN), class07680.N((CommandContext)commandContext, (String)"entity"))))).then(class07686.y((String)"from").then(class07686.N((String)"cause", (ArgumentType)class07680.N()).executes(commandContext -> class03671.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"target"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"amount"), new class07072((class03556)class03784.N((CommandContext)commandContext, (String)"damageType", (class05946)class04227.yN), class07680.N((CommandContext)commandContext, (String)"entity"), class07680.N((CommandContext)commandContext, (String)"cause"))))))))))));
    }

    private static int N(class07701 class077012, class07049 class070492, float f, class07072 class070722) throws CommandSyntaxException {
        if (class070492.method_64397(class077012.R(), class070722, f)) {
            class077012.N(() -> class00392.N((String)"commands.damage.success", (Object[])new Object[]{Float.valueOf(f), class070492.method_5476()}), true);
            return 1;
        }
        throw N.create();
    }
}

