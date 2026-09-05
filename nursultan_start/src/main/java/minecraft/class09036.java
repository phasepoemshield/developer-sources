/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01652
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02885
 *  minecraft.class02897
 *  minecraft.class07709
 *  minecraft.class07726
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class01652;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02885;
import minecraft.class02897;
import minecraft.class07709;
import minecraft.class07726;

public final class class09036
extends Record
implements class00381<class01652> {
    private final class01894 id;
    private final Optional<class07709> payload;
    private static final class02362<ByteBuf, Optional<class07709>> u = class02389.N_35(() -> new class07726(32768L, 16)).N_33(class02389.u((int)65536));
    public static final class02362<ByteBuf, class09036> N = class02362.N((class02362)class01894.y, class09036::N, u, class09036::y, class09036::new);

    public class09036(class01894 class018942, Optional<class07709> optional) {
        this.id = class018942;
        this.payload = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09036.class, "id;payload", "id", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09036.class, "id;payload", "id", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09036.class, "id;payload", "id", "payload"}, this);
    }

    public Optional<class07709> y() {
        return this.payload;
    }

    public void method_65081(class01652 class016522) {
        class016522.method_71953(this);
    }

    public class01894 N() {
        return this.id;
    }

    public class02897<class09036> method_65080() {
        return class02885.j;
    }
}

