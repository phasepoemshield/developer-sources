/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class02868
 *  minecraft.class04246
 *  minecraft.class04262
 *  minecraft.class04263
 *  minecraft.class04266
 *  minecraft.class04279
 *  minecraft.class04290
 *  minecraft.class04476
 *  minecraft.class07135
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class02868;
import minecraft.class04246;
import minecraft.class04262;
import minecraft.class04263;
import minecraft.class04266;
import minecraft.class04279;
import minecraft.class04290;
import minecraft.class04476;
import minecraft.class07135;

public class class02594
implements class07135 {
    private final class01996 N;

    public class02594(class01996 class019962) {
        this.N = class019962;
    }

    private JsonElement N() {
        JsonObject jsonObject = new JsonObject();
        Stream.of(class04263.N, class04290.L, class04290.N, class04279.L, class04279.N, class02868.L, class02868.N, class04266.L, class04266.y).map(class04246::N).collect(Collectors.groupingBy(class04262::N)).forEach((class006482, list) -> {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject.add(class006482.N(), (JsonElement)jsonObject2);
            list.forEach(class042622 -> {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.add(class042622.y().y(), (JsonElement)jsonObject2);
                class042622.N((class028972, n) -> {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("protocol_id", (Number)n);
                    jsonObject2.add(class028972.y().toString(), (JsonElement)jsonObject2);
                });
            });
        });
        return jsonObject;
    }

    public String method_10321() {
        return "Packet Report";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        Path path = this.N.method_45972(class02024.field_39369).resolve("packets.json");
        return class07135.N((class04476)class044762, (JsonElement)this.N(), (Path)path);
    }
}

