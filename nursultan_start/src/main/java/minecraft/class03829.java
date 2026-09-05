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
import minecraft.class03808;
import minecraft.class03822;
import minecraft.class03825;
import minecraft.class03827;
import minecraft.class05033;

public abstract class class03829
extends Enum<class03829>
implements class05033 {
    public static final /* enum */ class03829 field_47790 = new class03808("IDLE", 0, "idle", false, 0, 0);
    public static final /* enum */ class03829 field_47791 = new class03827("ROLLING", 1, "rolling", true, 10, 1);
    public static final /* enum */ class03829 field_47792 = new class03822("SCARED", 2, "scared", true, 50, 2);
    public static final /* enum */ class03829 field_49084 = new class03825("UNROLLING", 3, "unrolling", true, 30, 3);
    static final Codec<class03829> field_47794;
    private static final IntFunction<class03829> field_48336;
    public static final class02362<ByteBuf, class03829> field_48335;
    private final String field_47793;
    private final boolean field_49085;
    private final int field_49086;
    private final int field_48337;
    private static final /* synthetic */ class03829[] field_47795;

    private int L() {
        return this.field_48337;
    }

    class03829(String string2, boolean bl, int n2, int n3) {
        this.field_47793 = string2;
        this.field_49085 = bl;
        this.field_49086 = n2;
        this.field_48337 = n3;
    }

    public static class03829[] values() {
        return (class03829[])field_47795.clone();
    }

    public static class03829 valueOf(String string) {
        return Enum.valueOf(class03829.class, string);
    }

    private static /* synthetic */ class03829[] u() {
        return new class03829[]{field_47790, field_47791, field_47792, field_49084};
    }

    public int y() {
        return this.field_49086;
    }

    public abstract boolean N(long var1);

    public boolean N() {
        return this.field_49085;
    }

    public String method_15434() {
        return this.field_47793;
    }

    static {
        field_47795 = class03829.u();
        field_47794 = class05033.N(class03829::values);
        field_48336 = class02121.N(class03829::L, (Object[])class03829.values(), (class02126)class02126.field_41664);
        field_48335 = class02389.N(field_48336, class03829::L);
    }
}

