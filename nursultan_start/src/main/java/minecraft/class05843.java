/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class00502
 *  minecraft.class00629
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00649
 *  minecraft.class01062
 *  minecraft.class03059
 *  minecraft.class03926
 *  minecraft.class04770
 *  minecraft.class05216
 *  minecraft.class05946
 *  minecraft.class07049
 *  minecraft.class07686
 *  minecraft.class07690
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00502;
import minecraft.class00629;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00649;
import minecraft.class01062;
import minecraft.class03059;
import minecraft.class03926;
import minecraft.class04770;
import minecraft.class05216;
import minecraft.class05946;
import minecraft.class07049;
import minecraft.class07686;
import minecraft.class07690;
import minecraft.class07701;

public class class05843 {
    private static final class00405 N = class00405.N.N((class00395)new class00401((class00392)class00392.L((String)"chat.type.team.hover"))).N((class00647)new class00640("/teammsg "));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.teammsg.failed.noteam"));

    private static void N(class07701 class077012, class07049 class070492, class00502 class005022, List<class04770> list, class03926 class039262) {
        class05216 class052162 = class005022.i().L(N);
        class00649 class006492 = class00629.N((class05946)class00629.Z, (class07701)class077012).L((class00392)class052162);
        class00649 class006493 = class00629.N((class05946)class00629.z, (class07701)class077012).L((class00392)class052162);
        class03059 class030592 = class03059.N((class03926)class039262);
        boolean bl = false;
        for (class04770 class047702 : list) {
            class00649 class006494 = class047702 == class070492 ? class006493 : class006492;
            boolean bl2 = class077012.N(class047702);
            class047702.method_43505(class030592, bl2, class006494);
            bl |= bl2 && class039262.z();
        }
        if (bl) {
            class077012.N(class01062.i);
        }
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)class07686.y((String)"teammsg").then(class07686.N((String)"message", (ArgumentType)class07690.N()).executes(commandContext -> {
            class07701 class077012 = (class07701)commandContext.getSource();
            class07049 class070492 = class077012.B();
            class00502 class005022 = class070492.method_5781();
            if (class005022 == null) {
                throw y.create();
            }
            List var4 = class077012.W().Nm().v().stream().filter(class047702 -> class047702 == class070492 || class047702.method_5781() == class005022).toList();
            if (!var4.isEmpty()) {
                class07690.N((CommandContext)commandContext, (String)"message", (T class039262) -> class05843.N(class077012, class070492, class005022, var4, class039262));
            }
            return var4.size();
        })));
        commandDispatcher.register((LiteralArgumentBuilder)class07686.y((String)"tm").redirect((CommandNode)literalCommandNode));
    }
}

