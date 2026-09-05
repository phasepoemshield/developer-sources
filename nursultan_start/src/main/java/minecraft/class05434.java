/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04719
 *  minecraft.class04982
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
import minecraft.class04719;
import minecraft.class04982;
import minecraft.class08314;
import org.slf4j.Logger;

public final class class05434
extends Record {
    private final List<class04982> templates;
    private final int page;
    private final int size;
    private final int total;
    private static final Logger i = LogUtils.getLogger();

    public int L() {
        return this.page;
    }

    public class05434(int n) {
        this(List.of(), 0, n, -1);
    }

    public class05434(List<class04982> list, int n, int n2, int n3) {
        this.templates = list;
        this.page = n;
        this.size = n2;
        this.total = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05434.class, "templates;page;size;total", "templates", "page", "size", "total"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05434.class, "templates;page;size;total", "templates", "page", "size", "total"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05434.class, "templates;page;size;total", "templates", "page", "size", "total"}, this);
    }

    public int i() {
        return this.total;
    }

    public int u() {
        return this.size;
    }

    public List<class04982> y() {
        return this.templates;
    }

    public boolean N() {
        return this.page * this.size >= this.total && this.page > 0 && this.total > 0 && this.size > 0;
    }

    public static class05434 N(String string) {
        ArrayList<class04982> arrayList = new ArrayList<class04982>();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        try {
            JsonObject jsonObject = class08314.N((String)string).getAsJsonObject();
            if (jsonObject.get("templates").isJsonArray()) {
                Iterator var6 = jsonObject.get("templates").getAsJsonArray().iterator();
                while (var6.hasNext()) {
                    class04982 class049822 = class04982.N((JsonObject)((JsonElement)var6.next()).getAsJsonObject());
                    if (class049822 == null) continue;
                    arrayList.add(class049822);
                }
            }
            n = class04719.N((String)"page", (JsonObject)jsonObject, (int)0);
            n2 = class04719.N((String)"size", (JsonObject)jsonObject, (int)0);
            n3 = class04719.N((String)"total", (JsonObject)jsonObject, (int)0);
        }
        catch (Exception exception) {
            i.error("Could not parse WorldTemplatePaginatedList", (Throwable)exception);
        }
        return new class05434(arrayList, n, n2, n3);
    }
}

