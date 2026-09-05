/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10742
 *  Nursultan.class11107
 *  Nursultan.class11664
 *  Nursultan.class11938
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class06026
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07490
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class10742;
import Nursultan.class11107;
import Nursultan.class11664;
import Nursultan.class11938;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Iterator;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06026;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07490;
import minecraft.class07689;

public class class09422
extends class10742 {
    private void L() {
        class05096 class050962 = (class05096)((class06202)this.y_0).v_3;
        if (!(class050962 instanceof class06026)) {
            return;
        }
        class06026 class060262 = (class06026)class050962;
        class050962 = (class07490)class060262.E();
        int n = class050962.E().method_5439();
        int n2 = 0;
        Iterator var5 = class11107.y().iterator();
        while (var5.hasNext()) {
            class06584 class065842 = ((class11664)var5.next()).N();
            if (n2 < n) {
                class050962.N(n2, class050962.z(), class065842);
                ++n2;
                continue;
            }
            if (((class04453)((class06202)this.y_0).T_4).method_31548().M(class065842) || class065842.R()) continue;
            ((class04453)((class06202)this.y_0).T_4).method_7328(class065842, false);
        }
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("debug").requires(class076892 -> (Boolean)class11938.L_3)).then(this.N("load").executes(commandContext -> {
            this.L();
            return 1;
        })));
    }
}

