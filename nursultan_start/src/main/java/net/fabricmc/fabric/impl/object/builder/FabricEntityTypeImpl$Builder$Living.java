/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05300
 *  minecraft.class07078
 *  minecraft.class07438
 *  net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry
 *  net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType$Builder$Living
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.object.builder;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class05300;
import minecraft.class07078;
import minecraft.class07438;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl$Builder$Mob;
import org.jspecify.annotations.Nullable;

public sealed class FabricEntityTypeImpl$Builder$Living<T extends class07438>
implements FabricEntityType.Builder.Living<T>
permits FabricEntityTypeImpl.Builder.Mob {
    private @Nullable Supplier<class05300> defaultAttributeBuilder;

    public void onBuild(class07078<T> class070782) {
        if (this.defaultAttributeBuilder != null) {
            FabricDefaultAttributeRegistry.register(class070782, (class05300)this.defaultAttributeBuilder.get());
        }
    }

    public FabricEntityType.Builder.Living<T> defaultAttributes(Supplier<class05300> supplier) {
        Objects.requireNonNull(supplier, "Cannot set null attribute builder");
        this.defaultAttributeBuilder = supplier;
        return this;
    }
}

