/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00005
 *  minecraft.class00016
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import minecraft.class00005;
import minecraft.class00016;
import minecraft.class00037;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;

final class class00039
extends Enum<class00039> {
    public static final /* enum */ class00039 field_59613 = new class00039(class00016::L);
    public static final /* enum */ class00039 field_59614 = new class00039(class00016::N);
    public static final /* enum */ class00039 field_59615 = new class00039(class00016::y);
    final BiConsumer<class00005, class00037> field_59618;
    public static final IntFunction<class00039> field_59616;
    public static final class02362<ByteBuf, class00039> field_59617;
    private static final /* synthetic */ class00039[] field_59619;

    private class00039(BiConsumer<class00005, class00037> biConsumer) {
        this.field_59618 = biConsumer;
    }

    static {
        field_59619 = class00039.N();
        field_59616 = class02121.N(Enum::ordinal, (Object[])class00039.values(), (class02126)class02126.field_41665);
        field_59617 = class02389.N(field_59616, Enum::ordinal);
    }

    public static class00039[] values() {
        return (class00039[])field_59619.clone();
    }

    public static class00039 valueOf(String string) {
        return Enum.valueOf(class00039.class, string);
    }

    private static /* synthetic */ class00039[] N() {
        return new class00039[]{field_59613, field_59614, field_59615};
    }
}

