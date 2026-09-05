/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class04131
 *  minecraft.class05021
 *  minecraft.class05216
 *  minecraft.class07282
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class04131;
import minecraft.class05021;
import minecraft.class05216;
import minecraft.class07282;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class06223 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.publish.failed"));
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.publish.alreadyPublished", (Object[])new Object[]{object}));

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"publish").requires((Predicate)class07686.N((class08164)class07686.R))).executes(commandContext -> class06223.N((class07701)commandContext.getSource(), class05021.N(), false, null))).then(((RequiredArgumentBuilder)class07686.N((String)"allowCommands", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class06223.N((class07701)commandContext.getSource(), class05021.N(), BoolArgumentType.getBool((CommandContext)commandContext, (String)"allowCommands"), null))).then(((RequiredArgumentBuilder)class07686.N((String)"gamemode", (ArgumentType)class04131.N()).executes(commandContext -> class06223.N((class07701)commandContext.getSource(), class05021.N(), BoolArgumentType.getBool((CommandContext)commandContext, (String)"allowCommands"), class04131.N((CommandContext)commandContext, (String)"gamemode")))).then(class07686.N((String)"port", (ArgumentType)IntegerArgumentType.integer((int)0, (int)65535)).executes(commandContext -> class06223.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"port"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"allowCommands"), class04131.N((CommandContext)commandContext, (String)"gamemode")))))));
    }

    private static int N(class07701 class077012, int n, boolean bl, @Nullable class07282 class072822) throws CommandSyntaxException {
        if (class077012.W().P()) {
            throw y.create((Object)class077012.W().ar_());
        }
        if (!class077012.W().N(class072822, bl, n)) {
            throw N.create();
        }
        class077012.N(() -> class06223.y(n), true);
        return n;
    }

    public static class05216 y(int n) {
        class05216 class052162 = class00390.N((String)String.valueOf(n));
        return class00392.N((String)"commands.publish.started", (Object[])new Object[]{class052162});
    }
}

