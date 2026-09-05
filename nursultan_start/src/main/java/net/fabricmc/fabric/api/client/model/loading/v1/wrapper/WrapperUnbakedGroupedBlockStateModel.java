/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class02028
 *  minecraft.class08350
 *  minecraft.class08887
 *  minecraft.class08889
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1.wrapper;

import minecraft.class00500;
import minecraft.class02028;
import minecraft.class08350;
import minecraft.class08887;
import minecraft.class08889;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public abstract class WrapperUnbakedGroupedBlockStateModel
implements class08889 {
    protected class08889 wrapped;

    protected WrapperUnbakedGroupedBlockStateModel() {
    }

    protected WrapperUnbakedGroupedBlockStateModel(class08889 class088892) {
        this.wrapped = class088892;
    }

    public class08887 method_65542(class00500 class005002, class02028 class020282) {
        return this.wrapped.method_65542(class005002, class020282);
    }

    public void method_62326(class08350 class083502) {
        this.wrapped.method_62326(class083502);
    }

    public Object method_62332(class00500 class005002) {
        return this.wrapped.method_62332(class005002);
    }
}

