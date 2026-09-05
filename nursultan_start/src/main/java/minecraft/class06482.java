/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10581
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00237
 *  minecraft.class00239
 *  minecraft.class00252
 *  minecraft.class00263
 *  minecraft.class00265
 *  minecraft.class00272
 *  minecraft.class00279
 *  minecraft.class00295
 *  minecraft.class00329
 *  minecraft.class01089
 *  minecraft.class01291
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02950
 *  minecraft.class03069
 *  minecraft.class03278
 *  minecraft.class03729
 *  minecraft.class03767
 *  minecraft.class04227
 *  minecraft.class04478
 *  minecraft.class04643
 *  minecraft.class05703
 *  minecraft.class05838
 *  minecraft.class05946
 *  minecraft.class05961
 *  minecraft.class06156
 *  minecraft.class06184
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06528
 *  minecraft.class06581
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.recipe.v1.FabricServerRecipeManager
 *  net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Server
 *  net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  net.fabricmc.fabric.mixin.recipe.sync.RecipeManagerAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10581;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00237;
import minecraft.class00239;
import minecraft.class00252;
import minecraft.class00263;
import minecraft.class00265;
import minecraft.class00272;
import minecraft.class00279;
import minecraft.class00295;
import minecraft.class00329;
import minecraft.class01089;
import minecraft.class01291;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02950;
import minecraft.class03069;
import minecraft.class03278;
import minecraft.class03729;
import minecraft.class03767;
import minecraft.class04227;
import minecraft.class04478;
import minecraft.class04643;
import minecraft.class05703;
import minecraft.class05838;
import minecraft.class05946;
import minecraft.class05961;
import minecraft.class06156;
import minecraft.class06184;
import minecraft.class06484;
import minecraft.class06485;
import minecraft.class06500;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06528;
import minecraft.class06581;
import minecraft.class07299;
import net.fabricmc.fabric.api.recipe.v1.FabricServerRecipeManager;
import net.fabricmc.fabric.api.recipe.v1.sync.SynchronizedRecipes;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.recipe.sync.SynchronizedRecipesImpl;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.fabricmc.fabric.mixin.recipe.sync.RecipeManagerAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06482
extends class01291<class00237>
implements class00272,
FabricServerRecipeManager,
FabricResourceReloader,
RecipeManagerAccessor {
    private static final Logger N = LogUtils.getLogger();
    private static final Map<class05946<class00263>, class06528> y = Map.of(class00263.u, class065212 -> class065212 instanceof class03278 ? ((class03278)class065212).B() : Optional.empty(), class00263.y, class065212 -> class065212 instanceof class03278 ? Optional.of(((class03278)class065212).M()) : Optional.empty(), class00263.L, class065212 -> class065212 instanceof class03278 ? ((class03278)class065212).R() : Optional.empty(), class00263.i, class06482.y((class05838<? extends class06184>)class05838.y), class00263.R, class06482.y((class05838<? extends class06184>)class05838.L), class00263.M, class06482.y((class05838<? extends class06184>)class05838.u), class00263.B, class06482.y((class05838<? extends class06184>)class05838.i));
    private static final class03069 L = class03069.N((class05946)class04227.yV);
    private final class01929 u;
    private class00237 i;
    private Map<class05946<class00263>, class00263> R;
    private class00279<class06156> M;
    private List<class06484> B;
    private Map<class05946<class06521<?>>, List<class06484>> Z;
    private SynchronizedRecipes z = SynchronizedRecipesImpl.EMPTY;
    private class01894 U;

    public class00279<class06156> L() {
        return this.M;
    }

    public class06482(class01929 class019292) {
        this.i = class00237.N;
        this.R = Map.of();
        this.M = class00279.N();
        this.B = List.of();
        this.Z = Map.of();
        this.u = class019292;
    }

    public Collection<class03729<?>> u() {
        return this.i.N();
    }

    private static class06528 y(class05838<? extends class06184> class058382) {
        return class065212 -> class065212.u() == class058382 && class065212 instanceof class06184 ? Optional.of(((class06184)class065212).z()) : Optional.empty();
    }

    public Map<class05946<class00263>, class00263> y() {
        return this.R;
    }

    public Optional<class03729<?>> y(class05946<class06521<?>> class059462) {
        return Optional.ofNullable(this.i.N(class059462));
    }

    static List<class06510> N(class03767 class037672, List<class06510> list) {
        list.removeIf(class065102 -> !class06482.N(class037672, class065102));
        return list;
    }

    public void N(class03767 class037672) {
        ArrayList arrayList = new ArrayList();
        List list = y.entrySet().stream().map(entry -> new class06500((class05946<class00263>)((class05946)entry.getKey()), (class06528)entry.getValue())).toList();
        this.i.N().forEach(class037292 -> {
            class06521 class065212 = class037292.y();
            if (!class065212.method_8118() && class065212.method_61671().L()) {
                N.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", (Object)class037292.N().N());
                return;
            }
            list.forEach(class065002 -> class065002.accept(class065212));
            if (class065212 instanceof class06156) {
                class06156 class061562 = (class06156)class065212;
                class03729 class037293 = class037292;
                if (class06482.N(class037672, class061562.z()) && class061562.R().N(class037672)) {
                    arrayList.add(new class00252(class061562.z(), new class00239(class061562.R(), Optional.of(class037293))));
                }
            }
        });
        this.R = list.stream().collect(Collectors.toUnmodifiableMap(class065002 -> class065002.N, class065002 -> class065002.N(class037672)));
        this.M = new class00279(arrayList);
        this.B = class06482.N(this.i.N(), class037672);
        this.Z = this.B.stream().collect(Collectors.groupingBy(class064842 -> class064842.y().N(), IdentityHashMap::new, Collectors.toList()));
    }

    protected void N(class00237 class002372, class01089 class010892, class04643 class046432) {
        this.N(class002372, class010892, class046432, null);
        this.i = class002372;
        N.info("Loaded {} recipes", (Object)class002372.N().size());
    }

    protected class00237 y(class01089 class010892, class04643 class046432) {
        TreeMap<class01894, class06521> treeMap = new TreeMap<class01894, class06521>();
        class05703.N((class01089)class010892, (class03069)L, (DynamicOps)this.u.N((DynamicOps)JsonOps.INSTANCE), (Codec)class06521.R, treeMap);
        ArrayList arrayList = new ArrayList(treeMap.size());
        treeMap.forEach((class018942, class065212) -> {
            class05946 class059462 = class05946.N((class05946)class04227.yV, (class01894)class018942);
            class03729 class037292 = new class03729(class059462, class065212);
            arrayList.add(class037292);
        });
        return class00237.N(arrayList);
    }

    private void N(class00237 class002372, class01089 class010892, class04643 class046432, CallbackInfo callbackInfo) {
        this.z = new SynchronizedRecipesImpl(class002372);
    }

    public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> N(class05838<T> class058382, I i, class07299 class072992, @Nullable class03729<T> class037292) {
        if (class037292 != null && class037292.y().method_8115(i, class072992)) {
            return Optional.of(class037292);
        }
        return this.N(class058382, i, class072992);
    }

    public @Nullable class06484 N(class00329 class003292) {
        int n = class003292.N();
        return n >= 0 && n < this.B.size() ? this.B.get(n) : null;
    }

    public void N(class05946<class06521<?>> class059462, Consumer<class00295> consumer) {
        List<class06484> var3 = this.Z.get(class059462);
        if (var3 != null) {
            var3.forEach(class064842 -> consumer.accept(class064842.N()));
        }
    }

    protected static class03729<?> N(class05946<class06521<?>> class059462, JsonObject jsonObject, class01929 class019292) {
        class06521 var3 = (class06521)class06521.R.parse((DynamicOps)class019292.N((DynamicOps)JsonOps.INSTANCE), (Object)jsonObject).getOrThrow(JsonParseException::new);
        return new class03729(class059462, var3);
    }

    private <T extends class06521<?>> @Nullable class03729<T> N(class05838<T> class058382, class05946<class06521<?>> class059462) {
        class03729 var3 = this.i.N(class059462);
        if (var3 != null && var3.y().u().equals(class058382)) {
            return var3;
        }
        return null;
    }

    public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> N(class05838<T> class058382, I i, class07299 class072992) {
        return this.i.N(class058382, i, class072992).findFirst();
    }

    public class00263 N(class05946<class00263> class059462) {
        return this.R.getOrDefault(class059462, class00263.z);
    }

    public class00279<class06156> N() {
        return this.M;
    }

    private static boolean N(class03767 class037672, class06510 class065102) {
        return class065102.method_8105().allMatch(class035562 -> ((class06581)class035562.N()).N(class037672));
    }

    private static /* synthetic */ int N(Object2IntMap object2IntMap, Object object) {
        return object2IntMap.size();
    }

    public static <I extends class02950, T extends class06521<I>> class06485<I, T> N(class05838<T> class058382) {
        return new class10581(class058382);
    }

    private static List<class06484> N(Iterable<class03729<?>> iterable, class03767 class037672) {
        ArrayList<class06484> arrayList = new ArrayList<class06484>();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (class03729<?> class037292 : iterable) {
            Optional<List> var8;
            class06521 class065212 = class037292.y();
            OptionalInt optionalInt = class065212.y().isEmpty() ? OptionalInt.empty() : OptionalInt.of(object2IntOpenHashMap.computeIfAbsent((Object)class065212.y(), arg_0 -> class06482.N((Object2IntMap)object2IntOpenHashMap, arg_0)));
            if (class065212.method_8118()) {
                Optional optional = Optional.empty();
            } else {
                var8 = Optional.of(class065212.method_61671().y());
            }
            for (class00265 class002652 : class065212.N()) {
                if (!class002652.N(class037672)) continue;
                int n = arrayList.size();
                class00329 class003292 = new class00329(n);
                class00295 class002952 = new class00295(class003292, class002652, optionalInt, class065212.i(), var8);
                arrayList.add(new class06484(class002952, class037292));
            }
        }
        return arrayList;
    }

    public <I extends class02950, T extends class06521<I>> Optional<class03729<T>> N(class05838<T> class058382, I i, class07299 class072992, @Nullable class05946<class06521<?>> class059462) {
        class03729<T> class037292 = class059462 != null ? this.N(class058382, class059462) : null;
        return this.N(class058382, i, class072992, class037292);
    }

    public class01894 fabric$getId() {
        if (this.U == null) {
            class06482 var1 = this;
            this.U = var1 instanceof class06482 ? ResourceReloaderKeys.Server.RECIPES : (var1 instanceof class04478 ? ResourceReloaderKeys.Server.ADVANCEMENTS : (var1 instanceof class05961 ? ResourceReloaderKeys.Server.FUNCTIONS : class01894.y((String)("private/" + ((Object)((Object)var1)).getClass().getSimpleName().toLowerCase(Locale.ROOT)))));
        }
        return this.U;
    }

    public Collection getAllOfType(class05838 class058382) {
        return this.i.N(class058382);
    }

    public Stream getAllMatches(class05838 class058382, class02950 class029502, class07299 class072992) {
        return this.i.N(class058382, class029502, class072992);
    }

    public SynchronizedRecipes getSynchronizedRecipes() {
        return this.z;
    }

    public /* synthetic */ class00237 getPreparedRecipes() {
        return this.i;
    }
}

