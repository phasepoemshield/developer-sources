/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class11599;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import org.joml.Vector4f;

public class class11635
extends Record {
    public Optional<class11599> currentMask;
    public Optional<class11599> effectiveMask;
    public List<Vector4f> rects;
    public List<Vector4f> rounds;

    public Optional<class11599> L() {
        return this.currentMask;
    }

    public class11635(List<Vector4f> list, List<Vector4f> list2, Optional<class11599> optional, Optional<class11599> optional2) {
        this.rects = list;
        this.rounds = list2;
        this.currentMask = optional;
        this.effectiveMask = optional2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11635.class, "rects;rounds;currentMask;effectiveMask", "rects", "rounds", "currentMask", "effectiveMask"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11635.class, "rects;rounds;currentMask;effectiveMask", "rects", "rounds", "currentMask", "effectiveMask"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11635.class, "rects;rounds;currentMask;effectiveMask", "rects", "rounds", "currentMask", "effectiveMask"}, this);
    }

    static class11635 i() {
        return new class11635(List.of(), List.of(), Optional.empty(), Optional.empty());
    }

    public Optional<class11599> u() {
        return this.effectiveMask;
    }

    public List<Vector4f> y() {
        return this.rounds;
    }

    public List<Vector4f> N() {
        return this.rects;
    }
}

