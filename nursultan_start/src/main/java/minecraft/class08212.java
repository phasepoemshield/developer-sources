/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10883
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.shaders.ShaderType
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00056
 *  minecraft.class00183
 *  minecraft.class00951
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01291
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02414
 *  minecraft.class02416
 *  minecraft.class02770
 *  minecraft.class03069
 *  minecraft.class03579
 *  minecraft.class04643
 *  minecraft.class04866
 *  minecraft.class06176
 *  minecraft.class06290
 *  minecraft.class08086
 *  minecraft.class08117
 *  minecraft.class08326
 *  minecraft.class08394
 *  minecraft.class08396
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
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10883;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import minecraft.class00056;
import minecraft.class00183;
import minecraft.class00951;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01291;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02414;
import minecraft.class02416;
import minecraft.class02770;
import minecraft.class03069;
import minecraft.class03579;
import minecraft.class04643;
import minecraft.class04866;
import minecraft.class06176;
import minecraft.class06290;
import minecraft.class08086;
import minecraft.class08117;
import minecraft.class08204;
import minecraft.class08205;
import minecraft.class08210;
import minecraft.class08231;
import minecraft.class08290;
import minecraft.class08326;
import minecraft.class08394;
import minecraft.class08396;
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
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@Environment(value=EnvType.CLIENT)
public class class08212
extends class01291<class08204>
implements AutoCloseable,
FabricResourceReloader {
    static final Logger N = LogUtils.getLogger();
    public static final int y = 32768;
    public static final String L = "shaders";
    private static final String R = "shaders/include/";
    private static final class03069 M = class03069.N((String)"post_effect");
    final class08627 u;
    private final Consumer<Exception> B;
    private class08231 Z = new class08231(this, class08204.L);
    final class00056 i = new class00056("post", 0.1f, 1000.0f, false);
    private class01894 z;

    public class08212(class08627 class086272, Consumer<Exception> consumer) {
        this.u = class086272;
        this.B = consumer;
    }

    @Override
    public void close() {
        this.Z.close();
        this.i.close();
    }

    private void N(Exception exception) {
        if (this.Z.y) {
            return;
        }
        this.B.accept(exception);
        this.Z.y = true;
    }

    public @Nullable class08086 N(class01894 class018942, Set<class01894> set) {
        try {
            return this.Z.N(class018942, set);
        }
        catch (class10883 class108832) {
            N.error("Failed to load post chain: {}", (Object)class018942, (Object)class108832);
            this.Z.N.put(class018942, Optional.empty());
            this.N((Exception)((Object)class108832));
            return null;
        }
    }

    public @Nullable String N(class01894 class018942, ShaderType shaderType) {
        return this.Z.N(class018942, shaderType);
    }

    private static void N(class01894 class018942, class01079 class010792, ShaderType shaderType, Map<class01894, class01079> map, ImmutableMap.Builder<class08205, String> builder) {
        class01894 class018943 = shaderType.idConverter().y(class018942);
        class02770 class027702 = class08212.N(map, class018942);
        try (BufferedReader bufferedReader = class010792.method_43039();){
            String string = IOUtils.toString((Reader)bufferedReader);
            builder.put((Object)new class08205(class018943, shaderType), (Object)String.join((CharSequence)"", class027702.N(string)));
        }
        catch (IOException iOException) {
            N.error("Failed to load shader source at {}", (Object)class018942, (Object)iOException);
        }
    }

    protected class08204 y(class01089 class010892, class04643 class046432) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Map map = class010892.y(L, class08212::N);
        for (Map.Entry entry : map.entrySet()) {
            class01894 object = (class01894)entry.getKey();
            ShaderType shaderType = ShaderType.byLocation((class01894)object);
            if (shaderType == null) continue;
            class08212.N(object, (class01079)entry.getValue(), shaderType, map, (ImmutableMap.Builder<class08205, String>)builder);
        }
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        for (Map.Entry entry : M.N(class010892).entrySet()) {
            class08212.N((class01894)entry.getKey(), (class01079)entry.getValue(), (ImmutableMap.Builder<class01894, class02414>)builder2);
        }
        return new class08204((Map<class08205, String>)builder.build(), (Map<class01894, class02414>)builder2.build());
    }

    private static void N(class01894 class018942, class01079 class010792, ImmutableMap.Builder<class01894, class02414> builder) {
        class01894 class018943 = M.y(class018942);
        try (BufferedReader bufferedReader = class010792.method_43039();){
            JsonElement jsonElement = class08326.N((Reader)bufferedReader);
            builder.put((Object)class018943, (Object)((class02414)class02414.N.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow(JsonSyntaxException::new)));
        }
        catch (JsonParseException | IOException throwable) {
            N.error("Failed to parse post chain at {}", (Object)class018942, (Object)throwable);
        }
    }

    private static boolean N(class01894 class018942) {
        return ShaderType.byLocation((class01894)class018942) != null || class018942.N().endsWith(".glsl");
    }

    protected void N(class08204 class082042, class01089 class010892, class04643 class046432) {
        class08231 class082312 = new class08231(this, class082042);
        HashSet hashSet = new HashSet(class08394.N());
        ArrayList<class01894> arrayList = new ArrayList<class01894>();
        GpuDevice gpuDevice = RenderSystem.getDevice();
        gpuDevice.clearPipelineCache();
        for (RenderPipeline renderPipeline : hashSet) {
            if (gpuDevice.precompilePipeline(renderPipeline, class082312::N).isValid()) continue;
            arrayList.add(renderPipeline.getLocation());
        }
        if (!arrayList.isEmpty()) {
            gpuDevice.clearPipelineCache();
            throw new RuntimeException("Failed to load required shader programs:\n" + arrayList.stream().map(class018942 -> " - " + String.valueOf(class018942)).collect(Collectors.joining("\n")));
        }
        this.Z.close();
        this.Z = class082312;
    }

    private static class02770 N(Map<class01894, class01079> map, class01894 class018942) {
        class01894 class018943 = class018942.N(class06290::L);
        return new class08210(class018943, map);
    }

    public class01894 fabric$getId() {
        if (this.z == null) {
            class08212 class082122 = this;
            this.z = class082122 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class082122 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class082122 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class082122 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class082122 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class082122 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class082122 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class082122 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class082122 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class082122 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class082122 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class082122 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class082122 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class082122 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class082122 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class082122 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class082122 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class082122 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + class082122.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.z;
    }

    public String method_22322() {
        return "Shader Loader";
    }
}

