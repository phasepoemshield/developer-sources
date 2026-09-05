/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.florianreuth.classic4j.model.betacraft.BCServerInfo
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.screen.VFPListEntry;
import com.viaversion.viafabricplus.util.ConnectionUtil;
import de.florianreuth.classic4j.model.betacraft.BCServerInfo;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;

public class BetaCraftScreen$ServerSlot
extends VFPListEntry {
    private final BCServerInfo server;

    public BetaCraftScreen$ServerSlot(BCServerInfo bCServerInfo) {
        this.server = bCServerInfo;
    }

    @Override
    public void mappedMouseClicked(double d, double d2, int n) {
        ConnectionUtil.connect(this.server.name(), this.server.socket());
        super.mappedMouseClicked(d, d2, n);
    }

    @Override
    public void mappedRender(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        String string = this.server.name() + String.valueOf(class06541.field_1063) + " [" + this.server.gameVersion() + "]";
        int n7 = n3 / 2;
        int n8 = n4 / 2;
        Objects.requireNonNull(class015902);
        class010542.N(class015902, string, n7, n8 - 9 / 2, -1);
        if (this.server.onlineMode()) {
            class010542.y(class015902, (class00392)class00392.L((String)"base.viafabricplus.online_mode").N(class06541.field_1060), 1, 1, -1);
        }
        String string2 = this.server.socket();
        String string3 = this.server.playerCount() + "/" + this.server.playerLimit();
        class05216 class052162 = class00392.y((String)string2).N(class06541.field_1063);
        int n9 = n3 - class015902.y(string2) - 1;
        Objects.requireNonNull(class015902);
        class010542.y(class015902, (class00392)class052162, n9, n4 - 9 - 1, -1);
        class010542.y(class015902, string3, n3 - class015902.y(string3) - 1, 1, -1);
    }

    public class00392 method_37006() {
        return class00392.N((String)this.server.name());
    }
}

