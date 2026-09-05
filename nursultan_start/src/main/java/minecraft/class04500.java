/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07107
 *  minecraft.class07134
 */
package minecraft;

import minecraft.class07107;
import minecraft.class07134;

public final class class04500
extends Enum<class04500> {
    public static final /* enum */ class04500 field_50186 = new class04500(class07107.J);
    public static final /* enum */ class04500 field_50187 = new class04500(class07107.X);
    public final class07134 field_50188;
    private static final /* synthetic */ class04500[] field_50189;

    private class04500(class07134 class071342) {
        this.field_50188 = class071342;
    }

    static {
        field_50189 = class04500.y();
    }

    public static class04500[] values() {
        return (class04500[])field_50189.clone();
    }

    public static class04500 valueOf(String string) {
        return Enum.valueOf(class04500.class, string);
    }

    private static /* synthetic */ class04500[] y() {
        return new class04500[]{field_50186, field_50187};
    }

    public int N() {
        return this.ordinal();
    }

    public static class04500 N(int n) {
        class04500[] class04500Array = class04500.values();
        if (n > class04500Array.length || n < 0) {
            return field_50186;
        }
        return class04500Array[n];
    }
}

