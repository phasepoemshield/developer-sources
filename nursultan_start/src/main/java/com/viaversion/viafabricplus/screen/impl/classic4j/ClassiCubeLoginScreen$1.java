/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  de.florianreuth.classic4j.api.LoginProcessHandler
 *  de.florianreuth.classic4j.model.classicube.account.CCAccount
 *  minecraft.class00392
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeLoginScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeMFAScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeServerListScreen;
import de.florianreuth.classic4j.api.LoginProcessHandler;
import de.florianreuth.classic4j.model.classicube.account.CCAccount;
import minecraft.class00392;

class ClassiCubeLoginScreen$1
implements LoginProcessHandler {
    final /* synthetic */ ClassiCubeLoginScreen this$0;

    public void handleException(Throwable throwable) {
        ViaFabricPlusImpl.INSTANCE.getLogger().error("Error while logging in to ClassiCube!", throwable);
        this.this$0.setupSubtitle(class00392.N((String)throwable.getMessage()));
    }

    ClassiCubeLoginScreen$1(ClassiCubeLoginScreen classiCubeLoginScreen) {
        this.this$0 = classiCubeLoginScreen;
    }

    public void handleMfa(CCAccount cCAccount) {
        ClassiCubeMFAScreen.INSTANCE.open(this.this$0.prevScreen);
    }

    public void handleSuccessfulLogin(CCAccount cCAccount) {
        ClassiCubeServerListScreen.INSTANCE.open(this.this$0.prevScreen);
    }
}

