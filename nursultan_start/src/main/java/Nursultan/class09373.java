/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Nuker
 *  Nursultan.class10742
 *  Nursultan.class10747
 *  Nursultan.class11303
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00891
 *  minecraft.class00903
 *  minecraft.class01929
 *  minecraft.class04105
 *  minecraft.class06541
 *  minecraft.class07686
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.Nuker;
import Nursultan.class09404;
import Nursultan.class10742;
import Nursultan.class10747;
import Nursultan.class11303;
import Nursultan.class11921;
import Nursultan.class11938;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import minecraft.class00891;
import minecraft.class00903;
import minecraft.class01929;
import minecraft.class04105;
import minecraft.class06541;
import minecraft.class07686;
import minecraft.class07689;

public class class09373
extends class10742 {
    public Object N_0;

    private static void L() {
    }

    private LiteralArgumentBuilder<class07689> M() {
        return (LiteralArgumentBuilder)this.N("remove").then(this.N("block", new class09404()).executes(commandContext -> this.N(class09404.N(commandContext, "block"))));
    }

    public class09373() {
        this.B();
        this.N_0 = class11938.u().b();
    }

    static {
        class09373.u();
        class09373.L();
    }

    private void B() {
    }

    private int i() {
        String string;
        this.B();
        if (((Nuker)this.N_0).m().isEmpty()) {
            string = "nuker.empty-list";
        } else {
            ((Nuker)this.N_0).P();
            string = "nuker.cleared";
        }
        class11303.y((Object)class11921.N((String)string).N(class06541.field_1080));
        return 1;
    }

    private LiteralArgumentBuilder<class07689> U() {
        return (LiteralArgumentBuilder)this.N("add").then(this.N("block", (ArgumentType)new class10747(class07686.N((class01929)class04105.N()))).executes(commandContext -> this.N(class10747.N((CommandContext)commandContext, (String)"block"))));
    }

    private int z() {
        this.B();
        if (((Nuker)this.N_0).m().isEmpty()) {
            class11303.y((Object)class11921.N((String)"nuker.empty-list").N(class06541.field_1080));
            return 0;
        }
        class11303.y((Object)class11921.N((String)"nuker.list-header").N(class06541.field_1080));
        for (class00891 class008912 : ((Nuker)this.N_0).m()) {
            class11303.y((Object)class11921.N((String)"nuker.list-entry", (Object[])new Object[]{String.valueOf(class06541.field_1068) + class008912.M().getString() + String.valueOf(class06541.field_1080)}).N(class06541.field_1061).i(" "));
        }
        class11303.y((Object)class11921.N((String)"total", (Object[])new Object[]{((Nuker)this.N_0).m().size()}).N(class06541.field_1080));
        return 1;
    }

    private static void u() {
    }

    private LiteralArgumentBuilder<class07689> y() {
        return (LiteralArgumentBuilder)this.N("list").executes(commandContext -> this.z());
    }

    private int N(class00891 class008912) {
        this.B();
        String string = class008912.M().getString();
        if (!((Nuker)this.N_0).y(class008912)) {
            class11303.y((Object)class11921.N((String)"nuker.not-found", (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
            return 0;
        }
        class11303.y((Object)class11921.N((String)"nuker.removed", (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        return 1;
    }

    private int N(class00903 class009032) {
        this.B();
        class00891 class008912 = class009032.N().i();
        String string = class008912.M().getString();
        class11303.y((Object)class11921.N((String)(((Nuker)this.N_0).N(class008912) ? "nuker.added" : "nuker.exists"), (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        return 1;
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("nuker").then(this.U())).then(this.M())).then(this.R())).then(this.y()));
        commandDispatcher.register((LiteralArgumentBuilder)this.N("nuk").redirect((CommandNode)literalCommandNode));
    }

    private LiteralArgumentBuilder<class07689> R() {
        return (LiteralArgumentBuilder)this.N("clear").executes(commandContext -> this.i());
    }
}

