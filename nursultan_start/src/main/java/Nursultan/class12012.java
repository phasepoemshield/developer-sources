/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class12007;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class12012
extends Record
implements class12007 {
    public int dstRGB;
    public int dstA;
    public int srcA;
    public int srcRGB;
    public boolean enabled;
    public static Object R_0;
    public static Object R_1;
    public static Object R_2;
    public static Object R_3;

    public int L() {
        return this.dstA;
    }

    private static void M() {
        R_0 = null;
        R_1 = null;
        R_2 = null;
        R_3 = null;
    }

    public class12012(boolean bl, int n, int n2, int n3, int n4) {
        this.enabled = bl;
        this.srcRGB = n;
        this.dstRGB = n2;
        this.srcA = n3;
        this.dstA = n4;
    }

    static {
        class12012.M();
        R_0 = new class12012(true, 770, 771, 1, 0);
        R_1 = new class12012(true, 770, 1, 770, 1);
        R_2 = new class12012(true, 1, 771, 1, 771);
        R_3 = new class12012(false, 0, 0, 0, 0);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class12012.class, "enabled;srcRGB;dstRGB;srcA;dstA", "enabled", "srcRGB", "dstRGB", "srcA", "dstA"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class12012.class, "enabled;srcRGB;dstRGB;srcA;dstA", "enabled", "srcRGB", "dstRGB", "srcA", "dstA"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class12012.class, "enabled;srcRGB;dstRGB;srcA;dstA", "enabled", "srcRGB", "dstRGB", "srcA", "dstA"}, this);
    }

    public int i() {
        return this.srcA;
    }

    public int u() {
        return this.dstRGB;
    }

    public boolean y() {
        return this.enabled;
    }

    @Override
    public void N() {
        if (this.enabled) {
            GlStateManager._enableBlend();
            GlStateManager._blendFuncSeparate((int)this.srcRGB, (int)this.dstRGB, (int)this.srcA, (int)this.dstA);
        } else {
            GlStateManager._disableBlend();
        }
    }

    public int R() {
        return this.srcRGB;
    }
}

