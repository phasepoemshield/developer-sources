/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.MatchException
 *  minecraft.class05033
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;
import minecraft.class07299;

public final class class00617
extends Enum<class00617>
implements class05033 {
    public static final /* enum */ class00617 field_63706 = new class00617("always");
    public static final /* enum */ class00617 field_63707 = new class00617("when_dark");
    public static final /* enum */ class00617 field_63708 = new class00617("never");
    public static final Codec<class00617> field_63709;
    private final String field_63710;
    private static final /* synthetic */ class00617[] field_63711;

    private class00617(String string2) {
        this.field_63710 = string2;
    }

    public static class00617[] values() {
        return (class00617[])field_63711.clone();
    }

    public static class00617 valueOf(String string) {
        return Enum.valueOf(class00617.class, string);
    }

    public boolean N(class07299 class072992) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> true;
            case 1 -> class072992.method_23886();
            case 2 -> false;
        };
    }

    private static /* synthetic */ class00617[] N() {
        return new class00617[]{field_63706, field_63707, field_63708};
    }

    public String method_15434() {
        return this.field_63710;
    }

    static {
        field_63711 = class00617.N();
        field_63709 = class05033.N(class00617::values);
    }
}

