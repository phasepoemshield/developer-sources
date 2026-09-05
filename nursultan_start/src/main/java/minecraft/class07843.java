/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07050
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07050;
import minecraft.class08051;

public class class07843
implements class00381<class08051> {
    public static final class02362<class00667, class07843> N = class00381.N(class07843::N, class07843::new);
    private final class07050 y;
    private final int L;
    private final float u;
    private final float i;

    public float L() {
        return this.u;
    }

    public class07843(class07050 class070502, int n, float f, float f2) {
        this.y = class070502;
        this.L = n;
        this.u = f;
        this.i = f2;
    }

    private class07843(class00667 class006672) {
        this.y = (class07050)class006672.y(class07050.class);
        this.L = class006672.E();
        this.u = class006672.readFloat();
        this.i = class006672.readFloat();
    }

    public float u() {
        return this.i;
    }

    public int y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.N((Enum)this.y);
        class006672.L(this.L);
        class006672.writeFloat(this.u);
        class006672.writeFloat(this.i);
    }

    public class07050 N() {
        return this.y;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12065(this);
    }

    public class02897<class07843> method_65080() {
        return class04248.Lt;
    }
}

