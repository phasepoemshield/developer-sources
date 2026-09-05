/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class05033;

public final class class06638
extends Enum<class06638>
implements class05033 {
    public static final /* enum */ class06638 field_12569 = new class06638("single");
    public static final /* enum */ class06638 field_12574 = new class06638("left");
    public static final /* enum */ class06638 field_12571 = new class06638("right");
    private final String field_12572;
    private static final /* synthetic */ class06638[] field_12573;

    private class06638(String string2) {
        this.field_12572 = string2;
    }

    public static class06638[] values() {
        return (class06638[])field_12573.clone();
    }

    public static class06638 valueOf(String string) {
        return Enum.valueOf(class06638.class, string);
    }

    private static /* synthetic */ class06638[] y() {
        return new class06638[]{field_12569, field_12574, field_12571};
    }

    public class06638 N() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> field_12569;
            case 1 -> field_12571;
            case 2 -> field_12574;
        };
    }

    public String method_15434() {
        return this.field_12572;
    }

    static {
        field_12573 = class06638.y();
    }
}

