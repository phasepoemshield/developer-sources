/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10399
 *  Nursultan.class10408
 *  joptsimple.AbstractOptionSpec
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 *  minecraft.class00136
 *  minecraft.class00392
 *  minecraft.class01035
 *  minecraft.class01147
 *  minecraft.class01895
 *  minecraft.class01911
 *  minecraft.class01919
 *  minecraft.class01929
 *  minecraft.class01949
 *  minecraft.class01992
 *  minecraft.class01996
 *  minecraft.class01998
 *  minecraft.class02009
 *  minecraft.class02025
 *  minecraft.class02223
 *  minecraft.class02239
 *  minecraft.class02496
 *  minecraft.class02594
 *  minecraft.class02909
 *  minecraft.class02957
 *  minecraft.class03745
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class03905
 *  minecraft.class03919
 *  minecraft.class04105
 *  minecraft.class04144
 *  minecraft.class04408
 *  minecraft.class04447
 *  minecraft.class05633
 *  minecraft.class06874
 *  minecraft.class06887
 *  minecraft.class06904
 *  minecraft.class06905
 *  minecraft.class07002
 *  minecraft.class07008
 *  minecraft.class07016
 *  minecraft.class07025
 *  minecraft.class07028
 *  minecraft.class07094
 *  minecraft.class07106
 *  minecraft.class07124
 *  minecraft.class07125
 *  minecraft.class07130
 *  minecraft.class07135
 *  minecraft.class07421
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07567
 *  minecraft.class08271
 */
package net.minecraft.data;

import Nursultan.class10399;
import Nursultan.class10408;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import minecraft.class00136;
import minecraft.class00392;
import minecraft.class01035;
import minecraft.class01147;
import minecraft.class01895;
import minecraft.class01911;
import minecraft.class01919;
import minecraft.class01929;
import minecraft.class01949;
import minecraft.class01992;
import minecraft.class01996;
import minecraft.class01998;
import minecraft.class02009;
import minecraft.class02025;
import minecraft.class02223;
import minecraft.class02239;
import minecraft.class02496;
import minecraft.class02594;
import minecraft.class02909;
import minecraft.class02957;
import minecraft.class03745;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class03905;
import minecraft.class03919;
import minecraft.class04105;
import minecraft.class04144;
import minecraft.class04408;
import minecraft.class04447;
import minecraft.class05633;
import minecraft.class06874;
import minecraft.class06887;
import minecraft.class06904;
import minecraft.class06905;
import minecraft.class07002;
import minecraft.class07008;
import minecraft.class07016;
import minecraft.class07025;
import minecraft.class07028;
import minecraft.class07094;
import minecraft.class07106;
import minecraft.class07124;
import minecraft.class07125;
import minecraft.class07130;
import minecraft.class07135;
import minecraft.class07421;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07567;
import minecraft.class08271;

public class Main {
    public static void main(String[] stringArray) throws IOException {
        class07529.N();
        OptionParser optionParser = new OptionParser();
        AbstractOptionSpec var2 = optionParser.accepts("help", "Show the help menu").forHelp();
        OptionSpecBuilder optionSpecBuilder = optionParser.accepts("server", "Include server generators");
        OptionSpecBuilder optionSpecBuilder2 = optionParser.accepts("dev", "Include development tools");
        OptionSpecBuilder optionSpecBuilder3 = optionParser.accepts("reports", "Include data reports");
        optionParser.accepts("validate", "Validate inputs");
        OptionSpecBuilder optionSpecBuilder4 = optionParser.accepts("all", "Include all generators");
        ArgumentAcceptingOptionSpec var7 = optionParser.accepts("output", "Output folder").withRequiredArg().defaultsTo((Object)"generated", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec var8 = optionParser.accepts("input", "Input folder").withRequiredArg();
        OptionSet optionSet = optionParser.parse(stringArray);
        if (optionSet.has((OptionSpec)var2) || !optionSet.hasOptions()) {
            optionParser.printHelpOn((OutputStream)System.out);
            return;
        }
        Path path = Paths.get((String)var7.value(optionSet), new String[0]);
        boolean bl = optionSet.has((OptionSpec)optionSpecBuilder4);
        boolean bl2 = bl || optionSet.has((OptionSpec)optionSpecBuilder);
        boolean bl3 = bl || optionSet.has((OptionSpec)optionSpecBuilder2);
        boolean bl4 = bl || optionSet.has((OptionSpec)optionSpecBuilder3);
        List list = optionSet.valuesOf((OptionSpec)var8).stream().map(string -> Paths.get(string, new String[0])).toList();
        class07094 class070942 = new class07094(path, class07529.y(), true);
        Main.N(class070942, list, bl2, bl3, bl4);
        class070942.method_10315();
        class07536.U();
    }

    private static <T extends class07135> class07124<T> N(BiFunction<class01996, CompletableFuture<class01929>, T> biFunction, CompletableFuture<class01929> completableFuture) {
        return class019962 -> (class07135)biFunction.apply(class019962, completableFuture);
    }

    public static void N(class07094 class070942, Collection<Path> collection, boolean bl, boolean bl2, boolean bl3) {
        Object object = class070942.method_46564(bl);
        object.method_46566(class019962 -> new class06874(class019962, (Iterable)collection).N((class06904)new class05633()));
        object = CompletableFuture.supplyAsync(class04105::N, (Executor)class07536.B());
        class07125 class071252 = class070942.method_46564(bl);
        class071252.method_46566(Main.N(class01035::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class01998::N, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class02009::N, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class01992::new, (CompletableFuture<class01929>)object));
        class07028 class070282 = (class07028)class071252.method_46566(Main.N(class07002::new, (CompletableFuture<class01929>)object));
        class07028 class070283 = (class07028)class071252.method_46566(Main.N(class07016::new, (CompletableFuture<class01929>)object));
        class07028 class070284 = (class07028)class071252.method_46566(Main.N(class03905::new, (CompletableFuture<class01929>)object));
        class07028 class070285 = (class07028)class071252.method_46566(Main.N(class10408::new, (CompletableFuture<class01929>)object));
        class07028 class070286 = (class07028)class071252.method_46566(Main.N(class04408::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class01949::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class00136::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class07025::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class01919::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class07008::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class01147::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class10399::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class04447::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class03919::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class01895::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class02909::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class07567::new, (CompletableFuture<class01929>)object));
        class071252 = class070942.method_46564(bl2);
        class071252.method_46566(class019962 -> new class06887(class019962, collection));
        class071252 = class070942.method_46564(bl3);
        class071252.method_46566(Main.N(class01911::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class02496::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class07106::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(Main.N(class07130::new, (CompletableFuture<class01929>)object));
        class071252.method_46566(class06905::new);
        class071252.method_46566(class02594::new);
        class071252.method_46566(class08271::new);
        class071252.method_46566(class07421::new);
        CompletableFuture var11 = class02223.N((CompletableFuture)object);
        CompletionStage completionStage = var11.thenApply(class04144::y);
        class07125 class071253 = class070942.method_46565(bl, "trade_rebalance");
        class071253.method_46566(Main.N(class01035::new, (CompletableFuture<class01929>)completionStage));
        class071253.method_46566(class019962 -> class02025.N((class01996)class019962, (class00392)class00392.L((String)"dataPack.trade_rebalance.description"), (class03767)class03767.N((class02957)class03794.y)));
        class071253.method_46566(Main.N(class03745::N, (CompletableFuture<class01929>)object));
        class071253.method_46566(Main.N(class02239::new, (CompletableFuture<class01929>)object));
        class071252 = class070942.method_46565(bl, "redstone_experiments");
        class071252.method_46566(class019962 -> class02025.N((class01996)class019962, (class00392)class00392.L((String)"dataPack.redstone_experiments.description"), (class03767)class03767.N((class02957)class03794.L)));
        class071252 = class070942.method_46565(bl, "minecart_improvements");
        class071252.method_46566(class019962 -> class02025.N((class01996)class019962, (class00392)class00392.L((String)"dataPack.minecart_improvements.description"), (class03767)class03767.N((class02957)class03794.u)));
    }
}

