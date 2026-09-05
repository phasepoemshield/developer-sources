/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00167
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import minecraft.class00167;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$OnLoad$Context;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ModelModifier$OnLoad {
    public class00167 modifyModelOnLoad(class00167 var1, ModelModifier$OnLoad$Context var2);
}

