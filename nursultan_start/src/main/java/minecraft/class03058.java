/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.BitSet;
import minecraft.class00667;
import minecraft.class03048;

public final class class03058
extends Record {
    private final int offset;
    private final BitSet acknowledged;
    private final byte checksum;
    public static final byte N = 0;

    public byte L() {
        return this.checksum;
    }

    public class03058(class00667 class006672) {
        this(class006672.E(), class006672.i(20), class006672.readByte());
    }

    public class03058(int n, BitSet bitSet, byte by) {
        this.offset = n;
        this.acknowledged = bitSet;
        this.checksum = by;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03058.class, "offset;acknowledged;checksum", "offset", "acknowledged", "checksum"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03058.class, "offset;acknowledged;checksum", "offset", "acknowledged", "checksum"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03058.class, "offset;acknowledged;checksum", "offset", "acknowledged", "checksum"}, this);
    }

    public BitSet y() {
        return this.acknowledged;
    }

    public void N(class00667 class006672) {
        class006672.L(this.offset);
        class006672.N(this.acknowledged, 20);
        class006672.writeByte((int)this.checksum);
    }

    public boolean N(class03048 class030482) {
        return this.checksum == 0 || this.checksum == class030482.N();
    }

    public int N() {
        return this.offset;
    }
}

