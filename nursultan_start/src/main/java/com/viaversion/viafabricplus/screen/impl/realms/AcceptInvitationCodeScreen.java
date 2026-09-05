/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05362
 */
package com.viaversion.viafabricplus.screen.impl.realms;

import com.viaversion.viafabricplus.screen.VFPScreen;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05362;

public final class AcceptInvitationCodeScreen
extends VFPScreen {
    private final Consumer<String> serviceHandler;

    public AcceptInvitationCodeScreen(Consumer<String> consumer) {
        super((class00392)class00392.L((String)"screen.viafabricplus.accept_invite"), true);
        this.serviceHandler = consumer;
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.setupDefaultSubtitle();
        class04927 class049272 = new class04927(this.field_22793, this.field_22789 / 2 - 100, this.field_22790 / 2 - 10, 200, 20, (class00392)class00392.i());
        class049272.method_47404((class00392)class00392.L((String)"base.viafabricplus.code"));
        this.method_37063((class04654)class049272);
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"base.viafabricplus.accept"), class053622 -> {
            this.serviceHandler.accept(class049272.method_1882());
            this.method_25419();
        }).N(this.field_22789 / 2 - 75, this.field_22790 / 2 + 20).N());
    }
}

