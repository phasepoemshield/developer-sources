/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01832
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class05795
 *  minecraft.class07280
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.BitSet;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01832;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class05795;
import minecraft.class07280;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class00504
implements class00381<class07280> {
    public static final class02362<class00667, class00504> N = class00381.N(class00504::N, class00504::new);
    private final int y;
    private final int L;
    private final class01832 u;

    public class01832 L() {
        return this.u;
    }

    public class00504(class07321 class073212, class05795 class057952, @Nullable BitSet bitSet, @Nullable BitSet bitSet2) {
        this.y = class073212.B;
        this.L = class073212.Z;
        this.u = new class01832(class073212, class057952, bitSet, bitSet2);
    }

    private class00504(class00667 class006672) {
        this.y = class006672.E();
        this.L = class006672.E();
        this.u = new class01832(class006672, this.y, this.L);
    }

    public int y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.L(this.y);
        class006672.L(this.L);
        this.u.N(class006672);
    }

    public int N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00504> method_65080() {
        return class04248.A;
    }
}

