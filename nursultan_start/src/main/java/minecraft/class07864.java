/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00683
 *  minecraft.class07438
 *  minecraft.class07464
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class00683;
import minecraft.class07438;
import minecraft.class07464;
import minecraft.class07475;
import minecraft.class07894;

class class07864<T extends class07438>
extends class07464<T> {
    private final class07894 z;
    final /* synthetic */ class07894 Z;

    public void L() {
        this.Z.y(null);
        super.L();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class07864(class07894 class078942, class07894 class078943, Class clazz, float f, double d, double d2) {
        this.Z = class078942;
        super((class07475)class078943, clazz, f, d, d2);
        this.z = class078943;
    }

    public void i() {
        this.Z.y(null);
        super.i();
    }

    public boolean N() {
        if (super.N() && this.y instanceof class00683) {
            return !this.z.NQ() && this.N((class00683)this.y);
        }
        return false;
    }

    private boolean N(class00683 class006832) {
        return class006832.Nh() >= class07894.N(this.Z).y(5);
    }
}

