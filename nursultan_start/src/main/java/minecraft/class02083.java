/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 *  minecraft.class03934
 *  minecraft.class06338
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.primitives.Ints;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.util.UUID;
import minecraft.class01487;
import minecraft.class03934;
import minecraft.class06338;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public final class class02083
extends Record {
    private final int index;
    private final UUID sender;
    private final UUID sessionId;
    public static final Codec<class02083> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.fieldOf("index").forGetter(class02083::y), (App)class01487.N.fieldOf("sender").forGetter(class02083::L), (App)class01487.N.fieldOf("session_id").forGetter(class02083::u)).apply(instance, class02083::new));

    public UUID L() {
        return this.sender;
    }

    public class02083(int n, UUID uUID, UUID uUID2) {
        this.index = n;
        this.sender = uUID;
        this.sessionId = uUID2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02083.class, "index;sender;sessionId", "index", "sender", "sessionId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02083.class, "index;sender;sessionId", "index", "sender", "sessionId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02083.class, "index;sender;sessionId", "index", "sender", "sessionId"}, this);
    }

    public UUID u() {
        return this.sessionId;
    }

    public int y() {
        return this.index;
    }

    public static class02083 N(UUID uUID) {
        return class02083.N(uUID, class07536.R);
    }

    public void N(class03934 class039342) throws SignatureException {
        class039342.update(class01487.y((UUID)this.sender));
        class039342.update(class01487.y((UUID)this.sessionId));
        class039342.update(Ints.toByteArray((int)this.index));
    }

    public boolean N(class02083 class020832) {
        return this.index > class020832.y() && this.sender.equals(class020832.L()) && this.sessionId.equals(class020832.u());
    }

    public static class02083 N(UUID uUID, UUID uUID2) {
        return new class02083(0, uUID, uUID2);
    }

    public @Nullable class02083 N() {
        if (this.index == Integer.MAX_VALUE) {
            return null;
        }
        return new class02083(this.index + 1, this.sender, this.sessionId);
    }
}

