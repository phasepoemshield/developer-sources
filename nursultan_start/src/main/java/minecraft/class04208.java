/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.function.Function;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;
import org.jspecify.annotations.Nullable;

public final class class04208
extends Enum<class04208>
implements class05033 {
    public static final /* enum */ class04208 field_41122 = new class04208("slim", "slim");
    public static final /* enum */ class04208 field_41123 = new class04208("wide", "default");
    public static final Codec<class04208> field_62533;
    private static final Function<String, class04208> field_62913;
    public static final class02362<ByteBuf, class04208> field_62534;
    private final String field_41124;
    private final String field_62914;
    private static final /* synthetic */ class04208[] field_41125;

    private class04208(String string2, String string3) {
        this.field_41124 = string2;
        this.field_62914 = string3;
    }

    public static class04208[] values() {
        return (class04208[])field_41125.clone();
    }

    public static class04208 valueOf(String string) {
        return Enum.valueOf(class04208.class, string);
    }

    private static /* synthetic */ class04208[] N() {
        return new class04208[]{field_41122, field_41123};
    }

    public static class04208 N(@Nullable String string) {
        return Objects.requireNonNullElse(field_62913.apply(string), field_41123);
    }

    public String method_15434() {
        return this.field_41124;
    }

    static {
        field_41125 = class04208.N();
        field_62533 = class05033.N(class04208::values);
        field_62913 = class05033.N((Object[])class04208.values(), class042082 -> class042082.field_62914);
        field_62534 = class02389.y.N_10(bl -> bl != false ? field_41122 : field_41123, class042082 -> class042082 == field_41122);
    }
}

