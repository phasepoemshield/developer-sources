/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntComparator
 *  java.lang.MatchException
 *  minecraft.class03287
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntComparator;
import minecraft.class03287;

public final class class03249
extends Enum<class03249> {
    public static final /* enum */ class03249 field_41826 = new class03249();
    public static final /* enum */ class03249 field_41827 = new class03249();
    public static final /* enum */ class03249 field_41828 = new class03249();
    public static final /* enum */ class03249 field_41829 = new class03249();
    private final IntComparator field_41830 = (n, n2) -> n == n2 ? 0 : (this.y(n, n2) ? -1 : 1);
    private static final /* synthetic */ class03249[] field_41831;

    public boolean L() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 2 -> false;
            case 1, 3 -> true;
        };
    }

    static {
        field_41831 = class03249.i();
    }

    public static class03249[] values() {
        return (class03249[])field_41831.clone();
    }

    public static class03249 valueOf(String string) {
        return Enum.valueOf(class03249.class, string);
    }

    private static /* synthetic */ class03249[] i() {
        return new class03249[]{field_41826, field_41827, field_41828, field_41829};
    }

    public IntComparator u() {
        return this.field_41830;
    }

    public class03249 y() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> field_41827;
            case 1 -> field_41826;
            case 2 -> field_41829;
            case 3 -> field_41828;
        };
    }

    public boolean y(int n, int n2) {
        if (this.L()) {
            return n < n2;
        }
        return n2 < n;
    }

    public class03287 N() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1 -> class03287.field_41823;
            case 2, 3 -> class03287.field_41822;
        };
    }

    public boolean N(int n, int n2) {
        if (this.L()) {
            return n > n2;
        }
        return n2 > n;
    }
}

