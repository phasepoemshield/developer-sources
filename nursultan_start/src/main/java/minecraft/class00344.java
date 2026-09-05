/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02443
 *  minecraft.class03662
 *  minecraft.class05913
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class08097
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00340;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02443;
import minecraft.class03662;
import minecraft.class05913;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class08097;
import org.joml.Vector3fc;

public class class00344
implements class00340 {
    public static final class01894 N = class01894.y((String)"christmas");
    public static final class01894 y = class01894.y((String)"normal");
    public static final class01894 L = class01894.y((String)"trapped");
    public static final class01894 u = class01894.y((String)"ender");
    public static final class01894 i = class01894.y((String)"copper");
    public static final class01894 R = class01894.y((String)"copper_exposed");
    public static final class01894 M = class01894.y((String)"copper_weathered");
    public static final class01894 B = class01894.y((String)"copper_oxidized");
    private final class08097 Z;
    private final class02443 z;
    private final class05913 U;
    private final float E;

    public class00344(class08097 class080972, class02443 class024432, class05913 class059132, float f) {
        this.Z = class080972;
        this.z = class024432;
        this.U = class059132;
        this.E = f;
    }

    @Override
    public void N(class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        class012372.N((class06271)this.z, (Object)Float.valueOf(this.E), class014212, this.U.N(class06851::u), n, n2, -1, this.Z.N(this.U), n3, null);
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        this.z.method_2819(Float.valueOf(this.E));
        this.z.method_63512().N(class014212, consumer);
    }
}

