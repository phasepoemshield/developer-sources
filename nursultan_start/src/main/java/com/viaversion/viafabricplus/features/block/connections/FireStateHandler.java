/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00756
 *  minecraft.class00869
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class08092
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import minecraft.class00500;
import minecraft.class00756;
import minecraft.class00869;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class08092;

public final class FireStateHandler
implements IBlockStateHandler {
    @Override
    public class00500 connect(class00500 class005002, class05487 class054872, class07209 class072092) {
        boolean bl;
        boolean bl2 = bl = !class054872.method_8320(class072092.method_10074()).t() && !((class00756)class00869.Lc).U(class054872.method_8320(class072092.method_10074()));
        if (bl) {
            class00756 class007562 = (class00756)class005002.i();
            return (class00500)((class00500)((class00500)((class00500)((class00500)class005002.y((class08092)class00756.u, (Comparable)Boolean.valueOf(class007562.U(class054872.method_8320(class072092.method_10095()))))).y((class08092)class00756.i, (Comparable)Boolean.valueOf(class007562.U(class054872.method_8320(class072092.method_10078()))))).y((class08092)class00756.R, (Comparable)Boolean.valueOf(class007562.U(class054872.method_8320(class072092.method_10072()))))).y((class08092)class00756.M, (Comparable)Boolean.valueOf(class007562.U(class054872.method_8320(class072092.method_10067()))))).y((class08092)class00756.B, (Comparable)Boolean.valueOf(class007562.U(class054872.method_8320(class072092.method_10084()))));
        }
        return class005002;
    }
}

