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
 *  minecraft.class07280
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class07280;

public class class06651
implements class00381<class07280> {
    public static final class02362<class00667, class06651> N = class00381.N(class06651::N, class06651::new);
    private final class07209 y;
    private final boolean L;

    public class06651(class07209 class072092, boolean bl) {
        this.y = class072092;
        this.L = bl;
    }

    private class06651(class00667 class006672) {
        this.y = class006672.i();
        this.L = class006672.readBoolean();
    }

    public boolean y() {
        return this.L;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class07209 N() {
        return this.y;
    }

    private void N(class00667 class006672) {
        class006672.N(this.y);
        class006672.writeBoolean(this.L);
    }

    public class02897<class06651> method_65080() {
        return class04248.Nu;
    }
}

