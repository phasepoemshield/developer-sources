/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00392
 *  minecraft.class04770
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01581;
import minecraft.class04770;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class01558 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.experience.set.points.invalid"));

    private static int y(class07701 class077012, Collection<? extends class04770> collection, int n, class01581 class015812) throws CommandSyntaxException {
        int n2 = 0;
        for (class04770 class047702 : collection) {
            if (!class015812.field_13642.test(class047702, n)) continue;
            ++n2;
        }
        if (n2 == 0) {
            throw N.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)("commands.experience.set." + class015812.field_13643 + ".success.single"), (Object[])new Object[]{n, ((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)("commands.experience.set." + class015812.field_13643 + ".success.multiple"), (Object[])new Object[]{n, collection.size()}), true);
        }
        return collection.size();
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"experience").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"add").then(class07686.N((String)"target", (ArgumentType)class07680.u()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"amount", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class01558.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"target"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), class01581.field_13644))).then(class07686.y((String)"points").executes(commandContext -> class01558.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"target"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), class01581.field_13644)))).then(class07686.y((String)"levels").executes(commandContext -> class01558.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"target"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), class01581.field_13641))))))).then(class07686.y((String)"set").then(class07686.N((String)"target", (ArgumentType)class07680.u()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"amount", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class01558.y((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"target"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), class01581.field_13644))).then(class07686.y((String)"points").executes(commandContext -> class01558.y((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"target"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), class01581.field_13644)))).then(class07686.y((String)"levels").executes(commandContext -> class01558.y((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"target"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount"), class01581.field_13641))))))).then(class07686.y((String)"query").then(((RequiredArgumentBuilder)class07686.N((String)"target", (ArgumentType)class07680.L()).then(class07686.y((String)"points").executes(commandContext -> class01558.N((class07701)commandContext.getSource(), class07680.i((CommandContext)commandContext, (String)"target"), class01581.field_13644)))).then(class07686.y((String)"levels").executes(commandContext -> class01558.N((class07701)commandContext.getSource(), class07680.i((CommandContext)commandContext, (String)"target"), class01581.field_13641))))));
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"xp").requires((Predicate)class07686.N((class08164)class07686.u))).redirect((CommandNode)literalCommandNode));
    }

    private static int N(class07701 class077012, Collection<? extends class04770> collection, int n, class01581 class015812) {
        for (class04770 class047702 : collection) {
            class015812.field_13639.accept(class047702, n);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)("commands.experience.add." + class015812.field_13643 + ".success.single"), (Object[])new Object[]{n, ((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)("commands.experience.add." + class015812.field_13643 + ".success.multiple"), (Object[])new Object[]{n, collection.size()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, class04770 class047702, class01581 class015812) {
        int n = class015812.field_13645.applyAsInt(class047702);
        class077012.N(() -> class00392.N((String)("commands.experience.query." + class015812.field_13643), (Object[])new Object[]{class047702.method_5476(), n}), false);
        return n;
    }
}

