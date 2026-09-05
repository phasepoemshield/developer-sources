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

public class class11996
extends Record
implements class12007 {
    public boolean enabled;
    public static Object N_0;
    public static Object N_1;

    public class11996(boolean bl) {
        this.enabled = bl;
    }

    static {
        class11996.u();
        N_0 = new class11996(true);
        N_1 = new class11996(false);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11996.class, "enabled", "enabled"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11996.class, "enabled", "enabled"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11996.class, "enabled", "enabled"}, this);
    }

    private static void u() {
        N_0 = null;
        N_1 = null;
    }

    public boolean y() {
        return this.enabled;
    }

    @Override
    public void N() {
        if (this.enabled) {
            GlStateManager._enableCull();
        } else {
            GlStateManager._disableCull();
        }
    }
}

