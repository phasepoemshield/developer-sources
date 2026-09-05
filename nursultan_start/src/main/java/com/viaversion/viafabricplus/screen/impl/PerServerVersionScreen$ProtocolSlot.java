/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen;
import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen$SharedSlot;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.awt.Color;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06202;

public final class PerServerVersionScreen$ProtocolSlot
extends PerServerVersionScreen$SharedSlot {
    private final ProtocolVersion protocolVersion;
    final /* synthetic */ PerServerVersionScreen this$0;

    public PerServerVersionScreen$ProtocolSlot(PerServerVersionScreen perServerVersionScreen, ProtocolVersion protocolVersion) {
        this.this$0 = perServerVersionScreen;
        super(perServerVersionScreen);
        this.protocolVersion = protocolVersion;
    }

    @Override
    public void mappedMouseClicked(double d, double d2, int n) {
        this.this$0.selectionConsumer.accept(this.protocolVersion);
    }

    @Override
    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        boolean bl2 = this.protocolVersion.equals((Object)this.this$0.selectionSupplier.get());
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        String string = this.protocolVersion.getName();
        int n3 = this.method_73388();
        int n4 = this.method_73385();
        Objects.requireNonNull(class015902);
        class010542.N(class015902, string, n3, n4 - 9 / 2, bl2 ? Color.GREEN.getRGB() : -1);
    }

    public class00392 method_37006() {
        return class00392.N((String)this.protocolVersion.getName());
    }
}

