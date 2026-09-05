/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.ViaFabricPlus
 *  com.viaversion.viafabricplus.visuals.features.force_unicode_font.UnicodeFontFix1_12_2
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  jerozgen.languagereload.LanguageReload
 *  jerozgen.languagereload.config.Config
 *  jerozgen.languagereload.mixin.LanguageManagerAccessor
 *  minecraft.class00183
 *  minecraft.class00951
 *  minecraft.class01089
 *  minecraft.class01622
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class03579
 *  minecraft.class04866
 *  minecraft.class06141
 *  minecraft.class06176
 *  minecraft.class07018
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08429
 *  minecraft.class08430
 *  minecraft.class08507
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.visuals.features.force_unicode_font.UnicodeFontFix1_12_2;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Stream;
import jerozgen.languagereload.LanguageReload;
import jerozgen.languagereload.config.Config;
import jerozgen.languagereload.mixin.LanguageManagerAccessor;
import minecraft.class00183;
import minecraft.class00951;
import minecraft.class01089;
import minecraft.class01622;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class03579;
import minecraft.class04866;
import minecraft.class06141;
import minecraft.class06176;
import minecraft.class07018;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08392;
import minecraft.class08429;
import minecraft.class08430;
import minecraft.class08507;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class08396
implements class06141,
LanguageManagerAccessor,
FabricResourceReloader {
    private static Logger N = LogUtils.getLogger();
    private static final class08430 y = new class08430("US", "English", false);
    private Map<String, class08430> L = ImmutableMap.of((Object)"en_us", (Object)y);
    private String u;
    private final Consumer<class08429> i;
    private class01894 R;

    public static /* synthetic */ class08430 L() {
        return y;
    }

    public class08396(String string, Consumer<class08429> consumer) {
        this.u = string;
        this.i = consumer;
    }

    private void y(class01089 class010892, CallbackInfo callbackInfo) {
        UnicodeFontFix1_12_2.updateUnicodeFontOverride((ProtocolVersion)ViaFabricPlus.getImpl().getTargetVersion());
    }

    public SortedMap<String, class08430> y() {
        return new TreeMap<String, class08430>(this.L);
    }

    public @Nullable class08430 y(String string) {
        return this.L.get(string);
    }

    private static void N(String string, Locale locale) {
        LanguageReload.LOGGER.info("Set language to {} (mapped from {})", (Object)string, (Object)locale.toLanguageTag());
        LanguageReload.setLanguage((String)string);
    }

    private static Map<String, class08430> N(Stream<class01622> stream) {
        HashMap hashMap = Maps.newHashMap();
        stream.forEach(class016222 -> {
            try {
                class08507 class085072 = (class08507)class016222.method_14407(class08507.L);
                if (class085072 != null) {
                    class085072.N().forEach(hashMap::putIfAbsent);
                }
            }
            catch (IOException | RuntimeException exception) {
                N.warn("Unable to parse language metadata section of resourcepack: {}", (Object)class016222.method_14409(), (Object)exception);
            }
        });
        return ImmutableMap.copyOf((Map)hashMap);
    }

    boolean N(List list, Object object) {
        if (Config.getInstance().language.equals("*")) {
            return true;
        }
        if (this.L.isEmpty()) {
            return list.add((String)object);
        }
        Lists.reverse((List)Config.getInstance().fallbacks).stream().filter(string -> Objects.nonNull(this.y((String)string))).forEach(list::add);
        return true;
    }

    public String N() {
        return this.u;
    }

    public void N(String string) {
        this.u = string;
    }

    void N(class01089 class010892, CallbackInfo callbackInfo) {
        if (LanguageReload.shouldSetSystemLanguage) {
            LanguageReload.shouldSetSystemLanguage = false;
            LanguageReload.LOGGER.info("Language is not set. Setting it to system language");
            Locale locale = Locale.getDefault();
            List list = this.L.keySet().stream().filter(string -> string.split("_")[0].equalsIgnoreCase(locale.getLanguage())).toList();
            int n = list.size();
            if (n > 1) {
                list.stream().filter(string -> {
                    String[] stringArray = string.split("_");
                    if (stringArray.length < 2) {
                        return false;
                    }
                    return stringArray[1].equalsIgnoreCase(locale.getCountry());
                }).findFirst().ifPresent(string -> class08396.N(string, locale));
            } else if (n == 1) {
                class08396.N((String)list.getFirst(), locale);
            }
        }
    }

    boolean N(boolean bl) {
        return Config.getInstance().language.equals("*") || this.L.isEmpty();
    }

    public void method_14491(class01089 class010892) {
        class08429 class084292;
        this.L = class08396.N(class010892.y());
        ArrayList<String> arrayList = new ArrayList<String>(2);
        boolean bl = y.u();
        this.N(class010892, null);
        String string = "en_us";
        ArrayList<String> arrayList2 = arrayList;
        this.N(arrayList2, string);
        if (!this.N(this.u.equals("en_us")) && (class084292 = this.L.get(this.u)) != null) {
            arrayList.add(this.u);
            bl = class084292.u();
        }
        class084292 = class08429.N((class01089)class010892, arrayList, (boolean)bl);
        class08392.N((class07018)class084292);
        class07018.N((class07018)class084292);
        this.i.accept(class084292);
        this.y(class010892, null);
    }

    public class01894 fabric$getId() {
        if (this.R == null) {
            class08396 class083962 = this;
            this.R = class083962 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class083962 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class083962 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class083962 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class083962 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class083962 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class083962 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class083962 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class083962 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class083962 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class083962 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class083962 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class083962 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class083962 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class083962 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class083962 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class083962 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class083962 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + class083962.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.R;
    }
}

