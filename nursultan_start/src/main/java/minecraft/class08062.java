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
 *  minecraft.class07049
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
import minecraft.class07049;
import minecraft.class07280;

public class class08062
implements class00381<class07280> {
    public static final class02362<class04247, class08062> N = class00381.N(class08062::N, class08062::new);
    private final class03556<class04891> y;
    private final class04911 L;
    private final int u;
    private final float i;
    private final float R;
    private final long M;

    public int L() {
        return this.u;
    }

    public float M() {
        return this.R;
    }

    public class08062(class03556<class04891> class035562, class04911 class049112, class07049 class070492, float f, float f2, long l) {
        this.y = class035562;
        this.L = class049112;
        this.u = class070492.method_5628();
        this.i = f;
        this.R = f2;
        this.M = l;
    }

    private class08062(class04247 class042472) {
        this.y = (class03556)class04891.u.decode((Object)class042472);
        this.L = (class04911)class042472.y(class04911.class);
        this.u = class042472.E();
        this.i = class042472.readFloat();
        this.R = class042472.readFloat();
        this.M = class042472.readLong();
    }

    public long B() {
        return this.M;
    }

    public float u() {
        return this.i;
    }

    public class04911 y() {
        return this.L;
    }

    public class03556<class04891> N() {
        return this.y;
    }

    private void N(class04247 class042472) {
        class04891.u.encode((Object)class042472, this.y);
        class042472.N((Enum)this.L);
        class042472.L(this.u);
        class042472.writeFloat(this.i);
        class042472.writeFloat(this.R);
        class042472.writeLong(this.M);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class08062> method_65080() {
        return class04248.yN;
    }
}

