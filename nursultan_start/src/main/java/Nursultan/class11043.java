/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10401
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10401;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;

public class class11043
extends Record {
    public class10401 entity;
    public int removedTick;

    class11043(class10401 class104012, int n) {
        this.entity = class104012;
        this.removedTick = n;
    }

    public boolean equals(Object object) {
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        class11043 class110432 = (class11043)((Object)object);
        return Objects.equals(this.entity.method_5820(), class110432.entity.method_5820());
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11043.class, "entity;removedTick", "entity", "removedTick"}, this);
    }

    public int hashCode() {
        return Objects.hashCode(this.entity.method_5820());
    }

    public int y() {
        return this.removedTick;
    }

    public class10401 N() {
        return this.entity;
    }
}

