/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02968
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class01894;
import minecraft.class02968;

public final class class08126
extends Record {
    final class01894 textureId;
    final class01894 definitionLocation;
    final boolean createMipmaps;
    final Set<class02968<?>> additionalMetadata;

    public boolean L() {
        return this.createMipmaps;
    }

    public class08126(class01894 class018942, class01894 class018943, boolean bl) {
        this(class018942, class018943, bl, Set.of());
    }

    public class08126(class01894 class018942, class01894 class018943, boolean bl, Set<class02968<?>> set) {
        this.textureId = class018942;
        this.definitionLocation = class018943;
        this.createMipmaps = bl;
        this.additionalMetadata = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08126.class, "textureId;definitionLocation;createMipmaps;additionalMetadata", "textureId", "definitionLocation", "createMipmaps", "additionalMetadata"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08126.class, "textureId;definitionLocation;createMipmaps;additionalMetadata", "textureId", "definitionLocation", "createMipmaps", "additionalMetadata"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08126.class, "textureId;definitionLocation;createMipmaps;additionalMetadata", "textureId", "definitionLocation", "createMipmaps", "additionalMetadata"}, this);
    }

    public Set<class02968<?>> u() {
        return this.additionalMetadata;
    }

    public class01894 y() {
        return this.definitionLocation;
    }

    public class01894 N() {
        return this.textureId;
    }
}

