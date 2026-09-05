/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class05247
 *  minecraft.class06634
 *  minecraft.class07915
 *  minecraft.class07948
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class00405;
import minecraft.class05247;
import minecraft.class06598;
import minecraft.class06615;
import minecraft.class06634;
import minecraft.class07915;
import minecraft.class07948;

class class06610
implements class07948 {
    final /* synthetic */ Supplier N;
    final /* synthetic */ boolean y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06610(class06634 class066342, Supplier supplier, boolean bl) {
        this.N = supplier;
        this.y = bl;
    }

    public class05247 N() {
        return class06615.N;
    }

    public class07915 N(float f, float f2, int n, int n2, class00405 class004052, float f3, float f4) {
        return new class06598(this.N, this.y, f, f2, n, n2, f4, class004052);
    }
}

