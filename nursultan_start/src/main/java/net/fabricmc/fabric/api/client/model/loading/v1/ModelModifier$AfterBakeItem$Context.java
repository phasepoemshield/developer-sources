/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08895
 *  minecraft.class08905
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import minecraft.class01894;
import minecraft.class08895;
import minecraft.class08905;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface ModelModifier$AfterBakeItem$Context {
    public class01894 itemId();

    public class08895 sourceModel();

    public class08905 bakeContext();
}

