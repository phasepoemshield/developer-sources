/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;

public class class11223
extends Record {
    public class06889 position;
    public class07089 hitResult;
    public int remainingTicks;
    public class07049 entity;

    public int L() {
        return this.remainingTicks;
    }

    public class11223(class06889 class068892, class07089 class070892, int n, class07049 class070492) {
        this.position = class068892;
        this.hitResult = class070892;
        this.remainingTicks = n;
        this.entity = class070492;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11223.class, "position;hitResult;remainingTicks;entity", "position", "hitResult", "remainingTicks", "entity"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11223.class, "position;hitResult;remainingTicks;entity", "position", "hitResult", "remainingTicks", "entity"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11223.class, "position;hitResult;remainingTicks;entity", "position", "hitResult", "remainingTicks", "entity"}, this);
    }

    public class07049 u() {
        return this.entity;
    }

    public class07089 y() {
        return this.hitResult;
    }

    public class06889 N() {
        return this.position;
    }
}

