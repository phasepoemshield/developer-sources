/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class03556
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class03556;

public final class class05369
extends Record {
    private final Set<class00500> matchingStates;
    private final int maxTickets;
    private final int validRange;
    public static final Predicate<class03556<class05369>> N = class035562 -> false;

    public int L() {
        return this.validRange;
    }

    public class05369(Set<class00500> set, int n, int n2) {
        set = Set.copyOf(set);
        this.matchingStates = set;
        this.maxTickets = n;
        this.validRange = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05369.class, "matchingStates;maxTickets;validRange", "matchingStates", "maxTickets", "validRange"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05369.class, "matchingStates;maxTickets;validRange", "matchingStates", "maxTickets", "validRange"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05369.class, "matchingStates;maxTickets;validRange", "matchingStates", "maxTickets", "validRange"}, this);
    }

    public int y() {
        return this.maxTickets;
    }

    public boolean N(class00500 class005002) {
        return this.matchingStates.contains(class005002);
    }

    public Set<class00500> N() {
        return this.matchingStates;
    }
}

