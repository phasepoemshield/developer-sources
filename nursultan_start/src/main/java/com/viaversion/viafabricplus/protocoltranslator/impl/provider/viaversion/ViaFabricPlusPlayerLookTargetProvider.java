/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.PlayerLookTargetProvider
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class07089
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.PlayerLookTargetProvider;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class07089;

public final class ViaFabricPlusPlayerLookTargetProvider
extends PlayerLookTargetProvider {
    public BlockPosition getPlayerLookTarget(UserConnection userConnection) {
        class07089 class070892 = (class07089)class06202.Nq().M_3;
        if (class070892 instanceof class06183) {
            class06183 class061832 = (class06183)class070892;
            class070892 = class061832.u();
            return new BlockPosition(class070892.method_10263(), class070892.method_10264(), class070892.method_10260());
        }
        return null;
    }
}

