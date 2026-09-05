/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01202
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.screen.VFPList;
import com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen$ProtocolSlot;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class01202;
import minecraft.class06202;

public class ProtocolSelectionScreen$SlotList
extends VFPList {
    private static double scrollAmount;

    public ProtocolSelectionScreen$SlotList(class06202 class062022, int n, int n2, int n3, int n4, int n5) {
        super(class062022, n, n2, n3, n4, n5);
        ProtocolVersion.getReversedProtocols().stream().map(ProtocolSelectionScreen$ProtocolSlot::new).forEach(class012022 -> this.method_25321((class01202)class012022));
        this.initScrollY(scrollAmount);
    }

    @Override
    public void updateSlotAmount(double d) {
        scrollAmount = d;
    }
}

