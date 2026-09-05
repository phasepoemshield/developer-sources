/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class08972
extends Enum<class08972>
implements class05033 {
    public static final /* enum */ class08972 field_61446 = new class08972("unconnected");
    public static final /* enum */ class08972 field_61447 = new class08972("right");
    public static final /* enum */ class08972 field_61448 = new class08972("center");
    public static final /* enum */ class08972 field_61449 = new class08972("left");
    private final String field_61450;
    private static final /* synthetic */ class08972[] field_61451;

    public class08972 L() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 3 -> field_61449;
            case 1, 2 -> field_61448;
        };
    }

    private static /* synthetic */ class08972[] M() {
        return new class08972[]{field_61446, field_61447, field_61448, field_61449};
    }

    private class08972(String string2) {
        this.field_61450 = string2;
    }

    public String toString() {
        return this.method_15434();
    }

    public static class08972[] values() {
        return (class08972[])field_61451.clone();
    }

    public static class08972 valueOf(String string) {
        return Enum.valueOf(class08972.class, string);
    }

    public class08972 i() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 3 -> field_61446;
            case 1, 2 -> field_61447;
        };
    }

    public class08972 u() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1 -> field_61447;
            case 2, 3 -> field_61448;
        };
    }

    public boolean y() {
        return this != field_61448;
    }

    public boolean N(class08972 class089722) {
        return this == field_61448 || this == class089722;
    }

    public boolean N() {
        return this != field_61446;
    }

    public class08972 R() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1 -> field_61446;
            case 2, 3 -> field_61449;
        };
    }

    public String method_15434() {
        return this.field_61450;
    }

    static {
        field_61451 = class08972.M();
    }
}

