/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class04995
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07271
 *  minecraft.class08051
 *  minecraft.class08070
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class04995;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07271;
import minecraft.class08051;
import minecraft.class08070;

public class class07819
implements class00381<class08051> {
    public static final class02362<class00667, class07819> N = class00381.N(class07819::N, class07819::new);
    private static final int y = 1;
    private static final int L = 2;
    private static final int u = 4;
    private static final int i = 8;
    private final class07209 R;
    private final class07271 M;
    private final class08070 B;
    private final String Z;
    private final class07209 z;
    private final class00753 U;
    private final class07111 E;
    private final class06993 W;
    private final String m;
    private final boolean P;
    private final boolean s;
    private final boolean T;
    private final boolean b;
    private final float j;
    private final long v;

    public class08070 L() {
        return this.B;
    }

    public class07209 M() {
        return this.z;
    }

    public boolean P() {
        return this.b;
    }

    public long T() {
        return this.v;
    }

    public class07819(class07209 class072092, class07271 class072712, class08070 class080702, String string, class07209 class072093, class00753 class007532, class07111 class071112, class06993 class069932, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, float f, long l) {
        this.R = class072092;
        this.M = class072712;
        this.B = class080702;
        this.Z = string;
        this.z = class072093;
        this.U = class007532;
        this.E = class071112;
        this.W = class069932;
        this.m = string2;
        this.P = bl;
        this.s = bl2;
        this.T = bl3;
        this.b = bl4;
        this.j = f;
        this.v = l;
    }

    private class07819(class00667 class006672) {
        this.R = class006672.i();
        this.M = (class07271)class006672.y(class07271.class);
        this.B = (class08070)class006672.y(class08070.class);
        this.Z = class006672.s();
        int n = 48;
        this.z = new class07209(class04995.N((int)class006672.readByte(), (int)-48, (int)48), class04995.N((int)class006672.readByte(), (int)-48, (int)48), class04995.N((int)class006672.readByte(), (int)-48, (int)48));
        int n2 = 48;
        this.U = new class00753(class04995.N((int)class006672.readByte(), (int)0, (int)48), class04995.N((int)class006672.readByte(), (int)0, (int)48), class04995.N((int)class006672.readByte(), (int)0, (int)48));
        this.E = (class07111)class006672.y(class07111.class);
        this.W = (class06993)class006672.y(class06993.class);
        this.m = class006672.u(128);
        this.j = class04995.N((float)class006672.readFloat(), (float)0.0f, (float)1.0f);
        this.v = class006672.W();
        byte by = class006672.readByte();
        this.P = (by & 1) != 0;
        this.s = (by & 8) != 0;
        this.T = (by & 2) != 0;
        this.b = (by & 4) != 0;
    }

    public class00753 B() {
        return this.U;
    }

    public class07111 Z() {
        return this.E;
    }

    public float s() {
        return this.j;
    }

    public boolean m() {
        return this.T;
    }

    public String U() {
        return this.m;
    }

    public class06993 z() {
        return this.W;
    }

    public String u() {
        return this.Z;
    }

    public class07271 y() {
        return this.M;
    }

    public boolean E() {
        return this.P;
    }

    private void N(class00667 class006672) {
        class006672.N(this.R);
        class006672.N((Enum)this.M);
        class006672.N((Enum)this.B);
        class006672.N(this.Z);
        class006672.writeByte(this.z.method_10263());
        class006672.writeByte(this.z.method_10264());
        class006672.writeByte(this.z.method_10260());
        class006672.writeByte(this.U.method_10263());
        class006672.writeByte(this.U.method_10264());
        class006672.writeByte(this.U.method_10260());
        class006672.N((Enum)this.E);
        class006672.N((Enum)this.W);
        class006672.N(this.m);
        class006672.writeFloat(this.j);
        class006672.N(this.v);
        int n = 0;
        if (this.P) {
            n |= 1;
        }
        if (this.T) {
            n |= 2;
        }
        if (this.b) {
            n |= 4;
        }
        if (this.s) {
            n |= 8;
        }
        class006672.writeByte(n);
    }

    public class07209 N() {
        return this.R;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12051(this);
    }

    public boolean W() {
        return this.s;
    }

    public class02897<class07819> method_65080() {
        return class04248.LP;
    }
}

