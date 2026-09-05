/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10742
 *  Nursultan.class11303
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class04453
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07689
 *  org.joml.Vector2d
 */
package Nursultan;

import Nursultan.class10626;
import Nursultan.class10705;
import Nursultan.class10726;
import Nursultan.class10742;
import Nursultan.class11303;
import Nursultan.class11921;
import Nursultan.class11938;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07689;
import org.joml.Vector2d;

public class class10681
extends class10742 {
    public Object N_0;

    private LiteralArgumentBuilder<class07689> L() {
        return (LiteralArgumentBuilder)this.N("off").executes(commandContext -> this.M());
    }

    private int M() {
        this.R();
        ((class10705)this.N_0).y();
        return 1;
    }

    public class10681() {
        this.R();
        this.N_0 = class11938.Q();
    }

    static {
        class10681.y();
        class10681.u();
    }

    private int B() {
        this.R();
        if (((class10705)this.N_0).N()) {
            class00625 class006252 = new class00625(((Character)class10626.N_1).charValue() + "gps off");
            class05216 class052162 = class11921.N((String)"remove").N(class06541.field_1061).L(class00405.N.N((class00647)class006252));
            class11303.y((Object)class11921.N((String)"command.gps.info-enabled", (Object[])new Object[]{String.valueOf(class06541.field_1068) + ((class10705)this.N_0).u().x() + String.valueOf(class06541.field_1080), String.valueOf(class06541.field_1068) + ((class10705)this.N_0).u().y() + String.valueOf(class06541.field_1080)}).i(" ").y((class00392)class052162));
        } else {
            class11303.y((Object)class11921.N((String)"command.gps.info-disabled").N(class06541.field_1080));
        }
        return 1;
    }

    private LiteralArgumentBuilder<class07689> Z() {
        return (LiteralArgumentBuilder)this.N("info").executes(commandContext -> this.B());
    }

    private RequiredArgumentBuilder<class07689, Vector2d> U() {
        return (RequiredArgumentBuilder)this.N("pos", new class10726()).executes(commandContext -> {
            Vector2d vector2d = class10726.N((CommandContext<class07689>)commandContext, "pos");
            return this.N(vector2d.x, vector2d.y);
        });
    }

    private static void u() {
    }

    private static void y() {
    }

    private int N(double d, double d2) {
        this.R();
        ((class10705)this.N_0).N(d, d2);
        return 1;
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("gps").executes(commandContext -> this.N(((class04453)((class06202)this.y_0).T_4).method_23317(), ((class04453)((class06202)this.y_0).T_4).method_23321()))).then(this.Z())).then(this.L())).then(this.U()));
    }

    private void R() {
    }
}

