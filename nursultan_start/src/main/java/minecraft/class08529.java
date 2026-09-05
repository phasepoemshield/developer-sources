/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00140
 *  minecraft.class00167
 *  minecraft.class02028
 *  minecraft.class03265
 *  minecraft.class03662
 *  minecraft.class03702
 *  minecraft.class04673
 *  minecraft.class08388
 *  minecraft.class08812
 *  minecraft.class08838
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00140;
import minecraft.class00167;
import minecraft.class02028;
import minecraft.class03265;
import minecraft.class03662;
import minecraft.class03702;
import minecraft.class04673;
import minecraft.class08388;
import minecraft.class08496;
import minecraft.class08512;
import minecraft.class08534;
import minecraft.class08812;
import minecraft.class08838;
import org.jspecify.annotations.Nullable;

public interface class08529
extends class08512 {
    public static final boolean u = true;
    public static final class00140 i = class00140.field_21859;

    public static class00140 L(class08529 class085292) {
        while (class085292 != null) {
            class00140 class001402 = class085292.N().comp_3740();
            if (class001402 != null) {
                return class001402;
            }
            class085292 = class085292.y();
        }
        return i;
    }

    default public class08534 M() {
        return class08529.u(this);
    }

    default public class08838 B() {
        return class08529.N(this);
    }

    public static class03702 i(class08529 class085292) {
        class03265 class032652 = class08529.N(class085292, class03662.field_4323);
        class03265 class032653 = class08529.N(class085292, class03662.field_4320);
        class03265 class032654 = class08529.N(class085292, class03662.field_4321);
        class03265 class032655 = class08529.N(class085292, class03662.field_4322);
        class03265 class032656 = class08529.N(class085292, class03662.field_4316);
        class03265 class032657 = class08529.N(class085292, class03662.field_4317);
        class03265 class032658 = class08529.N(class085292, class03662.field_4318);
        class03265 class032659 = class08529.N(class085292, class03662.field_4319);
        class03265 class0326510 = class08529.N(class085292, class03662.field_61988);
        return new class03702(class032652, class032653, class032654, class032655, class032656, class032657, class032658, class032659, class0326510);
    }

    default public class00140 i() {
        return class08529.L(this);
    }

    public static class08534 u(class08529 class085292) {
        while (class085292 != null) {
            class08534 class085342 = class085292.N().comp_3739();
            if (class085342 != null) {
                return class085342;
            }
            class085292 = class085292.y();
        }
        return class08534.N;
    }

    default public boolean u() {
        return class08529.y(this);
    }

    public @Nullable class08529 y();

    public static boolean y(class08529 class085292) {
        while (class085292 != null) {
            Boolean bl = class085292.N().comp_3741();
            if (bl != null) {
                return bl;
            }
            class085292 = class085292.y();
        }
        return true;
    }

    default public class08388 N(class08838 class088382, class02028 class020282) {
        return class08529.N(class088382, class020282, this);
    }

    public static class03265 N(class08529 class085292, class03662 class036622) {
        while (class085292 != null) {
            class03265 class032652;
            class03702 class037022 = class085292.N().comp_3742();
            if (class037022 != null && (class032652 = class037022.N(class036622)) != class03265.N) {
                return class032652;
            }
            class085292 = class085292.y();
        }
        return class03265.N;
    }

    public class00167 N();

    public static class08838 N(class08529 class085292) {
        class08812 class088122 = new class08812();
        for (class08529 class085293 = class085292; class085293 != null; class085293 = class085293.y()) {
            class088122.N(class085293.N().comp_3743());
        }
        return class088122.N((class08512)class085292);
    }

    default public class08496 N(class08838 class088382, class02028 class020282, class04673 class046732) {
        return this.M().bake(class088382, class020282, class046732, this);
    }

    public static class08388 N(class08838 class088382, class02028 class020282, class08512 class085122) {
        return class020282.y().N(class088382, "particle", class085122);
    }

    default public class03702 R() {
        return class08529.i(this);
    }
}

