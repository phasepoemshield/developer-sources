/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.types.Type
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00891
 *  net.fabricmc.fabric.impl.object.builder.ExtendedBlockEntityType
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.object.builder.v1.block.entity;

import com.mojang.datafixers.types.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00891;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder$Factory;
import net.fabricmc.fabric.impl.object.builder.ExtendedBlockEntityType;
import org.jspecify.annotations.Nullable;

public final class FabricBlockEntityTypeBuilder<T extends class00394> {
    private final FabricBlockEntityTypeBuilder$Factory<? extends T> factory;
    private final Set<class00891> blocks = new HashSet<class00891>();
    private @Nullable Boolean canPotentiallyExecuteCommands = null;

    public static <T extends class00394> FabricBlockEntityTypeBuilder<T> create(FabricBlockEntityTypeBuilder$Factory<? extends T> fabricBlockEntityTypeBuilder$Factory, class00891 ... class00891Array) {
        return new FabricBlockEntityTypeBuilder<T>(fabricBlockEntityTypeBuilder$Factory).addBlocks(class00891Array);
    }

    private FabricBlockEntityTypeBuilder(FabricBlockEntityTypeBuilder$Factory<? extends T> fabricBlockEntityTypeBuilder$Factory) {
        this.factory = fabricBlockEntityTypeBuilder$Factory;
    }

    @Deprecated
    public class00404<T> build(@Nullable Type<?> type) {
        return this.build();
    }

    public class00404<T> build() {
        return new ExtendedBlockEntityType(this.factory::create, new HashSet<class00891>(this.blocks), this.canPotentiallyExecuteCommands);
    }

    public FabricBlockEntityTypeBuilder<T> canPotentiallyExecuteCommands(boolean bl) {
        this.canPotentiallyExecuteCommands = bl;
        return this;
    }

    public FabricBlockEntityTypeBuilder<T> addBlocks(Collection<? extends class00891> collection) {
        this.blocks.addAll(collection);
        return this;
    }

    public FabricBlockEntityTypeBuilder<T> addBlocks(class00891 ... class00891Array) {
        Collections.addAll(this.blocks, class00891Array);
        return this;
    }

    public FabricBlockEntityTypeBuilder<T> addBlock(class00891 class008912) {
        this.blocks.add(class008912);
        return this;
    }
}

