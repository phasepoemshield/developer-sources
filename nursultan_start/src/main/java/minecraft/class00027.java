/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00007
 *  minecraft.class00023
 *  minecraft.class00667
 *  minecraft.class00945
 *  minecraft.class07049
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import minecraft.class00007;
import minecraft.class00023;
import minecraft.class00025;
import minecraft.class00028;
import minecraft.class00036;
import minecraft.class00037;
import minecraft.class00667;
import minecraft.class00945;
import minecraft.class07049;
import minecraft.class07299;

class class00027
extends class00037 {
    public class00027(Either<UUID, String> either, class00028 class000282, class00667 class006672) {
        super(either, class000282, class00025.field_59778);
    }

    class00027(UUID uUID) {
        super((Either<UUID, String>)Either.left((Object)uUID), class00028.L, class00025.field_59778);
    }

    @Override
    public void y(ByteBuf byteBuf) {
    }

    @Override
    public double N(class07049 class070492) {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public class00036 N(class07299 class072992, class00007 class000072, class00945 class009452) {
        return class00036.field_60423;
    }

    @Override
    public double N(class07299 class072992, class00023 class000232, class00945 class009452) {
        return Double.NaN;
    }

    @Override
    public void N(class00037 class000372) {
    }
}

