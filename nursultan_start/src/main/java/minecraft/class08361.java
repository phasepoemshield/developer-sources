/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class08280
 *  minecraft.class08918
 *  net.irisshaders.iris.mixin.texture.ReloadableTextureAccessor
 *  net.irisshaders.iris.pbr.TextureTracker
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class08280;
import minecraft.class08354;
import minecraft.class08918;
import net.irisshaders.iris.mixin.texture.ReloadableTextureAccessor;
import net.irisshaders.iris.pbr.TextureTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class08361
extends class08918
implements ReloadableTextureAccessor {
    private final class01894 field_55529;

    public class08361(class01894 class018942) {
        this.field_55529 = class018942;
    }

    public /* synthetic */ class01894 getLocation() {
        return this.field_55529;
    }

    public class01894 method_65859() {
        return this.field_55529;
    }

    private void handler$bhi000$iris$onDoLoad(class08280 class082802, CallbackInfo callbackInfo) {
        TextureTracker.INSTANCE.trackTexture(this.field_56974.iris$getGlId(), (class08918)this);
    }

    public abstract class08354 method_65809(class01089 var1) throws IOException;

    protected void method_65856(class08280 class082802) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.close();
        this.field_56974 = gpuDevice.createTexture(() -> ((class01894)this.field_55529).toString(), 5, TextureFormat.RGBA8, class082802.N(), class082802.y(), 1, 1);
        this.field_60597 = gpuDevice.createTextureView(this.field_56974);
        gpuDevice.createCommandEncoder().writeToTexture(this.field_56974, class082802);
        this.handler$bhi000$iris$onDoLoad(class082802, null);
    }

    public void method_65857(class08354 class083542) {
        boolean bl = class083542.L();
        boolean bl2 = class083542.y();
        AddressMode addressMode = bl ? AddressMode.CLAMP_TO_EDGE : AddressMode.REPEAT;
        FilterMode filterMode = bl2 ? FilterMode.LINEAR : FilterMode.NEAREST;
        this.field_63613 = RenderSystem.getSamplerCache().N(addressMode, addressMode, filterMode, filterMode, false);
        try (class08280 class082802 = class083542.u();){
            this.method_65856(class082802);
        }
    }
}

