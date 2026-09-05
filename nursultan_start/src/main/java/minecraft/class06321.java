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

public class class06321
implements class00381<class08051> {
    public static final class02362<class00667, class06321> N = class00381.N(class06321::N, class06321::new);
    private final boolean y;

    public class06321(boolean bl) {
        this.y = bl;
    }

    private class06321(class00667 class006672) {
        this.y = class006672.readBoolean();
    }

    public void method_65081(class08051 class080512) {
        class080512.method_19476(this);
    }

    private void N(class00667 class006672) {
        class006672.writeBoolean(this.y);
    }

    public boolean N() {
        return this.y;
    }

    public class02897<class06321> method_65080() {
        return class04248.yX;
    }
}

