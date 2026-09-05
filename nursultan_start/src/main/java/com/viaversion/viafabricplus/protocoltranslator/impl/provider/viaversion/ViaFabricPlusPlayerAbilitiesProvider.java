/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.provider.PlayerAbilitiesProvider
 *  minecraft.class04453
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.provider.PlayerAbilitiesProvider;
import minecraft.class04453;
import minecraft.class06202;

public final class ViaFabricPlusPlayerAbilitiesProvider
extends PlayerAbilitiesProvider {
    public float getWalkingSpeed(UserConnection userConnection) {
        return ((class04453)class06202.Nq().T_4).method_31549().y();
    }

    public float getFlyingSpeed(UserConnection userConnection) {
        return ((class04453)class06202.Nq().T_4).method_31549().N();
    }
}

