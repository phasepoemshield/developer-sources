/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00202
 *  minecraft.class00667
 *  minecraft.class06799
 */
package Nursultan;

import Nursultan.class09231;
import com.google.gson.JsonObject;
import minecraft.class00202;
import minecraft.class00667;
import minecraft.class06799;

public class class09232
implements class06799 {
    public void N(class09231 class092312, class00667 class006672) {
        class006672.y(class092312.N);
    }

    public class09231 y(class00667 class006672) {
        return new class09231(this, class006672.b());
    }

    public void N(class09231 class092312, JsonObject jsonObject) {
        jsonObject.addProperty("registry", class092312.N.N().toString());
    }

    public class09231 N(class00202 class002022) {
        return new class09231(this, class002022.y);
    }
}

