/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06793
 *  minecraft.class07482
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06793;
import minecraft.class07482;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06424 {
    private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"clear.failed.single", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"clear.failed.multiple", (Object[])new Object[]{object}));

    private static int N(class07701 class077012, Collection<class04770> collection, Predicate<class06584> predicate, int n) throws CommandSyntaxException {
        int n2 = 0;
        for (class04770 class047702 : collection) {
            n2 += class047702.method_31548().N(predicate, n, (class06695)class047702.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.T());
            ((class07482)class047702.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
            class047702.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y((class06695)class047702.method_31548());
        }
        if (n2 == 0) {
            if (collection.size() == 1) {
                throw N.create((Object)collection.iterator().next().method_5477());
            }
            throw y.create((Object)collection.size());
        }
        int n3 = n2;
        if (n == 0) {
            if (collection.size() == 1) {
                class077012.N(() -> class00392.N((String)"commands.clear.test.single", (Object[])new Object[]{n3, ((class04770)collection.iterator().next()).method_5476()}), true);
            } else {
                class077012.N(() -> class00392.N((String)"commands.clear.test.multiple", (Object[])new Object[]{n3, collection.size()}), true);
            }
        } else if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.clear.success.single", (Object[])new Object[]{n3, ((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.clear.success.multiple", (Object[])new Object[]{n3, collection.size()}), true);
        }
        return n2;
    }

    private static int N(class07701 class077012, Collection<class04770> collection, Predicate<class06584> predicate) throws CommandSyntaxException {
        return class06424.N(class077012, collection, predicate, -1);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"clear").requires((Predicate)class07686.N((class08164)class07686.u))).executes(commandContext -> class06424.N((class07701)commandContext.getSource(), Collections.singleton(((class07701)commandContext.getSource()).Z()), class065842 -> true))).then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).executes(commandContext -> class06424.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), class065842 -> true))).then(((RequiredArgumentBuilder)class07686.N((String)"item", (ArgumentType)class06793.N((class04348)class043482)).executes(commandContext -> class06424.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), (Predicate<class06584>)class06793.N((CommandContext)commandContext, (String)"item")))).then(class07686.N((String)"maxCount", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class06424.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), (Predicate<class06584>)class06793.N((CommandContext)commandContext, (String)"item"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"maxCount")))))));
    }
}

