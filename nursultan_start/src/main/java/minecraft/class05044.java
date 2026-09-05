/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07209
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class08051;

public class class05044
implements class00381<class08051> {
    public static final class02362<class00667, class05044> N = class00381.N(class05044::N, class05044::new);
    private final class07209 y;
    private final int L;
    private final boolean u;

    public boolean L() {
        return this.u;
    }

    public class05044(class07209 class072092, int n, boolean bl) {
        this.y = class072092;
        this.L = n;
        this.u = bl;
    }

    private class05044(class00667 class006672) {
        this.y = class006672.i();
        this.L = class006672.E();
        this.u = class006672.readBoolean();
    }

    public int y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.N(this.y);
        class006672.L(this.L);
        class006672.writeBoolean(this.u);
    }

    public class07209 N() {
        return this.y;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_27273(this);
    }

    public class02897<class05044> method_65080() {
        return class04248.yc;
    }
}

