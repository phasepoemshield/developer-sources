/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.LongSerializationPolicy
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00323
 *  minecraft.class00549
 *  minecraft.class02299
 *  minecraft.class04319
 *  minecraft.class04326
 *  minecraft.class04335
 *  minecraft.class07536
 *  minecraft.class08175
 */
package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.LongSerializationPolicy;
import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import minecraft.class00323;
import minecraft.class00549;
import minecraft.class02299;
import minecraft.class03201;
import minecraft.class03204;
import minecraft.class03205;
import minecraft.class03213;
import minecraft.class03214;
import minecraft.class03224;
import minecraft.class03226;
import minecraft.class03228;
import minecraft.class03234;
import minecraft.class04319;
import minecraft.class04326;
import minecraft.class04335;
import minecraft.class07536;
import minecraft.class08175;

public class class03227 {
    private static final String y = "bytesPerSecond";
    private static final String L = "count";
    private static final String u = "durationNanosTotal";
    private static final String i = "totalBytes";
    private static final String R = "countPerSecond";
    final Gson N = new GsonBuilder().setPrettyPrinting().setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).create();

    private JsonElement L(List<class03228> list) {
        if (list.isEmpty()) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        double[] dArray = list.stream().mapToDouble(class032282 -> (double)class032282.y().toNanos() / 1000000.0).toArray();
        DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream.of(dArray).summaryStatistics();
        jsonObject.addProperty("minMs", (Number)doubleSummaryStatistics.getMin());
        jsonObject.addProperty("averageMs", (Number)doubleSummaryStatistics.getAverage());
        jsonObject.addProperty("maxMs", (Number)doubleSummaryStatistics.getMax());
        class03213.N(dArray).forEach((n, d) -> jsonObject.addProperty("p" + n, (Number)d));
        return jsonObject;
    }

    private JsonElement L(class03224 class032242) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("sent", this.N(class032242.W(), class03227::N));
        jsonObject.add("received", this.N(class032242.E(), class03227::N));
        return jsonObject;
    }

    private JsonElement i(List<class03226> list2) {
        JsonObject jsonObject = new JsonObject();
        BiFunction<List, ToDoubleFunction, JsonObject> biFunction = (list, toDoubleFunction) -> {
            JsonObject jsonObject = new JsonObject();
            DoubleSummaryStatistics doubleSummaryStatistics = list.stream().mapToDouble(toDoubleFunction).summaryStatistics();
            jsonObject.addProperty("min", (Number)doubleSummaryStatistics.getMin());
            jsonObject.addProperty("average", (Number)doubleSummaryStatistics.getAverage());
            jsonObject.addProperty("max", (Number)doubleSummaryStatistics.getMax());
            return jsonObject;
        };
        jsonObject.add("jvm", (JsonElement)biFunction.apply(list2, class03226::N));
        jsonObject.add("userJvm", (JsonElement)biFunction.apply(list2, class03226::y));
        jsonObject.add("system", (JsonElement)biFunction.apply(list2, class03226::L));
        return jsonObject;
    }

    private JsonElement u(List<class08175> list) {
        if (list.isEmpty()) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        int[] nArray = list.stream().mapToInt(class08175::N).toArray();
        IntSummaryStatistics intSummaryStatistics = IntStream.of(nArray).summaryStatistics();
        jsonObject.addProperty("minFPS", (Number)intSummaryStatistics.getMin());
        jsonObject.addProperty("averageFPS", (Number)intSummaryStatistics.getAverage());
        jsonObject.addProperty("maxFPS", (Number)intSummaryStatistics.getMax());
        class03213.N(nArray).forEach((n, d) -> jsonObject.addProperty("p" + n, (Number)d));
        return jsonObject;
    }

    private JsonElement y(class03224 class032242) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("write", this.N(class032242.s()));
        jsonObject.add("read", this.N(class032242.T()));
        jsonObject.add("chunksRead", this.N(class032242.P(), class03227::N));
        jsonObject.add("chunksWritten", this.N(class032242.m(), class03227::N));
        return jsonObject;
    }

    private JsonElement y(List<Pair<class00549, class03205<class03201>>> list) {
        JsonObject jsonObject = new JsonObject();
        if (list.isEmpty()) {
            return jsonObject;
        }
        jsonObject.addProperty(u, (Number)list.stream().mapToDouble(pair -> ((class03205)((Object)((Object)pair.getSecond()))).R().toNanos()).sum());
        JsonArray jsonArray2 = (JsonArray)class07536.N((Object)new JsonArray(), (T jsonArray) -> jsonObject.add("status", (JsonElement)jsonArray));
        for (Pair<class00549, class03205<class03201>> pair2 : list) {
            class03205 class032052 = (class03205)((Object)pair2.getSecond());
            JsonObject jsonObject3 = (JsonObject)class07536.N((Object)new JsonObject(), arg_0 -> ((JsonArray)jsonArray2).add(arg_0));
            jsonObject3.addProperty("state", ((class00549)pair2.getFirst()).toString());
            jsonObject3.addProperty(L, (Number)class032052.u());
            jsonObject3.addProperty(u, (Number)class032052.R().toNanos());
            jsonObject3.addProperty("durationNanosAvg", (Number)(class032052.R().toNanos() / (long)class032052.u()));
            JsonObject jsonObject4 = (JsonObject)class07536.N((Object)new JsonObject(), (T jsonObject2) -> jsonObject3.add("durationNanosPercentiles", (JsonElement)jsonObject2));
            class032052.i().forEach((n, d) -> jsonObject4.addProperty("p" + n, (Number)d));
            Function<class03201, JsonElement> function = class032012 -> {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("durationNanos", (Number)class032012.N().toNanos());
                jsonObject.addProperty("level", class032012.i());
                jsonObject.addProperty("chunkPosX", (Number)class032012.y().B);
                jsonObject.addProperty("chunkPosZ", (Number)class032012.y().Z);
                jsonObject.addProperty("worldPosX", (Number)class032012.L().L());
                jsonObject.addProperty("worldPosZ", (Number)class032012.L().u());
                return jsonObject;
            };
            jsonObject3.add("fastest", function.apply((class03201)class032052.N()));
            jsonObject3.add("slowest", function.apply((class03201)class032052.y()));
            jsonObject3.add("secondSlowest", (JsonElement)(class032052.L() != null ? function.apply((class03201)class032052.L()) : JsonNull.INSTANCE));
        }
        return jsonObject;
    }

    private static void N(class02299 class022992, JsonObject jsonObject) {
        jsonObject.addProperty("level", class022992.N());
        jsonObject.addProperty("dimension", class022992.y());
        jsonObject.addProperty("x", (Number)class022992.L());
        jsonObject.addProperty("z", (Number)class022992.u());
    }

    private static void N(class04335 class043352, JsonObject jsonObject) {
        jsonObject.addProperty("protocolId", class043352.y());
        jsonObject.addProperty("packetId", class043352.L());
    }

    private JsonElement N(List<class00323> list2) {
        JsonObject jsonObject = new JsonObject();
        Optional<class03205<class00323>> optional = class03205.N(list2);
        if (optional.isEmpty()) {
            return jsonObject;
        }
        class03205<class00323> class032052 = optional.get();
        JsonArray jsonArray = new JsonArray();
        jsonObject.add("structure", (JsonElement)jsonArray);
        list2.stream().collect(Collectors.groupingBy(class00323::L)).forEach((string, list) -> {
            Optional optional = class03205.N(list);
            if (optional.isEmpty()) {
                return;
            }
            class03205 class032053 = optional.get();
            JsonObject jsonObject3 = new JsonObject();
            jsonArray.add((JsonElement)jsonObject3);
            jsonObject3.addProperty("name", string);
            jsonObject3.addProperty(L, (Number)class032053.u());
            jsonObject3.addProperty(u, (Number)class032053.R().toNanos());
            jsonObject3.addProperty("durationNanosAvg", (Number)(class032053.R().toNanos() / (long)class032053.u()));
            JsonObject jsonObject4 = (JsonObject)class07536.N((Object)new JsonObject(), (T jsonObject2) -> jsonObject3.add("durationNanosPercentiles", (JsonElement)jsonObject2));
            class032053.i().forEach((n, d) -> jsonObject4.addProperty("p" + n, (Number)d));
            Function<class00323, JsonElement> function = class003232 -> {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("durationNanos", (Number)class003232.N().toNanos());
                jsonObject.addProperty("chunkPosX", (Number)class003232.y().B);
                jsonObject.addProperty("chunkPosZ", (Number)class003232.y().Z);
                jsonObject.addProperty("structureName", class003232.L());
                jsonObject.addProperty("level", class003232.u());
                jsonObject.addProperty("success", Boolean.valueOf(class003232.i()));
                return jsonObject;
            };
            jsonObject.add("fastest", function.apply((class00323)class032052.N()));
            jsonObject.add("slowest", function.apply((class00323)class032052.y()));
            jsonObject.add("secondSlowest", (JsonElement)(class032052.L() != null ? function.apply((class00323)class032052.L()) : JsonNull.INSTANCE));
        });
        return jsonObject;
    }

    private <T> JsonElement N(class04326<T> class043262, BiConsumer<T, JsonObject> biConsumer) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(i, (Number)class043262.u());
        jsonObject.addProperty(L, (Number)class043262.L());
        jsonObject.addProperty(y, (Number)class043262.y());
        jsonObject.addProperty(R, (Number)class043262.N());
        JsonArray jsonArray = new JsonArray();
        jsonObject.add("topContributors", (JsonElement)jsonArray);
        class043262.i().forEach(pair -> {
            JsonObject jsonObject = new JsonObject();
            jsonArray.add((JsonElement)jsonObject);
            Object object = pair.getFirst();
            class04319 class043192 = (class04319)pair.getSecond();
            biConsumer.accept(object, jsonObject);
            jsonObject.addProperty(i, (Number)class043192.L());
            jsonObject.addProperty(L, (Number)class043192.y());
            jsonObject.addProperty("averageSize", (Number)Float.valueOf(class043192.N()));
        });
        return jsonObject;
    }

    private JsonElement N(class03234 class032342) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(i, (Number)class032342.N());
        jsonObject.addProperty(L, (Number)class032342.L());
        jsonObject.addProperty(y, (Number)class032342.y());
        jsonObject.addProperty(R, (Number)class032342.u());
        JsonArray jsonArray = new JsonArray();
        jsonObject.add("topContributors", (JsonElement)jsonArray);
        class032342.R().forEach(pair -> {
            JsonObject jsonObject = new JsonObject();
            jsonArray.add((JsonElement)jsonObject);
            jsonObject.addProperty("path", (String)pair.getFirst());
            jsonObject.addProperty(i, (Number)pair.getSecond());
        });
        return jsonObject;
    }

    private JsonElement N(class03204 class032042) {
        JsonArray jsonArray = new JsonArray();
        class032042.N().forEach((string, d) -> jsonArray.add((JsonElement)class07536.N((Object)new JsonObject(), (T jsonObject) -> {
            jsonObject.addProperty("thread", string);
            jsonObject.addProperty(y, (Number)d);
        })));
        return jsonArray;
    }

    public String N(class03224 class032242) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("startedEpoch", (Number)class032242.L().toEpochMilli());
        jsonObject.addProperty("endedEpoch", (Number)class032242.u().toEpochMilli());
        jsonObject.addProperty("durationMs", (Number)class032242.i().toMillis());
        Duration duration = class032242.R();
        if (duration != null) {
            jsonObject.addProperty("worldGenDurationMs", (Number)duration.toMillis());
        }
        jsonObject.add("heap", this.N(class032242.z()));
        jsonObject.add("cpuPercent", this.i(class032242.Z()));
        jsonObject.add("network", this.L(class032242));
        jsonObject.add("fileIO", this.y(class032242));
        jsonObject.add("fps", this.u(class032242.M()));
        jsonObject.add("serverTick", this.L(class032242.B()));
        jsonObject.add("threadAllocation", this.N(class032242.U()));
        jsonObject.add("chunkGen", this.y(class032242.N()));
        jsonObject.add("structureGen", this.N(class032242.j()));
        return this.N.toJson((JsonElement)jsonObject);
    }

    private JsonElement N(class03214 class032142) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("allocationRateBytesPerSecond", (Number)class032142.i());
        jsonObject.addProperty("gcCount", (Number)class032142.u());
        jsonObject.addProperty("gcOverHeadPercent", (Number)Float.valueOf(class032142.N()));
        jsonObject.addProperty("gcTotalDurationMs", (Number)class032142.L().toMillis());
        return jsonObject;
    }
}

