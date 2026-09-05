/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00667
 *  minecraft.class03784
 *  minecraft.class06799
 */
package Nursultan;

import Nursultan.class10232;
import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class03784;
import minecraft.class06799;

public class class10231
implements class06799 {
    public void N(class10232 class102322, class00667 class006672) {
        class006672.y(class102322.N);
    }

    public class10232 y(class00667 class006672) {
        return new class10232(this, class006672.b());
    }

    public void N(class10232 class102322, JsonObject jsonObject) {
        jsonObject.addProperty("registry", class102322.N.N().toString());
    }

    public class10232 N(class03784 class037842) {
        return new class10232(this, class037842.L);
    }
}

