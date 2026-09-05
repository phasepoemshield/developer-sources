/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00667
 *  minecraft.class06799
 *  minecraft.class07798
 */
package minecraft;

import com.google.gson.JsonObject;
import minecraft.class00667;
import minecraft.class00907;
import minecraft.class06799;
import minecraft.class07798;

public class class00871
implements class06799<class07798, class00907> {
    public void N(class00907 class009072, class00667 class006672) {
        class006672.writeInt(class009072.N);
    }

    public class00907 y(class00667 class006672) {
        int n = class006672.readInt();
        return new class00907(this, n);
    }

    public void N(class00907 class009072, JsonObject jsonObject) {
        jsonObject.addProperty("min", (Number)class009072.N);
    }

    public class00907 N(class07798 class077982) {
        return new class00907(this, class077982.N);
    }
}

