/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class03249
 */
package minecraft;

import minecraft.class03249;

public final class class03287
extends Enum<class03287> {
    public static final /* enum */ class03287 field_41822 = new class03287();
    public static final /* enum */ class03287 field_41823 = new class03287();
    private static final /* synthetic */ class03287[] field_41824;

    public class03249 L() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class03249.field_41828;
            case 1 -> class03249.field_41826;
        };
    }

    static {
        field_41824 = class03287.u();
    }

    public static class03287[] values() {
        return (class03287[])field_41824.clone();
    }

    public static class03287 valueOf(String string) {
        return Enum.valueOf(class03287.class, string);
    }

    private static /* synthetic */ class03287[] u() {
        return new class03287[]{field_41822, field_41823};
    }

    public class03249 y() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class03249.field_41829;
            case 1 -> class03249.field_41827;
        };
    }

    public class03287 N() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> field_41823;
            case 1 -> field_41822;
        };
    }

    public class03249 N(boolean bl) {
        return bl ? this.y() : this.L();
    }
}

