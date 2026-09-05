/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04336
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04336;

final class class03947
extends Record {
    private final int featureIndex;
    private final int step;
    private final class04336 feature;

    public class04336 L() {
        return this.feature;
    }

    class03947(int n, int n2, class04336 class043362) {
        this.featureIndex = n;
        this.step = n2;
        this.feature = class043362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03947.class, "featureIndex;step;feature", "featureIndex", "step", "feature"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03947.class, "featureIndex;step;feature", "featureIndex", "step", "feature"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03947.class, "featureIndex;step;feature", "featureIndex", "step", "feature"}, this);
    }

    public int y() {
        return this.step;
    }

    public int N() {
        return this.featureIndex;
    }
}

