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

public class class12014
extends Record
implements class12007 {
    public boolean enabled;
    public static Object y_0;
    public static Object y_1;

    private static void L() {
        y_0 = null;
        y_1 = null;
    }

    public class12014(boolean bl) {
        this.enabled = bl;
    }

    static {
        class12014.L();
        y_0 = new class12014(true);
        y_1 = new class12014(false);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class12014.class, "enabled", "enabled"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class12014.class, "enabled", "enabled"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class12014.class, "enabled", "enabled"}, this);
    }

    public boolean y() {
        return this.enabled;
    }

    @Override
    public void N() {
        GlStateManager._depthMask((boolean)this.enabled);
    }
}

