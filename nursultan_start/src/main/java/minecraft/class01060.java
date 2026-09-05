/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00392
 *  minecraft.class05151
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class05151;
import org.jspecify.annotations.Nullable;

public abstract class class01060<T>
extends class05151<T> {
    public static final SimpleDateFormat N = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
    public static final String y = "forever";
    protected final Date L;
    protected final String u;
    protected final @Nullable Date i;
    protected final @Nullable String R;

    public @Nullable Date L() {
        return this.i;
    }

    boolean M() {
        if (this.i == null) {
            return false;
        }
        return this.i.before(new Date());
    }

    protected class01060(@Nullable T t, JsonObject jsonObject) {
        super(t);
        Date date;
        Date date2;
        try {
            date2 = jsonObject.has("created") ? N.parse(jsonObject.get("created").getAsString()) : new Date();
        }
        catch (ParseException parseException) {
            date2 = new Date();
        }
        this.L = date2;
        this.u = jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)";
        try {
            date = jsonObject.has("expires") ? N.parse(jsonObject.get("expires").getAsString()) : null;
        }
        catch (ParseException parseException) {
            date = null;
        }
        this.i = date;
        this.R = jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : null;
    }

    public class01060(@Nullable T t, @Nullable Date date, @Nullable String string, @Nullable Date date2, @Nullable String string2) {
        super(t);
        this.L = date == null ? new Date() : date;
        this.u = string == null ? "(Unknown)" : string;
        this.i = date2;
        this.R = string2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        class01060 class010602 = (class01060)((Object)object);
        return Objects.equals(this.u, class010602.u) && Objects.equals(this.i, class010602.i) && Objects.equals(this.R, class010602.R) && Objects.equals(this.B(), class010602.B());
    }

    public class00392 i() {
        String string = this.u();
        return string == null ? class00392.L((String)"multiplayer.disconnect.banned.reason.default") : class00392.y((String)string);
    }

    public @Nullable String u() {
        return this.R;
    }

    public String y() {
        return this.u;
    }

    public Date N() {
        return this.L;
    }

    protected void N(JsonObject jsonObject) {
        jsonObject.addProperty("created", N.format(this.L));
        jsonObject.addProperty("source", this.u);
        jsonObject.addProperty("expires", this.i == null ? y : N.format(this.i));
        jsonObject.addProperty("reason", this.R);
    }

    public abstract class00392 R();
}

