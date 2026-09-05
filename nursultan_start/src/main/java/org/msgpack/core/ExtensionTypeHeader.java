/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import org.msgpack.core.Preconditions;

public class ExtensionTypeHeader {
    private final byte type;
    private final int length;

    public ExtensionTypeHeader(byte by, int n) {
        Preconditions.checkArgument(n >= 0, "length must be >= 0");
        this.type = by;
        this.length = n;
    }

    public static byte checkedCastToByte(int n) {
        Preconditions.checkArgument(-128 <= n && n <= 127, "Extension type code must be within the range of byte");
        return (byte)n;
    }

    public byte getType() {
        return this.type;
    }

    public boolean isTimestampType() {
        return this.type == -1;
    }

    public int getLength() {
        return this.length;
    }

    public int hashCode() {
        return (this.type + 31) * 31 + this.length;
    }

    public boolean equals(Object object) {
        if (object instanceof ExtensionTypeHeader) {
            ExtensionTypeHeader extensionTypeHeader = (ExtensionTypeHeader)object;
            return this.type == extensionTypeHeader.type && this.length == extensionTypeHeader.length;
        }
        return false;
    }

    public String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", this.type, this.length);
    }
}

