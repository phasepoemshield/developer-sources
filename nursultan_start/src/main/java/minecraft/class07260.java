/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00494
 *  minecraft.class06857
 *  minecraft.class07185
 *  minecraft.class07739
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00494;
import minecraft.class06857;
import minecraft.class07185;
import minecraft.class07257;
import minecraft.class07739;

public class class07260
extends class00494 {
    private final class00494 N;
    private final class07185 y;
    private static final DoubleList L = new class06857(1);

    public DoubleList method_1109(class07185 class071852) {
        if (class071852 == this.y) {
            return L;
        }
        return this.N.method_1109(class071852);
    }

    public class07260(class00494 class004942, class07185 class071852, int n) {
        super(class07260.N(class004942.field_1401, class071852, n));
        this.N = class004942;
        this.y = class071852;
    }

    private static class07739 N(class07739 class077392, class07185 class071852, int n) {
        return new class07257(class077392, class071852.N(n, 0, 0), class071852.N(0, n, 0), class071852.N(0, 0, n), class071852.N(n + 1, class077392.field_1374, class077392.field_1374), class071852.N(class077392.field_1373, n + 1, class077392.field_1373), class071852.N(class077392.field_1372, class077392.field_1372, n + 1));
    }
}

