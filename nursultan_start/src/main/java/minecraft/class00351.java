/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02484
 *  minecraft.class02695
 *  minecraft.class02708
 *  minecraft.class03571
 *  minecraft.class03662
 *  minecraft.class04534
 *  minecraft.class05913
 *  minecraft.class06244
 *  minecraft.class06271
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class08097
 *  minecraft.class08874
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00368;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02484;
import minecraft.class02695;
import minecraft.class02708;
import minecraft.class03571;
import minecraft.class03662;
import minecraft.class04534;
import minecraft.class05913;
import minecraft.class06244;
import minecraft.class06271;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class08097;
import minecraft.class08874;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class00351
implements class00368<class02695> {
    private final class08097 N;
    private final class04534 y;

    public class00351(class08097 class080972, class04534 class045342) {
        this.N = class080972;
        this.y = class045342;
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        class014212.y(1.0f, -1.0f, -1.0f);
        this.y.method_63512().N(class014212, consumer);
    }

    @Override
    public void N(@Nullable class02695 class026952, class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        class02708 class027082 = class026952 != null ? (class02708)class026952.a_(class02484.Nv, (Object)class02708.L) : class02708.L;
        class06563 class065632 = class026952 != null ? (class06563)class026952.method_58694(class02484.Nn) : null;
        boolean bl2 = !class027082.y().isEmpty() || class065632 != null;
        class014212.N();
        class014212.y(1.0f, -1.0f, -1.0f);
        class05913 class059132 = bl2 ? class08874.Z : class08874.z;
        class012372.N(this.y.L(), class014212, this.y.method_23500(class059132.N()), n, n2, this.N.N(class059132), false, false, -1, null, n3);
        if (bl2) {
            class03571.N((class08097)this.N, (class01421)class014212, (class01237)class012372, (int)n, (int)n2, (class06271)this.y, (Object)class06244.field_17274, (class05913)class059132, (boolean)false, (class06563)Objects.requireNonNullElse(class065632, class06563.field_7952), (class02708)class027082, (boolean)bl, null, (int)n3);
        } else {
            class012372.N(this.y.y(), class014212, this.y.method_23500(class059132.N()), n, n2, this.N.N(class059132), false, bl, -1, null, n3);
        }
        class014212.y();
    }

    @Override
    public @Nullable class02695 y(class06584 class065842) {
        return class065842.i();
    }
}

