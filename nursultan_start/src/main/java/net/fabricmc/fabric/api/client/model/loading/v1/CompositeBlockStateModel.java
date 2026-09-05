/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.CompositeBlockStateModelImpl
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import java.util.List;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.CompositeBlockStateModelImpl;

@Environment(value=EnvType.CLIENT)
public interface CompositeBlockStateModel
extends class08887 {
    public static CompositeBlockStateModel of(List<class08887> list) {
        return CompositeBlockStateModelImpl.of(list);
    }

    public List<class08887> models();
}

