/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09109
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  java.util.HexFormat
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class04348
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06541
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07696
 *  minecraft.class07701
 *  minecraft.class07778
 *  minecraft.class08164
 *  minecraft.class08668
 */
package minecraft;

import Nursultan.class09109;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.HexFormat;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00028;
import minecraft.class00035;
import minecraft.class00042;
import minecraft.class00058;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class04348;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class06541;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07696;
import minecraft.class07701;
import minecraft.class07778;
import minecraft.class08164;
import minecraft.class08668;

public class class00024 {
    private static int N(class07701 class077012) {
        class04782 class047822 = class077012.R();
        Set<class00042> var2 = class047822.method_70636().y();
        String string = class047822.method_27983().N().toString();
        if (var2.isEmpty()) {
            class077012.N(() -> class00392.N((String)"commands.waypoint.list.empty", (Object[])new Object[]{string}), false);
            return 0;
        }
        class00392 class003922 = class00390.y((Collection)var2.stream().map(class000422 -> {
            if (class000422 instanceof class07438) {
                class07438 class074382 = (class07438)class000422;
                class07209 class072092 = class074382.method_24515();
                return class074382.yZ().L().N(class004052 -> class004052.N((class00647)new class00640("/execute in " + string + " run tp @s " + class072092.method_10263() + " " + class072092.method_10264() + " " + class072092.method_10260())).N((class00395)new class00401((class00392)class00392.L((String)"chat.coordinates.tooltip"))).N(class000422.method_70675().i.orElse(-1).intValue()));
            }
            return class00392.y((String)class000422.toString());
        }).toList(), Function.identity());
        class077012.N(() -> class00392.N((String)"commands.waypoint.list.success", (Object[])new Object[]{var2.size(), string, class003922}), false);
        return var2.size();
    }

    private static int N(class07701 class077012, class00042 class000422) {
        class00024.N(class077012, class000422, (class00028 class000282) -> {
            class000282.i = Optional.empty();
        });
        class077012.N(() -> class00392.L((String)"commands.waypoint.modify.color.reset"), false);
        return 0;
    }

    private static int N(class07701 class077012, class00042 class000422, Integer n) {
        class00024.N(class077012, class000422, (class00028 class000282) -> {
            class000282.i = Optional.of(n);
        });
        class077012.N(() -> class00392.N((String)"commands.waypoint.modify.color", (Object[])new Object[]{class00392.y((String)HexFormat.of().withUpperCase().toHexDigits((long)class02566.R((int)0, (int)n), 6)).y(n.intValue())}), false);
        return 0;
    }

    private static int N(class07701 class077012, class00042 class000422, class06541 class065412) {
        class00024.N(class077012, class000422, (class00028 class000282) -> {
            class000282.i = Optional.of(class065412.i());
        });
        class077012.N(() -> class00392.N((String)"commands.waypoint.modify.color", (Object[])new Object[]{class00392.y((String)class065412.R()).N(class065412)}), false);
        return 0;
    }

    private static int N(class07701 class077012, class00042 class000422, class05946<class09109> class059462) {
        class00024.N(class077012, class000422, (class00028 class000282) -> {
            class000282.u = class059462;
        });
        class077012.N(() -> class00392.L((String)"commands.waypoint.modify.style"), false);
        return 0;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"waypoint").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"list").executes(commandContext -> class00024.N((class07701)commandContext.getSource())))).then(class07686.y((String)"modify").then(((RequiredArgumentBuilder)class07686.N((String)"waypoint", (ArgumentType)class07680.N()).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"color").then(class07686.N((String)"color", (ArgumentType)class07696.N()).executes(commandContext -> class00024.N((class07701)commandContext.getSource(), class08668.N((CommandContext)commandContext, (String)"waypoint"), class07696.N((CommandContext)commandContext, (String)"color"))))).then(class07686.y((String)"hex").then(class07686.N((String)"color", (ArgumentType)class00035.N()).executes(commandContext -> class00024.N((class07701)commandContext.getSource(), class08668.N((CommandContext)commandContext, (String)"waypoint"), class00035.N((CommandContext<class07701>)commandContext, "color")))))).then(class07686.y((String)"reset").executes(commandContext -> class00024.N((class07701)commandContext.getSource(), class08668.N((CommandContext)commandContext, (String)"waypoint")))))).then(((LiteralArgumentBuilder)class07686.y((String)"style").then(class07686.y((String)"reset").executes(commandContext -> class00024.N((class07701)commandContext.getSource(), class08668.N((CommandContext)commandContext, (String)"waypoint"), class00058.y)))).then(class07686.y((String)"set").then(class07686.N((String)"style", (ArgumentType)class07778.N()).executes(commandContext -> class00024.N((class07701)commandContext.getSource(), class08668.N((CommandContext)commandContext, (String)"waypoint"), (class05946<class09109>)class05946.N(class00058.N, (class01894)class07778.N((CommandContext)commandContext, (String)"style"))))))))));
    }

    private static void N(class07701 class077012, class00042 class000422, Consumer<class00028> consumer) {
        class04782 class047822 = class077012.R();
        class047822.method_70636().L(class000422);
        consumer.accept(class000422.method_70675());
        class047822.method_70636().N(class000422);
    }
}

