/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09476
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class04348
 *  minecraft.class05706
 *  minecraft.class06839
 *  minecraft.class07305
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  net.fabricmc.fabric.mixin.gamerule.GameRuleCommandAccessor
 */
package minecraft;

import Nursultan.class09476;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class04348;
import minecraft.class05706;
import minecraft.class06839;
import minecraft.class07305;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import net.fabricmc.fabric.mixin.gamerule.GameRuleCommandAccessor;

public class class01549
implements GameRuleCommandAccessor {
    private static <T> int y(class07701 class077012, class06839<T> class068392) {
        Object object = class077012.R().method_64395().N(class068392);
        class077012.N(() -> class00392.N((String)"commands.gamerule.query", (Object[])new Object[]{class068392.N(), class068392.N(object)}), false);
        return class068392.y(object);
    }

    public static /* synthetic */ int N(class07701 class077012, class06839 class068392) {
        return class01549.y(class077012, class068392);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        LiteralArgumentBuilder var2 = (LiteralArgumentBuilder)class07686.y((String)"gamerule").requires((Predicate)class07686.N((class08164)class07686.u));
        new class07305(class043482.N()).N((class05706)new class09476(var2));
        commandDispatcher.register(var2);
    }

    public static <T> LiteralArgumentBuilder<class07701> N(class06839<T> class068392, LiteralArgumentBuilder<class07701> literalArgumentBuilder) {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.executes(commandContext -> class01549.y((class07701)commandContext.getSource(), class068392))).then(class07686.N((String)"value", (ArgumentType)class068392.M()).executes(commandContext -> class01549.N((CommandContext<class07701>)commandContext, class068392)));
    }

    private static <T> int N(CommandContext<class07701> commandContext, class06839<T> class068392) {
        class07701 class077012 = (class07701)commandContext.getSource();
        Object object = commandContext.getArgument("value", class068392.u());
        class077012.R().method_64395().N(class068392, object, ((class07701)commandContext.getSource()).W());
        class077012.N(() -> class00392.N((String)"commands.gamerule.set", (Object[])new Object[]{class068392.N(), class068392.N(object)}), true);
        return class068392.y(object);
    }
}

