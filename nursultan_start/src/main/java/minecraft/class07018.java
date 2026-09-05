/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10707
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  jerozgen.languagereload.access.ILanguage
 *  minecraft.class01028
 *  minecraft.class05001
 *  minecraft.class05936
 *  minecraft.class08244
 *  minecraft.class08429
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10707;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import jerozgen.languagereload.access.ILanguage;
import minecraft.class01028;
import minecraft.class05001;
import minecraft.class05936;
import minecraft.class08244;
import minecraft.class08429;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07018
implements ILanguage {
    private static final Logger N = LogUtils.getLogger();
    private static final Gson L = new Gson();
    private static final Pattern u = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
    public static final String y = "en_us";
    private static volatile class07018 i = class07018.L();
    private class08429 R = null;
    private static class08429 M;

    private static class07018 L() {
        class08244 class082442 = class08244.N();
        HashMap hashMap = new HashMap();
        class07018.N(hashMap::put, "/assets/minecraft/lang/en_us.json");
        class082442.N(hashMap);
        Map map = Map.copyOf(hashMap);
        return new class10707(map);
    }

    public String y(String string) {
        return this.N(string, string);
    }

    public static class07018 y() {
        return i;
    }

    private static void y(class07018 class070182, CallbackInfo callbackInfo) {
        ((ILanguage)class070182).languagereload_setTranslationStorage(M);
        M = null;
    }

    public void languagereload_setTranslationStorage(class08429 class084292) {
        this.R = class084292;
    }

    public List<class01028> N(List<class05936> list) {
        return (List)list.stream().map(this::N).collect(ImmutableList.toImmutableList());
    }

    public abstract class01028 N(class05936 var1);

    private static void N(class07018 class070182, CallbackInfo callbackInfo) {
        if (class070182 instanceof class08429) {
            M = (class08429)class070182;
        }
    }

    private static void N(BiConsumer<String, String> biConsumer, String string) {
        try (InputStream inputStream = class07018.class.getResourceAsStream(string);){
            class07018.N(inputStream, biConsumer);
        }
        catch (JsonParseException | IOException throwable) {
            N.error("Couldn't read strings from {}", (Object)string, (Object)throwable);
        }
    }

    public static void N(InputStream inputStream, BiConsumer<String, String> biConsumer) {
        for (Map.Entry entry : ((JsonObject)L.fromJson((Reader)new InputStreamReader(inputStream, StandardCharsets.UTF_8), JsonObject.class)).entrySet()) {
            String string = u.matcher(class05001.N((JsonElement)((JsonElement)entry.getValue()), (String)((String)entry.getKey()))).replaceAll("%$1s");
            biConsumer.accept((String)entry.getKey(), string);
        }
    }

    public static void N(class07018 class070182) {
        class07018.N(class070182, null);
        i = class070182;
        class07018.y(class070182, null);
    }

    public abstract boolean N();

    public abstract boolean N(String var1);

    public abstract String N(String var1, String var2);

    public class08429 languagereload_getTranslationStorage() {
        return this.R;
    }
}

