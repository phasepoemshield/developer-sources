/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 *  Nursultan.class09406
 *  Nursultan.class10674
 *  Nursultan.class10742
 *  Nursultan.class10843
 *  Nursultan.class11303
 *  Nursultan.class11467
 *  Nursultan.class11472
 *  Nursultan.class11828
 *  Nursultan.class11847
 *  Nursultan.class11908
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class11951
 *  Nursultan.class11958
 *  Nursultan.class11966
 *  Nursultan.class11971
 *  Nursultan.class11974
 *  Nursultan.class11983
 *  Nursultan.class11984
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class06541
 *  minecraft.class07689
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class09406;
import Nursultan.class10674;
import Nursultan.class10742;
import Nursultan.class10843;
import Nursultan.class10863;
import Nursultan.class11303;
import Nursultan.class11467;
import Nursultan.class11472;
import Nursultan.class11828;
import Nursultan.class11847;
import Nursultan.class11908;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class11951;
import Nursultan.class11958;
import Nursultan.class11966;
import Nursultan.class11971;
import Nursultan.class11974;
import Nursultan.class11983;
import Nursultan.class11984;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class06541;
import minecraft.class07689;

public class class10874
extends class10742 {
    public Object N_0;
    public static Object u_0;

    private int L(int n) {
        if (!this.N()) {
            return 1;
        }
        ((class11472)class11938.L_2).L(n);
        this.N((class11951<class09276>)class11847.N());
        class11303.y((Object)class11921.N((String)"irc.prefix.installed").N(class06541.field_1080));
        return 1;
    }

    private void L() {
    }

    private static void M() {
    }

    private static void T() {
        u_0 = 3000;
    }

    public class10874() {
        this.L();
        this.N_0 = new class11467();
    }

    static {
        class10874.y();
        class10874.M();
        class10874.B();
        class10874.T();
    }

    private static void B() {
    }

    private boolean i() {
        this.L();
        return ((class11467)this.N_0).N(3000L) || class11828.HELPER.N(((class11472)class11938.L_2).i());
    }

    private RequiredArgumentBuilder<class07689, String> s() {
        return (RequiredArgumentBuilder)this.N("text", (ArgumentType)new class10843()).executes(commandContext -> this.v(class10742.N((CommandContext)commandContext, (String)"text")));
    }

    private LiteralArgumentBuilder<class07689> m() {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("prefix").then(((LiteralArgumentBuilder)this.N("list").executes(commandContext -> this.N(0))).then(this.N("page", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> this.N(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"page")))))).then(this.N("reset").executes(commandContext -> this.u()))).then(this.N("set").then(this.N("index", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> this.L(IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"index")))));
    }

    private int v(String string) {
        this.L();
        if (!this.N()) {
            return 1;
        }
        if (this.i()) {
            String string2 = string.trim();
            this.N((class11951<class09276>)new class11958(class11966.staticFields_0090476987a34349fa0f33a04d59e77da_0, string2));
            ((class11467)this.N_0).N();
            return 1;
        }
        this.E();
        return 1;
    }

    private LiteralArgumentBuilder<class07689> z() {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("unmute").requires(class076892 -> class11828.HELPER.N(((class11472)class11938.L_2).i()))).then(this.N("login", (ArgumentType)StringArgumentType.word()).executes(commandContext -> this.O(StringArgumentType.getString((CommandContext)commandContext, (String)"login"))));
    }

    private int u() {
        if (!this.N()) {
            return 1;
        }
        if (((class11472)class11938.L_2).L() != -1) {
            ((class11472)class11938.L_2).L(-1);
            this.N((class11951<class09276>)class11847.N());
            class11303.y((Object)class11921.N((String)"irc.prefix.cleared").N(class06541.field_1080));
        } else {
            class11303.y((Object)class11921.N((String)"irc.prefix.already").N(class06541.field_1080));
        }
        return 1;
    }

    private static void y() {
    }

    private void E() {
        this.L();
        long l = 3000L - ((class11467)this.N_0).y();
        if (l < 0L) {
            l = 0L;
        }
        float f = class11908.N((float)((float)l / 1000.0f), (float)0.1f);
        f = Math.max(0.0f, f);
        class11303.y((Object)class11921.N((String)"irc.wait-before-send", (Object[])new Object[]{Float.valueOf(f)}).N(class06541.field_1080));
    }

    private int N(int n) {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11983(n));
        return 1;
    }

    public void N(CommandDispatcher<class07689> commandDispatcher) {
        LiteralArgumentBuilder var2 = (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("irc").requires(class076892 -> class11938.u().K().U())).then(this.s())).then(this.R())).then(this.m());
        if (class11828.HELPER.N(((class11472)class11938.L_2).i())) {
            ((LiteralArgumentBuilder)var2.then(this.W())).then(this.z());
        }
        commandDispatcher.register(var2);
    }

    private void N(class11951<class09276> class119512) {
        class11938.z().N(class119512);
    }

    private int N(String string, int n, String string2) {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11984(string, string2, n));
        return 1;
    }

    private int N(String string, String string2) {
        this.L();
        if (!this.N()) {
            return 1;
        }
        if (string.equalsIgnoreCase(((class11472)class11938.L_2).Z())) {
            class11303.y((Object)class11921.N((String)"irc.self").N(class06541.field_1080));
            return 1;
        }
        if (this.i()) {
            this.N((class11951<class09276>)new class11974(string, string2));
            ((class11467)this.N_0).N();
            return 1;
        }
        this.E();
        return 1;
    }

    private LiteralArgumentBuilder<class07689> W() {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("mute").requires(class076892 -> class11828.HELPER.N(((class11472)class11938.L_2).i()))).then(this.N("login", new class10863()).then(this.N("time", (ArgumentType)new class10674()).then(this.N("reason", (ArgumentType)new class09406()).executes(commandContext -> this.N(class10742.N((CommandContext)commandContext, (String)"login"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"), class10742.N((CommandContext)commandContext, (String)"reason"))))));
    }

    private LiteralArgumentBuilder<class07689> R() {
        return (LiteralArgumentBuilder)this.N("dm").then(this.N("login", new class10863()).then(this.N("message", (ArgumentType)StringArgumentType.greedyString()).executes(commandContext -> this.N(class10742.N((CommandContext)commandContext, (String)"login"), StringArgumentType.getString((CommandContext)commandContext, (String)"message")))));
    }

    private int O(String string) {
        if (!this.N()) {
            return 1;
        }
        this.N((class11951<class09276>)new class11971(string));
        return 1;
    }
}

