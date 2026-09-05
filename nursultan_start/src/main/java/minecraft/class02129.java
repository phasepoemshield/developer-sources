/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.TelemetryEvent
 *  com.mojang.authlib.minecraft.TelemetryPropertyContainer
 *  com.mojang.authlib.minecraft.TelemetrySession
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  minecraft.class00392
 *  minecraft.class04199
 *  minecraft.class05216
 */
package minecraft;

import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetryPropertyContainer;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class02095;
import minecraft.class02108;
import minecraft.class02117;
import minecraft.class04199;
import minecraft.class05216;

public class class02129 {
    static final Map<String, class02129> N = new Object2ObjectLinkedOpenHashMap();
    public static final Codec<class02129> y = Codec.STRING.comapFlatMap(string -> {
        class02129 class021292 = N.get(string);
        if (class021292 != null) {
            return DataResult.success((Object)class021292);
        }
        return DataResult.error(() -> "No TelemetryEventType with key: '" + string + "'");
    }, class02129::N);
    private static final List<class02117<?>> Z = List.of(class02117.N, class02117.y, class02117.L, class02117.u, class02117.i, class02117.R, class02117.M, class02117.B, class02117.W, class02117.E);
    private static final List<class02117<?>> z = Stream.concat(Z.stream(), Stream.of(class02117.Z, class02117.z, class02117.U)).toList();
    public static final class02129 L = class02129.N("world_loaded", "WorldLoaded").N(z).N(class02117.m).N(class02117.P).y();
    public static final class02129 u = class02129.N("performance_metrics", "PerformanceMetrics").N(z).N(class02117.b).N(class02117.j).N(class02117.v).N(class02117.n).N(class02117.t).N(class02117.G).N().y();
    public static final class02129 i = class02129.N("world_load_times", "WorldLoadTimes").N(z).N(class02117.l).N(class02117.d).N().y();
    public static final class02129 R = class02129.N("world_unloaded", "WorldUnloaded").N(z).N(class02117.s).N(class02117.T).y();
    public static final class02129 M = class02129.N("advancement_made", "AdvancementMade").N(z).N(class02117.O).N(class02117.g).N().y();
    public static final class02129 B = class02129.N("game_load_times", "GameLoadTimes").N(Z).N(class02117.w).N(class02117.k).N(class02117.Y).N(class02117.Q).N().y();
    private final String U;
    private final String E;
    private final List<class02117<?>> W;
    private final boolean m;
    private final MapCodec<class04199> P;

    public MapCodec<class04199> L() {
        return this.P;
    }

    public static List<class02129> M() {
        return List.copyOf(N.values());
    }

    class02129(String string, String string2, List<class02117<?>> list, boolean bl) {
        this.U = string;
        this.E = string2;
        this.W = list;
        this.m = bl;
        this.P = class02108.N(list).xmap(class021082 -> new class04199(this, class021082), class04199::y);
    }

    public String toString() {
        return "TelemetryEventType[" + this.U + "]";
    }

    public class05216 i() {
        return this.N("title");
    }

    public boolean u() {
        return this.m;
    }

    public List<class02117<?>> y() {
        return this.W;
    }

    public static class02095 N(String string, String string2) {
        return new class02095(string, string2);
    }

    private class05216 N(String string) {
        return class00392.L((String)("telemetry.event." + this.U + "." + string));
    }

    public <T> boolean N(class02117<T> class021172) {
        return this.W.contains(class021172);
    }

    public TelemetryEvent N(TelemetrySession telemetrySession, class02108 class021082) {
        TelemetryEvent telemetryEvent = telemetrySession.createNewEvent(this.E);
        Iterator<class02117<?>> iterator = this.W.iterator();
        while (iterator.hasNext()) {
            iterator.next().N(class021082, (TelemetryPropertyContainer)telemetryEvent);
        }
        return telemetryEvent;
    }

    public String N() {
        return this.U;
    }

    public class05216 R() {
        return this.N("description");
    }
}

