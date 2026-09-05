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
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class01062
 *  minecraft.class05142
 *  minecraft.class05151
 *  minecraft.class05152
 *  minecraft.class07659
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class08036
 *  minecraft.class08164
 *  minecraft.class08774
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01062;
import minecraft.class05142;
import minecraft.class05151;
import minecraft.class05152;
import minecraft.class07659;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class08036;
import minecraft.class08164;
import minecraft.class08774;

public class class05613 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.whitelist.alreadyOn"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.whitelist.alreadyOff"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.whitelist.add.failed"));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.whitelist.remove.failed"));

    private static int L(class07701 class077012) throws CommandSyntaxException {
        if (!class077012.W().D_()) {
            throw y.create();
        }
        class077012.W().u(false);
        class077012.N(() -> class00392.L((String)"commands.whitelist.disabled"), true);
        return 1;
    }

    private static int u(class07701 class077012) {
        String[] stringArray = class077012.W().Nm().U();
        if (stringArray.length == 0) {
            class077012.N(() -> class00392.L((String)"commands.whitelist.none"), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.whitelist.list", (Object[])new Object[]{stringArray.length, String.join((CharSequence)", ", stringArray)}), false);
        }
        return stringArray.length;
    }

    private static int y(class07701 class077012, Collection<class08774> collection) throws CommandSyntaxException {
        class05152 class051522 = class077012.W().Nm().z();
        int n = 0;
        for (class08774 class087742 : collection) {
            if (!class051522.N(class087742)) continue;
            class05142 class051422 = new class05142(class087742);
            class051522.y((class05151)class051422);
            class077012.N(() -> class00392.N((String)"commands.whitelist.remove.success", (Object[])new Object[]{class00392.y((String)class087742.y())}), true);
            ++n;
        }
        if (n == 0) {
            throw u.create();
        }
        class077012.W().yN();
        return n;
    }

    private static int y(class07701 class077012) throws CommandSyntaxException {
        if (class077012.W().D_()) {
            throw N.create();
        }
        class077012.W().u(true);
        class077012.N(() -> class00392.L((String)"commands.whitelist.enabled"), true);
        class077012.W().yN();
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"whitelist").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.y((String)"on").executes(commandContext -> class05613.y((class07701)commandContext.getSource())))).then(class07686.y((String)"off").executes(commandContext -> class05613.L((class07701)commandContext.getSource())))).then(class07686.y((String)"list").executes(commandContext -> class05613.u((class07701)commandContext.getSource())))).then(class07686.y((String)"add").then(class07686.N((String)"targets", (ArgumentType)class07659.N()).suggests((commandContext, suggestionsBuilder) -> {
            class01062 class010622 = ((class07701)commandContext.getSource()).W().Nm();
            return class07689.y(class010622.v().stream().map(class08036::method_72498).filter(class087742 -> !class010622.z().N(class087742)).map(class08774::y), (SuggestionsBuilder)suggestionsBuilder);
        }).executes(commandContext -> class05613.N((class07701)commandContext.getSource(), class07659.N((CommandContext)commandContext, (String)"targets")))))).then(class07686.y((String)"remove").then(class07686.N((String)"targets", (ArgumentType)class07659.N()).suggests((commandContext, suggestionsBuilder) -> class07689.N((String[])((class07701)commandContext.getSource()).W().Nm().U(), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class05613.y((class07701)commandContext.getSource(), class07659.N((CommandContext)commandContext, (String)"targets")))))).then(class07686.y((String)"reload").executes(commandContext -> class05613.N((class07701)commandContext.getSource()))));
    }

    private static int N(class07701 class077012, Collection<class08774> collection) throws CommandSyntaxException {
        class05152 class051522 = class077012.W().Nm().z();
        int n = 0;
        for (class08774 class087742 : collection) {
            if (class051522.N(class087742)) continue;
            class05142 class051422 = new class05142(class087742);
            class051522.N(class051422);
            class077012.N(() -> class00392.N((String)"commands.whitelist.add.success", (Object[])new Object[]{class00392.y((String)class087742.y())}), true);
            ++n;
        }
        if (n == 0) {
            throw L.create();
        }
        return n;
    }

    private static int N(class07701 class077012) {
        class077012.W().Nm().x_();
        class077012.N(() -> class00392.L((String)"commands.whitelist.reloaded"), true);
        class077012.W().yN();
        return 1;
    }
}

