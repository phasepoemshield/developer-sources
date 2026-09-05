/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class07209
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class07209;

public final class class00433
extends Record {
    private final Optional<class07209> hivePos;
    private final Optional<class07209> flowerPos;
    private final int travelTicks;
    private final List<class07209> blacklistedHives;
    public static final class02362<ByteBuf, class00433> N = class02362.N((class02362)class07209.field_48404.N_33(class02389::N), class00433::N, (class02362)class07209.field_48404.N_33(class02389::N), class00433::y, (class02362)class02389.B, class00433::L, (class02362)class07209.field_48404.N_33(class02389.N()), class00433::u, class00433::new);

    public int L() {
        return this.travelTicks;
    }

    public class00433(Optional<class07209> optional, Optional<class07209> optional2, int n, List<class07209> list) {
        this.hivePos = optional;
        this.flowerPos = optional2;
        this.travelTicks = n;
        this.blacklistedHives = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00433.class, "hivePos;flowerPos;travelTicks;blacklistedHives", "hivePos", "flowerPos", "travelTicks", "blacklistedHives"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00433.class, "hivePos;flowerPos;travelTicks;blacklistedHives", "hivePos", "flowerPos", "travelTicks", "blacklistedHives"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00433.class, "hivePos;flowerPos;travelTicks;blacklistedHives", "hivePos", "flowerPos", "travelTicks", "blacklistedHives"}, this);
    }

    public List<class07209> u() {
        return this.blacklistedHives;
    }

    public Optional<class07209> y() {
        return this.flowerPos;
    }

    public boolean N(class07209 class072092) {
        return this.hivePos.isPresent() && class072092.equals((Object)this.hivePos.get());
    }

    public Optional<class07209> N() {
        return this.hivePos;
    }
}

