/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class05033;

public final class class03679
extends Enum<class03679>
implements class05033 {
    public static final /* enum */ class03679 field_42406 = new class03679(0, "fixed");
    public static final /* enum */ class03679 field_42407 = new class03679(1, "vertical");
    public static final /* enum */ class03679 field_42408 = new class03679(2, "horizontal");
    public static final /* enum */ class03679 field_42409 = new class03679(3, "center");
    public static final Codec<class03679> field_42410;
    public static final IntFunction<class03679> field_42411;
    private final byte field_42412;
    private final String field_42413;
    private static final /* synthetic */ class03679[] field_42414;

    private class03679(byte by, String string2) {
        this.field_42413 = string2;
        this.field_42412 = by;
    }

    static {
        field_42414 = class03679.y();
        field_42410 = class05033.N(class03679::values);
        field_42411 = class02121.N(class03679::N, (Object[])class03679.values(), (class02126)class02126.field_41664);
    }

    public static class03679[] values() {
        return (class03679[])field_42414.clone();
    }

    public static class03679 valueOf(String string) {
        return Enum.valueOf(class03679.class, string);
    }

    private static /* synthetic */ class03679[] y() {
        return new class03679[]{field_42406, field_42407, field_42408, field_42409};
    }

    byte N() {
        return this.field_42412;
    }

    public String method_15434() {
        return this.field_42413;
    }
}

