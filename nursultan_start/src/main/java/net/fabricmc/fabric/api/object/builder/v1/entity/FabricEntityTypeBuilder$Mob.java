/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01325
 *  minecraft.class02875
 *  minecraft.class05300
 *  minecraft.class05946
 *  minecraft.class07040
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07428
 *  minecraft.class07441
 *  minecraft.class07448
 *  minecraft.class07830
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class00891;
import minecraft.class01325;
import minecraft.class02875;
import minecraft.class05300;
import minecraft.class05946;
import minecraft.class07040;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07428;
import minecraft.class07441;
import minecraft.class07448;
import minecraft.class07830;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder$Living;

@Deprecated
public class FabricEntityTypeBuilder$Mob<T extends class07079>
extends FabricEntityTypeBuilder$Living<T> {
    private class02875 spawnLocation;
    private class07830 restrictionHeightmap;
    private class07441<T> spawnPredicate;

    protected FabricEntityTypeBuilder$Mob(class07428 class074282, class07040<T> class070402) {
        super(class074282, class070402);
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> dimensions(class01325 class013252) {
        super.dimensions(class013252);
        return this;
    }

    @Override
    public class07078<T> build(class05946<class07078<?>> class059462) {
        class07078 class070782 = super.build(class059462);
        if (this.spawnPredicate != null) {
            class07448.N(class070782, (class02875)this.spawnLocation, (class07830)this.restrictionHeightmap, this.spawnPredicate);
        }
        return class070782;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> specificSpawnBlocks(class00891 ... class00891Array) {
        super.specificSpawnBlocks(class00891Array);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> spawnableFarFromPlayer() {
        super.spawnableFarFromPlayer();
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> forceTrackedVelocityUpdates(boolean bl) {
        super.forceTrackedVelocityUpdates(bl);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> fireImmune() {
        super.fireImmune();
        return this;
    }

    @Override
    @Deprecated
    public FabricEntityTypeBuilder$Mob<T> trackable(int n, int n2, boolean bl) {
        super.trackable(n, n2, bl);
        return this;
    }

    @Override
    @Deprecated
    public FabricEntityTypeBuilder$Mob<T> trackable(int n, int n2) {
        super.trackable(n, n2);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> spawnGroup(class07428 class074282) {
        super.spawnGroup(class074282);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> defaultAttributes(Supplier<class05300> supplier) {
        super.defaultAttributes(supplier);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> trackRangeChunks(int n) {
        super.trackRangeChunks(n);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> disableSummon() {
        super.disableSummon();
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> disableSaving() {
        super.disableSaving();
        return this;
    }

    @Override
    public <N extends T> FabricEntityTypeBuilder$Mob<N> entityFactory(class07040<N> class070402) {
        super.entityFactory((class07040)class070402);
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder$Mob<T> spawnRestriction(class02875 class028752, class07830 class078302, class07441<T> class074412) {
        this.spawnLocation = Objects.requireNonNull(class028752, "Spawn location cannot be null.");
        this.restrictionHeightmap = Objects.requireNonNull(class078302, "Heightmap type cannot be null.");
        this.spawnPredicate = Objects.requireNonNull(class074412, "Spawn predicate cannot be null.");
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> trackRangeBlocks(int n) {
        super.trackRangeBlocks(n);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Mob<T> trackedUpdateRate(int n) {
        super.trackedUpdateRate(n);
        return this;
    }
}

