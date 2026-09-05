/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11322
 *  Nursultan.class11478
 *  Nursultan.class11494
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11525
 *  Nursultan.class11782
 *  Nursultan.class11896
 *  Nursultan.class11907
 *  Nursultan.class11933
 *  Nursultan.class11938
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00496
 *  minecraft.class00524
 *  minecraft.class01488
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class05410
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07050
 *  minecraft.class07482
 *  minecraft.class07510
 *  org.apache.commons.lang3.RandomUtils
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11478;
import Nursultan.class11494;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11525;
import Nursultan.class11782;
import Nursultan.class11896;
import Nursultan.class11907;
import Nursultan.class11933;
import Nursultan.class11938;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00496;
import minecraft.class00524;
import minecraft.class01488;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05410;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07050;
import minecraft.class07482;
import minecraft.class07510;
import org.apache.commons.lang3.RandomUtils;

@class11080(L="AutoArmor", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoArmor
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;

    private boolean P() {
        return ((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b == 0 && !((class05096)((class06202)this.y_0).v_3 instanceof class01488);
    }

    public AutoArmor() {
        this.m();
        this.L_0 = class11524.N((class11512)this, (String)"delay-in-ticks", (class11494)new class11494(0.0f, 10.0f), (class11494)new class11494(2.0f, 5.0f), (float)1.0f);
        this.L_1 = class11524.N((class11512)this, (String)"swap-only-while-standing", (boolean)false);
        this.L_2 = class11524.N((class11512)this, (String)"swap-only-while-inventory-open", (boolean)false);
        this.L_3 = new class11478();
    }

    private void m() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_4 = false;
            this.L_5 = 0;
        }
    }

    private void v() {
        this.m();
        this.L_5 = RandomUtils.insecure().randomInt((int)((class11494)((class11525)this.L_0).i()).N(), (int)((class11494)((class11525)this.L_0).i()).L());
    }

    private void N(class00524 class005242) {
        this.m();
        if (class005242.N() != 0) {
            return;
        }
        if (class005242.L().stream().anyMatch(class065842 -> !class065842.R())) {
            this.L_4 = true;
        }
    }

    private void N(int n, class11933 class119332) {
        if (class11281.u((int)n)) {
            class11322.N((int)n);
            class11907.N((class07050)class07050.field_5808);
            class11322.i();
            return;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_6118(class119332.y()).R()) {
            class11938.m().N(0, n, 0, class07510.field_7794).y();
            return;
        }
        int n2 = ((class04453)((class06202)this.y_0).T_4).method_31548().N() % 8 + 1;
        class11938.m().N(0, n, n2, class07510.field_7791).N(0, class119332.N(), n2, class07510.field_7791).N(0, n, n2, class07510.field_7791).y();
    }

    @class11782
    public void N(class10992 class109922) {
        this.m();
        if (((class04453)((class06202)this.y_0).T_4).field_6012 % 20 == 0) {
            this.L_4 = true;
        }
        if (!((Boolean)this.L_4).booleanValue() || !this.P()) {
            return;
        }
        if (class11938.m().u()) {
            return;
        }
        if (!((class05096)((class06202)this.y_0).v_3 instanceof class05410) && ((Boolean)((class11507)this.L_2).i()).booleanValue()) {
            return;
        }
        if (((class04453)((class06202)this.y_0).T_4).k() && ((Boolean)((class11507)this.L_1).i()).booleanValue()) {
            return;
        }
        ArrayList<class11933> arrayList = new ArrayList<class11933>(List.of(class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_1, class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_3, class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_4));
        if (!class11281.y((class06581)class06570.sT)) {
            arrayList.add(class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_2);
        }
        if (arrayList.stream().allMatch(class119332 -> class11896.N((class11933)class119332).isEmpty())) {
            this.L_4 = false;
            return;
        }
        for (class11933 class119333 : arrayList) {
            if (!((class11478)this.L_3).N(((Integer)this.L_5).intValue())) continue;
            class11896.N((class11933)class119333).ifPresent(class112972 -> {
                this.m();
                this.N(class112972.y(), class119333);
                this.v();
                ((class11478)this.L_3).y();
            });
        }
    }

    @class11782
    private void N(class10990 class109902) {
        this.m();
        class00381 class003812 = class109902.u();
        Objects.requireNonNull(class003812);
        class00381 var2 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00524.class, class00496.class}, (Object)var2, (int)n)) {
            case 0: {
                class00524 class005242 = (class00524)var2;
                this.N(class005242);
                break;
            }
            case 1: {
                class00496 class004962 = (class00496)var2;
                this.L_4 = true;
                break;
            }
        }
    }
}

