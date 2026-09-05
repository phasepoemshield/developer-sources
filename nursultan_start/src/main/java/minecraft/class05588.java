/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class07049
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07698
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Predicate;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class07049;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07698;
import minecraft.class07701;
import minecraft.class08164;

public class class05588 {
    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"tellraw").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"targets", (ArgumentType)class07680.u()).then(class07686.N((String)"message", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> {
            int n = 0;
            for (class04770 class047702 : class07680.R((CommandContext)commandContext, (String)"targets")) {
                class047702.method_43502(class07698.N((CommandContext)commandContext, (String)"message", (class07049)class047702), false);
                ++n;
            }
            return n;
        }))));
    }
}

