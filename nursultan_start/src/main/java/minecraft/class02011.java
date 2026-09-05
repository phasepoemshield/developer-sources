/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  me.flashyreese.mods.sodiumextra.common.util.AnimationStateExtended
 *  minecraft.class08188
 *  minecraft.class08388
 *  minecraft.class08394
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.render.texture.SpriteContentsExtension
 *  net.irisshaders.iris.mixin.texture.SpriteContentsTickerAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import me.flashyreese.mods.sodiumextra.common.util.AnimationStateExtended;
import minecraft.class01991;
import minecraft.class02007;
import minecraft.class02034;
import minecraft.class08188;
import minecraft.class08388;
import minecraft.class08394;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteContentsExtension;
import net.irisshaders.iris.mixin.texture.SpriteContentsTickerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02011
implements AutoCloseable,
AnimationStateExtended,
SpriteContentsTickerAccessor {
    private int N;
    private int y;
    private final class02034 L;
    private final Int2ObjectMap<GpuTextureView> u;
    private final GpuBufferSlice[] i;
    private boolean R = true;
    private class01991 M;
    private boolean B = false;
    private boolean Z = false;
    private class08388 z;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class02011(class01991 class019912, class02034 class020342, Int2ObjectMap int2ObjectMap, GpuBufferSlice[] gpuBufferSliceArray) {
        this.L = class020342;
        this.u = int2ObjectMap;
        this.i = gpuBufferSliceArray;
        this.N(class019912, class020342, int2ObjectMap, gpuBufferSliceArray, null);
    }

    @Override
    public void close() {
        for (GpuTextureView gpuTextureView : this.u.values()) {
            gpuTextureView.texture().close();
            gpuTextureView.close();
        }
    }

    public boolean y() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.L.y || this.R;
    }

    private void N(CallbackInfo callbackInfo) {
        SpriteContentsExtension spriteContentsExtension = this.M;
        this.Z = spriteContentsExtension.sodium$isActive();
        spriteContentsExtension.sodium$setActive(false);
    }

    public void N(class01991 class019912, class02034 class020342, Int2ObjectMap int2ObjectMap, GpuBufferSlice[] gpuBufferSliceArray, CallbackInfo callbackInfo) {
        this.M = class019912;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        boolean bl = SodiumClientMod.options().performance.animateOnlyVisibleTextures;
        if (!this.B) {
            if (this.N == this.L.N.size() - 1) {
                this.B = true;
            } else {
                return;
            }
        }
        if (bl && !this.Z) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    public void N() {
        this.N((CallbackInfo)null);
        ++this.y;
        this.R = false;
        class02007 class020072 = this.L.N.get(this.N);
        if (this.y >= class020072.y()) {
            int n = class020072.getIndex();
            this.N = (this.N + 1) % this.L.N.size();
            this.y = 0;
            int n2 = this.L.N.get(this.N).getIndex();
            if (n != n2) {
                this.R = true;
            }
        }
    }

    public GpuBufferSlice N(int n) {
        return this.i[n];
    }

    public void N(RenderPass renderPass, GpuBufferSlice gpuBufferSlice) {
        class08188 class081882 = RenderSystem.getSamplerCache().N(FilterMode.NEAREST, true);
        List<class02007> var4 = this.L.N;
        int n = var4.get(this.N).getIndex();
        int n2 = (int)((float)this.y / (float)this.L.N.get(this.N).y() * 1000.0f);
        if (this.L.y) {
            int n3 = var4.get((this.N + 1) % var4.size()).getIndex();
            renderPass.setPipeline(class08394.yM);
            renderPass.bindTexture("CurrentSprite", (GpuTextureView)this.u.get(n), class081882);
            renderPass.bindTexture("NextSprite", (GpuTextureView)this.u.get(n3), class081882);
        } else if (this.R) {
            renderPass.setPipeline(class08394.yR);
            renderPass.bindTexture("Sprite", (GpuTextureView)this.u.get(n), class081882);
        }
        renderPass.setUniform("SpriteAnimationInfo", gpuBufferSlice);
        renderPass.draw(n2 << 3, 6);
    }

    public /* synthetic */ int getFrame() {
        return this.N;
    }

    public /* synthetic */ void setFrame(int n) {
        this.N = n;
    }

    public class08388 sodium_extra$getSprite() {
        return this.z;
    }

    public void sodium_extra$setSprite(class08388 class083882) {
        this.z = class083882;
    }

    public /* synthetic */ void setSubFrame(int n) {
        this.y = n;
    }

    public /* synthetic */ int getSubFrame() {
        return this.y;
    }

    public /* synthetic */ class02034 getAnimationInfo() {
        return this.L;
    }
}

