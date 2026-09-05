/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.IdF
 *  com.mojang.datafixers.kinds.IdF$Mu
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01289
 *  minecraft.class05367
 *  minecraft.class05378
 */
package minecraft;

import com.mojang.datafixers.kinds.IdF;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01289;
import minecraft.class04109;
import minecraft.class04139;
import minecraft.class05367;
import minecraft.class05378;

public final class class04130<Value>
extends Record
implements class04109<IdF.Mu, Value> {
    private final class05378<Value> memory;

    public class04130(class05378<Value> class053782) {
        this.memory = class053782;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04130.class, "memory", "memory"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04130.class, "memory", "memory"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04130.class, "memory", "memory"}, this);
    }

    @Override
    public class05367 y() {
        return class05367.field_18456;
    }

    @Override
    public class05378<Value> N() {
        return this.memory;
    }

    @Override
    public class04139<IdF.Mu, Value> N(class01289<?> class012892, Optional<Value> optional) {
        if (optional.isEmpty()) {
            return null;
        }
        return new class04139(class012892, this.memory, IdF.create(optional.get()));
    }
}

