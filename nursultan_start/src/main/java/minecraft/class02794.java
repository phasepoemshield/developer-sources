/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class00392;
import org.jspecify.annotations.Nullable;

public final class class02794
extends Record {
    private final UUID id;
    private final String url;
    private final String hash;
    private final boolean isRequired;
    private final @Nullable class00392 prompt;

    public String L() {
        return this.hash;
    }

    public class02794(UUID uUID, String string, String string2, boolean bl, @Nullable class00392 class003922) {
        this.id = uUID;
        this.url = string;
        this.hash = string2;
        this.isRequired = bl;
        this.prompt = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02794.class, "id;url;hash;isRequired;prompt", "id", "url", "hash", "isRequired", "prompt"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02794.class, "id;url;hash;isRequired;prompt", "id", "url", "hash", "isRequired", "prompt"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02794.class, "id;url;hash;isRequired;prompt", "id", "url", "hash", "isRequired", "prompt"}, this);
    }

    public @Nullable class00392 i() {
        return this.prompt;
    }

    public boolean u() {
        return this.isRequired;
    }

    public String y() {
        return this.url;
    }

    public UUID N() {
        return this.id;
    }
}

