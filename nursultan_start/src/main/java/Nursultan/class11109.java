/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09343
 *  Nursultan.class10992
 *  Nursultan.class11303
 *  Nursultan.class11819
 *  Nursultan.class11882
 *  Nursultan.class11910
 *  Nursultan.class11929
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class00496
 *  minecraft.class00524
 *  minecraft.class04453
 *  minecraft.class04459
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class07482
 */
package Nursultan;

import Nursultan.class09343;
import Nursultan.class10992;
import Nursultan.class11303;
import Nursultan.class11819;
import Nursultan.class11882;
import Nursultan.class11910;
import Nursultan.class11929;
import java.lang.runtime.SwitchBootstraps;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.LongStream;
import minecraft.class00392;
import minecraft.class00496;
import minecraft.class00524;
import minecraft.class04453;
import minecraft.class04459;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;

public class class11109
implements class11819 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;
    public static Object y_0;

    private void M() {
        Long l2 = (Long)((Function)this.N_3).apply(((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).T.stream().limit(45L).map(class06937::i).filter(class065842 -> ((class11882)this.N_4).test(class065842)).mapToLong(class11109::y).filter(l -> l > 0L));
        if (l2 <= 0L) {
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("$###,###");
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
        String string = decimalFormat.format(l2);
        class11303.y((Object)class00392.y((String)((class11882)this.N_4).R()).N(class06541.field_1080).i(" ").y((class00392)class00392.y((String)string).N(class06541.field_1054)));
        ((class11882)this.N_4).Z().N(String.valueOf(l2));
    }

    private void M(int n) {
        if (n == 0 || (Integer)this.N_5 > 0) {
            return;
        }
        this.N_7 = true;
        this.N_6 = Integer.MAX_VALUE;
    }

    private static void P() {
        y_0 = null;
    }

    public class11109() {
        this.m();
        this.N_0 = class06202.Nq();
    }

    static {
        class11109.y();
        class11109.P();
        y_0 = new Pattern[]{Pattern.compile("\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*)")};
    }

    private void B() {
        this.N_4 = (class11882)((Queue)this.N_2).poll();
        if ((class11882)this.N_4 != null) {
            class11910.N((String)("/ah search " + ((class11882)this.N_4).R()));
            this.N_6 = 60;
            this.N_5 = 1;
        }
    }

    private void i() {
        this.N();
    }

    private void m() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_5 = 0;
            this.N_6 = 0;
            this.N_7 = false;
        }
    }

    private void U() {
        if ((class11882)this.N_4 != null) {
            this.M();
        }
        this.N_5 = 18;
        ((class04453)((class06202)this.N_0).T_4).method_7346();
        this.N_4 = (class11882)((Queue)this.N_2).poll();
        if ((class11882)this.N_4 == null) {
            ((CompletableFuture)this.N_1).complete(null);
        }
        this.N_7 = false;
    }

    private void u() {
        if ((class11882)this.N_4 != null) {
            class11910.N((String)("/ah search " + ((class11882)this.N_4).R()));
            this.N_6 = 60;
        }
    }

    public void y(Object object) {
        if ((CompletableFuture)this.N_1 == null || ((CompletableFuture)this.N_1).isDone()) {
            return;
        }
        Object object2 = object;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class10992.class, class09343.class, class00524.class, class00496.class, class04459.class}, (Object)object2, (int)n)) {
            case 0: {
                class10992 class109922 = (class10992)object2;
                this.W();
                break;
            }
            case 1: {
                class09343 class093432 = (class09343)object2;
                this.i();
                break;
            }
            case 2: {
                class00524 class005242 = (class00524)object2;
                this.M(class005242.N());
                break;
            }
            case 3: {
                class00496 class004962 = (class00496)object2;
                this.M(class004962.N());
                break;
            }
            case 4: {
                class04459 class044592 = (class04459)object2;
                this.N(class044592);
                break;
            }
        }
    }

    private static void y() {
    }

    private static long y(class06584 class065842) {
        String string = String.join((CharSequence)", ", class11929.E((class06584)class065842));
        Pattern[] patternArray = (Pattern[])y_0;
        int n = patternArray.length;
        for (int i = 0; i < n; ++i) {
            Matcher matcher = patternArray[i].matcher(string);
            if (!matcher.find()) continue;
            return Long.parseLong(matcher.group(1).replaceAll("[,\\s]", "")) / (long)class065842.c();
        }
        return -1L;
    }

    private void N(class04459 class044592) {
        String string = class044592.N().getString().toLowerCase();
        if (string.contains("\u043d\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442")) {
            this.N_5 = 18;
            this.N_4 = (class11882)((Queue)this.N_2).poll();
        } else if (string.contains("\u043f\u043e\u0441\u043b\u0435 \u0432\u0445\u043e\u0434\u0430 \u043d\u0430 \u0440\u0435\u0436\u0438\u043c \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e") && string.contains("\u0441\u0435\u043a.")) {
            ((Queue)this.N_2).add((class11882)this.N_4);
            String string2 = string.replaceAll("\\D+", "");
            int n = 20;
            try {
                int n2 = Integer.parseInt(string2);
                n += n * (n2 + 3);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            this.N_5 = n;
        } else if (string.contains("\u043a\u043e\u043c\u0430\u043d\u0434\u0430 \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u043d\u0430 \u0432 \u0440\u0435\u0436\u0438\u043c\u0435 afk")) {
            ((Queue)this.N_2).add((class11882)this.N_4);
            this.N_5 = 60;
        }
    }

    public CompletableFuture<Void> N(Collection<class11882> collection, Function<LongStream, Long> function) {
        this.N_2 = new LinkedList<class11882>(collection);
        this.N_3 = function;
        this.N();
        this.N_1 = new CompletableFuture();
        this.N_4 = (class11882)((Queue)this.N_2).poll();
        if (((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b != 0) {
            ((class04453)((class06202)this.N_0).T_4).method_7346();
            this.N_5 = 60;
        }
        return (CompletableFuture)this.N_1;
    }

    public void N() {
        if ((CompletableFuture)this.N_1 != null && !((CompletableFuture)this.N_1).isDone()) {
            ((CompletableFuture)this.N_1).cancel(false);
        }
        this.N_7 = false;
        this.N_6 = Integer.MAX_VALUE;
        this.N_5 = 10;
        this.N_4 = null;
    }

    private void W() {
        this.N_5 = (Integer)this.N_5 - 1;
        this.N_6 = (Integer)this.N_6 - 1;
        if (((Boolean)this.N_7).booleanValue()) {
            this.U();
        }
        if ((Integer)this.N_5 == 0) {
            this.u();
        }
        if ((Integer)this.N_6 <= 0) {
            this.B();
        }
    }
}

