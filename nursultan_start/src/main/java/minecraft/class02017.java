/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class07709
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class07709;

public final class class02017
extends Record {
    private final class01894 id;
    private final Optional<class07709> data;
    public static final class02362<ByteBuf, class02017> N = class02362.N((class02362)class01894.y, class02017::N, (class02362)class02389.T.N_33(class02389::N), class02017::y, class02017::new);

    public class02017(class01894 class018942, Optional<class07709> optional) {
        this.id = class018942;
        this.data = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02017.class, "id;data", "id", "data"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02017.class, "id;data", "id", "data"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02017.class, "id;data", "id", "data"}, this);
    }

    public Optional<class07709> y() {
        return this.data;
    }

    public class01894 N() {
        return this.id;
    }
}

