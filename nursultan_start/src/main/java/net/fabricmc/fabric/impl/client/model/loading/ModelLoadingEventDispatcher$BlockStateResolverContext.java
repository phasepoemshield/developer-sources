/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class08889
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver$Context
 */
package net.fabricmc.fabric.impl.client.model.loading;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.Objects;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class08889;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver;

@Environment(value=EnvType.CLIENT)
class ModelLoadingEventDispatcher$BlockStateResolverContext
implements BlockStateResolver.Context {
    private class00891 block;
    final Reference2ReferenceMap<class00500, class08889> models = new Reference2ReferenceOpenHashMap();

    void prepare(class00891 class008912) {
        this.block = class008912;
        this.models.clear();
    }

    ModelLoadingEventDispatcher$BlockStateResolverContext() {
    }

    public class00891 block() {
        return this.block;
    }

    public void setModel(class00500 class005002, class08889 class088892) {
        Objects.requireNonNull(class005002, "state cannot be null");
        Objects.requireNonNull(class088892, "model cannot be null");
        if (!class005002.N(this.block)) {
            throw new IllegalArgumentException("Attempted to set model for state " + String.valueOf(class005002) + " on block " + String.valueOf(this.block));
        }
        if (this.models.putIfAbsent((Object)class005002, (Object)class088892) != null) {
            throw new IllegalStateException("Duplicate model for state " + String.valueOf(class005002) + " on block " + String.valueOf(this.block));
        }
    }
}

