/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05487
 *  minecraft.class06901
 *  minecraft.class07209
 *  minecraft.class08092
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class05487;
import minecraft.class06901;
import minecraft.class07209;
import minecraft.class08092;

public final class PipeStateHandler
implements IBlockStateHandler {
    @Override
    public class00500 connect(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00891 class008912 = class005002.i();
        class00500 class005003 = class054872.method_8320(class072092.method_10074());
        class00500 class005004 = class054872.method_8320(class072092.method_10084());
        class00500 class005005 = class054872.method_8320(class072092.method_10095());
        class00500 class005006 = class054872.method_8320(class072092.method_10078());
        class00500 class005007 = class054872.method_8320(class072092.method_10072());
        class00500 class005008 = class054872.method_8320(class072092.method_10067());
        return (class00500)((class00500)((class00500)((class00500)((class00500)((class00500)class005002.y((class08092)class06901.M, (Comparable)Boolean.valueOf(class005003.N(class008912) || class005003.N(class00869.Eb) || class005003.N(class00869.MP)))).y((class08092)class06901.R, (Comparable)Boolean.valueOf(class005004.N(class008912) || class005004.N(class00869.Eb)))).y((class08092)class06901.y, (Comparable)Boolean.valueOf(class005005.N(class008912) || class005005.N(class00869.Eb)))).y((class08092)class06901.L, (Comparable)Boolean.valueOf(class005006.N(class008912) || class005006.N(class00869.Eb)))).y((class08092)class06901.u, (Comparable)Boolean.valueOf(class005007.N(class008912) || class005007.N(class00869.Eb)))).y((class08092)class06901.i, (Comparable)Boolean.valueOf(class005008.N(class008912) || class005008.N(class00869.Eb)));
    }
}

