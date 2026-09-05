/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09250
 *  Nursultan.class09303
 *  Nursultan.class11491
 *  Nursultan.class11519
 *  Nursultan.class11938
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09250;
import Nursultan.class09303;
import Nursultan.class11491;
import Nursultan.class11519;
import Nursultan.class11938;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;

public class class11054 {
    private static String[] u;
    public static Object N_0;
    public static Object N_1;

    private class11054() {
        throw new UnsupportedOperationException(u[0]);
    }

    static {
        class11054.B();
        class11054.i();
        N_0 = new AtomicReference();
    }

    private static void B() {
        u = new String[1];
        class11054.u[0] = "This is a utility class and cannot be instantiated";
    }

    private static void i() {
        N_1 = false;
    }

    private static void u() {
        N_1 = false;
        UUID uUID = ((AtomicReference)N_0).getAndSet(null);
        if (uUID == null) {
            return;
        }
        class11938.s().L(uUID).ifPresent(class092502 -> {
            ((class11491)class11938.M().N(class11491.class)).N(class092502.R());
            class11519.y(class11491.class);
            class09303.N((class09250)class092502);
        });
    }

    public static boolean y(UUID uUID) {
        return uUID != null && uUID.equals(((AtomicReference)N_0).get());
    }

    public static void y() {
        ((AtomicReference)N_0).set(null);
    }

    public static void N(UUID uUID) {
        ((AtomicReference)N_0).compareAndSet(uUID, null);
    }

    private static boolean N(class06202 class062022) {
        return class062022 != null && (class03448)class062022.T_3 == null && (class04453)class062022.T_4 == null && class062022.NE() == null;
    }

    public static void N(class09250 class092502) {
        ((AtomicReference)N_0).set(class092502.R());
        if (!((Boolean)N_1).booleanValue()) {
            N_1 = true;
            class11938.Z().N(class11054::N, class11054::u);
        }
    }

    public static UUID N() {
        return (UUID)((AtomicReference)N_0).get();
    }
}

