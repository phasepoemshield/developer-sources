/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07686
 *  minecraft.class07701
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import minecraft.class00392;
import minecraft.class03296;
import minecraft.class03309;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07686;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03305 {
    private static final Logger y = LogUtils.getLogger();
    private static final String L = "localhost";
    private static final String u = "0.0.0.0";
    private static final int i = 10000;
    private static final int R = 100;
    public static BiMap<String, class05946<class07299>> N = ImmutableBiMap.of((Object)"o", (Object)class07299.field_25179, (Object)"n", (Object)class07299.field_25180, (Object)"e", (Object)class07299.field_25181);
    private static @Nullable class03309 M;
    private static @Nullable class03296 B;

    private static boolean y(class07701 class077012) {
        if (M != null) {
            class077012.y((class00392)class00392.y((String)"Chase server is already running. Stop it using /chase stop"));
            return true;
        }
        if (B != null) {
            class077012.y((class00392)class00392.y((String)"You are already chasing someone. Stop it using /chase stop"));
            return true;
        }
        return false;
    }

    private static int y(class07701 class077012, String string, int n) {
        if (class03305.y(class077012)) {
            return 0;
        }
        B = new class03296(string, n, class077012.W());
        B.N();
        class077012.N(() -> class00392.y((String)("You are now chasing " + string + ":" + n + ". If that server does '/chase lead' then you will automatically go to the same position. Use '/chase stop' to stop chasing.")), false);
        return 0;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"chase").then(((LiteralArgumentBuilder)class07686.y((String)"follow").then(((RequiredArgumentBuilder)class07686.N((String)"host", (ArgumentType)StringArgumentType.string()).executes(commandContext -> class03305.y((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"host"), 10000))).then(class07686.N((String)"port", (ArgumentType)IntegerArgumentType.integer((int)1, (int)65535)).executes(commandContext -> class03305.y((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"host"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"port")))))).executes(commandContext -> class03305.y((class07701)commandContext.getSource(), L, 10000)))).then(((LiteralArgumentBuilder)class07686.y((String)"lead").then(((RequiredArgumentBuilder)class07686.N((String)"bind_address", (ArgumentType)StringArgumentType.string()).executes(commandContext -> class03305.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"bind_address"), 10000))).then(class07686.N((String)"port", (ArgumentType)IntegerArgumentType.integer((int)1024, (int)65535)).executes(commandContext -> class03305.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"bind_address"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"port")))))).executes(commandContext -> class03305.N((class07701)commandContext.getSource(), u, 10000)))).then(class07686.y((String)"stop").executes(commandContext -> class03305.N((class07701)commandContext.getSource()))));
    }

    private static int N(class07701 class077012, String string, int n) {
        if (class03305.y(class077012)) {
            return 0;
        }
        M = new class03309(string, n, class077012.W().Nm(), 100);
        try {
            M.N();
            class077012.N(() -> class00392.y((String)("Chase server is now running on port " + n + ". Clients can follow you using /chase follow <ip> <port>")), false);
        }
        catch (IOException iOException) {
            y.error("Failed to start chase server", (Throwable)iOException);
            class077012.y((class00392)class00392.y((String)("Failed to start chase server on port " + n)));
            M = null;
        }
        return 0;
    }

    private static int N(class07701 class077012) {
        if (B != null) {
            B.y();
            class077012.N(() -> class00392.y((String)"You have now stopped chasing"), false);
            B = null;
        }
        if (M != null) {
            M.y();
            class077012.N(() -> class00392.y((String)"You are no longer being chased"), false);
            M = null;
        }
        return 0;
    }
}

