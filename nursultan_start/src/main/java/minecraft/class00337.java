/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class03360
 *  minecraft.class03662
 *  minecraft.class05913
 *  minecraft.class07211
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00340;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class03360;
import minecraft.class03662;
import minecraft.class05913;
import minecraft.class07211;
import org.joml.Vector3fc;

public class class00337
implements class00340 {
    private final class03360 N;
    private final float y;
    private final class07211 L;
    private final class05913 u;

    public class00337(class03360 class033602, float f, class07211 class072112, class05913 class059132) {
        this.N = class033602;
        this.y = f;
        this.L = class072112;
        this.u = class059132;
    }

    @Override
    public void N(class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        this.N.N(class014212, class012372, n, n2, this.L, this.y, null, this.u, n3);
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        this.N.N(this.L, this.y, consumer);
    }
}

