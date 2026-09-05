/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07042
 *  minecraft.class07438
 *  minecraft.class07464
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class06129;
import minecraft.class07042;
import minecraft.class07438;
import minecraft.class07464;
import minecraft.class07475;

class class06117<T extends class07438>
extends class07464<T> {
    private final class06129 Z;

    public class06117(class06129 class061292, Class<T> clazz, float f, double d, double d2) {
        super((class07475)class061292, clazz, f, d, d2, class07042.i);
        this.Z = class061292;
    }

    public boolean y() {
        return !this.Z.B() && super.y();
    }

    public boolean N() {
        return !this.Z.B() && super.N();
    }
}

