/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04770
 *  minecraft.class04911
 *  minecraft.class06791
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07778
 *  minecraft.class08090
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class04770;
import minecraft.class04911;
import minecraft.class06791;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07778;
import minecraft.class08090;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class06226 {
    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        RequiredArgumentBuilder requiredArgumentBuilder = (RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).executes(commandContext -> class06226.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), null, null))).then(class07686.y((String)"*").then(class07686.N((String)"sound", (ArgumentType)class07778.N()).suggests(class06791.N((SuggestionProvider)class06791.y)).executes(commandContext -> class06226.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), null, class07778.N((CommandContext)commandContext, (String)"sound")))));
        for (class04911 class049112 : class04911.values()) {
            requiredArgumentBuilder.then(((LiteralArgumentBuilder)class07686.y((String)class049112.N()).executes(commandContext -> class06226.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class049112, null))).then(class07686.N((String)"sound", (ArgumentType)class07778.N()).suggests(class06791.N((SuggestionProvider)class06791.y)).executes(commandContext -> class06226.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class049112, class07778.N((CommandContext)commandContext, (String)"sound")))));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"stopsound").requires((Predicate)class07686.N((class08164)class07686.u))).then((ArgumentBuilder)requiredArgumentBuilder));
    }

    private static int N(class07701 class077012, Collection<class04770> collection, @Nullable class04911 class049112, @Nullable class01894 class018942) {
        class08090 class080902 = new class08090(class018942, class049112);
        Iterator<class04770> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field_13987.method_14364((class00381)class080902);
        }
        if (class049112 != null) {
            if (class018942 != null) {
                class077012.N(() -> class00392.N((String)"commands.stopsound.success.source.sound", (Object[])new Object[]{class00392.N((class01894)class018942), class049112.N()}), true);
            } else {
                class077012.N(() -> class00392.N((String)"commands.stopsound.success.source.any", (Object[])new Object[]{class049112.N()}), true);
            }
        } else if (class018942 != null) {
            class077012.N(() -> class00392.N((String)"commands.stopsound.success.sourceless.sound", (Object[])new Object[]{class00392.N((class01894)class018942)}), true);
        } else {
            class077012.N(() -> class00392.L((String)"commands.stopsound.success.sourceless.any"), true);
        }
        return collection.size();
    }
}

