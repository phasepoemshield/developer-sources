/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11911
 *  com.google.gson.reflect.TypeToken
 *  minecraft.class01894
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11911;
import Nursultan.class11938;
import Nursultan.class11999;
import Nursultan.class12015;
import Nursultan.class12018;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;
import minecraft.class01894;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class12020 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public static Object y_0;

    private void L(class11999 class119992) {
        class11911.N((String)("locale/" + class119992.N()), class018942 -> class018942.N().endsWith(".json")).forEach(class018942 -> {
            class12015 class120152 = new class12015(this);
            Map map = (Map)class11911.N((class01894)class018942, (TypeToken)class120152);
            if (map != null) {
                ((Map)this.N_2).putAll(map);
            }
        });
    }

    public class12020(class11999 class119992, class11999 class119993) {
        this.i();
        this.N_2 = new HashMap();
        this.N_1 = class119993;
        this.N(class119992);
    }

    static {
        class12020.B();
        y_0 = LogManager.getLogger(String.class);
    }

    private static void B() {
        y_0 = null;
    }

    private void i() {
    }

    private boolean y(class11999 class119992) {
        if ((class11999)((Object)this.N_0) == class119992) {
            return false;
        }
        this.N_0 = class119992;
        return true;
    }

    public Map<String, String> y() {
        return Map.copyOf((Map)this.N_2);
    }

    public void N(class11999 class119992) {
        if (!this.y(class119992)) {
            return;
        }
        try {
            ((Map)this.N_2).clear();
            this.L((class11999)((Object)this.N_1));
            this.L(class119992);
        }
        catch (Exception exception) {
            ((Logger)y_0).error((Object)exception, (Throwable)exception);
        }
    }

    public class11999 N() {
        return (class11999)((Object)this.N_0);
    }

    public static String N(String string) {
        return ((Map)class11938.P().N_2).getOrDefault(string, string);
    }

    public static String N(class12018 class120182) {
        return ((Map)class11938.P().N_2).getOrDefault(class120182.N(), class120182.N());
    }
}

