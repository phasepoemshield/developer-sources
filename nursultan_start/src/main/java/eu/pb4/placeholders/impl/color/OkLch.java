/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package eu.pb4.placeholders.impl.color;

import eu.pb4.placeholders.impl.color.OkLab;
import minecraft.class04995;

public record OkLch(float l, float c, float h) {
    public float b() {
        return this.c * class04995.method_15374((float)this.h);
    }

    public float a() {
        return this.c * class04995.method_15362((float)this.h);
    }

    public static OkLch fromRgb(int n) {
        OkLab okLab = OkLab.fromRgb(n);
        float f = class04995.N((float)(okLab.a() * okLab.a() + okLab.b() + okLab.b()));
        float f2 = (float)class04995.u((double)okLab.b(), (double)okLab.a());
        return new OkLch(okLab.l(), f, f2);
    }

    public int toRgb() {
        return OkLab.toRgb(this.l, this.a(), this.b());
    }

    public static int toRgb(float f, float f2, float f3) {
        return OkLab.toRgb(f, (float)((double)f2 * Math.cos(f3)), (float)((double)f2 * Math.sin(f3)));
    }
}

