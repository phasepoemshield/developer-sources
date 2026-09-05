/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01662
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01662;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02885;
import minecraft.class02897;

public final class class02872
extends Record
implements class00381<class01662> {
    private final class01894 key;
    private final byte[] payload;
    public static final class02362<class00667, class02872> N = class00381.N(class02872::N, class02872::new);
    private static final int i = 5120;
    public static final class02362<ByteBuf, byte[]> y = class02389.N((int)5120);

    private class02872(class00667 class006672) {
        this(class006672.T(), (byte[])y.decode((Object)class006672));
    }

    public class02872(class01894 class018942, byte[] byArray) {
        this.key = class018942;
        this.payload = byArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02872.class, "key;payload", "key", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02872.class, "key;payload", "key", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02872.class, "key;payload", "key", "payload"}, this);
    }

    public byte[] y() {
        return this.payload;
    }

    private void N(class00667 class006672) {
        class006672.N(this.key);
        y.encode((Object)class006672, (Object)this.payload);
    }

    public class01894 N() {
        return this.key;
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public class02897<class02872> method_65080() {
        return class02885.U;
    }
}

