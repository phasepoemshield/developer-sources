/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09382
 *  Nursultan.class10742
 *  Nursultan.class10751
 *  Nursultan.class10761
 *  Nursultan.class11303
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class11992
 *  Nursultan.class11997
 *  Nursultan.class12002
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

import Nursultan.class09382;
import Nursultan.class10626;
import Nursultan.class10684;
import Nursultan.class10742;
import Nursultan.class10751;
import Nursultan.class10761;
import Nursultan.class11303;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class11992;
import Nursultan.class11997;
import Nursultan.class12002;
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

public class class10665
extends class10742 {
    public Object N_0;

    private LiteralArgumentBuilder<class07689> L() {
        return (LiteralArgumentBuilder)this.N("add").then(this.N("name", (ArgumentType)class10761.N((int)20)).then(this.N("key", (ArgumentType)new class09382()).then(this.N("message", new class10684()).executes(commandContext -> this.N(class10742.N((CommandContext)commandContext, (String)"name"), class10684.N((CommandContext<class07689>)commandContext, "message").getString(), class09382.N((CommandContext)commandContext, (String)"key").L())))));
    }

    private int M() {
        String string;
        this.Z();
        if (((class11992)this.N_0).L().isEmpty()) {
            string = "macros.empty-list";
        } else {
            ((class11992)this.N_0).y();
            string = "macros.cleared";
        }
        class11303.y((Object)class11921.N((String)string).N(class06541.field_1080));
        return 1;
    }

    public class10665() {
        this.Z();
        this.N_0 = class11938.y();
    }

    private LiteralArgumentBuilder<class07689> B() {
        return (LiteralArgumentBuilder)this.N("remove").then(this.N("name", (ArgumentType)new class10751()).executes(commandContext -> this.N(class10751.N((CommandContext)commandContext, (String)"name"))));
    }

    private void Z() {
    }

    private LiteralArgumentBuilder<class07689> u() {
        return (LiteralArgumentBuilder)this.N("list").executes(commandContext -> this.y());
    }

    private int y() {
        this.Z();
        if (((class11992)this.N_0).L().isEmpty()) {
            class11303.y((Object)class11921.N((String)"macros.empty-list").N(class06541.field_1080));
            return 0;
        }
        class11303.y((Object)class11921.N((String)"macros.list-header").N(class06541.field_1080));
        for (class11997 class119972 : ((class11992)this.N_0).L()) {
            class00625 class006252 = new class00625(((Character)class10626.N_1).charValue() + "macros remove " + class119972.L());
            class05216 class052162 = class11921.N((String)"remove").N(class06541.field_1061).L(class00405.N.N((class00647)class006252));
            class11303.y((Object)class11921.N((String)"macros.list-entry", (Object[])new Object[]{String.valueOf(class06541.field_1068) + class119972.L(), String.valueOf(class06541.field_1068) + class12002.y((int)class119972.N()).u(), String.valueOf(class06541.field_1068) + class119972.y()}).N(class06541.field_1080).i(" ").y((class00392)class052162));
        }
        class11303.y((Object)class11921.N((String)"total", (Object[])new Object[]{((class11992)this.N_0).L().size()}).N(class06541.field_1080));
        return 1;
    }

    private int N(class11997 class119972) {
        this.Z();
        String string = class119972.L();
        ((class11992)this.N_0).N(string);
        class11303.y((Object)class11921.N((String)"macros.removed", (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        return 1;
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("macros").then(this.L())).then(this.B())).then(this.u())).then(this.R()));
        commandDispatcher.register((LiteralArgumentBuilder)this.N("mac").redirect((CommandNode)literalCommandNode));
    }

    private int N(String string, String string2, int n) {
        this.Z();
        class11303.y((Object)class11921.N((String)(((class11992)this.N_0).N(string, string2, n) ? "macros.added" : "macros.exists"), (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080), String.valueOf(class06541.field_1068) + class12002.y((int)n).u() + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        return 1;
    }

    private LiteralArgumentBuilder<class07689> R() {
        return (LiteralArgumentBuilder)this.N("clear").executes(commandContext -> this.M());
    }
}

