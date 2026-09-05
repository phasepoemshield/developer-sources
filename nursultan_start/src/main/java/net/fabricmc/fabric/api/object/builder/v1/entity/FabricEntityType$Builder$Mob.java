/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02875
 *  minecraft.class05300
 *  minecraft.class07079
 *  minecraft.class07441
 *  minecraft.class07830
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import java.util.function.Supplier;
import minecraft.class02875;
import minecraft.class05300;
import minecraft.class07079;
import minecraft.class07441;
import minecraft.class07830;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType$Builder$Living;

public interface FabricEntityType$Builder$Mob<T extends class07079>
extends FabricEntityType$Builder$Living<T> {
    @Override
    public FabricEntityType$Builder$Mob<T> defaultAttributes(Supplier<class05300> var1);

    public FabricEntityType$Builder$Mob<T> spawnRestriction(class02875 var1, class07830 var2, class07441<T> var3);
}

