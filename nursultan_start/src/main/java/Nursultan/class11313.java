/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11280
 *  Nursultan.class11472
 *  Nursultan.class11519
 *  Nursultan.class11521
 *  Nursultan.class11938
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11280;
import Nursultan.class11290;
import Nursultan.class11296;
import Nursultan.class11309;
import Nursultan.class11325;
import Nursultan.class11472;
import Nursultan.class11519;
import Nursultan.class11521;
import Nursultan.class11938;
import java.util.Comparator;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11313 {
    public static Object N_0;
    public static Object N_1;

    private static void M() {
        N_0 = null;
        N_1 = "default";
    }

    private class11313() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11313.M();
        N_0 = LogManager.getLogger(String.class);
    }

    private static class11290 u() {
        byte[] byArray = class11280.N((Iterable)class11938.u().NN());
        class11290 class112902 = new class11290(class11309.N(), 0L, "default", ((class11472)class11938.L_2).Z(), System.currentTimeMillis(), 0L, 0L, class11296.LOCAL, 1, true, byArray);
        class11938.G().N(class112902);
        class11938.I().y(class112902);
        return class112902;
    }

    public static void y() {
        class11521 class115212 = (class11521)class11938.M().N(class11521.class);
        class11325 class113252 = class11938.G();
        UUID uUID = class115212.y();
        if (uUID != null && class113252.N(uUID).isPresent()) {
            return;
        }
        class11290 class112903 = class113252.L().stream().filter(class112902 -> class112902.M() != class11296.DELETING).max(Comparator.comparingLong(class11290::B)).orElse(null);
        if (class112903 == null) {
            class112903 = class11313.u();
        }
        class115212.N(class112903.u());
        class11519.y(class11521.class);
    }

    public static void N() {
        if (!class11938.B().N()) {
            return;
        }
        UUID uUID = ((class11521)class11938.M().N(class11521.class)).y();
        if (uUID == null) {
            return;
        }
        class11290 class112902 = class11938.G().N(uUID).orElse(null);
        if (class112902 == null) {
            return;
        }
        try {
            byte[] byArray = class11280.N((Iterable)class11938.u().NN());
            class112902.N(byArray);
            class112902.N(true);
            class112902.N(1);
            class112902.N(System.currentTimeMillis());
            if (class112902.M() == class11296.SYNCED) {
                class112902.N(class11296.DIRTY);
            }
            class11938.G().N(class112902);
        }
        catch (Exception exception) {
            ((Logger)N_0).error("auto-save selected preset failed", (Throwable)exception);
        }
    }
}

