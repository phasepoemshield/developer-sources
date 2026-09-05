/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10203
 *  com.mojang.blaze3d.systems.RenderSystem
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02418
 *  minecraft.class08066
 */
package minecraft;

import Nursultan.class10203;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02418;
import minecraft.class08066;

public final class class02456
extends Record
implements class02418<class08066> {
    private final int width;
    private final int height;
    private final boolean useDepth;
    private final int clearColor;

    public int L() {
        return this.height;
    }

    public class02456(int n, int n2, boolean bl, int n3) {
        this.width = n;
        this.height = n2;
        this.useDepth = bl;
        this.clearColor = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02456.class, "width;height;useDepth;clearColor", "width", "height", "useDepth", "clearColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02456.class, "width;height;useDepth;clearColor", "width", "height", "useDepth", "clearColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02456.class, "width;height;useDepth;clearColor", "width", "height", "useDepth", "clearColor"}, this);
    }

    public int i() {
        return this.clearColor;
    }

    public boolean u() {
        return this.useDepth;
    }

    public int y() {
        return this.width;
    }

    public void y(class08066 class080662) {
        class080662.N();
    }

    public boolean N(class02418<?> class024182) {
        if (class024182 instanceof class02456) {
            class02456 class024562 = (class02456)class024182;
            return this.width == class024562.width && this.height == class024562.height && this.useDepth == class024562.useDepth;
        }
        return false;
    }

    public void N(class08066 class080662) {
        if (this.useDepth) {
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(class080662.L(), this.clearColor, class080662.i(), 1.0);
        } else {
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture(class080662.L(), this.clearColor);
        }
    }

    public class08066 R() {
        return new class10203(null, this.width, this.height, this.useDepth);
    }
}

