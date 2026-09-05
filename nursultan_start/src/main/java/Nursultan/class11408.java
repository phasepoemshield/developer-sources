/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09255
 *  Nursultan.class09256
 *  Nursultan.class09257
 *  Nursultan.class09263
 *  Nursultan.class09266
 *  Nursultan.class09270
 *  Nursultan.class09271
 *  Nursultan.class09273
 *  Nursultan.class09274
 *  Nursultan.class09278
 *  Nursultan.class09280
 *  Nursultan.class09283
 *  Nursultan.class09285
 *  Nursultan.class09286
 *  Nursultan.class09289
 *  Nursultan.class09290
 *  Nursultan.class09296
 *  Nursultan.class09298
 *  Nursultan.class09299
 *  Nursultan.class09345
 *  Nursultan.class11287
 *  Nursultan.class11303
 *  Nursultan.class11311
 *  Nursultan.class11351
 *  Nursultan.class11405
 *  Nursultan.class11843
 *  Nursultan.class11886
 *  Nursultan.class11901
 *  Nursultan.class11910
 *  Nursultan.class11922
 *  Nursultan.class11938
 *  Nursultan.class11940
 *  Nursultan.class11978
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class06202
 *  minecraft.class06889
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09255;
import Nursultan.class09256;
import Nursultan.class09257;
import Nursultan.class09263;
import Nursultan.class09266;
import Nursultan.class09270;
import Nursultan.class09271;
import Nursultan.class09273;
import Nursultan.class09274;
import Nursultan.class09278;
import Nursultan.class09280;
import Nursultan.class09283;
import Nursultan.class09285;
import Nursultan.class09286;
import Nursultan.class09289;
import Nursultan.class09290;
import Nursultan.class09296;
import Nursultan.class09298;
import Nursultan.class09299;
import Nursultan.class09345;
import Nursultan.class11287;
import Nursultan.class11303;
import Nursultan.class11311;
import Nursultan.class11351;
import Nursultan.class11405;
import Nursultan.class11410;
import Nursultan.class11448;
import Nursultan.class11483;
import Nursultan.class11843;
import Nursultan.class11886;
import Nursultan.class11901;
import Nursultan.class11910;
import Nursultan.class11922;
import Nursultan.class11938;
import Nursultan.class11940;
import Nursultan.class11978;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class06202;
import minecraft.class06889;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11408
extends Record
implements class09263,
class09285 {
    public class11405 client;
    public class11410 connection;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;

    public class11405 L() {
        return this.client;
    }

    public class11408(class11405 class114052, class11410 class114102) {
        this.client = class114052;
        this.connection = class114102;
    }

    static {
        class11408.Z();
        L_0 = LogManager.getLogger(String.class);
        L_1 = class06202.Nq();
        L_2 = new class11843();
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11408.class, "client;connection", "client", "connection"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11408.class, "client;connection", "client", "connection"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11408.class, "client;connection", "client", "connection"}, this);
    }

    private static void Z() {
        L_0 = null;
        L_1 = null;
        L_2 = null;
    }

    public class11410 u() {
        return this.connection;
    }

    public void y() {
    }

    public void N(class09290 class092902) {
    }

    public boolean N() {
        return this.connection.N();
    }

    public void N(class09299 class092992) {
        ((class06202)L_1).execute(() -> class11938.T().N(class092992.N()));
    }

    public void N(class09274 class092742) {
        ((class06202)L_1).execute(() -> class11938.I().N(class092742));
    }

    public void N(class09256 class092562) {
        ((class06202)L_1).execute(() -> class11938.J().N(class092562));
    }

    public void N(class09289 class092892) {
        JsonElement jsonElement = JsonParser.parseString((String)class092892.N());
        class11303.N((class11287)((class11287)class11311.N_0), (class00392)((class00392)class03748.N.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow()));
    }

    public void N(class09278 class092782) {
        ((class06202)L_1).execute(() -> {
            String[] stringArray = class092782.y().split("\\.");
            if (stringArray.length == 0) {
                return;
            }
            class11901.N((String)stringArray[0]).ifPresent(class11886::N);
        });
    }

    public void N(class09298 class092982) {
        ((class06202)L_1).execute(() -> {
            class09345 class093452 = class11938.N();
            if (!class093452.y(class092982.u())) {
                return;
            }
            class093452.N(class092982.u(), class092982.i(), class092982.L(), class092982.N(), class092982.y());
        });
    }

    public void N(class09283 class092832) {
        ((class06202)L_1).execute(() -> class11938.d().N(class092832));
    }

    public void N(class09296 class092962) {
    }

    public void N(class09286 class092862) {
        ((class06202)L_1).execute(() -> class11938.E().N(new class11483(class092862.i(), class092862.y(), new class06889(class092862.u(), class092862.N(), class092862.L()), class11910.L(), class092862.R())));
    }

    public void N(class09255 class092552) {
        ((class06202)L_1).execute(() -> class11351.N((String)class092552.N()));
    }

    public void N(class09257 class092572) {
        ((class06202)L_1).execute(() -> class11922.N((String)class092572.N()));
    }

    public void N(class09266 class092662) {
        ((class06202)L_1).execute(() -> class11938.N().N(class092662.N()));
    }

    public void N(class09280 class092802) {
        ((class06202)L_1).execute(() -> this.client.E().addAll(Arrays.asList(class092802.N())));
    }

    public void N(class09273 class092732) {
        this.connection.N(new class11978(class092732.N()));
    }

    public void N(class09271 class092712) {
        ((Logger)L_0).error(class092712.N());
        class11303.N((class11287)((class11287)class11311.N_0), (Object)class092712.N());
        class06202.Nq().execute(() -> class11938.N().L());
        this.connection.u();
        class11938.z().m();
    }

    public void N(class09270 class092702) {
        class11940 class119402 = class092702.N();
        byte by = class092702.y();
        class11448 class114482 = ((class11843)L_2).N((int)by);
        if (class114482 == null) {
            return;
        }
        if (class114482.y()) {
            class114482.N(class119402);
            return;
        }
        class119402.W().retain();
        ((class06202)L_1).execute(() -> {
            try {
                class114482.N(class119402);
            }
            finally {
                class119402.s();
            }
        });
    }
}

