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
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07280;

public class class08087
implements class00381<class07280> {
    public static final class02362<class04247, class08087> N = class00381.N(class08087::N, class08087::new);
    private static final int y = 1;
    private static final int L = 2;
    private static final int u = 4;
    private static final int i = 8;
    private final int R;
    private final class03556<class07084> M;
    private final int B;
    private final int Z;
    private final byte z;

    public int L() {
        return this.B;
    }

    public boolean M() {
        return (this.z & 2) != 0;
    }

    public class08087(int n, class07055 class070552, boolean bl) {
        this.R = n;
        this.M = class070552.L();
        this.B = class070552.i();
        this.Z = class070552.u();
        byte by = 0;
        if (class070552.R()) {
            by = (byte)(by | 1);
        }
        if (class070552.M()) {
            by = (byte)(by | 2);
        }
        if (class070552.B()) {
            by = (byte)(by | 4);
        }
        if (bl) {
            by = (byte)(by | 8);
        }
        this.z = by;
    }

    private class08087(class04247 class042472) {
        this.R = class042472.E();
        this.M = (class03556)class07084.y.decode((Object)class042472);
        this.B = class042472.E();
        this.Z = class042472.E();
        this.z = class042472.readByte();
    }

    public boolean B() {
        return (this.z & 1) != 0;
    }

    public boolean Z() {
        return (this.z & 4) != 0;
    }

    public boolean z() {
        return (this.z & 8) != 0;
    }

    public int u() {
        return this.Z;
    }

    public class03556<class07084> y() {
        return this.M;
    }

    public int N() {
        return this.R;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class04247 class042472) {
        class042472.L(this.R);
        class07084.y.encode((Object)class042472, this.M);
        class042472.L(this.B);
        class042472.L(this.Z);
        class042472.writeByte((int)this.z);
    }

    public class02897<class08087> method_65080() {
        return class04248.yW;
    }
}

