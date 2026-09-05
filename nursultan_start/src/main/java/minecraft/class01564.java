/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00629
 *  minecraft.class00649
 *  minecraft.class01062
 *  minecraft.class03059
 *  minecraft.class03926
 *  minecraft.class04770
 *  minecraft.class05946
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07690
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import minecraft.class00629;
import minecraft.class00649;
import minecraft.class01062;
import minecraft.class03059;
import minecraft.class03926;
import minecraft.class04770;
import minecraft.class05946;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07690;
import minecraft.class07701;

public class class01564 {
    private static void N(class07701 class077012, Collection<class04770> collection, class03926 class039262) {
        class00649 class006492 = class00629.N((class05946)class00629.M, (class07701)class077012);
        class03059 class030592 = class03059.N((class03926)class039262);
        boolean bl = false;
        for (class04770 class047702 : collection) {
            class00649 class006493 = class00629.N((class05946)class00629.B, (class07701)class077012).L(class047702.method_5476());
            class077012.N(class030592, false, class006493);
            boolean bl2 = class077012.N(class047702);
            class047702.method_43505(class030592, bl2, class006492);
            bl |= bl2 && class039262.z();
        }
        if (bl) {
            class077012.N(class01062.i);
        }
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)class07686.y((String)"msg").then(class07686.N((String)"targets", (ArgumentType)class07680.u()).then(class07686.N((String)"message", (ArgumentType)class07690.N()).executes(commandContext -> {
            Collection var1 = class07680.R((CommandContext)commandContext, (String)"targets");
            if (!var1.isEmpty()) {
                class07690.N((CommandContext)commandContext, (String)"message", (T class039262) -> class01564.N((class07701)commandContext.getSource(), (Collection<class04770>)var1, class039262));
            }
            return var1.size();
        }))));
        commandDispatcher.register((LiteralArgumentBuilder)class07686.y((String)"tell").redirect((CommandNode)literalCommandNode));
        commandDispatcher.register((LiteralArgumentBuilder)class07686.y((String)"w").redirect((CommandNode)literalCommandNode));
    }
}

