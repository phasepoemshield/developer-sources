/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09073;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09096
extends Record {
    public class09073 color;
    public class09073 depth;
    public String label;

    public class09073 L() {
        return this.depth;
    }

    public class09096(class09073 class090732, class09073 class090733, String string) {
        this.color = class090732;
        this.depth = class090733;
        this.label = string;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09096.class, "color;depth;label", "color", "depth", "label"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09096.class, "color;depth;label", "color", "depth", "label"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09096.class, "color;depth;label", "color", "depth", "label"}, this);
    }

    public class09073 y() {
        return this.color;
    }

    public String N() {
        return this.label;
    }
}

