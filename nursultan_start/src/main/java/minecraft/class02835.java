/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 *  minecraft.class05216
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;
import minecraft.class05216;

public final class class02835
extends Enum<class02835>
implements class05033 {
    public static final /* enum */ class02835 field_7976 = new class02835(0, "small_ball");
    public static final /* enum */ class02835 field_7977 = new class02835(1, "large_ball");
    public static final /* enum */ class02835 field_7973 = new class02835(2, "star");
    public static final /* enum */ class02835 field_7974 = new class02835(3, "creeper");
    public static final /* enum */ class02835 field_7970 = new class02835(4, "burst");
    private static final IntFunction<class02835> field_7975;
    public static final class02362<ByteBuf, class02835> field_49321;
    public static final Codec<class02835> field_49322;
    private final int field_7972;
    private final String field_7971;
    private static final /* synthetic */ class02835[] field_7978;

    private static /* synthetic */ class02835[] L() {
        return new class02835[]{field_7976, field_7977, field_7973, field_7974, field_7970};
    }

    private class02835(int n2, String string2) {
        this.field_7972 = n2;
        this.field_7971 = string2;
    }

    public static class02835[] values() {
        return (class02835[])field_7978.clone();
    }

    public static class02835 valueOf(String string) {
        return Enum.valueOf(class02835.class, string);
    }

    public int y() {
        return this.field_7972;
    }

    public class05216 N() {
        return class00392.L((String)("item.minecraft.firework_star.shape." + this.field_7971));
    }

    public static class02835 N(int n) {
        return field_7975.apply(n);
    }

    public String method_15434() {
        return this.field_7971;
    }

    static {
        field_7978 = class02835.L();
        field_7975 = class02121.N(class02835::y, (Object[])class02835.values(), (class02126)class02126.field_41664);
        field_49321 = class02389.N(field_7975, class02835::y);
        field_49322 = class05033.y(class02835::values);
    }
}

