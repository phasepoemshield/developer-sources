/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10526
 *  Nursultan.class10529
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.reflect.TypeToken
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  java.lang.MatchException
 *  jerozgen.languagereload.LanguageReload
 *  jerozgen.languagereload.config.Config
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01056
 *  minecraft.class01241
 *  minecraft.class01246
 *  minecraft.class01299
 *  minecraft.class01301
 *  minecraft.class01307
 *  minecraft.class01315
 *  minecraft.class01623
 *  minecraft.class01683
 *  minecraft.class01825
 *  minecraft.class02424
 *  minecraft.class02566
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class03737
 *  minecraft.class04141
 *  minecraft.class04343
 *  minecraft.class04344
 *  minecraft.class04346
 *  minecraft.class04350
 *  minecraft.class04355
 *  minecraft.class04362
 *  minecraft.class04369
 *  minecraft.class04370
 *  minecraft.class04380
 *  minecraft.class04453
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class04760
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05001
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05455
 *  minecraft.class05715
 *  minecraft.class05731
 *  minecraft.class05914
 *  minecraft.class05926
 *  minecraft.class06202
 *  minecraft.class06384
 *  minecraft.class06428
 *  minecraft.class06451
 *  minecraft.class06532
 *  minecraft.class06535
 *  minecraft.class06604
 *  minecraft.class06977
 *  minecraft.class07001
 *  minecraft.class07070
 *  minecraft.class07529
 *  minecraft.class07533
 *  minecraft.class07536
 *  minecraft.class08027
 *  minecraft.class08030
 *  minecraft.class08844
 *  minecraft.class08966
 *  minecraft.class09021
 *  minecraft.class09033
 *  minecraft.class09038
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl
 *  net.fabricmc.fabric.impl.resource.client.DefaultResourcePackStorage
 *  net.fabricmc.fabric.impl.resource.pack.FabricPack
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.properties.CloudSetting
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10526;
import Nursultan.class10529;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import jerozgen.languagereload.LanguageReload;
import jerozgen.languagereload.config.Config;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01056;
import minecraft.class01241;
import minecraft.class01246;
import minecraft.class01299;
import minecraft.class01301;
import minecraft.class01307;
import minecraft.class01315;
import minecraft.class01623;
import minecraft.class01683;
import minecraft.class01825;
import minecraft.class02424;
import minecraft.class02566;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class03737;
import minecraft.class04141;
import minecraft.class04343;
import minecraft.class04344;
import minecraft.class04346;
import minecraft.class04350;
import minecraft.class04355;
import minecraft.class04362;
import minecraft.class04369;
import minecraft.class04370;
import minecraft.class04380;
import minecraft.class04453;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class04760;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05001;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05455;
import minecraft.class05590;
import minecraft.class05603;
import minecraft.class05604;
import minecraft.class05606;
import minecraft.class05611;
import minecraft.class05715;
import minecraft.class05731;
import minecraft.class05914;
import minecraft.class05926;
import minecraft.class06202;
import minecraft.class06384;
import minecraft.class06428;
import minecraft.class06451;
import minecraft.class06532;
import minecraft.class06535;
import minecraft.class06604;
import minecraft.class06977;
import minecraft.class07001;
import minecraft.class07070;
import minecraft.class07529;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class08027;
import minecraft.class08030;
import minecraft.class08844;
import minecraft.class08966;
import minecraft.class09021;
import minecraft.class09033;
import minecraft.class09038;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;
import net.fabricmc.fabric.impl.resource.client.DefaultResourcePackStorage;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.properties.CloudSetting;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class05630 {
    static Logger N = LogUtils.getLogger();
    static final Gson y = new Gson();
    private static final TypeToken<List<String>> Ng = new class05604();
    public static final int L = 4;
    public static final int u = 12;
    public static final int i = 16;
    public static final int R = 32;
    private static final Splitter NI = Splitter.on((char)':').limit(2);
    public static final String M = "";
    private static final class00392 NJ = class00392.L((String)"options.darkMojangStudiosBackgroundColor.tooltip");
    private final class04370<Boolean> No = class04370.method_41749((String)"options.darkMojangStudiosBackgroundColor", (class04355)class04370.method_42717((class00392)NJ), (boolean)false);
    private static final class00392 Nq = class00392.L((String)"options.hideLightningFlashes.tooltip");
    private final class04370<Boolean> NK = class04370.method_41749((String)"options.hideLightningFlashes", (class04355)class04370.method_42717((class00392)Nq), (boolean)false);
    private static final class00392 NV = class00392.L((String)"options.hideSplashTexts.tooltip");
    private final class04370<Boolean> Ne = class04370.method_41749((String)"options.hideSplashTexts", (class04355)class04370.method_42717((class00392)NV), (boolean)false);
    private final class04370<Double> NH = new class04370("options.sensitivity", class04370.method_42399(), (class003922, d) -> {
        if (d == 0.0) {
            return class05630.N(class003922, (class00392)class00392.L((String)"options.sensitivity.min"));
        }
        if (d == 1.0) {
            return class05630.N(class003922, (class00392)class00392.L((String)"options.sensitivity.max"));
        }
        return class05630.N(class003922, 2.0 * d);
    }, (class04344)class04350.field_37875, (Object)0.5, d -> {});
    private final class04370<Integer> Nc;
    private final class04370<Integer> NX;
    private int Na = 0;
    private final class04370<Double> Np = new class04370("options.entityDistanceScaling", class04370.method_42399(), class05630::N, (class04344)new class04369(2, 20).N(n -> (double)n / 4.0, d -> (int)(d * 4.0), true), Codec.doubleRange((double)0.5, (double)5.0), (Object)1.0, d -> this.yy());
    public static final int B = 260;
    private final class04370<Integer> NF = new class04370("options.framerateLimit", class04370.method_42399(), (class003922, n) -> {
        if (n == 260) {
            return class05630.N(class003922, (class00392)class00392.L((String)"options.framerateLimit.max"));
        }
        return class05630.N(class003922, (class00392)class00392.N((String)"options.framerate", (Object[])new Object[]{n}));
    }, (class04344)new class04369(1, 26).N(n -> n * 10, n -> n / 10, true), Codec.intRange((int)10, (int)260), (Object)120, n -> class06202.Nq().NG().N(n.intValue()));
    private boolean NA;
    private final class04370<class01241> Nf = new class04370("options.graphics.preset", class04370.method_42717((class00392)class00392.L((String)"options.graphics.preset.tooltip")), (class003922, class012412) -> class05630.N(class003922, (class00392)class00392.L((String)class012412.N())), (class04344)new class04362(List.of(class01241.values()), class01241.field_63462), class01241.field_63462, (Object)class01241.field_25428, this::N);
    private static final class00392 NC = class00392.L((String)"options.inactivityFpsLimit.minimized.tooltip");
    private static final class00392 NS = class00392.L((String)"options.inactivityFpsLimit.afk.tooltip");
    private final class04370<class02424> Nx = new class04370("options.inactivityFpsLimit", class024242 -> switch (class024242) {
        default -> throw new MatchException(null, null);
        case class02424.field_52743 -> class04141.N((class00392)NC);
        case class02424.field_52744 -> class04141.N((class00392)NS);
    }, (class003922, class024242) -> class024242.N(), (class04344)new class04380(Arrays.asList(class02424.values()), class02424.field_52745), (Object)class02424.field_52744, class024242 -> {});
    private final class04370<class01301> ND = new class04370("options.renderClouds", class04370.method_42399(), (class003922, class013012) -> class013012.N(), (class04344)new class04380(Arrays.asList(class01301.values()), Codec.withAlternative((Codec)class01301.field_45285, (Codec)Codec.BOOL, bl -> bl != false ? class01301.field_18164 : class01301.field_18162)), (Object)class01301.field_18164, class013012 -> this.yy());
    private final class04370<Integer> Nh = new class04370("options.renderCloudsDistance", class04370.method_42399(), (class003922, n) -> class05630.N(class003922, (class00392)class00392.N((String)"options.chunks", (Object[])new Object[]{n})), (class04344)new class04369(2, 128, true), (Object)128, n -> {
        class05630.N((class03063 class030632) -> class030632.G().N());
        this.yy();
    });
    private static final class00392 Nr = class00392.L((String)"options.weatherRadius.tooltip");
    private final class04370<Integer> yN = new class04370("options.weatherRadius", class04370.method_42717((class00392)Nr), (class003922, n) -> class05630.N(class003922, (class00392)class00392.N((String)"options.blocks", (Object[])new Object[]{n})), (class04344)new class04369(3, 10, true), (Object)10, n -> this.yy());
    private static final class00392 yy = class00392.L((String)"options.cutoutLeaves.tooltip");
    private final class04370<Boolean> yL = class04370.method_41750((String)"options.cutoutLeaves", (class04355)class04370.method_42717((class00392)yy), (boolean)true, bl -> {
        class05630.N(class03063::u);
        this.yy();
    });
    private static final class00392 yu = class00392.L((String)"options.vignette.tooltip");
    private final class04370<Boolean> yi = class04370.method_41749((String)"options.vignette", (class04355)class04370.method_42717((class00392)yu), (boolean)true);
    private static final class00392 yR = class00392.L((String)"options.improvedTransparency.tooltip");
    private final class04370<Boolean> yM = class04370.method_41750((String)"options.improvedTransparency", (class04355)class04370.method_42717((class00392)yR), (boolean)false, bl -> {
        class01246 class012462 = class06202.Nq().Ns();
        if (bl.booleanValue() && class012462.y()) {
            class012462.L();
            return;
        }
        class05630.N(class03063::u);
        this.yy();
    });
    private final class04370<Boolean> yB = class04370.method_41751((String)"options.ao", (boolean)true, bl -> {
        class05630.N(class03063::u);
        this.yy();
    });
    private static final class00392 yZ = class00392.L((String)"options.chunkFade.tooltip");
    private final class04370<Double> yz = new class04370("options.chunkFade", class04370.method_42717((class00392)yZ), (class003922, d) -> {
        if (d <= 0.0) {
            return class00392.L((String)"options.chunkFade.none");
        }
        return class00392.N((String)"options.chunkFade.seconds", (Object[])new Object[]{String.format(Locale.ROOT, "%.2f", d)});
    }, (class04344)new class04369(0, 40).N(n -> (double)n / 20.0, d -> (int)(d * 20.0), true), Codec.doubleRange((double)0.0, (double)2.0), (Object)0.75, d -> {});
    private static final class00392 yU = class00392.L((String)"options.prioritizeChunkUpdates.none.tooltip");
    private static final class00392 yE = class00392.L((String)"options.prioritizeChunkUpdates.byPlayer.tooltip");
    private static final class00392 yW = class00392.L((String)"options.prioritizeChunkUpdates.nearby.tooltip");
    private final class04370<class01825> ym = new class04370("options.prioritizeChunkUpdates", class018252 -> switch (class018252) {
        default -> throw new MatchException(null, null);
        case class01825.field_34788 -> class04141.N((class00392)yU);
        case class01825.field_34789 -> class04141.N((class00392)yE);
        case class01825.field_34790 -> class04141.N((class00392)yW);
    }, (class003922, class018252) -> class018252.N(), (class04344)new class04380(Arrays.asList(class01825.values()), class01825.field_64424), (Object)class01825.field_34788, class018252 -> this.yy());
    public List<String> Z = Lists.newArrayList();
    public List<String> z = Lists.newArrayList();
    private final class04370<class08027> yP = new class04370("options.chat.visibility", class04370.method_42399(), (class003922, class080272) -> class080272.N(), (class04344)new class04380(Arrays.asList(class08027.values()), class08027.field_64374), (Object)class08027.field_7538, class080272 -> {});
    private final class04370<Double> ys = new class04370("options.chat.opacity", class04370.method_42399(), (class003922, d) -> class05630.N(class003922, d * 0.9 + 0.1), (class04344)class04350.field_37875, (Object)1.0, d -> ((class01056)class06202.Nq().i_6).i().y());
    private final class04370<Double> yT = new class04370("options.chat.line_spacing", class04370.method_42399(), class05630::N, (class04344)class04350.field_37875, (Object)0.0, d -> {});
    private static final class00392 yb = class00392.L((String)"options.accessibility.menu_background_blurriness.tooltip");
    private static final int yj = 5;
    private final class04370<Integer> yv = new class04370("options.accessibility.menu_background_blurriness", class04370.method_42717((class00392)yb), class05630::y, (class04344)new class04369(0, 10), (Object)5, n -> this.yy());
    private final class04370<Double> yn = new class04370("options.accessibility.text_background_opacity", class04370.method_42399(), class05630::N, (class04344)class04350.field_37875, (Object)0.5, d -> ((class01056)class06202.Nq().i_6).i().y());
    private final class04370<Double> yt = new class04370("options.accessibility.panorama_speed", class04370.method_42399(), class05630::N, (class04344)class04350.field_37875, (Object)1.0, d -> {});
    private static final class00392 yG = class00392.L((String)"options.accessibility.high_contrast.tooltip");
    private final class04370<Boolean> yl = class04370.method_41750((String)"options.accessibility.high_contrast", (class04355)class04370.method_42717((class00392)yG), (boolean)false, bl -> {
        class01623 class016232 = class06202.Nq().t();
        boolean bl2 = class016232.i().contains("high_contrast");
        if (!bl2 && bl.booleanValue()) {
            if (class016232.N("high_contrast")) {
                this.N(class016232);
            }
        } else if (bl2 && !bl.booleanValue() && class016232.y("high_contrast")) {
            this.N(class016232);
        }
    });
    private static final class00392 yd = class00392.L((String)"options.accessibility.high_contrast_block_outline.tooltip");
    private final class04370<Boolean> yw = class04370.method_41749((String)"options.accessibility.high_contrast_block_outline", (class04355)class04370.method_42717((class00392)yd), (boolean)false);
    private final class04370<Boolean> yk = class04370.method_41749((String)"options.accessibility.narrator_hotkey", (class04355)class04370.method_42717((class00392)(class06604.N ? class00392.L((String)"options.accessibility.narrator_hotkey.mac.tooltip") : class00392.L((String)"options.accessibility.narrator_hotkey.tooltip"))), (boolean)true);
    public @Nullable String U;
    public boolean E;
    public boolean W;
    public boolean m = true;
    private final Set<class08030> yY = EnumSet.allOf(class08030.class);
    private final class04370<class07070> yQ = new class04370("options.mainHand", class04370.method_42399(), (class003922, class070702) -> class070702.y(), (class04344)new class04380(Arrays.asList(class07070.values()), class07070.field_45121), (Object)class07070.field_6183, class070702 -> {});
    public int P;
    public int s;
    private final class04370<Double> yO = new class04370("options.chat.scale", class04370.method_42399(), (class003922, d) -> {
        if (d == 0.0) {
            return class05220.N((class00392)class003922, (boolean)false);
        }
        return class05630.N(class003922, (double)d);
    }, (class04344)class04350.field_37875, (Object)1.0, d -> ((class01056)class06202.Nq().i_6).i().y());
    private final class04370<Double> yg = new class04370("options.chat.width", class04370.method_42399(), (class003922, d) -> class05630.L(class003922, class06451.N((double)d)), (class04344)class04350.field_37875, (Object)1.0, d -> ((class01056)class06202.Nq().i_6).i().y());
    private final class04370<Double> yI = new class04370("options.chat.height.unfocused", class04370.method_42399(), (class003922, d) -> class05630.L(class003922, class06451.y((double)d)), (class04344)class04350.field_37875, (Object)class06451.R(), d -> ((class01056)class06202.Nq().i_6).i().y());
    private final class04370<Double> yJ = new class04370("options.chat.height.focused", class04370.method_42399(), (class003922, d) -> class05630.L(class003922, class06451.y((double)d)), (class04344)class04350.field_37875, (Object)1.0, d -> ((class01056)class06202.Nq().i_6).i().y());
    private final class04370<Double> yo = new class04370("options.chat.delay_instant", class04370.method_42399(), (class003922, d) -> {
        if (d <= 0.0) {
            return class00392.L((String)"options.chat.delay_none");
        }
        return class00392.N((String)"options.chat.delay", (Object[])new Object[]{String.format(Locale.ROOT, "%.1f", d)});
    }, (class04344)new class04369(0, 60).N(n -> (double)n / 10.0, d -> (int)(d * 10.0), true), Codec.doubleRange((double)0.0, (double)6.0), (Object)0.0, d -> class06202.Nq().N().N(d.doubleValue()));
    private static final class00392 yq = class00392.L((String)"options.notifications.display_time.tooltip");
    private final class04370<Double> yK = new class04370("options.notifications.display_time", class04370.method_42717((class00392)yq), (class003922, d) -> class05630.N(class003922, (class00392)class00392.N((String)"options.multiplier", (Object[])new Object[]{d})), (class04344)new class04369(5, 100).N(n -> (double)n / 10.0, d -> (int)(d * 10.0), true), Codec.doubleRange((double)0.5, (double)10.0), (Object)1.0, d -> {});
    private final class04370<Integer> yV = new class04370("options.mipmapLevels", class04370.method_42399(), (class003922, n) -> {
        if (n == 0) {
            return class05220.N((class00392)class003922, (boolean)false);
        }
        return class05630.N(class003922, (int)n);
    }, (class04344)new class04369(0, 4), (Object)4, n -> this.yy());
    private static final class00392 ye = class00392.L((String)"options.maxAnisotropy.tooltip");
    private final class04370<Integer> yH = new class04370("options.maxAnisotropy", class04370.method_42717((class00392)ye), (class003922, n) -> {
        if (n == 0) {
            return class05220.N((class00392)class003922, (boolean)false);
        }
        return class05630.N(class003922, (class00392)class00392.N((String)"options.multiplier", (Object[])new Object[]{Integer.toString(1 << n)}));
    }, (class04344)new class04369(1, 3), (Object)2, n -> {
        this.yy();
        class05630.N(class03063::B);
    });
    private static final class00392 yc = class00392.L((String)"options.textureFiltering.none.tooltip");
    private static final class00392 yX = class00392.L((String)"options.textureFiltering.rgss.tooltip");
    private static final class00392 ya = class00392.L((String)"options.textureFiltering.anisotropic.tooltip");
    private final class04370<class06532> yp = new class04370("options.textureFiltering", class065322 -> switch (class065322) {
        default -> throw new MatchException(null, null);
        case class06532.field_64663 -> class04141.N((class00392)yc);
        case class06532.field_64664 -> class04141.N((class00392)yX);
        case class06532.field_64665 -> class04141.N((class00392)ya);
    }, (class003922, class065322) -> class065322.N(), (class04344)new class04380(Arrays.asList(class06532.values()), class06532.field_64666), (Object)class06532.field_64663, class065322 -> {
        this.yy();
        class05630.N(class03063::B);
    });
    private boolean yF = true;
    private final class04370<class01307> yA = new class04370("options.attackIndicator", class04370.method_42399(), (class003922, class013072) -> class013072.N(), (class04344)new class04380(Arrays.asList(class01307.values()), class01307.field_64418), (Object)class01307.field_18152, class013072 -> {});
    public class08966 T = class08966.field_5650;
    public boolean b = false;
    private final class04370<Integer> yf = new class04370("options.biomeBlendRadius", class04370.method_42399(), (class003922, n) -> {
        int n2 = n * 2 + 1;
        return class05630.N(class003922, (class00392)class00392.L((String)("options.biomeBlendRadius." + n2)));
    }, (class04344)new class04369(0, 7, false), (Object)2, n -> {
        class05630.N(class03063::u);
        this.yy();
    });
    private final class04370<Double> yC = new class04370("options.mouseWheelSensitivity", class04370.method_42399(), (class003922, d) -> class05630.N(class003922, (class00392)class00392.y((String)String.format(Locale.ROOT, "%.2f", d))), (class04344)new class04369(-200, 100).N(class05630::L, class05630::N, false), Codec.doubleRange((double)class05630.L(-200), (double)class05630.L(100)), (Object)class05630.L(0), d -> {});
    private final class04370<Boolean> yS = class04370.method_41751((String)"options.rawMouseInput", (boolean)true, bl -> {
        class08844 class088442 = class06202.Nq().Nt();
        if (class088442 != null) {
            class088442.y(bl.booleanValue());
        }
    });
    private static final class00392 yx = class00392.L((String)"options.allowCursorChanges.tooltip");
    private final class04370<Boolean> yD = class04370.method_41750((String)"options.allowCursorChanges", (class04355)class04370.method_42717((class00392)yx), (boolean)true, bl -> {
        class08844 class088442 = class06202.Nq().Nt();
        if (class088442 != null) {
            class088442.L(bl.booleanValue());
        }
    });
    public int j = 1;
    private final class04370<Boolean> yh = class04370.method_42402((String)"options.autoJump", (boolean)false);
    private static final class00392 yr = class00392.L((String)"options.rotateWithMinecart.tooltip");
    private final class04370<Boolean> LN = class04370.method_41749((String)"options.rotateWithMinecart", (class04355)class04370.method_42717((class00392)yr), (boolean)false);
    private final class04370<Boolean> Ly = class04370.method_42402((String)"options.operatorItemsTab", (boolean)false);
    private final class04370<Boolean> LL = class04370.method_42402((String)"options.autoSuggestCommands", (boolean)true);
    private final class04370<Boolean> Lu = class04370.method_42402((String)"options.chat.color", (boolean)true);
    private final class04370<Boolean> Li = class04370.method_42402((String)"options.chat.links", (boolean)true);
    private final class04370<Boolean> LR = class04370.method_42402((String)"options.chat.links.prompt", (boolean)true);
    private final class04370<Boolean> LM = class04370.method_41751((String)"options.vsync", (boolean)true, bl -> {
        if (class06202.Nq().Nt() != null) {
            class06202.Nq().Nt().N(bl.booleanValue());
        }
    });
    private final class04370<Boolean> LB = class04370.method_41750((String)"options.entityShadows", (class04355)class04370.method_42399(), (boolean)true, bl -> this.yy());
    private final class04370<Boolean> LZ = class04370.method_41751((String)"options.forceUnicodeFont", (boolean)false, bl -> class05630.Nr());
    private final class04370<Boolean> Lz = class04370.method_41750((String)"options.japaneseGlyphVariants", (class04355)class04370.method_42717((class00392)class00392.L((String)"options.japaneseGlyphVariants.tooltip")), (boolean)class05630.yN(), bl -> class05630.Nr());
    private final class04370<Boolean> LU = class04370.method_42402((String)"options.invertMouseX", (boolean)false);
    private final class04370<Boolean> LE = class04370.method_42402((String)"options.invertMouseY", (boolean)false);
    private final class04370<Boolean> LW = class04370.method_42402((String)"options.discrete_mouse_scroll", (boolean)false);
    private static final class00392 Lm = class00392.L((String)"options.realmsNotifications.tooltip");
    private final class04370<Boolean> LP = class04370.method_41749((String)"options.realmsNotifications", (class04355)class04370.method_42717((class00392)Lm), (boolean)true);
    private static final class00392 Ls = class00392.L((String)"options.allowServerListing.tooltip");
    private final class04370<Boolean> LT = class04370.method_41750((String)"options.allowServerListing", (class04355)class04370.method_42717((class00392)Ls), (boolean)true, bl -> {});
    private final class04370<Boolean> Lb = class04370.method_41750((String)"options.reducedDebugInfo", (class04355)class04370.method_42399(), (boolean)false, bl -> ((class05731)class06202.Nq().L_0).i());
    private final Map<class04911, class04370<Double>> Lj = class07536.N_74(class04911.class, class049112 -> this.N("soundCategory." + class049112.N(), (class04911)class049112));
    private static final class00392 Lv = class00392.L((String)"options.showSubtitles.tooltip");
    private final class04370<Boolean> Ln = class04370.method_41749((String)"options.showSubtitles", (class04355)class04370.method_42717((class00392)Lv), (boolean)false);
    private static final class00392 Lt = class00392.L((String)"options.directionalAudio.on.tooltip");
    private static final class00392 LG = class00392.L((String)"options.directionalAudio.off.tooltip");
    private final class04370<Boolean> Ll = class04370.method_41750((String)"options.directionalAudio", bl -> bl != false ? class04141.N((class00392)Lt) : class04141.N((class00392)LG), (boolean)false, bl -> {
        class09033 class090332 = class06202.Nq().Nr();
        class090332.Z();
        class090332.N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
    });
    private final class04370<Boolean> Ld = new class04370("options.accessibility.text_background", class04370.method_42399(), (class003922, bl) -> bl != false ? class00392.L((String)"options.accessibility.text_background.chat") : class00392.L((String)"options.accessibility.text_background.everywhere"), (class04344)class04370.field_38278, (Object)true, bl -> {});
    private final class04370<Boolean> Lw = class04370.method_42402((String)"options.touchscreen", (boolean)false);
    private final class04370<Boolean> Lk = class04370.method_41751((String)"options.fullscreen", (boolean)false, bl -> {
        class06202 class062022 = class06202.Nq();
        if (class062022.Nt() != null && class062022.Nt().Z() != bl.booleanValue()) {
            class062022.Nt().M();
            this.NP().method_41748((Object)class062022.Nt().Z());
        }
    });
    private final class04370<Boolean> LY = class04370.method_42402((String)"options.viewBobbing", (boolean)true);
    private static final class00392 LQ = class00392.L((String)"options.key.toggle");
    private static final class00392 LO = class00392.L((String)"options.key.hold");
    private final class04370<Boolean> Lg = new class04370("key.sneak", class04370.method_42399(), (class003922, bl) -> bl != false ? LQ : LO, (class04344)class04370.field_38278, (Object)false, bl -> {});
    private final class04370<Boolean> LI = new class04370("key.sprint", class04370.method_42399(), (class003922, bl) -> bl != false ? LQ : LO, (class04344)class04370.field_38278, (Object)false, bl -> {});
    private final class04370<Boolean> LJ = new class04370("key.attack", class04370.method_42399(), (class003922, bl) -> bl != false ? LQ : LO, (class04344)class04370.field_38278, (Object)false, bl -> {});
    private final class04370<Boolean> Lo = new class04370("key.use", class04370.method_42399(), (class003922, bl) -> bl != false ? LQ : LO, (class04344)class04370.field_38278, (Object)false, bl -> {});
    private static final class00392 Lq = class00392.L((String)"options.sprintWindow.tooltip");
    private final class04370<Integer> LK = new class04370("options.sprintWindow", class04370.method_42717((class00392)Lq), (class003922, n) -> {
        if (n == 0) {
            return class05630.N(class003922, (class00392)class00392.L((String)"options.off"));
        }
        return class05630.N(class003922, (class00392)class00392.N((String)"options.value", (Object[])new Object[]{n}));
    }, (class04344)new class04369(0, 10), (Object)7, n -> {});
    public boolean v;
    private static final class00392 LV = class00392.L((String)"options.hideMatchedNames.tooltip");
    private final class04370<Boolean> Le = class04370.method_41749((String)"options.hideMatchedNames", (class04355)class04370.method_42717((class00392)LV), (boolean)true);
    private final class04370<Boolean> LH = class04370.method_42402((String)"options.autosaveIndicator", (boolean)true);
    private static final class00392 Lc = class00392.L((String)"options.onlyShowSecureChat.tooltip");
    private final class04370<Boolean> LX = class04370.method_41749((String)"options.onlyShowSecureChat", (class04355)class04370.method_42717((class00392)Lc), (boolean)false);
    private static final class00392 La = class00392.L((String)"options.chat.drafts.tooltip");
    private final class04370<Boolean> Lp = class04370.method_41749((String)"options.chat.drafts", (class04355)class04370.method_42717((class00392)La), (boolean)false);
    public final class06428 n = new class06428("key.forward", 87, class06384.y);
    public final class06428 t = new class06428("key.left", 65, class06384.y);
    public final class06428 G = new class06428("key.back", 83, class06384.y);
    public final class06428 l = new class06428("key.right", 68, class06384.y);
    public final class06428 d = new class06428("key.jump", 32, class06384.y);
    public final class06428 w = new class05926("key.sneak", 340, class06384.y, () -> this.Lg.method_41753(), true);
    public final class06428 k = new class05926("key.sprint", 341, class06384.y, () -> this.LI.method_41753(), true);
    public final class06428 Y = new class06428("key.inventory", 69, class06384.R);
    public final class06428 Q = new class06428("key.swapOffhand", 70, class06384.R);
    public final class06428 O = new class06428("key.drop", 81, class06384.R);
    public final class06428 g = new class05926("key.use", class04648.field_1672, 1, class06384.i, () -> this.Lo.method_41753(), false);
    public final class06428 I = new class05926("key.attack", class04648.field_1672, 0, class06384.i, () -> this.LJ.method_41753(), true);
    public final class06428 J = new class06428("key.pickItem", class04648.field_1672, 2, class06384.i);
    public final class06428 o = new class06428("key.chat", 84, class06384.u);
    public final class06428 q = new class06428("key.playerlist", 258, class06384.u);
    public final class06428 K = new class06428("key.command", 47, class06384.u);
    public final class06428 V = new class06428("key.socialInteractions", 80, class06384.u);
    public final class06428 e = new class06428("key.screenshot", 291, class06384.L);
    public final class06428 H = new class06428("key.togglePerspective", 294, class06384.L);
    public final class06428 c = new class06428("key.smoothCamera", class04655.yI.y(), class06384.L);
    public final class06428 X = new class06428("key.fullscreen", 300, class06384.L);
    public final class06428 a = new class06428("key.advancements", 76, class06384.L);
    public final class06428 p = new class06428("key.quickActions", 71, class06384.L);
    public final class06428 F = new class06428("key.toggleGui", 290, class06384.L);
    public final class06428 A = new class06428("key.toggleSpectatorShaderEffects", 293, class06384.L);
    public final class06428[] f = new class06428[]{new class06428("key.hotbar.1", 49, class06384.R), new class06428("key.hotbar.2", 50, class06384.R), new class06428("key.hotbar.3", 51, class06384.R), new class06428("key.hotbar.4", 52, class06384.R), new class06428("key.hotbar.5", 53, class06384.R), new class06428("key.hotbar.6", 54, class06384.R), new class06428("key.hotbar.7", 55, class06384.R), new class06428("key.hotbar.8", 56, class06384.R), new class06428("key.hotbar.9", 57, class06384.R)};
    public final class06428 C = new class06428("key.saveToolbarActivator", 67, class06384.M);
    public final class06428 S = new class06428("key.loadToolbarActivator", 88, class06384.M);
    public final class06428 x = new class06428("key.spectatorOutlines", class04655.yI.y(), class06384.B);
    public final class06428 D = new class06428("key.spectatorHotbar", class04648.field_1672, 2, class06384.B);
    public final class06428 h = new class06428("key.debug.overlay", class04648.field_1668, 292, class06384.Z, -2);
    public final class06428 r = new class06428("key.debug.modifier", class04648.field_1668, 292, class06384.Z, -1);
    public final class06428 NN = new class06428("key.debug.crash", class04648.field_1668, 67, class06384.Z);
    public final class06428 Ny = new class06428("key.debug.reloadChunk", class04648.field_1668, 65, class06384.Z);
    public final class06428 NL = new class06428("key.debug.showHitboxes", class04648.field_1668, 66, class06384.Z);
    public final class06428 Nu = new class06428("key.debug.clearChat", class04648.field_1668, 68, class06384.Z);
    public final class06428 Ni = new class06428("key.debug.showChunkBorders", class04648.field_1668, 71, class06384.Z);
    public final class06428 NR = new class06428("key.debug.showAdvancedTooltips", class04648.field_1668, 72, class06384.Z);
    public final class06428 NM = new class06428("key.debug.copyRecreateCommand", class04648.field_1668, 73, class06384.Z);
    public final class06428 NB = new class06428("key.debug.spectate", class04648.field_1668, 78, class06384.Z);
    public final class06428 NZ = new class06428("key.debug.switchGameMode", class04648.field_1668, 293, class06384.Z);
    public final class06428 Nz = new class06428("key.debug.debugOptions", class04648.field_1668, 295, class06384.Z);
    public final class06428 NU = new class06428("key.debug.focusPause", class04648.field_1668, 80, class06384.Z);
    public final class06428 NE = new class06428("key.debug.dumpDynamicTextures", class04648.field_1668, 83, class06384.Z);
    public final class06428 NW = new class06428("key.debug.reloadResourcePacks", class04648.field_1668, 84, class06384.Z);
    public final class06428 Nm = new class06428("key.debug.profiling", class04648.field_1668, 76, class06384.Z);
    public final class06428 NP = new class06428("key.debug.copyLocation", class04648.field_1668, 67, class06384.Z);
    public final class06428 Ns = new class06428("key.debug.dumpVersion", class04648.field_1668, 86, class06384.Z);
    public final class06428 NT = new class06428("key.debug.profilingChart", class04648.field_1668, 49, class06384.Z, 1);
    public final class06428 Nb = new class06428("key.debug.fpsCharts", class04648.field_1668, 50, class06384.Z, 2);
    public final class06428 Nj = new class06428("key.debug.networkCharts", class04648.field_1668, 51, class06384.Z, 3);
    public final class06428[] Nv = new class06428[]{this.Ny, this.NL, this.Nu, this.NN, this.Ni, this.NR, this.NM, this.NB, this.NZ, this.Nz, this.NU, this.NE, this.NW, this.Nm, this.NP, this.Ns, this.NT, this.Nb, this.Nj};
    public class06428[] Nn = (class06428[])Stream.of({this.I, this.g, this.n, this.t, this.G, this.l, this.d, this.w, this.k, this.O, this.Y, this.o, this.q, this.J, this.K, this.V, this.F, this.A, this.e, this.H, this.c, this.X, this.x, this.D, this.Q, this.C, this.S, this.a, this.p, this.h, this.r}, this.f, this.Nv).flatMap(Stream::of).toArray(class06428[]::new);
    protected class06202 Nt;
    private final File LF;
    public boolean NG;
    private class05455 LA = class05455.field_26664;
    public String Nl = "";
    public boolean Nd;
    private final class04370<Integer> Lf = new class04370("options.fov", class04370.method_42399(), (class003922, n) -> switch (n) {
        case 70 -> class05630.N(class003922, (class00392)class00392.L((String)"options.fov.min"));
        case 110 -> class05630.N(class003922, (class00392)class00392.L((String)"options.fov.max"));
        default -> class05630.N(class003922, (int)n);
    }, (class04344)new class04369(30, 110), Codec.DOUBLE.xmap(d -> (int)(d * 40.0 + 70.0), n -> ((double)n.intValue() - 70.0) / 40.0), (Object)70, n -> class05630.N(class03063::W));
    private static final class00392 LC = class00392.N((String)"options.telemetry.button.tooltip", (Object[])new Object[]{class00392.L((String)"options.telemetry.state.minimal"), class00392.L((String)"options.telemetry.state.all")});
    private final class04370<Boolean> LS = class04370.method_47604((String)"options.telemetry.button", (class04355)class04370.method_42717((class00392)LC), (class003922, bl) -> {
        class06202 class062022 = class06202.Nq();
        if (!class062022.NC()) {
            return class00392.L((String)"options.telemetry.state.none");
        }
        if (bl.booleanValue() && class062022.Nk()) {
            return class00392.L((String)"options.telemetry.state.all");
        }
        return class00392.L((String)"options.telemetry.state.minimal");
    }, (boolean)false, bl -> {});
    private static final class00392 Lx = class00392.L((String)"options.screenEffectScale.tooltip");
    private final class04370<Double> LD = new class04370("options.screenEffectScale", class04370.method_42717((class00392)Lx), class05630::y, (class04344)class04350.field_37875, (Object)1.0, d -> {});
    private static final class00392 Lh = class00392.L((String)"options.fovEffectScale.tooltip");
    private final class04370<Double> Lr = new class04370("options.fovEffectScale", class04370.method_42717((class00392)Lh), class05630::y, (class04344)class04350.field_37875.N(class04995::E, Math::sqrt), Codec.doubleRange((double)0.0, (double)1.0), (Object)1.0, d -> {});
    private static final class00392 uN = class00392.L((String)"options.darknessEffectScale.tooltip");
    private final class04370<Double> uy = new class04370("options.darknessEffectScale", class04370.method_42717((class00392)uN), class05630::y, (class04344)class04350.field_37875.N(class04995::E, Math::sqrt), (Object)1.0, d -> {});
    private static final class00392 uL = class00392.L((String)"options.glintSpeed.tooltip");
    private final class04370<Double> uu = new class04370("options.glintSpeed", class04370.method_42717((class00392)uL), class05630::y, (class04344)class04350.field_37875, (Object)0.5, d -> {});
    private static final class00392 ui = class00392.L((String)"options.glintStrength.tooltip");
    private final class04370<Double> uR = new class04370("options.glintStrength", class04370.method_42717((class00392)ui), class05630::y, (class04344)class04350.field_37875, (Object)0.75, d -> {});
    private static final class00392 uM = class00392.L((String)"options.damageTiltStrength.tooltip");
    private final class04370<Double> uB = new class04370("options.damageTiltStrength", class04370.method_42717((class00392)uM), class05630::y, (class04344)class04350.field_37875, (Object)1.0, d -> {});
    private final class04370<Double> uZ = new class04370("options.gamma", class04370.method_42399(), (class003922, d) -> {
        int n = (int)(d * 100.0);
        if (n == 0) {
            return class05630.N(class003922, (class00392)class00392.L((String)"options.gamma.min"));
        }
        if (n == 50) {
            return class05630.N(class003922, (class00392)class00392.L((String)"options.gamma.default"));
        }
        if (n == 100) {
            return class05630.N(class003922, (class00392)class00392.L((String)"options.gamma.max"));
        }
        return class05630.N(class003922, n);
    }, (class04344)class04350.field_37875, (Object)0.5, d -> {});
    public static final int Nw = 0;
    private static final int uz = 0x7FFFFFFE;
    private final class04370<Integer> uU = new class04370("options.guiScale", class04370.method_42399(), (class003922, n) -> n == 0 ? class00392.L((String)"options.guiScale.auto") : class00392.y((String)Integer.toString(n)), (class04344)new class04343(0, () -> {
        class06202 class062022 = class06202.Nq();
        if (!class062022.r()) {
            return 0x7FFFFFFE;
        }
        return class062022.Nt().N(0, class062022.NR());
    }, 0x7FFFFFFE), (Object)0, n -> this.Nt.V());
    private final class04370<class01315> uE = new class04370("options.particles", class04370.method_42399(), (class003922, class013152) -> class013152.N(), (class04344)new class04380(Arrays.asList(class01315.values()), class01315.field_64259), (Object)class01315.field_18197, class013152 -> this.yy());
    private final class04370<class01299> uW = new class04370("options.narrator", class04370.method_42399(), (class003922, class012992) -> {
        if (this.Nt.NT().N()) {
            return class012992.y();
        }
        return class00392.L((String)"options.narrator.notavailable");
    }, (class04344)new class04380(Arrays.asList(class01299.values()), class01299.field_64423), (Object)class01299.field_18176, class012992 -> this.Nt.NT().N(class012992));
    public String Nk = "en_us";
    private final class04370<String> um = new class04370("options.audioDevice", class04370.method_42399(), (class003922, string) -> {
        if (M.equals(string)) {
            return class00392.L((String)"options.audioDevice.default");
        }
        if (string.startsWith("OpenAL Soft on ")) {
            return class00392.y((String)string.substring(class09038.L));
        }
        return class00392.y((String)string);
    }, (class04344)new class04346(() -> Stream.concat(Stream.of(M), class06202.Nq().Nr().N().stream()).toList(), string -> {
        if (!class06202.Nq().r() || string == M || class06202.Nq().Nr().N().contains(string)) {
            return Optional.of(string);
        }
        return Optional.empty();
    }, (Codec)Codec.STRING), (Object)"", string -> {
        class09033 class090332 = class06202.Nq().Nr();
        class090332.Z();
        class090332.N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
    });
    public boolean NY = true;
    private static final class00392 uP = class00392.L((String)"options.music_frequency.tooltip");
    private final class04370<class09021> us = new class04370("options.music_frequency", class04370.method_42717((class00392)uP), (class003922, class090212) -> class090212.N(), (class04344)new class04380(Arrays.asList(class09021.values()), class09021.field_60800), (Object)class09021.field_60797, class090212 -> class06202.Nq().A().N(class090212));
    private final class04370<class06535> uT = new class04370("options.musicToast", class065352 -> class04141.N((class00392)class065352.y()), (class003922, class065352) -> class065352.N(), (class04344)new class04380(Arrays.asList(class06535.values()), class06535.field_64528), (Object)class06535.field_64525, class065352 -> this.Nt.m().N(class065352));
    public boolean NQ;
    public boolean NO = true;

    public class04370<Double> w() {
        return this.yt;
    }

    public class04370<Double> NY() {
        return this.LD;
    }

    private static List<String> L(String string) {
        List list = (List)class05001.N((Gson)y, (String)string, Ng);
        return list != null ? list : Lists.newArrayList();
    }

    private void L(CallbackInfo callbackInfo) {
        this.Z = DefaultResourcePackStorage.process(this.Z);
    }

    public final class04370<Double> L(class04911 class049112) {
        return Objects.requireNonNull(this.Lj.get(class049112));
    }

    private static double L(int n) {
        return Math.pow(10.0, (double)n / 100.0);
    }

    private static class00392 L(class00392 class003922, int n) {
        return class00392.N((String)"options.pixel_value", (Object[])new Object[]{class003922, n});
    }

    public class04370<Boolean> L() {
        return this.Ne;
    }

    public class04370<Boolean> Nd() {
        return this.Lp;
    }

    public class04370<Boolean> Nl() {
        return this.LX;
    }

    public class04370<Double> No() {
        return this.uZ;
    }

    private static void M(String string) {
        Config config = Config.getInstance();
        if (!config.language.equals(string)) {
            LanguageReload.LOGGER.info("Game language ({}) and config language ({}) are different. Updating config", (Object)string, (Object)config.language);
            config.previousLanguage = config.language;
            config.previousFallbacks = config.fallbacks;
            config.language = string;
            config.fallbacks.clear();
            if (!string.equals("en_us")) {
                config.fallbacks.add("en_us");
            }
            Config.save();
        }
    }

    public class04370<Double> M() {
        return this.Np;
    }

    public class04370<Boolean> P() {
        return this.yi;
    }

    public class04370<Boolean> NP() {
        return this.Lk;
    }

    public class04370<class01307> X() {
        return this.yA;
    }

    public class04370<Double> K() {
        return this.yK;
    }

    public class04370<Boolean> T() {
        return this.yB;
    }

    public class04370<Boolean> Q() {
        return this.yk;
    }

    public class05630(class06202 class062022, File file) {
        this.Nt = class062022;
        this.LF = new File(file, "options.txt");
        boolean bl2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
        this.Nc = new class04370("options.renderDistance", class04370.method_42399(), (class003922, n) -> class05630.N(class003922, (class00392)class00392.N((String)"options.chunks", (Object[])new Object[]{n})), (class04344)new class04369(2, bl2 ? 32 : 16, false), (Object)12, n -> {
            class05630.N(class03063::W);
            this.yy();
        });
        this.NX = new class04370("options.simulationDistance", class04370.method_42399(), (class003922, n) -> class05630.N(class003922, (class00392)class00392.N((String)"options.chunks", (Object[])new Object[]{n})), (class04344)new class04369(class07529.n ? 2 : 5, bl2 ? 32 : 16, false), (Object)12, n -> this.yy());
        this.NQ = class07536.m() == class07533.field_1133;
        this.Na();
        this.N(class062022, file, null);
    }

    public class04370<Integer> B() {
        return this.NF;
    }

    public class04370<Boolean> C() {
        return this.LN;
    }

    public class04370<Boolean> D() {
        return this.Lu;
    }

    public class04370<Boolean> F() {
        return this.yS;
    }

    public class04370<Double> I() {
        return this.yg;
    }

    public class04370<Double> J() {
        return this.yI;
    }

    public class04370<Boolean> S() {
        return this.Ly;
    }

    public class04370<class01241> Z() {
        return this.Nf;
    }

    public class04370<Integer> V() {
        return this.yV;
    }

    public class04370<Integer> e() {
        return this.yH;
    }

    public class04370<Integer> i() {
        return this.Nc;
    }

    public class04370<Double> b() {
        return this.yz;
    }

    public class04370<Boolean> x() {
        return this.LL;
    }

    public class04370<Boolean> s() {
        return this.yM;
    }

    public class04370<class06532> c() {
        return this.yp;
    }

    public class04370<Double> n() {
        return this.ys;
    }

    public class04370<Boolean> h() {
        return this.Li;
    }

    public class04370<Boolean> f() {
        return this.yh;
    }

    public int l() {
        return (Integer)this.G().method_41753();
    }

    public class04370<Double> d() {
        return this.yn;
    }

    public class04370<Integer> a() {
        return this.yf;
    }

    public class04370<Boolean> m() {
        return this.yL;
    }

    public class04370<Double> o() {
        return this.yJ;
    }

    public class04370<Double> p() {
        return this.yC;
    }

    public class04370<Boolean> k() {
        return this.yl;
    }

    public class04370<Double> t() {
        return this.yT;
    }

    public class04370<Double> g() {
        return this.yO;
    }

    public class04370<class08027> v() {
        return this.yP;
    }

    public class04370<class01825> j() {
        return this.ym;
    }

    public class04370<Double> q() {
        return this.yo;
    }

    public class04370<class01301> U() {
        return this.ND;
    }

    private int z(int n) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17_1)) {
            return 0;
        }
        return n;
    }

    public class04370<class02424> z() {
        return this.Nx;
    }

    public class04370<Double> u() {
        return this.NH;
    }

    public class04370<Boolean> r() {
        return this.LR;
    }

    private static class00392 y(class00392 class003922, double d) {
        if (d == 0.0) {
            return class05630.N(class003922, class05220.L);
        }
        return class05630.N(class003922, d);
    }

    static boolean y(String string) {
        return "false".equals(string);
    }

    public final float y(class04911 class049112) {
        return ((Double)this.L(class049112).method_41753()).floatValue();
    }

    public void y(class01623 class016232) {
        LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        Iterator<String> iterator = this.Z.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            class01055 class010552 = class016232.L(string);
            if (class010552 == null && !string.startsWith("file/")) {
                class010552 = class016232.L("file/" + string);
            }
            if (class010552 == null) {
                N.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", (Object)string);
                iterator.remove();
                continue;
            }
            if (!class010552.u().N() && !this.z.contains(string)) {
                N.warn("Removed resource pack {} from options because it is no longer compatible", (Object)string);
                iterator.remove();
                continue;
            }
            if (class010552.u().N() && this.z.contains(string)) {
                N.info("Removed resource pack {} from incompatibility list because it's now compatible", (Object)string);
                this.z.remove(string);
                continue;
            }
            linkedHashSet.add(class010552.M());
        }
        class016232.y((Collection)linkedHashSet);
    }

    public void y(int n) {
        this.Na = n = this.z(n);
    }

    public int y(float f) {
        return class02566.N((float)this.N(f), (float)0.0f, (float)0.0f, (float)0.0f);
    }

    public class04370<Boolean> y() {
        return this.NK;
    }

    public static class00392 y(class00392 class003922, int n) {
        if (n == 0) {
            return class05630.N(class003922, class05220.L);
        }
        return class05630.N(class003922, n);
    }

    void y(CallbackInfo callbackInfo) {
        if (!this.LF.exists()) {
            LanguageReload.shouldSetSystemLanguage = true;
        }
    }

    public class04370<Integer> E() {
        return this.Nh;
    }

    public class04370<Boolean> A() {
        return this.yD;
    }

    private void N(class05603 class056032, String string, class04370 class043702) {
        if ((Integer)class043702.method_41753() == 0) {
            class043702.method_41748((Object)120);
        }
        class056032.N(string, class043702);
    }

    void N(class06202 class062022, File file, CallbackInfo callbackInfo) {
        if (!LanguageReload.shouldSetSystemLanguage) {
            class05630.M(this.Nk);
        }
    }

    private boolean N(class01055 class010552, Operation operation) {
        return (Boolean)operation.call(new Object[]{class010552}) != false || ((FabricPack)class010552).fabric$isHidden();
    }

    public void N(CallbackInfo callbackInfo) {
        this.Nn = KeyBindingRegistryImpl.process((class06428[])this.Nn);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if ((Integer)this.Nc.method_41753() < 4) {
            return;
        }
        Iris.getPipelineManager().getPipeline().ifPresent(worldRenderingPipeline -> {
            CloudSetting cloudSetting = worldRenderingPipeline.getCloudSetting();
            switch (class10529.N[cloudSetting.ordinal()]) {
                case 1: {
                    callbackInfoReturnable.setReturnValue((Object)class01301.field_18162);
                    return;
                }
                case 2: {
                    callbackInfoReturnable.setReturnValue((Object)class01301.field_18163);
                    return;
                }
                case 3: {
                    callbackInfoReturnable.setReturnValue((Object)class01301.field_18164);
                }
            }
        });
    }

    void N(class07001 class070012, CallbackInfoReturnable callbackInfoReturnable) {
        String string = ((class07001)callbackInfoReturnable.getReturnValue()).y("lang", M);
        if (string.isEmpty()) {
            LanguageReload.shouldSetSystemLanguage = true;
        } else {
            class05630.M(string);
        }
    }

    public static class00392 N(class00392 class003922, int n) {
        return class05630.N(class003922, (class00392)class00392.y((String)Integer.toString(n)));
    }

    public static class00392 N(class00392 class003922, class00392 class003923) {
        return class00392.N((String)"options.generic_value", (Object[])new Object[]{class003922, class003923});
    }

    private static class00392 N(class00392 class003922, double d) {
        return class00392.N((String)"options.percent_value", (Object[])new Object[]{class003922, (int)(d * 100.0)});
    }

    public final float N(class04911 class049112) {
        if (class049112 == class04911.field_15250) {
            return this.y(class049112);
        }
        return this.y(class049112) * this.y(class04911.field_15250);
    }

    private static void N(Consumer<class03063> consumer) {
        class03063 class030632 = (class03063)class06202.Nq().B_2;
        if (class030632 != null) {
            consumer.accept(class030632);
        }
    }

    public boolean N(class08030 class080302) {
        return this.yY.contains(class080302);
    }

    public void N(class08030 class080302, boolean bl) {
        if (bl) {
            this.yY.add(class080302);
        } else {
            this.yY.remove(class080302);
        }
    }

    private void N(class05603 class056032) {
        this.N((class05611)class056032);
        class056032.N("autoJump", this.yh);
        class056032.N("rotateWithMinecart", this.LN);
        class056032.N("operatorItemsTab", this.Ly);
        class056032.N("autoSuggestions", this.LL);
        class056032.N("chatColors", this.Lu);
        class056032.N("chatLinks", this.Li);
        class056032.N("chatLinksPrompt", this.LR);
        class056032.N("discrete_mouse_scroll", this.LW);
        class056032.N("invertXMouse", this.LU);
        class056032.N("invertYMouse", this.LE);
        class056032.N("realmsNotifications", this.LP);
        class056032.N("showSubtitles", this.Ln);
        class056032.N("directionalAudio", this.Ll);
        class056032.N("touchscreen", this.Lw);
        class056032.N("bobView", this.LY);
        class056032.N("toggleCrouch", this.Lg);
        class056032.N("toggleSprint", this.LI);
        class056032.N("toggleAttack", this.LJ);
        class056032.N("toggleUse", this.Lo);
        class056032.N("sprintWindow", this.LK);
        class056032.N("darkMojangStudiosBackground", this.No);
        class056032.N("hideLightningFlashes", this.NK);
        class056032.N("hideSplashTexts", this.Ne);
        class056032.N("mouseSensitivity", this.NH);
        class056032.N("damageTiltStrength", this.uB);
        class056032.N("highContrast", this.yl);
        class056032.N("highContrastBlockOutline", this.yw);
        class056032.N("narratorHotkey", this.yk);
        this.Z = class056032.N("resourcePacks", this.Z, class05630::L, arg_0 -> ((Gson)y).toJson(arg_0));
        this.z = class056032.N("incompatibleResourcePacks", this.z, class05630::L, arg_0 -> ((Gson)y).toJson(arg_0));
        this.Nl = class056032.N("lastServer", this.Nl);
        this.Nk = class056032.N("lang", this.Nk);
        class056032.N("chatVisibility", this.yP);
        class056032.N("chatOpacity", this.ys);
        class056032.N("chatLineSpacing", this.yT);
        class056032.N("textBackgroundOpacity", this.yn);
        class056032.N("backgroundForChatOnly", this.Ld);
        this.E = class056032.N("hideServerAddress", this.E);
        this.W = class056032.N("advancedItemTooltips", this.W);
        this.m = class056032.N("pauseOnLostFocus", this.m);
        this.P = class056032.N("overrideWidth", this.P);
        this.s = class056032.N("overrideHeight", this.s);
        class056032.N("chatHeightFocused", this.yJ);
        class056032.N("chatDelay", this.yo);
        class056032.N("chatHeightUnfocused", this.yI);
        class056032.N("chatScale", this.yO);
        class056032.N("chatWidth", this.yg);
        class056032.N("notificationDisplayTime", this.yK);
        this.yF = class056032.N("useNativeTransport", this.yF);
        class056032.N("mainHand", this.yQ);
        class056032.N("attackIndicator", this.yA);
        this.T = class056032.N("tutorialStep", this.T, class08966::N, class08966::N);
        class056032.N("mouseWheelSensitivity", this.yC);
        class056032.N("rawMouseInput", this.yS);
        class056032.N("allowCursorChanges", this.yD);
        this.j = class056032.N("glDebugVerbosity", this.j);
        this.v = class056032.N("skipMultiplayerWarning", this.v);
        class056032.N("hideMatchedNames", this.Le);
        this.b = class056032.N("joinedFirstServer", this.b);
        this.NQ = class056032.N("syncChunkWrites", this.NQ);
        class056032.N("showAutosaveIndicator", this.LH);
        class056032.N("allowServerListing", this.LT);
        class056032.N("onlyShowSecureChat", this.LX);
        class056032.N("saveChatDrafts", this.Lp);
        class056032.N("panoramaScrollSpeed", this.yt);
        class056032.N("telemetryOptInExtra", this.LS);
        this.NY = class056032.N("onboardAccessibility", this.NY);
        class056032.N("menuBackgroundBlurriness", this.yv);
        this.NO = class056032.N("startedCleanly", this.NO);
        class056032.N("musicToast", this.uT);
        class056032.N("musicFrequency", this.us);
        for (class06428 class064282 : this.Nn) {
            String string;
            String string2 = class064282.s();
            if (string2.equals(string = class056032.N("key_" + class064282.U(), string2))) continue;
            class064282.y(class04655.N((String)string));
        }
        for (class06428 class064282 : class04911.values()) {
            class056032.N("soundCategory_" + class064282.N(), this.Lj.get(class064282));
        }
        for (class06428 class064283 : class08030.values()) {
            boolean bl = this.yY.contains(class064283);
            boolean bl2 = class056032.N("modelPart_" + class064283.L(), bl);
            if (bl2 == bl) continue;
            this.N((class08030)class064283, bl2);
        }
    }

    static boolean N(String string) {
        return "true".equals(string);
    }

    private class07001 N(class07001 class070012) {
        int n = 0;
        try {
            n = class070012.Z("version").map(Integer::parseInt).orElse(0);
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        class07001 class070013 = class05715.field_19216.N(this.Nt.Nh(), class070012, n);
        this.N(class070012, new CallbackInfoReturnable(M, false, (Object)class070013));
        return class070013;
    }

    private class04370<Double> N(String string, class04911 class049112) {
        return new class04370(string, class04370.method_42399(), class05630::y, (class04344)class04350.field_37875, (Object)1.0, d -> {
            class06202 class062022 = class06202.Nq();
            class09033 class090332 = class062022.Nr();
            if ((class049112 == class04911.field_15250 || class049112 == class04911.field_15253) && this.N(class04911.field_15253) > 0.0f) {
                class062022.A().y();
            }
            class090332.N(class049112);
            if ((class03448)class062022.T_3 == null) {
                class06977.N((class09033)class090332, (class04911)class049112, (float)d.floatValue());
            }
        });
    }

    public void N(class05455 class054552) {
        this.LA = class054552;
    }

    public float N(float f) {
        return (Boolean)this.Ld.method_41753() != false ? f : ((Double)this.d().method_41753()).floatValue();
    }

    public int N(int n) {
        return (Boolean)this.Ld.method_41753() != false ? n : class02566.N((float)((Double)this.yn.method_41753()).floatValue(), (float)0.0f, (float)0.0f, (float)0.0f);
    }

    private void N(class05611 class056112) {
        class056112.N("ao", this.yB);
        class056112.N("biomeBlendRadius", this.yf);
        class056112.N("chunkSectionFadeInTime", this.yz);
        class056112.N("cutoutLeaves", this.yL);
        class056112.N("enableVsync", this.LM);
        class056112.N("entityDistanceScaling", this.Np);
        class056112.N("entityShadows", this.LB);
        class056112.N("forceUnicodeFont", this.LZ);
        class056112.N("japaneseGlyphVariants", this.Lz);
        class056112.N("fov", this.Lf);
        class056112.N("fovEffectScale", this.Lr);
        class056112.N("darknessEffectScale", this.uy);
        class056112.N("glintSpeed", this.uu);
        class056112.N("glintStrength", this.uR);
        class056112.N("graphicsPreset", this.Nf);
        class056112.N("prioritizeChunkUpdates", this.ym);
        class056112.N("fullscreen", this.Lk);
        class056112.N("gamma", this.uZ);
        class056112.N("guiScale", this.uU);
        class056112.N("maxAnisotropyBit", this.yH);
        class056112.N("textureFiltering", this.yp);
        class056112.N("maxFps", this.NF);
        class056112.N("improvedTransparency", this.yM);
        class056112.N("inactivityFpsLimit", this.Nx);
        class056112.N("mipmapLevels", this.yV);
        class056112.N("narrator", this.uW);
        class056112.N("particles", this.uE);
        class056112.N("reducedDebugInfo", this.Lb);
        class056112.N("renderClouds", this.ND);
        class056112.N("cloudRange", this.Nh);
        class056112.N("renderDistance", this.Nc);
        class056112.N("simulationDistance", this.NX);
        class056112.N("screenEffectScale", this.LD);
        class056112.N("soundDevice", this.um);
        class056112.N("vignette", this.yi);
        class056112.N("weatherRadius", this.yN);
    }

    public void N(class01241 class012412) {
        this.NA = true;
        class012412.N(this.Nt);
        this.NA = false;
    }

    public class04370<Boolean> N() {
        return this.No;
    }

    public void N(class01623 class016232) {
        ImmutableList immutableList = ImmutableList.copyOf(this.Z);
        this.Z.clear();
        this.z.clear();
        for (class01055 class010552 : class016232.M()) {
            class01055 class010553 = class010552;
            if (this.N(class010553, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_3288]");
                return ((class01055)objectArray[0]).z();
            })) continue;
            this.Z.add(class010552.M());
            if (class010552.u().N()) continue;
            this.z.add(class010552.M());
        }
        this.Np();
        ImmutableList immutableList2 = ImmutableList.copyOf(this.Z);
        if (!immutableList2.equals(immutableList)) {
            this.Nt.yy();
        }
    }

    private static int N(double d) {
        return class04995.N((double)(Math.log10(d) * 100.0));
    }

    public void NA() {
        if ((class04453)this.Nt.T_4 != null) {
            ((class01683)((class04453)this.Nt.T_4).y_0).N(this.NF());
        }
    }

    public class04370<Integer> W() {
        return this.yN;
    }

    public class04370<Integer> R() {
        return this.NX;
    }

    public class04370<Boolean> NT() {
        return this.Lg;
    }

    public class04370<Boolean> Ni() {
        return this.LU;
    }

    public class04370<class07070> O() {
        return this.yQ;
    }

    public class04370<Boolean> Nu() {
        return this.Lz;
    }

    public int H() {
        return Math.min(1 << (Integer)this.yH.method_41753(), RenderSystem.getDevice().getMaxSupportedAnisotropy());
    }

    public String ND() {
        ArrayList<Pair> arrayList = new ArrayList<Pair>();
        this.N((class05611)new class10526(this, arrayList));
        arrayList.add(Pair.of((Object)"fullscreenResolution", (Object)String.valueOf(this.U)));
        arrayList.add(Pair.of((Object)"glDebugVerbosity", (Object)this.j));
        arrayList.add(Pair.of((Object)"overrideHeight", (Object)this.s));
        arrayList.add(Pair.of((Object)"overrideWidth", (Object)this.P));
        arrayList.add(Pair.of((Object)"syncChunkWrites", (Object)this.NQ));
        arrayList.add(Pair.of((Object)"useNativeTransport", (Object)this.yF));
        arrayList.add(Pair.of((Object)"resourcePacks", this.Z));
        return arrayList.stream().sorted(Comparator.comparing(Pair::getFirst)).map(pair -> (String)pair.getFirst() + ": " + String.valueOf(pair.getSecond())).collect(Collectors.joining(System.lineSeparator()));
    }

    public class04370<Boolean> Nz() {
        return this.Lb;
    }

    public class04370<Integer> G() {
        return this.yv;
    }

    public class04370<Boolean> Nm() {
        return this.Lw;
    }

    public class04370<Boolean> NZ() {
        return this.LT;
    }

    public class04370<Boolean> NR() {
        return this.LE;
    }

    public class04370<Boolean> Y() {
        return this.yw;
    }

    public class04370<Boolean> NB() {
        return this.LP;
    }

    public class04370<Double> NO() {
        return this.uy;
    }

    public class04370<Boolean> NL() {
        return this.LZ;
    }

    public class04370<Boolean> NN() {
        return this.LM;
    }

    public class04370<Boolean> NM() {
        return this.LW;
    }

    public File Nx() {
        return this.LF;
    }

    public class04370<Boolean> Nb() {
        return this.LI;
    }

    public class04370<Double> NQ() {
        return this.Lr;
    }

    private static void Nr() {
        class06202 class062022 = class06202.Nq();
        if (class062022.Nt() != null) {
            class062022.NU();
            class062022.V();
        }
    }

    public int Nh() {
        return this.Na > 0 ? Math.min((Integer)this.Nc.method_41753(), this.Na) : (Integer)this.Nc.method_41753();
    }

    public class04370<class01315> NK() {
        return this.uE;
    }

    public class04370<Boolean> NG() {
        return this.LH;
    }

    public class04370<Boolean> Nt() {
        return this.Le;
    }

    public class04370<Boolean> NE() {
        return this.Ll;
    }

    public class04370<Boolean> Nv() {
        return this.Lo;
    }

    public class04370<Boolean> Nk() {
        return this.LS;
    }

    public class04370<Boolean> Ns() {
        return this.LY;
    }

    public class04370<Boolean> NU() {
        return this.Ln;
    }

    public class04370<Boolean> NW() {
        return this.Ld;
    }

    public class04370<Integer> Nn() {
        return this.LK;
    }

    public class01301 Nf() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable(M, true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01301)callbackInfoReturnable.getReturnValue();
        }
        return (class01301)this.ND.method_41753();
    }

    public class04370<Integer> Nw() {
        return this.Lf;
    }

    public class05455 NS() {
        return this.LA;
    }

    public void NH() {
        this.NY = false;
        this.Np();
    }

    private @Nullable String yL() {
        class08844 class088442 = this.Nt.Nt();
        if (class088442 == null) {
            return this.U;
        }
        if (class088442.i().isPresent()) {
            return ((class04760)class088442.i().get()).M();
        }
        return null;
    }

    private void yy() {
        if (this.NA) {
            return;
        }
        this.Nf.method_41748((Object)class01241.field_63461);
        class05096 class050962 = (class05096)this.Nt.v_3;
        if (class050962 instanceof class05914) {
            ((class05914)class050962).method_75370(this.Nf);
        }
    }

    public class04370<class09021> Nc() {
        return this.us;
    }

    public class04370<Boolean> Ny() {
        return this.LB;
    }

    public void Np() {
        try (PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(this.LF), StandardCharsets.UTF_8));){
            printWriter.println("version:" + class07529.y().comp_4026().y());
            this.N(new class05606(this, printWriter));
            String string = this.yL();
            if (string != null) {
                printWriter.println("fullscreenResolution:" + string);
            }
        }
        catch (Exception exception) {
            N.error("Failed to save options", (Throwable)exception);
        }
        this.NA();
    }

    private static boolean yN() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
    }

    public class04370<String> Ne() {
        return this.um;
    }

    public class04370<Boolean> Nj() {
        return this.LJ;
    }

    public class04370<class06535> NX() {
        return this.uT;
    }

    public class03737 NF() {
        int n = 0;
        for (class08030 class080302 : this.yY) {
            n |= class080302.N();
        }
        return new class03737(this.Nk, ((Integer)this.Nc.method_41753()).intValue(), (class08027)this.yP.method_41753(), ((Boolean)this.Lu.method_41753()).booleanValue(), n, (class07070)this.yQ.method_41753(), this.Nt.yi(), ((Boolean)this.LT.method_41753()).booleanValue(), (class01315)this.uE.method_41753());
    }

    public class04370<Double> Ng() {
        return this.uu;
    }

    public class04370<Double> NJ() {
        return this.uB;
    }

    public class04370<Double> NI() {
        return this.uR;
    }

    public class04370<class01299> NV() {
        return this.uW;
    }

    public class04370<Integer> Nq() {
        return this.uU;
    }

    public boolean NC() {
        return this.yF;
    }

    public void Na() {
        block9: {
            this.N((CallbackInfo)null);
            this.y((CallbackInfo)null);
            if (this.LF.exists()) break block9;
            this.L((CallbackInfo)null);
            return;
        }
        try {
            class07001 class070012 = new class07001();
            try (BufferedReader bufferedReader = Files.newReader((File)this.LF, (Charset)StandardCharsets.UTF_8);){
                bufferedReader.lines().forEach(string -> {
                    try {
                        Iterator iterator = NI.split((CharSequence)string).iterator();
                        class070012.N_67((String)iterator.next(), (String)iterator.next());
                    }
                    catch (Exception exception) {
                        N.warn("Skipping bad option: {}", string);
                    }
                });
            }
            bufferedReader = this.N(class070012);
            this.N(new class05590(this, (class07001)bufferedReader));
            bufferedReader.Z("fullscreenResolution").ifPresent(string -> {
                this.U = string;
            });
            class06428.i();
        }
        catch (Exception exception) {
            N.error("Failed to load options", (Throwable)exception);
        }
        this.L((CallbackInfo)null);
    }
}

