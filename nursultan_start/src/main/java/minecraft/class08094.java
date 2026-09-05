/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 *  minecraft.class04306
 *  minecraft.class04651
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00891;
import minecraft.class04306;
import minecraft.class04651;

public final class class08094
extends Record {
    private final List<class04306<class00891>> blocks;
    private final List<class04306<class04651>> fluids;

    public class08094(List<class04306<class00891>> list, List<class04306<class04651>> list2) {
        this.blocks = list;
        this.fluids = list2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08094.class, "blocks;fluids", "blocks", "fluids"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08094.class, "blocks;fluids", "blocks", "fluids"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08094.class, "blocks;fluids", "blocks", "fluids"}, this);
    }

    public List<class04306<class04651>> y() {
        return this.fluids;
    }

    public List<class04306<class00891>> N() {
        return this.blocks;
    }
}

