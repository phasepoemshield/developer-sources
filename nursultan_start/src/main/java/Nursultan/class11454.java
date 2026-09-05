/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09268
 *  Nursultan.class09288
 *  Nursultan.class09302
 *  Nursultan.class11287
 *  Nursultan.class11303
 *  Nursultan.class11311
 *  Nursultan.class11405
 *  Nursultan.class11847
 *  Nursultan.class11938
 *  Nursultan.class11959
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09268;
import Nursultan.class09288;
import Nursultan.class09302;
import Nursultan.class11287;
import Nursultan.class11303;
import Nursultan.class11311;
import Nursultan.class11405;
import Nursultan.class11408;
import Nursultan.class11410;
import Nursultan.class11847;
import Nursultan.class11938;
import Nursultan.class11959;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11454
extends Record
implements class09268 {
    public class11410 connection;
    public class11405 client;
    public static Object N_0;

    public class11405 L() {
        return this.client;
    }

    public class11454(class11405 class114052, class11410 class114102) {
        this.client = class114052;
        this.connection = class114102;
    }

    static {
        class11454.i();
        N_0 = LogManager.getLogger(String.class);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11454.class, "client;connection", "client", "connection"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11454.class, "client;connection", "client", "connection"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11454.class, "client;connection", "client", "connection"}, this);
    }

    private static void i() {
        N_0 = null;
    }

    public class11410 y() {
        return this.connection;
    }

    public void N(class09288 class092882) {
        this.connection.N(class11959.PLAY);
        this.connection.N(new class11408(this.client, this.connection));
        this.connection.N(class11847.N());
        class11938.I().N();
        class11938.J().y();
        class11938.d().N();
        class11938.T().N();
    }

    public boolean N() {
        return this.connection.N();
    }

    public void N(class09302 class093022) {
        ((Logger)N_0).error(class093022.N());
        class11303.N((class11287)((class11287)class11311.N_0), (Object)class093022.N());
        class06202.Nq().execute(() -> class11938.N().L());
        this.connection.u();
        class11938.z().m();
    }
}

