/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00380
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import minecraft.class00380;
import minecraft.class00391;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class05033;

public final class class00425
extends Enum<class00425>
implements class05033 {
    public static final /* enum */ class00425 field_24342 = new class00425("show_text", true, class00401.y);
    public static final /* enum */ class00425 field_24343 = new class00425("show_item", true, (MapCodec<? extends class00395>)class00380.y);
    public static final /* enum */ class00425 field_24344 = new class00425("show_entity", true, class00391.y);
    public static final Codec<class00425> field_46603;
    public static final Codec<class00425> field_46604;
    private final String field_24346;
    private final boolean field_24347;
    final MapCodec<? extends class00395> field_46605;
    private static final /* synthetic */ class00425[] field_55910;

    private class00425(String string2, boolean bl, MapCodec<? extends class00395> mapCodec) {
        this.field_24346 = string2;
        this.field_24347 = bl;
        this.field_46605 = mapCodec;
    }

    public String toString() {
        return "<action " + this.field_24346 + ">";
    }

    public static class00425[] values() {
        return (class00425[])field_55910.clone();
    }

    public static class00425 valueOf(String string) {
        return Enum.valueOf(class00425.class, string);
    }

    private static /* synthetic */ class00425[] y() {
        return new class00425[]{field_24342, field_24343, field_24344};
    }

    public boolean N() {
        return this.field_24347;
    }

    private static DataResult<class00425> N(class00425 class004252) {
        if (!class004252.N()) {
            return DataResult.error(() -> "Action not allowed: " + String.valueOf((Object)class004252));
        }
        return DataResult.success((Object)((Object)class004252), (Lifecycle)Lifecycle.stable());
    }

    public String method_15434() {
        return this.field_24346;
    }

    static {
        field_55910 = class00425.y();
        field_46603 = class05033.y(class00425::values);
        field_46604 = field_46603.validate(class00425::N);
    }
}

