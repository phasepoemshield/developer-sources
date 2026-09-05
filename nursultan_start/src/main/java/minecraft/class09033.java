/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.reflect.TypeToken
 *  com.mojang.logging.LogUtils
 *  minecraft.class00002
 *  minecraft.class00004
 *  minecraft.class00012
 *  minecraft.class00022
 *  minecraft.class00034
 *  minecraft.class00044
 *  minecraft.class00122
 *  minecraft.class00137
 *  minecraft.class00183
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00951
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01291
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class02857
 *  minecraft.class03579
 *  minecraft.class03621
 *  minecraft.class03836
 *  minecraft.class04206
 *  minecraft.class04643
 *  minecraft.class04866
 *  minecraft.class04911
 *  minecraft.class05001
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class06042
 *  minecraft.class06176
 *  minecraft.class07529
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08694
 *  minecraft.class08718
 *  minecraft.class08999
 *  minecraft.class09023
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import minecraft.class00002;
import minecraft.class00004;
import minecraft.class00012;
import minecraft.class00022;
import minecraft.class00034;
import minecraft.class00044;
import minecraft.class00122;
import minecraft.class00137;
import minecraft.class00183;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00951;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01291;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class02857;
import minecraft.class03579;
import minecraft.class03621;
import minecraft.class03836;
import minecraft.class04206;
import minecraft.class04643;
import minecraft.class04866;
import minecraft.class04911;
import minecraft.class05001;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class06042;
import minecraft.class06176;
import minecraft.class07529;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08694;
import minecraft.class08718;
import minecraft.class08999;
import minecraft.class09023;
import minecraft.class09026;
import minecraft.class09038;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@Environment(value=EnvType.CLIENT)
public class class09033
extends class01291<class09023>
implements FabricResourceReloader {
    public static final class01894 N = class01894.y((String)"empty");
    public static final class00002 y = new class00002(N, (class03621)class06042.N((float)1.0f), (class03621)class06042.N((float)1.0f), 1, class00022.field_5474, false, false, 16);
    public static final class01894 L = class01894.y((String)"intentionally_empty");
    public static final class00137 u = new class00137(L, null);
    public static final class00002 i = new class00002(L, (class03621)class06042.N((float)1.0f), (class03621)class06042.N((float)1.0f), 1, class00022.field_5474, false, false, 16);
    static Logger R = LogUtils.getLogger();
    private static final String M = "sounds.json";
    private static final Gson B = new GsonBuilder().registerTypeAdapter(class00012.class, (Object)new class00004()).create();
    private static final TypeToken<Map<String, class00012>> Z = new class08999();
    private final Map<class01894, class00137> z = Maps.newHashMap();
    private final class09038 U;
    private final Map<class01894, class01079> E = new HashMap<class01894, class01079>();
    private class01894 W;

    public Collection<class01894> L() {
        return this.z.keySet();
    }

    public boolean L(class00044 class000442) {
        return this.U.y(class000442);
    }

    public void M() {
        this.U.i();
    }

    public class09033(class05630 class056302) {
        this.U = new class09038(this, class056302, class02857.N(this.E));
    }

    public String B() {
        return this.U.R();
    }

    public void Z() {
        this.U.N();
    }

    public void i() {
        this.U.y();
    }

    public void u() {
        this.U.u();
    }

    public void y(class00122 class001222) {
        this.U.y(class001222);
    }

    public class03836 y() {
        return this.U.B();
    }

    public void y(class00044 class000442) {
        this.U.N(class000442);
    }

    public void N(class00122 class001222) {
        this.U.N(class001222);
    }

    public List<String> N() {
        return this.U.M();
    }

    public void N(class04911 class049112, float f) {
        this.U.N(class049112, f);
    }

    public void N(class00034 class000342) {
        this.U.N(class000342);
    }

    protected class09023 y(class01089 class010892, class04643 class046432) {
        class09023 class090232 = new class09023();
        try (class08694 class086942 = class046432.i("list");){
            class090232.N(class010892);
        }
        for (String string : class010892.N()) {
            try {
                class08694 class086943 = class046432.i(string);
                try {
                    List list = class010892.N(class01894.N((String)string, (String)M));
                    for (class01079 class010792 : list) {
                        class046432.N(class010792.method_14480());
                        try (BufferedReader bufferedReader = class010792.method_43039();){
                            class046432.N("parse");
                            Map map = (Map)class05001.y((Gson)B, (Reader)bufferedReader, Z);
                            class046432.y("register");
                            for (Map.Entry entry : map.entrySet()) {
                                class090232.N(class01894.N((String)string, (String)((String)entry.getKey())), (class00012)entry.getValue());
                            }
                            class046432.L();
                        }
                        catch (RuntimeException runtimeException) {
                            R.warn("Invalid {} in resourcepack: '{}'", new Object[]{M, class010792.method_14480(), runtimeException});
                        }
                        class046432.L();
                    }
                }
                finally {
                    if (class086943 == null) continue;
                    class086943.close();
                }
            }
            catch (IOException iOException) {}
        }
        return class090232;
    }

    protected void N(class09023 class090232, class01089 class010892, class04643 class046432) {
        class090232.N(this.z, this.E, this.U);
        if (class07529.ND) {
            for (class01894 class018942 : this.z.keySet()) {
                class00137 class001372 = this.z.get(class018942);
                if (class00390.y((class00392)class001372.N()) || !class04206.y.u(class018942)) continue;
                R.error("Missing subtitle {} for sound event: {}", (Object)class001372.N(), (Object)class018942);
            }
        }
        if (R.isDebugEnabled()) {
            for (class01894 class018942 : this.z.keySet()) {
                if (class04206.y.u(class018942)) continue;
                R.debug("Not having sound event for: {}", (Object)class018942);
            }
        }
        this.U.N();
    }

    public void N(@Nullable class01894 class018942, @Nullable class04911 class049112) {
        this.U.N(class018942, class049112);
    }

    public void N(class04911 ... class04911Array) {
        this.U.N(class04911Array);
    }

    public void N(class05363 class053632) {
        this.U.N(class053632);
    }

    public void N(class00044 class000442, int n) {
        this.U.N(class000442, n);
    }

    public class09026 N(class00044 class000442) {
        return this.U.L(class000442);
    }

    public void N(class04911 class049112) {
        this.U.N(class049112);
    }

    public void N(boolean bl) {
        this.U.N(bl);
    }

    static boolean N(class00002 class000022, class01894 class018942, class02857 class028572) {
        class01894 class018943 = class000022.y();
        if (class028572.method_14486(class018943).isEmpty()) {
            R.warn("File {} does not exist, cannot add it to event {}", (Object)class018943, (Object)class018942);
            return false;
        }
        return true;
    }

    public @Nullable class00137 N(class01894 class018942) {
        return this.z.get(class018942);
    }

    public class01894 fabric$getId() {
        if (this.W == null) {
            class09033 class090332 = this;
            this.W = class090332 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class090332 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class090332 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class090332 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class090332 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class090332 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class090332 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class090332 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class090332 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class090332 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class090332 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class090332 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class090332 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class090332 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class090332 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class090332 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class090332 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class090332 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + ((Object)((Object)class090332)).getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.W;
    }

    public void R() {
        this.U.L();
    }
}

