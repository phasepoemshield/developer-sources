/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08910
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import minecraft.class08910;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier$AfterBakeItem$Context;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ModelModifier$AfterBakeItem {
    public class08910 modifyModelAfterBake(class08910 var1, ModelModifier$AfterBakeItem$Context var2);
}

