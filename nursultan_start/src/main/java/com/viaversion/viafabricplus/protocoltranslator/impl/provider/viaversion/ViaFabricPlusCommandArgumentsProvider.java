/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ParseResults
 *  com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider
 *  com.viaversion.viaversion.util.Pair
 *  minecraft.class01683
 *  minecraft.class03039
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion;

import com.mojang.brigadier.ParseResults;
import com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider;
import com.viaversion.viaversion.util.Pair;
import java.util.Collections;
import java.util.List;
import minecraft.class01683;
import minecraft.class03039;
import minecraft.class06202;

public final class ViaFabricPlusCommandArgumentsProvider
extends SignableCommandArgumentsProvider {
    public List<Pair<String, String>> getSignableArguments(String string) {
        class01683 class016832 = class06202.Nq().NE();
        if (class016832 != null) {
            return class03039.y((ParseResults)class016832.m().parse(string, (Object)class016832.L())).N().stream().map(class030672 -> new Pair((Object)class030672.N(), (Object)class030672.L())).toList();
        }
        return Collections.emptyList();
    }
}

