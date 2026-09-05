/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  minecraft.class07321
 */
package net.caffeinemc.mods.lithium.common.world.interests.iterator;

import it.unimi.dsi.fastutil.longs.LongIterator;
import minecraft.class07321;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.NearbyPointOfInterestStream;

class NearbyPointOfInterestStream$1
implements LongIterator {
    int x = 0;
    int fx = this.val$cx;
    int z = 0;
    int fz = this.val$cz;
    final /* synthetic */ int val$cx;
    final /* synthetic */ int val$cz;
    final /* synthetic */ int val$minX;
    final /* synthetic */ int val$maxX;
    final /* synthetic */ int val$minZ;
    final /* synthetic */ int val$maxZ;
    final /* synthetic */ NearbyPointOfInterestStream this$0;

    public long nextLong() {
        long l = class07321.u((int)this.fx, (int)this.fz);
        do {
            int n = this.z = this.z > 0 ? -this.z : 1 - this.z;
            if (this.z > this.this$0.ring) {
                int n2 = this.x = this.x > 0 ? -this.x : 1 - this.x;
                if (this.x > this.this$0.ring) {
                    this.x = 0;
                    ++this.this$0.ring;
                    this.this$0.closestRingDistanceSq = this.this$0.getPotentialRingDistanceSq();
                }
                this.z = this.x < this.this$0.ring && this.x > -this.this$0.ring ? this.this$0.ring : 0;
            }
            this.fx = this.val$cx + this.x;
            this.fz = this.val$cz + this.z;
        } while (this.this$0.ring <= this.this$0.ringMax && this.fx < this.val$minX || this.fx > this.val$maxX || this.fz < this.val$minZ || this.fz > this.val$maxZ);
        return l;
    }

    NearbyPointOfInterestStream$1() {
        this.this$0 = var1_1;
        this.val$cx = n;
        this.val$cz = n2;
        this.val$minX = n3;
        this.val$maxX = n4;
        this.val$minZ = n5;
        this.val$maxZ = n6;
    }

    public boolean hasNext() {
        return this.this$0.ring <= this.this$0.ringMax;
    }
}

