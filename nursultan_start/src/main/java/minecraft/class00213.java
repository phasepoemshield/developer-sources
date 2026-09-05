/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04782
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class04782;
import minecraft.class05033;

public final class class00213
extends Enum<class00213>
implements class05033 {
    public static final /* enum */ class00213 field_56208 = new class00213("clear", 100000, 0, false, false);
    public static final /* enum */ class00213 field_56209 = new class00213("rain", 0, 100000, true, false);
    public static final /* enum */ class00213 field_56210 = new class00213("thunder", 0, 100000, true, true);
    public static final Codec<class00213> field_56211;
    private final String field_56212;
    private final int field_56213;
    private final int field_56214;
    private final boolean field_56215;
    private final boolean field_56216;
    private static final /* synthetic */ class00213[] field_56217;

    private class00213(String string2, int n2, int n3, boolean bl, boolean bl2) {
        this.field_56212 = string2;
        this.field_56213 = n2;
        this.field_56214 = n3;
        this.field_56215 = bl;
        this.field_56216 = bl2;
    }

    public static class00213[] values() {
        return (class00213[])field_56217.clone();
    }

    public static class00213 valueOf(String string) {
        return Enum.valueOf(class00213.class, string);
    }

    void N(class04782 class047822) {
        class047822.method_27910(this.field_56213, this.field_56214, this.field_56215, this.field_56216);
    }

    private static /* synthetic */ class00213[] N() {
        return new class00213[]{field_56208, field_56209, field_56210};
    }

    public String method_15434() {
        return this.field_56212;
    }

    static {
        field_56217 = class00213.N();
        field_56211 = class05033.N(class00213::values);
    }
}

