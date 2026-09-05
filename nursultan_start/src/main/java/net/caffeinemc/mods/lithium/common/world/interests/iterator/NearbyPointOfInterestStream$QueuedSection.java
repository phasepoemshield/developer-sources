/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package net.caffeinemc.mods.lithium.common.world.interests.iterator;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class NearbyPointOfInterestStream$QueuedSection
extends Record {
    final long sectionPos;
    final int minDistance;

    NearbyPointOfInterestStream$QueuedSection(long l, int n) {
        this.sectionPos = l;
        this.minDistance = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{NearbyPointOfInterestStream$QueuedSection.class, "sectionPos;minDistance", "sectionPos", "minDistance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{NearbyPointOfInterestStream$QueuedSection.class, "sectionPos;minDistance", "sectionPos", "minDistance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{NearbyPointOfInterestStream$QueuedSection.class, "sectionPos;minDistance", "sectionPos", "minDistance"}, this);
    }

    public int minDistance() {
        return this.minDistance;
    }

    public long sectionPos() {
        return this.sectionPos;
    }
}

