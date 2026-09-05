/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00627
 *  minecraft.class00647
 *  minecraft.class01834
 *  minecraft.class02796
 *  minecraft.class03215
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07529
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00627;
import minecraft.class00647;
import minecraft.class01834;
import minecraft.class02796;
import minecraft.class03215;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07529;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class01808 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.jfr.start.failed"));
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.jfr.dump.failed", (Object[])new Object[]{object}));

    private class01808() {
    }

    private static int y(class07701 class077012) throws CommandSyntaxException {
        try {
            Path path = Paths.get(".", new String[0]).relativize(class01834.M.L().normalize());
            Path path2 = !class077012.W().P() || class07529.ND ? path.toAbsolutePath() : path;
            class05216 class052162 = class00392.y((String)path.toString()).N(class06541.field_1073).N(class004052 -> class004052.N((class00647)new class00627(path2.toString())).N((class00395)new class00401((class00392)class00392.L((String)"chat.copy.click"))));
            class077012.N(() -> class01808.N((class00392)class052162), false);
            return 1;
        }
        catch (Throwable throwable) {
            throw y.create((Object)throwable.getMessage());
        }
    }

    private static int N(class07701 class077012) throws CommandSyntaxException {
        class03215 class032152 = class03215.N((class02796)class077012.W());
        if (!class01834.M.N(class032152)) {
            throw N.create();
        }
        class077012.N(() -> class00392.L((String)"commands.jfr.started"), false);
        return 1;
    }

    private static /* synthetic */ class00392 N(class00392 class003922) {
        return class00392.N((String)"commands.jfr.stopped", (Object[])new Object[]{class003922});
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"jfr").requires((Predicate)class07686.N((class08164)class07686.R))).then(class07686.y((String)"start").executes(commandContext -> class01808.N((class07701)commandContext.getSource())))).then(class07686.y((String)"stop").executes(commandContext -> class01808.y((class07701)commandContext.getSource()))));
    }
}

