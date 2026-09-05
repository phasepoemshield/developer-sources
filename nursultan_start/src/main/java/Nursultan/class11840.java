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

public class class11840
extends Record {
    public float anchorOffsetX;
    public class09785<Boolean> opened;
    public List<? extends class11535> entries;
    public Consumer<class11535> onToggle;
    public Float width;

    public class09785<Boolean> L() {
        return this.opened;
    }

    public class11840(List<? extends class11535> list, class09785<Boolean> class097852, Consumer<class11535> consumer) {
        this(list, class097852, consumer, null, -8.0f);
    }

    public class11840(List<? extends class11535> list, class09785<Boolean> class097852, Consumer<class11535> consumer, Float f, float f2) {
        this.entries = list;
        this.opened = class097852;
        this.onToggle = consumer;
        this.width = f;
        this.anchorOffsetX = f2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11840.class, "entries;opened;onToggle;width;anchorOffsetX", "entries", "opened", "onToggle", "width", "anchorOffsetX"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11840.class, "entries;opened;onToggle;width;anchorOffsetX", "entries", "opened", "onToggle", "width", "anchorOffsetX"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11840.class, "entries;opened;onToggle;width;anchorOffsetX", "entries", "opened", "onToggle", "width", "anchorOffsetX"}, this);
    }

    public Consumer<class11535> i() {
        return this.onToggle;
    }

    public List<? extends class11535> u() {
        return this.entries;
    }

    public float y() {
        return this.anchorOffsetX;
    }

    public Float N() {
        return this.width;
    }
}

