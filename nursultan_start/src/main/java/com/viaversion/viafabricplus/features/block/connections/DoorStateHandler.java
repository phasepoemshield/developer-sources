/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class05487
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08058
 *  minecraft.class08059
 *  minecraft.class08092
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import minecraft.class00500;
import minecraft.class05487;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08058;
import minecraft.class08059;
import minecraft.class08092;

public final class DoorStateHandler
implements IBlockStateHandler {
    @Override
    public class00500 connect(class00500 class005002, class05487 class054872, class07209 class072092) {
        boolean bl = class005002.L((class08092)class07196.L) == class08059.field_12607;
        class00500 class005003 = class054872.method_8320(bl ? class072092.method_10084() : class072092.method_10074());
        if (!class005003.N(class005002.i())) {
            return class005002;
        }
        if (bl) {
            return (class00500)((class00500)class005002.y((class08092)class07196.u, (Comparable)((class08058)class005003.L((class08092)class07196.u)))).y((class08092)class07196.R, (Comparable)((Boolean)class005003.L((class08092)class07196.R)));
        }
        return (class00500)((class00500)class005002.y((class08092)class07196.y, (Comparable)((class07211)class005003.L((class08092)class07196.y)))).y((class08092)class07196.i, (Comparable)((Boolean)class005003.L((class08092)class07196.i)));
    }
}

