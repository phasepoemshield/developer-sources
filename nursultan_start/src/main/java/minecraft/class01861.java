/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class00772
 *  minecraft.class01149
 *  minecraft.class01383
 *  minecraft.class01502
 *  minecraft.class01642
 *  minecraft.class01645
 *  minecraft.class01648
 *  minecraft.class01649
 *  minecraft.class01665
 *  minecraft.class01778
 *  minecraft.class02783
 *  minecraft.class02804
 *  minecraft.class03472
 *  minecraft.class03473
 *  minecraft.class04172
 *  minecraft.class04194
 *  minecraft.class04995
 *  minecraft.class05366
 *  minecraft.class05375
 *  minecraft.class05687
 *  minecraft.class05731
 *  minecraft.class05916
 *  minecraft.class06134
 *  minecraft.class06145
 *  minecraft.class06202
 *  minecraft.class06735
 *  minecraft.class06889
 *  minecraft.class06972
 *  minecraft.class06978
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07529
 *  minecraft.class08038
 *  minecraft.class08206
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00457;
import minecraft.class00734;
import minecraft.class00772;
import minecraft.class01149;
import minecraft.class01383;
import minecraft.class01502;
import minecraft.class01642;
import minecraft.class01645;
import minecraft.class01648;
import minecraft.class01649;
import minecraft.class01665;
import minecraft.class01778;
import minecraft.class01857;
import minecraft.class01867;
import minecraft.class01872;
import minecraft.class01873;
import minecraft.class02783;
import minecraft.class02804;
import minecraft.class03472;
import minecraft.class03473;
import minecraft.class04172;
import minecraft.class04194;
import minecraft.class04995;
import minecraft.class05366;
import minecraft.class05375;
import minecraft.class05687;
import minecraft.class05731;
import minecraft.class05916;
import minecraft.class06134;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06735;
import minecraft.class06889;
import minecraft.class06972;
import minecraft.class06978;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07529;
import minecraft.class08038;
import minecraft.class08206;
import org.jspecify.annotations.Nullable;

public class class01861 {
    private final List<class01857> N = new ArrayList<class01857>();
    private long y;

    public class01861() {
        this.N();
    }

    public static Optional<class07049> N(@Nullable class07049 class070492, int n) {
        int n2;
        class00734 class007342;
        class06889 class068892;
        class06889 class068893;
        if (class070492 == null) {
            return Optional.empty();
        }
        class06889 class068894 = class070492.method_33571();
        class06145 class061452 = class08038.N((class07049)class070492, (class06889)class068894, (class06889)(class068893 = class068894.i(class068892 = class070492.method_5828(1.0f).L((double)n))), (class00734)(class007342 = class070492.method_5829().y(class068892).M(1.0)), (Predicate)class07042.B, (double)(n2 = n * n));
        if (class061452 == null) {
            return Optional.empty();
        }
        if (class068894.M(class061452.y()) > (double)n2) {
            return Optional.empty();
        }
        return Optional.of(class061452.L());
    }

    private static class06889 N(float f) {
        float f2 = 5.99999f;
        int n = (int)(class04995.N((float)f, (float)0.0f, (float)1.0f) * 5.99999f);
        float f3 = f * 5.99999f - (float)n;
        return switch (n) {
            case 0 -> new class06889(1.0, (double)f3, 0.0);
            case 1 -> new class06889((double)(1.0f - f3), 1.0, 0.0);
            case 2 -> new class06889(0.0, 1.0, (double)f3);
            case 3 -> new class06889(0.0, 1.0 - (double)f3, 1.0);
            case 4 -> new class06889((double)f3, 0.0, 1.0);
            case 5 -> new class06889(1.0, 0.0, 1.0 - (double)f3);
            default -> throw new IllegalStateException("Unexpected value: " + n);
        };
    }

    private static class06889 N(float f, float f2, float f3, float f4) {
        class06889 class068892 = class01861.N(f4).L((double)f);
        class06889 class068893 = class01861.N((f4 + 0.33333334f) % 1.0f).L((double)f2);
        class06889 class068894 = class01861.N((f4 + 0.6666667f) % 1.0f).L((double)f3);
        class06889 class068895 = class068892.i(class068893).i(class068894);
        double d = Math.max(Math.max(1.0, class068895.M), Math.max(class068895.B, class068895.Z));
        return new class06889(class068895.M / d, class068895.B / d, class068895.Z / d);
    }

    public void N(class01383 class013832, double d, double d2, double d3, float f) {
        class06202 class062022 = class06202.Nq();
        class00457 class004572 = class062022.NE().g();
        if (((class05731)class062022.L_0).R() != this.y) {
            this.y = ((class05731)class062022.L_0).R();
            this.N();
        }
        Iterator<class01857> var11 = this.N.iterator();
        while (var11.hasNext()) {
            var11.next().N(d, d2, d3, class004572, class013832, f);
        }
    }

    public void N() {
        class06202 class062022 = class06202.Nq();
        this.N.clear();
        if (((class05731)class062022.L_0).y(class06134.l)) {
            this.N.add((class01857)new class04194(class062022));
        }
        if (((class05731)class062022.L_0).y(class06134.Q)) {
            this.N.add((class01857)new class08206(class062022));
        }
        if (class07529.k) {
            this.N.add((class01857)new class01645());
        }
        if (((class05731)class062022.L_0).y(class06134.O)) {
            this.N.add((class01857)new class01649(class062022));
        }
        if (((class05731)class062022.L_0).y(class06134.g)) {
            this.N.add(new class01873(class062022));
        }
        if (((class05731)class062022.L_0).y(class06134.I)) {
            this.N.add(new class01872(class062022));
        }
        if (((class05731)class062022.L_0).y(class06134.J)) {
            this.N.add((class01857)new class03472(class062022));
        }
        if (class07529.O) {
            this.N.add((class01857)new class01648());
        }
        if (class07529.g) {
            this.N.add((class01857)new class02804());
        }
        if (class07529.I) {
            this.N.add((class01857)new class01665());
        }
        if (((class05731)class062022.L_0).y(class06134.o) || ((class05731)class062022.L_0).y(class06134.q)) {
            this.N.add(new class01867(class062022, ((class05731)class062022.L_0).y(class06134.o), ((class05731)class062022.L_0).y(class06134.q)));
        }
        if (((class05731)class062022.L_0).y(class06134.K)) {
            this.N.add((class01857)new class01642(class062022));
        }
        if (class07529.a) {
            this.N.add((class01857)new class01502());
        }
        if (class07529.p) {
            this.N.add((class01857)new class05375(class062022));
        }
        if (class07529.F) {
            this.N.add((class01857)new class06972(new class05375(class062022)));
        }
        if (class07529.A) {
            this.N.add((class01857)new class05916(class062022));
        }
        if (class07529.f) {
            this.N.add((class01857)new class05687(class062022));
        }
        if (class07529.X) {
            this.N.add((class01857)new class05366(class062022));
        }
        if (((class05731)class062022.L_0).y(class06134.V)) {
            this.N.add((class01857)new class04172(class062022));
        }
        if (class07529.J) {
            this.N.add((class01857)new class01149());
        }
        if (((class05731)class062022.L_0).y(class06134.e)) {
            this.N.add((class01857)new class03473(class062022, class00772.field_9284));
        }
        if (class07529.NM) {
            this.N.add((class01857)new class01778(class062022));
        }
        if (class07529.Nt) {
            this.N.add((class01857)new class06978());
        }
        if (((class05731)class062022.L_0).y(class06134.G)) {
            this.N.add((class01857)new class06735(class062022));
        }
        this.N.add((class01857)new class02783(class062022));
    }
}

