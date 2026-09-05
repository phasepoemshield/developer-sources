/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 *  Nursultan.class09387
 *  Nursultan.class10742
 *  Nursultan.class10761
 *  Nursultan.class10843
 *  Nursultan.class10863
 *  Nursultan.class11472
 *  Nursultan.class11938
 *  Nursultan.class11945
 *  Nursultan.class11951
 *  Nursultan.class11958
 *  Nursultan.class11966
 *  Nursultan.class11976
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class07689
 *  org.joml.Vector3d
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class09387;
import Nursultan.class10742;
import Nursultan.class10761;
import Nursultan.class10843;
import Nursultan.class10863;
import Nursultan.class11472;
import Nursultan.class11938;
import Nursultan.class11945;
import Nursultan.class11951;
import Nursultan.class11958;
import Nursultan.class11966;
import Nursultan.class11976;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class07689;
import org.joml.Vector3d;

public class class10675
extends class10742 {
    private int w(String string) {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_2, string));
        return 1;
    }

    private int L() {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_0cd5d92a0fca835abb2e9f33e73c81193_3, ((class11472)class11938.L_2).Z()));
        class11938.N().L();
        return 1;
    }

    private LiteralArgumentBuilder<class07689> M() {
        return (LiteralArgumentBuilder)this.N("join").then(this.N("code", (ArgumentType)class10761.N((int)4, (int)4)).executes(commandContext -> this.M(class10742.N((CommandContext)commandContext, (String)"code"))));
    }

    private int M(String string) {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_1, string));
        return 1;
    }

    private int T() {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_3, ""));
        return 1;
    }

    static {
        class10675.E();
        class10675.i();
    }

    private LiteralArgumentBuilder<class07689> B() {
        return (LiteralArgumentBuilder)this.N("invite").then(this.N("user", (ArgumentType)new class10863()).executes(commandContext -> this.t(class10742.N((CommandContext)commandContext, (String)"user"))));
    }

    private LiteralArgumentBuilder<class07689> Z() {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("accept").executes(commandContext -> this.w(""))).then(this.N("code", (ArgumentType)class10761.N((int)4, (int)4)).executes(commandContext -> this.w(class10742.N((CommandContext)commandContext, (String)"code"))));
    }

    private int Z(String string) {
        if (!this.N()) {
            return 1;
        }
        string = string.trim();
        this.N((class11951<class09276>)new class11958(class11966.staticFields_0090476987a34349fa0f33a04d59e77da_1, string));
        return 1;
    }

    private static void i() {
    }

    private LiteralArgumentBuilder<class07689> s() {
        return (LiteralArgumentBuilder)this.N("kick").then(this.N("user", (ArgumentType)new class10863()).executes(commandContext -> this.G(class10742.N((CommandContext)commandContext, (String)"user"))));
    }

    private RequiredArgumentBuilder<class07689, String> m() {
        return (RequiredArgumentBuilder)this.N("text", (ArgumentType)new class10843()).executes(commandContext -> this.Z(class10742.N((CommandContext)commandContext, (String)"text")));
    }

    private int t(String string) {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_0cd5d92a0fca835abb2e9f33e73c81193_1, string));
        return 1;
    }

    private LiteralArgumentBuilder<class07689> j() {
        return (LiteralArgumentBuilder)this.N("info").executes(commandContext -> this.y());
    }

    private LiteralArgumentBuilder<class07689> U() {
        return (LiteralArgumentBuilder)this.N("leave").executes(commandContext -> this.L());
    }

    private LiteralArgumentBuilder<class07689> z() {
        return (LiteralArgumentBuilder)this.N("decline").executes(commandContext -> this.T());
    }

    private int u() {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_0cd5d92a0fca835abb2e9f33e73c81193_0, ((class11472)class11938.L_2).Z()));
        return 1;
    }

    private int y() {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_4, ((class11472)class11938.L_2).Z()));
        return 1;
    }

    private static void E() {
    }

    private void N(class11951<class09276> class119512) {
        class11938.z().N(class119512);
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("party").then(this.N("create").executes(commandContext -> this.u()))).then(this.B())).then(this.U())).then(this.m())).then(((RequiredArgumentBuilder)this.N("pos", (ArgumentType)new class09387()).executes(commandContext -> {
            Vector3d vector3d = class09387.N((CommandContext)commandContext, (String)"pos");
            return this.Z("%s %s %s ".formatted(new Object[]{vector3d.x(), vector3d.y(), vector3d.z()}));
        })).then(this.m().executes(commandContext -> {
            Vector3d vector3d = class09387.N((CommandContext)commandContext, (String)"pos");
            return this.Z("%s %s %s ".formatted(new Object[]{vector3d.x(), vector3d.y(), vector3d.z()}) + class10742.N((CommandContext)commandContext, (String)"text"));
        })))).then(this.M())).then(this.Z())).then(this.z())).then(this.s())).then(this.R())).then(this.j()));
    }

    private int W() {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_1cd5d92a0fca835abb2e9f33e73c81193_0, ((class11472)class11938.L_2).Z()));
        class11938.N().L();
        return 1;
    }

    private LiteralArgumentBuilder<class07689> R() {
        return (LiteralArgumentBuilder)this.N("disband").executes(commandContext -> this.W());
    }

    private int G(String string) {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11945(class11976.staticFields_0cd5d92a0fca835abb2e9f33e73c81193_2, string));
        return 1;
    }
}

