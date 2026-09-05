/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02477
 *  minecraft.class02480
 *  minecraft.class02508
 *  minecraft.class02678
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import minecraft.class00147;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02508;
import minecraft.class02678;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public final class class00146
extends Record {
    private final Map<class02477<?>, Integer> addedComponents;
    private final Set<class02477<?>> removedComponents;
    public static final class02362<class04247, class00146> N = class02362.N((class02362)class02389.N(HashMap::new, (class02362)class02389.N((class05946)class04227.b), (class02362)class02389.M, (int)256), class00146::N, (class02362)class02389.N(HashSet::new, (class02362)class02389.N((class05946)class04227.b), (int)256), class00146::y, class00146::new);

    public class00146(Map<class02477<?>, Integer> map, Set<class02477<?>> set) {
        this.addedComponents = map;
        this.removedComponents = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00146.class, "addedComponents;removedComponents", "addedComponents", "removedComponents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00146.class, "addedComponents;removedComponents", "addedComponents", "removedComponents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00146.class, "addedComponents;removedComponents", "addedComponents", "removedComponents"}, this);
    }

    public Set<class02477<?>> y() {
        return this.removedComponents;
    }

    public boolean y(class02678 class026782, class00147 class001472) {
        class02508 class025082 = class026782.i();
        if (!class025082.y().equals(this.removedComponents)) {
            return false;
        }
        if (this.addedComponents.size() != class025082.N().u()) {
            return false;
        }
        for (class02480 var5 : class025082.N()) {
            Integer n = this.addedComponents.get(var5.N());
            if (n == null) {
                return false;
            }
            if (((Integer)class001472.apply(var5)).equals(n)) continue;
            return false;
        }
        return true;
    }

    public static class00146 N(class02678 class026782, class00147 class001472) {
        class02508 class025082 = class026782.i();
        IdentityHashMap identityHashMap = new IdentityHashMap(class025082.N().u());
        class025082.N().forEach(class024802 -> identityHashMap.put(class024802.N(), (Integer)class001472.apply(class024802)));
        return new class00146(identityHashMap, class025082.y());
    }

    public Map<class02477<?>, Integer> N() {
        return this.addedComponents;
    }
}

