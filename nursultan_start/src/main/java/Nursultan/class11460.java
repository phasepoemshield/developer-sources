/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class11289
 *  Nursultan.class11364
 *  Nursultan.class11938
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11289;
import Nursultan.class11364;
import Nursultan.class11473;
import Nursultan.class11477;
import Nursultan.class11481;
import Nursultan.class11483;
import Nursultan.class11938;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class06889;

public class class11460 {
    public Object N_0;
    public Object N_1;

    public void L() {
        if (((class11289)this.N_0).isEmpty()) {
            return;
        }
        ((class11289)this.N_0).forEach(class11481::P);
        ((class11289)this.N_0).clear();
        class11938.L().L((Object)class11364.N((class09378)class09378.WAYPOINTS));
    }

    private void M() {
    }

    public class11460() {
        this.M();
        this.N_0 = new class11289();
        this.N_1 = new class11477(this);
    }

    public Stream<String> y() {
        return ((class11289)this.N_0).stream().map(class11481::m);
    }

    private void y(class11481 class114813) {
        class11483 class114832;
        if (!(class114813 instanceof class11483) || !(class114832 = (class11483)class114813).R()) {
            return;
        }
        ((class11289)this.N_0).removeIf(class114812 -> {
            class11483 class114833;
            if (class114812 instanceof class11483 && (class114833 = (class11483)class114812).R() && class114833.y() == class114832.y()) {
                class114812.P();
                return true;
            }
            return false;
        });
    }

    public void N(String string, class06889 class068892, String string2) {
        this.N(new class11481(string, class068892, string2));
    }

    public boolean N(String string) {
        boolean bl = ((class11289)this.N_0).removeIf(class114812 -> {
            if (class114812.m().equals(string)) {
                class114812.N(true);
                return true;
            }
            return false;
        });
        if (bl) {
            class11938.L().L((Object)class11364.N((class09378)class09378.WAYPOINTS));
        }
        return bl;
    }

    public class11289 N() {
        class11289 class112892 = new class11289();
        class112892.addAll((Collection)((class11289)this.N_0));
        return class112892;
    }

    public void N(class11481 class114812) {
        this.y(class114812);
        ((class11473)((Map)this.N_1).get(class114812.N())).N(class114812);
        if (((class11289)this.N_0).add((Object)class114812)) {
            class11938.L().L((Object)class11364.N((class09378)class09378.WAYPOINTS));
        }
    }
}

