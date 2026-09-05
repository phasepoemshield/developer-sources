/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 *  minecraft.class08057
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class08057;

public class class02309
implements class00381<class07280> {
    public static final class02362<class00667, class02309> N = class00381.N(class02309::N, class02309::new);
    private final double y;
    private final double L;

    public class02309(class08057 class080572) {
        this.y = class080572.M();
        this.L = class080572.B();
    }

    private class02309(class00667 class006672) {
        this.y = class006672.readDouble();
        this.L = class006672.readDouble();
    }

    public double y() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public double N() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.writeDouble(this.y);
        class006672.writeDouble(this.L);
    }

    public class02897<class02309> method_65080() {
        return class04248.Nk;
    }
}

