/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class02028
 *  minecraft.class08889
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeBlock$Context
 *  net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeBlock$Context
 */
package net.fabricmc.fabric.impl.client.model.loading;

import minecraft.class00500;
import minecraft.class02028;
import minecraft.class08889;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier;

@Environment(value=EnvType.CLIENT)
class ModelLoadingEventDispatcher$BakeBlockModifierContext
implements ModelModifier.AfterBakeBlock.Context,
ModelModifier.BeforeBakeBlock.Context {
    private final class00500 state;
    private final class02028 baker;
    private class08889 sourceModel;

    ModelLoadingEventDispatcher$BakeBlockModifierContext(class00500 class005002, class02028 class020282) {
        this.state = class005002;
        this.baker = class020282;
    }

    public class00500 state() {
        return this.state;
    }

    void prepareAfterBake(class08889 class088892) {
        this.sourceModel = class088892;
    }

    public class02028 baker() {
        return this.baker;
    }

    public class08889 sourceModel() {
        return this.sourceModel;
    }
}

