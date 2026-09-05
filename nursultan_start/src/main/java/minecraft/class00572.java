/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02452
 *  minecraft.class02725
 *  minecraft.class08066
 */
package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00542;
import minecraft.class01894;
import minecraft.class02452;
import minecraft.class02725;
import minecraft.class08066;

public final class class00572
extends Record
implements class00542 {
    private final String samplerName;
    private final class01894 targetId;
    private final boolean depthBuffer;
    private final boolean bilinear;

    public class01894 L() {
        return this.targetId;
    }

    private class02452<class08066> L(Map<class01894, class02452<class08066>> map) {
        class02452<class08066> class024522 = map.get(this.targetId);
        if (class024522 == null) {
            throw new IllegalStateException("Missing handle for target " + String.valueOf(this.targetId));
        }
        return class024522;
    }

    public class00572(String string, class01894 class018942, boolean bl, boolean bl2) {
        this.samplerName = string;
        this.targetId = class018942;
        this.depthBuffer = bl;
        this.bilinear = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00572.class, "samplerName;targetId;depthBuffer;bilinear", "samplerName", "targetId", "depthBuffer", "bilinear"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00572.class, "samplerName;targetId;depthBuffer;bilinear", "samplerName", "targetId", "depthBuffer", "bilinear"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00572.class, "samplerName;targetId;depthBuffer;bilinear", "samplerName", "targetId", "depthBuffer", "bilinear"}, this);
    }

    public boolean u() {
        return this.depthBuffer;
    }

    @Override
    public boolean y() {
        return this.bilinear;
    }

    @Override
    public GpuTextureView y(Map<class01894, class02452<class08066>> map) {
        GpuTextureView gpuTextureView;
        class08066 class080662 = (class08066)this.L(map).get();
        GpuTextureView gpuTextureView2 = gpuTextureView = this.depthBuffer ? class080662.R() : class080662.u();
        if (gpuTextureView == null) {
            throw new IllegalStateException("Missing " + (this.depthBuffer ? "depth" : "color") + "texture for target " + String.valueOf(this.targetId));
        }
        return gpuTextureView;
    }

    @Override
    public String N() {
        return this.samplerName;
    }

    @Override
    public void N(class02725 class027252, Map<class01894, class02452<class08066>> map) {
        class027252.N(this.L(map));
    }
}

