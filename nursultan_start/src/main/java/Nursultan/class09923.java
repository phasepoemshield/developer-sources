/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 */
package Nursultan;

import Nursultan.class09899;
import Nursultan.class09903;
import Nursultan.class09909;
import Nursultan.class09911;
import Nursultan.class09919;
import Nursultan.class09922;
import Nursultan.class09934;
import Nursultan.class09935;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;

public final class class09923 {
    private class09923() {
    }

    public static void N(List<class09935> list, class09911 class099112) {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            class09923.N(list.get(i), class099112);
        }
    }

    private static void N(class09935 class099352, class09911 class099112) {
        class09935 class099353 = class099352;
        Objects.requireNonNull(class099353);
        class09935 class099354 = class099353;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class09909.class, class09919.class, class09903.class, class09934.class, class09922.class, class09899.class}, (Object)class099354, (int)n)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                class09909 class099092 = (class09909)class099354;
                class099112.N(class099092.N());
                break;
            }
            case 1: {
                class09919 class099192 = (class09919)class099354;
                class099112.N(class099192.N(), class099192.y(), class099192.L(), class099192.u(), class099192.i(), class099192.R());
                class09923.N(class099192.M(), class099112);
                class099112.R();
                break;
            }
            case 2: {
                class09903 class099032 = (class09903)class099354;
                class099112.N(class099032.N(), class099032.y(), class099032.L(), class099032.u());
                class09923.N(class099032.i(), class099112);
                class099112.M();
                break;
            }
            case 3: {
                class09934 class099342 = (class09934)class099354;
                class099112.N(class099342.N());
                class09923.N(class099342.y(), class099112);
                class099112.u();
                break;
            }
            case 4: {
                class09922 class099222 = (class09922)class099354;
                if (!class099112.N(class099222.N(), class099222.y())) break;
                class09923.N(class099222.L(), class099112);
                class099112.N(class099222.y());
                break;
            }
            case 5: {
                class09899 class098992 = (class09899)class099354;
                class099112.N(class098992.N());
                class09923.N(class098992.y(), class099112);
                class099112.i();
            }
        }
    }
}

