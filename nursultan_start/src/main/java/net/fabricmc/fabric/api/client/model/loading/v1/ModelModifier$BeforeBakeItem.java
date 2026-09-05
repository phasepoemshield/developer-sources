/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08895
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import minecraft.class08895;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeItem$Context;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ModelModifier$BeforeBakeItem {
    public class08895 modifyModelBeforeBake(class08895 var1, ModelModifier$BeforeBakeItem$Context var2);
}

