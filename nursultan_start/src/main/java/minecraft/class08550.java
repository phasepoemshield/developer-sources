/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.properties.Property
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.properties.Property;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class class08550
extends Record {
    final UUID profileId;
    private final @Nullable Property packedTextures;

    public class08550(UUID uUID, @Nullable Property property) {
        this.profileId = uUID;
        this.packedTextures = property;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08550.class, "profileId;packedTextures", "profileId", "packedTextures"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08550.class, "profileId;packedTextures", "profileId", "packedTextures"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08550.class, "profileId;packedTextures", "profileId", "packedTextures"}, this);
    }

    public @Nullable Property y() {
        return this.packedTextures;
    }

    public UUID N() {
        return this.profileId;
    }
}

