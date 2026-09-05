/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeBlock$Context;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ModelModifier$AfterBakeBlock {
    public class08887 modifyModelAfterBake(class08887 var1, ModelModifier$AfterBakeBlock$Context var2);
}

