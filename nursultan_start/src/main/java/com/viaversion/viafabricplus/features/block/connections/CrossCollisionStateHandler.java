/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class05487
 *  minecraft.class06788
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07746
 *  minecraft.class08092
 */
package com.viaversion.viafabricplus.features.block.connections;

import com.viaversion.viafabricplus.features.block.connections.IBlockStateHandler;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class01210;
import minecraft.class05487;
import minecraft.class06788;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07746;
import minecraft.class08092;

public record CrossCollisionStateHandler(Predicate<class00500> customAllowed) implements IBlockStateHandler
{
    @Override
    public class00500 connect(class00500 class005002, class05487 class054872, class07209 class072092) {
        return (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)class06788.y, (Comparable)Boolean.valueOf(this.connectsTo((class07290)class054872, class072092.method_10095(), class07211.field_11043)))).y((class08092)class06788.u, (Comparable)Boolean.valueOf(this.connectsTo((class07290)class054872, class072092.method_10072(), class07211.field_11035)))).y((class08092)class06788.i, (Comparable)Boolean.valueOf(this.connectsTo((class07290)class054872, class072092.method_10067(), class07211.field_11039)))).y((class08092)class06788.L, (Comparable)Boolean.valueOf(this.connectsTo((class07290)class054872, class072092.method_10078(), class07211.field_11034)));
    }

    private boolean connectsTo(class07290 class072902, class07209 class072092, class07211 class072112) {
        class00500 class005002 = class072902.method_8320(class072092);
        boolean bl = false;
        if (class005002.N(class01210.K)) {
            bl = class005002.L((class08092)class07746.y) == class072112.b();
        }
        return !this.isExceptionForConnection(class005002) && (this.customAllowed.test(class005002) || bl || class005002.t());
    }
}

