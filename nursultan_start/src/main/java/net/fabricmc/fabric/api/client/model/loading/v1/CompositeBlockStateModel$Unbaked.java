/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08880
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.CompositeBlockStateModelImpl$Unbaked
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import java.util.List;
import minecraft.class08880;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.CustomUnbakedBlockStateModel;
import net.fabricmc.fabric.impl.client.model.loading.CompositeBlockStateModelImpl;

@Environment(value=EnvType.CLIENT)
public interface CompositeBlockStateModel$Unbaked
extends CustomUnbakedBlockStateModel {
    public static CompositeBlockStateModel$Unbaked of(List<class08880> list) {
        return CompositeBlockStateModelImpl.Unbaked.of(list);
    }

    public List<class08880> models();
}

