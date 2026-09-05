/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver
 *  net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeBlock
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeItem
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeBlock
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeItem
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoad
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoadBlock
 *  net.fabricmc.fabric.api.client.model.loading.v1.UnbakedExtraModel
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.client.model.loading;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedExtraModel;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class ModelLoadingPluginContextImpl
implements ModelLoadingPlugin.Context {
    private static final Logger LOGGER = LoggerFactory.getLogger(ModelLoadingPluginContextImpl.class);
    final Map<class00891, BlockStateResolver> blockStateResolvers = new IdentityHashMap<class00891, BlockStateResolver>();
    final Map<ExtraModelKey<?>, UnbakedExtraModel<?>> extraModels = new HashMap();
    private static final class01894[] MODEL_MODIFIER_PHASES = new class01894[]{ModelModifier.OVERRIDE_PHASE, ModelModifier.DEFAULT_PHASE, ModelModifier.WRAP_PHASE, ModelModifier.WRAP_LAST_PHASE};
    private final Event<ModelModifier.OnLoad> onLoadModifiers = EventFactory.createWithPhases(ModelModifier.OnLoad.class, onLoadArray -> (class001672, context) -> {
        for (ModelModifier.OnLoad onLoad : onLoadArray) {
            try {
                class001672 = onLoad.modifyModelOnLoad(class001672, context);
            }
            catch (Exception exception) {
                LOGGER.error("Failed to modify unbaked model on load", (Throwable)exception);
            }
        }
        return class001672;
    }, (class01894[])MODEL_MODIFIER_PHASES);
    private final Event<ModelModifier.OnLoadBlock> onLoadBlockModifiers = EventFactory.createWithPhases(ModelModifier.OnLoadBlock.class, onLoadBlockArray -> (class088892, context) -> {
        for (ModelModifier.OnLoadBlock onLoadBlock : onLoadBlockArray) {
            try {
                class088892 = onLoadBlock.modifyModelOnLoad(class088892, context);
            }
            catch (Exception exception) {
                LOGGER.error("Failed to modify unbaked block model on load", (Throwable)exception);
            }
        }
        return class088892;
    }, (class01894[])MODEL_MODIFIER_PHASES);
    private final Event<ModelModifier.BeforeBakeBlock> beforeBakeBlockModifiers = EventFactory.createWithPhases(ModelModifier.BeforeBakeBlock.class, beforeBakeBlockArray -> (class088892, context) -> {
        for (ModelModifier.BeforeBakeBlock beforeBakeBlock : beforeBakeBlockArray) {
            try {
                class088892 = beforeBakeBlock.modifyModelBeforeBake(class088892, context);
            }
            catch (Exception exception) {
                LOGGER.error("Failed to modify unbaked block model before bake", (Throwable)exception);
            }
        }
        return class088892;
    }, (class01894[])MODEL_MODIFIER_PHASES);
    private final Event<ModelModifier.AfterBakeBlock> afterBakeBlockModifiers = EventFactory.createWithPhases(ModelModifier.AfterBakeBlock.class, afterBakeBlockArray -> (class088872, context) -> {
        for (ModelModifier.AfterBakeBlock afterBakeBlock : afterBakeBlockArray) {
            try {
                class088872 = afterBakeBlock.modifyModelAfterBake(class088872, context);
            }
            catch (Exception exception) {
                LOGGER.error("Failed to modify baked block model after bake", (Throwable)exception);
            }
        }
        return class088872;
    }, (class01894[])MODEL_MODIFIER_PHASES);
    private final Event<ModelModifier.BeforeBakeItem> beforeBakeItemModifiers = EventFactory.createWithPhases(ModelModifier.BeforeBakeItem.class, beforeBakeItemArray -> (class088952, context) -> {
        for (ModelModifier.BeforeBakeItem beforeBakeItem : beforeBakeItemArray) {
            try {
                class088952 = beforeBakeItem.modifyModelBeforeBake(class088952, context);
            }
            catch (Exception exception) {
                LOGGER.error("Failed to modify unbaked item model before bake", (Throwable)exception);
            }
        }
        return class088952;
    }, (class01894[])MODEL_MODIFIER_PHASES);
    private final Event<ModelModifier.AfterBakeItem> afterBakeItemModifiers = EventFactory.createWithPhases(ModelModifier.AfterBakeItem.class, afterBakeItemArray -> (class089102, context) -> {
        for (ModelModifier.AfterBakeItem afterBakeItem : afterBakeItemArray) {
            try {
                class089102 = afterBakeItem.modifyModelAfterBake(class089102, context);
            }
            catch (Exception exception) {
                LOGGER.error("Failed to modify baked item model after bake", (Throwable)exception);
            }
        }
        return class089102;
    }, (class01894[])MODEL_MODIFIER_PHASES);

    public Event<ModelModifier.AfterBakeBlock> modifyBlockModelAfterBake() {
        return this.afterBakeBlockModifiers;
    }

    public void registerBlockStateResolver(class00891 class008912, BlockStateResolver blockStateResolver) {
        Objects.requireNonNull(class008912, "block cannot be null");
        Objects.requireNonNull(blockStateResolver, "resolver cannot be null");
        Optional optional = class04206.i.u((Object)class008912);
        if (optional.isEmpty()) {
            throw new IllegalArgumentException("Received unregistered block");
        }
        if (this.blockStateResolvers.put(class008912, blockStateResolver) != null) {
            throw new IllegalArgumentException("Duplicate block state resolver for " + String.valueOf(class008912));
        }
    }

    public Event<ModelModifier.BeforeBakeBlock> modifyBlockModelBeforeBake() {
        return this.beforeBakeBlockModifiers;
    }

    public Event<ModelModifier.BeforeBakeItem> modifyItemModelBeforeBake() {
        return this.beforeBakeItemModifiers;
    }

    public Event<ModelModifier.OnLoadBlock> modifyBlockModelOnLoad() {
        return this.onLoadBlockModifiers;
    }

    public Event<ModelModifier.AfterBakeItem> modifyItemModelAfterBake() {
        return this.afterBakeItemModifiers;
    }

    public <T> void addModel(ExtraModelKey<T> extraModelKey, UnbakedExtraModel<T> unbakedExtraModel) {
        Objects.requireNonNull(extraModelKey, "key cannot be null");
        Objects.requireNonNull(unbakedExtraModel, "model cannot be null");
        if (this.extraModels.putIfAbsent(extraModelKey, unbakedExtraModel) != null) {
            throw new IllegalArgumentException("Already have a model for this key");
        }
    }

    public Event<ModelModifier.OnLoad> modifyModelOnLoad() {
        return this.onLoadModifiers;
    }
}

