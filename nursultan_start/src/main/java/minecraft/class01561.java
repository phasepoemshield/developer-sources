/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01062
 *  minecraft.class04770
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01062;
import minecraft.class04770;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08036;

public class class01561 {
    private static int y(class07701 class077012) {
        return class01561.N(class077012, class047702 -> class00392.N((String)"commands.list.nameAndId", (Object[])new Object[]{class047702.method_5477(), class00392.N((UUID)class047702.method_7334().id())}));
    }

    private static int N(class07701 class077012, Function<class04770, class00392> function) {
        class01062 class010622 = class077012.W().Nm();
        List var3 = class010622.v();
        class00392 class003922 = class00390.y((Collection)var3, function);
        class077012.N(() -> class00392.N((String)"commands.list.players", (Object[])new Object[]{var3.size(), class010622.P(), class003922}), false);
        return var3.size();
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"list").executes(commandContext -> class01561.N((class07701)commandContext.getSource()))).then(class07686.y((String)"uuids").executes(commandContext -> class01561.y((class07701)commandContext.getSource()))));
    }

    private static int N(class07701 class077012) {
        return class01561.N(class077012, class08036::method_5476);
    }
}

