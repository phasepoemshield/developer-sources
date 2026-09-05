/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public class class07377
implements class00381<class08051> {
    public static final class02362<class00667, class07377> N = class00381.N(class07377::N, class07377::new);
    private final boolean y;
    private final boolean L;

    public class07377(boolean bl, boolean bl2) {
        this.y = bl;
        this.L = bl2;
    }

    private class07377(class00667 class006672) {
        this.y = class006672.readBoolean();
        this.L = class006672.readBoolean();
    }

    public boolean y() {
        return this.L;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12064(this);
    }

    public boolean N() {
        return this.y;
    }

    private void N(class00667 class006672) {
        class006672.writeBoolean(this.y);
        class006672.writeBoolean(this.L);
    }

    public class02897<class07377> method_65080() {
        return class04248.yC;
    }
}

