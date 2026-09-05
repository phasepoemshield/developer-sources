/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class03397
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Optional;
import minecraft.class00667;
import minecraft.class03048;
import minecraft.class03066;
import minecraft.class03079;
import minecraft.class03397;

public final class class03056
extends Record {
    private final String content;
    private final Instant timeStamp;
    private final long salt;
    private final class03066 lastSeen;

    public long L() {
        return this.salt;
    }

    public class03056(class00667 class006672) {
        this(class006672.u(256), class006672.j(), class006672.readLong(), new class03066(class006672));
    }

    public class03056(String string, Instant instant, long l, class03066 class030662) {
        this.content = string;
        this.timeStamp = instant;
        this.salt = l;
        this.lastSeen = class030662;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03056.class, "content;timeStamp;salt;lastSeen", "content", "timeStamp", "salt", "lastSeen"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03056.class, "content;timeStamp;salt;lastSeen", "content", "timeStamp", "salt", "lastSeen"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03056.class, "content;timeStamp;salt;lastSeen", "content", "timeStamp", "salt", "lastSeen"}, this);
    }

    public class03066 u() {
        return this.lastSeen;
    }

    public Instant y() {
        return this.timeStamp;
    }

    public Optional<class03079> N(class03397 class033972) {
        return this.lastSeen.N(class033972).map(class030482 -> new class03079(this.content, this.timeStamp, this.salt, (class03048)((Object)class030482)));
    }

    public void N(class00667 class006672) {
        class006672.N(this.content, 256);
        class006672.N(this.timeStamp);
        class006672.writeLong(this.salt);
        this.lastSeen.N(class006672);
    }

    public String N() {
        return this.content;
    }
}

