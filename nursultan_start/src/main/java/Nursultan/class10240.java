/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00667
 *  minecraft.class03789
 *  minecraft.class06799
 */
package Nursultan;

import Nursultan.class10233;
import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class03789;
import minecraft.class06799;

public class class10240
implements class06799 {
    public void N(class10233 class102332, class00667 class006672) {
        class006672.y(class102332.N);
    }

    public class10233 y(class00667 class006672) {
        return new class10233(this, class006672.b());
    }

    public void N(class10233 class102332, JsonObject jsonObject) {
        jsonObject.addProperty("registry", class102332.N.N().toString());
    }

    public class10233 N(class03789 class037892) {
        return new class10233(this, class037892.N);
    }
}

