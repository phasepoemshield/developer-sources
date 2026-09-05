/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06165
 *  minecraft.class07079
 *  minecraft.class07962
 */
package minecraft;

import minecraft.class06165;
import minecraft.class07079;
import minecraft.class07962;

class class01324
extends class07962 {
    final /* synthetic */ class06165 B;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class01324(class06165 class061652, class07079 class070792, Class clazz, float f) {
        this.B = class061652;
        super(class070792, clazz, f);
    }

    public boolean y() {
        return super.y() && !this.B.n() && !this.B.d();
    }

    public boolean N() {
        return super.N() && !this.B.n() && !this.B.d();
    }
}

