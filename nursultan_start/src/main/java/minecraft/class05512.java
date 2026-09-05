/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00201
 *  minecraft.class00202
 *  minecraft.class00204
 *  minecraft.class00211
 *  minecraft.class00226
 *  minecraft.class00381
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00404
 *  minecraft.class00405
 *  minecraft.class00444
 *  minecraft.class00627
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00737
 *  minecraft.class00751
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03784
 *  minecraft.class04227
 *  minecraft.class04249
 *  minecraft.class04265
 *  minecraft.class04270
 *  minecraft.class04272
 *  minecraft.class04283
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05946
 *  minecraft.class06183
 *  minecraft.class06541
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07529
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07778
 *  minecraft.class07830
 *  minecraft.class08164
 *  minecraft.class08608
 *  minecraft.class08610
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00201;
import minecraft.class00202;
import minecraft.class00204;
import minecraft.class00211;
import minecraft.class00226;
import minecraft.class00381;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00404;
import minecraft.class00405;
import minecraft.class00444;
import minecraft.class00627;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00737;
import minecraft.class00751;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03784;
import minecraft.class04227;
import minecraft.class04249;
import minecraft.class04265;
import minecraft.class04270;
import minecraft.class04272;
import minecraft.class04283;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05492;
import minecraft.class05494;
import minecraft.class05500;
import minecraft.class05507;
import minecraft.class05510;
import minecraft.class05513;
import minecraft.class05514;
import minecraft.class05516;
import minecraft.class05520;
import minecraft.class05531;
import minecraft.class05946;
import minecraft.class06183;
import minecraft.class06541;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07529;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07778;
import minecraft.class07830;
import minecraft.class08164;
import minecraft.class08608;
import minecraft.class08610;
import org.apache.commons.lang3.mutable.MutableInt;

public class class05512 {
    public static final int N = 15;
    public static final int y = 250;
    public static final int L = 10;
    public static final int u = 100;
    private static final int i = 250;
    private static final int R = 1024;
    private static final int M = 3;
    private static final int B = 5;
    private static final int Z = 5;
    private static final int z = 5;
    private static final SimpleCommandExceptionType U = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.test.clear.error.no_tests"));
    private static final SimpleCommandExceptionType E = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.test.reset.error.no_tests"));
    private static final SimpleCommandExceptionType W = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.test.error.test_instance_not_found"));
    private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType((Message)class00392.y((String)"Could not find any structures to export"));
    private static final SimpleCommandExceptionType P = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.test.error.no_test_instances"));
    private static final Dynamic3CommandExceptionType s = new Dynamic3CommandExceptionType((object, object2, object3) -> class00392.y((String)"commands.test.error.no_test_containing_pos", (Object[])new Object[]{object, object2, object3}));
    private static final DynamicCommandExceptionType T = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.test.error.too_large", (Object[])new Object[]{object}));

    private static int L(class04283 class042832) throws CommandSyntaxException {
        class07701 class077012 = class042832.y();
        class04782 class047822 = class077012.R();
        int n = 0;
        boolean bl = true;
        Iterator var5 = class042832.findTestPos().iterator();
        while (var5.hasNext()) {
            class07209 class072092 = (class07209)var5.next();
            class00394 class003942 = class047822.method_8321(class072092);
            if (class003942 instanceof class08610) {
                if (!((class08610)class003942).L(arg_0 -> ((class07701)class077012).N(arg_0))) {
                    bl = false;
                }
                ++n;
                continue;
            }
            throw W.create();
        }
        if (n == 0) {
            throw m.create();
        }
        String string = "Exported " + n + " structures";
        class042832.y().N(() -> class00392.y((String)string), true);
        return bl ? 0 : 1;
    }

    private static int i(class04283 class042832) throws CommandSyntaxException {
        class042832.y().N((class00392)class00392.L((String)"commands.test.locate.started"));
        MutableInt mutableInt = new MutableInt(0);
        class07209 class072092 = class07209.method_49638((class00737)class042832.y().i());
        class042832.findTestPos().forEach(class072093 -> {
            class00394 class003942 = class042832.y().R().method_8321(class072093);
            if (!(class003942 instanceof class08610)) {
                return;
            }
            class08610 class086102 = (class08610)class003942;
            class003942 = class086102.U().N(class07211.field_11043);
            class07209 class072094 = class086102.d().method_10079((class07211)class003942, 2);
            int n = (int)class003942.b().U();
            String string = String.format(Locale.ROOT, "/tp @s %d %d %d %d 0", class072094.method_10263(), class072094.method_10264(), class072094.method_10260(), n);
            int n2 = class072092.method_10263() - class072093.method_10263();
            int n3 = class072092.method_10260() - class072093.method_10260();
            int n4 = class04995.y((float)class04995.N((float)(n2 * n2 + n3 * n3)));
            class05216 class052162 = class00390.N((class00392)class00392.N((String)"chat.coordinates", (Object[])new Object[]{class072093.method_10263(), class072093.method_10264(), class072093.method_10260()})).N(class004052 -> class004052.N(class06541.field_1060).N((class00647)new class00640(string)).N((class00395)new class00401((class00392)class00392.L((String)"chat.coordinates.tooltip"))));
            class042832.y().N(() -> class05512.N((class00392)class052162, n4), false);
            mutableInt.increment();
        });
        int n = mutableInt.intValue();
        if (n == 0) {
            throw P.create();
        }
        class042832.y().N(() -> class00392.N((String)"commands.test.locate.done", (Object[])new Object[]{n}), true);
        return n;
    }

    private static int u(class04283 class042832) {
        Object object2;
        class05512.N();
        class07701 class077012 = class042832.y();
        class04782 class047822 = class077012.R();
        class07209 class072092 = class05512.N(class077012);
        List list = Stream.concat(class05512.N(class077012, class04272.N(), (class00226)class042832), class05512.N(class077012, class04272.N(), (class00211)class042832, 0)).toList();
        class00204.y();
        ArrayList<class05531> arrayList = new ArrayList<class05531>();
        for (Object object2 : list) {
            for (class06993 class069932 : class06993.values()) {
                ArrayList<class05513> arrayList2 = new ArrayList<class05513>();
                for (int i = 0; i < 100; ++i) {
                    class05513 class055132 = new class05513(((class05513)object2).G(), class069932, class047822, new class04272(1, true));
                    class055132.N(((class05513)object2).L());
                    arrayList2.add(class055132);
                }
                class05531 class055312 = class04265.N(arrayList2, (class03556)((class05513)object2).t().u(), (int)class069932.ordinal());
                arrayList.add(class055312);
            }
        }
        class04270 class042702 = new class04270(class072092, 10, true);
        object2 = class05500.N(arrayList, class047822).N(class04265.N((int)100)).N((class05516)class042702).N(class042702).N().y().L();
        return class05512.N(class077012, (class05520)object2);
    }

    private static ArgumentBuilder<class07701, ?> y(ArgumentBuilder<class07701, ?> argumentBuilder2, class08608<CommandContext<class07701>, class04283> class086082) {
        return class05512.N(argumentBuilder2, class086082, (ArgumentBuilder<class07701, ?> argumentBuilder) -> argumentBuilder.then(((RequiredArgumentBuilder)class07686.N((String)"rotationSteps", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05512.N((class04283)class086082.apply((Object)commandContext), new class04272(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"numberOfTimes"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"untilFailed")), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"), 8))).then(class07686.N((String)"testsPerRow", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05512.N((class04283)class086082.apply((Object)commandContext), new class04272(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"numberOfTimes"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"untilFailed")), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"testsPerRow"))))));
    }

    private static int y(class04283 class042832) throws CommandSyntaxException {
        class05512.N();
        class07701 class077012 = class042832.y();
        class04782 class047822 = class077012.R();
        List list = class042832.findTestPos().flatMap(class072092 -> class047822.N(class072092, class00404.field_55993).stream()).toList();
        for (class08610 class086102 : list) {
            class05514.N(class086102.u(), class047822);
            class086102.v();
            class047822.N(class086102.d(), false);
        }
        if (list.isEmpty()) {
            throw U.create();
        }
        class077012.N(() -> class00392.N((String)"commands.test.clear.success", (Object[])new Object[]{list.size()}), true);
        return list.size();
    }

    private static Stream<class05513> N(class07701 class077012, class04272 class042722, class00211 class002112, int n) {
        return class002112.findTests().filter(class035292 -> class05512.N(class077012, ((class00201)class035292.N()).i())).map(class035292 -> new class05513((class03529<class00201>)class035292, class05514.N(n), class077012.R(), class042722));
    }

    private static Stream<class05513> N(class07701 class077012, class04272 class042722, class00226 class002262) {
        return class002262.findTestPos().map(class072092 -> class05512.N(class072092, class077012, class042722)).flatMap(Optional::stream);
    }

    private static /* synthetic */ class00392 N(class00392 class003922, int n) {
        return class00392.N((String)"commands.test.locate.found", (Object[])new Object[]{class003922, n});
    }

    private static Optional<class05513> N(class07209 class072092, class07701 class077012, class04272 class042722) {
        class04782 class047822 = class077012.R();
        Object object = class047822.method_8321(class072092);
        if (!(object instanceof class08610)) {
            class077012.y((class00392)class00392.N((String)"commands.test.error.test_instance_not_found.position", (Object[])new Object[]{class072092.method_10263(), class072092.method_10264(), class072092.method_10260()}));
            return Optional.empty();
        }
        class08610 class086102 = (class08610)object;
        object = class086102.M().flatMap(arg_0 -> ((class00751)class077012.t().L(class04227.yt)).N(arg_0));
        if (((Optional)object).isEmpty()) {
            class077012.y((class00392)class00392.N((String)"commands.test.error.non_existant_test", (Object[])new Object[]{class086102.B()}));
            return Optional.empty();
        }
        class03529 class035292 = (class03529)((Optional)object).get();
        class05513 class055132 = new class05513((class03529<class00201>)class035292, class086102.U(), class047822, class042722);
        class055132.N(class072092);
        if (!class05512.N(class077012, class055132.v())) {
            return Optional.empty();
        }
        return Optional.of(class055132);
    }

    private static int N(class04283 class042832) throws CommandSyntaxException {
        class05512.N();
        int n = class05512.N(class042832.y(), class04272.N(), (class00226)class042832).map(class055132 -> class05512.N(class042832.y(), class055132)).toList().size();
        if (n == 0) {
            throw U.create();
        }
        class042832.y().N(() -> class00392.N((String)"commands.test.reset.success", (Object[])new Object[]{n}), true);
        return n;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        LiteralArgumentBuilder literalArgumentBuilder;
        ArgumentBuilder<class07701, ?> var2 = class05512.y(class07686.N((String)"onlyRequiredTests", (ArgumentType)BoolArgumentType.bool()), (class08608<CommandContext<class07701>, class04283>)((class08608)commandContext -> class04283.N().N(commandContext, BoolArgumentType.getBool((CommandContext)commandContext, (String)"onlyRequiredTests"))));
        LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"test").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"run").then(class05512.y(class07686.N((String)"tests", (ArgumentType)class00202.N((class04348)class043482, (class05946)class04227.yt)), (class08608<CommandContext<class07701>, class04283>)((class08608)commandContext -> class04283.N().N(commandContext, class00202.N((CommandContext)commandContext, (String)"tests"))))))).then(class07686.y((String)"runmultiple").then(((RequiredArgumentBuilder)class07686.N((String)"tests", (ArgumentType)class00202.N((class04348)class043482, (class05946)class04227.yt)).executes(commandContext -> class05512.N(class04283.N().N(commandContext, class00202.N((CommandContext)commandContext, (String)"tests")), class04272.N(), 0, 8))).then(class07686.N((String)"amount", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05512.N(class04283.N().N(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"amount")).N(commandContext, class00202.N((CommandContext)commandContext, (String)"tests")), class04272.N(), 0, 8)))))).then(class05512.N(class07686.y((String)"runthese"), (class08608<CommandContext<class07701>, class04283>)((class08608)arg_0 -> ((class04249)class04283.N()).y(arg_0))))).then(class05512.N(class07686.y((String)"runclosest"), (class08608<CommandContext<class07701>, class04283>)((class08608)arg_0 -> ((class04249)class04283.N()).N(arg_0))))).then(class05512.N(class07686.y((String)"runthat"), (class08608<CommandContext<class07701>, class04283>)((class08608)arg_0 -> ((class04249)class04283.N()).L(arg_0))))).then(class05512.y(class07686.y((String)"runfailed").then(var2), (class08608<CommandContext<class07701>, class04283>)((class08608)arg_0 -> ((class04249)class04283.N()).u(arg_0))))).then(class07686.y((String)"verify").then(class07686.N((String)"tests", (ArgumentType)class00202.N((class04348)class043482, (class05946)class04227.yt)).executes(commandContext -> class05512.u(class04283.N().N(commandContext, class00202.N((CommandContext)commandContext, (String)"tests"))))))).then(class07686.y((String)"locate").then(class07686.N((String)"tests", (ArgumentType)class00202.N((class04348)class043482, (class05946)class04227.yt)).executes(commandContext -> class05512.i(class04283.N().N(commandContext, class00202.N((CommandContext)commandContext, (String)"tests"))))))).then(class07686.y((String)"resetclosest").executes(commandContext -> class05512.N(class04283.N().N(commandContext))))).then(class07686.y((String)"resetthese").executes(commandContext -> class05512.N(class04283.N().y(commandContext))))).then(class07686.y((String)"resetthat").executes(commandContext -> class05512.N(class04283.N().L(commandContext))))).then(class07686.y((String)"clearthat").executes(commandContext -> class05512.y(class04283.N().L(commandContext))))).then(class07686.y((String)"clearthese").executes(commandContext -> class05512.y(class04283.N().y(commandContext))))).then(((LiteralArgumentBuilder)class07686.y((String)"clearall").executes(commandContext -> class05512.y(class04283.N().N(commandContext, 250)))).then(class07686.N((String)"radius", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05512.y(class04283.N().N(commandContext, class04995.N((int)IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"radius"), (int)0, (int)1024))))))).then(class07686.y((String)"stop").executes(commandContext -> class05512.N()))).then(((LiteralArgumentBuilder)class07686.y((String)"pos").executes(commandContext -> class05512.N((class07701)commandContext.getSource(), "pos"))).then(class07686.N((String)"var", (ArgumentType)StringArgumentType.word()).executes(commandContext -> class05512.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"var")))))).then(class07686.y((String)"create").then(((RequiredArgumentBuilder)class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(class05512::N).executes(commandContext -> class05512.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id"), 5, 5, 5))).then(((RequiredArgumentBuilder)class07686.N((String)"width", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05512.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"width"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"width"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"width")))).then(class07686.N((String)"height", (ArgumentType)IntegerArgumentType.integer()).then(class07686.N((String)"depth", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05512.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"width"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"height"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"depth"))))))));
        if (class07529.ND) {
            literalArgumentBuilder = (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var3.then(class07686.y((String)"export").then(class07686.N((String)"test", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.yt)).executes(commandContext -> class05512.N((class07701)commandContext.getSource(), (class03556<class00201>)class03784.N((CommandContext)commandContext, (String)"test", (class05946)class04227.yt)))))).then(class07686.y((String)"exportclosest").executes(commandContext -> class05512.L(class04283.N().N(commandContext))))).then(class07686.y((String)"exportthese").executes(commandContext -> class05512.L(class04283.N().y(commandContext))))).then(class07686.y((String)"exportthat").executes(commandContext -> class05512.L(class04283.N().L(commandContext))));
        }
        commandDispatcher.register(literalArgumentBuilder);
    }

    private static ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> argumentBuilder2, class08608<CommandContext<class07701>, class04283> class086082) {
        return class05512.N(argumentBuilder2, class086082, (ArgumentBuilder<class07701, ?> argumentBuilder) -> argumentBuilder);
    }

    private static int N(class07701 class077012, class05513 class055132) {
        class055132.R().N(arg_0 -> ((class07701)class077012).N(arg_0));
        return 1;
    }

    public static CompletableFuture<Suggestions> N(CommandContext<class07701> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.y(((class07701)commandContext.getSource()).t().L(class04227.NJ).z().map(class03556::M), (SuggestionsBuilder)suggestionsBuilder);
    }

    private static /* synthetic */ class00392 N(String string, class00392 class003922) {
        return class00392.N((String)"commands.test.relative_position", (Object[])new Object[]{string, class003922});
    }

    private static int N(class04283 class042832, class04272 class042722, int n, int n2) {
        class05512.N();
        class07701 class077012 = class042832.y();
        class04782 class047822 = class077012.R();
        class07209 class072092 = class05512.N(class077012);
        List list = Stream.concat(class05512.N(class077012, class042722, (class00226)class042832), class05512.N(class077012, class042722, (class00211)class042832, n)).toList();
        if (list.isEmpty()) {
            class077012.N(() -> class00392.L((String)"commands.test.no_tests"), false);
            return 0;
        }
        class00204.y();
        class077012.N(() -> class00392.N((String)"commands.test.run.running", (Object[])new Object[]{list.size()}), false);
        class05520 class055202 = class05500.y(list, class047822).N((class05516)new class04270(class072092, n2, false)).L();
        return class05512.N(class077012, class055202);
    }

    private static int N() {
        class05492.N.N();
        return 1;
    }

    private static int N(class07701 class077012, String string) throws CommandSyntaxException {
        class04782 class047822;
        class04770 class047702 = class077012.Z();
        class07209 class072092 = ((class06183)class047702.method_5745(10.0, 1.0f, false)).u();
        Optional<class07209> var6 = class05514.N(class072092, 15, class047822 = class077012.R());
        if (var6.isEmpty()) {
            var6 = class05514.N(class072092, 250, class047822);
        }
        if (var6.isEmpty()) {
            throw s.create((Object)class072092.method_10263(), (Object)class072092.method_10264(), (Object)class072092.method_10260());
        }
        class00394 class003942 = class047822.method_8321(var6.get());
        if (!(class003942 instanceof class08610)) {
            throw W.create();
        }
        class08610 class086102 = (class08610)class003942;
        class003942 = class086102.s();
        class07209 class072093 = class072092.method_10059((class00753)class003942);
        String string2 = class072093.method_10263() + ", " + class072093.method_10264() + ", " + class072093.method_10260();
        String string3 = class086102.B().getString();
        class05216 class052162 = class00392.N((String)"commands.test.coordinates", (Object[])new Object[]{class072093.method_10263(), class072093.method_10264(), class072093.method_10260()}).y(class00405.N.N(Boolean.valueOf(true)).N(class06541.field_1060).N((class00395)new class00401((class00392)class00392.L((String)"commands.test.coordinates.copy"))).N((class00647)new class00627("final BlockPos " + string + " = new BlockPos(" + string2 + ");")));
        class077012.N(() -> class05512.N(string3, (class00392)class052162), false);
        class047702.field_13987.method_14364((class00381)new class00444(class072092, class072093));
        return 1;
    }

    private static int N(class07701 class077012, class01894 class018942, int n, int n2, int n3) throws CommandSyntaxException {
        if (n > 48 || n2 > 48 || n3 > 48) {
            throw T.create((Object)48);
        }
        class04782 class047822 = class077012.R();
        class07209 class072093 = class05512.N(class077012);
        class08610 class086102 = class05514.N(class018942, class072093, new class00753(n, n2, n3), class06993.field_11467, class047822);
        class07209 class072094 = class086102.s();
        class07209 class072095 = class072094.method_10069(n - 1, 0, n3 - 1);
        class07209.method_20437((class07209)class072094, (class07209)class072095).forEach(class072092 -> class047822.method_8501(class072092, class00869.q.W()));
        class077012.N(() -> class00392.N((String)"commands.test.create.success", (Object[])new Object[]{class086102.B()}), true);
        return 1;
    }

    private static ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> argumentBuilder, class08608<CommandContext<class07701>, class04283> class086082, Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> function) {
        return argumentBuilder.executes(commandContext -> class05512.N((class04283)class086082.apply((Object)commandContext), class04272.N(), 0, 8)).then(((RequiredArgumentBuilder)class07686.N((String)"numberOfTimes", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class05512.N((class04283)class086082.apply((Object)commandContext), new class04272(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"numberOfTimes"), false), 0, 8))).then(function.apply(class07686.N((String)"untilFailed", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class05512.N((class04283)class086082.apply((Object)commandContext), new class04272(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"numberOfTimes"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"untilFailed")), 0, 8)))));
    }

    private static class07209 N(class07701 class077012) {
        class07209 class072092 = class07209.method_49638((class00737)class077012.i());
        int n = class077012.R().N(class07830.field_13202, class072092).method_10264();
        return new class07209(class072092.method_10263(), n, class072092.method_10260() + 3);
    }

    private static boolean N(class07701 class077012, class01894 class018942) {
        if (class077012.R().method_14183().y(class018942).isEmpty()) {
            class077012.y((class00392)class00392.N((String)"commands.test.error.structure_not_found", (Object[])new Object[]{class00392.N((class01894)class018942)}));
            return false;
        }
        return true;
    }

    private static int N(class07701 class077012, class03556<class00201> class035562) {
        if (!class08610.N((class04782)class077012.R(), (class01894)((class00201)class035562.N()).i(), arg_0 -> ((class07701)class077012).N(arg_0))) {
            return 0;
        }
        return 1;
    }

    public static int N(class07701 class077012, class05520 class055202) {
        class055202.N(new class05510(class077012));
        class05494 class054942 = new class05494(class055202.N());
        class054942.N(new class05507(class077012, class054942));
        class054942.N(class055132 -> class00204.N(class055132.G()));
        class055202.y();
        return 1;
    }
}

