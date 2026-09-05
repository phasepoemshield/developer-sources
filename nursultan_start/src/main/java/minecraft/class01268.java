/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01276;
import org.jspecify.annotations.Nullable;

public final class class01268
extends Record
implements class01276 {
    private final @Nullable String worldId;

    public class01268(@Nullable String string) {
        this.worldId = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01268.class, "worldId", "worldId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01268.class, "worldId", "worldId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01268.class, "worldId", "worldId"}, this);
    }

    public @Nullable String y() {
        return this.worldId;
    }

    @Override
    public boolean N() {
        return true;
    }
}

