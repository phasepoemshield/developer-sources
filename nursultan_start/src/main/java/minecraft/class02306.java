/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;

public final class class02306
extends Enum<class02306>
implements class05033 {
    public static final /* enum */ class02306 field_49112 = new class02306("uniform");
    public static final /* enum */ class02306 field_49113 = new class02306("jp");
    public static final Codec<class02306> field_49114;
    private final String field_49115;
    private static final /* synthetic */ class02306[] field_49116;

    private class02306(String string2) {
        this.field_49115 = string2;
    }

    public static class02306[] values() {
        return (class02306[])field_49116.clone();
    }

    public static class02306 valueOf(String string) {
        return Enum.valueOf(class02306.class, string);
    }

    private static /* synthetic */ class02306[] N() {
        return new class02306[]{field_49112, field_49113};
    }

    public String method_15434() {
        return this.field_49115;
    }

    static {
        field_49116 = class02306.N();
        field_49114 = class05033.N(class02306::values);
    }
}

