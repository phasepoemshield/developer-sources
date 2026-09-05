/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class07586
 *  minecraft.class07588
 *  minecraft.class07602
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class07586;
import minecraft.class07588;
import minecraft.class07602;

public final class class07571
implements class07586 {
    public static final Codec<class07571> q = RecordCodecBuilder.create(instance -> instance.group((App)class07602.i.fieldOf("cubic_bezier").forGetter(class075712 -> class075712.V)).apply(instance, class07571::new));
    private static final int K = 4;
    private final class07602 V;
    private final class07588 e;
    private final class07588 H;

    public class07571(class07602 class076022) {
        this.V = class076022;
        this.e = class07571.y(class076022.N(), class076022.L());
        this.H = class07571.y(class076022.y(), class076022.u());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof class07571)) return false;
        class07571 class075712 = (class07571)object;
        if (!this.V.equals((Object)class075712.V)) return false;
        return true;
    }

    public String toString() {
        return "CubicBezier(" + this.V.N() + ", " + this.V.y() + ", " + this.V.L() + ", " + this.V.u() + ")";
    }

    public int hashCode() {
        return this.V.hashCode();
    }

    public float apply(float f) {
        float f2;
        float f3 = f;
        for (int i = 0; i < 4 && !((f2 = this.e.y(f3)) < 1.0E-5f); ++i) {
            float f4 = this.e.N(f3) - f;
            f3 -= f4 / f2;
        }
        return this.H.N(f3);
    }

    private static class07588 y(float f, float f2) {
        return new class07588(3.0f * f - 3.0f * f2 + 1.0f, -6.0f * f + 3.0f * f2, 3.0f * f);
    }
}

