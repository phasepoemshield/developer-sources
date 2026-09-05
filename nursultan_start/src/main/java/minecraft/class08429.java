/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  jerozgen.languagereload.access.ITranslationStorage
 *  jerozgen.languagereload.config.Config
 *  minecraft.class01028
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class05447
 *  minecraft.class05936
 *  minecraft.class07018
 *  minecraft.class08244
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.LanguageMap
 *  net.irisshaders.iris.shaderpack.ShaderPack
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import jerozgen.languagereload.access.ITranslationStorage;
import jerozgen.languagereload.config.Config;
import minecraft.class01028;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class05447;
import minecraft.class05936;
import minecraft.class07018;
import minecraft.class08244;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.LanguageMap;
import net.irisshaders.iris.shaderpack.ShaderPack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08429
extends class07018
implements ITranslationStorage {
    private static Logger L = LoggerFactory.getLogger((String)"minecraft.class08429");
    public final Map<String, String> N;
    private final boolean u;
    private static final String i = "Lnet/minecraft/client/resources/language/ClientLanguage;loadFrom(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;)Lnet/minecraft/client/resources/language/ClientLanguage;";
    private static final List R = new ArrayList();
    private final Map M = Maps.newConcurrentMap();
    private static Map B;
    private Map Z;

    private String L(String string) {
        ShaderPack shaderPack = Iris.getCurrentPack().orElse(null);
        if (shaderPack == null) {
            return null;
        }
        LanguageMap languageMap = shaderPack.getLanguageMap();
        if (this.N.containsKey(string)) {
            return null;
        }
        for (String string2 : R) {
            String string3;
            Map map = languageMap.getTranslations(string2);
            if (map == null || (string3 = (String)map.get(string)) == null) continue;
            return string3;
        }
        return null;
    }

    private class08429(Map<String, String> map, boolean bl) {
        this.N = map;
        this.u = bl;
        this.N(map, bl, null);
    }

    private static void y(class01089 class010892, List list, boolean bl, CallbackInfoReturnable callbackInfoReturnable) {
        B = Maps.newHashMap();
    }

    private void N(String string, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.L(string) != null) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    void N(Map map, boolean bl, CallbackInfo callbackInfo) {
        this.Z = B;
        B = null;
    }

    private static void N(class08244 class082442, Map map, Operation operation) {
        operation.call(new Object[]{class082442, map});
        for (Map map2 : B.values()) {
            operation.call(new Object[]{class082442, map2});
        }
    }

    private static void N(InputStream inputStream, BiConsumer biConsumer, String string) {
        if (Config.getInstance().multilingualItemSearch) {
            class07018.N((InputStream)inputStream, biConsumer.andThen((string3, string4) -> ((Map)B.computeIfAbsent(string, string -> Maps.newHashMap())).put(string3, string4)));
        } else {
            class07018.N((InputStream)inputStream, (BiConsumer)biConsumer);
        }
    }

    public boolean N() {
        return this.u;
    }

    public boolean N(String string) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(string, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.N.containsKey(string);
    }

    public static class08429 N(class01089 class010892, List<String> list, boolean bl) {
        class08429.N(class010892, list, bl, null);
        class08429.y(class010892, list, bl, null);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string : list) {
            String string2 = String.format(Locale.ROOT, "lang/%s.json", string);
            for (String string3 : class010892.N()) {
                try {
                    class01894 class018942 = class01894.N((String)string3, (String)string2);
                    class08429.N(string, class010892.N(class018942), hashMap);
                }
                catch (Exception exception) {
                    L.warn("Skipped language file: {}:{} ({})", new Object[]{string3, string2, exception.toString()});
                }
            }
        }
        class08429.N(class08244.N(), hashMap, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_10117, java.util.Map]");
            ((class08244)objectArray[0]).N((Map)objectArray[1]);
            return null;
        });
        return new class08429(Map.copyOf(hashMap), bl);
    }

    public String N(String string, String string2) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(string, string2, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (String)callbackInfoReturnable.getReturnValue();
        }
        return this.N.getOrDefault(string, string2);
    }

    private static void N(String string, List<class01079> list, Map<String, String> map) {
        class08429.N(string, list, map, null);
        for (class01079 class010792 : list) {
            try {
                InputStream inputStream = class010792.method_14482();
                try {
                    class08429.N(inputStream, map::put, string);
                }
                finally {
                    if (inputStream == null) continue;
                    inputStream.close();
                }
            }
            catch (IOException iOException) {
                L.warn("Failed to load translations for {} from pack {}", new Object[]{string, class010792.method_14480(), iOException});
            }
        }
    }

    private void N(String string, String string2, CallbackInfoReturnable callbackInfoReturnable) {
        String string3 = this.L(string);
        if (string3 != null) {
            callbackInfoReturnable.setReturnValue((Object)string3);
        }
    }

    private static void N(class01089 class010892, List list, boolean bl, CallbackInfoReturnable callbackInfoReturnable) {
        R.clear();
        new LinkedList(list).descendingIterator().forEachRemaining(R::add);
    }

    private static void N(String string, List list, Map map, CallbackInfo callbackInfo) {
        String string2 = String.format(Locale.ROOT, "lang/%s.json", string);
        if (Iris.class.getResource("/assets/iris/" + string2) != null) {
            class07018.N((InputStream)Iris.class.getResourceAsStream("/assets/iris/" + string2), map::put);
        }
    }

    public class01028 N(class05936 class059362) {
        return class05447.N((class05936)class059362, (boolean)this.u);
    }

    public String languagereload_getTargetLanguage() {
        return (String)this.M.get(Thread.currentThread().threadId());
    }

    public String languagereload_get(String string) {
        String string2 = this.languagereload_getTargetLanguage();
        if (string2 != null) {
            Map map = (Map)this.Z.get(string2);
            return map == null ? "" : map.getOrDefault(string, "");
        }
        return this.y(string);
    }

    public void languagereload_setTargetLanguage(String string) {
        long l = Thread.currentThread().threadId();
        if (string == null) {
            this.M.remove(l);
        } else {
            this.M.put(l, string);
        }
    }
}

