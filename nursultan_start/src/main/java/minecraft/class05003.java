/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  it.unimi.dsi.fastutil.bytes.ByteArrays
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 */
package minecraft;

import com.google.common.primitives.Longs;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;

public final class class05003
extends Record {
    private final long salt;
    private final byte[] signature;
    public static final class05003 N = new class05003(0L, ByteArrays.EMPTY_ARRAY);

    public long L() {
        return this.salt;
    }

    public class05003(class00667 class006672) {
        this(class006672.readLong(), class006672.y());
    }

    public class05003(long l, byte[] byArray) {
        this.salt = l;
        this.signature = byArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05003.class, "salt;signature", "salt", "signature"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05003.class, "salt;signature", "salt", "signature"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05003.class, "salt;signature", "salt", "signature"}, this);
    }

    public byte[] u() {
        return this.signature;
    }

    public byte[] y() {
        return Longs.toByteArray((long)this.salt);
    }

    public static void N(class00667 class006672, class05003 class050032) {
        class006672.writeLong(class050032.salt);
        class006672.N(class050032.signature);
    }

    public boolean N() {
        return this.signature.length > 0;
    }
}

