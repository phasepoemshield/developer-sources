/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01222
 *  minecraft.class04470
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.PrivateKey;
import java.time.Instant;
import minecraft.class01222;
import minecraft.class04470;
import minecraft.class06338;

public final class class04450
extends Record {
    private final PrivateKey privateKey;
    private final class04470 publicKey;
    private final Instant refreshedAfter;
    public static final Codec<class04450> N = RecordCodecBuilder.create(instance -> instance.group((App)class01222.M.fieldOf("private_key").forGetter(class04450::y), (App)class04470.L.fieldOf("public_key").forGetter(class04450::L), (App)class06338.l.fieldOf("refreshed_after").forGetter(class04450::u)).apply(instance, class04450::new));

    public class04470 L() {
        return this.publicKey;
    }

    public class04450(PrivateKey privateKey, class04470 class044702, Instant instant) {
        this.privateKey = privateKey;
        this.publicKey = class044702;
        this.refreshedAfter = instant;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04450.class, "privateKey;publicKey;refreshedAfter", "privateKey", "publicKey", "refreshedAfter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04450.class, "privateKey;publicKey;refreshedAfter", "privateKey", "publicKey", "refreshedAfter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04450.class, "privateKey;publicKey;refreshedAfter", "privateKey", "publicKey", "refreshedAfter"}, this);
    }

    public Instant u() {
        return this.refreshedAfter;
    }

    public PrivateKey y() {
        return this.privateKey;
    }

    public boolean N() {
        return this.refreshedAfter.isBefore(Instant.now());
    }
}

