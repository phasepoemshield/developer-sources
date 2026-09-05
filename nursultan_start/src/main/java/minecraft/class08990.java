/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class04995
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import java.util.Optional;
import java.util.OptionalInt;
import minecraft.class04995;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07211;

public interface class08990 {
    public int L();

    private static Optional<class07109> y(class06183 class061832, class07211 class072112) {
        class07211 class072113 = class061832.i();
        if (class072112 != class072113) {
            return Optional.empty();
        }
        class07209 class072092 = class061832.u().method_10093(class072113);
        class06889 class068892 = class061832.y().N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260());
        double d = class068892.N();
        double d2 = class068892.y();
        double d3 = class068892.L();
        return switch (class072113) {
            default -> throw new MatchException(null, null);
            case class07211.field_11043 -> Optional.of(new class07109((float)(1.0 - d), (float)d2));
            case class07211.field_11035 -> Optional.of(new class07109((float)d, (float)d2));
            case class07211.field_11039 -> Optional.of(new class07109((float)d3, (float)d2));
            case class07211.field_11034 -> Optional.of(new class07109((float)(1.0 - d3), (float)d2));
            case class07211.field_11033, class07211.field_11036 -> Optional.empty();
        };
    }

    public int y();

    private static int N(float f, int n) {
        float f2 = f * 16.0f;
        float f3 = 16.0f / (float)n;
        return class04995.N((int)class04995.y((float)(f2 / f3)), (int)0, (int)(n - 1));
    }

    default public OptionalInt N(class06183 class061832, class07211 class072112) {
        return class08990.y(class061832, class072112).map(class071092 -> {
            int n = class08990.N(1.0f - class071092.U, this.y());
            return OptionalInt.of(class08990.N(class071092.z, this.L()) + n * this.L());
        }).orElseGet(OptionalInt::empty);
    }
}

