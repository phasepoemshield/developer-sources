/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09045
 *  Nursultan.class09382
 *  Nursultan.class10626
 *  Nursultan.class10642
 *  Nursultan.class10733
 *  Nursultan.class10742
 *  Nursultan.class10794
 *  Nursultan.class11067
 *  Nursultan.class11303
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class09045;
import Nursultan.class09382;
import Nursultan.class10626;
import Nursultan.class10642;
import Nursultan.class10733;
import Nursultan.class10742;
import Nursultan.class10794;
import Nursultan.class11067;
import Nursultan.class11303;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class12002;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07689;

public class class09410
extends class10742 {
    private int L() {
        class11303.y((Object)class11921.N((String)"bind.cleared").N(class06541.field_1080));
        for (class11067 class110672 : class11938.u().NN()) {
            if (class110672.R().B()) continue;
            this.N(class110672, false);
        }
        return 1;
    }

    static {
        class09410.i();
    }

    private LiteralArgumentBuilder<class07689> B() {
        return (LiteralArgumentBuilder)this.N("clear").executes(commandContext -> this.L());
    }

    private LiteralArgumentBuilder<class07689> Z() {
        return (LiteralArgumentBuilder)this.N("add").then(this.N("module", (ArgumentType)new class10733()).then(((RequiredArgumentBuilder)this.N("key", (ArgumentType)new class09382()).executes(commandContext -> this.N(class10733.N((CommandContext)commandContext, (String)"module"), class09382.N((CommandContext)commandContext, (String)"key"), class09045.TOGGLE))).then(this.N("type", (ArgumentType)new class10794()).executes(commandContext -> this.N(class10733.N((CommandContext)commandContext, (String)"module"), class09382.N((CommandContext)commandContext, (String)"key"), class10794.N((CommandContext)commandContext, (String)"type"))))));
    }

    private static void i() {
    }

    private LiteralArgumentBuilder<class07689> u() {
        return (LiteralArgumentBuilder)this.N("remove").then(this.N("module", (ArgumentType)new class10642()).executes(commandContext -> this.N(class10733.N((CommandContext)commandContext, (String)"module"), true)));
    }

    private LiteralArgumentBuilder<class07689> y() {
        return (LiteralArgumentBuilder)this.N("list").executes(commandContext -> this.R());
    }

    private int N(class11067 class110672, boolean bl) {
        class110672.N(class12002.UNKNOWN, 0, class09045.TOGGLE, true);
        if (bl) {
            class11303.y((Object)class11921.N((String)"bind.removed", (Object[])new Object[]{String.valueOf(class06541.field_1068) + class110672.N() + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        }
        return 1;
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("bind").then(this.Z())).then(this.u())).then(this.y())).then(this.B()));
    }

    private int N(class11067 class110672, class12002 class120022, class09045 class090452) {
        class110672.N(class120022, 0, class090452, class110672.R().N());
        class11303.y((Object)class11921.N((String)"bind.added", (Object[])new Object[]{String.valueOf(class06541.field_1068) + class120022.u() + String.valueOf(class06541.field_1080), String.valueOf(class06541.field_1068) + class110672.N() + String.valueOf(class06541.field_1080), String.valueOf(class06541.field_1068) + class090452.N().toUpperCase() + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        return 1;
    }

    private int R() {
        boolean bl = true;
        for (class11067 class110672 : class11938.u().NN()) {
            if (class110672.R().B()) continue;
            class00625 class006252 = new class00625(((Character)class10626.N_1).charValue() + "bind remove " + class110672.N());
            class05216 class052162 = class11921.N((String)"remove").N(class06541.field_1061).L(class00405.N.N((class00647)class006252));
            String string = class110672.R().z();
            class11303.y((Object)class11921.N((String)"bind.list-entry", (Object[])new Object[]{String.valueOf(class06541.field_1068) + class110672.N() + String.valueOf(class06541.field_1080), String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080), String.valueOf(class06541.field_1068) + class110672.R().i().N().toUpperCase() + String.valueOf(class06541.field_1080)}).N(class06541.field_1080).i(" ").y((class00392)class052162));
            bl = false;
        }
        if (bl) {
            class11303.y((Object)class11921.N((String)"bind.empty-list").N(class06541.field_1080));
        }
        return 1;
    }
}

