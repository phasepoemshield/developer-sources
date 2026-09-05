/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class02796
 *  minecraft.class07086
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class02796;
import minecraft.class07086;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06420 {
    private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.difficulty.failure", (Object[])new Object[]{object}));

    public static int N(class07701 class077012, class07086 class070862) throws CommandSyntaxException {
        class02796 class027962 = class077012.W();
        if (class027962.yn().s() == class070862) {
            throw N.create((Object)class070862.u());
        }
        class027962.N(class070862, true);
        class077012.N(() -> class00392.N((String)"commands.difficulty.success", (Object[])new Object[]{class070862.y()}), true);
        return 0;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        LiteralArgumentBuilder var1 = class07686.y((String)"difficulty");
        for (class07086 class070862 : class07086.values()) {
            var1.then(class07686.y((String)class070862.u()).executes(commandContext -> class06420.N((class07701)commandContext.getSource(), class070862)));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.requires((Predicate)class07686.N((class08164)class07686.u))).executes(commandContext -> {
            class07086 class070862 = ((class07701)commandContext.getSource()).R().y();
            ((class07701)commandContext.getSource()).N(() -> class00392.N((String)"commands.difficulty.query", (Object[])new Object[]{class070862.y()}), false);
            return class070862.N();
        }));
    }
}

