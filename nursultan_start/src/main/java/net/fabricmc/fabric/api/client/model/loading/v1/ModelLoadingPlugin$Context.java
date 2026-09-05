/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import minecraft.class00891;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeBlock;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeItem;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeBlock;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeItem;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoad;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoadBlock;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedExtraModel;
import net.fabricmc.fabric.api.event.Event;

@Environment(value=EnvType.CLIENT)
public interface ModelLoadingPlugin$Context {
    public Event<ModelModifier.AfterBakeBlock> modifyBlockModelAfterBake();

    public void registerBlockStateResolver(class00891 var1, BlockStateResolver var2);

    public Event<ModelModifier.BeforeBakeBlock> modifyBlockModelBeforeBake();

    public Event<ModelModifier.BeforeBakeItem> modifyItemModelBeforeBake();

    public Event<ModelModifier.OnLoadBlock> modifyBlockModelOnLoad();

    public Event<ModelModifier.AfterBakeItem> modifyItemModelAfterBake();

    public <T> void addModel(ExtraModelKey<T> var1, UnbakedExtraModel<T> var2);

    public Event<ModelModifier.OnLoad> modifyModelOnLoad();
}

