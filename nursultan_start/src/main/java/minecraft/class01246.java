/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.logging.LogUtils
 *  minecraft.class00183
 *  minecraft.class00951
 *  minecraft.class01089
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class03579
 *  minecraft.class04643
 *  minecraft.class04866
 *  minecraft.class06176
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08326
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08694
 *  minecraft.class08718
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import minecraft.class00183;
import minecraft.class00951;
import minecraft.class01089;
import minecraft.class01256;
import minecraft.class01291;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class03579;
import minecraft.class04643;
import minecraft.class04866;
import minecraft.class06176;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08326;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08694;
import minecraft.class08718;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@Environment(value=EnvType.CLIENT)
public class class01246
extends class01291<class01256>
implements FabricResourceReloader {
    private static final Logger N = LogUtils.getLogger();
    private static final class01894 y = class01894.y((String)"gpu_warnlist.json");
    private ImmutableMap<String, String> L = ImmutableMap.of();
    private boolean u;
    private boolean i;
    private class01894 R;

    /*
     * Enabled aggressive exception aggregation
     */
    private static @Nullable JsonObject L(class01089 class010892, class04643 class046432) {
        try (class08694 class086942 = class046432.i("parse_json");){
            JsonObject jsonObject;
            block14: {
                BufferedReader bufferedReader = class010892.i(y);
                try {
                    jsonObject = class08326.N((Reader)bufferedReader).getAsJsonObject();
                    if (bufferedReader == null) break block14;
                }
                catch (Throwable throwable) {
                    if (bufferedReader != null) {
                        try {
                            ((Reader)bufferedReader).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                ((Reader)bufferedReader).close();
            }
            return jsonObject;
        }
        catch (JsonSyntaxException | IOException throwable) {
            N.warn("Failed to load GPU warnlist", throwable);
            return null;
        }
    }

    public void L() {
        this.u = true;
    }

    public @Nullable String M() {
        return (String)this.L.get((Object)"renderer");
    }

    public @Nullable String B() {
        return (String)this.L.get((Object)"version");
    }

    public @Nullable String Z() {
        return (String)this.L.get((Object)"vendor");
    }

    public boolean i() {
        return this.u && !this.i;
    }

    public @Nullable String z() {
        StringBuilder stringBuilder = new StringBuilder();
        this.L.forEach((string, string2) -> stringBuilder.append((String)string).append(": ").append((String)string2));
        return stringBuilder.isEmpty() ? null : stringBuilder.toString();
    }

    public void u() {
        this.i = true;
    }

    public boolean y() {
        return this.N() && !this.i;
    }

    public boolean N() {
        return !this.L.isEmpty();
    }

    @Override
    protected class01256 y(class01089 class010892, class04643 class046432) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        JsonObject jsonObject = class01246.L(class010892, class046432);
        if (jsonObject != null) {
            try (class08694 class086942 = class046432.i("compile_regex");){
                class01246.N(jsonObject.getAsJsonArray("renderer"), arrayList);
                class01246.N(jsonObject.getAsJsonArray("version"), arrayList2);
                class01246.N(jsonObject.getAsJsonArray("vendor"), arrayList3);
            }
        }
        return new class01256(arrayList, arrayList2, arrayList3);
    }

    @Override
    protected void N(class01256 class012562, class01089 class010892, class04643 class046432) {
        this.L = class012562.N();
    }

    private static void N(JsonArray jsonArray, List<Pattern> list) {
        jsonArray.forEach(jsonElement -> list.add(Pattern.compile(jsonElement.getAsString(), 2)));
    }

    public class01894 fabric$getId() {
        if (this.R == null) {
            class01246 var1 = this;
            this.R = var1 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (var1 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (var1 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (var1 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (var1 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (var1 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (var1 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (var1 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (var1 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (var1 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (var1 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (var1 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (var1 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (var1 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (var1 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (var1 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (var1 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (var1 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + var1.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.R;
    }

    public void R() {
        this.u = false;
        this.i = false;
    }
}

