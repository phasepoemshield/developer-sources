/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package Nursultan;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class10560 {
    private static String[] L;
    public static Object N_0;

    static {
        class10560.N();
        class10560.u();
        class10560.y();
        N_0 = new SimpleCommandExceptionType((Message)class00392.L((String)L[2]));
    }

    private static void u() {
        L = new String[3];
        class10560.L[0] = "save-on";
        class10560.L[1] = "commands.save.enabled";
        class10560.L[2] = "commands.save.alreadyOn";
    }

    private static void y() {
    }

    private static void N() {
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)L[0]).requires((Predicate)class07686.N((class08164)class07686.R))).executes(commandContext -> {
            class07701 class077012 = (class07701)commandContext.getSource();
            if (!class077012.W().m(true)) {
                throw ((SimpleCommandExceptionType)N_0).create();
            }
            class077012.N(() -> class00392.L((String)L[1]), true);
            return 1;
        }));
    }
}

