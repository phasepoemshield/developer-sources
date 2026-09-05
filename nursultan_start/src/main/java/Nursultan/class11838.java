/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  Nursultan.class11067
 *  Nursultan.class11106
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class11067;
import Nursultan.class11106;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class class11838
extends Record {
    public class11106 subCategory;
    public List<class11067> modules;
    public class09785<Boolean> expanded;

    public class09785<Boolean> L() {
        return this.expanded;
    }

    public class11838(class09785<Boolean> class097852, class11106 class111062, List<class11067> list) {
        this.expanded = class097852;
        this.subCategory = class111062;
        this.modules = list;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11838.class, "expanded;subCategory;modules", "expanded", "subCategory", "modules"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11838.class, "expanded;subCategory;modules", "expanded", "subCategory", "modules"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11838.class, "expanded;subCategory;modules", "expanded", "subCategory", "modules"}, this);
    }

    public class11106 y() {
        return this.subCategory;
    }

    public List<class11067> N() {
        return this.modules;
    }
}

