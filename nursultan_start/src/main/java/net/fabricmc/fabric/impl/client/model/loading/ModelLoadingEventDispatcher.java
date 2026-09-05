/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  minecraft.class00167
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class02028
 *  minecraft.class02572
 *  minecraft.class08887
 *  minecraft.class08889
 *  minecraft.class08895
 *  minecraft.class08905
 *  minecraft.class08910
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver
 *  net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeBlock
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeBlock$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeItem
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeItem$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeBlock
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeBlock$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeItem
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeItem$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoad
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoad$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoadBlock
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoadBlock$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.UnbakedExtraModel
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.client.model.loading;

import com.google.common.collect.ImmutableList;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class00167;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class02028;
import minecraft.class02572;
import minecraft.class08887;
import minecraft.class08889;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08910;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedExtraModel;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher$BakeBlockModifierContext;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher$BakeItemModifierContext;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher$BlockStateResolverContext;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher$OnLoadBlockModifierContext;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher$OnLoadModifierContext;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginContextImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class ModelLoadingEventDispatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(ModelLoadingEventDispatcher.class);
    public static final ThreadLocal<ModelLoadingEventDispatcher> CURRENT = new ThreadLocal();
    private final ModelLoadingPluginContextImpl pluginContext;
    private final ModelLoadingEventDispatcher$BlockStateResolverContext blockStateResolverContext = new ModelLoadingEventDispatcher$BlockStateResolverContext();
    private final ModelLoadingEventDispatcher$OnLoadModifierContext onLoadModifierContext = new ModelLoadingEventDispatcher$OnLoadModifierContext();
    private final ModelLoadingEventDispatcher$OnLoadBlockModifierContext onLoadBlockModifierContext = new ModelLoadingEventDispatcher$OnLoadBlockModifierContext();

    public ModelLoadingEventDispatcher(List<ModelLoadingPlugin> list) {
        this.pluginContext = new ModelLoadingPluginContextImpl();
        for (ModelLoadingPlugin modelLoadingPlugin : list) {
            try {
                modelLoadingPlugin.initialize((ModelLoadingPlugin.Context)this.pluginContext);
            }
            catch (Exception exception) {
                LOGGER.error("Failed to initialize model loading plugin", (Throwable)exception);
            }
        }
    }

    private void putResolvedBlockStates(Map<class00500, class08889> map) {
        this.pluginContext.blockStateResolvers.forEach((class008912, blockStateResolver) -> this.resolveBlockStates((BlockStateResolver)blockStateResolver, (class00891)class008912, map::put));
    }

    public class08887 modifyBlockModel(class08889 class088892, class00500 class005002, class02028 class020282, Operation<class08887> operation) {
        ModelLoadingEventDispatcher$BakeBlockModifierContext modelLoadingEventDispatcher$BakeBlockModifierContext = new ModelLoadingEventDispatcher$BakeBlockModifierContext(class005002, class020282);
        class088892 = ((ModelModifier.BeforeBakeBlock)this.pluginContext.modifyBlockModelBeforeBake().invoker()).modifyModelBeforeBake(class088892, (ModelModifier.BeforeBakeBlock.Context)modelLoadingEventDispatcher$BakeBlockModifierContext);
        class08887 class088872 = (class08887)operation.call(new Object[]{class088892, class005002, class020282});
        modelLoadingEventDispatcher$BakeBlockModifierContext.prepareAfterBake(class088892);
        return ((ModelModifier.AfterBakeBlock)this.pluginContext.modifyBlockModelAfterBake().invoker()).modifyModelAfterBake(class088872, (ModelModifier.AfterBakeBlock.Context)modelLoadingEventDispatcher$BakeBlockModifierContext);
    }

    public class08910 modifyItemModel(class08895 class088952, class01894 class018942, class08905 class089052, Operation<class08910> operation) {
        ModelLoadingEventDispatcher$BakeItemModifierContext modelLoadingEventDispatcher$BakeItemModifierContext = new ModelLoadingEventDispatcher$BakeItemModifierContext(class018942, class089052);
        class088952 = ((ModelModifier.BeforeBakeItem)this.pluginContext.modifyItemModelBeforeBake().invoker()).modifyModelBeforeBake(class088952, (ModelModifier.BeforeBakeItem.Context)modelLoadingEventDispatcher$BakeItemModifierContext);
        class08910 class089102 = (class08910)operation.call(new Object[]{class088952, class089052});
        modelLoadingEventDispatcher$BakeItemModifierContext.prepareAfterBake(class088952);
        return ((ModelModifier.AfterBakeItem)this.pluginContext.modifyItemModelAfterBake().invoker()).modifyModelAfterBake(class089102, (ModelModifier.AfterBakeItem.Context)modelLoadingEventDispatcher$BakeItemModifierContext);
    }

    public Map<ExtraModelKey<?>, UnbakedExtraModel<?>> getExtraModels() {
        return this.pluginContext.extraModels;
    }

    public Map<class01894, class00167> modifyModelsOnLoad(Map<class01894, class00167> map) {
        if (!(map instanceof HashMap)) {
            map = new HashMap<class01894, class00167>(map);
        }
        map.replaceAll(this::modifyModelOnLoad);
        return map;
    }

    private class08889 modifyBlockModelOnLoad(class00500 class005002, class08889 class088892) {
        this.onLoadBlockModifierContext.prepare(class005002);
        return ((ModelModifier.OnLoadBlock)this.pluginContext.modifyBlockModelOnLoad().invoker()).modifyModelOnLoad(class088892, (ModelModifier.OnLoadBlock.Context)this.onLoadBlockModifierContext);
    }

    public class02572 modifyBlockModelsOnLoad(class02572 class025722) {
        HashMap<class00500, Object> hashMap = class025722.N();
        if (!(hashMap instanceof HashMap)) {
            hashMap = new HashMap<class00500, Object>(hashMap);
            class025722 = new class02572(hashMap);
        }
        this.putResolvedBlockStates((Map<class00500, class08889>)hashMap);
        hashMap.replaceAll(this::modifyBlockModelOnLoad);
        return class025722;
    }

    private class00167 modifyModelOnLoad(class01894 class018942, class00167 class001672) {
        this.onLoadModifierContext.prepare(class018942);
        return ((ModelModifier.OnLoad)this.pluginContext.modifyModelOnLoad().invoker()).modifyModelOnLoad(class001672, (ModelModifier.OnLoad.Context)this.onLoadModifierContext);
    }

    private void resolveBlockStates(BlockStateResolver blockStateResolver, class00891 class008912, BiConsumer<class00500, class08889> biConsumer) {
        ModelLoadingEventDispatcher$BlockStateResolverContext modelLoadingEventDispatcher$BlockStateResolverContext = this.blockStateResolverContext;
        modelLoadingEventDispatcher$BlockStateResolverContext.prepare(class008912);
        Reference2ReferenceMap<class00500, class08889> reference2ReferenceMap = modelLoadingEventDispatcher$BlockStateResolverContext.models;
        ImmutableList immutableList = class008912.E().N();
        boolean bl = false;
        try {
            blockStateResolver.resolveBlockStates((BlockStateResolver.Context)modelLoadingEventDispatcher$BlockStateResolverContext);
        }
        catch (Exception exception) {
            LOGGER.error("Failed to resolve block state models for block {}. Using missing model for all states.", (Object)class008912, (Object)exception);
            bl = true;
        }
        if (!bl) {
            if (reference2ReferenceMap.size() == immutableList.size()) {
                reference2ReferenceMap.forEach(biConsumer);
            } else {
                for (class00500 class005002 : immutableList) {
                    class08889 class088892 = (class08889)reference2ReferenceMap.get((Object)class005002);
                    if (class088892 == null) {
                        LOGGER.error("Block state resolver did not provide a model for state {} in block {}. Using missing model.", (Object)class005002, (Object)class008912);
                        continue;
                    }
                    biConsumer.accept(class005002, class088892);
                }
            }
        }
        reference2ReferenceMap.clear();
    }
}

