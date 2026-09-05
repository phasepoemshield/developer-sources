/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class07280;

public class class08073
implements class00381<class07280> {
    public static final class02362<class04247, class08073> N = class00381.N(class08073::N, class08073::new);
    public static final float y = 8.0f;
    private final class03556<class04891> L;
    private final class04911 u;
    private final int i;
    private final int R;
    private final int M;
    private final float B;
    private final float Z;
    private final long z;

    public double L() {
        return (float)this.i / 8.0f;
    }

    public double M() {
        return (float)this.M / 8.0f;
    }

    public class08073(class03556<class04891> class035562, class04911 class049112, double d, double d2, double d3, float f, float f2, long l) {
        this.L = class035562;
        this.u = class049112;
        this.i = (int)(d * 8.0);
        this.R = (int)(d2 * 8.0);
        this.M = (int)(d3 * 8.0);
        this.B = f;
        this.Z = f2;
        this.z = l;
    }

    private class08073(class04247 class042472) {
        this.L = (class03556)class04891.u.decode((Object)class042472);
        this.u = (class04911)class042472.y(class04911.class);
        this.i = class042472.readInt();
        this.R = class042472.readInt();
        this.M = class042472.readInt();
        this.B = class042472.readFloat();
        this.Z = class042472.readFloat();
        this.z = class042472.readLong();
    }

    public float B() {
        return this.B;
    }

    public float Z() {
        return this.Z;
    }

    public long z() {
        return this.z;
    }

    public double u() {
        return (float)this.R / 8.0f;
    }

    public class04911 y() {
        return this.u;
    }

    public class03556<class04891> N() {
        return this.L;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class04247 class042472) {
        class04891.u.encode((Object)class042472, this.L);
        class042472.N((Enum)this.u);
        class042472.writeInt(this.i);
        class042472.writeInt(this.R);
        class042472.writeInt(this.M);
        class042472.writeFloat(this.B);
        class042472.writeFloat(this.Z);
        class042472.writeLong(this.z);
    }

    public class02897<class08073> method_65080() {
        return class04248.yy;
    }
}

