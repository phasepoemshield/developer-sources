/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09427
 *  Nursultan.class09428
 *  Nursultan.class09433
 *  Nursultan.class09454
 *  Nursultan.class09945
 *  Nursultan.class09948
 *  Nursultan.class09958
 *  Nursultan.class11883
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  com.mojang.util.UndashedUuid
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 *  minecraft.class01018
 *  minecraft.class01040
 *  minecraft.class01240
 *  minecraft.class01268
 *  minecraft.class01276
 *  minecraft.class01282
 *  minecraft.class01487
 *  minecraft.class01834
 *  minecraft.class01962
 *  minecraft.class02117
 *  minecraft.class03215
 *  minecraft.class03467
 *  minecraft.class03914
 *  minecraft.class04544
 *  minecraft.class04771
 *  minecraft.class04999
 *  minecraft.class05715
 *  minecraft.class05909
 *  minecraft.class06202
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07980
 *  minecraft.class08695
 *  minecraft.class08824
 *  org.apache.commons.lang3.StringEscapeUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.minecraft.client.main;

import Nursultan.class09427;
import Nursultan.class09428;
import Nursultan.class09433;
import Nursultan.class09454;
import Nursultan.class09945;
import Nursultan.class09948;
import Nursultan.class09958;
import Nursultan.class11883;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import minecraft.class01018;
import minecraft.class01040;
import minecraft.class01240;
import minecraft.class01268;
import minecraft.class01276;
import minecraft.class01282;
import minecraft.class01487;
import minecraft.class01834;
import minecraft.class01962;
import minecraft.class02117;
import minecraft.class03215;
import minecraft.class03467;
import minecraft.class03914;
import minecraft.class04544;
import minecraft.class04771;
import minecraft.class04999;
import minecraft.class05715;
import minecraft.class05909;
import minecraft.class06202;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07980;
import minecraft.class08695;
import minecraft.class08824;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class Main {
    private static boolean L(@Nullable String string) {
        return string != null && !string.isEmpty();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void main(String[] stringArray) {
        class09454 class094542;
        String string;
        List list;
        Logger logger;
        Stopwatch stopwatch;
        Stopwatch stopwatch2;
        Main.N(stringArray, null);
        OptionParser optionParser = new OptionParser();
        Main.N(stringArray, null, optionParser);
        optionParser.allowsUnrecognizedOptions();
        optionParser.accepts("demo");
        optionParser.accepts("disableMultiplayer");
        optionParser.accepts("disableChat");
        optionParser.accepts("fullscreen");
        optionParser.accepts("checkGlErrors");
        OptionSpecBuilder optionSpecBuilder = optionParser.accepts("renderDebugLabels");
        OptionSpecBuilder optionSpecBuilder2 = optionParser.accepts("jfrProfile");
        OptionSpecBuilder optionSpecBuilder3 = optionParser.accepts("tracy");
        OptionSpecBuilder optionSpecBuilder4 = optionParser.accepts("tracyNoImages");
        ArgumentAcceptingOptionSpec var6 = optionParser.accepts("quickPlayPath").withRequiredArg();
        ArgumentAcceptingOptionSpec var7 = optionParser.accepts("quickPlaySingleplayer").withOptionalArg();
        ArgumentAcceptingOptionSpec var8 = optionParser.accepts("quickPlayMultiplayer").withRequiredArg();
        ArgumentAcceptingOptionSpec var9 = optionParser.accepts("quickPlayRealms").withRequiredArg();
        ArgumentAcceptingOptionSpec var10 = optionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo((Object)new File("."), (Object[])new File[0]);
        ArgumentAcceptingOptionSpec var11 = optionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec var12 = optionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec var13 = optionParser.accepts("proxyHost").withRequiredArg();
        ArgumentAcceptingOptionSpec var14 = optionParser.accepts("proxyPort").withRequiredArg().defaultsTo((Object)"8080", (Object[])new String[0]).ofType(Integer.class);
        ArgumentAcceptingOptionSpec var15 = optionParser.accepts("proxyUser").withRequiredArg();
        ArgumentAcceptingOptionSpec var16 = optionParser.accepts("proxyPass").withRequiredArg();
        ArgumentAcceptingOptionSpec var17 = optionParser.accepts("username").withRequiredArg().defaultsTo((Object)("Player" + System.currentTimeMillis() % 1000L), (Object[])new String[0]);
        OptionSpecBuilder optionSpecBuilder5 = optionParser.accepts("offlineDeveloperMode");
        ArgumentAcceptingOptionSpec var19 = optionParser.accepts("uuid").withRequiredArg();
        ArgumentAcceptingOptionSpec var20 = optionParser.accepts("xuid").withOptionalArg().defaultsTo((Object)"", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec var21 = optionParser.accepts("clientId").withOptionalArg().defaultsTo((Object)"", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec var22 = optionParser.accepts("accessToken").withRequiredArg().required();
        ArgumentAcceptingOptionSpec var23 = optionParser.accepts("version").withRequiredArg().required();
        ArgumentAcceptingOptionSpec var24 = optionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo((Object)854, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec var25 = optionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo((Object)480, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec var26 = optionParser.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
        ArgumentAcceptingOptionSpec var27 = optionParser.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
        ArgumentAcceptingOptionSpec var28 = optionParser.accepts("assetIndex").withRequiredArg();
        ArgumentAcceptingOptionSpec var29 = optionParser.accepts("versionType").withRequiredArg().defaultsTo((Object)"release", (Object[])new String[0]);
        NonOptionArgumentSpec var30 = optionParser.nonOptions();
        OptionSet optionSet = optionParser.parse(stringArray);
        File file = (File)Main.N(optionSet, var10);
        String string2 = (String)Main.N(optionSet, var23);
        String string3 = "Pre-bootstrap";
        try {
            if (optionSet.has((OptionSpec)optionSpecBuilder2)) {
                class01834.M.N(class03215.field_34412);
            }
            if (optionSet.has((OptionSpec)optionSpecBuilder3)) {
                class08695.N();
            }
            stopwatch2 = Stopwatch.createStarted((Ticker)Ticker.systemTicker());
            stopwatch = Stopwatch.createStarted((Ticker)Ticker.systemTicker());
            class03467.N.N(class02117.w, stopwatch2);
            class03467.N.N(class02117.k, stopwatch);
            class07529.N();
            TracyClient.reportAppInfo((String)("Minecraft Java Edition " + class07529.y().comp_4025()));
            CompletableFuture var39 = class04999.N((Set)class05715.field_42975);
            class07080.M();
            logger = LogUtils.getLogger();
            string3 = "Bootstrap";
            class03914.N();
            class08824.N();
            class03467.N.N(class03914.y.get());
            class03914.L();
            string3 = "Argument parsing";
            list = optionSet.valuesOf((OptionSpec)var30);
            if (!list.isEmpty()) {
                logger.info("Completely ignored arguments: {}", (Object)list);
            }
            string = (String)Main.N(optionSet, var13);
            Proxy proxy = Proxy.NO_PROXY;
            if (string != null) {
                try {
                    proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(string, (int)((Integer)Main.N(optionSet, var14))));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            String string4 = (String)Main.N(optionSet, var15);
            String string5 = (String)Main.N(optionSet, var16);
            if (!proxy.equals(Proxy.NO_PROXY) && Main.L(string4) && Main.L(string5)) {
                Authenticator.setDefault((Authenticator)new class09945(string4, string5));
            }
            int n = (Integer)Main.N(optionSet, var24);
            int n2 = (Integer)Main.N(optionSet, var25);
            OptionalInt optionalInt = Main.N((Integer)Main.N(optionSet, var26));
            OptionalInt optionalInt2 = Main.N((Integer)Main.N(optionSet, var27));
            boolean bl = optionSet.has("fullscreen");
            boolean bl2 = optionSet.has("demo");
            boolean bl3 = optionSet.has("disableMultiplayer");
            boolean bl4 = optionSet.has("disableChat");
            boolean bl5 = !optionSet.has((OptionSpec)optionSpecBuilder4);
            boolean bl6 = optionSet.has((OptionSpec)optionSpecBuilder);
            String string6 = (String)Main.N(optionSet, var29);
            File file2 = optionSet.has((OptionSpec)var11) ? (File)Main.N(optionSet, var11) : new File(file, "assets/");
            File file3 = optionSet.has((OptionSpec)var12) ? (File)Main.N(optionSet, var12) : new File(file, "resourcepacks/");
            UUID uUID = Main.N((OptionSpec<String>)var19, optionSet, logger) ? UndashedUuid.fromStringLenient((String)((String)var19.value(optionSet))) : class01487.N((String)((String)var17.value(optionSet)));
            String string7 = optionSet.has((OptionSpec)var28) ? (String)var28.value(optionSet) : null;
            String string8 = (String)optionSet.valueOf((OptionSpec)var20);
            String string9 = (String)optionSet.valueOf((OptionSpec)var21);
            String string10 = (String)Main.N(optionSet, var6);
            class01276 class012762 = Main.N(optionSet, (OptionSpec<String>)var7, (OptionSpec<String>)var8, (OptionSpec<String>)var9);
            class04771 class047712 = new class04771((String)var17.value(optionSet), uUID, (String)var22.value(optionSet), Main.y(string8), Main.y(string9));
            class094542 = new class09454(new class09427(class047712, proxy), new class01018(n, n2, optionalInt, optionalInt2, bl), new class09428(file, file3, file2, string7), new class09433(bl2, string2, string6, bl3, bl4, bl5, bl6, optionSet.has((OptionSpec)optionSpecBuilder5)), new class01040(string10, class012762));
            Main.N(null);
            class07536.s();
            var39.join();
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)string3);
            class07074 class070742 = class070802.N("Initialization");
            class04544.N((class07074)class070742);
            class06202.N(null, null, (String)string2, null, (class07080)class070802);
            class06202.N(null, (File)file, (class07080)class070802);
            return;
        }
        stopwatch2 = new class09958("Client Shutdown Thread");
        stopwatch2.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(logger));
        Runtime.getRuntime().addShutdownHook((Thread)stopwatch2);
        stopwatch = null;
        try {
            Thread.currentThread().setName("Render thread");
            RenderSystem.initRenderThread();
            stopwatch = new class06202(class094542);
        }
        catch (class05909 class059092) {
            class07536.U();
            logger.warn("Failed to create window: ", (Throwable)class059092);
            return;
        }
        catch (Throwable throwable) {
            list = class07080.N((Throwable)throwable, (String)"Initializing game");
            string = list.N("Initialization");
            class04544.N((class07074)string);
            class06202.N((class06202)stopwatch, null, (String)class094542.u.y, null, (class07080)list);
            class06202.N((class06202)stopwatch, (File)class094542.L.N, (class07080)list);
            return;
        }
        Stopwatch stopwatch3 = stopwatch;
        stopwatch3.yG();
        try {
            stopwatch3.NP();
        }
        finally {
            stopwatch3.ys();
        }
    }

    private static boolean y(OptionSpec<String> optionSpec, OptionSet optionSet, Logger logger) {
        try {
            UndashedUuid.fromStringLenient((String)((String)optionSpec.value(optionSet)));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            logger.warn("Invalid UUID: '{}", optionSpec.value(optionSet));
            return false;
        }
        return true;
    }

    private static Optional<String> y(String string) {
        return string.isEmpty() ? Optional.empty() : Optional.of(string);
    }

    private static void N(CallbackInfo callbackInfo) {
        ViaFabricPlusImpl.INSTANCE.init();
    }

    private static void N(String[] stringArray, CallbackInfo callbackInfo) {
        class09948.N();
    }

    private static void N(String[] stringArray, CallbackInfo callbackInfo, OptionParser optionParser) {
        class11883.N((String[])stringArray, (OptionParser)optionParser);
    }

    private static class01276 N(OptionSet optionSet, OptionSpec<String> optionSpec, OptionSpec<String> optionSpec2, OptionSpec<String> optionSpec3) {
        long l = Stream.of(optionSpec, optionSpec2, optionSpec3).filter(arg_0 -> ((OptionSet)optionSet).has(arg_0)).count();
        if (l == 0L) {
            return class01276.N;
        }
        if (l > 1L) {
            throw new IllegalArgumentException("Only one quick play option can be specified");
        }
        if (optionSet.has(optionSpec)) {
            String string = Main.N(Main.N(optionSet, optionSpec));
            return new class01268(string);
        }
        if (optionSet.has(optionSpec2)) {
            String string = Main.N(Main.N(optionSet, optionSpec2));
            return (class01276)class01962.N((Object)string, class01282::new, (Object)class01276.N);
        }
        if (optionSet.has(optionSpec3)) {
            String string = Main.N(Main.N(optionSet, optionSpec3));
            return (class01276)class01962.N((Object)string, class01240::new, (Object)class01276.N);
        }
        return class01276.N;
    }

    private static @Nullable String N(@Nullable String string) {
        if (string == null) {
            return null;
        }
        return StringEscapeUtils.unescapeJava((String)string);
    }

    private static OptionalInt N(@Nullable Integer n) {
        return n != null ? OptionalInt.of(n) : OptionalInt.empty();
    }

    private static <T> @Nullable T N(OptionSet optionSet, OptionSpec<T> optionSpec) {
        try {
            return (T)optionSet.valueOf(optionSpec);
        }
        catch (Throwable throwable) {
            List list;
            if (optionSpec instanceof ArgumentAcceptingOptionSpec && !(list = ((ArgumentAcceptingOptionSpec)optionSpec).defaultValues()).isEmpty()) {
                return (T)list.get(0);
            }
            throw throwable;
        }
    }

    private static boolean N(OptionSpec<String> optionSpec, OptionSet optionSet, Logger logger) {
        return optionSet.has(optionSpec) && Main.y(optionSpec, optionSet, logger);
    }
}

