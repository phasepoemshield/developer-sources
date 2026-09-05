/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class04654
 *  minecraft.class05096
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.PerServerVersionScreen$SlotList;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class04654;
import minecraft.class05096;

public final class PerServerVersionScreen
extends VFPScreen {
    final Consumer<ProtocolVersion> selectionConsumer;
    final Supplier<ProtocolVersion> selectionSupplier;

    public PerServerVersionScreen(class05096 class050962, Consumer<ProtocolVersion> consumer, Supplier<ProtocolVersion> supplier) {
        super((class00392)class00392.L((String)"screen.viafabricplus.force_version"), false);
        this.prevScreen = class050962;
        this.selectionConsumer = consumer;
        this.selectionSupplier = supplier;
        this.setupSubtitle((class00392)class00392.L((String)"force_version.viafabricplus.title"));
    }

    @Override
    public void method_25426() {
        super.method_25426();
        Objects.requireNonNull(this.field_22793);
        Objects.requireNonNull(this.field_22793);
        this.method_37063((class04654)new PerServerVersionScreen$SlotList(this, this.field_22787, this.field_22789, this.field_22790, 6 + (9 + 2) * 3, -5, 9 + 4));
    }
}

