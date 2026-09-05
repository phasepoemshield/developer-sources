/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09120
 *  Nursultan.class09250
 *  Nursultan.class09303
 *  Nursultan.class10885
 *  Nursultan.class11001
 *  Nursultan.class11108
 *  Nursultan.class11166
 *  Nursultan.class11222
 *  Nursultan.class11491
 *  Nursultan.class11519
 *  Nursultan.class11540
 *  Nursultan.class11593
 *  Nursultan.class11776
 *  Nursultan.class11829
 *  Nursultan.class11938
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09120;
import Nursultan.class09250;
import Nursultan.class09303;
import Nursultan.class10885;
import Nursultan.class11001;
import Nursultan.class11108;
import Nursultan.class11166;
import Nursultan.class11222;
import Nursultan.class11491;
import Nursultan.class11519;
import Nursultan.class11540;
import Nursultan.class11593;
import Nursultan.class11776;
import Nursultan.class11829;
import Nursultan.class11938;
import java.net.URI;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class06202;
import minecraft.class07536;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11404 {
    private static String[] i;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;

    public static void L() {
        if (((Boolean)N_3).booleanValue()) {
            return;
        }
        N_3 = true;
        ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_1, i[0], null));
        Thread thread = new Thread(class11404::M, i[1]);
        thread.setDaemon(true);
        thread.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void M() {
        try (class11222 class112222 = new class11222();){
            class112222.u();
            class06202 class062022 = class06202.Nq();
            String string = class112222.N();
            class062022.execute(() -> class07536.m().N(URI.create(string)));
            ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_2, i[2], null));
            String string2 = (String)class112222.L().get(5L, TimeUnit.MINUTES);
            ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_3, i[3], null));
            class11540 class115402 = class11108.N((class10885)class11108.N((String)string2, (String)class112222.y()));
            byte[] byArray = class09120.N((String)class115402.u());
            class09250 class092502 = new class09250((class11776)new class11166(true, class115402.N(), class115402.i(), byArray), false, System.currentTimeMillis());
            class062022.execute(() -> {
                class11938.s().L(class092502);
                ((class11491)class11938.M().N(class11491.class)).N(class092502.R());
                class11519.y(class11491.class);
                class09303.N((String)class115402.i(), (UUID)class115402.N(), (String)class115402.y(), (String)class115402.L());
            });
            ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_4, null, class115402.i()));
        }
        catch (Throwable throwable) {
            String string;
            Throwable throwable2 = class11404.N(throwable);
            ((Logger)N_0).error(i[4], throwable2);
            if (throwable2 instanceof class11001) {
                class11001 class110012 = (class11001)throwable2;
                string = class110012.N();
            } else {
                string = i[5];
            }
            String string3 = string;
            ((AtomicReference)N_2).set(new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_5, string3, null));
        }
        finally {
            N_3 = false;
        }
    }

    private class11404() {
        throw new UnsupportedOperationException(i[6]);
    }

    static {
        class11404.u();
        class11404.Z();
        N_0 = LogManager.getLogger(String.class);
        N_1 = new class11593(class11829.staticFields_0242e1118e2fe3fc28eb8f4c8015ed8ab_0, null, null);
        N_2 = new AtomicReference<Object>(N_1);
    }

    private static void Z() {
        N_3 = false;
    }

    private static void u() {
        i = new String[7];
        class11404.i[0] = "account.modal.microsoft.requesting";
        class11404.i[1] = "Nursultan-MS-Login";
        class11404.i[2] = "account.modal.microsoft.waiting";
        class11404.i[3] = "account.modal.microsoft.processing";
        class11404.i[4] = "Microsoft login failed";
        class11404.i[5] = "account.modal.microsoft.error.timeout";
        class11404.i[6] = "This is a utility class and cannot be instantiated";
    }

    public static void y() {
        ((AtomicReference)N_2).set((class11593)N_1);
    }

    public static class11593 N() {
        return (class11593)((AtomicReference)N_2).get();
    }

    private static Throwable N(Throwable throwable) {
        Throwable throwable2 = throwable.getCause();
        return throwable2 != null && throwable instanceof ExecutionException ? throwable2 : throwable;
    }
}

