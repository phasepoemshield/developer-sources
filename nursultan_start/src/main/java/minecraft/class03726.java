/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  java.util.HexFormat
 */
package minecraft;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HexFormat;

public final class class03726
extends Record {
    private final int width;
    private final int height;
    private static final HexFormat L = HexFormat.of().withUpperCase().withPrefix("0x");
    private static final long u = -8552249625308161526L;
    private static final int i = 1229472850;
    private static final int R = 13;

    public class03726(int n, int n2) {
        this.width = n;
        this.height = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03726.class, "width;height", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03726.class, "width;height", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03726.class, "width;height", "width", "height"}, this);
    }

    public int y() {
        return this.height;
    }

    public static class03726 N(byte[] byArray) throws IOException {
        return class03726.N(new ByteArrayInputStream(byArray));
    }

    public int N() {
        return this.width;
    }

    public static void N(ByteBuffer byteBuffer) throws IOException {
        ByteOrder byteOrder = byteBuffer.order();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        if (byteBuffer.limit() < 16) {
            throw new IOException("PNG header missing");
        }
        if (byteBuffer.getLong(0) != -8552249625308161526L) {
            throw new IOException("Bad PNG Signature");
        }
        if (byteBuffer.getInt(8) != 13) {
            throw new IOException("Bad length for IHDR chunk!");
        }
        if (byteBuffer.getInt(12) != 1229472850) {
            throw new IOException("Bad type for IHDR chunk!");
        }
        byteBuffer.order(byteOrder);
    }

    public static class03726 N(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        long l = dataInputStream.readLong();
        if (l != -8552249625308161526L) {
            throw new IOException("Bad PNG Signature: " + L.toHexDigits(l));
        }
        int n = dataInputStream.readInt();
        if (n != 13) {
            throw new IOException("Bad length for IHDR chunk: " + n);
        }
        int n2 = dataInputStream.readInt();
        if (n2 != 1229472850) {
            throw new IOException("Bad type for IHDR chunk: " + L.toHexDigits(n2));
        }
        int n3 = dataInputStream.readInt();
        int n4 = dataInputStream.readInt();
        return new class03726(n3, n4);
    }
}

