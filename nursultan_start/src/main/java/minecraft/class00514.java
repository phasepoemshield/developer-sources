/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01832
 *  minecraft.class01839
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class05795
 *  minecraft.class07280
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.BitSet;
import minecraft.class00381;
import minecraft.class00570;
import minecraft.class00667;
import minecraft.class01832;
import minecraft.class01839;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class05795;
import minecraft.class07280;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class00514
implements class00381<class07280> {
    public static final class02362<class04247, class00514> N = class00381.N(class00514::N, class00514::new);
    private final int y;
    private final int L;
    private final class01839 u;
    private final class01832 i;

    public class01839 L() {
        return this.u;
    }

    public class00514(class00570 class005702, class05795 class057952, @Nullable BitSet bitSet, @Nullable BitSet bitSet2) {
        class07321 class073212 = class005702.R();
        this.y = class073212.B;
        this.L = class073212.Z;
        this.u = new class01839(class005702);
        this.i = new class01832(class073212, class057952, bitSet, bitSet2);
    }

    private class00514(class04247 class042472) {
        this.y = class042472.readInt();
        this.L = class042472.readInt();
        this.u = new class01839(class042472, this.y, this.L);
        this.i = new class01832((class00667)class042472, this.y, this.L);
    }

    public class01832 u() {
        return this.i;
    }

    public int y() {
        return this.L;
    }

    private void N(class04247 class042472) {
        class042472.writeInt(this.y);
        class042472.writeInt(this.L);
        this.u.N(class042472);
        this.i.N((class00667)class042472);
    }

    public int N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00514> method_65080() {
        return class04248.a;
    }
}

