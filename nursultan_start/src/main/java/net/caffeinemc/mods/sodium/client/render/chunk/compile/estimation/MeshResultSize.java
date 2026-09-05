/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Average1DEstimator$Value;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshResultSize$SectionCategory;

public final class MeshResultSize
extends Record
implements Average1DEstimator$Value<MeshResultSize$SectionCategory> {
    private final MeshResultSize$SectionCategory category;
    private final long resultSize;
    public static long NO_DATA = -1L;

    public MeshResultSize(MeshResultSize$SectionCategory meshResultSize$SectionCategory, long l) {
        this.category = meshResultSize$SectionCategory;
        this.resultSize = l;
    }

    @Override
    public long value() {
        return this.resultSize;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{MeshResultSize.class, "category;resultSize", "category", "resultSize"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{MeshResultSize.class, "category;resultSize", "category", "resultSize"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{MeshResultSize.class, "category;resultSize", "category", "resultSize"}, this);
    }

    public long resultSize() {
        return this.resultSize;
    }

    @Override
    public MeshResultSize$SectionCategory category() {
        return this.category;
    }
}

