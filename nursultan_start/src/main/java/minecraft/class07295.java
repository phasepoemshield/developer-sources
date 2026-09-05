/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00772
 *  minecraft.class03202
 *  minecraft.class05795
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class00772;
import minecraft.class03202;
import minecraft.class05795;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;

public interface class07295
extends class07290 {
    default public boolean N_17(class07209 class072092) {
        return this.method_8314(class00772.field_9284, class072092) >= 15;
    }

    public float method_24852(class07211 var1, boolean var2);

    public class05795 method_22336();

    default public int method_22335(class07209 class072092, int n) {
        return this.method_22336().N(class072092, n);
    }

    public int method_23752(class07209 var1, class03202 var2);

    default public int method_8314(class00772 class007722, class07209 class072092) {
        return this.method_22336().N(class007722).L(class072092);
    }
}

