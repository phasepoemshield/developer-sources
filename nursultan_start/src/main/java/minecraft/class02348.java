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
import minecraft.class02315;
import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02353;
import minecraft.class02356;

final class class02348<S, T>
extends Record
implements class02315<S> {
    private final class02356<S, T> ruleToParse;
    private final class02353<T> nameToStore;

    class02348(class02356<S, T> class023562, class02353<T> class023532) {
        this.ruleToParse = class023562;
        this.nameToStore = class023532;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02348.class, "ruleToParse;nameToStore", "ruleToParse", "nameToStore"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02348.class, "ruleToParse;nameToStore", "ruleToParse", "nameToStore"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02348.class, "ruleToParse;nameToStore", "ruleToParse", "nameToStore"}, this);
    }

    public class02353<T> y() {
        return this.nameToStore;
    }

    public class02356<S, T> N() {
        return this.ruleToParse;
    }

    @Override
    public boolean N(class02325<S> class023252, class02332 class023322, class02328 class023282) {
        T t = class023252.N(this.ruleToParse);
        if (t == null) {
            return false;
        }
        class023322.N(this.nameToStore, t);
        return true;
    }
}

