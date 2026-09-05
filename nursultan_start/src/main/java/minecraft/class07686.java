/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10206
 *  Nursultan.class10560
 *  Nursultan.class10564
 *  Nursultan.class10567
 *  Nursultan.class10783
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.ResultConsumer
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  com.mojang.logging.LogUtils
 *  minecraft.class00017
 *  minecraft.class00024
 *  minecraft.class00249
 *  minecraft.class00381
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class00940
 *  minecraft.class01537
 *  minecraft.class01538
 *  minecraft.class01542
 *  minecraft.class01543
 *  minecraft.class01544
 *  minecraft.class01545
 *  minecraft.class01547
 *  minecraft.class01549
 *  minecraft.class01553
 *  minecraft.class01556
 *  minecraft.class01557
 *  minecraft.class01558
 *  minecraft.class01560
 *  minecraft.class01561
 *  minecraft.class01563
 *  minecraft.class01564
 *  minecraft.class01566
 *  minecraft.class01568
 *  minecraft.class01575
 *  minecraft.class01577
 *  minecraft.class01685
 *  minecraft.class01701
 *  minecraft.class01703
 *  minecraft.class01711
 *  minecraft.class01752
 *  minecraft.class01760
 *  minecraft.class01808
 *  minecraft.class01834
 *  minecraft.class01906
 *  minecraft.class01929
 *  minecraft.class02094
 *  minecraft.class02891
 *  minecraft.class03102
 *  minecraft.class03131
 *  minecraft.class03186
 *  minecraft.class03282
 *  minecraft.class03305
 *  minecraft.class03671
 *  minecraft.class04014
 *  minecraft.class04105
 *  minecraft.class04163
 *  minecraft.class04180
 *  minecraft.class04207
 *  minecraft.class04348
 *  minecraft.class04556
 *  minecraft.class04770
 *  minecraft.class05195
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05512
 *  minecraft.class05588
 *  minecraft.class05595
 *  minecraft.class05597
 *  minecraft.class05609
 *  minecraft.class05613
 *  minecraft.class05616
 *  minecraft.class05620
 *  minecraft.class05624
 *  minecraft.class05625
 *  minecraft.class05626
 *  minecraft.class05627
 *  minecraft.class05843
 *  minecraft.class05931
 *  minecraft.class06188
 *  minecraft.class06190
 *  minecraft.class06192
 *  minecraft.class06195
 *  minecraft.class06200
 *  minecraft.class06205
 *  minecraft.class06206
 *  minecraft.class06208
 *  minecraft.class06210
 *  minecraft.class06211
 *  minecraft.class06213
 *  minecraft.class06214
 *  minecraft.class06215
 *  minecraft.class06217
 *  minecraft.class06223
 *  minecraft.class06226
 *  minecraft.class06352
 *  minecraft.class06381
 *  minecraft.class06395
 *  minecraft.class06399
 *  minecraft.class06401
 *  minecraft.class06405
 *  minecraft.class06406
 *  minecraft.class06407
 *  minecraft.class06412
 *  minecraft.class06416
 *  minecraft.class06420
 *  minecraft.class06421
 *  minecraft.class06423
 *  minecraft.class06424
 *  minecraft.class06426
 *  minecraft.class06541
 *  minecraft.class06789
 *  minecraft.class06889
 *  minecraft.class06956
 *  minecraft.class07109
 *  minecraft.class07233
 *  minecraft.class07273
 *  minecraft.class07305
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07704
 *  minecraft.class08149
 *  minecraft.class08152
 *  minecraft.class08160
 *  minecraft.class08162
 *  minecraft.class08164
 *  minecraft.class08166
 *  minecraft.class08168
 *  minecraft.class08700
 *  minecraft.class09012
 *  net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback
 *  net.fabricmc.loader.api.FabricLoader
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10206;
import Nursultan.class10560;
import Nursultan.class10564;
import Nursultan.class10567;
import Nursultan.class10783;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import minecraft.class00017;
import minecraft.class00024;
import minecraft.class00249;
import minecraft.class00381;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00940;
import minecraft.class01537;
import minecraft.class01538;
import minecraft.class01542;
import minecraft.class01543;
import minecraft.class01544;
import minecraft.class01545;
import minecraft.class01547;
import minecraft.class01549;
import minecraft.class01553;
import minecraft.class01556;
import minecraft.class01557;
import minecraft.class01558;
import minecraft.class01560;
import minecraft.class01561;
import minecraft.class01563;
import minecraft.class01564;
import minecraft.class01566;
import minecraft.class01568;
import minecraft.class01575;
import minecraft.class01577;
import minecraft.class01685;
import minecraft.class01701;
import minecraft.class01703;
import minecraft.class01711;
import minecraft.class01752;
import minecraft.class01760;
import minecraft.class01808;
import minecraft.class01834;
import minecraft.class01906;
import minecraft.class01929;
import minecraft.class02094;
import minecraft.class02891;
import minecraft.class03102;
import minecraft.class03131;
import minecraft.class03186;
import minecraft.class03282;
import minecraft.class03305;
import minecraft.class03671;
import minecraft.class04014;
import minecraft.class04105;
import minecraft.class04163;
import minecraft.class04180;
import minecraft.class04207;
import minecraft.class04348;
import minecraft.class04556;
import minecraft.class04770;
import minecraft.class05195;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05512;
import minecraft.class05588;
import minecraft.class05595;
import minecraft.class05597;
import minecraft.class05609;
import minecraft.class05613;
import minecraft.class05616;
import minecraft.class05620;
import minecraft.class05624;
import minecraft.class05625;
import minecraft.class05626;
import minecraft.class05627;
import minecraft.class05843;
import minecraft.class05931;
import minecraft.class06188;
import minecraft.class06190;
import minecraft.class06192;
import minecraft.class06195;
import minecraft.class06200;
import minecraft.class06205;
import minecraft.class06206;
import minecraft.class06208;
import minecraft.class06210;
import minecraft.class06211;
import minecraft.class06213;
import minecraft.class06214;
import minecraft.class06215;
import minecraft.class06217;
import minecraft.class06223;
import minecraft.class06226;
import minecraft.class06352;
import minecraft.class06381;
import minecraft.class06395;
import minecraft.class06399;
import minecraft.class06401;
import minecraft.class06405;
import minecraft.class06406;
import minecraft.class06407;
import minecraft.class06412;
import minecraft.class06416;
import minecraft.class06420;
import minecraft.class06421;
import minecraft.class06423;
import minecraft.class06424;
import minecraft.class06426;
import minecraft.class06541;
import minecraft.class06789;
import minecraft.class06889;
import minecraft.class06956;
import minecraft.class07109;
import minecraft.class07233;
import minecraft.class07273;
import minecraft.class07305;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07671;
import minecraft.class07673;
import minecraft.class07701;
import minecraft.class07703;
import minecraft.class07704;
import minecraft.class08149;
import minecraft.class08152;
import minecraft.class08160;
import minecraft.class08162;
import minecraft.class08164;
import minecraft.class08166;
import minecraft.class08168;
import minecraft.class08700;
import minecraft.class09012;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.loader.api.FabricLoader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07686 {
    public static final String N = "/";
    private static final ThreadLocal<@Nullable class01752<class07701>> M = new ThreadLocal();
    private static final Logger B = LogUtils.getLogger();
    public static final class08164 y = class08160.y;
    public static final class08164 L = new class08149(class08162.N);
    public static final class08164 u = new class08149(class08162.y);
    public static final class08164 i = new class08149(class08162.L);
    public static final class08164 R = new class08149(class08162.u);
    private static final class07273<class07701> Z = new class07704();
    private final CommandDispatcher<class07701> z = new CommandDispatcher();

    public class07686(class07671 class076712, class04348 class043482) {
        class06405.N(this.z);
        class05195.N(this.z, (class04348)class043482);
        class01577.N(this.z, (class04348)class043482);
        class06426.N(this.z, (class04348)class043482);
        class06424.N(this.z, (class04348)class043482);
        class06416.N(this.z, (class04348)class043482);
        class03671.N(this.z, (class04348)class043482);
        class05616.N(this.z);
        class06395.N(this.z, (class04348)class043482);
        class06401.N(this.z);
        class06406.N(this.z);
        class09012.N(this.z, (class04348)class043482);
        class06420.N(this.z);
        class06412.N(this.z, (class04348)class043482);
        class01547.N(this.z);
        class01545.N(this.z, (class04348)class043482);
        class01558.N(this.z);
        class01553.N(this.z, (class04348)class043482);
        class04207.N(this.z, (class04348)class043482);
        class01560.N(this.z);
        class01568.N(this.z);
        class01557.N(this.z);
        class01549.N(this.z, (class04348)class043482);
        class01542.N(this.z, (class04348)class043482);
        class01543.N(this.z);
        class06352.N(this.z, (class04348)class043482);
        class01544.N(this.z);
        class01563.N(this.z);
        class01561.N(this.z);
        class01556.N(this.z, (class04348)class043482);
        class06381.N(this.z, (class04348)class043482);
        class01564.N(this.z);
        class01575.N(this.z, (class04348)class043482);
        class03186.N(this.z);
        class06195.N(this.z);
        class04180.N(this.z);
        class06200.N(this.z);
        class06215.N(this.z);
        class00940.N(this.z);
        class10206.N(this.z);
        class02094.N(this.z);
        class00249.N(this.z);
        class06210.N(this.z);
        class06217.N(this.z);
        class06206.N(this.z, (class04348)class043482);
        class06213.N(this.z, (class076712 != class07671.field_25421 ? 1 : 0) != 0);
        class00017.N(this.z, (class076712 != class07671.field_25421 ? 1 : 0) != 0);
        class06192.N(this.z, (class04348)class043482);
        class06205.N(this.z);
        class06208.N(this.z);
        class05931.N(this.z);
        class06190.N(this.z);
        class06226.N(this.z);
        class06956.N(this.z);
        class06214.N(this.z, (class04348)class043482);
        class05597.N(this.z);
        class05595.N(this.z, (class04348)class043482);
        class05843.N(this.z);
        class05625.N(this.z);
        class05588.N(this.z, (class04348)class043482);
        class05512.N(this.z, (class04348)class043482);
        class03131.N(this.z);
        class05609.N(this.z);
        class05626.N(this.z, (class04348)class043482);
        class05624.N(this.z);
        class00024.N(this.z, (class04348)class043482);
        class05620.N(this.z);
        class05627.N(this.z);
        if (class01834.M.i()) {
            class01808.N(this.z);
        }
        if (class07529.Nm) {
            class03305.N(this.z);
        }
        if (class07529.Ns || class07529.ND) {
            class01685.N(this.z, (class04348)class043482);
            class01703.N(this.z);
            class01701.N(this.z);
            class04014.N(this.z);
            class03282.N(this.z);
            class01760.N(this.z);
            if (class076712.field_25423) {
                class04163.N(this.z, (class04348)class043482);
            }
        }
        if (class076712.field_25423) {
            this.y(class076712, class043482, null);
            class06423.N(this.z);
            class06399.N(this.z);
            class06407.N(this.z);
            class06421.N(this.z);
            class01537.N(this.z);
            class01538.N(this.z);
            class01566.N(this.z);
            class04556.N(this.z);
            class10564.N(this.z);
            class10567.N(this.z);
            class10560.N(this.z);
            class06211.N(this.z);
            class06188.N(this.z);
            class02891.N(this.z);
            class05613.N(this.z);
        }
        if (class076712.field_25422) {
            class06223.N(this.z);
        }
        ResultConsumer resultConsumer = class01711.k();
        this.N(class076712, class043482, null);
        this.z.setConsumer(resultConsumer);
    }

    private void y(class07671 class076712, class04348 class043482, CallbackInfo callbackInfo) {
        if (class07529.ND) {
            return;
        }
        if (!FabricLoader.getInstance().isDevelopmentEnvironment()) {
            return;
        }
        class04163.N(this.z, (class04348)class043482);
    }

    public static <S> @Nullable CommandSyntaxException y(ParseResults<S> parseResults) {
        if (!parseResults.getReader().canRead()) {
            return null;
        }
        if (parseResults.getExceptions().size() == 1) {
            return (CommandSyntaxException)((Object)parseResults.getExceptions().values().iterator().next());
        }
        if (parseResults.getContext().getRange().isEmpty()) {
            return CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parseResults.getReader());
        }
        return CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(parseResults.getReader());
    }

    public static LiteralArgumentBuilder<class07701> y(String string) {
        return LiteralArgumentBuilder.literal((String)string);
    }

    public static void y() {
        class04348 class043482 = class07686.N(class04105.N());
        CommandDispatcher<class07701> var1 = new class07686(class07671.field_25419, class043482).N();
        RootCommandNode var2 = var1.getRoot();
        var1.findAmbiguities((commandNode, commandNode2, commandNode3, collection) -> B.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{var1.getPath(commandNode2), var1.getPath(commandNode3), collection}));
        Set set = class01906.N((CommandNode)var2).stream().filter(argumentType -> !class06789.N((Class)argumentType.getClass())).collect(Collectors.toSet());
        if (!set.isEmpty()) {
            B.warn("Missing type registration for following arguments:\n {}", (Object)set.stream().map(argumentType -> "\t" + String.valueOf(argumentType)).collect(Collectors.joining(",\n")));
            throw new IllegalStateException("Unregistered argument types");
        }
    }

    public static String N(String string) {
        return string.startsWith(N) ? string.substring(1) : string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(ParseResults<class07701> parseResults, String string) {
        class07701 class077012 = (class07701)parseResults.getContext().getSource();
        class08700.N().N(() -> N + string);
        ContextChain<class07701> var4 = class07686.N(parseResults, string, class077012);
        try {
            if (var4 != null) {
                class07686.N(class077012, (class01752<class07701> class017522) -> class01752.N((class01752)class017522, (String)string, (ContextChain)var4, (class01711)class077012, (class03102)class03102.N));
            }
        }
        catch (Exception exception) {
            class05216 class052162 = class00392.y((String)(exception.getMessage() == null ? exception.getClass().getName() : exception.getMessage()));
            if (B.isDebugEnabled()) {
                B.error("Command exception: /{}", (Object)string, (Object)exception);
                StackTraceElement[] stackTraceElementArray = exception.getStackTrace();
                for (int i = 0; i < Math.min(stackTraceElementArray.length, 3); ++i) {
                    class052162.i("\n\n").i(stackTraceElementArray[i].getMethodName()).i("\n ").i(stackTraceElementArray[i].getFileName()).i(":").i(String.valueOf(stackTraceElementArray[i].getLineNumber()));
                }
            }
            class077012.y((class00392)class00392.L((String)"command.failed").N(class004052 -> class004052.N((class00395)new class00401((class00392)class052162))));
            if (class07529.NP || class07529.ND) {
                class077012.y((class00392)class00392.y((String)class07536.L((Throwable)exception)));
                B.error("'/{}' threw an exception", (Object)string, (Object)exception);
            }
        }
        finally {
            class08700.N().L();
        }
    }

    public static class04348 N(class01929 class019292) {
        return new class10783(class019292);
    }

    private void N(class07671 class076712, class04348 class043482, CallbackInfo callbackInfo) {
        ((CommandRegistrationCallback)CommandRegistrationCallback.EVENT.invoker()).register(this.z, class043482, class076712);
    }

    public static <S> ParseResults<S> N(ParseResults<S> parseResults, UnaryOperator<S> unaryOperator) {
        CommandContextBuilder commandContextBuilder = parseResults.getContext();
        CommandContextBuilder commandContextBuilder2 = commandContextBuilder.withSource(unaryOperator.apply(commandContextBuilder.getSource()));
        return new ParseResults(commandContextBuilder2, parseResults.getReader(), parseResults.getExceptions());
    }

    public void N(class07701 class077012, String string) {
        string = class07686.N(string);
        this.N((ParseResults<class07701>)this.z.parse(string, (Object)class077012), string);
    }

    public void N(class04770 class047702) {
        HashMap hashMap = new HashMap();
        RootCommandNode rootCommandNode = new RootCommandNode();
        hashMap.put((CommandNode)this.z.getRoot(), (CommandNode)rootCommandNode);
        class07686.N(this.z.getRoot(), rootCommandNode, class047702.method_64396(), hashMap);
        class047702.field_13987.method_14364((class00381)new class07233(rootCommandNode, Z));
    }

    public static <S> void N(ParseResults<S> parseResults) throws CommandSyntaxException {
        CommandSyntaxException commandSyntaxException = class07686.y(parseResults);
        if (commandSyntaxException != null) {
            throw commandSyntaxException;
        }
    }

    public CommandDispatcher<class07701> N() {
        return this.z;
    }

    public static Predicate<String> N_80(class07673 class076732) {
        return string -> {
            try {
                class076732.parse(new StringReader(string));
                return true;
            }
            catch (CommandSyntaxException commandSyntaxException) {
                return false;
            }
        };
    }

    public static <T> RequiredArgumentBuilder<class07701, T> N(String string, ArgumentType<T> argumentType) {
        return RequiredArgumentBuilder.argument((String)string, argumentType);
    }

    private static <S> void N(CommandNode<S> commandNode, CommandNode<S> commandNode2, S s, Map<CommandNode<S>, CommandNode<S>> map) {
        for (CommandNode commandNode3 : commandNode.getChildren()) {
            if (!commandNode3.canUse(s)) continue;
            ArgumentBuilder argumentBuilder = commandNode3.createBuilder();
            if (argumentBuilder.getRedirect() != null) {
                argumentBuilder.redirect(map.get(argumentBuilder.getRedirect()));
            }
            CommandNode commandNode4 = argumentBuilder.build();
            map.put(commandNode3, commandNode4);
            commandNode2.addChild(commandNode4);
            if (commandNode3.getChildren().isEmpty()) continue;
            class07686.N(commandNode3, commandNode4, s, map);
        }
    }

    public static class07701 N(class08152 class081522) {
        return new class07701(class07703.j_, class06889.L, class07109.N, null, class081522, "", class05220.N, null, null);
    }

    public static <T extends class08168> class08166<T> N(class08164 class081642) {
        return new class08166(class081642);
    }

    private static @Nullable ContextChain<class07701> N(ParseResults<class07701> parseResults, String string, class07701 class077012) {
        try {
            class07686.N(parseResults);
            return (ContextChain)ContextChain.tryFlatten((CommandContext)parseResults.getContext().build(string)).orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parseResults.getReader()));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            class077012.y(class00390.N((Message)commandSyntaxException.getRawMessage()));
            if (commandSyntaxException.getInput() != null && commandSyntaxException.getCursor() >= 0) {
                int n = Math.min(commandSyntaxException.getInput().length(), commandSyntaxException.getCursor());
                class05216 class052162 = class00392.i().N(class06541.field_1080).N(class004052 -> class004052.N((class00647)new class00640(N + string)));
                if (n > 10) {
                    class052162.y(class05220.G);
                }
                class052162.i(commandSyntaxException.getInput().substring(Math.max(0, n - 10), n));
                if (n < commandSyntaxException.getInput().length()) {
                    class05216 class052163 = class00392.y((String)commandSyntaxException.getInput().substring(n)).N(new class06541[]{class06541.field_1061, class06541.field_1073});
                    class052162.y((class00392)class052163);
                }
                class052162.y((class00392)class00392.L((String)"command.context.here").N(new class06541[]{class06541.field_1061, class06541.field_1056}));
                class077012.y((class00392)class052162);
            }
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void N(class07701 class077012, Consumer<class01752<class07701>> consumer) {
        block9: {
            class01752<class07701> var2 = M.get();
            if (var2 == null) {
                class07305 class073052 = class077012.R().method_64395();
                int n = Math.max(1, (Integer)class073052.N(class07305.w));
                int n2 = (Integer)class073052.N(class07305.d);
                try (class01752 class017522 = new class01752(n, n2, class08700.N());){
                    M.set((class01752<class07701>)class017522);
                    consumer.accept((class01752<class07701>)class017522);
                    class017522.N();
                    break block9;
                }
                finally {
                    M.set(null);
                }
            }
            consumer.accept(var2);
        }
    }
}

