/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;

public final class class07463
extends Enum<class07463>
implements class05033 {
    public static final /* enum */ class07463 field_6328 = new class07463("add_value", 0);
    public static final /* enum */ class07463 field_6330 = new class07463("add_multiplied_base", 1);
    public static final /* enum */ class07463 field_6331 = new class07463("add_multiplied_total", 2);
    public static final IntFunction<class07463> field_48325;
    public static final class02362<ByteBuf, class07463> field_48326;
    public static final Codec<class07463> field_45742;
    private final String field_45743;
    private final int field_6329;
    private static final /* synthetic */ class07463[] field_6333;

    private class07463(String string2, int n2) {
        this.field_45743 = string2;
        this.field_6329 = n2;
    }

    public static class07463[] values() {
        return (class07463[])field_6333.clone();
    }

    public static class07463 valueOf(String string) {
        return Enum.valueOf(class07463.class, string);
    }

    private static /* synthetic */ class07463[] y() {
        return new class07463[]{field_6328, field_6330, field_6331};
    }

    public int N() {
        return this.field_6329;
    }

    public String method_15434() {
        return this.field_45743;
    }

    static {
        field_6333 = class07463.y();
        field_48325 = class02121.N(class07463::N, (Object[])class07463.values(), (class02126)class02126.field_41664);
        field_48326 = class02389.N(field_48325, class07463::N);
        field_45742 = class05033.N(class07463::values);
    }
}

