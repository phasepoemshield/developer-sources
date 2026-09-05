/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00891
 *  minecraft.class01325
 *  minecraft.class02957
 *  minecraft.class05946
 *  minecraft.class07040
 *  minecraft.class07045
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07428
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import com.google.common.collect.ImmutableSet;
import java.util.Objects;
import minecraft.class00891;
import minecraft.class01325;
import minecraft.class02957;
import minecraft.class05946;
import minecraft.class07040;
import minecraft.class07045;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07299;
import minecraft.class07428;
import minecraft.class07438;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder$Living;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder$Mob;
import org.jspecify.annotations.Nullable;

@Deprecated
public class FabricEntityTypeBuilder<T extends class07049> {
    private class07428 spawnGroup;
    private class07040<T> factory;
    private boolean saveable = true;
    private boolean summonable = true;
    private int trackRange = 5;
    private int trackedUpdateRate = 3;
    private Boolean forceTrackedVelocityUpdates;
    private boolean fireImmune = false;
    private boolean spawnableFarFromPlayer;
    private class01325 dimensions = class01325.y((float)-1.0f, (float)-1.0f);
    private ImmutableSet<class00891> specificSpawnBlocks = ImmutableSet.of();
    private @Nullable class02957[] requiredFeatures = null;

    @Deprecated
    public static <T extends class07049> FabricEntityTypeBuilder<T> create(class07428 class074282) {
        return FabricEntityTypeBuilder.create(class074282, FabricEntityTypeBuilder::emptyFactory);
    }

    @Deprecated
    public static <T extends class07049> FabricEntityTypeBuilder<T> create() {
        return FabricEntityTypeBuilder.create(class07428.field_17715);
    }

    @Deprecated
    public static <T extends class07049> FabricEntityTypeBuilder<T> create(class07428 class074282, class07040<T> class070402) {
        return new FabricEntityTypeBuilder<T>(class074282, class070402);
    }

    protected FabricEntityTypeBuilder(class07428 class074282, class07040<T> class070402) {
        this.spawnGroup = class074282;
        this.factory = class070402;
        this.spawnableFarFromPlayer = class074282 == class07428.field_6294 || class074282 == class07428.field_17715;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> dimensions(class01325 class013252) {
        Objects.requireNonNull(class013252, "Cannot set null dimensions");
        this.dimensions = class013252;
        return this;
    }

    @Deprecated
    public class07078<T> build(class05946<class07078<?>> class059462) {
        class07045 class070452 = class07045.N(this.factory, (class07428)this.spawnGroup).N((class00891[])this.specificSpawnBlocks.toArray(class00891[]::new)).N(this.trackRange).y(this.trackedUpdateRate).N(this.dimensions.N(), this.dimensions.y());
        if (!this.saveable) {
            class070452 = class070452.y();
        }
        if (!this.summonable) {
            class070452 = class070452.N();
        }
        if (this.fireImmune) {
            class070452 = class070452.L();
        }
        if (this.spawnableFarFromPlayer) {
            class070452 = class070452.u();
        }
        if (this.requiredFeatures != null) {
            class070452 = class070452.N(this.requiredFeatures);
        }
        if (this.forceTrackedVelocityUpdates != null) {
            class070452 = class070452.alwaysUpdateVelocity(this.forceTrackedVelocityUpdates.booleanValue());
        }
        return class070452.N(class059462);
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> requires(class02957 ... class02957Array) {
        this.requiredFeatures = class02957Array;
        return this;
    }

    @Deprecated
    public static <T extends class07438> FabricEntityTypeBuilder$Living<T> createLiving() {
        return new FabricEntityTypeBuilder$Living(class07428.field_17715, FabricEntityTypeBuilder::emptyFactory);
    }

    public static <T extends class07079> FabricEntityTypeBuilder$Mob<T> createMob() {
        return new FabricEntityTypeBuilder$Mob(class07428.field_17715, FabricEntityTypeBuilder::emptyFactory);
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> specificSpawnBlocks(class00891 ... class00891Array) {
        this.specificSpawnBlocks = ImmutableSet.copyOf((Object[])class00891Array);
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> spawnableFarFromPlayer() {
        this.spawnableFarFromPlayer = true;
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> forceTrackedVelocityUpdates(boolean bl) {
        this.forceTrackedVelocityUpdates = bl;
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> fireImmune() {
        this.fireImmune = true;
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> trackable(int n, int n2) {
        return this.trackable(n, n2, true);
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> trackable(int n, int n2, boolean bl) {
        this.trackRangeBlocks(n);
        this.trackedUpdateRate(n2);
        this.forceTrackedVelocityUpdates(bl);
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> spawnGroup(class07428 class074282) {
        Objects.requireNonNull(class074282, "Spawn group cannot be null");
        this.spawnGroup = class074282;
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> trackRangeChunks(int n) {
        this.trackRange = n;
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> disableSummon() {
        this.summonable = false;
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> disableSaving() {
        this.saveable = false;
        return this;
    }

    @Deprecated
    public <N extends T> FabricEntityTypeBuilder<N> entityFactory(class07040<N> class070402) {
        Objects.requireNonNull(class070402, "Entity Factory cannot be null");
        this.factory = class070402;
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> trackRangeBlocks(int n) {
        return this.trackRangeChunks((n + 15) / 16);
    }

    private static <T extends class07049> T emptyFactory(class07078<T> class070782, class07299 class072992) {
        return null;
    }

    @Deprecated
    public FabricEntityTypeBuilder<T> trackedUpdateRate(int n) {
        this.trackedUpdateRate = n;
        return this;
    }
}

