/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class05151
 *  minecraft.class06984
 *  minecraft.class08195
 *  minecraft.class08774
 */
package minecraft;

import com.google.gson.JsonObject;
import minecraft.class05151;
import minecraft.class06984;
import minecraft.class08195;
import minecraft.class08774;

public class class01087
extends class05151<class08774> {
    private final class06984 N;
    private final boolean y;

    public class01087(class08774 class087742, class06984 class069842, boolean bl) {
        super((Object)class087742);
        this.N = class069842;
        this.y = bl;
    }

    public class01087(JsonObject jsonObject) {
        super((Object)class08774.N((JsonObject)jsonObject));
        class08195 class081952 = jsonObject.has("level") ? class08195.N((int)jsonObject.get("level").getAsInt()) : class08195.field_63196;
        this.N = class06984.N((class08195)class081952);
        this.y = jsonObject.has("bypassesPlayerLimit") && jsonObject.get("bypassesPlayerLimit").getAsBoolean();
    }

    public boolean y() {
        return this.y;
    }

    protected void N(JsonObject jsonObject) {
        if (this.B() == null) {
            return;
        }
        ((class08774)this.B()).y(jsonObject);
        jsonObject.addProperty("level", (Number)this.N.N().N());
        jsonObject.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.y));
    }

    public class06984 N() {
        return this.N;
    }
}

