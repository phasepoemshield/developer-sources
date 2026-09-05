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
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07049;
import minecraft.class07363;
import minecraft.class08051;

public class class07375
implements class00381<class08051> {
    public static final class02362<class00667, class07375> N = class00381.N(class07375::N, class07375::new);
    private final int y;
    private final class07363 L;
    private final int u;

    public int L() {
        return this.u;
    }

    private class07375(class00667 class006672) {
        this.y = class006672.E();
        this.L = (class07363)class006672.y(class07363.class);
        this.u = class006672.E();
    }

    public class07375(class07049 class070492, class07363 class073632, int n) {
        this.y = class070492.method_5628();
        this.L = class073632;
        this.u = n;
    }

    public class07375(class07049 class070492, class07363 class073632) {
        this(class070492, class073632, 0);
    }

    public class07363 y() {
        return this.L;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12045(this);
    }

    public int N() {
        return this.y;
    }

    private void N(class00667 class006672) {
        class006672.L(this.y);
        class006672.N((Enum)this.L);
        class006672.L(this.u);
    }

    public class02897<class07375> method_65080() {
        return class04248.LN;
    }
}

