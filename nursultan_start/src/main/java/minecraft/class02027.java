/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03061
 *  minecraft.class03072
 *  minecraft.class03073
 *  minecraft.class03080
 *  minecraft.class04470
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.UUID;
import minecraft.class02048;
import minecraft.class03061;
import minecraft.class03072;
import minecraft.class03073;
import minecraft.class03080;
import minecraft.class04470;

public final class class02027
extends Record {
    private final UUID sessionId;
    private final class04470 profilePublicKey;

    public UUID L() {
        return this.sessionId;
    }

    public class02027(UUID uUID, class04470 class044702) {
        this.sessionId = uUID;
        this.profilePublicKey = class044702;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02027.class, "sessionId;profilePublicKey", "sessionId", "profilePublicKey"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02027.class, "sessionId;profilePublicKey", "sessionId", "profilePublicKey"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02027.class, "sessionId;profilePublicKey", "sessionId", "profilePublicKey"}, this);
    }

    public class04470 u() {
        return this.profilePublicKey;
    }

    public boolean y() {
        return this.profilePublicKey.y().N();
    }

    public class03073 N(UUID uUID) {
        return new class03080(uUID, this.sessionId).N(this.profilePublicKey);
    }

    public class02048 N() {
        return new class02048(this.sessionId, this.profilePublicKey.y());
    }

    public class03072 N(Duration duration) {
        return new class03061(this.profilePublicKey.N(), () -> this.profilePublicKey.y().N(duration));
    }
}

