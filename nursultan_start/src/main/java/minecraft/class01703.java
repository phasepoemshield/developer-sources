/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00143
 *  minecraft.class00392
 *  minecraft.class00894
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07655
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import minecraft.class00143;
import minecraft.class00392;
import minecraft.class00894;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07655;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class01703 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.y((String)"Source is not a mob"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.y((String)"Path not found"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.y((String)"Target not reached"));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"debugpath").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"to", (ArgumentType)class00894.N()).executes(commandContext -> class01703.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"to")))));
    }

    private static int N(class07701 class077012, class07209 class072092) throws CommandSyntaxException {
        class07049 class070492 = class077012.M();
        if (!(class070492 instanceof class07079)) {
            throw N.create();
        }
        class07079 class070792 = (class07079)class070492;
        class00143 class001432 = new class07655(class070792, (class07299)class077012.R()).N(class072092, 0);
        if (class001432 == null) {
            throw y.create();
        }
        if (!class001432.z()) {
            throw L.create();
        }
        class077012.N(() -> class00392.y((String)"Made path"), true);
        return 1;
    }
}

