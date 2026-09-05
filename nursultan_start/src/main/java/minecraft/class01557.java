/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class04131
 *  minecraft.class04770
 *  minecraft.class05216
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08149
 *  minecraft.class08162
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class04131;
import minecraft.class04770;
import minecraft.class05216;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08149;
import minecraft.class08162;
import minecraft.class08164;

public class class01557 {
    public static final class08164 N = new class08149(class08162.y);

    private static boolean y(class07701 class077012, class04770 class047702, class07282 class072822) {
        if (class047702.method_7336(class072822)) {
            class01557.N(class077012, class047702, class072822);
            return true;
        }
        return false;
    }

    private static /* synthetic */ class00392 N(class00392 class003922) {
        return class00392.N((String)"commands.gamemode.success.self", (Object[])new Object[]{class003922});
    }

    private static void N(class07701 class077012, class04770 class047702, class07282 class072822) {
        class05216 class052162 = class00392.L((String)("gameMode." + class072822.y()));
        if (class077012.M() == class047702) {
            class077012.N(() -> class01557.N((class00392)class052162), true);
        } else {
            if (((Boolean)class077012.R().method_64395().N(class07305.F)).booleanValue()) {
                class047702.method_64398((class00392)class00392.N((String)"gameMode.changed", (Object[])new Object[]{class052162}));
            }
            class077012.N(() -> class01557.N(class047702, (class00392)class052162), true);
        }
    }

    private static int N(CommandContext<class07701> commandContext, Collection<class04770> collection, class07282 class072822) {
        int n = 0;
        for (class04770 class047702 : collection) {
            if (!class01557.y((class07701)commandContext.getSource(), class047702, class072822)) continue;
            ++n;
        }
        return n;
    }

    public static void N(class04770 class047702, class07282 class072822) {
        class01557.y(class047702.method_64396(), class047702, class072822);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"gamemode").requires((Predicate)class07686.N((class08164)N))).then(((RequiredArgumentBuilder)class07686.N((String)"gamemode", (ArgumentType)class04131.N()).executes(commandContext -> class01557.N((CommandContext<class07701>)commandContext, Collections.singleton(((class07701)commandContext.getSource()).Z()), class04131.N((CommandContext)commandContext, (String)"gamemode")))).then(class07686.N((String)"target", (ArgumentType)class07680.u()).executes(commandContext -> class01557.N((CommandContext<class07701>)commandContext, class07680.R((CommandContext)commandContext, (String)"target"), class04131.N((CommandContext)commandContext, (String)"gamemode"))))));
    }

    private static /* synthetic */ class00392 N(class04770 class047702, class00392 class003922) {
        return class00392.N((String)"commands.gamemode.success.other", (Object[])new Object[]{class047702.method_5476(), class003922});
    }
}

