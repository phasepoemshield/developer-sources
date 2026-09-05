/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  Nursultan.class11165
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class11165;
import Nursultan.class11882;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class class11859
extends Record {
    public List<class11882> items;
    public class09785<Boolean> expanded;
    public class11165 category;

    public class09785<Boolean> L() {
        return this.expanded;
    }

    public class11859(class09785<Boolean> class097852, class11165 class111652, List<class11882> list) {
        this.expanded = class097852;
        this.category = class111652;
        this.items = list;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11859.class, "expanded;category;items", "expanded", "category", "items"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11859.class, "expanded;category;items", "expanded", "category", "items"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11859.class, "expanded;category;items", "expanded", "category", "items"}, this);
    }

    public class11165 y() {
        return this.category;
    }

    public List<class11882> N() {
        return this.items;
    }
}

