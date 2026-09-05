/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09311
 *  Nursultan.class10965
 *  Nursultan.class10990
 *  Nursultan.class11385
 *  Nursultan.class11902
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00486
 *  minecraft.class00539
 *  minecraft.class00543
 *  minecraft.class04453
 *  minecraft.class04474
 *  minecraft.class05096
 *  minecraft.class05410
 *  minecraft.class05873
 *  minecraft.class06202
 *  minecraft.class08687
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09311;
import Nursultan.class10965;
import Nursultan.class10990;
import Nursultan.class11385;
import Nursultan.class11902;
import Nursultan.class12001;
import Nursultan.class12006;
import Nursultan.class12008;
import Nursultan.class12029;
import Nursultan.class12040;
import java.lang.runtime.SwitchBootstraps;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00486;
import minecraft.class00539;
import minecraft.class00543;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class05096;
import minecraft.class05410;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class08687;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class12024
extends class12001 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;
    public static Object y_0;

    private void L(class12040 class120402, class12029 class120292) {
        if (class11902.N((class08687)((class04474)((class04453)((class06202)this.u_0).T_4).L_1).field_54155)) {
            ((List)class120292.N_0).add(class120402);
            return;
        }
        class120292.N_4 = true;
        class120402.accept((class06202)this.u_0);
    }

    public void L(class12029 class120292) {
        this.M();
        if (((Boolean)this.N_1).booleanValue()) {
            return;
        }
        this.N_1 = true;
        super.B(class120292);
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
            this.N_1 = false;
            this.N_2 = false;
        }
    }

    @Override
    public boolean M(class12029 class120292) {
        this.M();
        return !((List)class120292.N_0).isEmpty() || (Boolean)this.N_2 != false;
    }

    public class12024() {
        this.M();
    }

    static {
        class12024.R();
        y_0 = LogManager.getLogger(String.class);
    }

    @Override
    public void B(class12029 class120292) {
        if (class11902.N((class08687)((class04474)((class04453)((class06202)this.u_0).T_4).L_1).field_54155)) {
            ((List)class120292.N_0).add(new class12008(() -> {
                if (!class11902.N((class08687)((class04474)((class04453)((class06202)this.u_0).T_4).L_1).field_54155)) {
                    this.L(class120292);
                }
            }));
            return;
        }
        super.B(class120292);
    }

    @Override
    public void i(class12029 class120292) {
        this.M();
        if (!(!((List)class120292.N_0).isEmpty() && ((Integer)class120292.N_3).intValue() == this.N() || ((Boolean)class120292.N_4).booleanValue() && !((Boolean)this.N_0).booleanValue())) {
            return;
        }
        try {
            Iterator iterator = ((List)class120292.N_0).iterator();
            while (iterator.hasNext()) {
                class12040 class120403 = (class12040)iterator.next();
                if (!class120403.test((class06202)this.u_0)) {
                    class120292.N_3 = this.N() + 1;
                    return;
                }
                class120403.accept((class06202)this.u_0);
                iterator.remove();
            }
            if (!((Boolean)this.N_1).booleanValue()) {
                class120292.N_4 = true;
                ((class06202)this.u_0).NE().N((class00381)new class00543(0));
            }
            this.N_1 = false;
            ((List)class120292.N_1).removeIf(class120402 -> {
                class120402.accept((class06202)this.u_0);
                return true;
            });
            ((List)class120292.N_0).clear();
            ((List)class120292.N_1).clear();
        }
        catch (Exception exception) {
            ((Logger)y_0).error(exception.getMessage(), exception.getCause());
            this.N_1 = false;
            ((List)class120292.N_0).clear();
            ((List)class120292.N_1).clear();
        }
    }

    @Override
    public void u(class12029 class120292) {
        class120292.N_3 = this.y();
    }

    @Override
    public void y(class12029 class120292) {
        if (class11902.N((class08687)((class04474)((class04453)((class06202)this.u_0).T_4).L_1).field_54155)) {
            ((List)class120292.N_0).add(new class12008(() -> this.L(class120292)));
            return;
        }
        super.B(class120292);
    }

    @Override
    public void y(class12040 class120402, class12029 class120292) {
        ((List)class120292.N_0).add(class120402);
    }

    public int y() {
        return 2;
    }

    @Override
    public void N(class09311 class093112, class12029 class120292) {
        if ((Integer)class120292.N_3 > 1) {
            class093112.y(new class08687(false, false, false, false, false, false, false));
        }
    }

    @Override
    public void N(class11385 class113852, class12029 class120292) {
        if ((Integer)class120292.N_3 > 1) {
            class11902.N((class11385)class113852);
        }
    }

    @Override
    public void N(class12006 class120062, class12029 class120292) {
        if (!class11902.N((class08687)((class04474)((class04453)((class06202)this.u_0).T_4).L_1).field_54155)) {
            class120062.accept((class06202)this.u_0);
        } else {
            ((List)class120292.N_0).add(class120062);
        }
    }

    @Override
    public void N(class10965 class109652, class12029 class120292) {
        this.M();
        class00381 class003812 = class109652.L();
        Objects.requireNonNull(class003812);
        class00381 var3 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00543.class, class00539.class}, (Object)var3, (int)n)) {
            case 0: {
                class00543 class005432 = (class00543)var3;
                if (((Boolean)class120292.N_4).booleanValue() || ((Boolean)this.N_0).booleanValue()) {
                    class120292.N_4 = false;
                    this.N_0 = false;
                    return;
                }
                if (((List)class120292.N_0).isEmpty()) {
                    if (!((class05096)((class06202)this.u_0).v_3 instanceof class05410) || !((Boolean)this.N_2).booleanValue()) {
                        class109652.N();
                    }
                    this.N_2 = false;
                    break;
                }
                if (!((class05096)((class06202)this.u_0).v_3 instanceof class05410)) break;
                class120292.L();
                this.N_2 = false;
                class109652.N();
                break;
            }
            case 1: {
                class00539 class005392 = (class00539)var3;
                if (!((class05096)((class06202)this.u_0).v_3 instanceof class05410)) break;
                class120292.y(class005392);
                this.N_2 = true;
                class109652.N();
                break;
            }
        }
    }

    @Override
    public void N(class12029 class120292) {
        class120292.N_3 = this.y();
        class120292.N();
    }

    @Override
    public void N(class12040 class120402, class12029 class120292) {
        this.L(class120402, class120292);
    }

    public int N() {
        return 1;
    }

    @Override
    public void N(class10990 class109902, class12029 class120292) {
        this.M();
        class00381 class003812 = class109902.u();
        Objects.requireNonNull(class003812);
        class00381 var4 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class05873.class, class00486.class}, (Object)var4, (int)n)) {
            case 0: {
                class05873 class058732 = (class05873)var4;
                this.N_0 = true;
                class120292.N_4 = true;
                this.N_2 = false;
                break;
            }
            case 1: {
                class00486 class004862 = (class00486)var4;
                class120292.N_4 = false;
                this.N_0 = false;
                this.N_2 = false;
                break;
            }
        }
    }

    private static void R() {
        y_0 = null;
    }

    @Override
    public void R(class12029 class120292) {
        if ((Integer)class120292.N_3 < 0) {
            return;
        }
        class120292.N_3 = (Integer)class120292.N_3 - 1;
    }
}

