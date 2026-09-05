/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
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
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class10564 {
    private static boolean[] L;
    public static Object[] N;
    private static String[] u;

    static {
        class10564.y();
        class10564.N();
        class10564.R();
        class10564.N[0] = new SimpleCommandExceptionType((Message)class00392.L((String)u[4]));
    }

    private static void y() {
        L = new boolean[1];
        class10564.L[0] = true;
    }

    private static int N(class07701 class077012, boolean bl) throws CommandSyntaxException {
        class077012.N(() -> class00392.L((String)u[3]), false);
        if (!class077012.W().N(true, bl, true)) {
            throw ((SimpleCommandExceptionType)N[0]).create();
        }
        class077012.N(() -> class00392.L((String)u[2]), true);
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)u[0]).requires((Predicate)class07686.N((class08164)class07686.R))).executes(commandContext -> class10564.N((class07701)commandContext.getSource(), false))).then(class07686.y((String)u[1]).executes(commandContext -> class10564.N((class07701)commandContext.getSource(), true))));
    }

    private static void N() {
        u = new String[5];
        class10564.u[0] = "save-all";
        class10564.u[1] = "flush";
        class10564.u[2] = "commands.save.success";
        class10564.u[3] = "commands.save.saving";
        class10564.u[4] = "commands.save.failed";
    }

    private static void R() {
        N = new Object[L[0]];
    }
}

