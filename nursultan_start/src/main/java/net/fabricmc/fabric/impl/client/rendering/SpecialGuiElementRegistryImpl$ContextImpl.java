/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01422
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry$Context
 */
package net.fabricmc.fabric.impl.client.rendering;

import minecraft.class01237;
import minecraft.class01422;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry;

@Environment(value=EnvType.CLIENT)
record SpecialGuiElementRegistryImpl$ContextImpl(class06202 client, class01422 vertexConsumers, class01237 orderedRenderCommandQueue) implements SpecialGuiElementRegistry.Context
{
}

