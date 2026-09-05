/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.florianreuth.classic4j.api.LoginProcessHandler
 *  de.florianreuth.classic4j.model.classicube.account.CCAccount
 *  minecraft.class00392
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeMFAScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeServerListScreen;
import de.florianreuth.classic4j.api.LoginProcessHandler;
import de.florianreuth.classic4j.model.classicube.account.CCAccount;
import minecraft.class00392;

class ClassiCubeMFAScreen$1
implements LoginProcessHandler {
    final /* synthetic */ ClassiCubeMFAScreen this$0;

    public void handleException(Throwable throwable) {
        this.this$0.setupSubtitle(class00392.N((String)throwable.getMessage()));
    }

    ClassiCubeMFAScreen$1(ClassiCubeMFAScreen classiCubeMFAScreen) {
        this.this$0 = classiCubeMFAScreen;
    }

    public void handleMfa(CCAccount cCAccount) {
    }

    public void handleSuccessfulLogin(CCAccount cCAccount) {
        ClassiCubeServerListScreen.INSTANCE.open(this.this$0.prevScreen);
    }
}

