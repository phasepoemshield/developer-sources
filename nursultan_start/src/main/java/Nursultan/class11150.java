/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AuctionHelper
 *  Nursultan.AutoBuy
 *  Nursultan.class10961
 *  Nursultan.class10963
 *  Nursultan.class10992
 *  Nursultan.class11278
 *  Nursultan.class11331
 *  Nursultan.class11363
 *  Nursultan.class11464
 *  Nursultan.class11535
 *  Nursultan.class11798
 *  Nursultan.class11807
 *  Nursultan.class11910
 *  Nursultan.class11929
 *  com.google.gson.JsonObject
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00496
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class05873
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.AuctionHelper;
import Nursultan.AutoBuy;
import Nursultan.class10961;
import Nursultan.class10963;
import Nursultan.class10992;
import Nursultan.class11114;
import Nursultan.class11278;
import Nursultan.class11331;
import Nursultan.class11363;
import Nursultan.class11464;
import Nursultan.class11535;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11910;
import Nursultan.class11929;
import com.google.gson.JsonObject;
import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class00496;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class08036;

public class class11150
extends class11807<AutoBuy> {
    public static Object y_0;
    public static Object y_1;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public boolean u_init;

    private void L() {
        this.s();
        if ((String)this.u_2 != null) {
            class11910.N((String)("/" + (String)this.u_2));
        } else {
            class11910.N((String)"/ah");
        }
    }

    private boolean T() {
        this.s();
        if ((Integer)this.u_3 <= 0) {
            return false;
        }
        this.u_3 = (Integer)this.u_3 - 1;
        if ((Integer)this.u_3 == 0) {
            this.L();
        }
        return true;
    }

    public class11150(class11331 class113312, AutoBuy autoBuy, String string, boolean bl, Consumer<class11535> consumer) {
        super((Object)autoBuy, string, bl, consumer);
        this.s();
        this.u_0 = new class11278();
        this.L_1 = -1L;
        this.u_1 = class113312;
    }

    static {
        class11150.i();
        class11150.R();
        y_1 = Pattern.compile("\\$\\s*.*?(\\d{1,3}(?:,\\d{3})*).*?\\?\\s*.*?:\\s*([A-Za-z0-9_]{3,16})");
    }

    private void B() {
        this.s();
        if (!((Boolean)this.L_4).booleanValue() || (Integer)this.L_3 <= 0) {
            return;
        }
        this.L_4 = false;
        this.L_5 = true;
        this.L_3 = 0;
    }

    private boolean Z(String string) {
        return Arrays.stream((String[])AuctionHelper.L_1).noneMatch(string::contains);
    }

    private static void i() {
    }

    private void s() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_3 = 0;
        }
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = 0L;
            this.L_2 = 0L;
            this.L_3 = 0;
            this.L_4 = false;
            this.L_5 = false;
            this.L_6 = false;
        }
    }

    private void m() {
        this.s();
        this.L_5 = false;
        this.L_4 = false;
        this.L_3 = 0;
    }

    public void y(Object object) {
        this.s();
        if (((class11331)this.u_1).N().get()) {
            Object object2 = object;
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class10961.class, class10992.class, class10963.class, class11363.class}, (Object)object2, (int)n)) {
                case 0: {
                    class10961 class109612 = (class10961)object2;
                    this.N(class109612);
                    break;
                }
                case 1: {
                    class10992 class109922 = (class10992)object2;
                    this.N(class109922);
                    break;
                }
                case 2: {
                    class10963 class109632 = (class10963)object2;
                    this.N(class109632);
                    break;
                }
                case 3: {
                    class11363 class113632 = (class11363)object2;
                    this.N(class113632);
                    break;
                }
            }
        }
    }

    private void y(class06584 class065842, String string, long l) {
        this.s();
        if (((Boolean)this.L_5).booleanValue()) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("seller", string);
        jsonObject.addProperty("price", (Number)l);
        jsonObject.addProperty("hash", (Number)AutoBuy.N((class06584)class065842, (long)l));
        ((class11331)this.u_1).N(jsonObject.toString());
        this.L_3 = 5;
        this.L_4 = true;
        this.L_1 = -1L;
    }

    private void N(class11363 class113632) {
        String string = class113632.N();
        if (string == null || string.isEmpty()) {
            return;
        }
        switch (string) {
            case "busy": {
                this.B();
                break;
            }
            case "resume": {
                this.m();
                break;
            }
        }
    }

    private void N(class10961 class109612) {
        class00381 var2 = class109612.N();
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00496.class, class05873.class}, (Object)var2, (int)n)) {
            case 0: {
                class00496 class004962 = (class00496)var2;
                this.N(class004962);
                break;
            }
            case 1: {
                class05873 class058732 = (class05873)var2;
                this.N(class058732);
                break;
            }
        }
    }

    private void N(class10963 class109632) {
        this.s();
        if (class109632.N().startsWith("ah")) {
            this.u_2 = class109632.N();
        }
    }

    private void N(class05873 class058732) {
        String string = class058732.L().getString().toLowerCase();
        ((class06202)((class11798)this).N_0).execute(() -> {
            this.s();
            if (this.Z(string)) {
                return;
            }
            if ((Long)this.L_1 != -1L) {
                if (System.currentTimeMillis() - (Long)this.L_1 > 400L) {
                    this.L_0 = (Integer)this.L_0 + 1;
                }
                this.L_1 = -1L;
            }
        });
    }

    public void N() {
        this.s();
        this.L_5 = false;
    }

    private void N(class10992 class109922) {
        this.s();
        if (((Boolean)this.L_6).booleanValue()) {
            ((class07482)((class04453)((class06202)((class11798)this).N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).T.stream().limit(45L).map(class06937::i).filter(class065842 -> !class065842.R()).map(class065842 -> {
                Optional<Object> optional;
                this.s();
                Matcher matcher = ((Pattern)y_1).matcher(String.join((CharSequence)", ", class11929.E((class06584)class065842)));
                Optional<Object> optional2 = optional = matcher.find() ? Optional.of(matcher) : Optional.empty();
                if (optional.isPresent()) {
                    long l;
                    Matcher matcher2 = (Matcher)optional.get();
                    String string = matcher2.group(2);
                    if (this.N((class06584)class065842, string, l = Long.parseLong(matcher2.group(1).replaceAll(",", "")))) {
                        return new class11114((class06584)class065842, string, l);
                    }
                    if (((class11278)this.u_0).N(class065842, string, l).isPresent()) {
                        return new class11114((class06584)class065842, string, l);
                    }
                }
                return null;
            }).filter(Objects::nonNull).min(Comparator.comparingLong(class11114::N)).ifPresent(class111142 -> this.y(class111142.y(), class111142.L(), class111142.N()));
            this.L_6 = false;
        }
        if ((Integer)this.L_3 > 0) {
            this.L_3 = (Integer)this.L_3 - 1;
            if ((Integer)this.L_3 == 0 && ((Boolean)this.L_4).booleanValue()) {
                this.L_4 = false;
            }
        }
        if (((Boolean)this.L_5).booleanValue()) {
            return;
        }
        if (this.T()) {
            return;
        }
        if ((Integer)this.L_0 >= 5) {
            ((AutoBuy)((class11798)this).N_1).m();
            this.u_3 = class11464.u((int)11);
            this.L_0 = 0;
            return;
        }
        if ((Integer)this.L_3 > 0 || ((class11331)this.u_1).y()) {
            return;
        }
        class05096 class050962 = (class05096)((class06202)((class11798)this).N_0).v_3;
        class07482 class074822 = (class07482)((class04453)((class06202)((class11798)this).N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
        if (class050962 == null || class074822 == null) {
            return;
        }
        String string = class050962.method_25440().getString().toLowerCase();
        if (this.Z(string)) {
            return;
        }
        if (System.currentTimeMillis() - (Long)this.L_2 <= 500L) {
            return;
        }
        this.R(class074822.b);
        this.L_2 = System.currentTimeMillis();
        if ((Long)this.L_1 == -1L) {
            this.L_1 = (long)((Long)this.L_2);
        }
    }

    private boolean N(class06584 class065842, String string, long l) {
        this.s();
        if (class11929.y((class06584)class065842)) {
            for (class06584 class065843 : class11929.i((class06584)class065842)) {
                if (!((class11278)this.u_0).N(class065843, string, l).isPresent()) continue;
                return true;
            }
        }
        return false;
    }

    private void N(class00496 class004962) {
        this.s();
        if (((Boolean)this.L_5).booleanValue()) {
            return;
        }
        if ((Integer)this.L_3 > 0 || ((class11331)this.u_1).y()) {
            return;
        }
        this.L_6 = true;
    }

    private void R(int n) {
        ((class03443)((class06202)((class11798)this).N_0).T_2).N(n, 49, 0, class07510.field_7790, (class08036)((class04453)((class06202)((class11798)this).N_0).T_4));
    }

    private static void R() {
        y_0 = 49;
        y_1 = null;
    }
}

