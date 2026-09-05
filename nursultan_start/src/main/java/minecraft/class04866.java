/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09413
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  minecraft.class00183
 *  minecraft.class00935
 *  minecraft.class00951
 *  minecraft.class01073
 *  minecraft.class01079
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class01590
 *  minecraft.class01621
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02263
 *  minecraft.class02306
 *  minecraft.class02416
 *  minecraft.class03069
 *  minecraft.class03495
 *  minecraft.class03511
 *  minecraft.class03579
 *  minecraft.class04643
 *  minecraft.class04690
 *  minecraft.class05630
 *  minecraft.class06176
 *  minecraft.class06202
 *  minecraft.class06246
 *  minecraft.class06251
 *  minecraft.class06254
 *  minecraft.class06261
 *  minecraft.class06262
 *  minecraft.class06615
 *  minecraft.class07536
 *  minecraft.class07949
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08700
 *  minecraft.class08718
 *  minecraft.class08985
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09413;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class00183;
import minecraft.class00935;
import minecraft.class00951;
import minecraft.class01073;
import minecraft.class01079;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01590;
import minecraft.class01621;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02263;
import minecraft.class02306;
import minecraft.class02416;
import minecraft.class03069;
import minecraft.class03495;
import minecraft.class03511;
import minecraft.class03579;
import minecraft.class04643;
import minecraft.class04690;
import minecraft.class04841;
import minecraft.class04843;
import minecraft.class04859;
import minecraft.class04862;
import minecraft.class04864;
import minecraft.class04879;
import minecraft.class04886;
import minecraft.class05630;
import minecraft.class06176;
import minecraft.class06202;
import minecraft.class06246;
import minecraft.class06251;
import minecraft.class06254;
import minecraft.class06261;
import minecraft.class06262;
import minecraft.class06615;
import minecraft.class07536;
import minecraft.class07949;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08700;
import minecraft.class08718;
import minecraft.class08985;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.slf4j.Logger;

@Environment(value=EnvType.CLIENT)
public class class04866
implements class01081,
AutoCloseable,
FabricResourceReloader {
    static final Logger N = LogUtils.getLogger();
    private static final String R = "fonts.json";
    public static final class01894 y = class01894.y((String)"missing");
    private static final class03069 M = class03069.N((String)"font");
    private static final Gson B = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    final class04864 L;
    private final List<class06262> Z = new ArrayList<class06262>();
    public final Map<class01894, class04864> u = new HashMap<class01894, class04864>();
    private final class08627 z;
    private final class04879 U = new class04879(this, false);
    private final class04879 E = new class04879(this, true);
    private final class08117 W;
    private final Map<class01894, class00935> m = new HashMap<class01894, class00935>();
    final class06615 i;
    private class01894 P;

    private static class06251 L() {
        return new class06251((class06262)new class04862(), class02263.y);
    }

    public class04866(class08627 class086272, class08117 class081172, class07949 class079492) {
        this.z = class086272;
        this.W = class081172;
        this.L = this.N(y, List.of(class04866.L()), Set.of());
        this.i = new class06615(class079492);
    }

    @Override
    public void close() {
        this.U.close();
        this.E.close();
        this.u.values().forEach(class04864::close);
        this.Z.forEach(class06262::close);
        this.L.close();
    }

    public class01590 y() {
        return new class01590((class01621)this.E);
    }

    private static Set<class02306> y(class05630 class056302) {
        EnumSet<class02306> enumSet = EnumSet.noneOf(class02306.class);
        if (((Boolean)class056302.NL().method_41753()).booleanValue()) {
            enumSet.add(class02306.field_49112);
        }
        if (((Boolean)class056302.Nu().method_41753()).booleanValue()) {
            enumSet.add(class02306.field_49113);
        }
        return enumSet;
    }

    private Map<class01894, List<class06251>> N(List<class04859> list) {
        HashMap<class01894, List<class06251>> hashMap = new HashMap<class01894, List<class06251>>();
        class03495 class034952 = new class03495();
        list.forEach(class048592 -> class034952.N((Object)class048592.N(), (class03511)class048592));
        class034952.N((class018942, class048592) -> class048592.N(hashMap::get).ifPresent(list -> hashMap.put((class01894)class018942, (List<class06251>)list)));
        return hashMap;
    }

    private void N(List<class06251> list, class06251 class062512) {
        list.add(0, class062512);
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
        for (class06251 class062513 : list) {
            intOpenHashSet.addAll((IntCollection)class062513.N().N());
        }
        intOpenHashSet.forEach(n -> {
            if (n == 32) {
                return;
            }
            Iterator iterator = Lists.reverse((List)list).iterator();
            while (iterator.hasNext() && ((class06251)iterator.next()).N().N(n) == null) {
            }
        });
    }

    private void N(class04843 class048432, class04643 class046432) {
        class046432.N("closing");
        this.U.y();
        this.E.y();
        this.u.values().forEach(class04864::close);
        this.u.clear();
        this.Z.forEach(class06262::close);
        this.Z.clear();
        Set<class02306> set = class04866.y((class05630)class06202.Nq().i_7);
        class046432.y("reloading");
        class048432.N().forEach((class018942, list) -> this.u.put((class01894)class018942, this.N((class01894)class018942, Lists.reverse((List)list), set)));
        this.Z.addAll(class048432.y());
        class046432.L();
        if (!this.u.containsKey((class01894)class06202.j_3)) {
            throw new IllegalStateException("Default font failed to load");
        }
        this.m.clear();
        this.W.N((class018942, class086262) -> this.m.put((class01894)class018942, new class00935(class086262)));
    }

    public void N(class05630 class056302) {
        Set<class02306> set = class04866.y(class056302);
        Iterator<class04864> iterator = this.u.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().N(set);
        }
    }

    private CompletableFuture<Optional<class06262>> N(class04841 class048412, class06246 class062462, class01089 class010892, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return Optional.of(class062462.load(class010892));
            }
            catch (Exception exception) {
                N.warn("Failed to load builder {}, rejecting", (Object)class048412, (Object)exception);
                return Optional.empty();
            }
        }, executor);
    }

    private CompletableFuture<class04843> N(class01089 class010892, Executor executor) {
        ArrayList<CompletableFuture<Object>> arrayList = new ArrayList<CompletableFuture<Object>>();
        for (Map.Entry entry : M.y(class010892).entrySet()) {
            class01894 class018942 = M.y((class01894)entry.getKey());
            arrayList.add(CompletableFuture.supplyAsync(() -> {
                List<Pair<class04841, class06261>> list = class04866.N((List<class01079>)((List)entry.getValue()), class018942);
                class04859 class048592 = new class04859(class018942);
                for (Pair<class04841, class06261> pair : list) {
                    class04841 class048412 = (class04841)((Object)((Object)pair.getFirst()));
                    class02263 class022632 = ((class06261)pair.getSecond()).y();
                    ((class06261)pair.getSecond()).N().y().ifLeft(class062462 -> {
                        CompletableFuture<Optional<class06262>> completableFuture = this.N(class048412, (class06246)class062462, class010892, executor);
                        class048592.N(class048412, class022632, completableFuture);
                    }).ifRight(class062542 -> class048592.N(class048412, class022632, (class06254)class062542));
                }
                return class048592;
            }, executor));
        }
        return class07536.L(arrayList).thenCompose(list -> {
            List list2 = (List)list.stream().flatMap(class04859::u).collect(class07536.y());
            class06251 class062512 = class04866.L();
            list2.add(CompletableFuture.completedFuture(Optional.of(class062512.N())));
            return class07536.L((List)list2).thenCompose(list3 -> {
                Map<class01894, List<class06251>> map = this.N((List<class04859>)list);
                return CompletableFuture.allOf((CompletableFuture[])map.values().stream().map(list -> CompletableFuture.runAsync(() -> this.N((List<class06251>)list, class062512), executor)).toArray(CompletableFuture[]::new)).thenApply(void_ -> {
                    List list2 = list3.stream().flatMap(Optional::stream).toList();
                    return new class04843(map, list2);
                });
            });
        });
    }

    private class04864 N(class01894 class018942, List<class06251> list, Set<class02306> set) {
        class04690 class046902 = new class04690(this.z, class018942);
        class04864 class048642 = new class04864(class046902);
        class048642.N(list, set);
        return class048642;
    }

    class08985 N(class09413 class094132) {
        class00935 class009352 = this.m.get(class094132.N());
        if (class009352 == null) {
            return this.L.N(false);
        }
        return class009352.N(class094132.y());
    }

    class04864 N(class01894 class018942) {
        return this.u.getOrDefault(class018942, this.L);
    }

    public class01590 N() {
        return new class01590((class01621)this.U);
    }

    private static List<Pair<class04841, class06261>> N(List<class01079> list, class01894 class018942) {
        ArrayList<Pair<class04841, class06261>> arrayList = new ArrayList<Pair<class04841, class06261>>();
        for (class01079 class010792 : list) {
            try {
                BufferedReader bufferedReader = class010792.method_43039();
                try {
                    JsonElement jsonElement = (JsonElement)B.fromJson((Reader)bufferedReader, JsonElement.class);
                    class04886 class048862 = (class04886)((Object)class04886.y.parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow(JsonParseException::new));
                    List<class06261> list2 = class048862.N();
                    for (int i = list2.size() - 1; i >= 0; --i) {
                        class04841 class048412 = new class04841(class018942, class010792.method_14480(), i);
                        arrayList.add((Pair<class04841, class06261>)Pair.of((Object)((Object)class048412), (Object)list2.get(i)));
                    }
                }
                finally {
                    if (bufferedReader == null) continue;
                    ((Reader)bufferedReader).close();
                }
            }
            catch (Exception exception) {
                N.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{class018942, R, class010792.method_14480(), exception});
            }
        }
        return arrayList;
    }

    public class01894 fabric$getId() {
        if (this.P == null) {
            class04866 class048662 = this;
            this.P = class048662 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class048662 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class048662 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class048662 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class048662 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class048662 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class048662 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class048662 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class048662 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class048662 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class048662 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class048662 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class048662 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class048662 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class048662 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class048662 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class048662 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class048662 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + class048662.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.P;
    }

    public CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        return ((CompletableFuture)this.N(class010732.N(), executor).thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenAcceptAsync(class048432 -> this.N((class04843)((Object)class048432), class08700.N()), executor2);
    }
}

