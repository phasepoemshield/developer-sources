/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class03519
 *  minecraft.class03705
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class07536
 *  minecraft.class08092
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class03519;
import minecraft.class03705;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class07135;
import minecraft.class07536;
import minecraft.class08092;

public class class07106
implements class07135 {
    private final class01996 N;
    private final CompletableFuture<class01929> i;

    public class07106(class01996 class019962, CompletableFuture<class01929> completableFuture) {
        this.N = class019962;
        this.i = completableFuture;
    }

    private static /* synthetic */ AssertionError N(String string, String string2) {
        return new AssertionError((Object)("Failed to serialize block " + string + " (is type registered in BlockTypes?): " + string2));
    }

    @Override
    public String method_10321() {
        return "Block List";
    }

    @Override
    public CompletableFuture<?> method_10319(class04476 class044762) {
        Path path = this.N.method_45972(class02024.field_39369).resolve("blocks.json");
        return this.i.thenCompose(class019292 -> {
            JsonObject jsonObject = new JsonObject();
            class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
            class019292.y(class04227.Z).z().forEach(class035292 -> {
                class00500 class0050022;
                JsonArray jsonArray;
                JsonObject jsonObject2;
                JsonObject jsonObject3 = new JsonObject();
                class00507 var4 = ((class00891)class035292.N()).E();
                if (!var4.u().isEmpty()) {
                    jsonObject2 = new JsonObject();
                    for (class08092 var7 : var4.u()) {
                        jsonArray = new JsonArray();
                        for (Comparable comparable : var7.N()) {
                            jsonArray.add(class07536.N((class08092)var7, (Object)comparable));
                        }
                        jsonObject2.add(var7.R(), (JsonElement)jsonArray);
                    }
                    jsonObject3.add("properties", (JsonElement)jsonObject2);
                }
                jsonObject2 = new JsonArray();
                for (class00500 class0050022 : var4.N()) {
                    jsonArray = new JsonObject();
                    JsonObject jsonObject4 = new JsonObject();
                    for (class08092 var11 : var4.u()) {
                        jsonObject4.addProperty(var11.R(), class07536.N((class08092)var11, (Object)class0050022.L(var11)));
                    }
                    if (!jsonObject4.isEmpty()) {
                        jsonArray.add("properties", (JsonElement)jsonObject4);
                    }
                    jsonArray.addProperty("id", (Number)class00891.W((class00500)class0050022));
                    if (class0050022 == ((class00891)class035292.N()).W()) {
                        jsonArray.addProperty("default", Boolean.valueOf(true));
                    }
                    jsonObject2.add((JsonElement)jsonArray);
                }
                jsonObject3.add("states", (JsonElement)jsonObject2);
                Object object = class035292.M();
                class0050022 = (JsonElement)class03705.N.codec().encodeStart((DynamicOps)class035192, (Object)((class00891)class035292.N())).getOrThrow(arg_0 -> class07106.N((String)object, arg_0));
                jsonObject3.add("definition", (JsonElement)class0050022);
                jsonObject.add((String)object, (JsonElement)jsonObject3);
            });
            return class07135.N(class044762, (JsonElement)jsonObject, path);
        });
    }
}

