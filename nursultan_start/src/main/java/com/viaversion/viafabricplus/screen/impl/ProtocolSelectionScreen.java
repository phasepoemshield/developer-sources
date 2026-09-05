/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04654
 *  minecraft.class05362
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.ProtocolSelectionScreen$SlotList;
import com.viaversion.viafabricplus.screen.impl.ReportIssuesScreen;
import com.viaversion.viafabricplus.screen.impl.ServerListScreen;
import com.viaversion.viafabricplus.screen.impl.SettingsScreen;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class04654;
import minecraft.class05362;
import minecraft.class06202;

public final class ProtocolSelectionScreen
extends VFPScreen {
    public static final ProtocolSelectionScreen INSTANCE = new ProtocolSelectionScreen();

    private ProtocolSelectionScreen() {
        super("ViaFabricPlus", true);
    }

    @Override
    public void method_25426() {
        this.setupDefaultSubtitle();
        Objects.requireNonNull(this.field_22793);
        Objects.requireNonNull(this.field_22793);
        this.method_37063((class04654)new ProtocolSelectionScreen$SlotList(this.field_22787, this.field_22789, this.field_22790, 6 + (9 + 2) * 3, 30, 9 + 4));
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"base.viafabricplus.settings"), class053622 -> SettingsScreen.INSTANCE.open(this)).N(this.field_22789 - 98 - 5, 5).y(98, 20).N());
        class05362 class053623 = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)ServerListScreen.INSTANCE.method_25440(), class053622 -> ServerListScreen.INSTANCE.open(this)).N(5, this.field_22790 - 25).y(98, 20).N());
        class053623.field_22763 = class06202.Nq().NE() == null;
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"report.viafabricplus.button"), class053622 -> ReportIssuesScreen.INSTANCE.open(this)).N(this.field_22789 - 98 - 5, this.field_22790 - 25).y(98, 20).N());
        super.method_25426();
    }
}

