/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07438
 *  minecraft.class07464
 *  minecraft.class07475
 *  minecraft.class07879
 *  minecraft.class07897
 */
package Nursultan;

import minecraft.class07438;
import minecraft.class07464;
import minecraft.class07475;
import minecraft.class07879;
import minecraft.class07897;

public class class10853<T extends class07438>
extends class07464<T> {
    private final class07879 Z;

    public class10853(class07879 class078792, Class<T> clazz, float f, double d, double d2) {
        super((class07475)class078792, clazz, f, d, d2);
        this.Z = class078792;
    }

    public boolean N() {
        return this.Z.v() != class07897.field_41567 && super.N();
    }
}

