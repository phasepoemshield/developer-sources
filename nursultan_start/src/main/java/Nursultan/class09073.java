/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11175
 *  Nursultan.class11181
 *  Nursultan.class11199
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11175;
import Nursultan.class11181;
import Nursultan.class11199;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09073
extends Record {
    public int width;
    public int usage;
    public class11199 minFilter;
    public class11175 wrapT;
    public int height;
    public class11181 format;
    public boolean mipmapped;
    public class11175 wrapS;
    public class11199 magFilter;

    public class11175 L() {
        return this.wrapS;
    }

    public class11199 M() {
        return this.minFilter;
    }

    public class09073(int n, int n2, class11181 class111812, class11199 class111992, class11199 class111993, class11175 class111752, class11175 class111753, boolean bl, int n3) {
        this.width = n;
        this.height = n2;
        this.format = class111812;
        this.minFilter = class111992;
        this.magFilter = class111993;
        this.wrapS = class111752;
        this.wrapT = class111753;
        this.mipmapped = bl;
        this.usage = n3;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09073.class, "width;height;format;minFilter;magFilter;wrapS;wrapT;mipmapped;usage", "width", "height", "format", "minFilter", "magFilter", "wrapS", "wrapT", "mipmapped", "usage"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09073.class, "width;height;format;minFilter;magFilter;wrapS;wrapT;mipmapped;usage", "width", "height", "format", "minFilter", "magFilter", "wrapS", "wrapT", "mipmapped", "usage"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09073.class, "width;height;format;minFilter;magFilter;wrapS;wrapT;mipmapped;usage", "width", "height", "format", "minFilter", "magFilter", "wrapS", "wrapT", "mipmapped", "usage"}, this);
    }

    public int B() {
        return this.width;
    }

    public int Z() {
        return this.usage;
    }

    public class11175 i() {
        return this.wrapT;
    }

    public boolean u() {
        return this.mipmapped;
    }

    public class11181 y() {
        return this.format;
    }

    public int N() {
        return this.height;
    }

    public class11199 R() {
        return this.magFilter;
    }
}

