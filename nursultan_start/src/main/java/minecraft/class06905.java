/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class04206
 *  minecraft.class04241
 *  minecraft.class04476
 *  minecraft.class07135
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class04206;
import minecraft.class04241;
import minecraft.class04476;
import minecraft.class07135;

public class class06905
implements class07135 {
    private final class01996 N;

    public class06905(class01996 class019962) {
        this.N = class019962;
    }

    private static <T> JsonElement N(class00751<T> class007512) {
        JsonObject jsonObject = new JsonObject();
        if (class007512 instanceof class04241) {
            class01894 class018942 = ((class04241)class007512).y();
            jsonObject.addProperty("default", class018942.toString());
        }
        int n = class04206.NF.N(class007512);
        jsonObject.addProperty("protocol_id", (Number)n);
        JsonObject jsonObject2 = new JsonObject();
        class007512.z().forEach(class035292 -> {
            Object object = class035292.N();
            int n = class007512.N(object);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("protocol_id", (Number)n);
            jsonObject2.add(class035292.B().N().toString(), (JsonElement)jsonObject2);
        });
        jsonObject.add("entries", (JsonElement)jsonObject2);
        return jsonObject;
    }

    public String method_10321() {
        return "Registry Dump";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        JsonObject jsonObject = new JsonObject();
        class04206.NF.z().forEach(class035292 -> jsonObject.add(class035292.B().N().toString(), class06905.N((class00751)class035292.N())));
        Path path = this.N.method_45972(class02024.field_39369).resolve("registries.json");
        return class07135.N((class04476)class044762, (JsonElement)jsonObject, (Path)path);
    }
}

