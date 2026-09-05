/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class01072
 *  minecraft.class01086
 *  minecraft.class04770
 *  minecraft.class06794
 *  minecraft.class07686
 *  minecraft.class07690
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01072;
import minecraft.class01086;
import minecraft.class04770;
import minecraft.class06794;
import minecraft.class07686;
import minecraft.class07690;
import minecraft.class07701;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class06423 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.banip.invalid"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.banip.failed"));

    private static int y(class07701 class077012, String string, @Nullable class00392 class003922) throws CommandSyntaxException {
        class01086 class010862 = class077012.W().Nm().B();
        if (class010862.N(string)) {
            throw y.create();
        }
        List var4 = class077012.W().Nm().y(string);
        class01072 class010722 = new class01072(string, null, class077012.u(), null, class003922 == null ? null : class003922.getString());
        class010862.N(class010722);
        class077012.N(() -> class00392.N((String)"commands.banip.success", (Object[])new Object[]{string, class010722.i()}), true);
        if (!var4.isEmpty()) {
            class077012.N(() -> class00392.N((String)"commands.banip.info", (Object[])new Object[]{var4.size(), class06794.N((List)var4)}), true);
        }
        Iterator var6 = var4.iterator();
        while (var6.hasNext()) {
            ((class04770)var6.next()).field_13987.method_52396((class00392)class00392.L((String)"multiplayer.disconnect.ip_banned"));
        }
        return var4.size();
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"ban-ip").requires((Predicate)class07686.N((class08164)class07686.i))).then(((RequiredArgumentBuilder)class07686.N((String)"target", (ArgumentType)StringArgumentType.word()).executes(commandContext -> class06423.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"target"), null))).then(class07686.N((String)"reason", (ArgumentType)class07690.N()).executes(commandContext -> class06423.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"target"), class07690.N((CommandContext)commandContext, (String)"reason"))))));
    }

    private static int N(class07701 class077012, String string, @Nullable class00392 class003922) throws CommandSyntaxException {
        if (InetAddresses.isInetAddress((String)string)) {
            return class06423.y(class077012, string, class003922);
        }
        class04770 class047702 = class077012.W().Nm().N(string);
        if (class047702 != null) {
            return class06423.y(class077012, class047702.method_14209(), class003922);
        }
        throw N.create();
    }
}

