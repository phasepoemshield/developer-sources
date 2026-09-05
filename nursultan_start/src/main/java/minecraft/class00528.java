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
 *  minecraft.class08918
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
import minecraft.class08918;

public final class class00528
extends Record
implements class00542 {
    private final String samplerName;
    private final class08918 texture;
    private final int width;
    private final int height;
    private final boolean bilinear;

    public class08918 L() {
        return this.texture;
    }

    public class00528(String string, class08918 class089182, int n, int n2, boolean bl) {
        this.samplerName = string;
        this.texture = class089182;
        this.width = n;
        this.height = n2;
        this.bilinear = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00528.class, "samplerName;texture;width;height;bilinear", "samplerName", "texture", "width", "height", "bilinear"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00528.class, "samplerName;texture;width;height;bilinear", "samplerName", "texture", "width", "height", "bilinear"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00528.class, "samplerName;texture;width;height;bilinear", "samplerName", "texture", "width", "height", "bilinear"}, this);
    }

    public int i() {
        return this.height;
    }

    public int u() {
        return this.width;
    }

    @Override
    public boolean y() {
        return this.bilinear;
    }

    @Override
    public GpuTextureView y(Map<class01894, class02452<class08066>> map) {
        return this.texture.method_71659();
    }

    @Override
    public String N() {
        return this.samplerName;
    }

    @Override
    public void N(class02725 class027252, Map<class01894, class02452<class08066>> map) {
    }
}

