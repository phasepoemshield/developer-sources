/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.BlockESP
 *  Nursultan.class10626
 *  Nursultan.class10710
 *  Nursultan.class10742
 *  Nursultan.class10747
 *  Nursultan.class11025
 *  Nursultan.class11303
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class00891
 *  minecraft.class00903
 *  minecraft.class01929
 *  minecraft.class04105
 *  minecraft.class04206
 *  minecraft.class05194
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07027
 *  minecraft.class07686
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.BlockESP;
import Nursultan.class10626;
import Nursultan.class10710;
import Nursultan.class10742;
import Nursultan.class10747;
import Nursultan.class10860;
import Nursultan.class11025;
import Nursultan.class11303;
import Nursultan.class11921;
import Nursultan.class11938;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.List;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class00891;
import minecraft.class00903;
import minecraft.class01929;
import minecraft.class04105;
import minecraft.class04206;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07027;
import minecraft.class07686;
import minecraft.class07689;

public class class10854
extends class10742 {
    public Object N_0;

    private static void L() {
    }

    private int M() {
        this.Z();
        if (((BlockESP)this.N_0).m().isEmpty()) {
            class11303.y((Object)class11921.N((String)"blockesp.empty-list").N(class06541.field_1080));
            return 0;
        }
        class11303.y((Object)class11921.N((String)"blockesp.list-header").N(class06541.field_1080));
        for (class11025 class110252 : ((BlockESP)this.N_0).m()) {
            class00625 class006252 = new class00625(((Character)class10626.N_1).charValue() + "blockesp remove " + class10710.N((class00891)class110252.N()));
            class05216 class052162 = class00392.y((String)"[").y((class00392)class11921.N((String)"remove")).i("]").N(class06541.field_1061).L(class00405.N.N((class00647)class006252));
            class11303.y((Object)class11921.N((String)"blockesp.list-entry").N(class06541.field_1080).i(" (").y((class00392)this.N(class110252.N(), class110252.y())).i(") ").y((class00392)class052162));
        }
        class11303.y((Object)class11921.N((String)"total", (Object[])new Object[]{((BlockESP)this.N_0).m().size()}).N(class06541.field_1080));
        return 1;
    }

    public class10854() {
        this.Z();
        this.N_0 = class11938.u().N();
    }

    static {
        class10854.R();
        class10854.L();
        class10854.i();
        class10854.u();
    }

    private void Z() {
    }

    private static void i() {
    }

    private LiteralArgumentBuilder<class07689> U() {
        return (LiteralArgumentBuilder)this.N("list").executes(commandContext -> this.M());
    }

    private int z() {
        String string;
        this.Z();
        if (((BlockESP)this.N_0).m().isEmpty()) {
            string = "blockesp.empty-list";
        } else {
            ((BlockESP)this.N_0).P();
            string = "blockesp.cleared";
        }
        class11303.y((Object)class11921.N((String)string).N(class06541.field_1080));
        return 1;
    }

    private static void u() {
    }

    private int u(int n) {
        this.Z();
        List list = class04206.i.j().filter(class008912 -> class008912 instanceof class07027).map(class008912 -> new class11025(class008912, n)).toList();
        ((BlockESP)this.N_0).N((Collection)list);
        class11303.y((Object)class11921.N((String)"blockesp.added-shulkers", (Object[])new Object[]{list.size()}).N(class06541.field_1080));
        return 1;
    }

    private LiteralArgumentBuilder<class07689> y() {
        return (LiteralArgumentBuilder)this.N("clear").executes(commandContext -> this.z());
    }

    private LiteralArgumentBuilder<class07689> E() {
        return (LiteralArgumentBuilder)this.N("remove").then(this.N("block", (ArgumentType)new class10710()).executes(commandContext -> this.N(class10710.N((CommandContext)commandContext, (String)"block"))));
    }

    private int N(class00891 class008912) {
        this.Z();
        class11025 class110252 = ((BlockESP)this.N_0).y(class008912);
        if (class110252 == null || !((BlockESP)this.N_0).N(class008912)) {
            class11303.y((Object)class11921.N((String)"blockesp.not-found", (Object[])new Object[]{class10710.N((class00891)class008912)}).N(class06541.field_1080));
            return 0;
        }
        class11303.y((Object)class11921.N((String)"blockesp.removed").N(class06541.field_1080).i(" (").y((class00392)this.N(class008912, class110252.y())).i(")"));
        return 1;
    }

    private class05216 N(class00891 class008912, int n) {
        return class00392.y((String)class008912.M().getString()).y(class00405.N.N(class05194.N((int)(n & 0xFFFFFF))));
    }

    private int N(class00903 class009032, int n) {
        this.Z();
        class00891 class008912 = class009032.N().i();
        ((BlockESP)this.N_0).N(new class11025(class008912, n));
        class11303.y((Object)class11921.N((String)"blockesp.added").N(class06541.field_1080).i(" (").y((class00392)this.N(class008912, n)).i(")"));
        return 1;
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("blockesp").then(this.W())).then(this.E())).then(this.y())).then(this.U()));
    }

    private LiteralArgumentBuilder<class07689> W() {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("add").then(((LiteralArgumentBuilder)this.N("shulker").executes(commandContext -> this.u(-1))).then(this.N("color", new class10860()).executes(commandContext -> this.u(class10860.N(commandContext, "color")))))).then(((RequiredArgumentBuilder)this.N("block", (ArgumentType)new class10747(class07686.N((class01929)class04105.N()))).executes(commandContext -> this.N(class10747.N((CommandContext)commandContext, (String)"block"), -1))).then(this.N("color", new class10860()).executes(commandContext -> this.N(class10747.N((CommandContext)commandContext, (String)"block"), class10860.N(commandContext, "color")))));
    }

    private static void R() {
    }
}

