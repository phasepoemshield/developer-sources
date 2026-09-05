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
 *  minecraft.class07280
 */
package minecraft;

import java.util.List;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07049;
import minecraft.class07280;

public class class08079
implements class00381<class07280> {
    public static final class02362<class00667, class08079> N = class00381.N(class08079::N, class08079::new);
    private final int y;
    private final int[] L;

    public class08079(class07049 class070492) {
        this.y = class070492.method_5628();
        List var2 = class070492.method_5685();
        this.L = new int[var2.size()];
        for (int i = 0; i < var2.size(); ++i) {
            this.L[i] = ((class07049)var2.get(i)).method_5628();
        }
    }

    private class08079(class00667 class006672) {
        this.y = class006672.E();
        this.L = class006672.L();
    }

    public int y() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int[] N() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.L(this.y);
        class006672.N(this.L);
    }

    public class02897<class08079> method_65080() {
        return class04248.NA;
    }
}

