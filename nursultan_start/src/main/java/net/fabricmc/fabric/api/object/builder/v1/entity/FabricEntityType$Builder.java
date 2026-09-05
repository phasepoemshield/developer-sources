/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07040
 *  minecraft.class07045
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07428
 *  minecraft.class07438
 *  net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl$Builder
 */
package net.fabricmc.fabric.api.object.builder.v1.entity;

import java.util.function.UnaryOperator;
import minecraft.class07040;
import minecraft.class07045;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07428;
import minecraft.class07438;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType$Builder$Living;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType$Builder$Mob;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl;

public interface FabricEntityType$Builder<T extends class07049> {
    public static <T extends class07438> class07045<T> createLiving(class07040<T> class070402, class07428 class074282, UnaryOperator<FabricEntityType$Builder$Living<T>> unaryOperator) {
        return FabricEntityTypeImpl.Builder.createLiving(class070402, (class07428)class074282, unaryOperator);
    }

    default public class07045<T> canPotentiallyExecuteCommands(boolean bl) {
        throw new AssertionError((Object)"Implemented in Mixin");
    }

    public static <T extends class07079> class07045<T> createMob(class07040<T> class070402, class07428 class074282, UnaryOperator<FabricEntityType$Builder$Mob<T>> unaryOperator) {
        return FabricEntityTypeImpl.Builder.createMob(class070402, (class07428)class074282, unaryOperator);
    }

    default public class07045<T> alwaysUpdateVelocity(boolean bl) {
        throw new AssertionError((Object)"Implemented in Mixin");
    }
}

