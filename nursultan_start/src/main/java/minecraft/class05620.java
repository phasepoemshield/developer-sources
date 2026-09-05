/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class02142
 *  minecraft.class04782
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07798
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class02142;
import minecraft.class04782;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07798;
import minecraft.class08164;

public class class05620 {
    private static final int N = -1;

    private static int L(class07701 class077012, int n) {
        class077012.W().NY().method_27910(0, class05620.N(class077012, n, class04782.field_41751), true, true);
        class077012.N(() -> class00392.L((String)"commands.weather.set.thunder"), true);
        return n;
    }

    private static int y(class07701 class077012, int n) {
        class077012.W().NY().method_27910(0, class05620.N(class077012, n, class04782.field_41750), true, false);
        class077012.N(() -> class00392.L((String)"commands.weather.set.rain"), true);
        return n;
    }

    private static int N(class07701 class077012, int n) {
        class077012.W().NY().method_27910(class05620.N(class077012, n, class04782.field_41749), 0, false, false);
        class077012.N(() -> class00392.L((String)"commands.weather.set.clear"), true);
        return n;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"weather").requires((Predicate)class07686.N((class08164)class07686.u))).then(((LiteralArgumentBuilder)class07686.y((String)"clear").executes(commandContext -> class05620.N((class07701)commandContext.getSource(), -1))).then(class07686.N((String)"duration", (ArgumentType)class07798.N((int)1)).executes(commandContext -> class05620.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"duration")))))).then(((LiteralArgumentBuilder)class07686.y((String)"rain").executes(commandContext -> class05620.y((class07701)commandContext.getSource(), -1))).then(class07686.N((String)"duration", (ArgumentType)class07798.N((int)1)).executes(commandContext -> class05620.y((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"duration")))))).then(((LiteralArgumentBuilder)class07686.y((String)"thunder").executes(commandContext -> class05620.L((class07701)commandContext.getSource(), -1))).then(class07686.N((String)"duration", (ArgumentType)class07798.N((int)1)).executes(commandContext -> class05620.L((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"duration"))))));
    }

    private static int N(class07701 class077012, int n, class02142 class021422) {
        if (n == -1) {
            return class021422.N(class077012.W().NY().method_8409());
        }
        return n;
    }
}

