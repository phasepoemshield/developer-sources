/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00881
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06791
 *  minecraft.class06889
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07778
 *  minecraft.class08073
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00881;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06791;
import minecraft.class06889;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07778;
import minecraft.class08073;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class06195 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.playsound.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        RequiredArgumentBuilder requiredArgumentBuilder = (RequiredArgumentBuilder)class07686.N((String)"sound", (ArgumentType)class07778.N()).suggests(class06791.N((SuggestionProvider)class06791.y)).executes(commandContext -> class06195.N((class07701)commandContext.getSource(), class06195.N(((class07701)commandContext.getSource()).z()), class07778.N((CommandContext)commandContext, (String)"sound"), class04911.field_15250, ((class07701)commandContext.getSource()).i(), 1.0f, 1.0f, 0.0f));
        for (class04911 class049112 : class04911.values()) {
            requiredArgumentBuilder.then(class06195.N(class049112));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"playsound").requires((Predicate)class07686.N((class08164)class07686.u))).then((ArgumentBuilder)requiredArgumentBuilder));
    }

    private static int N(class07701 class077012, Collection<class04770> collection, class01894 class018942, class04911 class049112, class06889 class068892, float f, float f2, float f3) throws CommandSyntaxException {
        class03556 class035562 = class03556.N((Object)class04891.N((class01894)class018942));
        double d = class04995.z((float)((class04891)class035562.N()).N(f));
        class04782 class047822 = class077012.R();
        long l = class047822.method_8409().B();
        ArrayList<class04770> arrayList = new ArrayList<class04770>();
        for (class04770 class047702 : collection) {
            if (class047702.method_51469() != class047822) continue;
            double d2 = class068892.M - class047702.method_23317();
            double d3 = class068892.B - class047702.method_23318();
            double d4 = class068892.Z - class047702.method_23321();
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            class06889 class068893 = class068892;
            float f4 = f;
            if (d5 > d) {
                if (f3 <= 0.0f) continue;
                double d6 = Math.sqrt(d5);
                class068893 = new class06889(class047702.method_23317() + d2 / d6 * 2.0, class047702.method_23318() + d3 / d6 * 2.0, class047702.method_23321() + d4 / d6 * 2.0);
                f4 = f3;
            }
            class047702.field_13987.method_14364((class00381)new class08073(class035562, class049112, class068893.N(), class068893.y(), class068893.L(), f4, f2, l));
            arrayList.add(class047702);
        }
        int n = arrayList.size();
        if (n == 0) {
            throw N.create();
        }
        if (n == 1) {
            class077012.N(() -> class00392.N((String)"commands.playsound.success.single", (Object[])new Object[]{class00392.N((class01894)class018942), ((class04770)arrayList.getFirst()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.playsound.success.multiple", (Object[])new Object[]{class00392.N((class01894)class018942), n}), true);
        }
        return n;
    }

    private static Collection<class04770> N(@Nullable class04770 class047702) {
        return class047702 != null ? List.of(class047702) : List.of();
    }

    private static LiteralArgumentBuilder<class07701> N(class04911 class049112) {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)class049112.N()).executes(commandContext -> class06195.N((class07701)commandContext.getSource(), class06195.N(((class07701)commandContext.getSource()).z()), class07778.N((CommandContext)commandContext, (String)"sound"), class049112, ((class07701)commandContext.getSource()).i(), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).executes(commandContext -> class06195.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class07778.N((CommandContext)commandContext, (String)"sound"), class049112, ((class07701)commandContext.getSource()).i(), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)class07686.N((String)"pos", (ArgumentType)class00881.N()).executes(commandContext -> class06195.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class07778.N((CommandContext)commandContext, (String)"sound"), class049112, class00881.N((CommandContext)commandContext, (String)"pos"), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)class07686.N((String)"volume", (ArgumentType)FloatArgumentType.floatArg((float)0.0f)).executes(commandContext -> class06195.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class07778.N((CommandContext)commandContext, (String)"sound"), class049112, class00881.N((CommandContext)commandContext, (String)"pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), 1.0f, 0.0f))).then(((RequiredArgumentBuilder)class07686.N((String)"pitch", (ArgumentType)FloatArgumentType.floatArg((float)0.0f, (float)2.0f)).executes(commandContext -> class06195.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class07778.N((CommandContext)commandContext, (String)"sound"), class049112, class00881.N((CommandContext)commandContext, (String)"pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), ((Float)commandContext.getArgument("pitch", Float.class)).floatValue(), 0.0f))).then(class07686.N((String)"minVolume", (ArgumentType)FloatArgumentType.floatArg((float)0.0f, (float)1.0f)).executes(commandContext -> class06195.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class07778.N((CommandContext)commandContext, (String)"sound"), class049112, class00881.N((CommandContext)commandContext, (String)"pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), ((Float)commandContext.getArgument("pitch", Float.class)).floatValue(), ((Float)commandContext.getArgument("minVolume", Float.class)).floatValue())))))));
    }
}

