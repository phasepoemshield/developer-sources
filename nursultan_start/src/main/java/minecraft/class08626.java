/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.platform.TextureUtil
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.logging.LogUtils
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  me.flashyreese.mods.sodiumextra.common.util.AnimationStateExtended
 *  minecraft.class01894
 *  minecraft.class01991
 *  minecraft.class02008
 *  minecraft.class02011
 *  minecraft.class03609
 *  minecraft.class04995
 *  minecraft.class07529
 *  minecraft.class08188
 *  minecraft.class08388
 *  minecraft.class08394
 *  minecraft.class08918
 *  minecraft.class08923
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas
 *  net.caffeinemc.mods.sodium.client.render.texture.ExtendedTextureAtlas
 *  net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinder
 *  net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinderImpl
 *  net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache
 *  net.caffeinemc.mods.sodium.mixin.core.render.texture.TextureAtlasAccessor
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder
 *  net.fabricmc.fabric.api.renderer.v1.sprite.FabricSpriteAtlasTexture
 *  net.fabricmc.fabric.impl.renderer.SpriteFinderImpl
 *  net.fabricmc.fabric.impl.renderer.StitchResultExtension
 *  net.irisshaders.iris.mixin.texture.TextureAtlasAccessor
 *  net.irisshaders.iris.pbr.TextureTracker
 *  net.irisshaders.iris.pbr.texture.PBRAtlasHolder
 *  net.irisshaders.iris.pbr.texture.TextureAtlasExtension
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.function.Supplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.common.util.AnimationStateExtended;
import minecraft.class01894;
import minecraft.class01991;
import minecraft.class02008;
import minecraft.class02011;
import minecraft.class03609;
import minecraft.class04995;
import minecraft.class07529;
import minecraft.class08188;
import minecraft.class08388;
import minecraft.class08394;
import minecraft.class08629;
import minecraft.class08918;
import minecraft.class08923;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;
import net.caffeinemc.mods.sodium.client.render.texture.ExtendedTextureAtlas;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinder;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinderImpl;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache;
import net.caffeinemc.mods.sodium.mixin.core.render.texture.TextureAtlasAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.api.renderer.v1.sprite.FabricSpriteAtlasTexture;
import net.fabricmc.fabric.impl.renderer.SpriteFinderImpl;
import net.fabricmc.fabric.impl.renderer.StitchResultExtension;
import net.irisshaders.iris.pbr.TextureTracker;
import net.irisshaders.iris.pbr.texture.PBRAtlasHolder;
import net.irisshaders.iris.pbr.texture.TextureAtlasExtension;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class08626
extends class08918
implements class03609,
class08629,
ExtendedTextureAtlas,
TextureAtlasAccessor,
FabricSpriteAtlasTexture,
net.irisshaders.iris.mixin.texture.TextureAtlasAccessor,
TextureAtlasExtension {
    private static final Logger u = LogUtils.getLogger();
    @Deprecated
    public static final class01894 N = class01894.y((String)"textures/atlas/blocks.png");
    @Deprecated
    public static final class01894 y = class01894.y((String)"textures/atlas/items.png");
    @Deprecated
    public static final class01894 L = class01894.y((String)"textures/atlas/particles.png");
    private List<class08388> i;
    private List<class02011> R;
    private Map<class01894, class08388> M;
    private @Nullable class08388 B;
    private final class01894 Z;
    private final int z;
    private int U;
    private int E;
    private int W;
    private int m;
    private GpuTextureView[] P;
    private @Nullable GpuBuffer s;
    private volatile @Nullable SpriteFinder T;
    private PBRAtlasHolder b;
    private boolean j = false;
    private final Map v = Map.of(() -> SodiumExtraClientMod.options().animationSettings.water, List.of(class01894.N((String)"minecraft", (String)"block/water_still"), class01894.N((String)"minecraft", (String)"block/water_flow")), () -> SodiumExtraClientMod.options().animationSettings.lava, List.of(class01894.N((String)"minecraft", (String)"block/lava_still"), class01894.N((String)"minecraft", (String)"block/lava_flow")), () -> SodiumExtraClientMod.options().animationSettings.portal, List.of(class01894.N((String)"minecraft", (String)"block/nether_portal")), () -> SodiumExtraClientMod.options().animationSettings.fire, List.of(class01894.N((String)"minecraft", (String)"block/fire_0"), class01894.N((String)"minecraft", (String)"block/fire_1"), class01894.N((String)"minecraft", (String)"block/soul_fire_0"), class01894.N((String)"minecraft", (String)"block/soul_fire_1"), class01894.N((String)"minecraft", (String)"block/campfire_fire"), class01894.N((String)"minecraft", (String)"block/campfire_log_lit"), class01894.N((String)"minecraft", (String)"block/soul_campfire_fire"), class01894.N((String)"minecraft", (String)"block/soul_campfire_log_lit")), () -> SodiumExtraClientMod.options().animationSettings.blockAnimations, List.of(class01894.N((String)"minecraft", (String)"block/magma"), class01894.N((String)"minecraft", (String)"block/lantern"), class01894.N((String)"minecraft", (String)"block/sea_lantern"), class01894.N((String)"minecraft", (String)"block/soul_lantern"), class01894.N((String)"minecraft", (String)"block/kelp"), class01894.N((String)"minecraft", (String)"block/kelp_plant"), class01894.N((String)"minecraft", (String)"block/seagrass"), class01894.N((String)"minecraft", (String)"block/tall_seagrass_top"), class01894.N((String)"minecraft", (String)"block/tall_seagrass_bottom"), class01894.N((String)"minecraft", (String)"block/warped_stem"), class01894.N((String)"minecraft", (String)"block/crimson_stem"), class01894.N((String)"minecraft", (String)"block/blast_furnace_front_on"), class01894.N((String)"minecraft", (String)"block/smoker_front_on"), class01894.N((String)"minecraft", (String)"block/stonecutter_saw"), class01894.N((String)"minecraft", (String)"block/prismarine"), class01894.N((String)"minecraft", (String)"block/respawn_anchor_top"), class01894.N((String)"minecraft", (String)"entity/conduit/wind"), class01894.N((String)"minecraft", (String)"entity/conduit/wind_vertical")), () -> SodiumExtraClientMod.options().animationSettings.sculkSensor, List.of(class01894.N((String)"minecraft", (String)"block/sculk"), class01894.N((String)"minecraft", (String)"block/sculk_catalyst_top_bloom"), class01894.N((String)"minecraft", (String)"block/sculk_catalyst_side_bloom"), class01894.N((String)"minecraft", (String)"block/sculk_shrieker_inner_top"), class01894.N((String)"minecraft", (String)"block/sculk_vein"), class01894.N((String)"minecraft", (String)"block/sculk_shrieker_can_summon_inner_top"), class01894.N((String)"minecraft", (String)"block/sculk_sensor_tendril_inactive"), class01894.N((String)"minecraft", (String)"block/sculk_sensor_tendril_active"), class01894.N((String)"minecraft", (String)"vibration")));

    public class08388 L() {
        return Objects.requireNonNull(this.B, "Atlas not initialized");
    }

    int M() {
        return this.U;
    }

    public class08626(class01894 class018942) {
        this.i = List.of();
        this.R = List.of();
        this.M = Map.of();
        this.P = new GpuTextureView[0];
        this.Z = class018942;
        this.z = RenderSystem.getDevice().getMaxTextureSize();
    }

    int B() {
        return this.E;
    }

    private void Z() {
        GpuTexture gpuTexture;
        GpuDevice gpuDevice = RenderSystem.getDevice();
        int n = class04995.i((int)class01991.field_64235, (int)RenderSystem.getDevice().getUniformOffsetAlignment());
        int n2 = n * this.m;
        class08188 class081882 = RenderSystem.getSamplerCache().N(FilterMode.NEAREST, true);
        List var5 = this.i.stream().filter(class083882 -> !class083882.method_76321()).toList();
        ArrayList<GpuTextureView[]> arrayList = new ArrayList<GpuTextureView[]>();
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(var5.size() * n2));
        for (int i = 0; i < var5.size(); ++i) {
            class08388 class083883 = (class08388)var5.get(i);
            class083883.method_76320(byteBuffer, i * n2, this.W, this.U, this.E, n);
            gpuTexture = gpuDevice.createTexture(() -> class083883.method_45851().method_45816().toString(), 5, TextureFormat.RGBA8, class083883.method_45851().method_45807(), class083883.method_45851().method_45815(), 1, this.m);
            GpuTextureView[] gpuTextureViewArray = new GpuTextureView[this.m];
            for (int j = 0; j <= this.W; ++j) {
                class083883.method_4584(gpuTexture, j);
                gpuTextureViewArray[j] = gpuDevice.createTextureView(gpuTexture);
            }
            arrayList.add(gpuTextureViewArray);
        }
        try (Object object = gpuDevice.createBuffer(() -> "SpriteAnimationInfo", 128, byteBuffer);){
            for (int i = 0; i < this.m; ++i) {
                gpuTexture = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Animate " + String.valueOf(this.Z), this.P[i], OptionalInt.empty());
                try {
                    gpuTexture.setPipeline(class08394.yR);
                    for (int j = 0; j < var5.size(); ++j) {
                        gpuTexture.bindTexture("Sprite", ((GpuTextureView[])arrayList.get(j))[i], class081882);
                        gpuTexture.setUniform("SpriteAnimationInfo", object.slice((long)(j * n2 + i * n), (long)class01991.field_64235));
                        gpuTexture.draw(0, 6);
                    }
                    continue;
                }
                finally {
                    if (gpuTexture != null) {
                        gpuTexture.close();
                    }
                }
            }
        }
        object = arrayList.iterator();
        while (object.hasNext()) {
            GpuTexture gpuTexture2;
            for (GpuTexture gpuTexture3 : gpuTexture2 = (GpuTexture)object.next()) {
                gpuTexture3.close();
                gpuTexture3.texture().close();
            }
        }
        MemoryUtil.memFree((Buffer)byteBuffer);
        this.z();
    }

    public class01894 i() {
        return this.Z;
    }

    public void close() {
        super.close();
        GpuTextureView[] gpuTextureViewArray = this.P;
        int n = gpuTextureViewArray.length;
        for (int i = 0; i < n; ++i) {
            gpuTextureViewArray[i].close();
        }
        for (class02011 class020112 : this.R) {
            class020112.close();
        }
        if (this.s != null) {
            this.s.close();
            this.s = null;
        }
    }

    private void z() {
        if (this.R.stream().anyMatch(class02011::y)) {
            for (int i = 0; i <= this.W; ++i) {
                try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Animate " + String.valueOf(this.Z), this.P[i], OptionalInt.empty());){
                    for (class02011 class020112 : this.R) {
                        if (!class020112.y()) continue;
                        class020112.N(renderPass, class020112.N(i));
                    }
                    continue;
                }
            }
        }
    }

    public void u() {
        this.i.forEach(class08388::close);
        this.i = List.of();
        this.R = List.of();
        this.M = Map.of();
        this.B = null;
    }

    private void y(CallbackInfo callbackInfo) {
        TextureTracker.INSTANCE.trackTexture(this.field_56974.iris$getGlId(), (class08918)this);
    }

    @Override
    public void y() {
        this.N();
    }

    private void y(class02008 class020082, CallbackInfo callbackInfo) {
        if (this.Z.equals((Object)N)) {
            SpriteFinderCache.resetSpriteFinder();
            this.j = true;
        } else if (this.Z.equals((Object)y)) {
            SpriteFinderCache.resetItemSpriteFinder();
            this.j = false;
        }
    }

    private boolean y(class01894 class018942) {
        if (class018942 != null) {
            for (Map.Entry entry : this.v.entrySet()) {
                if (!((List)entry.getValue()).contains(class018942)) continue;
                return (Boolean)((Supplier)entry.getKey()).get();
            }
        }
        return true;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        class08388 class083882 = (class08388)callbackInfoReturnable.getReturnValue();
        if (class083882 != null) {
            SpriteUtil.INSTANCE.markSpriteActive(class083882);
        }
    }

    private void N(int n, int n2, int n3) {
        u.info("Created: {}x{}x{} {}-atlas", new Object[]{n, n2, n3, this.Z});
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.close();
        this.field_56974 = gpuDevice.createTexture(() -> ((class01894)this.Z).toString(), 15, TextureFormat.RGBA8, n, n2, 1, n3 + 1);
        this.field_60597 = gpuDevice.createTextureView(this.field_56974);
        this.U = n;
        this.E = n2;
        this.W = n3;
        this.m = n3 + 1;
        this.P = new GpuTextureView[this.m];
        for (int i = 0; i <= this.W; ++i) {
            this.P[i] = gpuDevice.createTextureView(this.field_56974, i, 1);
        }
    }

    public void N(class02011 class020112) {
        if (class020112 instanceof AnimationStateExtended) {
            AnimationStateExtended animationStateExtended = (AnimationStateExtended)class020112;
            if (SodiumExtraClientMod.options().animationSettings.animation && this.y(animationStateExtended.sodium_extra$getSprite().method_45851().method_45816())) {
                class020112.N();
            }
        }
    }

    public void N(class02008 class020082) {
        this.N(class020082.N(), class020082.y(), class020082.L());
        this.u();
        this.field_63613 = RenderSystem.getSamplerCache().N(FilterMode.NEAREST);
        this.M = Map.copyOf(class020082.i());
        this.B = this.M.get(class08923.L());
        if (this.B == null) {
            throw new IllegalStateException("Atlas '" + String.valueOf(this.Z) + "' (" + this.M.size() + " sprites) has no missing texture sprite");
        }
        ArrayList<class08388> arrayList = new ArrayList<class08388>();
        ArrayList<class02011> arrayList2 = new ArrayList<class02011>();
        int n = (int)class020082.i().values().stream().filter(class08388::method_76321).count();
        int n2 = class04995.i((int)class01991.field_64235, (int)RenderSystem.getDevice().getUniformOffsetAlignment());
        int n3 = n2 * this.m;
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(n * n3));
        int n4 = 0;
        for (Object object : class020082.i().values()) {
            if (!object.method_76321()) continue;
            object.method_76320(byteBuffer, n4 * n3, this.W, this.U, this.E, n2);
            ++n4;
        }
        GpuBuffer gpuBuffer = n4 > 0 ? RenderSystem.getDevice().createBuffer(() -> String.valueOf(this.Z) + " sprite UBOs", 128, byteBuffer) : null;
        n4 = 0;
        for (class08388 class083882 : class020082.i().values()) {
            arrayList.add(class083882);
            if (!class083882.method_76321() || gpuBuffer == null) continue;
            int n5 = n2;
            GpuBufferSlice gpuBufferSlice = gpuBuffer.slice((long)(n4 * n3), (long)n3);
            class08388 class083883 = class083882;
            class02011 class020112 = this.N(class083883, gpuBufferSlice, n5);
            ++n4;
            if (class020112 == null) continue;
            arrayList2.add(class020112);
        }
        this.s = gpuBuffer;
        this.i = arrayList;
        this.R = List.copyOf(arrayList2);
        this.Z();
        if (class07529.o) {
            Object object;
            object = TextureUtil.getDebugTexturePath();
            try {
                Files.createDirectories((Path)object, new FileAttribute[0]);
                this.method_49712(this.Z, (Path)object);
            }
            catch (Exception exception) {
                u.warn("Failed to dump atlas contents to {}", object);
            }
        }
        this.N(class020082, null);
        this.y((CallbackInfo)null);
        this.y(class020082, null);
    }

    public class02011 N(class08388 class083882, GpuBufferSlice gpuBufferSlice, int n) {
        class02011 class020112 = class083882.method_76319(gpuBufferSlice, n);
        ((AnimationStateExtended)class020112).sodium_extra$setSprite(class083882);
        return class020112;
    }

    private void N(class02008 class020082, CallbackInfo callbackInfo) {
        this.T = ((StitchResultExtension)class020082).fabric_spriteFinderNullable();
    }

    public void N() {
        if (this.field_56974 == null) {
            return;
        }
        for (class02011 class020112 : this.R) {
            this.N(class020112);
        }
        this.z();
        this.N((CallbackInfo)null);
    }

    private static void N(Path path, String string, Map<class01894, class08388> map) {
        Path path2 = path.resolve(string + ".txt");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path2, new OpenOption[0]);){
            for (Map.Entry entry : map.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList()) {
                class08388 class083882 = (class08388)entry.getValue();
                bufferedWriter.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", entry.getKey(), class083882.method_35806(), class083882.method_35807(), class083882.method_45851().method_45807(), class083882.method_45851().method_45815()));
            }
        }
        catch (IOException iOException) {
            u.warn("Failed to write file {}", (Object)path2, (Object)iOException);
        }
    }

    public class08388 N(class01894 class018942) {
        class08388 class083882 = this.M.getOrDefault(class018942, this.B);
        if (class083882 == null) {
            throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
        }
        class08388 class083883 = class083882;
        this.N(new CallbackInfoReturnable("", false, (Object)class083883));
        return class083883;
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.b != null) {
            this.b.cycleAnimationFrames();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SpriteFinder spriteFinder() {
        SpriteFinder spriteFinder = this.T;
        if (spriteFinder == null) {
            class08626 class086262 = this;
            synchronized (class086262) {
                spriteFinder = this.T;
                if (spriteFinder == null) {
                    if (this.B == null) {
                        throw new IllegalStateException("Tried to create sprite finder, but atlas is not initialized");
                    }
                    this.T = spriteFinder = new SpriteFinderImpl(this.M, this.B);
                }
            }
        }
        return spriteFinder;
    }

    public void method_49712(class01894 class018942, Path path) throws IOException {
        String string = class018942.L();
        TextureUtil.writeAsPNG((Path)path, (String)string, (GpuTexture)this.method_68004(), (int)this.W, n -> n);
        class08626.N(path, string, this.M);
    }

    public /* synthetic */ int sodium$getWidth() {
        return this.M();
    }

    public PBRAtlasHolder getPBRHolder() {
        return this.b;
    }

    public /* synthetic */ int callGetHeight() {
        return this.B();
    }

    public /* synthetic */ Map getTexturesByName() {
        return this.M;
    }

    public /* synthetic */ int sodium$getHeight() {
        return this.B();
    }

    public /* synthetic */ int callGetWidth() {
        return this.M();
    }

    public /* synthetic */ int getMaxLevel() {
        return this.W;
    }

    public int R() {
        return this.z;
    }

    public PBRAtlasHolder getOrCreatePBRHolder() {
        if (this.b == null) {
            this.b = new PBRAtlasHolder();
        }
        return this.b;
    }

    public SodiumSpriteFinder sodium$getSpriteFinder() {
        return new SodiumSpriteFinderImpl(this.M, this.B, this.j ? SodiumQuadAtlas.BLOCK : SodiumQuadAtlas.ITEM);
    }
}

