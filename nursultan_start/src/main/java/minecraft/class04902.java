/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;
import minecraft.class06338;

public final class class04902
extends Enum<class04902>
implements class05033 {
    public static final /* enum */ class04902 field_14532 = new class04902("warm");
    public static final /* enum */ class04902 field_14528 = new class04902("cold");
    public static final Codec<class04902> field_24990;
    @Deprecated
    public static final Codec<class04902> field_56682;
    private final String field_14529;
    private static final /* synthetic */ class04902[] field_14531;

    private class04902(String string2) {
        this.field_14529 = string2;
    }

    public static class04902[] values() {
        return (class04902[])field_14531.clone();
    }

    public static class04902 valueOf(String string) {
        return Enum.valueOf(class04902.class, string);
    }

    private static /* synthetic */ class04902[] y() {
        return new class04902[]{field_14532, field_14528};
    }

    public String N() {
        return this.field_14529;
    }

    public String method_15434() {
        return this.field_14529;
    }

    static {
        field_14531 = class04902.y();
        field_24990 = class05033.N(class04902::values);
        field_56682 = class06338.L(class04902::valueOf);
    }
}

