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
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class05216
 *  minecraft.class06685
 *  minecraft.class06702
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07698
 *  minecraft.class07701
 *  minecraft.class07778
 *  minecraft.class08036
 *  minecraft.class08164
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
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class05216;
import minecraft.class06392;
import minecraft.class06398;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07698;
import minecraft.class07701;
import minecraft.class07778;
import minecraft.class08036;
import minecraft.class08164;

public class class06426 {
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.bossbar.create.failed", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.bossbar.unknown", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.bossbar.set.players.unchanged"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.bossbar.set.name.unchanged"));
    private static final SimpleCommandExceptionType R = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.bossbar.set.color.unchanged"));
    private static final SimpleCommandExceptionType M = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.bossbar.set.style.unchanged"));
    private static final SimpleCommandExceptionType B = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.bossbar.set.value.unchanged"));
    private static final SimpleCommandExceptionType Z = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.bossbar.set.max.unchanged"));
    private static final SimpleCommandExceptionType z = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.bossbar.set.visibility.unchanged.hidden"));
    private static final SimpleCommandExceptionType U = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.bossbar.set.visibility.unchanged.visible"));
    public static final SuggestionProvider<class07701> N = (commandContext, suggestionsBuilder) -> class07689.N(((class07701)commandContext.getSource()).W().yU().N(), (SuggestionsBuilder)suggestionsBuilder);

    private static int L(class07701 class077012, class06392 class063922) {
        if (class063922.P()) {
            class077012.N(() -> class00392.N((String)"commands.bossbar.get.visible.visible", (Object[])new Object[]{class063922.W()}), true);
            return 1;
        }
        class077012.N(() -> class00392.N((String)"commands.bossbar.get.visible.hidden", (Object[])new Object[]{class063922.W()}), true);
        return 0;
    }

    private static int i(class07701 class077012, class06392 class063922) {
        class06398 class063982 = class077012.W().yU();
        class063922.z();
        class063982.N(class063922);
        class077012.N(() -> class00392.N((String)"commands.bossbar.remove.success", (Object[])new Object[]{class063922.W()}), true);
        return class063982.y().size();
    }

    private static int u(class07701 class077012, class06392 class063922) {
        if (class063922.s().isEmpty()) {
            class077012.N(() -> class00392.N((String)"commands.bossbar.get.players.none", (Object[])new Object[]{class063922.W()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.bossbar.get.players.some", (Object[])new Object[]{class063922.W(), class063922.s().size(), class00390.y((Collection)class063922.s(), class08036::method_5476)}), true);
        }
        return class063922.s().size();
    }

    private static int y(class07701 class077012, class06392 class063922) {
        class077012.N(() -> class00392.N((String)"commands.bossbar.get.max", (Object[])new Object[]{class063922.W(), class063922.E()}), true);
        return class063922.E();
    }

    private static int y(class07701 class077012, class06392 class063922, int n) throws CommandSyntaxException {
        if (class063922.E() == n) {
            throw Z.create();
        }
        class063922.y(n);
        class077012.N(() -> class00392.N((String)"commands.bossbar.set.max.success", (Object[])new Object[]{class063922.W(), n}), true);
        return n;
    }

    private static int N(class07701 class077012, class06392 class063922) {
        class077012.N(() -> class00392.N((String)"commands.bossbar.get.value", (Object[])new Object[]{class063922.W(), class063922.U()}), true);
        return class063922.U();
    }

    private static int N(class07701 class077012, class06392 class063922, class06702 class067022) throws CommandSyntaxException {
        if (class063922.i().equals((Object)class067022)) {
            throw M.create();
        }
        class063922.N(class067022);
        class077012.N(() -> class00392.N((String)"commands.bossbar.set.style.success", (Object[])new Object[]{class063922.W()}), true);
        return 0;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"bossbar").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"add").then(class07686.N((String)"id", (ArgumentType)class07778.N()).then(class07686.N((String)"name", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id"), class07698.y((CommandContext)commandContext, (String)"name"))))))).then(class07686.y((String)"remove").then(class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(N).executes(commandContext -> class06426.i((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext)))))).then(class07686.y((String)"list").executes(commandContext -> class06426.N((class07701)commandContext.getSource())))).then(class07686.y((String)"set").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(N).then(class07686.y((String)"name").then(class07686.N((String)"name", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class07698.y((CommandContext)commandContext, (String)"name")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"color").then(class07686.y((String)"pink").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06685.field_5788)))).then(class07686.y((String)"blue").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06685.field_5780)))).then(class07686.y((String)"red").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06685.field_5784)))).then(class07686.y((String)"green").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06685.field_5785)))).then(class07686.y((String)"yellow").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06685.field_5782)))).then(class07686.y((String)"purple").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06685.field_5783)))).then(class07686.y((String)"white").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06685.field_5786))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"style").then(class07686.y((String)"progress").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06702.field_5795)))).then(class07686.y((String)"notched_6").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06702.field_5796)))).then(class07686.y((String)"notched_10").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06702.field_5791)))).then(class07686.y((String)"notched_12").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06702.field_5793)))).then(class07686.y((String)"notched_20").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class06702.field_5790))))).then(class07686.y((String)"value").then(class07686.N((String)"value", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"value")))))).then(class07686.y((String)"max").then(class07686.N((String)"max", (ArgumentType)IntegerArgumentType.integer((int)1)).executes(commandContext -> class06426.y((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"max")))))).then(class07686.y((String)"visible").then(class07686.N((String)"visible", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), BoolArgumentType.getBool((CommandContext)commandContext, (String)"visible")))))).then(((LiteralArgumentBuilder)class07686.y((String)"players").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), Collections.emptyList()))).then(class07686.N((String)"targets", (ArgumentType)class07680.u()).executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext), class07680.u((CommandContext)commandContext, (String)"targets")))))))).then(class07686.y((String)"get").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(N).then(class07686.y((String)"value").executes(commandContext -> class06426.N((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext))))).then(class07686.y((String)"max").executes(commandContext -> class06426.y((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext))))).then(class07686.y((String)"visible").executes(commandContext -> class06426.L((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext))))).then(class07686.y((String)"players").executes(commandContext -> class06426.u((class07701)commandContext.getSource(), class06426.N((CommandContext<class07701>)commandContext)))))));
    }

    private static int N(class07701 class077012, class06392 class063922, class00392 class003922) throws CommandSyntaxException {
        class05216 class052162 = class00390.N((class07701)class077012, (class00392)class003922, null, (int)0);
        if (class063922.y().equals((Object)class052162)) {
            throw i.create();
        }
        class063922.N((class00392)class052162);
        class077012.N(() -> class00392.N((String)"commands.bossbar.set.name.success", (Object[])new Object[]{class063922.W()}), true);
        return 0;
    }

    private static int N(class07701 class077012, class06392 class063922, Collection<class04770> collection) throws CommandSyntaxException {
        if (!class063922.N(collection)) {
            throw u.create();
        }
        if (class063922.s().isEmpty()) {
            class077012.N(() -> class00392.N((String)"commands.bossbar.set.players.success.none", (Object[])new Object[]{class063922.W()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.bossbar.set.players.success.some", (Object[])new Object[]{class063922.W(), collection.size(), class00390.y((Collection)collection, class08036::method_5476)}), true);
        }
        return class063922.s().size();
    }

    private static int N(class07701 class077012) {
        Collection<class06392> var1 = class077012.W().yU().y();
        if (var1.isEmpty()) {
            class077012.N(() -> class00392.L((String)"commands.bossbar.list.bars.none"), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.bossbar.list.bars.some", (Object[])new Object[]{var1.size(), class00390.y((Collection)var1, class06392::W)}), false);
        }
        return var1.size();
    }

    private static int N(class07701 class077012, class01894 class018942, class00392 class003922) throws CommandSyntaxException {
        class06398 class063982 = class077012.W().yU();
        if (class063982.N(class018942) != null) {
            throw y.create((Object)class018942.toString());
        }
        class06392 class063922 = class063982.N(class018942, (class00392)class00390.N((class07701)class077012, (class00392)class003922, null, (int)0));
        class077012.N(() -> class00392.N((String)"commands.bossbar.create.success", (Object[])new Object[]{class063922.W()}), true);
        return class063982.y().size();
    }

    public static class06392 N(CommandContext<class07701> commandContext) throws CommandSyntaxException {
        class01894 class018942 = class07778.N(commandContext, (String)"id");
        class06392 class063922 = ((class07701)commandContext.getSource()).W().yU().N(class018942);
        if (class063922 == null) {
            throw L.create((Object)class018942.toString());
        }
        return class063922;
    }

    private static int N(class07701 class077012, class06392 class063922, boolean bl) throws CommandSyntaxException {
        if (class063922.P() == bl) {
            if (bl) {
                throw U.create();
            }
            throw z.create();
        }
        class063922.u(bl);
        if (bl) {
            class077012.N(() -> class00392.N((String)"commands.bossbar.set.visible.success.visible", (Object[])new Object[]{class063922.W()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.bossbar.set.visible.success.hidden", (Object[])new Object[]{class063922.W()}), true);
        }
        return 0;
    }

    private static int N(class07701 class077012, class06392 class063922, int n) throws CommandSyntaxException {
        if (class063922.U() == n) {
            throw B.create();
        }
        class063922.N(n);
        class077012.N(() -> class00392.N((String)"commands.bossbar.set.value.success", (Object[])new Object[]{class063922.W(), n}), true);
        return n;
    }

    private static int N(class07701 class077012, class06392 class063922, class06685 class066852) throws CommandSyntaxException {
        if (class063922.u().equals((Object)class066852)) {
            throw R.create();
        }
        class063922.N(class066852);
        class077012.N(() -> class00392.N((String)"commands.bossbar.set.color.success", (Object[])new Object[]{class063922.W()}), true);
        return 0;
    }
}

