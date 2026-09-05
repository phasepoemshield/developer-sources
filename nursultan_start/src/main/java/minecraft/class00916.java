/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04540
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00931;
import minecraft.class04540;
import minecraft.class06889;

final class class00916
extends Record {
    private final class06889 center;
    private final float radius;
    private final int blockCount;
    final class04540<class00931> blockParticles;

    public int L() {
        return this.blockCount;
    }

    class00916(class06889 class068892, float f, int n, class04540<class00931> class045402) {
        this.center = class068892;
        this.radius = f;
        this.blockCount = n;
        this.blockParticles = class045402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00916.class, "center;radius;blockCount;blockParticles", "center", "radius", "blockCount", "blockParticles"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00916.class, "center;radius;blockCount;blockParticles", "center", "radius", "blockCount", "blockParticles"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00916.class, "center;radius;blockCount;blockParticles", "center", "radius", "blockCount", "blockParticles"}, this);
    }

    public class04540<class00931> u() {
        return this.blockParticles;
    }

    public float y() {
        return this.radius;
    }

    public class06889 N() {
        return this.center;
    }
}

