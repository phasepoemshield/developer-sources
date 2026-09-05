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
 *  minecraft.class00381
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class02361
 *  minecraft.class02459
 *  minecraft.class02511
 *  minecraft.class02668
 *  minecraft.class02775
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class07049
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07698
 *  minecraft.class07701
 *  minecraft.class07798
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
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class02361;
import minecraft.class02459;
import minecraft.class02511;
import minecraft.class02668;
import minecraft.class02775;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class07049;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07698;
import minecraft.class07701;
import minecraft.class07798;
import minecraft.class08164;

public class class05626 {
    private static int y(class07701 class077012, Collection<class04770> collection) {
        class02361 class023612 = new class02361(true);
        Iterator<class04770> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field_13987.method_14364((class00381)class023612);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.title.reset.single", (Object[])new Object[]{((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.title.reset.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"title").requires((Predicate)class07686.N((class08164)class07686.u))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).then(class07686.y((String)"clear").executes(commandContext -> class05626.N((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"))))).then(class07686.y((String)"reset").executes(commandContext -> class05626.y((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"))))).then(class07686.y((String)"title").then(class07686.N((String)"title", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class05626.N((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"), class07698.N((CommandContext)commandContext, (String)"title"), "title", class02511::new))))).then(class07686.y((String)"subtitle").then(class07686.N((String)"title", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class05626.N((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"), class07698.N((CommandContext)commandContext, (String)"title"), "subtitle", class02775::new))))).then(class07686.y((String)"actionbar").then(class07686.N((String)"title", (ArgumentType)class07698.N((class04348)class043482)).executes(commandContext -> class05626.N((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"), class07698.N((CommandContext)commandContext, (String)"title"), "actionbar", class02459::new))))).then(class07686.y((String)"times").then(class07686.N((String)"fadeIn", (ArgumentType)class07798.N()).then(class07686.N((String)"stay", (ArgumentType)class07798.N()).then(class07686.N((String)"fadeOut", (ArgumentType)class07798.N()).executes(commandContext -> class05626.N((class07701)commandContext.getSource(), (Collection<class04770>)class07680.R((CommandContext)commandContext, (String)"targets"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"fadeIn"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"stay"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"fadeOut")))))))));
    }

    private static int N(class07701 class077012, Collection<class04770> collection, class00392 class003922, String string, Function<class00392, class00381<?>> function) throws CommandSyntaxException {
        for (class04770 class047702 : collection) {
            class047702.field_13987.method_14364(function.apply((class00392)class00390.N((class07701)class077012, (class00392)class003922, (class07049)class047702, (int)0)));
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)("commands.title.show." + string + ".single"), (Object[])new Object[]{((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)("commands.title.show." + string + ".multiple"), (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, Collection<class04770> collection, int n, int n2, int n3) {
        class02668 class026682 = new class02668(n, n2, n3);
        Iterator<class04770> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field_13987.method_14364((class00381)class026682);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.title.times.single", (Object[])new Object[]{((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.title.times.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, Collection<class04770> collection) {
        class02361 class023612 = new class02361(false);
        Iterator<class04770> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field_13987.method_14364((class00381)class023612);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.title.cleared.single", (Object[])new Object[]{((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.title.cleared.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }
}

