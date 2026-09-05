/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class03357
 *  minecraft.class03662
 *  minecraft.class05913
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00340;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class03357;
import minecraft.class03662;
import minecraft.class05913;
import org.joml.Vector3fc;

public class class00353
implements class00340 {
    private final class03357 N;
    private final class05913 y;

    public class00353(class03357 class033572, class05913 class059132) {
        this.N = class033572;
        this.y = class059132;
    }

    @Override
    public void N(class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        this.N.N(class014212, class012372, n, n2, this.y, n3);
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        this.N.N(consumer);
    }
}

