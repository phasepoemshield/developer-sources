/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.NoInteract
 *  Nursultan.class11357
 *  Nursultan.class11807
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.NoInteract;
import Nursultan.class11357;
import Nursultan.class11807;
import java.util.function.Predicate;
import minecraft.class07049;

public class class11015
extends class11807<NoInteract> {
    public Object y_0;

    public class11015(NoInteract noInteract, String string, boolean bl, Predicate<class07049> predicate) {
        super((Object)noInteract, string, bl);
        this.u();
        this.y_0 = predicate;
    }

    private void u() {
    }

    public void y(Object object) {
        class11357 class113572;
        this.u();
        if (object instanceof class11357 && ((Predicate)this.y_0).test((class113572 = (class11357)object).L())) {
            class113572.N();
        }
    }
}

