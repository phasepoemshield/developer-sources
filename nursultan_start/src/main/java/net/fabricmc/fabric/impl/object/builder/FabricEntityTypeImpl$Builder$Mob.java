/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02875
 *  minecraft.class05300
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07441
 *  minecraft.class07448
 *  minecraft.class07830
 *  net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType$Builder$Mob
 */
package net.fabricmc.fabric.impl.object.builder;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class02875;
import minecraft.class05300;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07441;
import minecraft.class07448;
import minecraft.class07830;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl$Builder$Living;

public final class FabricEntityTypeImpl$Builder$Mob<T extends class07079>
extends FabricEntityTypeImpl$Builder$Living<T>
implements FabricEntityType.Builder.Mob<T> {
    private class02875 restrictionLocation;
    private class07830 restrictionHeightmap;
    private class07441<T> spawnPredicate;

    @Override
    public void onBuild(class07078<T> class070782) {
        super.onBuild(class070782);
        if (this.spawnPredicate != null) {
            class07448.N(class070782, (class02875)this.restrictionLocation, (class07830)this.restrictionHeightmap, this.spawnPredicate);
        }
    }

    @Override
    public FabricEntityType.Builder.Mob<T> defaultAttributes(Supplier<class05300> supplier) {
        super.defaultAttributes(supplier);
        return this;
    }

    public FabricEntityType.Builder.Mob<T> spawnRestriction(class02875 class028752, class07830 class078302, class07441<T> class074412) {
        this.restrictionLocation = Objects.requireNonNull(class028752, "Location cannot be null.");
        this.restrictionHeightmap = Objects.requireNonNull(class078302, "Heightmap type cannot be null.");
        this.spawnPredicate = Objects.requireNonNull(class074412, "Spawn predicate cannot be null.");
        return this;
    }
}

