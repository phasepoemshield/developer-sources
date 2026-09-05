/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class05216
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class05216;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06213 {
    private static /* synthetic */ class00392 N(class00392 class003922) {
        return class00392.N((String)"commands.seed.success", (Object[])new Object[]{class003922});
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, boolean bl) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"seed").requires((Predicate)class07686.N((class08164)(bl ? class07686.u : class07686.y)))).executes(commandContext -> {
            long l = ((class07701)commandContext.getSource()).R().method_8412();
            class05216 class052162 = class00390.N((String)String.valueOf(l));
            ((class07701)commandContext.getSource()).N(() -> class06213.N((class00392)class052162), false);
            return (int)l;
        }));
    }
}

