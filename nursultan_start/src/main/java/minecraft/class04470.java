/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10406
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03962
 *  minecraft.class04454
 */
package minecraft;

import Nursultan.class10406;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.PublicKey;
import java.time.Duration;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class03962;
import minecraft.class04454;

public final class class04470
extends Record {
    private final class04454 data;
    public static final class00392 N = class00392.L((String)"multiplayer.disconnect.expired_public_key");
    private static final class00392 i = class00392.L((String)"multiplayer.disconnect.invalid_public_key_signature");
    public static final Duration y = Duration.ofHours(8L);
    public static final Codec<class04470> L = class04454.y.xmap(class04470::new, class04470::y);

    public class04470(class04454 class044542) {
        this.data = class044542;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04470.class, "data", "data"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04470.class, "data", "data"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04470.class, "data", "data"}, this);
    }

    public class04454 y() {
        return this.data;
    }

    public static class04470 N(class03962 class039622, UUID uUID, class04454 class044542) throws class10406 {
        if (!class044542.N(class039622, uUID)) {
            throw new class10406(i);
        }
        return new class04470(class044542);
    }

    public class03962 N() {
        return class03962.N((PublicKey)this.data.key, (String)"SHA256withRSA");
    }
}

