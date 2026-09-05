/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01248
 *  minecraft.class03554
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01248;
import minecraft.class03554;

public final class class02797
extends Record
implements AutoCloseable {
    final class03554 resourceManager;
    final class01248 managers;

    public class02797(class03554 class035542, class01248 class012482) {
        this.resourceManager = class035542;
        this.managers = class012482;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02797.class, "resourceManager;managers", "resourceManager", "managers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02797.class, "resourceManager;managers", "resourceManager", "managers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02797.class, "resourceManager;managers", "resourceManager", "managers"}, this);
    }

    @Override
    public void close() {
        this.resourceManager.close();
    }

    public class01248 y() {
        return this.managers;
    }

    public class03554 N() {
        return this.resourceManager;
    }
}

