/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class11223;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class06889;

public class class11241
extends Record {
    public List<class06889> trajectory;
    public Optional<class11223> landPoint;

    public class11241(List<class06889> list, Optional<class11223> optional) {
        this.trajectory = list;
        this.landPoint = optional;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11241.class, "trajectory;landPoint", "trajectory", "landPoint"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11241.class, "trajectory;landPoint", "trajectory", "landPoint"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11241.class, "trajectory;landPoint", "trajectory", "landPoint"}, this);
    }

    public List<class06889> y() {
        return this.trajectory;
    }

    public Optional<class11223> N() {
        return this.landPoint;
    }
}

