/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11596
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11596;
import Nursultan.class11731;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11774
extends Record {
    public int textureIdSnapshot;
    public class11731 atlas;
    public class11596 texture;

    public class11731 L() {
        return this.atlas;
    }

    class11774(class11731 class117312, int n, class11596 class115962) {
        this.atlas = class117312;
        this.textureIdSnapshot = n;
        this.texture = class115962;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11774.class, "atlas;textureIdSnapshot;texture", "atlas", "textureIdSnapshot", "texture"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11774.class, "atlas;textureIdSnapshot;texture", "atlas", "textureIdSnapshot", "texture"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11774.class, "atlas;textureIdSnapshot;texture", "atlas", "textureIdSnapshot", "texture"}, this);
    }

    public int y() {
        return this.textureIdSnapshot;
    }

    public class11596 N() {
        return this.texture;
    }
}

