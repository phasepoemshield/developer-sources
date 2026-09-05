/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00650
 *  minecraft.class00891
 *  minecraft.class05487
 *  minecraft.class06008
 *  minecraft.class07031
 *  minecraft.class07188
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07746
 *  minecraft.class08092
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import minecraft.class00500;
import minecraft.class00650;
import minecraft.class00891;
import minecraft.class05487;
import minecraft.class06008;
import minecraft.class07031;
import minecraft.class07188;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07746;
import minecraft.class08092;

public final class WallStateHandler
implements IBlockStateHandler {
    @Override
    public class00500 connect(class00500 class005002, class05487 class054872, class07209 class072092) {
        boolean bl = this.connectsTo((class07290)class054872, class072092.method_10095(), class07211.field_11043);
        boolean bl2 = this.connectsTo((class07290)class054872, class072092.method_10072(), class07211.field_11035);
        boolean bl3 = this.connectsTo((class07290)class054872, class072092.method_10067(), class07211.field_11039);
        boolean bl4 = this.connectsTo((class07290)class054872, class072092.method_10078(), class07211.field_11034);
        boolean bl5 = (!bl2 || bl3 || !bl || bl4) && (bl2 || !bl3 || bl || !bl4) || !class054872.method_8320(class072092.method_10084()).P();
        return (class00500)((class00500)((class00500)((class00500)((class00500)class005002.y((class08092)class00650.y, (Comparable)Boolean.valueOf(bl5))).y((class08092)class00650.u, (Comparable)this.getWallSide(bl))).y((class08092)class00650.i, (Comparable)this.getWallSide(bl2))).y((class08092)class00650.R, (Comparable)this.getWallSide(bl3))).y((class08092)class00650.L, (Comparable)this.getWallSide(bl4));
    }

    private class06008 getWallSide(boolean bl) {
        return bl ? class06008.field_22179 : class06008.field_22178;
    }

    private boolean connectsTo(class07290 class072902, class07209 class072092, class07211 class072112) {
        class00500 class005002 = class072902.method_8320(class072092);
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07746) {
            return class005002.L((class08092)class07746.y) == class072112.b();
        }
        return !this.isExceptionForConnection(class005002) && (class008912 instanceof class00650 || class008912 instanceof class07188 || class008912 instanceof class07031 || class005002.t());
    }
}

