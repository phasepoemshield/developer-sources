/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03238
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class03238;
import minecraft.class04336;

final class class04318
extends Record {
    private final class03238<?, ?> feature;
    private final Optional<class04336> topFeature;

    class04318(class03238<?, ?> class032382, Optional<class04336> optional) {
        this.feature = class032382;
        this.topFeature = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04318.class, "feature;topFeature", "feature", "topFeature"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04318.class, "feature;topFeature", "feature", "topFeature"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04318.class, "feature;topFeature", "feature", "topFeature"}, this);
    }

    public Optional<class04336> y() {
        return this.topFeature;
    }

    public class03238<?, ?> N() {
        return this.feature;
    }
}

