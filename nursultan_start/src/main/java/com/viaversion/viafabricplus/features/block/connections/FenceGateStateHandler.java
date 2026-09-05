/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class05487
 *  minecraft.class07185
 *  minecraft.class07188
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08092
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class05487;
import minecraft.class07185;
import minecraft.class07188;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08092;

public final class FenceGateStateHandler
implements IBlockStateHandler {
    @Override
    public class00500 connect(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07185 class071852 = ((class07211)class005002.L((class08092)class07188.R)).z();
        class00500 class005003 = class054872.method_8320(class072092.method_10067());
        class00500 class005004 = class054872.method_8320(class072092.method_10078());
        class00500 class005005 = class054872.method_8320(class072092.method_10095());
        class00500 class005006 = class054872.method_8320(class072092.method_10072());
        if (class071852 == class07185.field_11051 && (class005003.N(class00869.Mg) || class005004.N(class00869.Mg)) || class071852 == class07185.field_11048 && (class005005.N(class00869.Mg) || class005006.N(class00869.Mg))) {
            return (class00500)class005002.y((class08092)class07188.u, (Comparable)Boolean.valueOf(true));
        }
        return class005002;
    }
}

