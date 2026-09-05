/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00295
 *  minecraft.class03729
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00295;
import minecraft.class03729;

public final class class06484
extends Record {
    final class00295 display;
    final class03729<?> parent;

    public class06484(class00295 class002952, class03729<?> class037292) {
        this.display = class002952;
        this.parent = class037292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06484.class, "display;parent", "display", "parent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06484.class, "display;parent", "display", "parent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06484.class, "display;parent", "display", "parent"}, this);
    }

    public class03729<?> y() {
        return this.parent;
    }

    public class00295 N() {
        return this.display;
    }
}

