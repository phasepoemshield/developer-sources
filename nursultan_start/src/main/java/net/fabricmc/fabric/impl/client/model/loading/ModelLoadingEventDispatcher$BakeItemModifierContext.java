/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08895
 *  minecraft.class08905
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeItem$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeItem$Context
 */
package net.fabricmc.fabric.impl.client.model.loading;

import minecraft.class01894;
import minecraft.class08895;
import minecraft.class08905;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier;

@Environment(value=EnvType.CLIENT)
class ModelLoadingEventDispatcher$BakeItemModifierContext
implements ModelModifier.AfterBakeItem.Context,
ModelModifier.BeforeBakeItem.Context {
    private final class01894 itemId;
    private final class08905 bakeContext;
    private class08895 sourceModel;

    ModelLoadingEventDispatcher$BakeItemModifierContext(class01894 class018942, class08905 class089052) {
        this.itemId = class018942;
        this.bakeContext = class089052;
    }

    public class01894 itemId() {
        return this.itemId;
    }

    void prepareAfterBake(class08895 class088952) {
        this.sourceModel = class088952;
    }

    public class08895 sourceModel() {
        return this.sourceModel;
    }

    public class08905 bakeContext() {
        return this.bakeContext;
    }
}

