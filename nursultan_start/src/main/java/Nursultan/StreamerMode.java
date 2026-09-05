/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09295
 *  Nursultan.class09332
 *  Nursultan.class10953
 *  Nursultan.class10973
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11353
 *  Nursultan.class11372
 *  Nursultan.class11424
 *  Nursultan.class11432
 *  Nursultan.class11458
 *  Nursultan.class11472
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11533
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11938
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00189
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class02565
 *  minecraft.class04208
 *  minecraft.class04459
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 */
package Nursultan;

import Nursultan.class09295;
import Nursultan.class09332;
import Nursultan.class10953;
import Nursultan.class10973;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11353;
import Nursultan.class11372;
import Nursultan.class11424;
import Nursultan.class11432;
import Nursultan.class11458;
import Nursultan.class11472;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11533;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11938;
import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import minecraft.class00189;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class02565;
import minecraft.class04208;
import minecraft.class04459;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;

@class11080(L="StreamerMode", y=class11072.VISUAL, N=class11106.SCREEN)
public class StreamerMode
extends class11067 {
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;
    public static Object L_6;
    public static Object L_7;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;

    public boolean P() {
        return (Boolean)class11938.L_3 != false || ((class11472)class11938.L_2).Z().equals("NursultanFree");
    }

    public StreamerMode() {
        this.b();
        this.u_0 = new class11535("skins", true);
        this.u_1 = new class11535("name", true);
        this.u_2 = new class11535("links", true);
        this.u_3 = new class11535("ft", false);
        this.u_4 = class11524.y((class11512)this, (String)"hide-entries", (class11535[])new class11535[]{(class11535)this.u_0, (class11535)this.u_1, (class11535)this.u_2, (class11535)this.u_3});
        this.u_5 = (class11533)class11524.N((class11512)this, (String)"custom-name", (String)"nursultan.fun", (Pattern)Pattern.compile("^[\u0430-\u044f\u0410-\u042fa-zA-Z0-9_\u0401\u0451]+$")).N((T class115362) -> {
            this.b();
            return ((class11535)this.u_1).U();
        });
        this.u_6 = new HashSet();
        class11938.L().N(class11353.class, this::N);
        class11938.L().N(class11372.class, this::N);
    }

    static {
        StreamerMode.s();
        L_0 = class06541.field_1051;
        L_1 = class00392.y((String)"\u041f\u043e\u043c\u043e\u0439\u043a\u0430").N((class06541)L_0);
        L_2 = class00392.y((String)"\u041f\u0435\u0434\u0438\u043a").N((class06541)L_0);
        L_3 = class00392.y((String)"\u0425\u0443\u0435\u0441\u043e\u0441").N((class06541)L_0);
        L_4 = new class11432[]{new class11432("dd.funtime.su", (class00392)L_1), new class11432("vk.com/funtime", (class00392)L_1), new class11432("play.funtime.su", (class00392)L_1), new class11432("funtime.su", (class00392)L_1), new class11432("t.me/funtime", (class00392)L_1), new class11432("funtime", (class00392)L_1), new class11432("\u0444\u0430\u043d\u0442\u0430\u0439\u043c", (class00392)L_1), new class11432("\u0430\u043d\u0430\u0440\u0445\u0438\u044f", (class00392)L_1), new class11432("\u0445\u0430\u0431", (class00392)L_1), new class11432("/links", (class00392)L_3), new class11432("\u0441\u043a\u0432\u0438\u0434", (class00392)L_2), new class11432("\u043a\u043d\u044f\u0437\u044c", (class00392)L_2), new class11432("\u0442\u0438\u0442\u0430\u043d", (class00392)L_2), new class11432("\u044d\u043b\u0438\u0442\u0430", (class00392)L_2), new class11432("\u0433\u0435\u0440\u043e\u0439", (class00392)L_2), new class11432("\u0431\u0430\u0440\u043e\u043d", (class00392)L_2), new class11432("\u043f\u0440\u0438\u043d\u0446", (class00392)L_2), new class11432("\u0441\u0442\u0440\u0430\u0436", (class00392)L_2), new class11432("\u0430\u0441\u043f\u0438\u0434", (class00392)L_2), new class11432("\u0433\u0435\u0440\u0446\u043e\u0433", (class00392)L_2), new class11432("staff", (class00392)L_2), new class11432("\u0433\u043b\u0430\u0432\u0430", (class00392)L_2)};
        L_5 = new class11432[]{new class11432("shop.Spookytime.net", (class00392)L_1), new class11432("vk.com/spookytimenet", (class00392)L_1), new class11432("\u0421\u043f\u0443\u043a\u0438\u0422\u0430\u0439\u043c!", (class00392)L_1), new class11432("\u0421\u043f\u0443\u043a\u0438\u0422\u0430\u0439\u043c", (class00392)L_1), new class11432("\u0421\u043f\u0443\u043a\u0438\u0442\u0430\u0439\u043c", (class00392)L_1), new class11432("\u0441\u043f\u0443\u043a\u0438\u0442\u0430\u0439\u043c", (class00392)L_1), new class11432("discord.gg/spookytime", (class00392)L_1), new class11432("spookytime.net", (class00392)L_1), new class11432("SpookyTime", (class00392)L_1), new class11432("SpookyTime!", (class00392)L_1)};
        L_7 = new String[]{"\u2554", "\u0412\u041d\u0418\u041c\u0410\u041d\u0418\u0415!", "\u041d\u0430\u0447\u0438\u0441\u043b\u0435\u043d\u0430 \u0444\u043e\u0440\u0442\u0443\u043d\u0430:", "\u2560", "\u255a"};
        Arrays.sort((Object[])L_4, (class114322, class114323) -> Integer.compare(class114323.N().length(), class114322.N().length()));
        L_6 = Stream.concat(Arrays.stream((Object[])L_4), Arrays.stream((Object[])L_5)).toArray(class11432[]::new);
    }

    private void b() {
    }

    private static void s() {
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = null;
        L_5 = null;
        L_6 = null;
        L_7 = null;
    }

    public boolean m() {
        this.b();
        return this.U() && ((class11535)this.u_0).U();
    }

    private String N(class02565 class025652) {
        return class025652.M().map(class024062 -> class024062.N().getString() + class024062.R().getString() + class024062.M().getString()).orElse("");
    }

    @class11782
    public void N(class10973 class109732) {
        boolean bl;
        this.b();
        class05216 class052162 = class109732.N().L();
        String string = class052162.getString().toLowerCase(Locale.US);
        if (((class11535)this.u_3).U()) {
            bl = false;
            for (class11432 class114322 : this.P() ? (class11432[])L_6 : (class11432[])L_4) {
                if (!string.contains(class114322.N())) continue;
                class052162 = class11458.L((class00392)class052162, (String)class114322.N(), (class00392)class114322.y());
                bl = true;
                break;
            }
            if (bl) {
                class109732.N((class00392)class052162);
            }
        }
        if (((class11535)this.u_2).U()) {
            bl = false;
            Matcher matcher = Pattern.compile("vk.\\S+|t.me/\\S+|https?://\\S+").matcher(string);
            if (matcher.matches()) {
                class052162 = class11458.L((class00392)class052162, (String)matcher.group(), (class00392)((class05216)L_1));
                bl = true;
            }
            if (bl) {
                class109732.N((class00392)class052162);
            }
        }
        if (((class11535)this.u_1).U()) {
            class00392 class003922 = class00392.N((String)((class11533)this.u_5).i());
            for (String string2 : (Set)this.u_6) {
                class052162 = class11458.L((class00392)class052162, (String)string2, (class00392)class003922);
            }
            class052162 = class11458.L((class00392)class052162, (String)((class06202)this.y_0).NH().name(), (class00392)class003922);
            class109732.N((class00392)class052162);
        }
    }

    private void N(class11372 class113722) {
        this.b();
        switch (((int[])class11424.N_1)[class113722.u().ordinal()]) {
            case 1: {
                Arrays.stream(class113722.L()).map(class09295::N).forEach(((Set)this.u_6)::add);
                break;
            }
            case 2: {
                class11938.N().y().toList().forEach(((Set)this.u_6)::remove);
            }
        }
    }

    @class11782
    public void N(class10953 class109532) {
        this.b();
        if (!((class11535)this.u_0).U()) {
            return;
        }
        if (class109532.N().N.u() == class04208.field_41122) {
            class109532.N(class00189.N[0].N().y());
        } else {
            class109532.N(class00189.N[15].N().y());
        }
    }

    @class11782
    public void N(class10990 class109902) {
        if (!this.P()) {
            return;
        }
        class00381 class003812 = class109902.u();
        Objects.requireNonNull(class003812);
        class00381 var2 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class04459.class, class02565.class}, (Object)var2, (int)n)) {
            case 0: {
                String string = ((class04459)var2).N().getString().toLowerCase(Locale.US);
                for (String string2 : (String[])L_7) {
                    if (!string.contains(string2)) continue;
                    class109902.N();
                    return;
                }
                break;
            }
            case 1: {
                class02565 class025652 = (class02565)var2;
                if (!this.N(class025652).contains("\u0424\u043e\u0440\u0442\u0443\u043d\u044b:")) break;
                class109902.N();
                break;
            }
        }
    }

    private void N(class11353 class113532) {
        this.b();
        class09332 class093323 = class113532.y();
        switch (((int[])class11424.N_0)[class113532.u().ordinal()]) {
            case 1: {
                ((Set)this.u_6).add(class093323.y());
                break;
            }
            case 2: {
                ((Set)this.u_6).remove(class093323.y());
                break;
            }
            case 3: {
                class11938.t().y().forEach(class093322 -> {
                    this.b();
                    ((Set)this.u_6).remove(class093322.y());
                });
            }
        }
    }
}

