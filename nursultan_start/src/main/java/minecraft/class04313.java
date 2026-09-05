/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04318;
import org.apache.commons.lang3.mutable.MutableInt;

final class class04313
extends Record {
    private final Object2IntMap<class04318> featureData;
    private final MutableInt chunksWithFeatures;

    class04313(Object2IntMap<class04318> object2IntMap, MutableInt mutableInt) {
        this.featureData = object2IntMap;
        this.chunksWithFeatures = mutableInt;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04313.class, "featureData;chunksWithFeatures", "featureData", "chunksWithFeatures"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04313.class, "featureData;chunksWithFeatures", "featureData", "chunksWithFeatures"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04313.class, "featureData;chunksWithFeatures", "featureData", "chunksWithFeatures"}, this);
    }

    public MutableInt y() {
        return this.chunksWithFeatures;
    }

    public Object2IntMap<class04318> N() {
        return this.featureData;
    }
}

