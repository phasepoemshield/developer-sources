/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02263
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02263;
import minecraft.class06262;

public final class class06251
extends Record
implements AutoCloseable {
    private final class06262 provider;
    private final class02263 filter;

    public class06251(class06262 class062622, class02263 class022632) {
        this.provider = class062622;
        this.filter = class022632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06251.class, "provider;filter", "provider", "filter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06251.class, "provider;filter", "provider", "filter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06251.class, "provider;filter", "provider", "filter"}, this);
    }

    @Override
    public void close() {
        this.provider.close();
    }

    public class02263 y() {
        return this.filter;
    }

    public class06262 N() {
        return this.provider;
    }
}

