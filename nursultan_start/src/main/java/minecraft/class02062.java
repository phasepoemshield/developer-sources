/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class02070
 *  minecraft.class02102
 */
package minecraft;

import minecraft.class02070;
import minecraft.class02102;

public final class class02062
extends Enum<class02062> {
    public static final /* enum */ class02062 field_40789 = new class02062();
    public static final /* enum */ class02062 field_40790 = new class02062();
    private static final /* synthetic */ class02062[] field_40791;

    int L(class02102 class021022) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class021022.method_46426();
            case 1 -> class021022.method_46427();
        };
    }

    static {
        field_40791 = class02062.N();
    }

    public static class02062[] values() {
        return (class02062[])field_40791.clone();
    }

    public static class02062 valueOf(String string) {
        return Enum.valueOf(class02062.class, string);
    }

    int u(class02102 class021022) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class021022.method_46427();
            case 1 -> class021022.method_46426();
        };
    }

    int y(class02070 class020702) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class020702.N();
            case 1 -> class020702.y();
        };
    }

    int y(class02102 class021022) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class021022.method_25364();
            case 1 -> class021022.method_25368();
        };
    }

    int N(class02070 class020702) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class020702.y();
            case 1 -> class020702.N();
        };
    }

    private static /* synthetic */ class02062[] N() {
        return new class02062[]{field_40789, field_40790};
    }

    void N(class02070 class020702, int n, int n2) {
        switch (this.ordinal()) {
            case 0: {
                class020702.y(n, n2);
                break;
            }
            case 1: {
                class020702.N(n, n2);
            }
        }
    }

    void N(class02070 class020702, int n) {
        switch (this.ordinal()) {
            case 0: {
                class020702.N(n, class020702.y());
                break;
            }
            case 1: {
                class020702.y(n, class020702.N());
            }
        }
    }

    int N(class02102 class021022) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class021022.method_25368();
            case 1 -> class021022.method_25364();
        };
    }
}

