/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class08188
 *  minecraft.class08361
 *  minecraft.class08626
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixinterface.AbstractTextureExtended
 *  net.irisshaders.iris.pbr.TextureTracker
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import minecraft.class08188;
import minecraft.class08361;
import minecraft.class08626;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixinterface.AbstractTextureExtended;
import net.irisshaders.iris.pbr.TextureTracker;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class08918
implements AutoCloseable,
AbstractTextureExtended {
    protected @Nullable GpuTexture field_56974;
    protected @Nullable GpuTextureView field_60597;
    protected class08188 field_63613 = RenderSystem.getSamplerCache().N(AddressMode.REPEAT, AddressMode.REPEAT, FilterMode.NEAREST, FilterMode.LINEAR, false);
    private GpuTexture lastChecked;

    @Override
    public void close() {
        if (this.field_56974 != null) {
            this.field_56974.close();
            this.field_56974 = null;
        }
        if (this.field_60597 != null) {
            this.field_60597.close();
            this.field_60597 = null;
        }
    }

    public GpuTextureView method_71659() {
        if (this.field_60597 == null) {
            throw new IllegalStateException("Texture view does not exist, can't get it before something initializes it");
        }
        return this.field_60597;
    }

    public class08188 method_75484() {
        return this.field_63613;
    }

    public GpuTexture method_68004() {
        if (this.field_56974 == null) {
            throw new IllegalStateException("Texture does not exist, can't get it before something initializes it");
        }
        GpuTexture gpuTexture = this.field_56974;
        this.handler$bhc000$iris$afterGenerateId(new CallbackInfoReturnable("", false, (Object)gpuTexture));
        return gpuTexture;
    }

    private void iris$setFilter(boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        this.onSet(bl, bl2);
    }

    private void onSet(boolean bl, boolean bl2) {
        if (!bl) {
            class08918 class089182 = this;
            if (class089182 instanceof class08361) {
                class08361 class083612 = (class08361)class089182;
                Iris.logger.warn(String.valueOf(class083612.method_65859()) + " was set to nearest");
            } else {
                class089182 = this;
                if (class089182 instanceof class08626) {
                    class08626 class086262 = (class08626)class089182;
                    Iris.logger.warn(String.valueOf(class086262.i()) + " was set to nearest");
                }
            }
        } else {
            class08918 class089183 = this;
            if (class089183 instanceof class08361) {
                class08361 class083613 = (class08361)class089183;
                Iris.logger.warn(String.valueOf(class083613.method_65859()) + " was set to linear");
            } else {
                class089183 = this;
                if (class089183 instanceof class08626) {
                    class08626 class086263 = (class08626)class089183;
                    Iris.logger.warn(String.valueOf(class086263.i()) + " was set to linear");
                }
            }
        }
    }

    private void handler$bhc000$iris$afterGenerateId(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.lastChecked != callbackInfoReturnable.getReturnValue()) {
            this.lastChecked = (GpuTexture)callbackInfoReturnable.getReturnValue();
            TextureTracker.INSTANCE.trackTexture(this.lastChecked.iris$getGlId(), this);
        }
    }
}

