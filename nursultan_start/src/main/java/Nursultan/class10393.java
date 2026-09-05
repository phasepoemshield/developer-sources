/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00667
 *  minecraft.class04403
 *  minecraft.class06799
 */
package Nursultan;

import Nursultan.class10394;
import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class04403;
import minecraft.class06799;

public class class10393
implements class06799 {
    public void N(class10394 class103942, class00667 class006672) {
        class006672.y(class103942.N);
    }

    public class10394 y(class00667 class006672) {
        return new class10394(this, class006672.b());
    }

    public void N(class10394 class103942, JsonObject jsonObject) {
        jsonObject.addProperty("registry", class103942.N.N().toString());
    }

    public class10394 N(class04403 class044032) {
        return new class10394(this, class044032.N);
    }
}

