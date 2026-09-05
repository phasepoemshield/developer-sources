/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01202
 *  minecraft.class06202
 *  net.raphimc.minecraftauth.extra.realms.model.RealmsServer
 */
package com.viaversion.viafabricplus.screen.impl.realms;

import com.viaversion.viafabricplus.screen.VFPList;
import com.viaversion.viafabricplus.screen.impl.realms.BedrockRealmsScreen;
import com.viaversion.viafabricplus.screen.impl.realms.BedrockRealmsScreen$SlotEntry;
import minecraft.class01202;
import minecraft.class06202;
import net.raphimc.minecraftauth.extra.realms.model.RealmsServer;

public final class BedrockRealmsScreen$SlotList
extends VFPList {
    private static double scrollAmount;

    public BedrockRealmsScreen$SlotList(BedrockRealmsScreen bedrockRealmsScreen, class06202 class062022, int n, int n2, int n3, int n4, int n5) {
        super(class062022, n, n2, n3, n4, n5);
        for (RealmsServer realmsServer : bedrockRealmsScreen.realmsServers) {
            this.method_25321((class01202)new BedrockRealmsScreen$SlotEntry(bedrockRealmsScreen, this, realmsServer));
        }
        this.initScrollY(scrollAmount);
    }

    @Override
    public void updateSlotAmount(double d) {
        scrollAmount = d;
    }

    public int method_25322() {
        return super.method_25322() + 140;
    }
}

