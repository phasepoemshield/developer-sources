/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import minecraft.class00500;
import minecraft.class03003;
import org.jspecify.annotations.Nullable;

final class class03014
extends Record
implements class03003 {
    private final List<class03003> rules;

    class03014(List<class03003> list) {
        this.rules = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03014.class, "rules", "rules"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03014.class, "rules", "rules"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03014.class, "rules", "rules"}, this);
    }

    public List<class03003> N() {
        return this.rules;
    }

    @Override
    public @Nullable class00500 tryApply(int n, int n2, int n3) {
        Iterator<class03003> var4 = this.rules.iterator();
        while (var4.hasNext()) {
            class00500 class005002 = var4.next().tryApply(n, n2, n3);
            if (class005002 == null) continue;
            return class005002;
        }
        return null;
    }
}

