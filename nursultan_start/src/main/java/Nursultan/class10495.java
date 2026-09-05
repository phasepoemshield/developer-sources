/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05143
 *  minecraft.class05144
 *  minecraft.class06069
 *  minecraft.class06433
 *  minecraft.class06476
 *  minecraft.class07211
 */
package Nursultan;

import minecraft.class05143;
import minecraft.class05144;
import minecraft.class06069;
import minecraft.class06433;
import minecraft.class06476;
import minecraft.class07211;

public class class10495
implements class05143 {
    public boolean N(class06433 class064332) {
        if (class064332.L[class07211.field_11034.L()] && !class064332.y[class07211.field_11034.L()].u && class064332.L[class07211.field_11036.L()] && !class064332.y[class07211.field_11036.L()].u) {
            class06433 class064333 = class064332.y[class07211.field_11034.L()];
            return class064333.L[class07211.field_11036.L()] && !class064333.y[class07211.field_11036.L()].u;
        }
        return false;
    }

    public class06476 N(class07211 class072112, class06433 class064332, class06069 class060692) {
        class064332.u = true;
        class064332.y[class07211.field_11034.L()].u = true;
        class064332.y[class07211.field_11036.L()].u = true;
        class064332.y[class07211.field_11034.L()].y[class07211.field_11036.L()].u = true;
        return new class05144(class072112, class064332);
    }
}

