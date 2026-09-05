/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00894
 *  minecraft.class02198
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class05908
 *  minecraft.class05927
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06770
 *  minecraft.class06843
 *  minecraft.class06925
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07482
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07787
 *  minecraft.class08122
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00894;
import minecraft.class02198;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class05908;
import minecraft.class05927;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06770;
import minecraft.class06843;
import minecraft.class06925;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07482;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07787;
import minecraft.class08122;
import minecraft.class08164;

public class class06352 {
    static final Dynamic3CommandExceptionType N = new Dynamic3CommandExceptionType((object, object2, object3) -> class00392.y((String)"commands.item.target.not_a_container", (Object[])new Object[]{object, object2, object3}));
    static final Dynamic3CommandExceptionType y = new Dynamic3CommandExceptionType((object, object2, object3) -> class00392.y((String)"commands.item.source.not_a_container", (Object[])new Object[]{object, object2, object3}));
    static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.item.target.no_such_slot", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.item.source.no_such_slot", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.item.target.no_changes", (Object[])new Object[]{object}));
    private static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.item.target.no_changed.known_item", (Object[])new Object[]{object, object2}));

    static class06695 N(class07701 class077012, class07209 class072092, Dynamic3CommandExceptionType dynamic3CommandExceptionType) throws CommandSyntaxException {
        class00394 class003942 = class077012.R().method_8321(class072092);
        if (class003942 instanceof class06695) {
            return (class06695)class003942;
        }
        throw dynamic3CommandExceptionType.create((Object)class072092.method_10263(), (Object)class072092.method_10264(), (Object)class072092.method_10260());
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection, int n, class03556<class08122> class035562) throws CommandSyntaxException {
        HashMap hashMap = Maps.newHashMapWithExpectedSize((int)collection.size());
        for (class07049 class070492 : collection) {
            class06584 class065842;
            class04803 class048032 = class070492.method_32318(n);
            if (class048032 == null || !class048032.N(class065842 = class06352.N(class077012, class035562, class048032.N().t()))) continue;
            hashMap.put(class070492, class065842);
            if (!(class070492 instanceof class04770)) continue;
            ((class07482)((class04770)class070492).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
        }
        if (hashMap.isEmpty()) {
            throw i.create((Object)n);
        }
        if (hashMap.size() == 1) {
            Map.Entry entry = hashMap.entrySet().iterator().next();
            class077012.N(() -> class00392.N((String)"commands.item.entity.set.success.single", (Object[])new Object[]{((class07049)entry.getKey()).method_5476(), ((class06584)entry.getValue()).V()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.item.entity.set.success.multiple", (Object[])new Object[]{hashMap.size()}), true);
        }
        return hashMap.size();
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"item").requires((Predicate)class07686.N((class08164)class07686.u))).then(((LiteralArgumentBuilder)class07686.y((String)"replace").then(class07686.y((String)"block").then(class07686.N((String)"pos", (ArgumentType)class00894.N()).then(((RequiredArgumentBuilder)class07686.N((String)"slot", (ArgumentType)class07787.N()).then(class07686.y((String)"with").then(((RequiredArgumentBuilder)class07686.N((String)"item", (ArgumentType)class06770.N((class04348)class043482)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class07787.N((CommandContext)commandContext, (String)"slot"), class06770.N((CommandContext)commandContext, (String)"item").N(1, false)))).then(class07686.N((String)"count", (ArgumentType)IntegerArgumentType.integer((int)1, (int)99)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class07787.N((CommandContext)commandContext, (String)"slot"), class06770.N((CommandContext)commandContext, (String)"item").N(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), true))))))).then(((LiteralArgumentBuilder)class07686.y((String)"from").then(class07686.y((String)"block").then(class07686.N((String)"source", (ArgumentType)class00894.N()).then(((RequiredArgumentBuilder)class07686.N((String)"sourceSlot", (ArgumentType)class07787.N()).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"source"), class07787.N((CommandContext)commandContext, (String)"sourceSlot"), class00894.N((CommandContext)commandContext, (String)"pos"), class07787.N((CommandContext)commandContext, (String)"slot")))).then(class07686.N((String)"modifier", (ArgumentType)class02198.y((class04348)class043482)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"source"), class07787.N((CommandContext)commandContext, (String)"sourceSlot"), class00894.N((CommandContext)commandContext, (String)"pos"), class07787.N((CommandContext)commandContext, (String)"slot"), (class03556<class08122>)class02198.y((CommandContext)commandContext, (String)"modifier")))))))).then(class07686.y((String)"entity").then(class07686.N((String)"source", (ArgumentType)class07680.N()).then(((RequiredArgumentBuilder)class07686.N((String)"sourceSlot", (ArgumentType)class07787.N()).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"source"), class07787.N((CommandContext)commandContext, (String)"sourceSlot"), class00894.N((CommandContext)commandContext, (String)"pos"), class07787.N((CommandContext)commandContext, (String)"slot")))).then(class07686.N((String)"modifier", (ArgumentType)class02198.y((class04348)class043482)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"source"), class07787.N((CommandContext)commandContext, (String)"sourceSlot"), class00894.N((CommandContext)commandContext, (String)"pos"), class07787.N((CommandContext)commandContext, (String)"slot"), (class03556<class08122>)class02198.y((CommandContext)commandContext, (String)"modifier")))))))))))).then(class07686.y((String)"entity").then(class07686.N((String)"targets", (ArgumentType)class07680.y()).then(((RequiredArgumentBuilder)class07686.N((String)"slot", (ArgumentType)class07787.N()).then(class07686.y((String)"with").then(((RequiredArgumentBuilder)class07686.N((String)"item", (ArgumentType)class06770.N((class04348)class043482)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"), class07787.N((CommandContext)commandContext, (String)"slot"), class06770.N((CommandContext)commandContext, (String)"item").N(1, false)))).then(class07686.N((String)"count", (ArgumentType)IntegerArgumentType.integer((int)1, (int)99)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"), class07787.N((CommandContext)commandContext, (String)"slot"), class06770.N((CommandContext)commandContext, (String)"item").N(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"count"), true))))))).then(((LiteralArgumentBuilder)class07686.y((String)"from").then(class07686.y((String)"block").then(class07686.N((String)"source", (ArgumentType)class00894.N()).then(((RequiredArgumentBuilder)class07686.N((String)"sourceSlot", (ArgumentType)class07787.N()).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"source"), class07787.N((CommandContext)commandContext, (String)"sourceSlot"), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"), class07787.N((CommandContext)commandContext, (String)"slot")))).then(class07686.N((String)"modifier", (ArgumentType)class02198.y((class04348)class043482)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"source"), class07787.N((CommandContext)commandContext, (String)"sourceSlot"), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"), class07787.N((CommandContext)commandContext, (String)"slot"), (class03556<class08122>)class02198.y((CommandContext)commandContext, (String)"modifier")))))))).then(class07686.y((String)"entity").then(class07686.N((String)"source", (ArgumentType)class07680.N()).then(((RequiredArgumentBuilder)class07686.N((String)"sourceSlot", (ArgumentType)class07787.N()).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"source"), class07787.N((CommandContext)commandContext, (String)"sourceSlot"), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"), class07787.N((CommandContext)commandContext, (String)"slot")))).then(class07686.N((String)"modifier", (ArgumentType)class02198.y((class04348)class043482)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class07680.N((CommandContext)commandContext, (String)"source"), class07787.N((CommandContext)commandContext, (String)"sourceSlot"), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"), class07787.N((CommandContext)commandContext, (String)"slot"), (class03556<class08122>)class02198.y((CommandContext)commandContext, (String)"modifier"))))))))))))).then(((LiteralArgumentBuilder)class07686.y((String)"modify").then(class07686.y((String)"block").then(class07686.N((String)"pos", (ArgumentType)class00894.N()).then(class07686.N((String)"slot", (ArgumentType)class07787.N()).then(class07686.N((String)"modifier", (ArgumentType)class02198.y((class04348)class043482)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class07787.N((CommandContext)commandContext, (String)"slot"), (class03556<class08122>)class02198.y((CommandContext)commandContext, (String)"modifier")))))))).then(class07686.y((String)"entity").then(class07686.N((String)"targets", (ArgumentType)class07680.y()).then(class07686.N((String)"slot", (ArgumentType)class07787.N()).then(class07686.N((String)"modifier", (ArgumentType)class02198.y((class04348)class043482)).executes(commandContext -> class06352.N((class07701)commandContext.getSource(), (Collection<? extends class07049>)class07680.y((CommandContext)commandContext, (String)"targets"), class07787.N((CommandContext)commandContext, (String)"slot"), (class03556<class08122>)class02198.y((CommandContext)commandContext, (String)"modifier")))))))));
    }

    private static int N(class07701 class077012, class07209 class072092, int n, class03556<class08122> class035562) throws CommandSyntaxException {
        class06695 class066952 = class06352.N(class077012, class072092, N);
        if (n < 0 || n >= class066952.method_5439()) {
            throw L.create((Object)n);
        }
        class06584 class065842 = class06352.N(class077012, class035562, class066952.method_5438(n));
        class066952.method_5447(n, class065842);
        class077012.N(() -> class00392.N((String)"commands.item.block.set.success", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class065842.V()}), true);
        return 1;
    }

    private static int N(class07701 class077012, class07209 class072092, int n, class07209 class072093, int n2, class03556<class08122> class035562) throws CommandSyntaxException {
        return class06352.N(class077012, class072093, n2, class06352.N(class077012, class035562, class06352.N(class077012, class072092, n)));
    }

    private static int N(class07701 class077012, class07049 class070492, int n, class07209 class072092, int n2) throws CommandSyntaxException {
        return class06352.N(class077012, class072092, n2, class06352.N((class06843)class070492, n));
    }

    private static int N(class07701 class077012, class07049 class070492, int n, class07209 class072092, int n2, class03556<class08122> class035562) throws CommandSyntaxException {
        return class06352.N(class077012, class072092, n2, class06352.N(class077012, class035562, class06352.N((class06843)class070492, n)));
    }

    private static int N(class07701 class077012, class07049 class070492, int n, Collection<? extends class07049> collection, int n2) throws CommandSyntaxException {
        return class06352.N(class077012, collection, n2, class06352.N((class06843)class070492, n));
    }

    private static int N(class07701 class077012, class07049 class070492, int n, Collection<? extends class07049> collection, int n2, class03556<class08122> class035562) throws CommandSyntaxException {
        return class06352.N(class077012, collection, n2, class06352.N(class077012, class035562, class06352.N((class06843)class070492, n)));
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection, int n, class06584 class065842) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)collection.size());
        for (class07049 class070492 : collection) {
            class04803 class048032 = class070492.method_32318(n);
            if (class048032 == null || !class048032.N(class065842.t())) continue;
            arrayList.add(class070492);
            if (!(class070492 instanceof class04770)) continue;
            ((class07482)((class04770)class070492).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
        }
        if (arrayList.isEmpty()) {
            throw R.create((Object)class065842.V(), (Object)n);
        }
        if (arrayList.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.item.entity.set.success.single", (Object[])new Object[]{((class07049)arrayList.getFirst()).method_5476(), class065842.V()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.item.entity.set.success.multiple", (Object[])new Object[]{arrayList.size(), class065842.V()}), true);
        }
        return arrayList.size();
    }

    private static int N(class07701 class077012, class07209 class072092, int n, Collection<? extends class07049> collection, int n2) throws CommandSyntaxException {
        return class06352.N(class077012, collection, n2, class06352.N(class077012, class072092, n));
    }

    private static int N(class07701 class077012, class07209 class072092, int n, Collection<? extends class07049> collection, int n2, class03556<class08122> class035562) throws CommandSyntaxException {
        return class06352.N(class077012, collection, n2, class06352.N(class077012, class035562, class06352.N(class077012, class072092, n)));
    }

    private static int N(class07701 class077012, class07209 class072092, int n, class07209 class072093, int n2) throws CommandSyntaxException {
        return class06352.N(class077012, class072093, n2, class06352.N(class077012, class072092, n));
    }

    private static int N(class07701 class077012, class07209 class072092, int n, class06584 class065842) throws CommandSyntaxException {
        class06695 class066952 = class06352.N(class077012, class072092, N);
        if (n < 0 || n >= class066952.method_5439()) {
            throw L.create((Object)n);
        }
        class066952.method_5447(n, class065842);
        class077012.N(() -> class00392.N((String)"commands.item.block.set.success", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class065842.V()}), true);
        return 1;
    }

    private static class06584 N(class07701 class077012, class03556<class08122> class035562, class06584 class065842) {
        class04782 class047822 = class077012.R();
        class04162 class041622 = new class04160(class047822).N(class06551.B, (Object)class077012.i()).y(class06551.N, (Object)class077012.M()).N(class06925.i);
        class05908 class059082 = new class05927(class041622).N(Optional.empty());
        class059082.y(class05908.N((class08122)((class08122)class035562.N())));
        class06584 class065843 = (class06584)((class08122)class035562.N()).apply((Object)class065842, (Object)class059082);
        class065843.R(class065843.U());
        return class065843;
    }

    private static class06584 N(class06843 class068432, int n) throws CommandSyntaxException {
        class04803 class048032 = class068432.method_32318(n);
        if (class048032 == null) {
            throw u.create((Object)n);
        }
        return class048032.N().t();
    }

    private static class06584 N(class07701 class077012, class07209 class072092, int n) throws CommandSyntaxException {
        return class06352.N((class06843)class06352.N(class077012, class072092, y), n);
    }
}

