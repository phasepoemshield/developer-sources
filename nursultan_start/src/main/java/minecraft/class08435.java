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

public final class class08435
extends Enum<class08435>
implements class05033 {
    public static final /* enum */ class08435 field_56542 = new class08435("normal");
    public static final /* enum */ class08435 field_56543 = new class08435("cold");
    public static final Codec<class08435> field_56544;
    private final String field_56545;
    private static final /* synthetic */ class08435[] field_56546;

    private class08435(String string2) {
        this.field_56545 = string2;
    }

    public static class08435[] values() {
        return (class08435[])field_56546.clone();
    }

    public static class08435 valueOf(String string) {
        return Enum.valueOf(class08435.class, string);
    }

    private static /* synthetic */ class08435[] N() {
        return new class08435[]{field_56542, field_56543};
    }

    public String method_15434() {
        return this.field_56545;
    }

    static {
        field_56546 = class08435.N();
        field_56544 = class05033.N(class08435::values);
    }
}

