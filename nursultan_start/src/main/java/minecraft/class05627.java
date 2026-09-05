/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00887
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class07109
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07798
 *  minecraft.class08057
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00887;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class07109;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07798;
import minecraft.class08057;
import minecraft.class08164;

public class class05627 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.worldborder.center.failed"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.worldborder.set.failed.nochange"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.worldborder.set.failed.small"));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.N((String)"commands.worldborder.set.failed.big", (Object[])new Object[]{5.9999968E7}));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.N((String)"commands.worldborder.set.failed.far", (Object[])new Object[]{2.9999984E7}));
    private static final SimpleCommandExceptionType R = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.worldborder.warning.time.failed"));
    private static final SimpleCommandExceptionType M = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.worldborder.warning.distance.failed"));
    private static final SimpleCommandExceptionType B = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.worldborder.damage.buffer.failed"));
    private static final SimpleCommandExceptionType Z = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.worldborder.damage.amount.failed"));

    private static int y(class07701 class077012, float f) throws CommandSyntaxException {
        class08057 class080572 = class077012.R().method_8621();
        if (class080572.P() == (double)f) {
            throw Z.create();
        }
        class080572.L((double)f);
        class077012.N(() -> class00392.N((String)"commands.worldborder.damage.amount.success", (Object[])new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf(f))}), true);
        return (int)f;
    }

    private static int y(class07701 class077012, int n) throws CommandSyntaxException {
        class08057 class080572 = class077012.R().method_8621();
        if (class080572.b() == n) {
            throw M.create();
        }
        class080572.L(n);
        class077012.N(() -> class00392.N((String)"commands.worldborder.warning.distance.success", (Object[])new Object[]{n}), true);
        return n;
    }

    private static int N(class07701 class077012, float f) throws CommandSyntaxException {
        class08057 class080572 = class077012.R().method_8621();
        if (class080572.m() == (double)f) {
            throw B.create();
        }
        class080572.y((double)f);
        class077012.N(() -> class00392.N((String)"commands.worldborder.damage.buffer.success", (Object[])new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf(f))}), true);
        return (int)f;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"worldborder").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"add").then(((RequiredArgumentBuilder)class07686.N((String)"distance", (ArgumentType)DoubleArgumentType.doubleArg((double)-5.9999968E7, (double)5.9999968E7)).executes(commandContext -> class05627.N((class07701)commandContext.getSource(), ((class07701)commandContext.getSource()).R().method_8621().Z() + DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"distance"), 0L))).then(class07686.N((String)"time", (ArgumentType)class07798.N((int)0)).executes(commandContext -> class05627.N((class07701)commandContext.getSource(), ((class07701)commandContext.getSource()).R().method_8621().Z() + DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"distance"), ((class07701)commandContext.getSource()).R().method_8621().z() + (long)IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"))))))).then(class07686.y((String)"set").then(((RequiredArgumentBuilder)class07686.N((String)"distance", (ArgumentType)DoubleArgumentType.doubleArg((double)-5.9999968E7, (double)5.9999968E7)).executes(commandContext -> class05627.N((class07701)commandContext.getSource(), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"distance"), 0L))).then(class07686.N((String)"time", (ArgumentType)class07798.N((int)0)).executes(commandContext -> class05627.N((class07701)commandContext.getSource(), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"distance"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"))))))).then(class07686.y((String)"center").then(class07686.N((String)"pos", (ArgumentType)class00887.N()).executes(commandContext -> class05627.N((class07701)commandContext.getSource(), class00887.N((CommandContext)commandContext, (String)"pos")))))).then(((LiteralArgumentBuilder)class07686.y((String)"damage").then(class07686.y((String)"amount").then(class07686.N((String)"damagePerBlock", (ArgumentType)FloatArgumentType.floatArg((float)0.0f)).executes(commandContext -> class05627.y((class07701)commandContext.getSource(), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"damagePerBlock")))))).then(class07686.y((String)"buffer").then(class07686.N((String)"distance", (ArgumentType)FloatArgumentType.floatArg((float)0.0f)).executes(commandContext -> class05627.N((class07701)commandContext.getSource(), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"distance"))))))).then(class07686.y((String)"get").executes(commandContext -> class05627.N((class07701)commandContext.getSource())))).then(((LiteralArgumentBuilder)class07686.y((String)"warning").then(class07686.y((String)"distance").then(class07686.N((String)"distance", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class05627.y((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"distance")))))).then(class07686.y((String)"time").then(class07686.N((String)"time", (ArgumentType)class07798.N((int)0)).executes(commandContext -> class05627.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time")))))));
    }

    private static int N(class07701 class077012, int n) throws CommandSyntaxException {
        class08057 class080572 = class077012.R().method_8621();
        if (class080572.T() == n) {
            throw R.create();
        }
        class080572.y(n);
        class077012.N(() -> class00392.N((String)"commands.worldborder.warning.time.success", (Object[])new Object[]{class05627.N((long)n)}), true);
        return n;
    }

    private static String N(long l) {
        return String.format(Locale.ROOT, "%.2f", (double)l / 20.0);
    }

    private static int N(class07701 class077012, double d, long l) throws CommandSyntaxException {
        class04782 class047822 = class077012.R();
        class08057 class080572 = class047822.method_8621();
        double d2 = class080572.Z();
        if (d2 == d) {
            throw y.create();
        }
        if (d < 1.0) {
            throw L.create();
        }
        if (d > 5.9999968E7) {
            throw u.create();
        }
        String string = String.format(Locale.ROOT, "%.1f", d);
        if (l > 0L) {
            class080572.N(d2, d, l, class047822.N());
            if (d > d2) {
                class077012.N(() -> class00392.N((String)"commands.worldborder.set.grow", (Object[])new Object[]{string, class05627.N(l)}), true);
            } else {
                class077012.N(() -> class00392.N((String)"commands.worldborder.set.shrink", (Object[])new Object[]{string, class05627.N(l)}), true);
            }
        } else {
            class080572.N(d);
            class077012.N(() -> class00392.N((String)"commands.worldborder.set.immediate", (Object[])new Object[]{string}), true);
        }
        return (int)(d - d2);
    }

    private static int N(class07701 class077012, class07109 class071092) throws CommandSyntaxException {
        class08057 class080572 = class077012.R().method_8621();
        if (class080572.M() == (double)class071092.z && class080572.B() == (double)class071092.U) {
            throw N.create();
        }
        if ((double)Math.abs(class071092.z) > 2.9999984E7 || (double)Math.abs(class071092.U) > 2.9999984E7) {
            throw i.create();
        }
        class080572.L((double)class071092.z, (double)class071092.U);
        class077012.N(() -> class00392.N((String)"commands.worldborder.center.success", (Object[])new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf(class071092.z)), String.format(Locale.ROOT, "%.2f", Float.valueOf(class071092.U))}), true);
        return 0;
    }

    private static int N(class07701 class077012) {
        double d = class077012.R().method_8621().Z();
        class077012.N(() -> class00392.N((String)"commands.worldborder.get", (Object[])new Object[]{String.format(Locale.ROOT, "%.0f", d)}), false);
        return class04995.N((double)(d + 0.5));
    }
}

