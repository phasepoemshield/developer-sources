/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00521
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00521;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public class class00503
implements class00381<class07280> {
    public static final class02362<class00667, class00503> N = class00381.N(class00503::N, class00503::new);
    public static final class00521 y = new class00521(0);
    public static final class00521 L = new class00521(1);
    public static final class00521 u = new class00521(2);
    public static final class00521 i = new class00521(3);
    public static final class00521 R = new class00521(4);
    public static final class00521 M = new class00521(5);
    public static final class00521 B = new class00521(6);
    public static final class00521 Z = new class00521(7);
    public static final class00521 z = new class00521(8);
    public static final class00521 U = new class00521(9);
    public static final class00521 E = new class00521(10);
    public static final class00521 W = new class00521(11);
    public static final class00521 m = new class00521(12);
    public static final class00521 P = new class00521(13);
    public static final int s = 0;
    public static final int T = 101;
    public static final int b = 102;
    public static final int j = 103;
    public static final int v = 104;
    private final class00521 n;
    private final float t;

    public class00503(class00521 class005212, float f) {
        this.n = class005212;
        this.t = f;
    }

    private class00503(class00667 class006672) {
        this.n = (class00521)class00521.N.get((int)class006672.readUnsignedByte());
        this.t = class006672.readFloat();
    }

    public float y() {
        return this.t;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class00521 N() {
        return this.n;
    }

    private void N(class00667 class006672) {
        class006672.writeByte(this.n.y);
        class006672.writeFloat(this.t);
    }

    public class02897<class00503> method_65080() {
        return class04248.V;
    }
}

