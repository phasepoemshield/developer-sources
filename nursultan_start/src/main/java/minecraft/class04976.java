/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08314
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class04948;
import minecraft.class08314;
import org.slf4j.Logger;

public final class class04976
extends Record {
    private final List<class04948> backups;
    private static final Logger y = LogUtils.getLogger();

    public class04976(List<class04948> list) {
        this.backups = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04976.class, "backups", "backups"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04976.class, "backups", "backups"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04976.class, "backups", "backups"}, this);
    }

    public List<class04948> N() {
        return this.backups;
    }

    public static class04976 N(String string) {
        ArrayList<class04948> arrayList = new ArrayList<class04948>();
        try {
            JsonElement jsonElement = class08314.N((String)string).getAsJsonObject().get("backups");
            if (jsonElement.isJsonArray()) {
                Iterator var3 = jsonElement.getAsJsonArray().iterator();
                while (var3.hasNext()) {
                    class04948 class049482 = class04948.N((JsonElement)var3.next());
                    if (class049482 == null) continue;
                    arrayList.add(class049482);
                }
            }
        }
        catch (Exception exception) {
            y.error("Could not parse BackupList", (Throwable)exception);
        }
        return new class04976(arrayList);
    }
}

