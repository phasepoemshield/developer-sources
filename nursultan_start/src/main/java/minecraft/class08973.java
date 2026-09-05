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

public final class class08973
extends Enum<class08973>
implements class05033 {
    public static final /* enum */ class08973 field_61414 = new class08973("standing");
    public static final /* enum */ class08973 field_61415 = new class08973("sitting");
    public static final /* enum */ class08973 field_61416 = new class08973("running");
    public static final /* enum */ class08973 field_61417 = new class08973("star");
    public static final IntFunction<class08973> field_61418;
    public static final Codec<class08973> field_61419;
    private final String field_61420;
    private static final /* synthetic */ class08973[] field_61421;

    private class08973(String string2) {
        this.field_61420 = string2;
    }

    public static class08973[] values() {
        return (class08973[])field_61421.clone();
    }

    public static class08973 valueOf(String string) {
        return Enum.valueOf(class08973.class, string);
    }

    private static /* synthetic */ class08973[] y() {
        return new class08973[]{field_61414, field_61415, field_61416, field_61417};
    }

    public class08973 N() {
        return field_61418.apply(this.ordinal() + 1);
    }

    public String method_15434() {
        return this.field_61420;
    }

    static {
        field_61421 = class08973.y();
        field_61418 = class02121.N(Enum::ordinal, (Object[])class08973.values(), (class02126)class02126.field_41664);
        field_61419 = class05033.N(class08973::values);
    }
}

