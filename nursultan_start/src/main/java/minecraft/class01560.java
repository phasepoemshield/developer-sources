/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class00392
 *  minecraft.class00893
 *  minecraft.class00894
 *  minecraft.class00905
 *  minecraft.class01296
 *  minecraft.class01894
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class07321
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00893;
import minecraft.class00894;
import minecraft.class00905;
import minecraft.class01296;
import minecraft.class01894;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class07321;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class01560 {
    private static final int N = 256;
    private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.forceload.toobig", (Object[])new Object[]{object, object2}));
    private static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.forceload.query.failure", (Object[])new Object[]{object, object2}));
    private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.forceload.added.failure"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.forceload.removed.failure"));

    private static int y(class07701 class077012) {
        class04782 class047822 = class077012.R();
        class05946 var2 = class047822.method_27983();
        class047822.method_17984().forEach(l -> class047822.method_17988(class07321.N((long)l), class07321.y((long)l), false));
        class077012.N(() -> class00392.N((String)"commands.forceload.removed.all", (Object[])new Object[]{class00392.N((class01894)var2.N())}), true);
        return 0;
    }

    private static int N(class07701 class077012, class00893 class008932) throws CommandSyntaxException {
        class07321 class073212 = class008932.N();
        class04782 class047822 = class077012.R();
        class05946 var4 = class047822.method_27983();
        if (class047822.method_17984().contains(class073212.y())) {
            class077012.N(() -> class00392.N((String)"commands.forceload.query.success", (Object[])new Object[]{class00392.N((class07321)class073212), class00392.N((class01894)var4.N())}), false);
            return 1;
        }
        throw L.create((Object)class073212, (Object)var4.N());
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"forceload").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"add").then(((RequiredArgumentBuilder)class07686.N((String)"from", (ArgumentType)class00905.N()).executes(commandContext -> class01560.N((class07701)commandContext.getSource(), class00905.N((CommandContext)commandContext, (String)"from"), class00905.N((CommandContext)commandContext, (String)"from"), true))).then(class07686.N((String)"to", (ArgumentType)class00905.N()).executes(commandContext -> class01560.N((class07701)commandContext.getSource(), class00905.N((CommandContext)commandContext, (String)"from"), class00905.N((CommandContext)commandContext, (String)"to"), true)))))).then(((LiteralArgumentBuilder)class07686.y((String)"remove").then(((RequiredArgumentBuilder)class07686.N((String)"from", (ArgumentType)class00905.N()).executes(commandContext -> class01560.N((class07701)commandContext.getSource(), class00905.N((CommandContext)commandContext, (String)"from"), class00905.N((CommandContext)commandContext, (String)"from"), false))).then(class07686.N((String)"to", (ArgumentType)class00905.N()).executes(commandContext -> class01560.N((class07701)commandContext.getSource(), class00905.N((CommandContext)commandContext, (String)"from"), class00905.N((CommandContext)commandContext, (String)"to"), false))))).then(class07686.y((String)"all").executes(commandContext -> class01560.y((class07701)commandContext.getSource()))))).then(((LiteralArgumentBuilder)class07686.y((String)"query").executes(commandContext -> class01560.N((class07701)commandContext.getSource()))).then(class07686.N((String)"pos", (ArgumentType)class00905.N()).executes(commandContext -> class01560.N((class07701)commandContext.getSource(), class00905.N((CommandContext)commandContext, (String)"pos"))))));
    }

    private static int N(class07701 class077012, class00893 class008932, class00893 class008933, boolean bl) throws CommandSyntaxException {
        int n;
        int n2;
        int n3 = Math.min(class008932.L(), class008933.L());
        int n4 = Math.min(class008932.u(), class008933.u());
        int n5 = Math.max(class008932.L(), class008933.L());
        int n6 = Math.max(class008932.u(), class008933.u());
        if (n3 < -30000000 || n4 < -30000000 || n5 >= 30000000 || n6 >= 30000000) {
            throw class00894.y.create();
        }
        int n7 = class01296.N((int)n3);
        int n8 = class01296.N((int)n4);
        int n9 = class01296.N((int)n5);
        long l = ((long)(n9 - n7) + 1L) * ((long)((n2 = class01296.N((int)n6)) - n8) + 1L);
        if (l > 256L) {
            throw y.create((Object)256, (Object)l);
        }
        class04782 class047822 = class077012.R();
        class05946 var15 = class047822.method_27983();
        class07321 class073212 = null;
        int n10 = 0;
        for (int i = n7; i <= n9; ++i) {
            for (n = n8; n <= n2; ++n) {
                boolean bl2 = class047822.method_17988(i, n, bl);
                if (!bl2) continue;
                ++n10;
                if (class073212 != null) continue;
                class073212 = new class07321(i, n);
            }
        }
        class07321 class073213 = class073212;
        n = n10;
        if (n == 0) {
            throw (bl ? u : i).create();
        }
        if (n == 1) {
            class077012.N(() -> class00392.N((String)("commands.forceload." + (bl ? "added" : "removed") + ".single"), (Object[])new Object[]{class00392.N((class07321)class073213), class00392.N((class01894)var15.N())}), true);
        } else {
            class07321 class073214 = new class07321(n7, n8);
            class07321 class073215 = new class07321(n9, n2);
            class077012.N(() -> class00392.N((String)("commands.forceload." + (bl ? "added" : "removed") + ".multiple"), (Object[])new Object[]{n, class00392.N((class01894)var15.N()), class00392.N((class07321)class073214), class00392.N((class07321)class073215)}), true);
        }
        return n;
    }

    private static int N(class07701 class077012) {
        class04782 class047822 = class077012.R();
        class05946 var2 = class047822.method_27983();
        LongSet longSet = class047822.method_17984();
        int n = longSet.size();
        if (n > 0) {
            String string = Joiner.on((String)", ").join(longSet.stream().sorted().map(class07321::new).map(class07321::toString).iterator());
            if (n == 1) {
                class077012.N(() -> class00392.N((String)"commands.forceload.list.single", (Object[])new Object[]{class00392.N((class01894)var2.N()), string}), false);
            } else {
                class077012.N(() -> class00392.N((String)"commands.forceload.list.multiple", (Object[])new Object[]{n, class00392.N((class01894)var2.N()), string}), false);
            }
        } else {
            class077012.y((class00392)class00392.N((String)"commands.forceload.added.none", (Object[])new Object[]{class00392.N((class01894)var2.N())}));
        }
        return n;
    }
}

