/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09935;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;

public final class class09899
extends Record
implements class09935 {
    private final float alpha;
    private final List<class09935> children;

    public class09899(float f, List<class09935> list) {
        Objects.requireNonNull(list, "children");
        this.alpha = f = class09693.N((float)f);
        this.children = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09899.class, "alpha;children", "alpha", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09899.class, "alpha;children", "alpha", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09899.class, "alpha;children", "alpha", "children"}, this);
    }

    public List<class09935> y() {
        return this.children;
    }

    public float N() {
        return this.alpha;
    }
}

