/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 */
package net.caffeinemc.mods.sodium.client.model.quad;

import minecraft.class07211;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.util.NormI8;

public interface ModelQuadView {
    public int getFlags();

    public int getLight(int var1);

    public float getY(int var1);

    public float getX(int var1);

    public float getZ(int var1);

    public int getColor(int var1);

    public float getTexU(int var1);

    public float getTexV(int var1);

    default public boolean hasColor() {
        return this.getTintIndex() != -1;
    }

    public class08388 getSprite();

    public int getVertexNormal(int var1);

    public int getMaxLightQuad(int var1);

    public int getFaceNormal();

    public class07211 getLightFace();

    default public int getAccurateNormal(int n) {
        int n2 = this.getVertexNormal(n);
        return n2 == 0 ? this.getFaceNormal() : n2;
    }

    public int getTintIndex();

    default public int calculateNormal() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = this.getX(0);
        float f8 = this.getY(0);
        float f9 = this.getZ(0);
        float f10 = this.getX(1);
        float f11 = this.getY(1);
        float f12 = this.getZ(1);
        float f13 = this.getX(2);
        float f14 = this.getY(2);
        float f15 = this.getZ(2);
        float f16 = this.getX(3);
        float f17 = this.getY(3);
        float f18 = f14 - f8;
        float f19 = this.getZ(3);
        float f20 = f19 - f12;
        float f21 = f18 * f20 - (f6 = f15 - f9) * (f5 = f17 - f11);
        float f22 = (float)Math.sqrt(f21 * f21 + (f4 = f6 * (f3 = f16 - f10) - (f2 = f13 - f7) * f20) * f4 + (f = f2 * f5 - f18 * f3) * f);
        if ((double)f22 != 0.0 && (double)f22 != 1.0) {
            f21 /= f22;
            f4 /= f22;
            f /= f22;
        }
        return NormI8.pack((float)f21, (float)f4, (float)f);
    }
}

