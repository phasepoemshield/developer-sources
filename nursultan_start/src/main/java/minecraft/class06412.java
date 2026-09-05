/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class03556
 *  minecraft.class03784
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class05946
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07438
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class03556;
import minecraft.class03784;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class05946;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07438;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class06412 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.effect.give.failed"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.effect.clear.everything.failed"));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.effect.clear.specific.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"effect").requires((Predicate)class07686.N((class08164)class07686.u))).then(((LiteralArgumentBuilder)class07686.y((String)"clear").executes(commandContext -> class06412.N((class07701)commandContext.getSource(), (Collection<? extends class07049>)ImmutableList.of((Object)((class07701)commandContext.getSource()).B())))).then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.y()).executes(commandContext -> class06412.N((class07701)commandContext.getSource(), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets")))).then(class07686.N((String)"effect", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.Ni)).executes(commandContext -> class06412.N((class07701)commandContext.getSource(), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07084>)class03784.R((CommandContext)commandContext, (String)"effect"))))))).then(class07686.y((String)"give").then(class07686.N((String)"targets", (ArgumentType)class07680.y()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"effect", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.Ni)).executes(commandContext -> class06412.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07084>)class03784.R((CommandContext)commandContext, (String)"effect"), null, 0, true))).then(((RequiredArgumentBuilder)class07686.N((String)"seconds", (ArgumentType)IntegerArgumentType.integer((int)1, (int)1000000)).executes(commandContext -> class06412.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07084>)class03784.R((CommandContext)commandContext, (String)"effect"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seconds"), 0, true))).then(((RequiredArgumentBuilder)class07686.N((String)"amplifier", (ArgumentType)IntegerArgumentType.integer((int)0, (int)255)).executes(commandContext -> class06412.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07084>)class03784.R((CommandContext)commandContext, (String)"effect"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seconds"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amplifier"), true))).then(class07686.N((String)"hideParticles", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class06412.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07084>)class03784.R((CommandContext)commandContext, (String)"effect"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seconds"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amplifier"), !BoolArgumentType.getBool((CommandContext)commandContext, (String)"hideParticles"))))))).then(((LiteralArgumentBuilder)class07686.y((String)"infinite").executes(commandContext -> class06412.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07084>)class03784.R((CommandContext)commandContext, (String)"effect"), -1, 0, true))).then(((RequiredArgumentBuilder)class07686.N((String)"amplifier", (ArgumentType)IntegerArgumentType.integer((int)0, (int)255)).executes(commandContext -> class06412.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07084>)class03784.R((CommandContext)commandContext, (String)"effect"), -1, IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amplifier"), true))).then(class07686.N((String)"hideParticles", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class06412.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), (class03556<class07084>)class03784.R((CommandContext)commandContext, (String)"effect"), -1, IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amplifier"), !BoolArgumentType.getBool((CommandContext)commandContext, (String)"hideParticles"))))))))));
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection, class03556<class07084> class035562) throws CommandSyntaxException {
        class07084 class070842 = (class07084)class035562.N();
        int n = 0;
        for (class07049 class070492 : collection) {
            if (!(class070492 instanceof class07438) || !((class07438)class070492).method_6016(class035562)) continue;
            ++n;
        }
        if (n == 0) {
            throw L.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.effect.clear.specific.success.single", (Object[])new Object[]{class070842.M(), ((class07049)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.effect.clear.specific.success.multiple", (Object[])new Object[]{class070842.M(), collection.size()}), true);
        }
        return n;
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection) throws CommandSyntaxException {
        int n = 0;
        for (class07049 class070492 : collection) {
            if (!(class070492 instanceof class07438) || !((class07438)class070492).method_6012()) continue;
            ++n;
        }
        if (n == 0) {
            throw y.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.effect.clear.everything.success.single", (Object[])new Object[]{((class07049)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.effect.clear.everything.success.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return n;
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection, class03556<class07084> class035562, @Nullable Integer n, int n2, boolean bl) throws CommandSyntaxException {
        class07084 class070842 = (class07084)class035562.N();
        int n3 = 0;
        int n4 = n != null ? (class070842.N() ? n : (n == -1 ? -1 : n * 20)) : (class070842.N() ? 1 : 600);
        for (class07049 class070492 : collection) {
            class07055 class070552;
            if (!(class070492 instanceof class07438) || !((class07438)class070492).method_37222(class070552 = new class07055(class035562, n4, n2, false, bl), class077012.M())) continue;
            ++n3;
        }
        if (n3 == 0) {
            throw N.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.effect.give.success.single", (Object[])new Object[]{class070842.M(), ((class07049)collection.iterator().next()).method_5476(), n4 / 20}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.effect.give.success.multiple", (Object[])new Object[]{class070842.M(), collection.size(), n4 / 20}), true);
        }
        return n3;
    }
}

