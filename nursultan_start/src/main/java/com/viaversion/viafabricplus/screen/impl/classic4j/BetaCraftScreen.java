/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.florianreuth.classic4j.BetaCraftHandler
 *  de.florianreuth.classic4j.model.betacraft.BCServerList
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class04654
 *  minecraft.class05096
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.BetaCraftScreen$SlotList;
import de.florianreuth.classic4j.BetaCraftHandler;
import de.florianreuth.classic4j.model.betacraft.BCServerList;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class04654;
import minecraft.class05096;

public final class BetaCraftScreen
extends VFPScreen {
    public static final BetaCraftScreen INSTANCE = new BetaCraftScreen();
    public static BCServerList SERVER_LIST;
    private static final String BETA_CRAFT_SERVER_LIST_URL = "https://betacraft.uk/serverlist/";

    private BetaCraftScreen() {
        super("BetaCraft", true);
    }

    private void createView() {
        this.setupSubtitle(class00392.N((String)BETA_CRAFT_SERVER_LIST_URL), class01321.y((class05096)this, (String)BETA_CRAFT_SERVER_LIST_URL));
        Objects.requireNonNull(this.field_22793);
        int n = (9 + 2) * 3;
        this.method_37063((class04654)new BetaCraftScreen$SlotList(this.field_22787, this.field_22789, this.field_22790, 6 + n, -5, n));
        this.addRefreshButton(() -> {
            SERVER_LIST = null;
        });
    }

    @Override
    public void method_25426() {
        super.method_25426();
        if (SERVER_LIST != null) {
            this.createView();
            return;
        }
        this.setupSubtitle((class00392)class00392.L((String)"betacraft.viafabricplus.loading"));
        BetaCraftHandler.requestServerList(bCServerList -> {
            SERVER_LIST = bCServerList;
            this.createView();
        }, throwable -> BetaCraftScreen.showErrorScreen(INSTANCE.method_25440(), throwable, this));
    }

    @Override
    public boolean subtitleCentered() {
        return SERVER_LIST == null;
    }
}

