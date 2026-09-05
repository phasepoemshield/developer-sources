/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02028
 *  minecraft.class04673
 *  minecraft.class08350
 *  minecraft.class08431
 *  minecraft.class08510
 *  minecraft.class08529
 *  minecraft.class08838
 *  minecraft.class08857
 *  minecraft.class08877
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import java.util.function.BiFunction;
import minecraft.class01894;
import minecraft.class02028;
import minecraft.class04673;
import minecraft.class08350;
import minecraft.class08431;
import minecraft.class08510;
import minecraft.class08529;
import minecraft.class08838;
import minecraft.class08857;
import minecraft.class08877;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedExtraModel;

@Environment(value=EnvType.CLIENT)
public final class SimpleUnbakedExtraModel<T>
implements UnbakedExtraModel<T> {
    private final class01894 model;
    private final BiFunction<class08529, class02028, T> bake;

    public SimpleUnbakedExtraModel(class01894 class018942, BiFunction<class08529, class02028, T> biFunction) {
        this.model = class018942;
        this.bake = biFunction;
    }

    @Override
    public T bake(class02028 class020282) {
        return this.bake.apply(class020282.N(this.model), class020282);
    }

    public void method_62326(class08350 class083502) {
        class083502.markDependency(this.model);
    }

    public static SimpleUnbakedExtraModel<class08887> blockStateModel(class01894 class018942) {
        return SimpleUnbakedExtraModel.blockStateModel(class018942, (class04673)class08510.N);
    }

    public static SimpleUnbakedExtraModel<class08887> blockStateModel(class01894 class018942, class04673 class046732) {
        return new SimpleUnbakedExtraModel<class08887>(class018942, (class085292, class020282) -> {
            class08838 class088382 = class085292.B();
            return new class08857((class08877)new class08431(class085292.N(class088382, class020282, class046732), class085292.u(), class085292.N(class088382, class020282)));
        });
    }
}

