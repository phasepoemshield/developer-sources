/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07280;

public class class00495
implements class00381<class07280> {
    public static final class02362<class04247, class00495> N = class00381.N(class00495::N, class00495::new);
    private final double y;
    private final double L;
    private final double u;
    private final float i;
    private final float R;
    private final float M;
    private final float B;
    private final int Z;
    private final boolean z;
    private final boolean U;
    private final class07126 E;

    public double L() {
        return this.y;
    }

    public double M() {
        return this.u;
    }

    public <T extends class07126> class00495(T t, boolean bl, boolean bl2, double d, double d2, double d3, float f, float f2, float f3, float f4, int n) {
        this.E = t;
        this.z = bl;
        this.U = bl2;
        this.y = d;
        this.L = d2;
        this.u = d3;
        this.i = f;
        this.R = f2;
        this.M = f3;
        this.B = f4;
        this.Z = n;
    }

    private class00495(class04247 class042472) {
        this.z = class042472.readBoolean();
        this.U = class042472.readBoolean();
        this.y = class042472.readDouble();
        this.L = class042472.readDouble();
        this.u = class042472.readDouble();
        this.i = class042472.readFloat();
        this.R = class042472.readFloat();
        this.M = class042472.readFloat();
        this.B = class042472.readFloat();
        this.Z = class042472.readInt();
        this.E = (class07126)class07107.yW.decode((Object)class042472);
    }

    public float B() {
        return this.i;
    }

    public float Z() {
        return this.R;
    }

    public float U() {
        return this.B;
    }

    public float z() {
        return this.M;
    }

    public double u() {
        return this.L;
    }

    public boolean y() {
        return this.U;
    }

    public int E() {
        return this.Z;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class04247 class042472) {
        class042472.writeBoolean(this.z);
        class042472.writeBoolean(this.U);
        class042472.writeDouble(this.y);
        class042472.writeDouble(this.L);
        class042472.writeDouble(this.u);
        class042472.writeFloat(this.i);
        class042472.writeFloat(this.R);
        class042472.writeFloat(this.M);
        class042472.writeFloat(this.B);
        class042472.writeInt(this.Z);
        class07107.yW.encode((Object)class042472, (Object)this.E);
    }

    public boolean N() {
        return this.z;
    }

    public class07126 W() {
        return this.E;
    }

    public class02897<class00495> method_65080() {
        return class04248.F;
    }
}

