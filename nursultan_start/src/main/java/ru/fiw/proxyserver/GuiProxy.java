/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05725
 *  minecraft.class06541
 */
package ru.fiw.proxyserver;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class05725;
import minecraft.class06541;
import ru.fiw.proxyserver.Config;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.ProxyServer;
import ru.fiw.proxyserver.TestPing;

public class GuiProxy
extends class05096 {
    private final class05096 parent;
    private boolean isSocks4;
    private class04927 ipPort;
    private class04927 username;
    private class04927 password;
    private class05725 enabledCheck;
    private String msg = "";
    private final TestPing testPing = new TestPing();
    private int startY;
    private int centerX;

    public GuiProxy(class05096 class050962) {
        super((class00392)class00392.y((String)"Proxy Settings"));
        this.parent = class050962;
    }

    private void apply() {
        ProxyServer.proxy = new Proxy(this.isSocks4, this.ipPort.method_1882(), this.username.method_1882(), this.password != null ? this.password.method_1882() : "");
        ProxyServer.proxyEnabled = this.enabledCheck.y();
        Config.saveConfig();
    }

    public void method_25426() {
        this.centerX = this.field_22789 / 2;
        this.startY = this.field_22790 / 2 - 60;
        int n = this.centerX - 100;
        this.isSocks4 = ProxyServer.proxy.type == Proxy.ProxyType.SOCKS4;
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)("Type: " + (this.isSocks4 ? "Socks 4" : "Socks 5"))), this::lambda$init$0).N(n, this.startY, 200, 20).N());
        this.ipPort = new class04927(this.field_22793, n, this.startY + 24, 200, 20, (class00392)class00392.i());
        this.ipPort.method_47404((class00392)class00392.y((String)"e.g. 125.1.34.1:2555").N(class06541.field_1063));
        this.ipPort.method_1852(ProxyServer.proxy.ipPort);
        this.method_37063((class04654)this.ipPort);
        this.username = new class04927(this.field_22793, n, this.startY + 48, 200, 20, (class00392)class00392.i());
        this.username.method_47404((class00392)class00392.y((String)(this.isSocks4 ? "User ID" : "Username")).N(class06541.field_1063));
        this.username.method_1852(ProxyServer.proxy.username);
        this.method_37063((class04654)this.username);
        if (!this.isSocks4) {
            this.password = new class04927(this.field_22793, n, this.startY + 72, 200, 20, (class00392)class00392.i());
            this.password.method_47404((class00392)class00392.y((String)"Password").N(class06541.field_1063));
            this.password.method_1852(ProxyServer.proxy.password);
            this.method_37063((class04654)this.password);
        }
        this.enabledCheck = class05725.y((class00392)class00392.y((String)"Enable Proxy"), (class01590)this.field_22793).N(n, this.startY + 96).N(ProxyServer.proxyEnabled).N(GuiProxy::lambda$init$1).N();
        this.method_37063((class04654)this.enabledCheck);
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"Apply"), this::lambda$init$2).N(n, this.startY + 125, 64, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"Test"), this::lambda$init$3).N(n + 68, this.startY + 125, 64, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"Cancel"), this::lambda$init$4).N(n + 136, this.startY + 125, 64, 20).N());
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        String string;
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.centerX, this.startY - 20, 0xFFFFFF);
        String string2 = string = !this.msg.isEmpty() ? this.msg : this.testPing.state;
        if (string != null && !string.isEmpty()) {
            int n3 = this.field_22793.y(string);
            int n4 = 200;
            int n5 = 20;
            int n6 = this.centerX - n4 / 2;
            int n7 = this.startY + 155;
            int n8 = n6 + n4;
            int n9 = n7 + n5;
            class010542.N(n6 - 1, n7 - 1, n8 + 1, n9 + 1, -6250336);
            class010542.N(n6, n7, n8, n9, -16777216);
            class010542.y(this.field_22793, (class00392)class00392.y((String)string), n6 + 4, n7 + (n5 - 8) / 2, -2039584);
        }
    }

    public void method_25419() {
        this.field_22787.N(this.parent);
    }

    private void lambda$init$0(class05362 class053622) {
        this.isSocks4 = !this.isSocks4;
        ProxyServer.proxy.type = this.isSocks4 ? Proxy.ProxyType.SOCKS4 : Proxy.ProxyType.SOCKS5;
        this.method_41843();
    }

    private void lambda$init$3(class05362 class053622) {
        this.msg = "";
        if (!this.ipPort.method_1882().contains(":")) {
            this.msg = String.valueOf(class06541.field_1061) + "Use IP:Port";
            return;
        }
        this.testPing.run("mc.hypixel.net", 25565, new Proxy(this.isSocks4, this.ipPort.method_1882(), this.username.method_1882(), this.password != null ? this.password.method_1882() : ""));
    }

    private void lambda$init$2(class05362 class053622) {
        this.apply();
        this.method_25419();
    }

    private static void lambda$init$1(class05725 class057252, boolean bl) {
        ProxyServer.proxyEnabled = bl;
    }

    private void lambda$init$4(class05362 class053622) {
        this.method_25419();
    }
}

