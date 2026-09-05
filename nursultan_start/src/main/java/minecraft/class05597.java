/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class07049
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class07049;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class08164;

public class class05597 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.tag.add.failed"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.tag.remove.failed"));

    private static int y(class07701 class077012, Collection<? extends class07049> collection, String string) throws CommandSyntaxException {
        int n = 0;
        Iterator<? extends class07049> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method_5738(string)) continue;
            ++n;
        }
        if (n == 0) {
            throw y.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.tag.remove.success.single", (Object[])new Object[]{string, ((class07049)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.tag.remove.success.multiple", (Object[])new Object[]{string, collection.size()}), true);
        }
        return n;
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection) {
        HashSet hashSet = Sets.newHashSet();
        for (class07049 class070492 : collection) {
            hashSet.addAll(class070492.method_5752());
        }
        if (collection.size() == 1) {
            class07049 class070493 = collection.iterator().next();
            if (hashSet.isEmpty()) {
                class077012.N(() -> class00392.N((String)"commands.tag.list.single.empty", (Object[])new Object[]{class070493.method_5476()}), false);
            } else {
                class077012.N(() -> class00392.N((String)"commands.tag.list.single.success", (Object[])new Object[]{class070493.method_5476(), hashSet.size(), class00390.N((Collection)hashSet)}), false);
            }
        } else if (hashSet.isEmpty()) {
            class077012.N(() -> class00392.N((String)"commands.tag.list.multiple.empty", (Object[])new Object[]{collection.size()}), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.tag.list.multiple.success", (Object[])new Object[]{collection.size(), hashSet.size(), class00390.N((Collection)hashSet)}), false);
        }
        return hashSet.size();
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"tag").requires((Predicate)class07686.N((class08164)class07686.u))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.y()).then(class07686.y((String)"add").then(class07686.N((String)"name", (ArgumentType)StringArgumentType.word()).executes(commandContext -> class05597.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), StringArgumentType.getString((CommandContext)commandContext, (String)"name")))))).then(class07686.y((String)"remove").then(class07686.N((String)"name", (ArgumentType)StringArgumentType.word()).suggests((commandContext, suggestionsBuilder) -> class07689.y(class05597.N(class07680.y((CommandContext)commandContext, (String)"targets")), (SuggestionsBuilder)suggestionsBuilder)).executes(commandContext -> class05597.y((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets"), StringArgumentType.getString((CommandContext)commandContext, (String)"name")))))).then(class07686.y((String)"list").executes(commandContext -> class05597.N((class07701)commandContext.getSource(), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"))))));
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection, String string) throws CommandSyntaxException {
        int n = 0;
        Iterator<? extends class07049> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method_5780(string)) continue;
            ++n;
        }
        if (n == 0) {
            throw N.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.tag.add.success.single", (Object[])new Object[]{string, ((class07049)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.tag.add.success.multiple", (Object[])new Object[]{string, collection.size()}), true);
        }
        return n;
    }

    private static Collection<String> N(Collection<? extends class07049> collection) {
        HashSet hashSet = Sets.newHashSet();
        for (class07049 class070492 : collection) {
            hashSet.addAll(class070492.method_5752());
        }
        return hashSet;
    }
}

