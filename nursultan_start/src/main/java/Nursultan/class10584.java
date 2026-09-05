/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09387
 *  Nursultan.class10626
 *  Nursultan.class10715
 *  Nursultan.class10742
 *  Nursultan.class10761
 *  Nursultan.class11303
 *  Nursultan.class11460
 *  Nursultan.class11481
 *  Nursultan.class11908
 *  Nursultan.class11910
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class12020
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class04453
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06889
 *  minecraft.class07689
 *  org.joml.Vector3d
 */
package Nursultan;

import Nursultan.class09387;
import Nursultan.class10626;
import Nursultan.class10715;
import Nursultan.class10742;
import Nursultan.class10761;
import Nursultan.class11303;
import Nursultan.class11460;
import Nursultan.class11481;
import Nursultan.class11908;
import Nursultan.class11910;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class12020;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07689;
import org.joml.Vector3d;

public class class10584
extends class10742 {
    public Object N_0;

    private int L() {
        this.R();
        if (((class11460)this.N_0).N().isEmpty()) {
            class11303.y((Object)(String.valueOf(class06541.field_1080) + class12020.N((String)"waypoint.empty-list")));
            return 0;
        }
        ((class11460)this.N_0).L();
        class11303.y((Object)(String.valueOf(class06541.field_1080) + class12020.N((String)"waypoint.cleared")));
        return 1;
    }

    private LiteralArgumentBuilder<class07689> M() {
        return (LiteralArgumentBuilder)this.N("remove").then(this.N("name", (ArgumentType)new class10715()).executes(commandContext -> this.N(class10715.N((CommandContext)commandContext, (String)"name"))));
    }

    public class10584() {
        this.R();
        this.N_0 = class11938.E();
    }

    static {
        class10584.u();
        class10584.y();
    }

    private LiteralArgumentBuilder<class07689> B() {
        return (LiteralArgumentBuilder)this.N("list").executes(commandContext -> this.Z());
    }

    private int Z() {
        this.R();
        if (((class11460)this.N_0).N().isEmpty()) {
            class11303.y((Object)class11921.N((String)"waypoint.empty-list").N(class06541.field_1080));
            return 0;
        }
        class11303.y((Object)class11921.N((String)"waypoint.list-header").N(class06541.field_1080));
        for (class11481 class114812 : ((class11460)this.N_0).N()) {
            class06889 class068892 = class114812.W();
            class00625 class006252 = new class00625(((Character)class10626.N_1).charValue() + "way remove " + class114812.m());
            class05216 class052162 = class11921.N((String)"remove").N(class06541.field_1061).L(class00405.N.N((class00647)class006252));
            class11303.y((Object)class00392.N((String)(String.valueOf(class06541.field_1068) + class114812.m() + " " + String.valueOf(class06541.field_1080) + "{" + String.valueOf(class06541.field_1068) + "x: " + class11908.N((double)class068892.N(), (double)0.1) + String.valueOf(class06541.field_1080) + ", " + String.valueOf(class06541.field_1068) + "y: " + class11908.N((double)class068892.y(), (double)0.1) + String.valueOf(class06541.field_1080) + ", " + String.valueOf(class06541.field_1068) + "z: " + class11908.N((double)class068892.L(), (double)0.1) + String.valueOf(class06541.field_1080) + "} " + String.valueOf(class06541.field_1080) + "{" + String.valueOf(class06541.field_1068) + "ip: " + class114812.s() + String.valueOf(class06541.field_1080) + "}")).L().i(" ").y((class00392)class052162));
        }
        class11303.y((Object)class11921.N((String)"total", (Object[])new Object[]{((class11460)this.N_0).N().size()}).N(class06541.field_1080));
        return 1;
    }

    private LiteralArgumentBuilder<class07689> i() {
        return (LiteralArgumentBuilder)this.N("clear").executes(commandContext -> this.L());
    }

    private LiteralArgumentBuilder<class07689> U() {
        return (LiteralArgumentBuilder)this.N("add").then(((RequiredArgumentBuilder)this.N("name", (ArgumentType)class10761.y((int)3, (int)16)).executes(commandContext -> this.N(class10742.N((CommandContext)commandContext, (String)"name"), ((class04453)((class06202)this.y_0).T_4).method_23317(), ((class04453)((class06202)this.y_0).T_4).method_23318(), ((class04453)((class06202)this.y_0).T_4).method_23321()))).then(this.N("pos", (ArgumentType)new class09387()).executes(commandContext -> {
            Vector3d vector3d = class09387.N((CommandContext)commandContext, (String)"pos");
            return this.N(class10742.N((CommandContext)commandContext, (String)"name"), vector3d.x, vector3d.y, vector3d.z);
        })));
    }

    private static void u() {
    }

    private static void y() {
    }

    private int N(class11481 class114812) {
        this.R();
        String string = class114812.m();
        if (((class11460)this.N_0).N(string)) {
            class11303.y((Object)class11921.N((String)"waypoint.removed", (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        } else {
            class11303.y((Object)class11921.N((String)"waypoint.not-found", (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        }
        return 1;
    }

    private int N(String string, double d, double d2, double d3) {
        this.R();
        class06889 class068892 = new class06889(d, d2, d3);
        ((class11460)this.N_0).N(string, class068892, class11910.L());
        class11303.y((Object)class11921.N((String)"waypoint.added", (Object[])new Object[]{String.valueOf(class06541.field_1068) + string + String.valueOf(class06541.field_1080)}).N(class06541.field_1080));
        return 1;
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        LiteralCommandNode literalCommandNode = commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("waypoint").then(this.U())).then(this.M())).then(this.B())).then(this.i()));
        commandDispatcher.register((LiteralArgumentBuilder)this.N("way").redirect((CommandNode)literalCommandNode));
    }

    private void R() {
    }
}

