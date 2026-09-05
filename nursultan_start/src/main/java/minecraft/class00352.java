/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01097
 *  minecraft.class01112
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class03359
 *  minecraft.class03662
 *  minecraft.class07311
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00340;
import minecraft.class01097;
import minecraft.class01112;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class03359;
import minecraft.class03662;
import minecraft.class07311;
import org.joml.Vector3fc;

public class class00352
implements class00340 {
    private final class01097 N;
    private final float y;
    private final class07311 L;

    public class00352(class01097 class010972, float f, class07311 class073112) {
        this.N = class010972;
        this.y = f;
        this.L = class073112;
    }

    @Override
    public void N(class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        class03359.N(null, (float)180.0f, (float)this.y, (class01421)class014212, (class01237)class012372, (int)n, (class01097)this.N, (class07311)this.L, (int)n3, null);
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        class014212.N(0.5f, 0.0f, 0.5f);
        class014212.y(-1.0f, -1.0f, 1.0f);
        class01112 class011122 = new class01112();
        class011122.N = this.y;
        class011122.y = 180.0f;
        this.N.method_2819((Object)class011122);
        this.N.method_63512().N(class014212, consumer);
    }
}

