/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02294
 *  minecraft.class04832
 *  minecraft.class07078
 *  minecraft.class07438
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class02294;
import minecraft.class04832;
import minecraft.class07078;
import minecraft.class07438;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback$RegistrationHelper;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface LivingEntityFeatureRendererRegistrationCallback {
    public static final Event<LivingEntityFeatureRendererRegistrationCallback> EVENT = EventFactory.createArrayBacked(LivingEntityFeatureRendererRegistrationCallback.class, livingEntityFeatureRendererRegistrationCallbackArray -> (class070782, class022942, livingEntityFeatureRendererRegistrationCallback$RegistrationHelper, class048322) -> {
        for (LivingEntityFeatureRendererRegistrationCallback livingEntityFeatureRendererRegistrationCallback : livingEntityFeatureRendererRegistrationCallbackArray) {
            livingEntityFeatureRendererRegistrationCallback.registerRenderers((class07078<? extends class07438>)class070782, class022942, livingEntityFeatureRendererRegistrationCallback$RegistrationHelper, class048322);
        }
    });

    public void registerRenderers(class07078<? extends class07438> var1, class02294<?, ?, ?> var2, LivingEntityFeatureRendererRegistrationCallback$RegistrationHelper var3, class04832 var4);
}

