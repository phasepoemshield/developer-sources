/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08706;
import minecraft.class08719;

final class class08726
extends Record {
    final class08719 layerType;
    final class08706 layer;

    class08726(class08719 class087192, class08706 class087062) {
        this.layerType = class087192;
        this.layer = class087062;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08726.class, "layerType;layer", "layerType", "layer"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08726.class, "layerType;layer", "layerType", "layer"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08726.class, "layerType;layer", "layerType", "layer"}, this);
    }

    public class08706 y() {
        return this.layer;
    }

    public class08719 N() {
        return this.layerType;
    }
}

