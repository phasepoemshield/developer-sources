/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10626
 *  Nursultan.class10742
 *  Nursultan.class10773
 *  Nursultan.class11303
 *  Nursultan.class11480
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class09327;
import Nursultan.class09332;
import Nursultan.class09401;
import Nursultan.class10626;
import Nursultan.class10742;
import Nursultan.class10773;
import Nursultan.class11303;
import Nursultan.class11480;
import Nursultan.class11921;
import Nursultan.class11938;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07689;

public class class09363
extends class10742 {
    public Object N_0;

    private int L() {
        this.R();
        if (((class09327)this.N_0).y().isEmpty()) {
            class11303.y((Object)class11921.N((String)"friend.empty-list").N(class06541.field_1080));
            return 0;
        }
        class11303.y((Object)class11921.N((String)"friend.list-header").N(class06541.field_1080));
        for (class09332 class093322 : ((class09327)this.N_0).y()) {
            class00625 class006252 = new class00625(((Character)class10626.N_1).charValue() + "friend remove " + class093322.y());
            class05216 class052162 = class11921.N((String)"remove").N(class06541.field_1061).L(class00405.N.N((class00647)class006252));
            class11303.y((Object)class11921.N((String)"friend.list-entry", (Object[])new Object[]{String.valueOf(class06541.field_1068) + class093322.y() + String.valueOf(class06541.field_1080), String.valueOf(class06541.field_1068) + class11480.N((long)class093322.N()) + String.valueOf(class06541.field_1080)}).N(class06541.field_1061).i(" ").y((class00392)class052162));
        }
        class11303.y((Object)class11921.N((String)"total", (Object[])new Object[]{((class09327)this.N_0).y().size()}).N(class06541.field_1080));
        return 1;
    }

    public class09363() {
        this.R();
        this.N_0 = class11938.t();
    }

    static {
        class09363.u();
        class09363.y();
    }

    private LiteralArgumentBuilder<class07689> B() {
        return (LiteralArgumentBuilder)this.N("remove").then(this.N("name", (ArgumentType)new class10773()).executes(commandContext -> this.N(class10773.N((CommandContext)commandContext, (String)"name"))));
    }

    private LiteralArgumentBuilder<class07689> Z() {
        return (LiteralArgumentBuilder)this.N("list").executes(commandContext -> this.L());
    }

    private int i() {
        String string;
        this.R();
        if (((class09327)this.N_0).y().isEmpty()) {
            string = "friend.empty-list";
        } else {
            ((class09327)this.N_0).N();
            string = "friend.cleared";
        }
        class11303.y((Object)class11921.N((String)string).N(class06541.field_1080));
        return 1;
    }

    private LiteralArgumentBuilder<class07689> U() {
        return (LiteralArgumentBuilder)this.N("clear").executes(commandContext -> this.i());
    }

    private LiteralArgumentBuilder<class07689> z() {
        return (LiteralArgumentBuilder)this.N("add").then(this.N("name", (ArgumentType)new class09401()).executes(commandContext -> this.G(class10742.N((CommandContext)commandContext, (String)"name"))));
    }

    private static void u() {
    }

    private static void y() {
    }

    private int N(class09332 class093322) {
        this.R();
        String string = class093322.y();
        ((class09327)this.N_0).y(string);
        class11303.y((Object)class11921.N((String)"friend.removed", (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        return 1;
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("friend").then(this.z())).then(this.B())).then(this.Z())).then(this.U()));
        commandDispatcher.register((LiteralArgumentBuilder)this.N("fr").redirect((CommandNode)literalCommandNode));
    }

    private void R() {
    }

    private int G(String string) {
        this.R();
        String string2 = ((class09327)this.N_0).N(string, System.currentTimeMillis()) ? "friend.added" : "friend.exists";
        class11303.y((Object)class11921.N((String)string2, (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        return 1;
    }
}

