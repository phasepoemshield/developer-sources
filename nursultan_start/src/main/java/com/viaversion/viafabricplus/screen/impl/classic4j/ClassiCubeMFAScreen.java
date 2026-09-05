/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.florianreuth.classic4j.ClassiCubeHandler
 *  de.florianreuth.classic4j.api.LoginProcessHandler
 *  de.florianreuth.classic4j.model.classicube.account.CCAccount
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05362
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeMFAScreen$1;
import de.florianreuth.classic4j.ClassiCubeHandler;
import de.florianreuth.classic4j.api.LoginProcessHandler;
import de.florianreuth.classic4j.model.classicube.account.CCAccount;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05362;

public final class ClassiCubeMFAScreen
extends VFPScreen {
    public static final ClassiCubeMFAScreen INSTANCE = new ClassiCubeMFAScreen();
    private class04927 mfaField;

    public ClassiCubeMFAScreen() {
        super((class00392)class00392.L((String)"screen.viafabricplus.classicube_mfa"), true);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        if (this.getSubtitle() == null) {
            this.setupSubtitle((class00392)class00392.L((String)"classic4j_library.viafabricplus.error.logincode"));
        }
        this.mfaField = new class04927(this.field_22793, this.field_22789 / 2 - 150, 80, 300, 20, (class00392)class00392.i());
        this.method_37063((class04654)this.mfaField);
        this.mfaField.method_47404(class00392.N((String)"MFA"));
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"base.viafabricplus.login"), class053622 -> {
            this.setupSubtitle((class00392)class00392.L((String)"classicube.viafabricplus.loading"));
            CCAccount cCAccount = SaveManager.INSTANCE.getAccountsSave().getClassicubeAccount();
            ClassiCubeHandler.requestAuthentication((CCAccount)cCAccount, (String)this.mfaField.method_1882(), (LoginProcessHandler)new ClassiCubeMFAScreen$1(this));
        }).N(this.field_22789 / 2 - 75, this.mfaField.method_46427() + 80 + 5).y(150, 20).N());
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.renderScreenTitle(class010542);
    }

    @Override
    public void method_25419() {
        SaveManager.INSTANCE.getAccountsSave().setClassicubeAccount(null);
        super.method_25419();
    }
}

