/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00903
 *  minecraft.class01207
 *  minecraft.class01894
 *  minecraft.class03927
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05372
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class08036
 *  minecraft.class08595
 *  minecraft.class08610
 *  minecraft.class08625
 */
package minecraft;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00903;
import minecraft.class01207;
import minecraft.class01894;
import minecraft.class03927;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05163;
import minecraft.class05372;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class08036;
import minecraft.class08595;
import minecraft.class08610;
import minecraft.class08625;

public class class05514 {
    public static final int N = 10;
    public static final String y = "Minecraft.Server/src/test/convertables/data";
    public static Path L = Paths.get("Minecraft.Server/src/test/convertables/data", new String[0]);

    public static Stream<class07209> L(class07209 class072093, int n, class04782 class047822) {
        return class047822.method_19494().N((T class035562) -> class035562.N(class03927.n), (T class072092) -> true, class072093, n, class05372.field_18489).map(class07209::method_10062);
    }

    public static class05163 y(class07209 class072092, class00753 class007532, class06993 class069932) {
        class07209 class072093 = class05514.N(class072092, class007532, class069932);
        class05163 class051632 = class05163.N((class00753)class072092, (class00753)class072093);
        int n = Math.min(class051632.B(), class051632.U());
        int n2 = Math.min(class051632.z(), class051632.W());
        return class051632.N(class072092.method_10263() - n, 0, class072092.method_10260() - n2);
    }

    public static Optional<class07209> y(class07209 class072092, int n, class04782 class047822) {
        Comparator<class07209> comparator = Comparator.comparingInt(class072093 -> class072093.method_19455((class00753)class072092));
        return class05514.L(class072092, n, class047822).min(comparator);
    }

    private static void N(int n, class07209 class072092, class04782 class047822) {
        class00500 class005002 = class072092.method_10264() < n ? class00869.y.W() : class00869.N.W();
        new class00903(class005002, Collections.emptySet(), null).N(class047822, class072092, 818);
        class047822.method_8408(class072092, class005002.i());
    }

    public static Optional<class07209> N(class07209 class072092, int n, class04782 class047822) {
        return class05514.L(class072092, n, class047822).filter(class072093 -> class05514.N(class072093, class072092, class047822)).findFirst();
    }

    public static class07209 N(class07209 class072092, class00753 class007532, class06993 class069932) {
        return class01207.N((class07209)class072092.method_10081(class007532).method_10069(-1, -1, -1), (class07111)class07111.field_11302, (class06993)class069932, (class07209)class072092);
    }

    public static void N(class05163 class051632, class04782 class047822) {
        int n = class051632.Z() - 1;
        class07209.method_23627((class05163)class051632).forEach(class072092 -> class05514.N(n, class072092, class047822));
        class047822.method_14196().N(class051632);
        class047822.method_23658(class051632);
        class00734 class007342 = class00734.N((class05163)class051632);
        class047822.N(class07049.class, class007342, (T class070492) -> !(class070492 instanceof class08036)).forEach(class07049::method_31472);
    }

    public static class08610 N(class01894 class018942, class07209 class072092, class00753 class007532, class06993 class069932, class04782 class047822) {
        class05514.N(class05514.y(class08610.N((class07209)class072092), class007532, class069932), class047822);
        class047822.method_8501(class072092, class00869.Ty.W());
        class08610 class086102 = (class08610)class047822.method_8321(class072092);
        class05946 class059462 = class05946.N((class05946)class04227.yt, (class01894)class018942);
        class086102.N(new class08595(Optional.of(class059462), class007532, class069932, false, class08625.field_56014, Optional.empty()));
        return class086102;
    }

    private static boolean N(class07209 class072092, class07209 class072093, class04782 class047822) {
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class08610) {
            return ((class08610)class003942).u().y((class00753)class072093);
        }
        return false;
    }

    public static class06993 N(int n) {
        switch (n) {
            case 0: {
                return class06993.field_11467;
            }
            case 1: {
                return class06993.field_11463;
            }
            case 2: {
                return class06993.field_11464;
            }
            case 3: {
                return class06993.field_11465;
            }
        }
        throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + n);
    }

    public static Stream<class07209> N(class07209 class072093, class07049 class070492, class04782 class047822) {
        int n = 250;
        class06889 class068892 = class070492.method_33571();
        class06889 class068893 = class068892.i(class070492.method_5720().L(250.0));
        return class05514.L(class072093, 250, class047822).map(class072092 -> class047822.N(class072092, class00404.field_55993)).flatMap(Optional::stream).filter(class086102 -> class086102.R().y(class068892, class068893).isPresent()).map(class00394::d).sorted(Comparator.comparing(arg_0 -> ((class07209)class072093).method_10262(arg_0))).limit(1L);
    }

    public static int N(class06993 class069932) {
        switch (class069932) {
            case field_11467: {
                return 0;
            }
            case field_11463: {
                return 1;
            }
            case field_11464: {
                return 2;
            }
            case field_11465: {
                return 3;
            }
        }
        throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + String.valueOf(class069932));
    }
}

