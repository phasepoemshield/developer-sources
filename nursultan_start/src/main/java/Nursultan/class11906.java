/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11909;
import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;

public class class11906
extends Record {
    public class11909 type;
    public int number;
    public Pair<Integer, Integer> group;

    public Pair<Integer, Integer> L() {
        return this.group;
    }

    public class11906(class11909 class119092, Pair<Integer, Integer> pair, int n) {
        this.type = class119092;
        this.group = pair;
        this.number = n;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class11906)) {
            return false;
        }
        class11906 class119062 = (class11906)((Object)object);
        return this.number == class119062.number;
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11906.class, "type;group;number", "type", "group", "number"}, this);
    }

    public int hashCode() {
        return Objects.hashCode(this.number);
    }

    public int u() {
        return this.number;
    }

    public class11909 y() {
        return this.type;
    }

    public String N() {
        return this.type.fields_0d98e95695d6732fd9192964e161ca232_0 + this.number;
    }
}

