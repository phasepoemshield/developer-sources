/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class class11658
extends Record {
    private final List<Object> subkeys;

    public class11658(List<Object> list) {
        this.subkeys = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11658.class, "subkeys", "subkeys"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11658.class, "subkeys", "subkeys"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11658.class, "subkeys", "subkeys"}, this);
    }

    public List<Object> N() {
        return this.subkeys;
    }
}

