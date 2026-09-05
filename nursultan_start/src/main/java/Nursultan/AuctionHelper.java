/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10951
 *  Nursultan.class10961
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11300
 *  Nursultan.class11359
 *  Nursultan.class11361
 *  Nursultan.class11380
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11564
 *  Nursultan.class11782
 *  Nursultan.class11910
 *  Nursultan.class11929
 *  Nursultan.class12002
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00496
 *  minecraft.class00524
 *  minecraft.class02484
 *  minecraft.class02710
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class07050
 *  minecraft.class07314
 *  minecraft.class07482
 *  minecraft.class08394
 *  minecraft.class08562
 *  org.apache.commons.lang3.StringUtils
 */
package Nursultan;

import Nursultan.class10951;
import Nursultan.class10961;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11300;
import Nursultan.class11359;
import Nursultan.class11361;
import Nursultan.class11380;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11564;
import Nursultan.class11782;
import Nursultan.class11910;
import Nursultan.class11929;
import Nursultan.class12002;
import java.lang.runtime.SwitchBootstraps;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00496;
import minecraft.class00524;
import minecraft.class02484;
import minecraft.class02710;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07050;
import minecraft.class07314;
import minecraft.class07482;
import minecraft.class08394;
import minecraft.class08562;
import org.apache.commons.lang3.StringUtils;

@class11080(L="AuctionHelper", y=class11072.MISC, N=class11106.HELPER)
public class AuctionHelper
extends class11067 {
    public static Object L_0;
    public static Object L_1;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public boolean u_init;

    public AuctionHelper() {
        this.m();
        this.u_0 = class11524.N((class11512)this, (String)"profitable-color", (int)-11104513);
        this.u_1 = class11524.N((class11512)this, (String)"profitable-items-count", (float)3.0f, (float)1.0f, (float)5.0f, (float)1.0f);
        this.u_2 = class11524.N((class11512)this, (String)"open-auction-from-item", (class12002)class12002.UNKNOWN);
        this.u_3 = class11524.N((class11512)this, (String)"show-item-price", (boolean)true);
        this.u_4 = new HashSet();
        this.u_5 = Comparator.comparingLong(class069372 -> {
            long l = this.N(class069372.i());
            int n = class069372.i().c();
            if (n == 0) {
                return Long.MAX_VALUE;
            }
            return (long)Math.round((float)l / (float)n / 10.0f) * 10L;
        });
    }

    static {
        AuctionHelper.n();
        L_0 = new Pattern[]{Pattern.compile("\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*)"), Pattern.compile("\u258d (?:\u0422\u0435\u043a\u0443\u0449\u0430\u044f \u0446\u0435\u043d\u0430|\u0426\u0435\u043d\u0430): ([\\d ]+)\u00a4")};
        L_1 = new String[]{"\u043f\u043e\u0438\u0441\u043a:", "\u0430\u0443\u043a\u0446\u0438\u043e\u043d\u044b", "\u0430\u0443\u043a\u0446\u0438\u043e\u043d", " \u043f: ", "\u6f22:"};
    }

    private static void n() {
        L_0 = null;
        L_1 = null;
    }

    private void m() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_6 = false;
        }
    }

    private void j() {
        this.m();
        if ((class05096)((class06202)this.y_0).v_3 == null) {
            return;
        }
        String string = ((class05096)((class06202)this.y_0).v_3).method_25440().getString().toLowerCase();
        if (!this.Y(string)) {
            ((Set)this.u_4).clear();
            return;
        }
        Stream<class06937> var2 = this.N((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).stream().filter(class069372 -> this.y(class069372.i()));
        this.N(var2);
    }

    private boolean y(class06584 class065842) {
        String string;
        if (class065842.N(class06570.vv) && (string = (class08562)class065842.a_(class02484.v, (Object)class08562.L)).y().size() > 5) {
            return false;
        }
        string = String.join((CharSequence)", ", class11929.E((class06584)class065842));
        Pattern[] patternArray = (Pattern[])L_0;
        int n = patternArray.length;
        for (int i = 0; i < n; ++i) {
            if (!patternArray[i].matcher(string).find()) continue;
            return true;
        }
        return false;
    }

    public void y() {
        this.m();
        this.u_6 = false;
        super.y();
    }

    @class11782
    public void N(class11361 class113612) {
        this.m();
        if (!((Boolean)((class11507)this.u_3).i()).booleanValue()) {
            return;
        }
        class06584 class065842 = class113612.y();
        if (class065842.c() <= 1) {
            return;
        }
        List var3 = class113612.N();
        for (int i = 0; i < var3.size(); ++i) {
            String string = ((class00392)var3.get(i)).getString();
            if (!string.contains(" \u0426\u0435\u043da") && !string.contains(" \u0426\u0435\u043d\u0430")) continue;
            String string2 = string.replaceAll("[^0-9]", "");
            DecimalFormat decimalFormat = new DecimalFormat("\u00a7a$ \u00a7f\u0417\u0430 \u0448\u0442\u0443\u043a\u0443 \u00a7a$###,###");
            decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
            double d = (double)Long.parseLong(string2) / (double)class065842.c();
            String string3 = decimalFormat.format(d);
            var3.add(i + 1, class00392.y((String)string3));
        }
        class113612.N(var3);
    }

    @class11782
    public void N(class11359 class113592) {
        this.m();
        this.u_6 = false;
    }

    private List<class06937> N(class07482 class074822) {
        return class074822.T.stream().limit(45L).filter(class069372 -> {
            class06584 class065842 = class069372.i();
            return class069372.R() && !class065842.R();
        }).toList();
    }

    private long N(class06584 class065842) {
        String string = String.join((CharSequence)", ", class11929.E((class06584)class065842));
        Pattern[] patternArray = (Pattern[])L_0;
        int n = patternArray.length;
        for (int i = 0; i < n; ++i) {
            Matcher matcher = patternArray[i].matcher(string);
            if (!matcher.find()) continue;
            return Long.parseLong(matcher.group(1).replaceAll("[,\\s]", ""));
        }
        return 0L;
    }

    @class11782
    public void N(class10961 class109612) {
        this.m();
        class00381 class003812 = class109612.N();
        Objects.requireNonNull(class003812);
        class00381 var3 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00496.class, class00524.class}, (Object)var3, (int)n)) {
            case 0: {
                if (((class00496)var3).N() == 0) break;
                this.u_6 = true;
                break;
            }
            case 1: {
                if (((class00524)var3).N() == 0) break;
                this.u_6 = true;
                break;
            }
        }
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.m();
        if (!((class11527)this.u_2).N((class11389)class114002)) {
            return;
        }
        for (class07050 class070502 : class07050.values()) {
            class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_5998(class070502);
            if (class065842.B() == class06570.N) continue;
            String string = class06541.N((String)class065842.d().getString()).replaceAll("[^\\p{L} \\-]", "").trim();
            string = string.replaceAll(" (?i)xxx (?i)", "").replaceAll(" (?i)xxx$", "").replaceAll("^xxx (?i)", "");
            string = StringUtils.normalizeSpace((String)string);
            class11910.N((String)("/ah search " + string));
            break;
        }
    }

    @class11782
    public void N(class11380 class113802) {
        this.m();
        if (((Boolean)this.u_6).booleanValue()) {
            this.j();
            this.u_6 = false;
        }
    }

    private void N(Stream<class06937> stream) {
        this.m();
        List list = stream.toList();
        ((Set)this.u_4).clear();
        list.stream().filter(class06937::R).sorted(Comparator.comparingLong(class069372 -> ((class02710)class069372.i().y().a_(class02484.P, (Object)class02710.N)).N().stream().anyMatch(class035562 -> class035562.N((T class059462) -> class059462 == class07314.B)) ? 1L : 0L).thenComparing((Comparator)this.u_5)).limit(((Float)((class11504)this.u_1).i()).intValue()).forEach(class069372 -> {
            this.m();
            ((Set)this.u_4).add(new class11564(class069372, 1L));
        });
    }

    @class11782
    public void N(class10951 class109512) {
        this.m();
        String string = class109512.N().toLowerCase();
        if (!this.Y(string)) {
            ((Set)this.u_4).clear();
            return;
        }
        for (class11564 class115642 : (Set)this.u_4) {
            int n = (int)(55.0 + 200.0 * Math.sin((double)System.currentTimeMillis() / 60.0) / 2.0 + 0.5);
            class06937 class069372 = class115642.y();
            class109512.y().N(class08394.NH, class069372.i, class069372.R, class069372.i + 16, class069372.R + 16, class11300.N((int)((Integer)((class11515)this.u_0).i()), (int)n));
        }
    }

    private boolean Y(String string) {
        return Arrays.stream((String[])L_1).anyMatch(string::contains);
    }
}

