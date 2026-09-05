/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class01517
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07798
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01517;
import minecraft.class03143;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07798;
import minecraft.class08164;

public class class03131 {
    private static final float N = 10000.0f;
    private static final String y = String.valueOf(20);

    private static int L(class07701 class077012) {
        if (class077012.W().yW().L()) {
            class077012.N(() -> class00392.L((String)"commands.tick.sprint.stop.success"), true);
            return 1;
        }
        class077012.y((class00392)class00392.L((String)"commands.tick.sprint.stop.fail"));
        return 0;
    }

    private static int y(class07701 class077012, int n) {
        if (class077012.W().yW().N(n)) {
            class077012.N(() -> class00392.N((String)"commands.tick.step.success", (Object[])new Object[]{n}), true);
        } else {
            class077012.y((class00392)class00392.L((String)"commands.tick.step.fail"));
        }
        return 1;
    }

    private static int y(class07701 class077012) {
        if (class077012.W().yW().y()) {
            class077012.N(() -> class00392.L((String)"commands.tick.step.stop.success"), true);
            return 1;
        }
        class077012.y((class00392)class00392.L((String)"commands.tick.step.stop.fail"));
        return 0;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"tick").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.y((String)"query").executes(commandContext -> class03131.N((class07701)commandContext.getSource())))).then(class07686.y((String)"rate").then(class07686.N((String)"rate", (ArgumentType)FloatArgumentType.floatArg((float)1.0f, (float)10000.0f)).suggests((commandContext, suggestionsBuilder) -> class07689.N((String[])new String[]{y}, (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class03131.N((class07701)commandContext.getSource(), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"rate")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"step").executes(commandContext -> class03131.y((class07701)commandContext.getSource(), 1))).then(class07686.y((String)"stop").executes(commandContext -> class03131.y((class07701)commandContext.getSource())))).then(class07686.N((String)"time", (ArgumentType)class07798.N((int)1)).suggests((commandContext, suggestionsBuilder) -> class07689.N((String[])new String[]{"1t", "1s"}, (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class03131.y((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time")))))).then(((LiteralArgumentBuilder)class07686.y((String)"sprint").then(class07686.y((String)"stop").executes(commandContext -> class03131.L((class07701)commandContext.getSource())))).then(class07686.N((String)"time", (ArgumentType)class07798.N((int)1)).suggests((commandContext, suggestionsBuilder) -> class07689.N((String[])new String[]{"60s", "1d", "3d"}, (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class03131.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time")))))).then(class07686.y((String)"unfreeze").executes(commandContext -> class03131.N((class07701)commandContext.getSource(), false)))).then(class07686.y((String)"freeze").executes(commandContext -> class03131.N((class07701)commandContext.getSource(), true))));
    }

    private static int N(class07701 class077012, boolean bl) {
        class03143 class031432 = class077012.W().yW();
        if (bl) {
            if (class031432.N()) {
                class031432.L();
            }
            if (class031432.z()) {
                class031432.y();
            }
        }
        class031432.N(bl);
        if (bl) {
            class077012.N(() -> class00392.L((String)"commands.tick.status.frozen"), true);
        } else {
            class077012.N(() -> class00392.L((String)"commands.tick.status.running"), true);
        }
        return bl ? 1 : 0;
    }

    private static String N(long l) {
        return String.format(Locale.ROOT, "%.1f", Float.valueOf((float)l / (float)class01517.y));
    }

    private static /* synthetic */ class00392 N(String string, String string2, String string3, long[] lArray) {
        return class00392.N((String)"commands.tick.query.percentiles", (Object[])new Object[]{string, string2, string3, lArray.length});
    }

    private static /* synthetic */ class00392 N(String string, String string2, String string3) {
        return class00392.N((String)"commands.tick.query.rate.running", (Object[])new Object[]{string, string2, string3});
    }

    private static int N(class07701 class077012) {
        Object object;
        class03143 class031432 = class077012.W().yW();
        String string = class03131.N(class077012.W().ym());
        float f = class031432.R();
        String string2 = String.format(Locale.ROOT, "%.1f", Float.valueOf(f));
        if (class031432.N()) {
            class077012.N(() -> class00392.L((String)"commands.tick.status.sprinting"), false);
            class077012.N(() -> class00392.N((String)"commands.tick.query.rate.sprinting", (Object[])new Object[]{string2, string}), false);
        } else {
            if (class031432.E()) {
                class077012.N(() -> class00392.L((String)"commands.tick.status.frozen"), false);
            } else if (class031432.B() < class077012.W().ym()) {
                class077012.N(() -> class00392.L((String)"commands.tick.status.lagging"), false);
            } else {
                class077012.N(() -> class00392.L((String)"commands.tick.status.running"), false);
            }
            object = class03131.N(class031432.B());
            class077012.N(() -> class03131.N(string2, string, (String)object), false);
        }
        object = Arrays.copyOf(class077012.W().yP(), class077012.W().yP().length);
        Arrays.sort((long[])object);
        String string3 = class03131.N((long)object[((Object)object).length / 2]);
        String string4 = class03131.N((long)object[(int)((double)((Object)object).length * 0.95)]);
        String string5 = class03131.N((long)object[(int)((double)((Object)object).length * 0.99)]);
        class077012.N(() -> class03131.N(string3, string4, string5, (long[])object), false);
        return (int)f;
    }

    private static int N(class07701 class077012, int n) {
        if (class077012.W().yW().y(n)) {
            class077012.N(() -> class00392.L((String)"commands.tick.sprint.stop.success"), true);
        }
        class077012.N(() -> class00392.L((String)"commands.tick.status.sprinting"), true);
        return 1;
    }

    private static int N(class07701 class077012, float f) {
        class077012.W().yW().N(f);
        String string = String.format(Locale.ROOT, "%.1f", Float.valueOf(f));
        class077012.N(() -> class00392.N((String)"commands.tick.rate.success", (Object[])new Object[]{string}), true);
        return (int)f;
    }
}

