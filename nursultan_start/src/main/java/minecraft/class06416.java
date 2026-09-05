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
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00878
 *  minecraft.class00894
 *  minecraft.class01929
 *  minecraft.class04348
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05487
 *  minecraft.class06646
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07305
 *  minecraft.class07678
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  minecraft.class08303
 *  minecraft.class08308
 *  minecraft.class08329
 *  minecraft.class08608
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00878;
import minecraft.class00894;
import minecraft.class01929;
import minecraft.class04348;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04782;
import minecraft.class05163;
import minecraft.class05487;
import minecraft.class06404;
import minecraft.class06409;
import minecraft.class06415;
import minecraft.class06427;
import minecraft.class06646;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07305;
import minecraft.class07678;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import minecraft.class08303;
import minecraft.class08308;
import minecraft.class08329;
import minecraft.class08608;
import org.slf4j.Logger;

public class class06416 {
    private static final Logger y = LogUtils.getLogger();
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.clone.overlap"));
    private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.clone.toobig", (Object[])new Object[]{object, object2}));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.clone.failed"));
    public static final Predicate<class06646> N = class066462 -> !class066462.N().P();

    private static class06415 N(CommandContext<class07701> commandContext, class04782 class047822, String string) throws CommandSyntaxException {
        class07209 class072092 = class00894.N(commandContext, (class04782)class047822, (String)string);
        return new class06415(class047822, class072092);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"clone").requires((Predicate)class07686.N((class08164)class07686.u))).then(class06416.N(class043482, (class08608<CommandContext<class07701>, class04782>)((class08608)commandContext -> ((class07701)commandContext.getSource()).R())))).then(class07686.y((String)"from").then(class07686.N((String)"sourceDimension", (ArgumentType)class07678.N()).then(class06416.N(class043482, (class08608<CommandContext<class07701>, class04782>)((class08608)commandContext -> class07678.N((CommandContext)commandContext, (String)"sourceDimension")))))));
    }

    private static ArgumentBuilder<class07701, ?> N(class04348 class043482, class08608<CommandContext<class07701>, class04782> class086082) {
        return class07686.N((String)"begin", (ArgumentType)class00894.N()).then(((RequiredArgumentBuilder)class07686.N((String)"end", (ArgumentType)class00894.N()).then(class06416.N(class043482, class086082, (class08608<CommandContext<class07701>, class04782>)((class08608)commandContext -> ((class07701)commandContext.getSource()).R())))).then(class07686.y((String)"to").then(class07686.N((String)"targetDimension", (ArgumentType)class07678.N()).then(class06416.N(class043482, class086082, (class08608<CommandContext<class07701>, class04782>)((class08608)commandContext -> class07678.N((CommandContext)commandContext, (String)"targetDimension")))))));
    }

    private static int N(class07701 class077012, class06415 class064152, class06415 class064153, class06415 class064154, Predicate<class06646> predicate, class06427 class064272, boolean bl) throws CommandSyntaxException {
        int n;
        class07209 class072092 = class064152.y();
        class07209 class072093 = class064153.y();
        class05163 class051632 = class05163.N((class00753)class072092, (class00753)class072093);
        class07209 class072094 = class064154.y();
        class07209 class072095 = class072094.method_10081(class051632.L());
        class05163 class051633 = class05163.N((class00753)class072094, (class00753)class072095);
        class04782 class047822 = class064152.N();
        class04782 class047823 = class064154.N();
        if (!class064272.N() && class047822 == class047823 && class051633.N(class051632)) {
            throw L.create();
        }
        int n2 = class051632.u() * class051632.i() * class051632.R();
        if (n2 > (n = ((Integer)class077012.R().method_64395().N(class07305.l)).intValue())) {
            throw u.create((Object)n, (Object)n2);
        }
        if (!class047822.N(class072092, class072093) || !class047823.N(class072094, class072095)) {
            throw class00894.N.create();
        }
        if (class047823.method_27982()) {
            throw i.create();
        }
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        LinkedList linkedList = Lists.newLinkedList();
        int n3 = 0;
        try (class04495 class044952 = new class04495(y);){
            class06646 class066462;
            int n4;
            int n5;
            class07209 class072096 = new class07209(class051633.B() - class051632.B(), class051633.Z() - class051632.Z(), class051633.z() - class051632.z());
            for (n5 = class051632.z(); n5 <= class051632.W(); ++n5) {
                for (n4 = class051632.Z(); n4 <= class051632.E(); ++n4) {
                    for (int i = class051632.B(); i <= class051632.U(); ++i) {
                        Object object = new class07209(i, n4, n5);
                        Object object2 = object.method_10081((class00753)class072096);
                        class066462 = new class06646((class05487)class047822, (class07209)object, false);
                        class00500 class005002 = class066462.N();
                        if (!predicate.test(class066462)) continue;
                        class00394 class003942 = class047822.method_8321((class07209)object);
                        if (class003942 != null) {
                            class08303 class083032 = class08303.N((class04490)class044952.N_46(class003942.J()), (class01929)class077012.t());
                            class003942.R((class08329)class083032);
                            class06404 class064042 = new class06404(class083032.y(), class003942.I());
                            arrayList2.add(new class06409((class07209)object2, class005002, class064042, class047823.method_8320(object2)));
                            linkedList.addLast(object);
                            continue;
                        }
                        if (class005002.t() || class005002.W((class07290)class047822, (class07209)object)) {
                            arrayList.add(new class06409((class07209)object2, class005002, null, class047823.method_8320(object2)));
                            linkedList.addLast(object);
                            continue;
                        }
                        arrayList3.add(new class06409((class07209)object2, class005002, null, class047823.method_8320(object2)));
                        linkedList.addFirst(object);
                    }
                }
            }
            n5 = 2 | (bl ? 816 : 0);
            if (class064272 == class06427.field_13500) {
                for (class07209 class072097 : linkedList) {
                    class047822.method_8652(class072097, class00869.ZX.W(), n5 | 0x330);
                }
                n4 = bl ? n5 : 3;
                for (Object object : linkedList) {
                    class047822.method_8652((class07209)object, class00869.N.W(), n4);
                }
            }
            ArrayList arrayList4 = Lists.newArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList3);
            List list = Lists.reverse((List)arrayList4);
            for (Object object2 : list) {
                class047823.method_8652(object2.N(), class00869.ZX.W(), n5 | 0x330);
            }
            for (Object object2 : arrayList4) {
                if (!class047823.method_8652(object2.N(), object2.y(), n5)) continue;
                ++n3;
            }
            for (Object object2 : arrayList2) {
                class066462 = class047823.method_8321(object2.N());
                if (object2.L() != null && class066462 != null) {
                    class066462.L(class08308.N((class04490)class044952.N_46(class066462.J()), (class01929)class047823.method_30349(), (class07001)object2.L().N()));
                    class066462.N(object2.L().y());
                    class066462.method_5431();
                }
                class047823.method_8652(object2.N(), object2.y(), n5);
            }
            if (!bl) {
                for (Object object2 : list) {
                    class047823.method_70635(object2.N(), object2.u());
                }
            }
            class047823.method_14196().N(class047822.method_14196(), class051632, (class00753)class072096);
        }
        if (n3 == 0) {
            throw i.create();
        }
        int n6 = n3;
        class077012.N(() -> class00392.N((String)"commands.clone.success", (Object[])new Object[]{n6}), true);
        return n3;
    }

    private static ArgumentBuilder<class07701, ?> N(class04348 class043482, class08608<CommandContext<class07701>, class04782> class086082, class08608<CommandContext<class07701>, class04782> class086083) {
        class08608 class086084 = commandContext -> class06416.N((CommandContext<class07701>)commandContext, (class04782)class086082.apply(commandContext), "begin");
        class08608 class086085 = commandContext -> class06416.N((CommandContext<class07701>)commandContext, (class04782)class086082.apply(commandContext), "end");
        class08608 class086086 = commandContext -> class06416.N((CommandContext<class07701>)commandContext, (class04782)class086083.apply(commandContext), "destination");
        return class06416.N(class043482, (class08608<CommandContext<class07701>, class06415>)class086084, (class08608<CommandContext<class07701>, class06415>)class086085, (class08608<CommandContext<class07701>, class06415>)class086086, false, class07686.N((String)"destination", (ArgumentType)class00894.N())).then(class06416.N(class043482, (class08608<CommandContext<class07701>, class06415>)class086084, (class08608<CommandContext<class07701>, class06415>)class086085, (class08608<CommandContext<class07701>, class06415>)class086086, true, class07686.y((String)"strict")));
    }

    private static ArgumentBuilder<class07701, ?> N(class04348 class043482, class08608<CommandContext<class07701>, class06415> class086082, class08608<CommandContext<class07701>, class06415> class086083, class08608<CommandContext<class07701>, class06415> class086084, boolean bl, ArgumentBuilder<class07701, ?> argumentBuilder) {
        return argumentBuilder.executes(commandContext -> class06416.N((class07701)commandContext.getSource(), (class06415)((Object)((Object)class086082.apply((Object)commandContext))), (class06415)((Object)((Object)class086083.apply((Object)commandContext))), (class06415)((Object)((Object)class086084.apply((Object)commandContext))), class066462 -> true, class06427.field_13499, bl)).then(class06416.N(class086082, class086083, class086084, (class08608<CommandContext<class07701>, Predicate<class06646>>)((class08608)commandContext -> class066462 -> true), bl, class07686.y((String)"replace"))).then(class06416.N(class086082, class086083, class086084, (class08608<CommandContext<class07701>, Predicate<class06646>>)((class08608)commandContext -> N), bl, class07686.y((String)"masked"))).then(class07686.y((String)"filtered").then(class06416.N(class086082, class086083, class086084, (class08608<CommandContext<class07701>, Predicate<class06646>>)((class08608)commandContext -> class00878.N((CommandContext)commandContext, (String)"filter")), bl, class07686.N((String)"filter", (ArgumentType)class00878.N((class04348)class043482)))));
    }

    private static ArgumentBuilder<class07701, ?> N(class08608<CommandContext<class07701>, class06415> class086082, class08608<CommandContext<class07701>, class06415> class086083, class08608<CommandContext<class07701>, class06415> class086084, class08608<CommandContext<class07701>, Predicate<class06646>> class086085, boolean bl, ArgumentBuilder<class07701, ?> argumentBuilder) {
        return argumentBuilder.executes(commandContext -> class06416.N((class07701)commandContext.getSource(), (class06415)((Object)((Object)class086082.apply((Object)commandContext))), (class06415)((Object)((Object)class086083.apply((Object)commandContext))), (class06415)((Object)((Object)class086084.apply((Object)commandContext))), (Predicate)class086085.apply((Object)commandContext), class06427.field_13499, bl)).then(class07686.y((String)"force").executes(commandContext -> class06416.N((class07701)commandContext.getSource(), (class06415)((Object)((Object)class086082.apply((Object)commandContext))), (class06415)((Object)((Object)class086083.apply((Object)commandContext))), (class06415)((Object)((Object)class086084.apply((Object)commandContext))), (Predicate)class086085.apply((Object)commandContext), class06427.field_13497, bl))).then(class07686.y((String)"move").executes(commandContext -> class06416.N((class07701)commandContext.getSource(), (class06415)((Object)((Object)class086082.apply((Object)commandContext))), (class06415)((Object)((Object)class086083.apply((Object)commandContext))), (class06415)((Object)((Object)class086084.apply((Object)commandContext))), (Predicate)class086085.apply((Object)commandContext), class06427.field_13500, bl))).then(class07686.y((String)"normal").executes(commandContext -> class06416.N((class07701)commandContext.getSource(), (class06415)((Object)((Object)class086082.apply((Object)commandContext))), (class06415)((Object)((Object)class086083.apply((Object)commandContext))), (class06415)((Object)((Object)class086084.apply((Object)commandContext))), (Predicate)class086085.apply((Object)commandContext), class06427.field_13499, bl)));
    }
}

