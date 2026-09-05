/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03065
 *  minecraft.class03080
 *  minecraft.class03954
 *  minecraft.class04450
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.PrivateKey;
import java.util.UUID;
import minecraft.class02027;
import minecraft.class03065;
import minecraft.class03080;
import minecraft.class03954;
import minecraft.class04450;

public final class class02018
extends Record {
    private final UUID sessionId;
    private final class04450 keyPair;

    public class04450 L() {
        return this.keyPair;
    }

    public class02018(UUID uUID, class04450 class044502) {
        this.sessionId = uUID;
        this.keyPair = class044502;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02018.class, "sessionId;keyPair", "sessionId", "keyPair"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02018.class, "sessionId;keyPair", "sessionId", "keyPair"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02018.class, "sessionId;keyPair", "sessionId", "keyPair"}, this);
    }

    public UUID y() {
        return this.sessionId;
    }

    public class03065 N(UUID uUID) {
        return new class03080(uUID, this.sessionId).N(class03954.N((PrivateKey)this.keyPair.y(), (String)"SHA256withRSA"));
    }

    public static class02018 N(class04450 class044502) {
        return new class02018(UUID.randomUUID(), class044502);
    }

    public class02027 N() {
        return new class02027(this.sessionId, this.keyPair.L());
    }
}

