/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00381
 *  minecraft.class01205
 *  minecraft.class02796
 *  minecraft.class04206
 *  minecraft.class04770
 *  minecraft.class05715
 *  minecraft.class06290
 *  minecraft.class07245
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07717
 *  minecraft.class08036
 *  minecraft.class08326
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00381;
import minecraft.class01205;
import minecraft.class02796;
import minecraft.class04206;
import minecraft.class04770;
import minecraft.class04907;
import minecraft.class04922;
import minecraft.class05715;
import minecraft.class06290;
import minecraft.class07245;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07717;
import minecraft.class08036;
import minecraft.class08326;
import org.slf4j.Logger;

public class class04895
extends class01205 {
    private static final Gson y = new GsonBuilder().setPrettyPrinting().create();
    private static final Logger L = LogUtils.getLogger();
    private static final Codec<Map<class04907<?>, Integer>> u = Codec.dispatchedMap((Codec)class04206.G.T(), (Function)class07536.y_4(class04895::N)).xmap(map -> {
        HashMap hashMap = new HashMap();
        map.forEach((class049222, map2) -> hashMap.putAll(map2));
        return hashMap;
    }, map -> map.entrySet().stream().collect(Collectors.groupingBy(entry -> ((class04907)((Object)((Object)((Object)entry.getKey())))).i(), class07536.N())));
    private final Path i;
    private final Set<class04907<?>> R = Sets.newHashSet();

    public void L() {
        this.R.addAll((Collection<class04907<?>>)this.N.keySet());
    }

    public class04895(class02796 class027962, Path path) {
        this.i = path;
        if (Files.isRegularFile(path, new LinkOption[0])) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.UTF_8);){
                JsonElement jsonElement = class08326.N((Reader)bufferedReader);
                this.N(class027962.ND(), jsonElement);
            }
            catch (IOException iOException) {
                L.error("Couldn't read statistics file {}", (Object)path, (Object)iOException);
            }
            catch (JsonParseException jsonParseException) {
                L.error("Couldn't parse statistics file {}", (Object)path, (Object)jsonParseException);
            }
        }
    }

    private Set<class04907<?>> u() {
        HashSet hashSet = Sets.newHashSet(this.R);
        this.R.clear();
        return hashSet;
    }

    protected JsonElement y() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("stats", (JsonElement)u.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)this.N).getOrThrow());
        jsonObject.addProperty("DataVersion", (Number)class07529.y().comp_4026().y());
        return jsonObject;
    }

    private static <T> Codec<Map<class04907<?>, Integer>> N(class04922<T> class049222) {
        return Codec.unboundedMap((Codec)class049222.y().T().flatComapMap(class049222::y, class049072 -> {
            if (class049072.i() == class049222) {
                return DataResult.success(class049072.R());
            }
            return DataResult.error(() -> "Expected type " + String.valueOf(class049222) + ", but got " + String.valueOf(class049072.i()));
        }), (Codec)Codec.INT);
    }

    public void N() {
        try {
            class06290.L((Path)this.i.getParent());
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(this.i, StandardCharsets.UTF_8, new OpenOption[0]);){
                y.toJson(this.y(), y.newJsonWriter((Writer)bufferedWriter));
            }
        }
        catch (JsonIOException | IOException throwable) {
            L.error("Couldn't save stats to {}", (Object)this.i, (Object)throwable);
        }
    }

    public void N(class08036 class080362, class04907<?> class049072, int n) {
        super.N(class080362, class049072, n);
        this.R.add(class049072);
    }

    public void N(DataFixer dataFixer, JsonElement jsonElement) {
        Dynamic dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement);
        dynamic = class05715.field_19218.N(dataFixer, dynamic, class07717.y((Dynamic)dynamic, (int)1343));
        this.N.putAll(u.parse(dynamic.get("stats").orElseEmptyMap()).resultOrPartial(string -> L.error("Failed to parse statistics for {}: {}", (Object)this.i, string)).orElse(Map.of()));
    }

    public void N(class04770 class047702) {
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (class04907<?> var4 : this.u()) {
            object2IntOpenHashMap.put(var4, this.N(var4));
        }
        class047702.field_13987.method_14364((class00381)new class07245((Object2IntMap)object2IntOpenHashMap));
    }
}

