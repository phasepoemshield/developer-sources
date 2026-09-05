/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00455
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class05946
 *  minecraft.class08051
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00455;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class05946;
import minecraft.class08051;

public final class class02884
extends Record
implements class00381<class08051> {
    private final Set<class00455<?>> subscriptions;
    private static final class02362<class04247, Set<class00455<?>>> L = class02389.N((class05946)class04227.v).N_33(class02389.N(ReferenceOpenHashSet::new));
    public static final class02362<class04247, class02884> N = L.N_10(class02884::new, class02884::N);

    public class02884(Set<class00455<?>> set) {
        this.subscriptions = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02884.class, "subscriptions", "subscriptions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02884.class, "subscriptions", "subscriptions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02884.class, "subscriptions", "subscriptions"}, this);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_56619(this);
    }

    public Set<class00455<?>> N() {
        return this.subscriptions;
    }

    public class02897<class02884> method_65080() {
        return class04248.yK;
    }
}

