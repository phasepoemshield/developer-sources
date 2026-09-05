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
import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen;
import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen$ProtocolSlot;
import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen$ResetSlot;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class01202;
import minecraft.class06202;

public final class PerServerVersionScreen$SlotList
extends VFPList {
    final /* synthetic */ PerServerVersionScreen this$0;

    public PerServerVersionScreen$SlotList(PerServerVersionScreen perServerVersionScreen, class06202 class062022, int n, int n2, int n3, int n4, int n5) {
        this.this$0 = perServerVersionScreen;
        super(class062022, n, n2, n3, n4, n5);
        this.method_25321((class01202)new PerServerVersionScreen$ResetSlot(perServerVersionScreen));
        ProtocolVersion.getReversedProtocols().stream().map(protocolVersion -> new PerServerVersionScreen$ProtocolSlot(this.this$0, (ProtocolVersion)protocolVersion)).forEach(class012022 -> this.method_25321((class01202)class012022));
    }
}

