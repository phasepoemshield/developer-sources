/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01325
 *  minecraft.class05300
 *  minecraft.class05946
 *  minecraft.class07040
 *  minecraft.class07078
 *  minecraft.class07428
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class00891;
import minecraft.class01325;
import minecraft.class05300;
import minecraft.class05946;
import minecraft.class07040;
import minecraft.class07078;
import minecraft.class07428;
import minecraft.class07438;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import org.jspecify.annotations.Nullable;

@Deprecated
public class FabricEntityTypeBuilder$Living<T extends class07438>
extends FabricEntityTypeBuilder<T> {
    private @Nullable Supplier<class05300> defaultAttributeBuilder;

    protected FabricEntityTypeBuilder$Living(class07428 class074282, class07040<T> class070402) {
        super(class074282, class070402);
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> dimensions(class01325 class013252) {
        super.dimensions(class013252);
        return this;
    }

    @Override
    @Deprecated
    public class07078<T> build(class05946<class07078<?>> class059462) {
        class07078 class070782 = super.build(class059462);
        if (this.defaultAttributeBuilder != null) {
            FabricDefaultAttributeRegistry.register(class070782, this.defaultAttributeBuilder.get());
        }
        return class070782;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> specificSpawnBlocks(class00891 ... class00891Array) {
        super.specificSpawnBlocks(class00891Array);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> spawnableFarFromPlayer() {
        super.spawnableFarFromPlayer();
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> forceTrackedVelocityUpdates(boolean bl) {
        super.forceTrackedVelocityUpdates(bl);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> fireImmune() {
        super.fireImmune();
        return this;
    }

    @Override
    @Deprecated
    public FabricEntityTypeBuilder$Living<T> trackable(int n, int n2) {
        super.trackable(n, n2);
        return this;
    }

    @Override
    @Deprecated
    public FabricEntityTypeBuilder$Living<T> trackable(int n, int n2, boolean bl) {
        super.trackable(n, n2, bl);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> spawnGroup(class07428 class074282) {
        super.spawnGroup(class074282);
        return this;
    }

    @Deprecated
    public FabricEntityTypeBuilder$Living<T> defaultAttributes(Supplier<class05300> supplier) {
        Objects.requireNonNull(supplier, "Cannot set null attribute builder");
        this.defaultAttributeBuilder = supplier;
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> trackRangeChunks(int n) {
        super.trackRangeChunks(n);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> disableSummon() {
        super.disableSummon();
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> disableSaving() {
        super.disableSaving();
        return this;
    }

    @Override
    public <N extends T> FabricEntityTypeBuilder$Living<N> entityFactory(class07040<N> class070402) {
        super.entityFactory(class070402);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> trackRangeBlocks(int n) {
        super.trackRangeBlocks(n);
        return this;
    }

    @Override
    public FabricEntityTypeBuilder$Living<T> trackedUpdateRate(int n) {
        super.trackedUpdateRate(n);
        return this;
    }
}

