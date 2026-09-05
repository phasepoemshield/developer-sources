/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09474
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.RedirectModifier
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00518
 *  minecraft.class00570
 *  minecraft.class00753
 *  minecraft.class00816
 *  minecraft.class00836
 *  minecraft.class00869
 *  minecraft.class00878
 *  minecraft.class00879
 *  minecraft.class00881
 *  minecraft.class00894
 *  minecraft.class00897
 *  minecraft.class01042
 *  minecraft.class01296
 *  minecraft.class01711
 *  minecraft.class01724
 *  minecraft.class01744
 *  minecraft.class01747
 *  minecraft.class01765
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01956
 *  minecraft.class01959
 *  minecraft.class02145
 *  minecraft.class02198
 *  minecraft.class02466
 *  minecraft.class02494
 *  minecraft.class02607
 *  minecraft.class03102
 *  minecraft.class03126
 *  minecraft.class03144
 *  minecraft.class03244
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03583
 *  minecraft.class03784
 *  minecraft.class03789
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04227
 *  minecraft.class04348
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04763
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04995
 *  minecraft.class05163
 *  minecraft.class05487
 *  minecraft.class05598
 *  minecraft.class05616
 *  minecraft.class05622
 *  minecraft.class05908
 *  minecraft.class05927
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class06214
 *  minecraft.class06352
 *  minecraft.class06392
 *  minecraft.class06394
 *  minecraft.class06426
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06646
 *  minecraft.class06683
 *  minecraft.class06695
 *  minecraft.class06791
 *  minecraft.class06793
 *  minecraft.class06808
 *  minecraft.class06843
 *  minecraft.class06889
 *  minecraft.class06925
 *  minecraft.class06956
 *  minecraft.class07001
 *  minecraft.class07009
 *  minecraft.class07019
 *  minecraft.class07037
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07664
 *  minecraft.class07678
 *  minecraft.class07680
 *  minecraft.class07684
 *  minecraft.class07686
 *  minecraft.class07687
 *  minecraft.class07701
 *  minecraft.class07709
 *  minecraft.class07720
 *  minecraft.class07729
 *  minecraft.class07730
 *  minecraft.class07759
 *  minecraft.class07766
 *  minecraft.class07767
 *  minecraft.class07778
 *  minecraft.class07786
 *  minecraft.class07788
 *  minecraft.class07793
 *  minecraft.class07794
 *  minecraft.class08164
 *  minecraft.class08170
 *  minecraft.class08192
 *  minecraft.class08303
 *  minecraft.class08329
 *  minecraft.class08608
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09474;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00518;
import minecraft.class00570;
import minecraft.class00753;
import minecraft.class00816;
import minecraft.class00836;
import minecraft.class00869;
import minecraft.class00878;
import minecraft.class00879;
import minecraft.class00881;
import minecraft.class00894;
import minecraft.class00897;
import minecraft.class01042;
import minecraft.class01296;
import minecraft.class01546;
import minecraft.class01550;
import minecraft.class01567;
import minecraft.class01568;
import minecraft.class01711;
import minecraft.class01724;
import minecraft.class01744;
import minecraft.class01747;
import minecraft.class01765;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01956;
import minecraft.class01959;
import minecraft.class02145;
import minecraft.class02198;
import minecraft.class02466;
import minecraft.class02494;
import minecraft.class02607;
import minecraft.class03102;
import minecraft.class03126;
import minecraft.class03144;
import minecraft.class03244;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03583;
import minecraft.class03784;
import minecraft.class03789;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04227;
import minecraft.class04348;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04763;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04995;
import minecraft.class05163;
import minecraft.class05487;
import minecraft.class05598;
import minecraft.class05616;
import minecraft.class05622;
import minecraft.class05908;
import minecraft.class05927;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class06214;
import minecraft.class06352;
import minecraft.class06392;
import minecraft.class06394;
import minecraft.class06426;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06646;
import minecraft.class06683;
import minecraft.class06695;
import minecraft.class06791;
import minecraft.class06793;
import minecraft.class06808;
import minecraft.class06843;
import minecraft.class06889;
import minecraft.class06925;
import minecraft.class06956;
import minecraft.class07001;
import minecraft.class07009;
import minecraft.class07019;
import minecraft.class07037;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07664;
import minecraft.class07678;
import minecraft.class07680;
import minecraft.class07684;
import minecraft.class07686;
import minecraft.class07687;
import minecraft.class07701;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07729;
import minecraft.class07730;
import minecraft.class07759;
import minecraft.class07766;
import minecraft.class07767;
import minecraft.class07778;
import minecraft.class07786;
import minecraft.class07788;
import minecraft.class07793;
import minecraft.class07794;
import minecraft.class08164;
import minecraft.class08170;
import minecraft.class08192;
import minecraft.class08303;
import minecraft.class08329;
import minecraft.class08608;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01577 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 32768;
    private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.execute.blocks.toobig", (Object[])new Object[]{object, object2}));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.execute.conditional.fail"));
    private static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.execute.conditional.fail_count", (Object[])new Object[]{object}));
    public static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.execute.function.instantiationFailure", (Object[])new Object[]{object, object2}));

    private static OptionalInt L(CommandContext<class07701> commandContext, boolean bl) throws CommandSyntaxException {
        return class01577.N(((class07701)commandContext.getSource()).R(), class00894.N(commandContext, (String)"start"), class00894.N(commandContext, (String)"end"), class00894.N(commandContext, (String)"destination"), bl);
    }

    private static RedirectModifier<class07701> y(Function<class07049, Stream<class07049>> function) {
        return commandContext -> {
            class07701 class077012 = (class07701)commandContext.getSource();
            class07049 class070493 = class077012.M();
            if (class070493 == null) {
                return List.of();
            }
            return ((Stream)function.apply(class070493)).filter(class070492 -> !class070492.method_31481()).map(arg_0 -> ((class07701)class077012).N(arg_0)).toList();
        };
    }

    private static int y(CommandContext<class07701> commandContext, boolean bl) throws CommandSyntaxException {
        OptionalInt optionalInt = class01577.L(commandContext, bl);
        if (optionalInt.isPresent()) {
            throw R.create((Object)optionalInt.getAsInt());
        }
        ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"commands.execute.conditional.pass"), false);
        return 1;
    }

    private static ArgumentBuilder<class07701, ?> N(LiteralCommandNode<class07701> literalCommandNode, LiteralArgumentBuilder<class07701> literalArgumentBuilder, boolean bl) {
        literalArgumentBuilder.then(class07686.y((String)"score").then(class07686.N((String)"targets", (ArgumentType)class07786.y()).suggests(class07786.N).then(class07686.N((String)"objective", (ArgumentType)class07794.N()).redirect(literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class07786.L((CommandContext)commandContext, (String)"targets"), class07794.N((CommandContext)commandContext, (String)"objective"), bl)))));
        literalArgumentBuilder.then(class07686.y((String)"bossbar").then(((RequiredArgumentBuilder)class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(class06426.N).then(class07686.y((String)"value").redirect(literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class06426.N((CommandContext)commandContext), true, bl)))).then(class07686.y((String)"max").redirect(literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class06426.N((CommandContext)commandContext), false, bl)))));
        for (class05622 class056222 : class05616.y) {
            class056222.N(literalArgumentBuilder, (T argumentBuilder) -> argumentBuilder.then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"path", (ArgumentType)class07759.N()).then(class07686.y((String)"int").then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class056222.N(commandContext), class07759.N((CommandContext)commandContext, (String)"path"), (int n) -> class07720.N((int)((int)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))), bl))))).then(class07686.y((String)"float").then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class056222.N(commandContext), class07759.N((CommandContext)commandContext, (String)"path"), (int n) -> class07009.N((float)((float)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))), bl))))).then(class07686.y((String)"short").then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class056222.N(commandContext), class07759.N((CommandContext)commandContext, (String)"path"), (int n) -> class07730.N((short)((short)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))), bl))))).then(class07686.y((String)"long").then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class056222.N(commandContext), class07759.N((CommandContext)commandContext, (String)"path"), (int n) -> class07729.N((long)((long)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))), bl))))).then(class07686.y((String)"double").then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class056222.N(commandContext), class07759.N((CommandContext)commandContext, (String)"path"), (int n) -> class07019.N((double)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale"))), bl))))).then(class07686.y((String)"byte").then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class056222.N(commandContext), class07759.N((CommandContext)commandContext, (String)"path"), (int n) -> class07037.N((byte)((byte)((double)n * DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale")))), bl))))));
        }
        return literalArgumentBuilder;
    }

    private static class07701 N(class07701 class077012, class06392 class063922, boolean bl, boolean bl2) {
        return class077012.N((bl3, n) -> {
            int n2;
            int n3 = bl2 ? n : (n2 = bl3 ? 1 : 0);
            if (bl) {
                class063922.N(n2);
            } else {
                class063922.y(n2);
            }
        }, class03102::N);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)class07686.y((String)"execute").requires((Predicate)class07686.N((class08164)class07686.u)));
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"execute").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"run").redirect((CommandNode)commandDispatcher.getRoot()))).then(class01577.N((CommandNode<class07701>)literalCommandNode, (LiteralArgumentBuilder<class07701>)class07686.y((String)"if"), true, class043482))).then(class01577.N((CommandNode<class07701>)literalCommandNode, (LiteralArgumentBuilder<class07701>)class07686.y((String)"unless"), false, class043482))).then(class07686.y((String)"as").then(class07686.N((String)"targets", (ArgumentType)class07680.y()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            for (class07049 class070492 : class07680.L((CommandContext)commandContext, (String)"targets")) {
                arrayList.add(((class07701)commandContext.getSource()).N(class070492));
            }
            return arrayList;
        })))).then(class07686.y((String)"at").then(class07686.N((String)"targets", (ArgumentType)class07680.y()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            for (class07049 class070492 : class07680.L((CommandContext)commandContext, (String)"targets")) {
                arrayList.add(((class07701)commandContext.getSource()).N((class04782)class070492.method_73183()).N(class070492.method_73189()).N(class070492.method_5802()));
            }
            return arrayList;
        })))).then(((LiteralArgumentBuilder)class07686.y((String)"store").then(class01577.N((LiteralCommandNode<class07701>)literalCommandNode, (LiteralArgumentBuilder<class07701>)class07686.y((String)"result"), true))).then(class01577.N((LiteralCommandNode<class07701>)literalCommandNode, (LiteralArgumentBuilder<class07701>)class07686.y((String)"success"), false)))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"positioned").then(class07686.N((String)"pos", (ArgumentType)class00881.N()).redirect((CommandNode)literalCommandNode, commandContext -> ((class07701)commandContext.getSource()).N(class00881.N((CommandContext)commandContext, (String)"pos")).N(class07664.field_9853)))).then(class07686.y((String)"as").then(class07686.N((String)"targets", (ArgumentType)class07680.y()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            for (class07049 class070492 : class07680.L((CommandContext)commandContext, (String)"targets")) {
                arrayList.add(((class07701)commandContext.getSource()).N(class070492.method_73189()));
            }
            return arrayList;
        })))).then(class07686.y((String)"over").then(class07686.N((String)"heightmap", (ArgumentType)class03583.N()).redirect((CommandNode)literalCommandNode, commandContext -> {
            class06889 class068892 = ((class07701)commandContext.getSource()).i();
            class04782 class047822 = ((class07701)commandContext.getSource()).R();
            double d = class068892.N();
            double d2 = class068892.L();
            if (!class047822.N(class01296.y((double)d), class01296.y((double)d2))) {
                throw class00894.N.create();
            }
            int n = class047822.method_8624(class03583.N((CommandContext)commandContext, (String)"heightmap"), class04995.N((double)d), class04995.N((double)d2));
            return ((class07701)commandContext.getSource()).N(new class06889(d, (double)n, d2));
        }))))).then(((LiteralArgumentBuilder)class07686.y((String)"rotated").then(class07686.N((String)"rot", (ArgumentType)class00897.N()).redirect((CommandNode)literalCommandNode, commandContext -> ((class07701)commandContext.getSource()).N(class00897.N((CommandContext)commandContext, (String)"rot").y((class07701)commandContext.getSource()))))).then(class07686.y((String)"as").then(class07686.N((String)"targets", (ArgumentType)class07680.y()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            for (class07049 class070492 : class07680.L((CommandContext)commandContext, (String)"targets")) {
                arrayList.add(((class07701)commandContext.getSource()).N(class070492.method_5802()));
            }
            return arrayList;
        }))))).then(((LiteralArgumentBuilder)class07686.y((String)"facing").then(class07686.y((String)"entity").then(class07686.N((String)"targets", (ArgumentType)class07680.y()).then(class07686.N((String)"anchor", (ArgumentType)class07687.N()).fork((CommandNode)literalCommandNode, commandContext -> {
            ArrayList arrayList = Lists.newArrayList();
            class07664 class076642 = class07687.N((CommandContext)commandContext, (String)"anchor");
            for (class07049 class070492 : class07680.L((CommandContext)commandContext, (String)"targets")) {
                arrayList.add(((class07701)commandContext.getSource()).N(class070492, class076642));
            }
            return arrayList;
        }))))).then(class07686.N((String)"pos", (ArgumentType)class00881.N()).redirect((CommandNode)literalCommandNode, commandContext -> ((class07701)commandContext.getSource()).y(class00881.N((CommandContext)commandContext, (String)"pos")))))).then(class07686.y((String)"align").then(class07686.N((String)"axes", (ArgumentType)class00879.N()).redirect((CommandNode)literalCommandNode, commandContext -> ((class07701)commandContext.getSource()).N(((class07701)commandContext.getSource()).i().N(class00879.N((CommandContext)commandContext, (String)"axes"))))))).then(class07686.y((String)"anchored").then(class07686.N((String)"anchor", (ArgumentType)class07687.N()).redirect((CommandNode)literalCommandNode, commandContext -> ((class07701)commandContext.getSource()).N(class07687.N((CommandContext)commandContext, (String)"anchor")))))).then(class07686.y((String)"in").then(class07686.N((String)"dimension", (ArgumentType)class07678.N()).redirect((CommandNode)literalCommandNode, commandContext -> ((class07701)commandContext.getSource()).N(class07678.N((CommandContext)commandContext, (String)"dimension")))))).then(class07686.y((String)"summon").then(class07686.N((String)"entity", (ArgumentType)class03784.N((class04348)class043482, (class05946)class04227.I)).suggests(class06791.N((SuggestionProvider)class06791.L)).redirect((CommandNode)literalCommandNode, commandContext -> class01577.N((class07701)commandContext.getSource(), class03784.i((CommandContext)commandContext, (String)"entity")))))).then(class01577.N((CommandNode<class07701>)literalCommandNode, (LiteralArgumentBuilder<class07701>)class07686.y((String)"on"))));
    }

    private static /* synthetic */ void N(Collection collection, class06683 class066832, class00518 class005182, boolean bl, boolean bl2, int n) {
        for (class01766 class017662 : collection) {
            class01765 class017652 = class066832.N(class017662, class005182);
            int n2 = bl ? n : (bl2 ? 1 : 0);
            class017652.N(n2);
        }
    }

    private static boolean N(class04782 class047822, class07209 class072092) {
        class07321 class073212 = new class07321(class072092);
        class00570 class005702 = class047822.method_14178().N(class073212.B, class073212.Z);
        if (class005702 != null) {
            return class005702.g() == class04763.field_13877 && class047822.method_37116(class073212.y());
        }
        return false;
    }

    private static class07701 N(class07701 class077012, class05598 class055982, class07793 class077932, IntFunction<class07709> intFunction, boolean bl) {
        return class077012.N((bl2, n) -> {
            try {
                class07001 class070012 = class055982.N();
                int n2 = bl ? n : (bl2 ? 1 : 0);
                class077932.N((class07709)class070012, (class07709)intFunction.apply(n2));
                class055982.N(class070012);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }, class03102::N);
    }

    private static class07701 N(class07701 class077012, Collection<class01766> collection, class00518 class005182, boolean bl) {
        class06394 class063942 = class077012.W().yB();
        return class077012.N((arg_0, arg_1) -> class01577.N(collection, (class06683)class063942, class005182, bl, arg_0, arg_1), class03102::N);
    }

    private static ArgumentBuilder<class07701, ?> N(CommandNode<class07701> commandNode, ArgumentBuilder<class07701, ?> argumentBuilder, boolean bl, class01550 class015502) {
        return argumentBuilder.fork(commandNode, commandContext -> class01577.N((CommandContext<class07701>)commandContext, bl, class015502.test((CommandContext<class07701>)commandContext))).executes(commandContext -> {
            if (bl == class015502.test((CommandContext<class07701>)commandContext)) {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"commands.execute.conditional.pass"), false);
                return 1;
            }
            throw i.create();
        });
    }

    private static boolean N(CommandContext<class07701> commandContext, class00836 class008362) throws CommandSyntaxException {
        class01766 class017662 = class07786.N(commandContext, (String)"target");
        class00518 class005182 = class07794.N(commandContext, (String)"targetObjective");
        class01788 class017882 = ((class07701)commandContext.getSource()).W().yB().y(class017662, class005182);
        if (class017882 == null) {
            return false;
        }
        return class008362.u(class017882.y());
    }

    private static ArgumentBuilder<class07701, ?> N(CommandNode<class07701> commandNode, ArgumentBuilder<class07701, ?> argumentBuilder, boolean bl, boolean bl2) {
        return argumentBuilder.fork(commandNode, commandContext -> class01577.N((CommandContext<class07701>)commandContext, bl, class01577.L((CommandContext<class07701>)commandContext, bl2).isPresent())).executes(bl ? commandContext -> class01577.N((CommandContext<class07701>)commandContext, bl2) : commandContext -> class01577.y((CommandContext<class07701>)commandContext, bl2));
    }

    private static boolean N(CommandContext<class07701> commandContext, class00816 class008162) throws CommandSyntaxException {
        class01894 class018942 = class07778.N(commandContext, (String)"id");
        class08192 class081922 = ((class07701)commandContext.getSource()).W().yz().N(class018942);
        if (class081922 == null) {
            throw class06956.N.create((Object)class018942);
        }
        long l = class08170.y();
        double d = class081922.y(l);
        return class008162.u(d);
    }

    private static Collection<class07701> N(CommandContext<class07701> commandContext, boolean bl, boolean bl2) {
        if (bl2 == bl) {
            return Collections.singleton((class07701)commandContext.getSource());
        }
        return Collections.emptyList();
    }

    private static LiteralArgumentBuilder<class07701> N(CommandNode<class07701> commandNode, LiteralArgumentBuilder<class07701> literalArgumentBuilder) {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.then(class07686.y((String)"owner").fork(commandNode, class01577.N((class07049 class070492) -> class070492 instanceof class02145 ? Optional.ofNullable(((class02145)class070492).L_()) : Optional.empty())))).then(class07686.y((String)"leasher").fork(commandNode, class01577.N((class07049 class070492) -> class070492 instanceof class02607 ? Optional.ofNullable(((class02607)class070492).yW()) : Optional.empty())))).then(class07686.y((String)"target").fork(commandNode, class01577.N((class07049 class070492) -> class070492 instanceof class01956 ? Optional.ofNullable(((class01956)class070492).T()) : Optional.empty())))).then(class07686.y((String)"attacker").fork(commandNode, class01577.N((class07049 class070492) -> class070492 instanceof class01959 ? Optional.ofNullable(((class01959)class070492).method_49107()) : Optional.empty())))).then(class07686.y((String)"vehicle").fork(commandNode, class01577.N((class07049 class070492) -> Optional.ofNullable(class070492.method_5854()))))).then(class07686.y((String)"controller").fork(commandNode, class01577.N((class07049 class070492) -> Optional.ofNullable(class070492.method_5642()))))).then(class07686.y((String)"origin").fork(commandNode, class01577.N((class07049 class070492) -> class070492 instanceof class03244 ? Optional.ofNullable(((class03244)class070492).z()) : Optional.empty())))).then(class07686.y((String)"passengers").fork(commandNode, class01577.y((class07049 class070492) -> class070492.method_5685().stream())));
    }

    private static int N(CommandContext<class07701> commandContext, boolean bl) throws CommandSyntaxException {
        OptionalInt optionalInt = class01577.L(commandContext, bl);
        if (optionalInt.isPresent()) {
            ((class07701)commandContext.getSource()).N(() -> class00392.N((String)"commands.execute.conditional.pass_count", (Object[])new Object[]{optionalInt.getAsInt()}), false);
            return optionalInt.getAsInt();
        }
        throw i.create();
    }

    private static RedirectModifier<class07701> N(Function<class07049, Optional<class07049>> function) {
        return commandContext -> {
            class07701 class077012 = (class07701)commandContext.getSource();
            class07049 class070493 = class077012.M();
            if (class070493 == null) {
                return List.of();
            }
            return ((Optional)function.apply(class070493)).filter(class070492 -> !class070492.method_31481()).map(class070492 -> List.of(class077012.N(class070492))).orElse(List.of());
        };
    }

    private static OptionalInt N(class04782 class047822, class07209 class072092, class07209 class072093, class07209 class072094, boolean bl) throws CommandSyntaxException {
        class05163 class051632 = class05163.N((class00753)class072092, (class00753)class072093);
        class05163 class051633 = class05163.N((class00753)class072094, (class00753)class072094.method_10081(class051632.L()));
        class07209 class072095 = new class07209(class051633.B() - class051632.B(), class051633.Z() - class051632.Z(), class051633.z() - class051632.z());
        int n = class051632.u() * class051632.i() * class051632.R();
        if (n > 32768) {
            throw u.create((Object)32768, (Object)n);
        }
        int n2 = 0;
        class01042 class010422 = class047822.method_30349();
        try (class04495 class044952 = new class04495(y);){
            for (int i = class051632.z(); i <= class051632.W(); ++i) {
                for (int j = class051632.Z(); j <= class051632.E(); ++j) {
                    for (int k = class051632.B(); k <= class051632.U(); ++k) {
                        OptionalInt optionalInt;
                        class07209 class072096 = new class07209(k, j, i);
                        class07209 class072097 = class072096.method_10081((class00753)class072095);
                        class00500 class005002 = class047822.method_8320(class072096);
                        if (bl && class005002.N(class00869.N)) continue;
                        if (class005002 != class047822.method_8320(class072097)) {
                            optionalInt = OptionalInt.empty();
                            return optionalInt;
                        }
                        optionalInt = class047822.method_8321(class072096);
                        class00394 class003942 = class047822.method_8321(class072097);
                        if (optionalInt != null) {
                            OptionalInt optionalInt2;
                            if (class003942 == null) {
                                optionalInt2 = OptionalInt.empty();
                                return optionalInt2;
                            }
                            if (class003942.O() != optionalInt.O()) {
                                optionalInt2 = OptionalInt.empty();
                                return optionalInt2;
                            }
                            if (!optionalInt.I().equals((Object)class003942.I())) {
                                optionalInt2 = OptionalInt.empty();
                                return optionalInt2;
                            }
                            optionalInt2 = class08303.N((class04490)class044952.N_46(optionalInt.J()), (class01929)class010422);
                            optionalInt.R((class08329)optionalInt2);
                            class07001 class070012 = optionalInt2.y();
                            class08303 class083032 = class08303.N((class04490)class044952.N_46(class003942.J()), (class01929)class010422);
                            class003942.R((class08329)class083032);
                            class07001 class070013 = class083032.y();
                            if (!class070012.equals((Object)class070013)) {
                                OptionalInt optionalInt3 = OptionalInt.empty();
                                return optionalInt3;
                            }
                        }
                        ++n2;
                    }
                }
            }
        }
        return OptionalInt.of(n2);
    }

    private static boolean N(class07701 class077012, class03556<class05957> class035562) {
        class04782 class047822 = class077012.R();
        class04162 class041622 = new class04160(class047822).N(class06551.B, (Object)class077012.i()).y(class06551.N, (Object)class077012.M()).N(class06925.i);
        class05908 class059082 = new class05927(class041622).N(Optional.empty());
        class059082.y(class05908.N((class05957)((class05957)class035562.N())));
        return ((class05957)class035562.N()).test((Object)class059082);
    }

    private static /* synthetic */ void N(IntPredicate intPredicate, List list, class01711 class017112, boolean bl, int n) {
        if (intPredicate.test(n)) {
            list.add(class017112);
        }
    }

    private static /* synthetic */ void N(List list, class01711 class017112, class01744 class017442) {
        for (class01747 class017472 : list) {
            class017442.N(new class01724(class017472, class017442.y().u(), true).N((Object)class017112));
        }
        class017442.N(class03144.N());
    }

    /*
     * Exception decompiling
     */
    public static <T extends class01711<T>> void N(T var0, List<T> var1_1, Function<T, T> var2_2, IntPredicate var3_3, ContextChain<T> var4_4, @Nullable class07001 var5_5, class01744<T> var6_6, class08608<CommandContext<T>, Collection<class07684<T>>> var7_7, class03126 var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static class07701 N(class07701 class077012, class03529<class07078<?>> class035292) throws CommandSyntaxException {
        class07049 class070492 = class06214.N((class07701)class077012, class035292, (class06889)class077012.i(), (class07001)new class07001(), (boolean)true);
        return class077012.N(class070492);
    }

    private static int N(class07701 class077012, class07209 class072092, class02466 class024662, Predicate<class06584> predicate) throws CommandSyntaxException {
        int n = 0;
        class06695 class066952 = class06352.N((class07701)class077012, (class07209)class072092, (Dynamic3CommandExceptionType)class06352.y);
        int n2 = class066952.method_5439();
        IntList intList = class024662.N();
        for (int i = 0; i < intList.size(); ++i) {
            class06584 class065842;
            int n3 = intList.getInt(i);
            if (n3 < 0 || n3 >= n2 || !predicate.test(class065842 = class066952.method_5438(n3))) continue;
            n += class065842.c();
        }
        return n;
    }

    private static Command<class07701> N(boolean bl, class01567 class015672) {
        if (bl) {
            return commandContext -> {
                int n = class015672.test((CommandContext<class07701>)commandContext);
                if (n > 0) {
                    ((class07701)commandContext.getSource()).N(() -> class00392.N((String)"commands.execute.conditional.pass_count", (Object[])new Object[]{n}), false);
                    return n;
                }
                throw i.create();
            };
        }
        return commandContext -> {
            int n = class015672.test((CommandContext<class07701>)commandContext);
            if (n == 0) {
                ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"commands.execute.conditional.pass"), false);
                return 1;
            }
            throw R.create((Object)n);
        };
    }

    private static int N(class05598 class055982, class07793 class077932) throws CommandSyntaxException {
        return class077932.y((class07709)class055982.N());
    }

    private static ArgumentBuilder<class07701, ?> N(CommandNode<class07701> commandNode, LiteralArgumentBuilder<class07701> literalArgumentBuilder, boolean bl, class04348 class043482) {
        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.then(class07686.y((String)"block").then(class07686.N((String)"pos", (ArgumentType)class00894.N()).then(class01577.N(commandNode, class07686.N((String)"block", (ArgumentType)class00878.N((class04348)class043482)), bl, (CommandContext<class07701> commandContext) -> class00878.N((CommandContext)commandContext, (String)"block").test(new class06646((class05487)((class07701)commandContext.getSource()).R(), class00894.N((CommandContext)commandContext, (String)"pos"), true))))))).then(class07686.y((String)"biome").then(class07686.N((String)"pos", (ArgumentType)class00894.N()).then(class01577.N(commandNode, class07686.N((String)"biome", (ArgumentType)class03789.N((class04348)class043482, (class05946)class04227.NA)), bl, (CommandContext<class07701> commandContext) -> class03789.N((CommandContext)commandContext, (String)"biome", (class05946)class04227.NA).test((Object)((class07701)commandContext.getSource()).R().i(class00894.N((CommandContext)commandContext, (String)"pos")))))))).then(class07686.y((String)"loaded").then(class01577.N(commandNode, class07686.N((String)"pos", (ArgumentType)class00894.N()), bl, (CommandContext<class07701> commandContext) -> class01577.N(((class07701)commandContext.getSource()).R(), class00894.y((CommandContext)commandContext, (String)"pos")))))).then(class07686.y((String)"dimension").then(class01577.N(commandNode, class07686.N((String)"dimension", (ArgumentType)class07678.N()), bl, (CommandContext<class07701> commandContext) -> class07678.N((CommandContext)commandContext, (String)"dimension") == ((class07701)commandContext.getSource()).R())))).then(class07686.y((String)"score").then(class07686.N((String)"target", (ArgumentType)class07786.N()).suggests(class07786.N).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"targetObjective", (ArgumentType)class07794.N()).then(class07686.y((String)"=").then(class07686.N((String)"source", (ArgumentType)class07786.N()).suggests(class07786.N).then(class01577.N(commandNode, class07686.N((String)"sourceObjective", (ArgumentType)class07794.N()), bl, (CommandContext<class07701> commandContext) -> class01577.N((CommandContext<class07701>)commandContext, (n, n2) -> n == n2)))))).then(class07686.y((String)"<").then(class07686.N((String)"source", (ArgumentType)class07786.N()).suggests(class07786.N).then(class01577.N(commandNode, class07686.N((String)"sourceObjective", (ArgumentType)class07794.N()), bl, (CommandContext<class07701> commandContext) -> class01577.N((CommandContext<class07701>)commandContext, (n, n2) -> n < n2)))))).then(class07686.y((String)"<=").then(class07686.N((String)"source", (ArgumentType)class07786.N()).suggests(class07786.N).then(class01577.N(commandNode, class07686.N((String)"sourceObjective", (ArgumentType)class07794.N()), bl, (CommandContext<class07701> commandContext) -> class01577.N((CommandContext<class07701>)commandContext, (n, n2) -> n <= n2)))))).then(class07686.y((String)">").then(class07686.N((String)"source", (ArgumentType)class07786.N()).suggests(class07786.N).then(class01577.N(commandNode, class07686.N((String)"sourceObjective", (ArgumentType)class07794.N()), bl, (CommandContext<class07701> commandContext) -> class01577.N((CommandContext<class07701>)commandContext, (n, n2) -> n > n2)))))).then(class07686.y((String)">=").then(class07686.N((String)"source", (ArgumentType)class07786.N()).suggests(class07786.N).then(class01577.N(commandNode, class07686.N((String)"sourceObjective", (ArgumentType)class07794.N()), bl, (CommandContext<class07701> commandContext) -> class01577.N((CommandContext<class07701>)commandContext, (n, n2) -> n >= n2)))))).then(class07686.y((String)"matches").then(class01577.N(commandNode, class07686.N((String)"range", (ArgumentType)class07788.N()), bl, (CommandContext<class07701> commandContext) -> class01577.N((CommandContext<class07701>)commandContext, class07767.N((CommandContext)commandContext, (String)"range"))))))))).then(class07686.y((String)"blocks").then(class07686.N((String)"start", (ArgumentType)class00894.N()).then(class07686.N((String)"end", (ArgumentType)class00894.N()).then(((RequiredArgumentBuilder)class07686.N((String)"destination", (ArgumentType)class00894.N()).then(class01577.N(commandNode, class07686.y((String)"all"), bl, false))).then(class01577.N(commandNode, class07686.y((String)"masked"), bl, true))))))).then(class07686.y((String)"entity").then(((RequiredArgumentBuilder)class07686.N((String)"entities", (ArgumentType)class07680.y()).fork(commandNode, commandContext -> class01577.N((CommandContext<class07701>)commandContext, bl, !class07680.L((CommandContext)commandContext, (String)"entities").isEmpty()))).executes(class01577.N(bl, (CommandContext<class07701> commandContext) -> class07680.L((CommandContext)commandContext, (String)"entities").size()))))).then(class07686.y((String)"predicate").then(class01577.N(commandNode, class07686.N((String)"predicate", (ArgumentType)class02198.L((class04348)class043482)), bl, (CommandContext<class07701> commandContext) -> class01577.N((class07701)commandContext.getSource(), (class03556<class05957>)class02198.L((CommandContext)commandContext, (String)"predicate")))))).then(class07686.y((String)"function").then(class07686.N((String)"name", (ArgumentType)class06808.N()).suggests(class01568.L).fork(commandNode, (RedirectModifier)new class01546(bl))))).then(((LiteralArgumentBuilder)class07686.y((String)"items").then(class07686.y((String)"entity").then(class07686.N((String)"entities", (ArgumentType)class07680.y()).then(class07686.N((String)"slots", (ArgumentType)class02494.N()).then(((RequiredArgumentBuilder)class07686.N((String)"item_predicate", (ArgumentType)class06793.N((class04348)class043482)).fork(commandNode, commandContext -> class01577.N((CommandContext<class07701>)commandContext, bl, class01577.N(class07680.y((CommandContext)commandContext, (String)"entities"), class02494.N((CommandContext)commandContext, (String)"slots"), (Predicate<class06584>)class06793.N((CommandContext)commandContext, (String)"item_predicate")) > 0))).executes(class01577.N(bl, (CommandContext<class07701> commandContext) -> class01577.N(class07680.y((CommandContext)commandContext, (String)"entities"), class02494.N((CommandContext)commandContext, (String)"slots"), (Predicate<class06584>)class06793.N((CommandContext)commandContext, (String)"item_predicate"))))))))).then(class07686.y((String)"block").then(class07686.N((String)"pos", (ArgumentType)class00894.N()).then(class07686.N((String)"slots", (ArgumentType)class02494.N()).then(((RequiredArgumentBuilder)class07686.N((String)"item_predicate", (ArgumentType)class06793.N((class04348)class043482)).fork(commandNode, commandContext -> class01577.N((CommandContext<class07701>)commandContext, bl, class01577.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class02494.N((CommandContext)commandContext, (String)"slots"), (Predicate<class06584>)class06793.N((CommandContext)commandContext, (String)"item_predicate")) > 0))).executes(class01577.N(bl, (CommandContext<class07701> commandContext) -> class01577.N((class07701)commandContext.getSource(), class00894.N((CommandContext)commandContext, (String)"pos"), class02494.N((CommandContext)commandContext, (String)"slots"), (Predicate<class06584>)class06793.N((CommandContext)commandContext, (String)"item_predicate")))))))))).then(class07686.y((String)"stopwatch").then(class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(class06956.y).then(class01577.N(commandNode, class07686.N((String)"range", (ArgumentType)class07788.y()), bl, (CommandContext<class07701> commandContext) -> class01577.N((CommandContext<class07701>)commandContext, class07766.N((CommandContext)commandContext, (String)"range"))))));
        for (class05622 class056222 : class05616.L) {
            literalArgumentBuilder.then(class056222.N((ArgumentBuilder)class07686.y((String)"data"), (T argumentBuilder) -> argumentBuilder.then(((RequiredArgumentBuilder)class07686.N((String)"path", (ArgumentType)class07759.N()).fork(commandNode, commandContext -> class01577.N((CommandContext<class07701>)commandContext, bl, class01577.N(class056222.N(commandContext), class07759.N((CommandContext)commandContext, (String)"path")) > 0))).executes(class01577.N(bl, (CommandContext<class07701> commandContext) -> class01577.N(class056222.N(commandContext), class07759.N((CommandContext)commandContext, (String)"path")))))));
        }
        return literalArgumentBuilder;
    }

    private static int N(Iterable<? extends class06843> iterable, class02466 class024662, Predicate<class06584> predicate) {
        int n = 0;
        for (class06843 class068432 : iterable) {
            IntList intList = class024662.N();
            for (int i = 0; i < intList.size(); ++i) {
                class06584 class065842;
                int n2 = intList.getInt(i);
                class04803 class048032 = class068432.method_32318(n2);
                if (class048032 == null || !predicate.test(class065842 = class048032.N())) continue;
                n += class065842.c();
            }
        }
        return n;
    }

    private static boolean N(CommandContext<class07701> commandContext, class09474 class094742) throws CommandSyntaxException {
        class01766 class017662 = class07786.N(commandContext, (String)"target");
        class00518 class005182 = class07794.N(commandContext, (String)"targetObjective");
        class01766 class017663 = class07786.N(commandContext, (String)"source");
        class00518 class005183 = class07794.N(commandContext, (String)"sourceObjective");
        class06394 class063942 = ((class07701)commandContext.getSource()).W().yB();
        class01788 class017882 = class063942.y(class017662, class005182);
        class01788 class017883 = class063942.y(class017663, class005183);
        if (class017882 == null || class017883 == null) {
            return false;
        }
        return class094742.test(class017882.y(), class017883.y());
    }
}

