/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06202
 *  net.raphimc.minecraftauth.extra.realms.model.RealmsServer
 */
package com.viaversion.viafabricplus.screen.impl.realms;

import com.viaversion.viafabricplus.screen.VFPListEntry;
import com.viaversion.viafabricplus.screen.impl.realms.BedrockRealmsScreen;
import com.viaversion.viafabricplus.screen.impl.realms.BedrockRealmsScreen$SlotList;
import java.awt.Color;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06202;
import net.raphimc.minecraftauth.extra.realms.model.RealmsServer;

public final class BedrockRealmsScreen$SlotEntry
extends VFPListEntry {
    private final BedrockRealmsScreen$SlotList slotList;
    final RealmsServer realmsServer;

    public BedrockRealmsScreen$SlotEntry(BedrockRealmsScreen bedrockRealmsScreen, BedrockRealmsScreen$SlotList slotList, RealmsServer realmsServer) {
        this.slotList = slotList;
        this.realmsServer = realmsServer;
    }

    @Override
    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
        String string;
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        Object object = "";
        String string2 = this.realmsServer.getOwnerName();
        if (string2 != null && !string2.trim().isEmpty()) {
            object = (String)object + string2 + " - ";
        }
        if ((string = this.realmsServer.getName()) != null && !string.trim().isEmpty()) {
            object = (String)object + string;
        }
        object = (String)object + " (" + this.realmsServer.getState() + ")";
        class010542.y(class015902, (String)object, 3, 3, this.slotList.method_25336() == this ? Color.ORANGE.getRGB() : -1);
        Object object2 = this.realmsServer.getWorldType();
        String string3 = this.realmsServer.getActiveVersion();
        if (string3 != null && !string3.trim().isEmpty()) {
            object2 = (String)object2 + " - " + string3;
        }
        class010542.y(class015902, (String)object2, n3 - class015902.y((String)object2) - 3, 3, -1);
        String string4 = this.realmsServer.getMotd();
        if (string4 != null) {
            class00392 class003922 = class00392.N((String)string4);
            Objects.requireNonNull(class015902);
            this.renderScrollableText(class003922, n4 - 9 - 3, 0);
        }
    }

    public class00392 method_37006() {
        return class00392.N((String)this.realmsServer.getName());
    }
}

