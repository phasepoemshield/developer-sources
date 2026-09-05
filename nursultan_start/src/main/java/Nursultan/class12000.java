/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00543
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class12024;
import Nursultan.class12029;
import Nursultan.class12040;
import java.util.Iterator;
import java.util.List;
import minecraft.class00381;
import minecraft.class00543;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class12000
extends class12024 {
    public static Object L_0;

    public int L() {
        return this.N() - 2;
    }

    static {
        class12000.i();
        L_0 = LogManager.getLogger(String.class);
    }

    private void Z(class12029 class120292) {
        if (!((Boolean)this.N_1).booleanValue()) {
            class120292.N_4 = true;
            ((class06202)this.u_0).NE().N((class00381)new class00543(0));
        }
        this.N_1 = false;
    }

    private static void i() {
        L_0 = null;
    }

    @Override
    public void i(class12029 class120292) {
        if (((Integer)class120292.N_3).intValue() == this.N()) {
            this.U(class120292);
            return;
        }
        if (((Integer)class120292.N_3).intValue() == this.u()) {
            this.Z(class120292);
            return;
        }
        if (((Integer)class120292.N_3).intValue() == this.L()) {
            this.z(class120292);
            return;
        }
        if (!((Boolean)class120292.N_4).booleanValue() || ((Boolean)this.N_0).booleanValue()) {
            return;
        }
        this.U(class120292);
        this.Z(class120292);
        this.z(class120292);
    }

    private void U(class12029 class120292) {
        try {
            Iterator iterator = ((List)class120292.N_0).iterator();
            while (iterator.hasNext()) {
                class12040 class120402 = (class12040)iterator.next();
                if (!class120402.test((class06202)this.u_0)) {
                    class120292.N_3 = this.N() + 1;
                    return;
                }
                class120402.accept((class06202)this.u_0);
                iterator.remove();
            }
        }
        catch (Exception exception) {
            ((Logger)L_0).error(exception.getMessage(), exception.getCause());
            this.N_1 = false;
            ((List)class120292.N_0).clear();
            ((List)class120292.N_1).clear();
        }
    }

    private void z(class12029 class120292) {
        ((List)class120292.N_1).removeIf(class120402 -> {
            class120402.accept((class06202)this.u_0);
            return true;
        });
        ((List)class120292.N_0).clear();
        ((List)class120292.N_1).clear();
    }

    public int u() {
        return this.N() - 1;
    }

    @Override
    public int y() {
        return this.N() + 1;
    }

    @Override
    public int N() {
        return 3;
    }
}

