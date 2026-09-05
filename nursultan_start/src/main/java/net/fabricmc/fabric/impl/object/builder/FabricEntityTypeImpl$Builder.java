/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07040
 *  minecraft.class07045
 *  minecraft.class07079
 *  minecraft.class07428
 *  minecraft.class07438
 *  net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType$Builder$Living
 *  net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType$Builder$Mob
 */
package net.fabricmc.fabric.impl.object.builder;

import java.util.function.UnaryOperator;
import minecraft.class07040;
import minecraft.class07045;
import minecraft.class07079;
import minecraft.class07428;
import minecraft.class07438;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl$Builder$Living;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl$Builder$Mob;

public interface FabricEntityTypeImpl$Builder {
    public static <T extends class07438> class07045<T> createLiving(class07040<T> class070402, class07428 class074282, UnaryOperator<FabricEntityType.Builder.Living<T>> unaryOperator) {
        class07045 class070452 = class07045.N(class070402, (class07428)class074282);
        FabricEntityTypeImpl$Builder$Living fabricEntityTypeImpl$Builder$Living = new FabricEntityTypeImpl$Builder$Living();
        unaryOperator.apply(fabricEntityTypeImpl$Builder$Living);
        ((FabricEntityTypeImpl$Builder)class070452).fabric_setLivingEntityBuilder(fabricEntityTypeImpl$Builder$Living);
        return class070452;
    }

    public void fabric_setLivingEntityBuilder(FabricEntityTypeImpl$Builder$Living<? extends class07438> var1);

    public static <T extends class07079> class07045<T> createMob(class07040<T> class070402, class07428 class074282, UnaryOperator<FabricEntityType.Builder.Mob<T>> unaryOperator) {
        class07045 class070452 = class07045.N(class070402, (class07428)class074282);
        FabricEntityTypeImpl$Builder$Mob fabricEntityTypeImpl$Builder$Mob = new FabricEntityTypeImpl$Builder$Mob();
        unaryOperator.apply(fabricEntityTypeImpl$Builder$Mob);
        ((FabricEntityTypeImpl$Builder)class070452).fabric_setMobEntityBuilder(fabricEntityTypeImpl$Builder$Mob);
        return class070452;
    }

    public void fabric_setMobEntityBuilder(FabricEntityTypeImpl$Builder$Mob<? extends class07079> var1);
}

