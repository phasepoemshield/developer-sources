/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11907
 *  Nursultan.class11910
 *  Nursultan.class11938
 *  minecraft.class00381
 *  minecraft.class01056
 *  minecraft.class04459
 *  minecraft.class06202
 *  minecraft.class06541
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11907;
import Nursultan.class11910;
import Nursultan.class11938;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class01056;
import minecraft.class04459;
import minecraft.class06202;
import minecraft.class06541;

@class11080(L="AutoAccept", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoAccept
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object u_0;
    public Object u_1;

    private void P() {
    }

    private boolean P(String string) {
        this.P();
        if (!((class11535)this.u_1).U() || !string.contains("\u0434\u0443\u044d\u043b\u044c\u043d\u0443\u044e \u043a\u043e\u043c\u0430\u043d\u0434\u0443")) {
            return false;
        }
        Matcher matcher = ((Pattern)this.L_4).matcher(string);
        if (!matcher.find()) {
            return false;
        }
        String string2 = matcher.group(1);
        if (((Boolean)((class11507)this.L_2).i()).booleanValue() && !this.n(string2)) {
            return false;
        }
        class11910.N((String)("/duel team accept " + string2));
        return true;
    }

    public AutoAccept() {
        this.P();
        this.u_0 = new class11535("teleport-request", true);
        this.u_1 = new class11535("command-duel-request", false);
        this.L_0 = new class11535("clan-invite-request", false);
        this.L_1 = class11524.y((class11512)this, (String)"accept", (class11535[])new class11535[]{(class11535)this.u_0, (class11535)this.u_1, (class11535)this.L_0});
        this.L_2 = (class11507)class11524.N((class11512)this, (String)"friends-accept-only", (boolean)true).N(class115362 -> {
            this.P();
            return !((List)((class11523)this.L_1).i()).isEmpty();
        });
        this.L_3 = new String[]{"\u043f\u0440\u043e\u0441\u0438\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f", "\u0445\u043e\u0447\u0435\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f"};
        this.L_4 = Pattern.compile("\u0418\u0433\u0440\u043e\u043a\\s+(\\S+)\\s+\u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0430\u0435\u0442 \u0432\u0430\u0441 \u0432 \u0441\u0432\u043e\u044e \u0434\u0443\u044d\u043b\u044c\u043d\u0443\u044e \u043a\u043e\u043c\u0430\u043d\u0434\u0443");
        this.L_5 = Pattern.compile("\\[\u2694]\\s*(\\S+)\\s+\u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0430\u0435\u0442\\s+\u0412\u0430\u0441\\s+\u0432\\s+\u043a\u043b\u0430\u043d");
        this.L_6 = Pattern.compile(".*(" + String.join((CharSequence)"|", (String[])this.L_3) + ").*", 32);
    }

    private void B(String string) {
        if (this.P(string)) {
            return;
        }
        if (this.Z(string)) {
            return;
        }
        this.i(string);
    }

    public boolean Z() {
        ((class01056)((class06202)this.y_0).i_6).i().L().forEach(this::B);
        return super.Z();
    }

    private boolean Z(String string) {
        this.P();
        if (!((class11535)this.L_0).U() || !string.contains("\u043f\u0440\u0438\u0433\u043b\u0430\u0448\u0430\u0435\u0442 \u0412\u0430\u0441 \u0432 \u043a\u043b\u0430\u043d")) {
            return false;
        }
        Matcher matcher = ((Pattern)this.L_5).matcher(string);
        if (!matcher.find()) {
            return false;
        }
        String string2 = matcher.group(1);
        if (((Boolean)((class11507)this.L_2).i()).booleanValue() && !this.n(string2)) {
            return false;
        }
        class11910.N((String)("/clan accept " + string2));
        return true;
    }

    private void i(String string) {
        this.P();
        if (!((class11535)this.u_0).U()) {
            return;
        }
        if (!((Pattern)this.L_6).matcher(string).matches()) {
            return;
        }
        if (Arrays.stream(string.split(" ")).noneMatch(this::n) && ((Boolean)((class11507)this.L_2).i()).booleanValue()) {
            return;
        }
        class11910.N((String)"/tpaccept");
    }

    private boolean n(String string) {
        return class11938.t().L(string) || class11938.N().y(string);
    }

    @class11782
    public void N(class10990 class109902) {
        class00381 var3;
        if (class11907.u() || !((var3 = class109902.u()) instanceof class04459)) {
            return;
        }
        class04459 class044592 = (class04459)var3;
        String string = class06541.N((String)class044592.N().getString());
        ((class06202)this.y_0).execute(() -> this.B(string));
    }
}

