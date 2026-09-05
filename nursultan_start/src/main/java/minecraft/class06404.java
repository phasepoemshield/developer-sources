/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02695
 *  minecraft.class07001
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02695;
import minecraft.class07001;

final class class06404
extends Record {
    final class07001 tag;
    final class02695 components;

    class06404(class07001 class070012, class02695 class026952) {
        this.tag = class070012;
        this.components = class026952;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06404.class, "tag;components", "tag", "components"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06404.class, "tag;components", "tag", "components"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06404.class, "tag;components", "tag", "components"}, this);
    }

    public class02695 y() {
        return this.components;
    }

    public class07001 N() {
        return this.tag;
    }
}

