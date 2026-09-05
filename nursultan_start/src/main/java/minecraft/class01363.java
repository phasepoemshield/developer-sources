/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07475
 *  minecraft.class07969
 *  minecraft.class08791
 */
package minecraft;

import minecraft.class00869;
import minecraft.class01377;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07475;
import minecraft.class07969;
import minecraft.class08791;

class class01363
extends class07969 {
    private final class01377 M;

    class01363(class01377 class013772, double d) {
        super((class07475)class013772, d, 8, 2);
        this.M = class013772;
    }

    public class07209 U() {
        return this.i;
    }

    public boolean y() {
        return !this.M.method_5771() && this.N((class05487)this.M.method_73183(), this.i);
    }

    public boolean E() {
        return this.u % 20 == 0;
    }

    protected boolean N(class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092).N(class00869.V) && class054872.method_8320(class072092.method_10084()).N(class08791.field_50);
    }

    public boolean N() {
        return !this.M.method_5771() && super.N();
    }
}

