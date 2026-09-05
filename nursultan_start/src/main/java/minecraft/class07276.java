/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01599
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 */
package minecraft;

import java.util.UUID;
import minecraft.class00381;
import minecraft.class01599;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07280;

public class class07276
implements class00381<class07280> {
    public static final class02362<class04247, class07276> N = class00381.N(class07276::N, class07276::new);
    private final int y;
    private final UUID L;
    private final class07078<?> u;
    private final double i;
    private final double R;
    private final double M;
    private final class06889 B;
    private final byte Z;
    private final byte z;
    private final byte U;
    private final int E;

    public class07078<?> L() {
        return this.u;
    }

    public double M() {
        return this.R;
    }

    private class07276(class04247 class042472) {
        this.y = class042472.E();
        this.L = class042472.m();
        this.u = (class07078)class02389.N((class05946)class04227.I).decode((Object)class042472);
        this.i = class042472.readDouble();
        this.R = class042472.readDouble();
        this.M = class042472.readDouble();
        this.B = class042472.U();
        this.Z = class042472.readByte();
        this.z = class042472.readByte();
        this.U = class042472.readByte();
        this.E = class042472.E();
    }

    public class07276(class07049 class070492, class01599 class015992) {
        this(class070492, class015992, 0);
    }

    public class07276(class07049 class070492, class01599 class015992, int n) {
        this(class070492.method_5628(), class070492.method_5667(), class015992.y().N(), class015992.y().y(), class015992.y().L(), class015992.u(), class015992.i(), class070492.method_5864(), n, class015992.L(), class015992.R());
    }

    public class07276(class07049 class070492, int n, class07209 class072092) {
        this(class070492.method_5628(), class070492.method_5667(), class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class070492.method_36455(), class070492.method_36454(), class070492.method_5864(), n, class070492.method_18798(), class070492.method_5791());
    }

    public class07276(int n, UUID uUID, double d, double d2, double d3, float f, float f2, class07078<?> class070782, int n2, class06889 class068892, double d4) {
        this.y = n;
        this.L = uUID;
        this.i = d;
        this.R = d2;
        this.M = d3;
        this.B = class068892;
        this.Z = class04995.i((float)f);
        this.z = class04995.i((float)f2);
        this.U = class04995.i((float)((float)d4));
        this.u = class070782;
        this.E = n2;
    }

    public double B() {
        return this.M;
    }

    public class06889 Z() {
        return this.B;
    }

    public float U() {
        return class04995.N((byte)this.z);
    }

    public float z() {
        return class04995.N((byte)this.Z);
    }

    public double u() {
        return this.i;
    }

    public UUID y() {
        return this.L;
    }

    public float E() {
        return class04995.N((byte)this.U);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class04247 class042472) {
        class042472.L(this.y);
        class042472.N(this.L);
        class02389.N((class05946)class04227.I).encode((Object)class042472, this.u);
        class042472.writeDouble(this.i);
        class042472.writeDouble(this.R);
        class042472.writeDouble(this.M);
        class042472.y(this.B);
        class042472.writeByte((int)this.Z);
        class042472.writeByte((int)this.z);
        class042472.writeByte((int)this.U);
        class042472.L(this.E);
    }

    public int N() {
        return this.y;
    }

    public int W() {
        return this.E;
    }

    public class02897<class07276> method_65080() {
        return class04248.L;
    }
}

