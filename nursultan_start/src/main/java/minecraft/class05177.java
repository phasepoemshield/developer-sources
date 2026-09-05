/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 *  minecraft.class06433
 *  minecraft.class06444
 *  minecraft.class06476
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class05143;
import minecraft.class06069;
import minecraft.class06433;
import minecraft.class06444;
import minecraft.class06476;
import minecraft.class07211;

class class05177
implements class05143 {
    class05177() {
    }

    @Override
    public boolean N(class06433 class064332) {
        return class064332.L[class07211.field_11043.L()] && !class064332.y[class07211.field_11043.L()].u;
    }

    @Override
    public class06476 N(class07211 class072112, class06433 class064332, class06069 class060692) {
        class06433 class064333 = class064332;
        if (!class064332.L[class07211.field_11043.L()] || class064332.y[class07211.field_11043.L()].u) {
            class064333 = class064332.y[class07211.field_11035.L()];
        }
        class064333.u = true;
        class064333.y[class07211.field_11043.L()].u = true;
        return new class06444(class072112, class064333);
    }
}

