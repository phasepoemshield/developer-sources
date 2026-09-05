/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00392
 *  minecraft.class01060
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonObject;
import java.util.Date;
import minecraft.class00392;
import minecraft.class01060;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;

public class class05157
extends class01060<class08774> {
    private static final class00392 M = class00392.L((String)"commands.banlist.entry.unknown");

    public class05157(JsonObject jsonObject) {
        super((Object)class08774.N((JsonObject)jsonObject), jsonObject);
    }

    public class05157(@Nullable class08774 class087742, @Nullable Date date, @Nullable String string, @Nullable Date date2, @Nullable String string2) {
        super((Object)class087742, date, string, date2, string2);
    }

    public class05157(@Nullable class08774 class087742) {
        this(class087742, null, null, null, null);
    }

    protected void N(JsonObject jsonObject) {
        if (this.B() == null) {
            return;
        }
        ((class08774)this.B()).y(jsonObject);
        super.N(jsonObject);
    }

    public class00392 R() {
        class08774 class087742 = (class08774)this.B();
        return class087742 != null ? class00392.y((String)class087742.y()) : M;
    }
}

