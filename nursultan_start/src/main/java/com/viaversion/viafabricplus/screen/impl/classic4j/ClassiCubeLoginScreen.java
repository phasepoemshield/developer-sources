/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.IEditBox
 *  de.florianreuth.classic4j.ClassiCubeHandler
 *  de.florianreuth.classic4j.api.LoginProcessHandler
 *  de.florianreuth.classic4j.model.classicube.account.CCAccount
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05362
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.injection.access.base.IEditBox;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.save.impl.AccountsSave;
import com.viaversion.viafabricplus.screen.VFPScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeLoginScreen$1;
import de.florianreuth.classic4j.ClassiCubeHandler;
import de.florianreuth.classic4j.api.LoginProcessHandler;
import de.florianreuth.classic4j.model.classicube.account.CCAccount;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05362;

public final class ClassiCubeLoginScreen
extends VFPScreen {
    public static final ClassiCubeLoginScreen INSTANCE = new ClassiCubeLoginScreen();
    private class04927 nameField;
    private class04927 passwordField;

    public ClassiCubeLoginScreen() {
        super((class00392)class00392.L((String)"screen.viafabricplus.classicube_login"), true);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        if (this.getSubtitle() == null) {
            this.setupSubtitle((class00392)class00392.L((String)"classicube.viafabricplus.account"), class01321.y((class05096)this, (String)ClassiCubeHandler.CLASSICUBE_ROOT_URI.toString()));
        }
        this.nameField = new class04927(this.field_22793, this.field_22789 / 2 - 150, 80, 300, 20, (class00392)class00392.i());
        this.method_37063((class04654)this.nameField);
        this.passwordField = new class04927(this.field_22793, this.field_22789 / 2 - 150, this.nameField.method_46427() + 20 + 5, 300, 20, (class00392)class00392.i());
        this.method_37063((class04654)this.passwordField);
        this.passwordField.method_73210((string, n) -> class00392.N((String)"*".repeat(string.length())).method_30937());
        this.nameField.method_47404((class00392)class00392.L((String)"base.viafabricplus.name"));
        this.passwordField.method_47404((class00392)class00392.L((String)"base.viafabricplus.password"));
        this.nameField.method_1880(Integer.MAX_VALUE);
        this.passwordField.method_1880(Integer.MAX_VALUE);
        ((IEditBox)this.nameField).viaFabricPlus$unlockForbiddenCharacters();
        ((IEditBox)this.passwordField).viaFabricPlus$unlockForbiddenCharacters();
        AccountsSave accountsSave = SaveManager.INSTANCE.getAccountsSave();
        if (accountsSave.getClassicubeAccount() != null) {
            this.nameField.method_1852(accountsSave.getClassicubeAccount().username());
            this.passwordField.method_1852(accountsSave.getClassicubeAccount().username());
        }
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"base.viafabricplus.login"), class053622 -> {
            accountsSave.setClassicubeAccount(new CCAccount(this.nameField.method_1882(), this.passwordField.method_1882()));
            this.setupSubtitle((class00392)class00392.L((String)"classicube.viafabricplus.loading"));
            ClassiCubeHandler.requestAuthentication((CCAccount)accountsSave.getClassicubeAccount(), null, (LoginProcessHandler)new ClassiCubeLoginScreen$1(this));
        }).N(this.field_22789 / 2 - 75, this.passwordField.method_46427() + 80 + 5).y(150, 20).N());
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

