/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00340
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02030
 *  minecraft.class03662
 *  minecraft.class05913
 *  minecraft.class06260
 *  minecraft.class08097
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00340;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02030;
import minecraft.class03662;
import minecraft.class05913;
import minecraft.class06260;
import minecraft.class08097;
import org.joml.Vector3fc;

public class class08364
implements class00340 {
    private final class08097 N;
    private final class06260 y;
    private final class05913 L;

    public class08364(class08097 class080972, class06260 class062602, class05913 class059132) {
        this.N = class080972;
        this.y = class062602;
        this.L = class059132;
    }

    public void N(class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        class02030.N((class08097)this.N, (class01421)class014212, (class01237)class012372, (int)n, (int)n2, (class06260)this.y, (class05913)this.L);
    }

    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        class02030.N((class01421)class014212, (float)0.0f);
        class014212.y(1.0f, -1.0f, -1.0f);
        this.y.method_63512().N(class014212, consumer);
    }
}

