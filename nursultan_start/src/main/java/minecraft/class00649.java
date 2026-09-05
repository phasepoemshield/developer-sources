/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04247
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00629;
import minecraft.class02362;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04247;

public final class class00649
extends Record {
    private final class03556<class00629> chatType;
    private final class00392 name;
    private final Optional<class00392> targetName;
    public static final class02362<class04247, class00649> N = class02362.N(class00629.L, class00649::N, (class02362)class03748.u, class00649::y, (class02362)class03748.i, class00649::L, class00649::new);

    public class00649 L(class00392 class003922) {
        return new class00649(this.chatType, this.name, Optional.of(class003922));
    }

    public Optional<class00392> L() {
        return this.targetName;
    }

    class00649(class03556<class00629> class035562, class00392 class003922) {
        this(class035562, class003922, Optional.empty());
    }

    public class00649(class03556<class00629> class035562, class00392 class003922, Optional<class00392> optional) {
        this.chatType = class035562;
        this.name = class003922;
        this.targetName = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00649.class, "chatType;name;targetName", "chatType", "name", "targetName"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00649.class, "chatType;name;targetName", "chatType", "name", "targetName"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00649.class, "chatType;name;targetName", "chatType", "name", "targetName"}, this);
    }

    public class00392 y(class00392 class003922) {
        return ((class00629)((Object)this.chatType.N())).y().N(class003922, this);
    }

    public class00392 y() {
        return this.name;
    }

    public class03556<class00629> N() {
        return this.chatType;
    }

    public class00392 N(class00392 class003922) {
        return ((class00629)((Object)this.chatType.N())).N().N(class003922, this);
    }
}

