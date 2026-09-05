/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01062
 *  minecraft.class01709
 *  minecraft.class01894
 *  minecraft.class02100
 *  minecraft.class04206
 *  minecraft.class04478
 *  minecraft.class04770
 *  minecraft.class05715
 *  minecraft.class06290
 *  minecraft.class06516
 *  minecraft.class06562
 *  minecraft.class06583
 *  minecraft.class06588
 *  minecraft.class06674
 *  minecraft.class06915
 *  minecraft.class07151
 *  minecraft.class07166
 *  minecraft.class07305
 *  minecraft.class08019
 *  minecraft.class08077
 *  minecraft.class08326
 *  net.fabricmc.fabric.api.entity.FakePlayer
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01062;
import minecraft.class01709;
import minecraft.class01894;
import minecraft.class02100;
import minecraft.class03711;
import minecraft.class03734;
import minecraft.class04206;
import minecraft.class04478;
import minecraft.class04770;
import minecraft.class05715;
import minecraft.class06290;
import minecraft.class06516;
import minecraft.class06562;
import minecraft.class06583;
import minecraft.class06588;
import minecraft.class06674;
import minecraft.class06915;
import minecraft.class07151;
import minecraft.class07166;
import minecraft.class07305;
import minecraft.class08019;
import minecraft.class08077;
import minecraft.class08326;
import net.fabricmc.fabric.api.entity.FakePlayer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03704 {
    private static final Logger N = LogUtils.getLogger();
    private static final Gson y = new GsonBuilder().setPrettyPrinting().create();
    private final class01062 L;
    private final Path u;
    private class07166 i;
    private final Map<class03711, class08019> R = new LinkedHashMap<class03711, class08019>();
    private final Set<class03711> M = new HashSet<class03711>();
    private final Set<class03711> B = new HashSet<class03711>();
    private final Set<class03734> Z = new HashSet<class03734>();
    private class04770 z;
    private @Nullable class03711 U;
    private boolean E = true;
    private final Codec<class01709> W;

    private class01709 L() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.R.forEach((class037112, class080192) -> {
            if (class080192.y()) {
                linkedHashMap.put(class037112.N(), class080192);
            }
        });
        return new class01709(linkedHashMap);
    }

    private void L(class04478 class044782) {
        for (class03711 class037112 : class044782.y()) {
            class07151 class071512 = class037112.y();
            if (!class071512.i().isEmpty()) continue;
            this.N(class037112, "");
            class071512.u().N(this.z);
        }
    }

    private void L(class03711 class037112) {
        class03734 class037342 = this.i.N(class037112);
        if (class037342 != null) {
            this.Z.add(class037342.u());
        }
    }

    public class03704(DataFixer dataFixer, class01062 class010622, class04478 class044782, Path path, class04770 class047702) {
        this.L = class010622;
        this.u = path;
        this.z = class047702;
        this.i = class044782.N();
        int n = 1343;
        this.W = class05715.field_19220.N(class01709.N, dataFixer, 1343);
        this.u(class044782);
    }

    private void i(class03711 class037112) {
        class08019 class080192 = this.y(class037112);
        for (Map.Entry entry : class037112.y().i().entrySet()) {
            class06562 class065622 = class080192.L((String)entry.getKey());
            if (class065622 == null || !class065622.N() && !class080192.N()) continue;
            this.y(class037112, (String)entry.getKey(), (class06915)entry.getValue());
        }
    }

    private void u(class03711 class037112) {
        class08019 class080192 = this.y(class037112);
        if (class080192.N()) {
            return;
        }
        for (Map.Entry entry : class037112.y().i().entrySet()) {
            class06562 class065622 = class080192.L((String)entry.getKey());
            if (class065622 == null || class065622.N()) continue;
            this.N(class037112, (String)entry.getKey(), (class06915)entry.getValue());
        }
    }

    private void u(class04478 class044782) {
        if (Files.isRegularFile(this.u, new LinkOption[0])) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(this.u, StandardCharsets.UTF_8);){
                JsonElement jsonElement = class08326.N((Reader)bufferedReader);
                class01709 class017092 = (class01709)this.W.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow(JsonParseException::new);
                this.N(class044782, class017092);
            }
            catch (JsonIOException | IOException throwable) {
                N.error("Couldn't access player advancements in {}", (Object)this.u, (Object)throwable);
            }
            catch (JsonParseException jsonParseException) {
                N.error("Couldn't parse player advancements in {}", (Object)this.u, (Object)jsonParseException);
            }
        }
        this.L(class044782);
        this.y(class044782);
    }

    public boolean y(class03711 class037112, String string) {
        boolean bl = false;
        class08019 class080192 = this.y(class037112);
        boolean bl2 = class080192.N();
        if (class080192.y(string)) {
            this.u(class037112);
            this.B.add(class037112);
            bl = true;
        }
        if (bl2 && !class080192.N()) {
            this.L(class037112);
        }
        return bl;
    }

    public class08019 y(class03711 class037112) {
        class08019 class080192 = this.R.get((Object)class037112);
        if (class080192 == null) {
            class080192 = new class08019();
            this.N(class037112, class080192);
        }
        return class080192;
    }

    private <T extends class06516> void y(class03711 class037112, String string, class06915<T> class069152) {
        class069152.N().y(this, new class06588(class069152.y(), class037112, string));
    }

    public void y() {
        JsonElement jsonElement = (JsonElement)this.W.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)this.L()).getOrThrow();
        try {
            class06290.L((Path)this.u.getParent());
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(this.u, StandardCharsets.UTF_8, new OpenOption[0]);){
                y.toJson(jsonElement, y.newJsonWriter((Writer)bufferedWriter));
            }
        }
        catch (JsonIOException | IOException throwable) {
            N.error("Couldn't save player advancements to {}", (Object)this.u, (Object)throwable);
        }
    }

    private void y(class04478 class044782) {
        for (class03711 class037112 : class044782.y()) {
            this.u(class037112);
        }
    }

    private void N(class03734 class037343, Set<class03711> set, Set<class01894> set2) {
        class02100.N((class03734)class037343, (T class037342) -> this.y(class037342.y()).N(), (class037342, bl) -> {
            class03711 class037112 = class037342.y();
            if (bl) {
                if (this.M.add(class037112)) {
                    set.add(class037112);
                    if (this.R.containsKey((Object)class037112)) {
                        this.B.add(class037112);
                    }
                }
            } else if (this.M.remove((Object)class037112)) {
                set2.add(class037112.N());
            }
        });
    }

    void N(class03711 class037112, String string, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.z instanceof FakePlayer) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    void N(class04770 class047702, CallbackInfo callbackInfo) {
        if (class047702 instanceof FakePlayer) {
            callbackInfo.cancel();
        }
    }

    public void N(class04770 class047702) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class047702, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.z = class047702;
    }

    private <T extends class06516> void N(class03711 class037112, String string, class06915<T> class069152) {
        class069152.N().N(this, new class06588(class069152.y(), class037112, string));
    }

    public void N(class04478 class044782) {
        this.N();
        this.R.clear();
        this.M.clear();
        this.Z.clear();
        this.B.clear();
        this.E = true;
        this.U = null;
        this.i = class044782.N();
        this.u(class044782);
    }

    public boolean N(class03711 class037112, String string) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class037112, string, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        boolean bl = false;
        class08019 class080192 = this.y(class037112);
        boolean bl2 = class080192.N();
        if (class080192.N(string)) {
            this.i(class037112);
            this.B.add(class037112);
            bl = true;
            if (!bl2 && class080192.N()) {
                class037112.y().u().N(this.z);
                class037112.y().L().ifPresent(class065132 -> {
                    if (class065132.Z() && ((Boolean)this.z.method_51469().method_64395().N(class07305.A)).booleanValue()) {
                        this.L.N((class00392)class065132.i().N(class037112, this.z), false);
                    }
                });
            }
        }
        if (!bl2 && class080192.N()) {
            this.L(class037112);
        }
        return bl;
    }

    private void N(class04478 class044782, class01709 class017092) {
        class017092.N((class018942, class080192) -> {
            class03711 class037112 = class044782.N(class018942);
            if (class037112 == null) {
                N.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", class018942, (Object)this.u);
                return;
            }
            this.N(class037112, (class08019)class080192);
            this.B.add(class037112);
            this.L(class037112);
        });
    }

    private void N(class03711 class037112, class08019 class080192) {
        class080192.N(class037112.y().R());
        this.R.put(class037112, class080192);
    }

    public void N(@Nullable class03711 class037112) {
        class03711 class037113 = this.U;
        this.U = class037112 != null && class037112.y().N() && class037112.y().L().isPresent() ? class037112 : null;
        if (class037113 != this.U) {
            this.z.field_13987.method_14364((class00381)new class06674(this.U == null ? null : this.U.N()));
        }
    }

    public void N(class04770 class047702, boolean bl) {
        if (this.E || !this.Z.isEmpty() || !this.B.isEmpty()) {
            HashMap<class01894, class08019> hashMap = new HashMap<class01894, class08019>();
            HashSet<class03711> hashSet = new HashSet<class03711>();
            HashSet<class01894> hashSet2 = new HashSet<class01894>();
            for (class03734 object : this.Z) {
                this.N(object, hashSet, hashSet2);
            }
            this.Z.clear();
            for (class03711 class037112 : this.B) {
                if (!this.M.contains((Object)class037112)) continue;
                hashMap.put(class037112.N(), this.R.get((Object)class037112));
            }
            this.B.clear();
            if (!(hashMap.isEmpty() && hashSet.isEmpty() && hashSet2.isEmpty())) {
                class047702.field_13987.method_14364((class00381)new class08077(this.E, hashSet, hashSet2, hashMap, bl));
            }
        }
        this.E = false;
    }

    public void N() {
        Iterator var1 = class04206.NU.iterator();
        while (var1.hasNext()) {
            ((class06583)var1.next()).N(this);
        }
    }
}

