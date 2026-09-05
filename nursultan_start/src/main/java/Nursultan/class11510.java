/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class class11510
extends Record {
    public int score;
    public Object target;
    public List<String> breadcrumbs;

    public int L() {
        return this.score;
    }

    public class11510(List<String> list, Object object, int n) {
        this.breadcrumbs = list;
        this.target = object;
        this.score = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11510.class, "breadcrumbs;target;score", "breadcrumbs", "target", "score"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11510.class, "breadcrumbs;target;score", "breadcrumbs", "target", "score"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11510.class, "breadcrumbs;target;score", "breadcrumbs", "target", "score"}, this);
    }

    public List<String> y() {
        return this.breadcrumbs;
    }

    public Object N() {
        return this.target;
    }
}

