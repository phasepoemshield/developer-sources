/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.util.UndashedUuid
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.util.UndashedUuid;
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import java.util.stream.IntStream;
import minecraft.class01516;
import minecraft.class02362;
import minecraft.class07536;

public final class class01487 {
    public static final Codec<UUID> N = Codec.INT_STREAM.comapFlatMap(intStream -> class07536.N((IntStream)intStream, (int)4).map(class01487::N), uUID -> Arrays.stream(class01487.N(uUID)));
    public static final Codec<Set<UUID>> y = Codec.list(N).xmap(Sets::newHashSet, Lists::newArrayList);
    public static final Codec<Set<UUID>> L = Codec.list(N).xmap(Sets::newLinkedHashSet, Lists::newArrayList);
    public static final Codec<UUID> u = Codec.STRING.comapFlatMap(string -> {
        try {
            return DataResult.success((Object)UUID.fromString(string), (Lifecycle)Lifecycle.stable());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return DataResult.error(() -> "Invalid UUID " + string + ": " + illegalArgumentException.getMessage());
        }
    }, UUID::toString);
    public static final Codec<UUID> i = Codec.withAlternative((Codec)Codec.STRING.comapFlatMap(string -> {
        try {
            return DataResult.success((Object)UndashedUuid.fromStringLenient((String)string), (Lifecycle)Lifecycle.stable());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return DataResult.error(() -> "Invalid UUID " + string + ": " + illegalArgumentException.getMessage());
        }
    }, UndashedUuid::toString), N);
    public static final Codec<UUID> R = Codec.withAlternative(N, u);
    public static final class02362<ByteBuf, UUID> M = new class01516();
    public static final int B = 16;
    private static final String Z = "OfflinePlayer:";

    private class01487() {
    }

    public static GameProfile y(String string) {
        UUID uUID = class01487.N(string);
        return new GameProfile(uUID, string);
    }

    public static byte[] y(UUID uUID) {
        byte[] byArray = new byte[16];
        ByteBuffer.wrap(byArray).order(ByteOrder.BIG_ENDIAN).putLong(uUID.getMostSignificantBits()).putLong(uUID.getLeastSignificantBits());
        return byArray;
    }

    private static int[] N(long l, long l2) {
        return new int[]{(int)(l >> 32), (int)l, (int)(l2 >> 32), (int)l2};
    }

    public static UUID N(int[] nArray) {
        return new UUID((long)nArray[0] << 32 | (long)nArray[1] & 0xFFFFFFFFL, (long)nArray[2] << 32 | (long)nArray[3] & 0xFFFFFFFFL);
    }

    public static UUID N(Dynamic<?> dynamic) {
        int[] nArray = dynamic.asIntStream().toArray();
        if (nArray.length != 4) {
            throw new IllegalArgumentException("Could not read UUID. Expected int-array of length 4, got " + nArray.length + ".");
        }
        return class01487.N(nArray);
    }

    public static UUID N(String string) {
        return UUID.nameUUIDFromBytes((Z + string).getBytes(StandardCharsets.UTF_8));
    }

    public static int[] N(UUID uUID) {
        long l = uUID.getMostSignificantBits();
        long l2 = uUID.getLeastSignificantBits();
        return class01487.N(l, l2);
    }
}

