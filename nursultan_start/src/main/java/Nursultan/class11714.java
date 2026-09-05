/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.NoInteract
 *  Nursultan.class11393
 *  Nursultan.class11807
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class03448
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.NoInteract;
import Nursultan.class11393;
import Nursultan.class11798;
import Nursultan.class11807;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class06202;

public class class11714
extends class11807<NoInteract> {
    public Object y_0;

    public class11714(NoInteract noInteract, String string, boolean bl, class00891 ... class00891Array) {
        super((Object)noInteract, string, bl);
        this.u();
        this.y_0 = class008912 -> {
            for (class00891 class008913 : class00891Array) {
                if (class008912 != class008913) continue;
                return true;
            }
            return false;
        };
    }

    public class11714(NoInteract noInteract, String string, boolean bl, Predicate<class00891> predicate) {
        super((Object)noInteract, string, bl);
        this.u();
        this.y_0 = predicate;
    }

    static {
        class11714.N();
    }

    private void u() {
    }

    public void y(Object object) {
        class11393 class113932;
        class00500 class005002;
        this.u();
        if (object instanceof class11393 && ((Predicate)this.y_0).test((class005002 = ((class03448)((class06202)((class11798)((Object)this)).N_0).T_3).method_8320((class113932 = (class11393)object).L().u())).i())) {
            class113932.N();
        }
    }

    private static void N() {
    }
}

