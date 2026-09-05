/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00183
 *  minecraft.class00349
 *  minecraft.class00951
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class01781
 *  minecraft.class01891
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class03579
 *  minecraft.class03609
 *  minecraft.class04866
 *  minecraft.class06176
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08280
 *  minecraft.class08290
 *  minecraft.class08354
 *  minecraft.class08361
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08718
 *  minecraft.class08829
 *  minecraft.class08918
 *  minecraft.class08923
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  net.irisshaders.iris.pbr.format.TextureFormatLoader
 *  net.irisshaders.iris.pbr.texture.PBRTextureManager
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class00183;
import minecraft.class00349;
import minecraft.class00951;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01781;
import minecraft.class01891;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class03579;
import minecraft.class03609;
import minecraft.class04866;
import minecraft.class06176;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08280;
import minecraft.class08290;
import minecraft.class08354;
import minecraft.class08361;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08629;
import minecraft.class08639;
import minecraft.class08718;
import minecraft.class08829;
import minecraft.class08918;
import minecraft.class08923;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.pbr.format.TextureFormatLoader;
import net.irisshaders.iris.pbr.texture.PBRTextureManager;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class08627
implements class01081,
AutoCloseable,
FabricResourceReloader {
    private static final Logger y = LogUtils.getLogger();
    public static final class01894 N = class01894.y((String)"");
    private final Map<class01894, class08918> L = new HashMap<class01894, class08918>();
    private final Set<class08629> u = new HashSet<class08629>();
    private final class01089 i;
    private class01894 R;

    public void L(class01894 class018942) {
        class08918 class089182 = this.L.remove(class018942);
        if (class089182 != null) {
            this.y(class018942, class089182);
        }
    }

    public class08627(class01089 class010892) {
        this.i = class010892;
        class08280 class082802 = class08923.N();
        this.N(class08923.L(), (class08918)new class08829(() -> "(intentionally-)Missing Texture", class082802));
    }

    @Override
    public void close() {
        this.L.forEach(this::y);
        this.L.clear();
        this.u.clear();
        this.N((CallbackInfo)null);
    }

    private class08354 y(class01894 class018942, class08361 class083612) {
        try {
            return class08627.N(this.i, class018942, class083612);
        }
        catch (Exception exception) {
            y.error("Failed to load texture {} into slot {}", new Object[]{class083612.method_65859(), class018942, exception});
            return class08354.N();
        }
    }

    private void y(class01894 class018942, class08918 class089182) {
        this.u.remove(class089182);
        try {
            class089182.close();
        }
        catch (Exception exception) {
            y.warn("Failed to close texture {}", (Object)class018942, (Object)exception);
        }
    }

    public class08918 y(class01894 class018942) {
        class08918 class089182 = this.L.get(class018942);
        if (class089182 != null) {
            return class089182;
        }
        class00349 class003492 = new class00349(class018942);
        this.N(class018942, (class08361)class003492);
        return class003492;
    }

    private void N(Path path, CallbackInfo callbackInfo) {
        PBRTextureManager.INSTANCE.dumpTextures(path);
    }

    private void N(List list, Void void_, CallbackInfo callbackInfo) {
        TextureFormatLoader.reload((class01089)this.i);
        PBRTextureManager.INSTANCE.clear();
        CapturedRenderingState.INSTANCE.incrementTextureReloadCount();
    }

    private void N(CallbackInfo callbackInfo) {
        PBRTextureManager.INSTANCE.close();
    }

    public void N() {
        Iterator<class08629> iterator = this.u.iterator();
        while (iterator.hasNext()) {
            iterator.next().y();
        }
    }

    public void N(class01894 class018942, class08918 class089182) {
        class08918 class089183 = this.L.put(class018942, class089182);
        if (class089183 != class089182) {
            if (class089183 != null) {
                this.y(class018942, class089183);
            }
            if (class089182 instanceof class08629) {
                class08629 class086292 = (class08629)class089182;
                this.u.add(class086292);
            }
        }
    }

    public void N(class01894 class018942) {
        this.N(class018942, (class08918)new class00349(class018942));
    }

    public void N(class01894 class018942, class08361 class083612) {
        try {
            class083612.method_65857(this.y(class018942, class083612));
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Uploading texture");
            class07074 class070742 = class070802.N("Uploaded texture");
            class070742.N("Resource location", (Object)class083612.method_65859());
            class070742.N("Texture id", (Object)class018942);
            throw new class07878(class070802);
        }
        this.N(class018942, (class08918)class083612);
    }

    private static class08354 N(class01089 class010892, class01894 class018942, class08361 class083612) throws IOException {
        try {
            return class083612.method_65809(class010892);
        }
        catch (FileNotFoundException fileNotFoundException) {
            if (class018942 != N) {
                y.warn("Missing resource {} referenced from {}", (Object)class083612.method_65859(), (Object)class018942);
            }
            return class08354.N();
        }
    }

    private static class08639 N(class01089 class010892, class01894 class018942, class08361 class083612, Executor executor) {
        return new class08639(class083612, CompletableFuture.supplyAsync(() -> {
            try {
                return class08627.N(class010892, class018942, class083612);
            }
            catch (IOException iOException) {
                throw new UncheckedIOException(iOException);
            }
        }, executor));
    }

    public void N(Path path) {
        try {
            Files.createDirectories(path, new FileAttribute[0]);
        }
        catch (IOException iOException) {
            y.error("Failed to create directory {}", (Object)path, (Object)iOException);
            this.N(path, null);
            return;
        }
        this.L.forEach((class018942, class089182) -> {
            if (class089182 instanceof class03609) {
                class03609 class036092 = (class03609)class089182;
                try {
                    class036092.method_49712(class018942, path);
                }
                catch (Exception exception) {
                    y.error("Failed to dump texture {}", class018942, (Object)exception);
                }
            }
        });
        this.N(path, null);
    }

    public class01894 fabric$getId() {
        if (this.R == null) {
            class08627 class086272 = this;
            this.R = class086272 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class086272 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class086272 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class086272 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class086272 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class086272 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class086272 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class086272 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class086272 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class086272 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class086272 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class086272 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class086272 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class086272 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class086272 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class086272 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class086272 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class086272 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + class086272.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.R;
    }

    public CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        class01089 class010892 = class010732.N();
        ArrayList arrayList = new ArrayList();
        this.L.forEach((class018942, class089182) -> {
            if (class089182 instanceof class08361) {
                class08361 class083612 = (class08361)class089182;
                arrayList.add(class08627.N(class010892, class018942, class083612, executor));
            }
        });
        return ((CompletableFuture)CompletableFuture.allOf((CompletableFuture[])arrayList.stream().map(class08639::y).toArray(CompletableFuture[]::new)).thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenAcceptAsync(void_ -> {
            class01891.N((class01089)this.i);
            for (class08639 class086392 : arrayList) {
                class086392.N().method_65857(class086392.y().join());
            }
            this.N(arrayList, (Void)void_, null);
        }, executor2);
    }
}

