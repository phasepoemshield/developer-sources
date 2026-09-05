/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class06541
 */
package minecraft;

import minecraft.class06541;

public final class class07445
extends Enum<class07445> {
    public static final /* enum */ class07445 field_51885 = new class07445();
    public static final /* enum */ class07445 field_51886 = new class07445();
    public static final /* enum */ class07445 field_51887 = new class07445();
    private static final /* synthetic */ class07445[] field_51888;

    public static class07445[] values() {
        return (class07445[])field_51888.clone();
    }

    public static class07445 valueOf(String string) {
        return Enum.valueOf(class07445.class, string);
    }

    private static /* synthetic */ class07445[] N() {
        return new class07445[]{field_51885, field_51886, field_51887};
    }

    public class06541 N(boolean bl) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (bl) {
                    yield class06541.field_1078;
                }
                yield class06541.field_1061;
            }
            case 1 -> class06541.field_1080;
            case 2 -> bl ? class06541.field_1061 : class06541.field_1078;
        };
    }

    static {
        field_51888 = class07445.N();
    }
}

