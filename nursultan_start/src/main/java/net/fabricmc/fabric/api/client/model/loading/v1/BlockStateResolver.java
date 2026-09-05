/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.BlockStateResolver$Context;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface BlockStateResolver {
    public void resolveBlockStates(BlockStateResolver$Context var1);
}

