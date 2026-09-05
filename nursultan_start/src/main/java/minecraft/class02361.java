/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public class class02361
implements class00381<class07280> {
    public static final class02362<class00667, class02361> N = class00381.N(class02361::N, class02361::new);
    private final boolean y;

    public class02361(boolean bl) {
        this.y = bl;
    }

    private class02361(class00667 class006672) {
        this.y = class006672.readBoolean();
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class006672.writeBoolean(this.y);
    }

    public boolean N() {
        return this.y;
    }

    public class02897<class02361> method_65080() {
        return class04248.s;
    }
}

