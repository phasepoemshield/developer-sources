/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08314
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class04957;
import minecraft.class08314;
import org.slf4j.Logger;

public final class class04956
extends Record {
    private final List<class04957> pendingInvites;
    private static final Logger y = LogUtils.getLogger();

    public class04956(List<class04957> list) {
        this.pendingInvites = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04956.class, "pendingInvites", "pendingInvites"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04956.class, "pendingInvites", "pendingInvites"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04956.class, "pendingInvites", "pendingInvites"}, this);
    }

    public List<class04957> N() {
        return this.pendingInvites;
    }

    public static class04956 N(String string) {
        ArrayList<class04957> arrayList = new ArrayList<class04957>();
        try {
            JsonObject jsonObject = class08314.N((String)string).getAsJsonObject();
            if (jsonObject.get("invites").isJsonArray()) {
                Iterator var3 = jsonObject.get("invites").getAsJsonArray().iterator();
                while (var3.hasNext()) {
                    class04957 class049572 = class04957.N(((JsonElement)var3.next()).getAsJsonObject());
                    if (class049572 == null) continue;
                    arrayList.add(class049572);
                }
            }
        }
        catch (Exception exception) {
            y.error("Could not parse PendingInvitesList", (Throwable)exception);
        }
        return new class04956(arrayList);
    }
}

