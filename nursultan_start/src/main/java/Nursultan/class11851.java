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

public class class11851
extends Record {
    public List<? extends class11535> entries;
    public Consumer<class11535> onSelect;
    public Float width;
    public class09785<Boolean> opened;
    public float anchorOffsetX;

    public Float L() {
        return this.width;
    }

    public class11851(List<? extends class11535> list, class09785<Boolean> class097852, Consumer<class11535> consumer, Float f, float f2) {
        this.entries = list;
        this.opened = class097852;
        this.onSelect = consumer;
        this.width = f;
        this.anchorOffsetX = f2;
    }

    public class11851(List<? extends class11535> list, class09785<Boolean> class097852, Consumer<class11535> consumer) {
        this(list, class097852, consumer, null, -8.0f);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11851.class, "entries;opened;onSelect;width;anchorOffsetX", "entries", "opened", "onSelect", "width", "anchorOffsetX"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11851.class, "entries;opened;onSelect;width;anchorOffsetX", "entries", "opened", "onSelect", "width", "anchorOffsetX"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11851.class, "entries;opened;onSelect;width;anchorOffsetX", "entries", "opened", "onSelect", "width", "anchorOffsetX"}, this);
    }

    public List<? extends class11535> i() {
        return this.entries;
    }

    public Consumer<class11535> u() {
        return this.onSelect;
    }

    public float y() {
        return this.anchorOffsetX;
    }

    public class09785<Boolean> N() {
        return this.opened;
    }
}

