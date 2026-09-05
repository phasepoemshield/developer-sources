/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00001
 *  minecraft.class04770
 *  minecraft.class05298
 *  minecraft.class07049
 *  minecraft.class07321
 *  minecraft.class07438
 */
package minecraft;

import java.util.Optional;
import minecraft.class00001;
import minecraft.class00028;
import minecraft.class00038;
import minecraft.class04770;
import minecraft.class05298;
import minecraft.class07049;
import minecraft.class07321;
import minecraft.class07438;

public interface class00042
extends class00001 {
    public static final int E = 332;

    public boolean method_70674();

    public static boolean y(class07438 class074382, class04770 class047702) {
        return class074382.method_5739((class07049)class047702) > 332.0f;
    }

    public static boolean N(class07438 class074382, class04770 class047702) {
        if (class047702.method_7325()) {
            return false;
        }
        if (class074382.method_7325() || class074382.method_5821((class07049)class047702)) {
            return true;
        }
        double d = Math.min(class074382.method_45325(class05298.q), class047702.method_45325(class05298.K));
        return (double)class074382.method_5739((class07049)class047702) >= d;
    }

    public static boolean N(class07321 class073212, class04770 class047702) {
        return class047702.method_52372().y(class073212.B, class073212.Z);
    }

    public Optional<class00038> method_70672(class04770 var1);

    public class00028 method_70675();
}

