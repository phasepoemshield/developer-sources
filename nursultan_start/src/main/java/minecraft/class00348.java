/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class03662
 *  minecraft.class03852
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00340;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class03662;
import minecraft.class03852;
import org.joml.Vector3fc;

public class class00348
implements class00340 {
    private final class03852 N;

    public class00348(class03852 class038522) {
        this.N = class038522;
    }

    @Override
    public void N(class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        class014212.N();
        class014212.y(1.0f, -1.0f, -1.0f);
        class012372.N(this.N.method_63512(), class014212, this.N.method_23500(class03852.N), n, n2, null, false, bl, -1, null, n3);
        class014212.y();
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        class014212.y(1.0f, -1.0f, -1.0f);
        this.N.method_63512().N(class014212, consumer);
    }
}

