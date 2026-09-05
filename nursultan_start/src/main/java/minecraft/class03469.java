/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00549
 *  minecraft.class02237
 *  minecraft.class02238
 *  minecraft.class04763
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00549;
import minecraft.class02237;
import minecraft.class02238;
import minecraft.class04763;
import org.jspecify.annotations.Nullable;

public class class03469 {
    private static final int L = 33;
    private static final int u = 32;
    private static final int i = 31;
    private static final class02237 R = class02238.N.N(class00549.m);
    public static final int N = R.L().L();
    public static final int y = 33 + N;

    public static class04763 L(int n) {
        if (n <= 31) {
            return class04763.field_13877;
        }
        if (n <= 32) {
            return class04763.field_44856;
        }
        if (n <= 33) {
            return class04763.field_44855;
        }
        return class04763.field_19334;
    }

    public static boolean i(int n) {
        return n <= 32;
    }

    public static boolean u(int n) {
        return n <= 31;
    }

    public static class00549 y(int n) {
        return class03469.N(n, class00549.L);
    }

    public static @Nullable class00549 N(int n, @Nullable class00549 class005492) {
        if (n > N) {
            return class005492;
        }
        if (n <= 0) {
            return class00549.m;
        }
        return R.L().N(n);
    }

    public static int N(class00549 class005492) {
        return 33 + R.N(class005492);
    }

    public static @Nullable class00549 N(int n) {
        return class03469.N(n - 33, null);
    }

    public static int N(class04763 class047632) {
        return switch (class047632) {
            default -> throw new MatchException(null, null);
            case class04763.field_19334 -> y;
            case class04763.field_44855 -> 33;
            case class04763.field_44856 -> 32;
            case class04763.field_13877 -> 31;
        };
    }

    public static boolean R(int n) {
        return n <= y;
    }
}

