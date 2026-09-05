/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class05487
 *  minecraft.class06859
 *  minecraft.class07209
 *  minecraft.class08092
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import minecraft.class00500;
import minecraft.class05487;
import minecraft.class06859;
import minecraft.class07209;
import minecraft.class08092;

public final class RedStoneRepeaterStateHandler
implements IBlockStateHandler {
    @Override
    public class00500 connect(class00500 class005002, class05487 class054872, class07209 class072092) {
        return (class00500)class005002.y((class08092)class06859.y, (Comparable)Boolean.valueOf(((class06859)class005002.i()).y(class054872, class072092, class005002)));
    }
}

