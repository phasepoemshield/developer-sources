/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class05487
 *  minecraft.class06638
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class08092
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class05487;
import minecraft.class06638;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class08092;

public final class DoubleChestStateHandler
implements IBlockStateHandler {
    @Override
    public class00500 connect(class00500 class005002, class05487 class054872, class07209 class072092) {
        if (!class005002.N(class00869.Mt)) {
            return (class00500)class005002.y((class08092)class00860.i, (Comparable)this.getChestType(class005002, (class07290)class054872, class072092));
        }
        return class005002;
    }

    private class06638 getChestType(class00500 class005002, class07290 class072902, class07209 class072092) {
        class07211 class072112 = (class07211)class005002.L((class08092)class00860.u);
        for (class07211 class072113 : class07221.field_11062) {
            class00500 class005003 = class072902.method_8320(class072092.method_10093(class072113));
            if (!class005003.N(class005002.i()) || !((class07211)class005003.L((class08092)class00860.u)).equals((Object)class072112)) continue;
            if (class072113 == class072112.R()) {
                return class06638.field_12574;
            }
            if (class072113 != class072112.M()) continue;
            return class06638.field_12571;
        }
        return class06638.field_12569;
    }
}

