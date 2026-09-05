/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00667
 *  minecraft.class04434
 *  minecraft.class06799
 */
package Nursultan;

import Nursultan.class10395;
import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class04434;
import minecraft.class06799;

public class class10392
implements class06799 {
    public void N(class10395 class103952, class00667 class006672) {
        class006672.y(class103952.N);
    }

    public class10395 y(class00667 class006672) {
        return new class10395(this, class006672.b());
    }

    public void N(class10395 class103952, JsonObject jsonObject) {
        jsonObject.addProperty("registry", class103952.N.N().toString());
    }

    public class10395 N(class04434 class044342) {
        return new class10395(this, class044342.N);
    }
}

