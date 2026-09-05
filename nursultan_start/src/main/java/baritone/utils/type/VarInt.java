/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 */
package baritone.utils.type;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;

public final class VarInt {
    private final int value;
    private final byte[] serialized;
    private final int size;

    public final int getSize() {
        return this.size;
    }

    public VarInt(int n) {
        this.value = n;
        this.serialized = VarInt.serialize0(this.value);
        this.size = this.serialized.length;
    }

    public final int getValue() {
        return this.value;
    }

    public static VarInt read(byte[] byArray) {
        return VarInt.read(byArray, 0);
    }

    public static VarInt read(byte[] byArray, int n) {
        byte by;
        int n2 = 0;
        int n3 = 0;
        int n4 = n;
        do {
            by = byArray[n4++];
            n2 |= (by & 0x7F) << n3++ * 7;
            if (n3 <= 5) continue;
            throw new IllegalArgumentException("VarInt size cannot exceed 5 bytes");
        } while ((by & 0x80) != 0);
        return new VarInt(n2);
    }

    public final byte[] serialize() {
        return this.serialized;
    }

    private static byte[] serialize0(int n) {
        ByteArrayList byteArrayList = new ByteArrayList();
        int n2 = n;
        while ((n2 & 0x80) != 0) {
            byteArrayList.add((byte)(n2 & 0x7F | 0x80));
            n2 >>>= 7;
        }
        byteArrayList.add((byte)(n2 & 0xFF));
        return byteArrayList.toByteArray();
    }
}

