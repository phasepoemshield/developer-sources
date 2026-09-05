/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class03362
 *  minecraft.class03662
 *  minecraft.class06851
 *  minecraft.class08097
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00340;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class03362;
import minecraft.class03662;
import minecraft.class06851;
import minecraft.class08097;
import org.joml.Vector3fc;

public class class00338
implements class00340 {
    private final class08097 N;
    private final class01686 y;

    public class00338(class08097 class080972, class01686 class016862) {
        this.N = class080972;
        this.y = class016862;
    }

    @Override
    public void N(class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        class014212.N();
        class014212.N(0.5f, 0.5f, 0.5f);
        class012372.N(this.y, class014212, class03362.y.N(class06851::u), n, n2, this.N.N(class03362.y), false, false, -1, null, n3);
        class014212.y();
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        class014212.N(0.5f, 0.5f, 0.5f);
        this.y.N(class014212, consumer);
    }
}

