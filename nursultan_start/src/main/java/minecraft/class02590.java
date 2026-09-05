/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04830
 *  minecraft.class07923
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class04830;
import minecraft.class07923;

public final class class02590
extends Record
implements class04830 {
    private final List<class07923> profiles;

    public class02590(List<class07923> list) {
        this.profiles = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02590.class, "profiles", "profiles"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02590.class, "profiles", "profiles"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02590.class, "profiles", "profiles"}, this);
    }

    public List<class07923> N() {
        return this.profiles;
    }
}

