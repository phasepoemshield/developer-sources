package ru.ocz.protection.runtime.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class BufferUtils {
    public static ByteBuffer setup(ByteBuffer b2) {
        return b2.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static byte[] toByteArray(ByteBuffer b2) {
        byte[] d2 = new byte[b2.limit()];
        b2.get(d2);
        return d2;
    }

    public static void replace(ByteBuffer b2, byte[] d2) {
        b2.clear();
        b2.put(d2);
    }
}