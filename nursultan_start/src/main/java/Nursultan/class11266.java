/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class11228;
import Nursultan.class11241;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;

public class class11266
extends Record {
    public class06889 velocity;
    public class11228 entityPrediction;
    public float landingRadius;
    public class06889 origin;

    public class06889 L() {
        return this.velocity;
    }

    public class11266(class06889 class068892, class06889 class068893, class11228 class112282) {
        this(class068892, class068893, class112282, 0.0f);
    }

    public class11266(class06889 class068892, class06889 class068893, class11228 class112282, float f) {
        this.origin = class068892;
        this.velocity = class068893;
        this.entityPrediction = class112282;
        this.landingRadius = f;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11266.class, "origin;velocity;entityPrediction;landingRadius", "origin", "velocity", "entityPrediction", "landingRadius"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11266.class, "origin;velocity;entityPrediction;landingRadius", "origin", "velocity", "entityPrediction", "landingRadius"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11266.class, "origin;velocity;entityPrediction;landingRadius", "origin", "velocity", "entityPrediction", "landingRadius"}, this);
    }

    public class06889 i() {
        return this.origin;
    }

    public float u() {
        return this.landingRadius;
    }

    public class11241 y() {
        return this.N().N(null, this.origin, this.velocity);
    }

    public class11228 N() {
        return this.entityPrediction;
    }
}

