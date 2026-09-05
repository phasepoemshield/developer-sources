/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09949
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.Lifecycle
 *  joptsimple.AbstractOptionSpec
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 *  joptsimple.ValueConverter
 *  joptsimple.util.PathConverter
 *  joptsimple.util.PathProperties
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01093
 *  minecraft.class01255
 *  minecraft.class01623
 *  minecraft.class01834
 *  minecraft.class01897
 *  minecraft.class01898
 *  minecraft.class01908
 *  minecraft.class01929
 *  minecraft.class01930
 *  minecraft.class02796
 *  minecraft.class03101
 *  minecraft.class03103
 *  minecraft.class03142
 *  minecraft.class03215
 *  minecraft.class03531
 *  minecraft.class03764
 *  minecraft.class03771
 *  minecraft.class03776
 *  minecraft.class03794
 *  minecraft.class03914
 *  minecraft.class03930
 *  minecraft.class03981
 *  minecraft.class04149
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04777
 *  minecraft.class04779
 *  minecraft.class04785
 *  minecraft.class04995
 *  minecraft.class04999
 *  minecraft.class05081
 *  minecraft.class05270
 *  minecraft.class05279
 *  minecraft.class05530
 *  minecraft.class05623
 *  minecraft.class05934
 *  minecraft.class05964
 *  minecraft.class06207
 *  minecraft.class06434
 *  minecraft.class06711
 *  minecraft.class07080
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07312
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07671
 *  minecraft.class07980
 *  minecraft.class08152
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockInitTracker
 *  net.fabricmc.loader.api.FabricLoader
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.minecraft.server;

import Nursultan.class09949;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import joptsimple.ValueConverter;
import joptsimple.util.PathConverter;
import joptsimple.util.PathProperties;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01093;
import minecraft.class01255;
import minecraft.class01623;
import minecraft.class01834;
import minecraft.class01897;
import minecraft.class01898;
import minecraft.class01908;
import minecraft.class01929;
import minecraft.class01930;
import minecraft.class02796;
import minecraft.class03101;
import minecraft.class03103;
import minecraft.class03142;
import minecraft.class03215;
import minecraft.class03531;
import minecraft.class03764;
import minecraft.class03771;
import minecraft.class03776;
import minecraft.class03794;
import minecraft.class03914;
import minecraft.class03930;
import minecraft.class03981;
import minecraft.class04149;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04777;
import minecraft.class04779;
import minecraft.class04785;
import minecraft.class04995;
import minecraft.class04999;
import minecraft.class05081;
import minecraft.class05270;
import minecraft.class05279;
import minecraft.class05530;
import minecraft.class05623;
import minecraft.class05934;
import minecraft.class05964;
import minecraft.class06207;
import minecraft.class06434;
import minecraft.class06711;
import minecraft.class07080;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07312;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07671;
import minecraft.class07980;
import minecraft.class08152;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockInitTracker;
import net.fabricmc.loader.api.FabricLoader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class Main {
    private static final Logger N = LogUtils.getLogger();

    public static void main(String[] stringArray) {
        class07529.N();
        OptionParser optionParser = new OptionParser();
        OptionSpecBuilder optionSpecBuilder = optionParser.accepts("nogui");
        OptionSpecBuilder optionSpecBuilder2 = optionParser.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
        OptionSpecBuilder optionSpecBuilder3 = optionParser.accepts("demo");
        OptionSpecBuilder optionSpecBuilder4 = optionParser.accepts("bonusChest");
        OptionSpecBuilder optionSpecBuilder5 = optionParser.accepts("forceUpgrade");
        OptionSpecBuilder optionSpecBuilder6 = optionParser.accepts("eraseCache");
        OptionSpecBuilder optionSpecBuilder7 = optionParser.accepts("recreateRegionFiles");
        OptionSpecBuilder optionSpecBuilder8 = optionParser.accepts("safeMode", "Loads level with vanilla datapack only");
        AbstractOptionSpec var10 = optionParser.accepts("help").forHelp();
        ArgumentAcceptingOptionSpec var11 = optionParser.accepts("universe").withRequiredArg().defaultsTo((Object)".", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec var12 = optionParser.accepts("world").withRequiredArg();
        ArgumentAcceptingOptionSpec var13 = optionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo((Object)-1, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec var14 = optionParser.accepts("serverId").withRequiredArg();
        OptionSpecBuilder optionSpecBuilder9 = optionParser.accepts("jfrProfile");
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec = optionParser.accepts("pidFile").withRequiredArg().withValuesConvertedBy((ValueConverter)new PathConverter(new PathProperties[0]));
        NonOptionArgumentSpec var17 = optionParser.nonOptions();
        try {
            class03531 class035312;
            class01908 class019082;
            class06434 class064342;
            class04779 class047792;
            class06434 class064343;
            OptionSet optionSet = optionParser.parse(stringArray);
            if (optionSet.has((OptionSpec)var10)) {
                optionParser.printHelpOn((OutputStream)System.err);
                return;
            }
            Path path = (Path)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec);
            if (path != null) {
                Main.N(path);
            }
            class07080.M();
            if (optionSet.has((OptionSpec)optionSpecBuilder9)) {
                class01834.M.N(class03215.field_34413);
            }
            class03914.N();
            class03914.L();
            Main.N(null);
            class07536.s();
            Path path2 = Paths.get("server.properties", new String[0]);
            class05279 class052792 = new class05279(path2);
            class052792.y();
            class05530.N((String)class052792.N().S);
            Path path3 = Paths.get("eula.txt", new String[0]);
            class04149 class041492 = new class04149(path3);
            if (optionSet.has((OptionSpec)optionSpecBuilder2)) {
                N.info("Initialized '{}' and '{}'", (Object)path2.toAbsolutePath(), (Object)path3.toAbsolutePath());
                return;
            }
            if (!class041492.N()) {
                N.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
                return;
            }
            File file = new File((String)optionSet.valueOf((OptionSpec)var11));
            class03930 class039302 = class03930.N((YggdrasilAuthenticationService)new YggdrasilAuthenticationService(Proxy.NO_PROXY), (File)file);
            String string = Optional.ofNullable((String)optionSet.valueOf((OptionSpec)var12)).orElse(class052792.N().s);
            class04785 class047852 = class04777.y((Path)file.toPath()).u(string);
            if (class047852.W()) {
                Dynamic var29;
                try {
                    var29 = class047852.B();
                    class064343 = class047852.N(var29);
                }
                catch (IOException | class03103 | class03142 throwable) {
                    class047792 = class047852.i();
                    N.warn("Failed to load world data from {}", (Object)class047792.y(), (Object)throwable);
                    N.info("Attempting to use fallback");
                    try {
                        var29 = class047852.Z();
                        class064343 = class047852.N(var29);
                    }
                    catch (IOException | class03103 | class03142 throwable2) {
                        N.error("Failed to load world data from {}", (Object)class047792.L(), (Object)throwable2);
                        N.error("Failed to load world data from {} and {}. World files may be corrupted. Shutting down.", (Object)class047792.y(), (Object)class047792.L());
                        return;
                    }
                    class047852.m();
                }
                if (class064343.u()) {
                    N.info("This world must be opened in an older version (like 1.6.4) to be safely converted");
                    return;
                }
                if (!class064343.b()) {
                    N.info("This world was created by an incompatible version.");
                    return;
                }
            } else {
                class064342 = null;
            }
            class064343 = class064342;
            boolean bl = optionSet.has((OptionSpec)optionSpecBuilder8);
            if (bl) {
                N.warn("Safe mode active, only vanilla datapack will be loaded");
            }
            class047792 = class01093.N((class04785)class047852);
            try {
                class019082 = Main.N(class052792.N(), class064343, bl, (class01623)class047792);
                class035312 = (class03531)class07536.L(arg_0 -> Main.N(class019082, (Dynamic)class064343, class052792, optionSet, (OptionSpec)optionSpecBuilder3, (OptionSpec)optionSpecBuilder4, arg_0)).get();
            }
            catch (Exception exception) {
                N.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", (Throwable)exception);
                return;
            }
            class019082 = class035312.L().N();
            class05081 class050812 = class035312.u();
            boolean bl2 = optionSet.has((OptionSpec)optionSpecBuilder7);
            if (optionSet.has((OptionSpec)optionSpecBuilder5) || bl2) {
                Main.N(class047852, class050812, class04999.N(), optionSet.has((OptionSpec)optionSpecBuilder6), () -> true, (class01042)class019082, bl2);
            }
            class047852.N((class01042)class019082, class050812);
            class05623 class056232 = (class05623)class02796.N(arg_0 -> Main.N(class047852, (class01623)class047792, class035312, class052792, class039302, optionSet, (OptionSpec)var13, (OptionSpec)optionSpecBuilder3, (OptionSpec)var14, (OptionSpec)optionSpecBuilder, (OptionSpec)var17, arg_0));
            class09949 class099492 = new class09949("Server Shutdown Thread", class056232);
            class099492.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(N));
            Runtime.getRuntime().addShutdownHook((Thread)class099492);
        }
        catch (Throwable throwable) {
            N.error(LogUtils.FATAL_MARKER, "Failed to start the minecraft server", throwable);
        }
    }

    private static /* synthetic */ CompletableFuture N(class01908 class019082, Dynamic dynamic, class05279 class052792, OptionSet optionSet, OptionSpec optionSpec, OptionSpec optionSpec2, Executor executor) {
        return class01897.N((class01908)class019082, class019302 -> {
            class00751 class007512 = class019302.u().L(class04227.yI);
            if (dynamic != null) {
                class03101 class031012 = class04777.N((Dynamic)dynamic, (class03776)class019302.y(), (class00751)class007512, (class01929)class019302.L());
                return new class03981((Object)class031012.N(), class031012.y().y());
            }
            N.info("No existing world data, creating new world");
            return Main.N(class052792, class019302, (class00751<class01255>)class007512, optionSet.has(optionSpec), optionSet.has(optionSpec2));
        }, class03531::new, (Executor)class07536.B(), (Executor)executor);
    }

    private static void N(CallbackInfo callbackInfo) {
        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER) {
            N.debug("Freezing registries");
            class04206.N();
            BlockInitTracker.postFreeze();
            class03771.N();
        }
    }

    private static class03981<class05081> N(class05279 class052792, class01930 class019302, class00751<class01255> class007512, boolean bl, boolean bl2) {
        class05270 class052702;
        class03764 class037642;
        class05934 class059342;
        class07312 class073122;
        if (bl) {
            class073122 = class02796.R;
            class059342 = class05934.y;
            class037642 = class05964.N((class01929)class019302.L());
        } else {
            class052702 = class052792.N();
            class073122 = new class07312(class052702.s, (class07282)class052702.P.get(), class052702.I, (class07086)class052702.m.get(), false, new class07305(class019302.y().y()), class019302.y());
            class059342 = bl2 ? class052702.NU.N(true) : class052702.NU;
            class037642 = class052702.N(class019302.L());
        }
        class052702 = class037642.N(class007512);
        Lifecycle lifecycle = class052702.N().add(class019302.L().u());
        return new class03981((Object)new class06207(class073122, class059342, class052702.u(), lifecycle), class052702.y());
    }

    private static void N(Path path) {
        try {
            long l = ProcessHandle.current().pid();
            Files.writeString(path, (CharSequence)Long.toString(l), new OpenOption[0]);
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
    }

    private static class01908 N(class05270 class052702, @Nullable Dynamic<?> dynamic, boolean bl, class01623 class016232) {
        class03776 class037762;
        boolean bl2;
        class03776 class037763;
        if (dynamic != null) {
            class037763 = class04777.N(dynamic);
            bl2 = false;
            class037762 = class037763;
        } else {
            bl2 = true;
            class037762 = new class03776(class052702.Nu, class03794.B);
        }
        class037763 = new class01898(class016232, class037762, bl, bl2);
        return new class01908((class01898)class037763, class07671.field_25420, (class08152)class052702.K);
    }

    private static void N(class04785 class047852, class05081 class050812, DataFixer dataFixer, boolean bl, BooleanSupplier booleanSupplier, class01042 class010422, boolean bl2) {
        N.info("Forcing world upgrade!");
        try (class06711 class067112 = new class06711(class047852, dataFixer, class050812, class010422, bl, bl2);){
            class00392 class003922 = null;
            while (!class067112.y()) {
                int n;
                class00392 class003923 = class067112.B();
                if (class003922 != class003923) {
                    class003922 = class003923;
                    N.info(class067112.B().getString());
                }
                if ((n = class067112.i()) > 0) {
                    int n2 = class067112.R() + class067112.M();
                    N.info("{}% completed ({} / {} chunks)...", new Object[]{class04995.y((float)((float)n2 / (float)n * 100.0f)), n2, n});
                }
                if (!booleanSupplier.getAsBoolean()) {
                    class067112.N();
                    continue;
                }
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedException) {}
            }
        }
    }

    private static /* synthetic */ class05623 N(class04785 class047852, class01623 class016232, class03531 class035312, class05279 class052792, class03930 class039302, OptionSet optionSet, OptionSpec optionSpec, OptionSpec optionSpec2, OptionSpec optionSpec3, OptionSpec optionSpec4, OptionSpec optionSpec5, Thread thread) {
        class05623 class056232 = new class05623(thread, class047852, class016232, class035312, class052792, class04999.N(), class039302);
        class056232.U(((Integer)optionSet.valueOf(optionSpec)).intValue());
        class056232.U(optionSet.has(optionSpec2));
        class056232.u((String)optionSet.valueOf(optionSpec3));
        if (!optionSet.has(optionSpec4) && !optionSet.valuesOf(optionSpec5).contains("nogui") && !GraphicsEnvironment.isHeadless()) {
            class056232.p();
        }
        return class056232;
    }
}

