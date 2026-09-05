/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class03662
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class05640
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class08275
 *  minecraft.class08800
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class03662;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class05640;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class08275;
import minecraft.class08800;
import minecraft.class08943;
import org.joml.Quaternionfc;

public class class02662<T extends class07049>
extends class04507<T, class08275> {
    private final class08943 N;
    private final float y;
    private final boolean L;

    public class02662(class04832 class048322, float f, boolean bl) {
        super(class048322);
        this.N = class048322.y();
        this.y = f;
        this.L = bl;
    }

    public class02662(class04832 class048322) {
        this(class048322, 1.0f, false);
    }

    public class08275 method_55269() {
        return new class08275();
    }

    public void method_62354(T t, class08275 class082752, float f) {
        super.method_62354(t, (class08800)class082752, f);
        this.N.N(class082752.N, ((class05640)t).L(), class03662.field_4318, t);
    }

    public void method_3936(class08275 class082752, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.y(this.y, this.y, this.y);
        class014212.N((Quaternionfc)class069592.i);
        class082752.N.N(class014212, class012372, class082752.G, class01384.u, class082752.l);
        class014212.y();
        super.method_3936((class08800)class082752, class014212, class012372, class069592);
    }

    protected int method_24087(T t, class07209 class072092) {
        return this.L ? 15 : super.method_24087(t, class072092);
    }
}

