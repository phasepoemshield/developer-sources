/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05031
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00069;
import minecraft.class00071;
import minecraft.class00076;
import minecraft.class00078;
import minecraft.class00079;
import minecraft.class00085;
import minecraft.class00087;
import minecraft.class00088;
import minecraft.class05031;
import minecraft.class05033;

public final class class00051
extends Enum<class00051>
implements class05033 {
    public static final /* enum */ class00051 field_60135 = new class00051("int", class00079.y);
    public static final /* enum */ class00051 field_60136 = new class00051("ivec3", class00087.y);
    public static final /* enum */ class00051 field_60137 = new class00051("float", class00076.y);
    public static final /* enum */ class00051 field_60138 = new class00051("vec2", class00078.y);
    public static final /* enum */ class00051 field_60139 = new class00051("vec3", class00071.y);
    public static final /* enum */ class00051 field_60140 = new class00051("vec4", class00088.y);
    public static final /* enum */ class00051 field_60141 = new class00051("matrix4x4", class00085.y);
    public static final class05031<class00051> field_60142;
    private final String field_60143;
    final MapCodec<? extends class00069> field_60144;
    private static final /* synthetic */ class00051[] field_60145;

    private class00051(String string2, Codec<? extends class00069> codec) {
        this.field_60143 = string2;
        this.field_60144 = codec.fieldOf("value");
    }

    public static class00051[] values() {
        return (class00051[])field_60145.clone();
    }

    public static class00051 valueOf(String string) {
        return Enum.valueOf(class00051.class, string);
    }

    private static /* synthetic */ class00051[] N() {
        return new class00051[]{field_60135, field_60136, field_60137, field_60138, field_60139, field_60140, field_60141};
    }

    public String method_15434() {
        return this.field_60143;
    }

    static {
        field_60145 = class00051.N();
        field_60142 = class05033.N(class00051::values);
    }
}

