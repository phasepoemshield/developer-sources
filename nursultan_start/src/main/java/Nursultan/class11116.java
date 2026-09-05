/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoBuy
 *  Nursultan.class10961
 *  Nursultan.class10992
 *  Nursultan.class11275
 *  Nursultan.class11402
 *  Nursultan.class11464
 *  Nursultan.class11535
 *  Nursultan.class11798
 *  Nursultan.class11807
 *  Nursultan.class11910
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00743
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class05873
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.AutoBuy;
import Nursultan.class10961;
import Nursultan.class10992;
import Nursultan.class11132;
import Nursultan.class11135;
import Nursultan.class11137;
import Nursultan.class11150;
import Nursultan.class11275;
import Nursultan.class11402;
import Nursultan.class11464;
import Nursultan.class11535;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11910;
import Nursultan.class11929;
import Nursultan.class11938;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.runtime.SwitchBootstraps;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class00743;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class08036;

public class class11116
extends class11807<AutoBuy> {
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public boolean L_init;

    private void P() {
        this.s();
        this.L_2 = (Integer)this.L_2 - 1;
        if ((Integer)this.L_2 == 0) {
            ((class04453)((class06202)((class11798)this).N_0).T_4).method_7346();
        } else if ((Integer)this.L_2 < -55) {
            this.N();
        }
    }

    public class11116(class11275 class112752, AutoBuy autoBuy, String string, boolean bl, Consumer<class11535> consumer) {
        super((Object)autoBuy, string, bl, consumer);
        this.s();
        this.y_1 = class11135.IDLE;
        this.L_4 = -1L;
        this.y_0 = class112752;
    }

    private void i() {
        this.s();
        if ((Integer)this.L_3 > 0) {
            this.L_3 = (Integer)this.L_3 - 1;
        }
        if ((Integer)this.L_3 == 0 && (class11135)((Object)this.y_1) == class11135.WAITING_FOR_ITEM) {
            this.y_1 = class11135.WAITING_FOR_CLOSE;
            this.L_2 = 5;
            this.L_4 = -1L;
        }
    }

    private void s() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = 0;
            this.L_2 = 0;
            this.L_3 = 0;
            this.L_4 = 0L;
            this.L_5 = 0;
            this.L_6 = false;
        }
    }

    public void y(Object object) {
        this.s();
        if (((class11275)this.y_0).L()) {
            Object object2 = object;
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11402.class, class10961.class, class10992.class}, (Object)object2, (int)n)) {
                case 0: {
                    class11402 class114022 = (class11402)object2;
                    this.N(class114022);
                    break;
                }
                case 1: {
                    class10961 class109612 = (class10961)object2;
                    this.N(class109612);
                    break;
                }
                case 2: {
                    class10992 class109922 = (class10992)object2;
                    this.N(class109922);
                    break;
                }
            }
        }
    }

    private void N(class10961 class109612) {
        class00381 var2 = class109612.N();
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class05873.class}, (Object)var2, (int)n)) {
            case 0: {
                class05873 class058732 = (class05873)var2;
                this.N(class058732);
                break;
            }
        }
    }

    public void N() {
        this.s();
        this.y_2 = null;
        this.L_0 = null;
        this.L_1 = 0;
        this.L_2 = 0;
        this.L_3 = 0;
        this.L_4 = -1L;
        this.y_1 = class11135.IDLE;
        if (((Boolean)this.L_6).booleanValue()) {
            ((class11275)this.y_0).N("resume");
        }
        this.L_6 = false;
    }

    private void N(class10992 class109922) {
        this.s();
        if ((Integer)this.L_5 >= 5) {
            ((AutoBuy)((class11798)this).N_1).m();
            ((class11275)this.y_0).N("busy");
            class11938.Z().y(class11464.u((int)11), () -> {
                this.s();
                ((class11275)this.y_0).N("resume");
            });
            this.L_5 = 0;
            return;
        }
        switch (((class11135)((Object)this.y_1)).ordinal()) {
            case 1: {
                this.i();
                break;
            }
            case 2: {
                this.W();
                break;
            }
            case 3: {
                this.P();
                break;
            }
        }
    }

    private boolean N(Matcher matcher, class06584 class065842, class07482 class074822, class06937 class069372) {
        this.s();
        String string = matcher.group(2);
        long l = Long.parseLong(matcher.group(1).replaceAll(",", ""));
        if (!((class11132)((Object)this.y_2)).N().equals(string) || ((class11132)((Object)this.y_2)).y() != AutoBuy.N((class06584)class065842, (long)l)) {
            return false;
        }
        this.L_0 = new class11137(class074822.b, class069372.u);
        this.L_1 = 25;
        this.L_3 = 0;
        return true;
    }

    private void N(class11402 class114022) {
        long l;
        this.s();
        if ((class11135)((Object)this.y_1) != class11135.IDLE || (class11132)((Object)this.y_2) != null) {
            return;
        }
        JsonElement jsonElement = JsonParser.parseString((String)class114022.N());
        if (!jsonElement.isJsonObject()) {
            return;
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        int n = jsonObject.get("hash").getAsInt();
        long l2 = jsonObject.get("price").getAsInt();
        if (l2 > (l = class11910.y().orElse(0L).longValue())) {
            return;
        }
        this.y_2 = new class11132(jsonObject.get("seller").getAsString(), n);
        this.y_1 = class11135.WAITING_FOR_ITEM;
        this.L_3 = 40;
        class11910.N((String)("/ah " + ((class11132)((Object)this.y_2)).N()));
        if (!((Boolean)this.L_6).booleanValue()) {
            ((class11275)this.y_0).N("busy");
            this.L_6 = true;
        }
        if ((Long)this.L_4 == -1L) {
            this.L_4 = System.currentTimeMillis();
        }
    }

    private void N(class05873 class058732) {
        this.s();
        if ((Long)this.L_4 != -1L) {
            if (System.currentTimeMillis() - (Long)this.L_4 > 300L) {
                this.L_5 = (Integer)this.L_5 + 1;
            }
            this.L_4 = -1L;
        }
        this.L_3 = 0;
        if (class058732.L().getString().toLowerCase().contains("\u043f\u043e\u0434\u043e\u0437\u0440\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0446\u0435\u043d\u0430")) {
            this.y_1 = class11135.WAITING_FOR_CLICK;
            this.L_1 = 5;
            this.L_0 = new class11137(class058732.N(), 0);
            return;
        }
        if ((class11135)((Object)this.y_1) == class11135.WAITING_FOR_CLOSE) {
            class11938.Z().N(() -> ((class04453)((class04453)((class06202)((class11798)this).N_0).T_4)).method_7346());
            this.L_2 = 5;
            return;
        }
        if ((class11132)((Object)this.y_2) != null) {
            this.y_1 = class11135.WAITING_FOR_CLICK;
        }
    }

    private void W() {
        this.s();
        if ((class11137)((Object)this.L_0) == null) {
            class06937 class069372;
            class06584 class065842;
            Matcher matcher;
            class07482 class074822 = (class07482)((class04453)((class06202)((class11798)this).N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
            class00743 var2 = class074822.T;
            for (int i = 0; !(i > 45 || (matcher = ((Pattern)class11150.y_1).matcher(String.join((CharSequence)", ", class11929.E((class06584)(class065842 = (class069372 = (class06937)var2.get(i)).i()))))).find() && this.N(matcher, class065842, class074822, class069372)); ++i) {
            }
        }
        if ((class11137)((Object)this.L_0) == null) {
            this.L_2 = 5;
            this.y_1 = class11135.WAITING_FOR_CLOSE;
            return;
        }
        if ((Integer)this.L_1 > 0) {
            this.L_1 = (Integer)this.L_1 - 1;
            return;
        }
        ((class03443)((class06202)((class11798)this).N_0).T_2).N(((class11137)((Object)this.L_0)).y(), ((class11137)((Object)this.L_0)).N(), 0, class07510.field_7794, (class08036)((class04453)((class06202)((class11798)this).N_0).T_4));
        this.L_2 = 5;
        this.y_1 = class11135.WAITING_FOR_CLOSE;
    }
}

