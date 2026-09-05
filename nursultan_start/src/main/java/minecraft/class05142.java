/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class08774
 */
package minecraft;

import com.google.gson.JsonObject;
import minecraft.class05151;
import minecraft.class08774;

public class class05142
extends class05151<class08774> {
    public class05142(class08774 class087742) {
        super(class087742);
    }

    public class05142(JsonObject jsonObject) {
        super(class08774.N((JsonObject)jsonObject));
    }

    @Override
    protected void N(JsonObject jsonObject) {
        if (this.B() == null) {
            return;
        }
        ((class08774)this.B()).y(jsonObject);
    }
}

