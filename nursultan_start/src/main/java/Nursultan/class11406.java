/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09326
 *  minecraft.class04891
 */
package Nursultan;

import Nursultan.class09326;
import Nursultan.class11535;
import java.util.function.Predicate;
import minecraft.class04891;

public class class11406
extends class11535
implements Predicate<class09326> {
    public Object N_0;

    private void L() {
    }

    public class11406(String string, boolean bl, class04891 ... class04891Array) {
        super(string, bl);
        this.L();
        this.N_0 = class04891Array;
    }

    @Override
    public boolean test(class09326 class093262) {
        this.L();
        for (class04891 class048912 : (class04891[])this.N_0) {
            if (class093262.Z() != class048912) continue;
            return true;
        }
        return false;
    }
}

