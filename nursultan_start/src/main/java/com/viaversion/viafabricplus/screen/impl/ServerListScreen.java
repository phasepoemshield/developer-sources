/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class05362
 *  minecraft.class05373
 */
package com.viaversion.viafabricplus.screen.impl;

import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.BetaCraftScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeLoginScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeServerListScreen;
import com.viaversion.viafabricplus.screen.impl.realms.BedrockRealmsScreen;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class05362;
import minecraft.class05373;

public final class ServerListScreen
extends VFPScreen {
    public static final ServerListScreen INSTANCE = new ServerListScreen();

    public ServerListScreen() {
        super((class00392)class00392.L((String)"screen.viafabricplus.server_list"), true);
    }

    @Override
    public void method_25426() {
        boolean bl;
        super.method_25426();
        this.setupDefaultSubtitle();
        boolean bl2 = SaveManager.INSTANCE.getAccountsSave().getClassicubeAccount() != null;
        class05373 class053732 = class05362.method_46430((class00392)ClassiCubeServerListScreen.INSTANCE.method_25440(), class053622 -> {
            if (!bl2) {
                ClassiCubeLoginScreen.INSTANCE.open(this);
                return;
            }
            ClassiCubeServerListScreen.INSTANCE.open(this);
        }).N(this.field_22789 / 2 - 100, this.field_22790 / 2 - 25).y(200, 20);
        if (!bl2) {
            class053732.N(class04141.N((class00392)class00392.L((String)"classicube.viafabricplus.warning")));
        }
        this.method_37063((class04654)class053732.N());
        class05373 class053733 = class05362.method_46430((class00392)BetaCraftScreen.INSTANCE.method_25440(), class053622 -> BetaCraftScreen.INSTANCE.open(this)).N(this.field_22789 / 2 - 100, this.field_22790 / 2 - 25 + 20 + 3).y(200, 20);
        if (BetaCraftScreen.SERVER_LIST == null) {
            class053733.N(class04141.N((class00392)class00392.L((String)"betacraft.viafabricplus.warning")));
        }
        this.method_37063((class04654)class053733.N());
        class05373 class053734 = class05362.method_46430((class00392)BedrockRealmsScreen.INSTANCE.method_25440(), class053622 -> BedrockRealmsScreen.INSTANCE.open(this)).N(this.field_22789 / 2 - 100, this.field_22790 / 2 - 25 + 40 + 6).y(200, 20);
        boolean bl3 = bl = SaveManager.INSTANCE.getAccountsSave().getBedrockAccount() == null;
        if (bl) {
            class053734.N(class04141.N((class00392)class00392.L((String)"bedrock_realms.viafabricplus.warning")));
        }
        class05362 class053623 = class053734.N();
        this.method_37063((class04654)class053623);
        if (bl) {
            class053623.field_22763 = false;
        }
    }
}

