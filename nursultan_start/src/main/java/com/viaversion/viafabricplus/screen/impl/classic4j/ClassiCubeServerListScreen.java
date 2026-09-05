/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  de.florianreuth.classic4j.ClassiCubeHandler
 *  de.florianreuth.classic4j.model.classicube.account.CCAccount
 *  de.florianreuth.classic4j.model.classicube.server.CCServerInfo
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05362
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeServerListScreen$SlotList;
import de.florianreuth.classic4j.ClassiCubeHandler;
import de.florianreuth.classic4j.model.classicube.account.CCAccount;
import de.florianreuth.classic4j.model.classicube.server.CCServerInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05362;

public final class ClassiCubeServerListScreen
extends VFPScreen {
    public static final ClassiCubeServerListScreen INSTANCE = new ClassiCubeServerListScreen();
    static List<CCServerInfo> SERVER_LIST = new ArrayList<CCServerInfo>();
    private static final String CLASSICUBE_SERVER_LIST_URL = "https://www.classicube.net/server/list/";

    public ClassiCubeServerListScreen() {
        super("ClassiCube", true);
    }

    @Override
    public void method_25426() {
        CCAccount cCAccount = SaveManager.INSTANCE.getAccountsSave().getClassicubeAccount();
        if (SERVER_LIST == null) {
            ClassiCubeHandler.requestServerList((CCAccount)cCAccount, cCServerList -> {
                SERVER_LIST = new ArrayList<CCServerInfo>(cCServerList.servers());
                this.open(this.prevScreen);
                this.setupUrlSubtitle(CLASSICUBE_SERVER_LIST_URL);
            }, throwable -> {
                ViaFabricPlusImpl.INSTANCE.getLogger().error("Error while loading ClassiCube servers!", throwable);
                ClassiCubeServerListScreen.showErrorScreen(INSTANCE.method_25440(), throwable, this.prevScreen);
            });
            this.setupSubtitle((class00392)class00392.L((String)"betacraft.viafabricplus.loading"));
            return;
        }
        Objects.requireNonNull(this.field_22793);
        int n = (9 + 2) * 3;
        this.method_37063((class04654)new ClassiCubeServerListScreen$SlotList(this.field_22787, this.field_22789, this.field_22790, 6 + n, -5, n));
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"base.viafabricplus.logout"), class053622 -> {
            SaveManager.INSTANCE.getAccountsSave().setClassicubeAccount(null);
            SERVER_LIST = null;
            this.method_25419();
        }).N(this.field_22789 - 60 - 5, 5).y(60, 20).N());
        super.method_25426();
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        if (SERVER_LIST == null) {
            return;
        }
        CCAccount cCAccount = SaveManager.INSTANCE.getAccountsSave().getClassicubeAccount();
        class010542.y(this.field_22793, (class00392)class00392.L((String)"classicube.viafabricplus.profile"), 32, 6, -1);
        class010542.y(this.field_22793, class00392.N((String)cCAccount.username()), 32, 16, -1);
    }

    @Override
    public boolean subtitleCentered() {
        return SERVER_LIST == null;
    }
}

