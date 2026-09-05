/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class05487
 *  minecraft.class06494
 *  minecraft.class06573
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00891;
import minecraft.class03792;
import minecraft.class05487;
import minecraft.class06494;
import minecraft.class06573;
import minecraft.class07209;
import minecraft.class07211;

public class class03759
extends class06494 {
    public class03759(class00891 class008912, class00891 class008913, class06573 class065732) {
        super(class065732, class008912, class008913, class07211.field_11036);
    }

    protected boolean N(class05487 class054872, class00500 class005002, class07209 class072092) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class03792 && !((class03792)class008912).y(class005002, class054872, class072092)) {
            return false;
        }
        return super.N(class054872, class005002, class072092);
    }
}

