/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class03666
 *  minecraft.class03694
 *  minecraft.class04832
 *  minecraft.class07049
 *  minecraft.class08485
 *  minecraft.class08943
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01987;
import minecraft.class02058;
import minecraft.class03666;
import minecraft.class03694;
import minecraft.class04832;
import minecraft.class07049;
import minecraft.class08485;
import minecraft.class08943;
import org.joml.Quaternionfc;

public class class01971
extends class01987<class03694, class03666, class08485> {
    private final class08943 N;

    protected class01971(class04832 class048322) {
        super(class048322);
        this.N = class048322.y();
    }

    @Override
    public void N(class08485 class084852, class01421 class014212, class01237 class012372, int n, float f) {
        if (class084852.N.i()) {
            return;
        }
        class014212.N((Quaternionfc)class02058.u.rotation((float)Math.PI));
        class084852.N.N(class014212, class012372, n, class01384.u, class084852.l);
    }

    @Override
    public void method_62354(class03694 class036942, class08485 class084852, float f) {
        super.method_62354(class036942, class084852, f);
        class03666 class036662 = class036942.b();
        if (class036662 != null) {
            this.N.N(class084852.N, class036662.N(), class036662.y(), (class07049)class036942);
        } else {
            class084852.N.y();
        }
    }

    public class08485 method_55269() {
        return new class08485();
    }
}

