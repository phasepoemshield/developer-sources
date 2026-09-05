/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00225
 *  minecraft.class03556
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import minecraft.class00225;
import minecraft.class03556;
import minecraft.class05513;

public final class class05531
extends Record {
    private final int index;
    private final Collection<class05513> gameTestInfos;
    private final class03556<class00225> environment;

    public class03556<class00225> L() {
        return this.environment;
    }

    public class05531(int n, Collection<class05513> collection, class03556<class00225> class035562) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
        }
        this.index = n;
        this.gameTestInfos = collection;
        this.environment = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05531.class, "index;gameTestInfos;environment", "index", "gameTestInfos", "environment"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05531.class, "index;gameTestInfos;environment", "index", "gameTestInfos", "environment"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05531.class, "index;gameTestInfos;environment", "index", "gameTestInfos", "environment"}, this);
    }

    public Collection<class05513> y() {
        return this.gameTestInfos;
    }

    public int N() {
        return this.index;
    }
}

