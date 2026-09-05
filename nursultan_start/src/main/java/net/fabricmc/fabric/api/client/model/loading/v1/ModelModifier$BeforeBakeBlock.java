/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08889
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import minecraft.class08889;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$BeforeBakeBlock$Context;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ModelModifier$BeforeBakeBlock {
    public class08889 modifyModelBeforeBake(class08889 var1, ModelModifier$BeforeBakeBlock$Context var2);
}

