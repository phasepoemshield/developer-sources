/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.math.LongMath
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2BooleanFunction
 *  minecraft.class00183
 *  minecraft.class00951
 *  minecraft.class01089
 *  minecraft.class01291
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class04643
 *  minecraft.class04866
 *  minecraft.class06176
 *  minecraft.class07536
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08326
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.math.LongMath;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunction;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import minecraft.class00183;
import minecraft.class00951;
import minecraft.class01089;
import minecraft.class01291;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class03540;
import minecraft.class03547;
import minecraft.class03579;
import minecraft.class04643;
import minecraft.class04866;
import minecraft.class06176;
import minecraft.class07536;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08326;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class class03520
extends class01291<Map<String, List<class03547>>>
implements AutoCloseable,
FabricResourceReloader {
    private static final Codec<Map<String, List<class03547>>> N;
    private static Logger y;
    private final class01894 L;
    private final Object2BooleanFunction<String> u;
    private @Nullable Timer i;
    private @Nullable class03540 R;
    private class01894 M;

    public class03520(class01894 class018942, Object2BooleanFunction<String> object2BooleanFunction) {
        this.L = class018942;
        this.u = object2BooleanFunction;
    }

    static {
        y = LoggerFactory.getLogger((String)"minecraft.class03520");
        N = Codec.unboundedMap((Codec)Codec.STRING, (Codec)RecordCodecBuilder.create(instance -> instance.group((App)Codec.LONG.optionalFieldOf("delay", (Object)0L).forGetter(class03547::N), (App)Codec.LONG.fieldOf("period").forGetter(class03547::y), (App)Codec.STRING.fieldOf("title").forGetter(class03547::L), (App)Codec.STRING.fieldOf("message").forGetter(class03547::u)).apply(instance, class03547::new)).listOf());
    }

    @Override
    public void close() {
        this.N();
    }

    protected void N(Map<String, List<class03547>> map, class01089 class010892, class04643 class046432) {
        List<class03547> list = map.entrySet().stream().filter(entry -> (Boolean)this.u.apply((Object)((String)entry.getKey()))).map(Map.Entry::getValue).flatMap(Collection::stream).collect(Collectors.toList());
        if (list.isEmpty()) {
            this.N();
            return;
        }
        if (list.stream().anyMatch(class035472 -> class035472.y() == 0L)) {
            class07536.y((String)("A periodic notification in " + String.valueOf(this.L) + " has a period of zero minutes"));
            this.N();
            return;
        }
        long l = this.N(list);
        long l2 = this.N(list, l);
        if (this.i == null) {
            this.i = new Timer();
        }
        this.R = this.R == null ? new class03540(list, l, l2) : this.R.N(list, l2);
        this.i.scheduleAtFixedRate((TimerTask)this.R, TimeUnit.MINUTES.toMillis(l), TimeUnit.MINUTES.toMillis(l2));
    }

    protected Map<String, List<class03547>> y(class01089 class010892, class04643 class046432) {
        Map map;
        block8: {
            BufferedReader bufferedReader = class010892.i(this.L);
            try {
                map = (Map)N.parse((DynamicOps)JsonOps.INSTANCE, (Object)class08326.N((Reader)bufferedReader)).result().orElseThrow();
                if (bufferedReader == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (bufferedReader != null) {
                        try {
                            ((Reader)bufferedReader).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    y.warn("Failed to load {}", (Object)this.L, (Object)exception);
                    return ImmutableMap.of();
                }
            }
            ((Reader)bufferedReader).close();
        }
        return map;
    }

    private long N(List<class03547> list) {
        return list.stream().mapToLong(class035472 -> class035472.N()).min().orElse(0L);
    }

    private long N(List<class03547> list, long l) {
        return list.stream().mapToLong(class035472 -> LongMath.gcd((long)(class035472.N() - l), (long)class035472.y())).reduce(LongMath::gcd).orElseThrow(() -> new IllegalStateException("Empty notifications from: " + String.valueOf(this.L)));
    }

    private void N() {
        if (this.i != null) {
            this.i.cancel();
        }
    }

    public class01894 fabric$getId() {
        if (this.M == null) {
            class03520 class035202 = this;
            this.M = class035202 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class035202 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class035202 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class035202 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class035202 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class035202 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class035202 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class035202 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class035202 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class035202 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class035202 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class035202 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class035202 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class035202 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class035202 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class035202 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class035202 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class035202 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + class035202.getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.M;
    }
}

