/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  Nursultan.class11535
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class11535;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;

public class class11835
extends Record {
    public List<? extends class11535> entries;
    public class11535 selected;
    public Consumer<class11535> onSelect;
    public class09785<Boolean> opened;

    public List<? extends class11535> L() {
        return this.entries;
    }

    public class11835(List<? extends class11535> list, class11535 class115352, class09785<Boolean> class097852, Consumer<class11535> consumer) {
        this.entries = list;
        this.selected = class115352;
        this.opened = class097852;
        this.onSelect = consumer;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11835.class, "entries;selected;opened;onSelect", "entries", "selected", "opened", "onSelect"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11835.class, "entries;selected;opened;onSelect", "entries", "selected", "opened", "onSelect"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11835.class, "entries;selected;opened;onSelect", "entries", "selected", "opened", "onSelect"}, this);
    }

    public class09785<Boolean> u() {
        return this.opened;
    }

    public Consumer<class11535> y() {
        return this.onSelect;
    }

    public class11535 N() {
        return this.selected;
    }
}

