/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonObject;
import java.util.Date;
import minecraft.class00392;
import minecraft.class01060;
import org.jspecify.annotations.Nullable;

public class class01072
extends class01060<String> {
    public class01072(JsonObject jsonObject) {
        super(class01072.y(jsonObject), jsonObject);
    }

    public class01072(String string, @Nullable Date date, @Nullable String string2, @Nullable Date date2, @Nullable String string3) {
        super(string, date, string2, date2, string3);
    }

    public class01072(String string) {
        this(string, (Date)null, (String)null, (Date)null, (String)null);
    }

    private static String y(JsonObject jsonObject) {
        return jsonObject.has("ip") ? jsonObject.get("ip").getAsString() : null;
    }

    @Override
    protected void N(JsonObject jsonObject) {
        if (this.B() == null) {
            return;
        }
        jsonObject.addProperty("ip", (String)this.B());
        super.N(jsonObject);
    }

    @Override
    public class00392 R() {
        return class00392.y((String)String.valueOf(this.B()));
    }
}

