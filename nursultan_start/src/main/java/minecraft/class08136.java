/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00340
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class03662
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class07211
 *  minecraft.class07914
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00340;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class03662;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class07211;
import minecraft.class07914;
import org.joml.Vector3fc;

public class class08136
implements class00340 {
    private static final class07211 N = class07211.field_11035;
    private final class07914 y;
    private final class01894 L;

    public class08136(class07914 class079142, class01894 class018942) {
        this.y = class079142;
        this.L = class018942;
    }

    public void N(class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        class08136.N(class014212);
        class012372.N((class06271)this.y, (Object)class07211.field_11035, class014212, class06851.M((class01894)this.L), n, n2, -1, null, n3, null);
    }

    private static void N(class01421 class014212) {
        class014212.N(0.5f, 1.5f, 0.5f);
        class014212.y(-1.0f, -1.0f, 1.0f);
    }

    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        class08136.N(class014212);
        this.y.method_2819(N);
        this.y.method_63512().N(class014212, consumer);
    }
}

