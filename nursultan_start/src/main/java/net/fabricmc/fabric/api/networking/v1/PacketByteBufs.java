/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  minecraft.class00667
 */
package net.fabricmc.fabric.api.networking.v1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.Objects;
import minecraft.class00667;

public final class PacketByteBufs {
    private static final class00667 EMPTY_PACKET_BYTE_BUF = new class00667(Unpooled.EMPTY_BUFFER);

    public static class00667 create() {
        return new class00667(Unpooled.buffer());
    }

    private PacketByteBufs() {
    }

    public static class00667 empty() {
        return EMPTY_PACKET_BYTE_BUF;
    }

    public static class00667 copy(ByteBuf byteBuf) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.copy());
    }

    public static class00667 copy(ByteBuf byteBuf, int n, int n2) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.copy(n, n2));
    }

    public static class00667 slice(ByteBuf byteBuf) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.slice());
    }

    public static class00667 slice(ByteBuf byteBuf, int n, int n2) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.slice(n, n2));
    }

    public static class00667 duplicate(ByteBuf byteBuf) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.duplicate());
    }

    public static class00667 readBytes(ByteBuf byteBuf, int n) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.readBytes(n));
    }

    public static class00667 readRetainedSlice(ByteBuf byteBuf, int n) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.readRetainedSlice(n));
    }

    public static class00667 retainedSlice(ByteBuf byteBuf) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.retainedSlice());
    }

    public static class00667 retainedSlice(ByteBuf byteBuf, int n, int n2) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.retainedSlice(n, n2));
    }

    public static class00667 retainedDuplicate(ByteBuf byteBuf) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.retainedDuplicate());
    }

    public static class00667 readSlice(ByteBuf byteBuf, int n) {
        Objects.requireNonNull(byteBuf, "ByteBuf cannot be null");
        return new class00667(byteBuf.readSlice(n));
    }
}

