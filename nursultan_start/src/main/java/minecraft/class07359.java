/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00536
 *  minecraft.class00554
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00536;
import minecraft.class00554;
import org.jspecify.annotations.Nullable;

public final class class07359
extends Record {
    final int y;
    final @Nullable class00554 chunkSection;
    final @Nullable class00536 blockLight;
    final @Nullable class00536 skyLight;

    public @Nullable class00536 L() {
        return this.blockLight;
    }

    public class07359(int n, @Nullable class00554 class005542, @Nullable class00536 class005362, @Nullable class00536 class005363) {
        this.y = n;
        this.chunkSection = class005542;
        this.blockLight = class005362;
        this.skyLight = class005363;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07359.class, "y;chunkSection;blockLight;skyLight", "y", "chunkSection", "blockLight", "skyLight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07359.class, "y;chunkSection;blockLight;skyLight", "y", "chunkSection", "blockLight", "skyLight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07359.class, "y;chunkSection;blockLight;skyLight", "y", "chunkSection", "blockLight", "skyLight"}, this);
    }

    public @Nullable class00536 u() {
        return this.skyLight;
    }

    public @Nullable class00554 y() {
        return this.chunkSection;
    }

    public int N() {
        return this.y;
    }
}

