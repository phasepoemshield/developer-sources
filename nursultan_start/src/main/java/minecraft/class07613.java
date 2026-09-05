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

import minecraft.class07042;
import minecraft.class07438;
import minecraft.class07464;
import minecraft.class07475;
import minecraft.class07617;

class class07613<T extends class07438>
extends class07464<T> {
    private final class07617 Z;

    public class07613(class07617 class076172, Class<T> clazz, float f, double d, double d2) {
        super((class07475)class076172, clazz, f, d, d2, class07042.i);
        this.Z = class076172;
    }

    public boolean y() {
        return !this.Z.NQ() && super.y();
    }

    public boolean N() {
        return !this.Z.NQ() && super.N();
    }
}

