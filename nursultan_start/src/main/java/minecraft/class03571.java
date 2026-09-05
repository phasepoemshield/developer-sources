/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00331
 *  minecraft.class00393
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00645
 *  minecraft.class00985
 *  minecraft.class00988
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class02708
 *  minecraft.class02717
 *  minecraft.class03358
 *  minecraft.class03795
 *  minecraft.class04802
 *  minecraft.class04811
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06244
 *  minecraft.class06271
 *  minecraft.class06563
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07800
 *  minecraft.class08092
 *  minecraft.class08097
 *  minecraft.class08141
 *  minecraft.class08831
 *  minecraft.class08842
 *  minecraft.class08874
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00331;
import minecraft.class00393;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00645;
import minecraft.class00985;
import minecraft.class00988;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class02708;
import minecraft.class02717;
import minecraft.class03358;
import minecraft.class03556;
import minecraft.class03795;
import minecraft.class04802;
import minecraft.class04811;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06244;
import minecraft.class06271;
import minecraft.class06563;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07800;
import minecraft.class08092;
import minecraft.class08097;
import minecraft.class08141;
import minecraft.class08831;
import minecraft.class08842;
import minecraft.class08874;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03571
implements class03358<class00393, class00988> {
    private static final int N = 16;
    private static final float y = 0.6666667f;
    private final class08097 L;
    private final class08831 u;
    private final class08831 i;
    private final class08842 R;
    private final class08842 M;

    public class03571(class01140 class011402, class08097 class080972) {
        this.L = class080972;
        this.u = new class08831(class011402.N(class04802.P));
        this.i = new class08831(class011402.N(class04802.T));
        this.R = new class08842(class011402.N(class04802.s));
        this.M = new class08842(class011402.N(class04802.b));
    }

    public class03571(class00331 class003312) {
        this(class003312.y(), class003312.L());
    }

    public class03571(class04811 class048112) {
        this(class048112.R(), class048112.B());
    }

    private static <S> void N(class08097 class080972, class01421 class014212, class01237 class012372, int n, int n2, class06271<S> class062712, S s, class05913 class059132, class06563 class065632, @Nullable class08141 class081412) {
        int n3 = class065632.L();
        class012372.N(class062712, s, class014212, class059132.N(class06851::m), n, n2, n3, class080972.N(class059132), 0, class081412);
    }

    public void N(Consumer<Vector3fc> consumer) {
        class01421 class014212 = new class01421();
        class014212.N(0.5f, 0.0f, 0.5f);
        class014212.y(0.6666667f, -0.6666667f, -0.6666667f);
        this.u.method_63512().N(class014212, consumer);
        this.R.method_2819(Float.valueOf(0.0f));
        this.R.method_63512().N(class014212, consumer);
    }

    private static void N(class08097 class080972, class01421 class014212, class01237 class012372, int n, int n2, float f, class08831 class088312, class08842 class088422, float f2, class06563 class065632, class02708 class027082, @Nullable class08141 class081412, int n3) {
        class014212.N();
        class014212.N(0.5f, 0.0f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(f));
        class014212.y(0.6666667f, -0.6666667f, -0.6666667f);
        class05913 class059132 = class08874.B;
        class012372.N((class06271)class088312, (Object)class06244.field_17274, class014212, class059132.N(class06851::u), n, n2, -1, class080972.N(class059132), n3, class081412);
        class03571.N(class080972, class014212, class012372, n, n2, class088422, Float.valueOf(f2), class059132, true, class065632, class027082, false, class081412, n3);
        class014212.y();
    }

    public void N(class00393 class003932, class00988 class009882, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N((class00394)class003932, (class00985)class009882, f, class068892, class081412);
        class009882.N = class003932.u();
        class009882.y = class003932.y();
        class00500 class005002 = class003932.w();
        if (class005002.i() instanceof class07800) {
            class009882.u = -class03795.y((int)((Integer)class005002.L((class08092)class07800.y)));
            class009882.i = true;
        } else {
            class009882.u = -((class07211)class005002.L((class08092)class00645.y)).U();
            class009882.i = false;
        }
        long l = class003932.G() != null ? class003932.G().N() : 0L;
        class07209 class072092 = class003932.d();
        class009882.L = ((float)Math.floorMod((long)(class072092.method_10263() * 7 + class072092.method_10264() * 9 + class072092.method_10260() * 13) + l, 100L) + f) / 100.0f;
    }

    public void N(class00988 class009882, class01421 class014212, class01237 class012372, class06959 class069592) {
        class08842 class088422;
        class08831 class088312;
        if (class009882.i) {
            class088312 = this.u;
            class088422 = this.R;
        } else {
            class088312 = this.i;
            class088422 = this.M;
        }
        class03571.N(this.L, class014212, class012372, class009882.Z, class01384.u, class009882.u, class088312, class088422, class009882.L, class009882.N, class009882.y, class009882.z, 0);
    }

    public void N(class01421 class014212, class01237 class012372, int n, int n2, class06563 class065632, class02708 class027082, int n3) {
        class03571.N(this.L, class014212, class012372, n, n2, 0.0f, this.u, this.R, 0.0f, class065632, class027082, null, n3);
    }

    public class00988 i() {
        return new class00988();
    }

    public static <S> void N(class08097 class080972, class01421 class014212, class01237 class012372, int n, int n2, class06271<S> class062712, S s, class05913 class059132, boolean bl, class06563 class065632, class02708 class027082, boolean bl2, @Nullable class08141 class081412, int n3) {
        class012372.N(class062712, s, class014212, class059132.N(class06851::u), n, n2, -1, class080972.N(class059132), n3, class081412);
        if (bl2) {
            class012372.N(class062712, s, class014212, class06851.Z(), n, n2, -1, class080972.N(class059132), 0, class081412);
        }
        class03571.N(class080972, class014212, class012372, n, n2, class062712, s, bl ? class05911.Y : class05911.Q, class065632, class081412);
        for (int i = 0; i < 16 && i < class027082.y().size(); ++i) {
            class02717 class027172 = (class02717)class027082.y().get(i);
            class05913 class059133 = bl ? class05911.N((class03556)class027172.y()) : class05911.y((class03556)class027172.y());
            class03571.N(class080972, class014212, class012372, n, n2, class062712, s, class059133, class027172.L(), null);
        }
    }
}

