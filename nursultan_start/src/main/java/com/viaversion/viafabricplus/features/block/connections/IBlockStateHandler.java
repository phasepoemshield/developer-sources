/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class05487
 *  minecraft.class07209
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class05487;
import minecraft.class07209;

public interface IBlockStateHandler {
    public class00500 connect(class00500 var1, class05487 var2, class07209 var3);

    default public boolean isExceptionForConnection(class00500 class005002) {
        return class005002.P() || Block1_14.isExceptBlockForAttachWithPiston(class005002.i()) || class005002.N(class00869.Rq) || class005002.N(class00869.Ro) || class005002.N(class00869.iK) || class005002.N(class00869.iV) || class005002.N(class00869.ZX);
    }
}

