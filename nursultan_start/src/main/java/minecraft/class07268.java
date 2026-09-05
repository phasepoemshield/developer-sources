/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07049
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07049;
import minecraft.class07280;

public class class07268
implements class00381<class07280> {
    public static final class02362<class00667, class07268> N = class00381.N(class07268::N, class07268::new);
    public static final int y = 0;
    public static final int L = 2;
    public static final int u = 3;
    public static final int i = 4;
    public static final int R = 5;
    private final int M;
    private final int B;

    public class07268(class07049 class070492, int n) {
        this.M = class070492.method_5628();
        this.B = n;
    }

    private class07268(class00667 class006672) {
        this.M = class006672.E();
        this.B = class006672.readUnsignedByte();
    }

    public int y() {
        return this.B;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.M;
    }

    private void N(class00667 class006672) {
        class006672.L(this.M);
        class006672.writeByte(this.B);
    }

    public class02897<class07268> method_65080() {
        return class04248.u;
    }
}

