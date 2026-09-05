/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00877
 *  minecraft.class00878
 *  minecraft.class00894
 *  minecraft.class00903
 *  minecraft.class04348
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05487
 *  minecraft.class06646
 *  minecraft.class07209
 *  minecraft.class07305
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  minecraft.class08608
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00877;
import minecraft.class00878;
import minecraft.class00894;
import minecraft.class00903;
import minecraft.class01548;
import minecraft.class01555;
import minecraft.class01571;
import minecraft.class04348;
import minecraft.class04782;
import minecraft.class05163;
import minecraft.class05487;
import minecraft.class06646;
import minecraft.class07209;
import minecraft.class07305;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import minecraft.class08608;
import org.jspecify.annotations.Nullable;

public class class01553 {
    private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.fill.toobig", (Object[])new Object[]{object, object2}));
    static final class00903 N = new class00903(class00869.N.W(), Collections.emptySet(), null);
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.fill.failed"));

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"fill").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"from", (ArgumentType)class00894.N()).then(class07686.N((String)"to", (ArgumentType)class00894.N()).then(class01553.N(class043482, class07686.N((String)"block", (ArgumentType)class00877.N((class04348)class043482)), (class08608<CommandContext<class07701>, class07209>)((class08608)commandContext -> class00894.N((CommandContext)commandContext, (String)"from")), (class08608<CommandContext<class07701>, class07209>)((class08608)commandContext -> class00894.N((CommandContext)commandContext, (String)"to")), (class08608<CommandContext<class07701>, class00903>)((class08608)commandContext -> class00877.N((CommandContext)commandContext, (String)"block")), commandContext -> null).then(((LiteralArgumentBuilder)class07686.y((String)"replace").executes(commandContext -> class01553.N((class07701)commandContext.getSource(), class05163.N((class00753)class00894.N((CommandContext)commandContext, (String)"from"), (class00753)class00894.N((CommandContext)commandContext, (String)"to")), class00877.N((CommandContext)commandContext, (String)"block"), class01548.field_13655, null, false))).then(class01553.N(class043482, class07686.N((String)"filter", (ArgumentType)class00878.N((class04348)class043482)), (class08608<CommandContext<class07701>, class07209>)((class08608)commandContext -> class00894.N((CommandContext)commandContext, (String)"from")), (class08608<CommandContext<class07701>, class07209>)((class08608)commandContext -> class00894.N((CommandContext)commandContext, (String)"to")), (class08608<CommandContext<class07701>, class00903>)((class08608)commandContext -> class00877.N((CommandContext)commandContext, (String)"block")), commandContext -> class00878.N((CommandContext)commandContext, (String)"filter")))).then(class07686.y((String)"keep").executes(commandContext -> class01553.N((class07701)commandContext.getSource(), class05163.N((class00753)class00894.N((CommandContext)commandContext, (String)"from"), (class00753)class00894.N((CommandContext)commandContext, (String)"to")), class00877.N((CommandContext)commandContext, (String)"block"), class01548.field_13655, (class06646 class066462) -> class066462.L().R(class066462.u()), false)))))));
    }

    private static ArgumentBuilder<class07701, ?> N(class04348 class043482, ArgumentBuilder<class07701, ?> argumentBuilder, class08608<CommandContext<class07701>, class07209> class086082, class08608<CommandContext<class07701>, class07209> class086083, class08608<CommandContext<class07701>, class00903> class086084, class01555<CommandContext<class07701>, Predicate<class06646>> class015552) {
        return argumentBuilder.executes(commandContext -> class01553.N((class07701)commandContext.getSource(), class05163.N((class00753)((class00753)class086082.apply((Object)commandContext)), (class00753)((class00753)class086083.apply((Object)commandContext))), (class00903)class086084.apply((Object)commandContext), class01548.field_13655, (Predicate)class015552.apply(commandContext), false)).then(class07686.y((String)"outline").executes(commandContext -> class01553.N((class07701)commandContext.getSource(), class05163.N((class00753)((class00753)class086082.apply((Object)commandContext)), (class00753)((class00753)class086083.apply((Object)commandContext))), (class00903)class086084.apply((Object)commandContext), class01548.field_13652, (Predicate)class015552.apply(commandContext), false))).then(class07686.y((String)"hollow").executes(commandContext -> class01553.N((class07701)commandContext.getSource(), class05163.N((class00753)((class00753)class086082.apply((Object)commandContext)), (class00753)((class00753)class086083.apply((Object)commandContext))), (class00903)class086084.apply((Object)commandContext), class01548.field_13656, (Predicate)class015552.apply(commandContext), false))).then(class07686.y((String)"destroy").executes(commandContext -> class01553.N((class07701)commandContext.getSource(), class05163.N((class00753)((class00753)class086082.apply((Object)commandContext)), (class00753)((class00753)class086083.apply((Object)commandContext))), (class00903)class086084.apply((Object)commandContext), class01548.field_13651, (Predicate)class015552.apply(commandContext), false))).then(class07686.y((String)"strict").executes(commandContext -> class01553.N((class07701)commandContext.getSource(), class05163.N((class00753)((class00753)class086082.apply((Object)commandContext)), (class00753)((class00753)class086083.apply((Object)commandContext))), (class00903)class086084.apply((Object)commandContext), class01548.field_13655, (Predicate)class015552.apply(commandContext), true)));
    }

    private static int N(class07701 class077012, class05163 class051632, class00903 class009032, class01548 class015482, @Nullable Predicate<class06646> predicate, boolean bl) throws CommandSyntaxException {
        int n;
        int n2 = class051632.u() * class051632.i() * class051632.R();
        if (n2 > (n = ((Integer)class077012.R().method_64395().N(class07305.l)).intValue())) {
            throw y.create((Object)n, (Object)n2);
        }
        ArrayList arrayList = Lists.newArrayList();
        class04782 class047822 = class077012.R();
        if (class047822.method_27982()) {
            throw L.create();
        }
        int n3 = 0;
        for (Object object : class07209.method_10094((int)class051632.B(), (int)class051632.Z(), (int)class051632.z(), (int)class051632.U(), (int)class051632.E(), (int)class051632.W())) {
            class00903 class009033;
            if (predicate != null && !predicate.test(new class06646((class05487)class047822, (class07209)object, true))) continue;
            class00500 class005002 = class047822.method_8320((class07209)object);
            boolean bl2 = false;
            if (class015482.field_55587.affect(class047822, (class07209)object)) {
                bl2 = true;
            }
            if ((class009033 = class015482.field_13654.filter(class051632, (class07209)object, class009032, class047822)) == null) {
                if (!bl2) continue;
                ++n3;
                continue;
            }
            if (!class009033.N(class047822, (class07209)object, 2 | (bl ? 816 : 256))) {
                if (!bl2) continue;
                ++n3;
                continue;
            }
            if (!bl) {
                arrayList.add(new class01571(object.method_10062(), class005002));
            }
            ++n3;
        }
        for (Object object : arrayList) {
            class047822.method_70635(((class01571)((Object)object)).N(), ((class01571)((Object)object)).y());
        }
        if (n3 == 0) {
            throw L.create();
        }
        int n4 = n3;
        class077012.N(() -> class00392.N((String)"commands.fill.success", (Object[])new Object[]{n4}), true);
        return n3;
    }
}

