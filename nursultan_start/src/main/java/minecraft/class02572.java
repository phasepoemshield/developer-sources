/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class08889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00500;
import minecraft.class08889;

public final class class02572
extends Record {
    private final Map<class00500, class08889> models;

    public class02572(Map<class00500, class08889> map) {
        this.models = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02572.class, "models", "models"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02572.class, "models", "models"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02572.class, "models", "models"}, this);
    }

    public Map<class00500, class08889> N() {
        return this.models;
    }
}

