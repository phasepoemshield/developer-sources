/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class03397
 *  minecraft.class03928
 *  minecraft.class04469
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00667;
import minecraft.class03048;
import minecraft.class03397;
import minecraft.class03928;
import minecraft.class04469;

public final class class03066
extends Record {
    private final List<class03928> entries;
    public static final class03066 N = new class03066(List.of());

    public class03066(class00667 class006672) {
        this((List)class006672.N_15(class00667.N(ArrayList::new, (int)20), class03928::N));
    }

    public class03066(List<class03928> list) {
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03066.class, "entries", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03066.class, "entries", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03066.class, "entries", "entries"}, this);
    }

    public Optional<class03048> N(class03397 class033972) {
        ArrayList<class04469> arrayList = new ArrayList<class04469>(this.entries.size());
        Iterator<class03928> var3 = this.entries.iterator();
        while (var3.hasNext()) {
            Optional var5 = var3.next().N(class033972);
            if (var5.isEmpty()) {
                return Optional.empty();
            }
            arrayList.add((class04469)var5.get());
        }
        return Optional.of(new class03048(arrayList));
    }

    public List<class03928> N() {
        return this.entries;
    }

    public void N(class00667 class006672) {
        class006672.N_12(this.entries, class03928::N);
    }
}

