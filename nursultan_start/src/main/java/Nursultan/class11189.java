/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09076
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.lwjgl.opengl.GL33
 */
package Nursultan;

import Nursultan.class09076;
import Nursultan.class11211;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.IntSupplier;
import org.lwjgl.opengl.GL33;

public class class11189
extends Record
implements class11211 {
    public int unit;
    public IntSupplier texture;

    class11189(int n, IntSupplier intSupplier) {
        Objects.requireNonNull(intSupplier, "texture");
        this.unit = n;
        this.texture = intSupplier;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11189.class, "unit;texture", "unit", "texture"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11189.class, "unit;texture", "unit", "texture"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11189.class, "unit;texture", "unit", "texture"}, this);
    }

    @Override
    public int y() {
        return this.unit;
    }

    public IntSupplier N() {
        return this.texture;
    }

    @Override
    public void N(class09076 class090762) {
        GlStateManager._activeTexture((int)this.unit);
        GlStateManager._bindTexture((int)this.texture.getAsInt());
        GL33.glBindSampler((int)(this.unit - 33984), (int)0);
    }
}

