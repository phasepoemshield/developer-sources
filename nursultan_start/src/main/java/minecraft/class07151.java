/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10420
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02063
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03711
 *  minecraft.class03753
 *  minecraft.class04247
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class04492
 *  minecraft.class05216
 *  minecraft.class06513
 *  minecraft.class06541
 *  minecraft.class06915
 *  minecraft.class07499
 */
package minecraft;

import Nursultan.class10420;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class02063;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03711;
import minecraft.class03753;
import minecraft.class04247;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class04492;
import minecraft.class05216;
import minecraft.class06513;
import minecraft.class06541;
import minecraft.class06915;
import minecraft.class07499;

public final class class07151
extends Record {
    private final Optional<class01894> parent;
    private final Optional<class06513> display;
    private final class07499 rewards;
    private final Map<String, class06915<?>> criteria;
    private final class03753 requirements;
    private final boolean sendsTelemetryEvent;
    private final Optional<class00392> name;
    private static final Codec<Map<String, class06915<?>>> z = Codec.unboundedMap((Codec)Codec.STRING, (Codec)class06915.N).validate(map -> map.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success((Object)map));
    public static final Codec<class07151> N = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.optionalFieldOf("parent").forGetter(class07151::y), (App)class06513.N.optionalFieldOf("display").forGetter(class07151::L), (App)class07499.N.optionalFieldOf("rewards", (Object)class07499.y).forGetter(class07151::u), (App)z.fieldOf("criteria").forGetter(class07151::i), (App)class03753.N.optionalFieldOf("requirements").forGetter(class071512 -> Optional.of(class071512.R())), (App)Codec.BOOL.optionalFieldOf("sends_telemetry_event", (Object)false).forGetter(class07151::M)).apply(instance, (optional, optional2, class074992, map, optional3, bl) -> {
        class03753 class037532 = optional3.orElseGet(() -> class03753.N(map.keySet()));
        return new class07151((Optional<class01894>)optional, (Optional<class06513>)optional2, (class07499)class074992, (Map<String, class06915<?>>)map, class037532, (boolean)bl);
    })).validate(class07151::N);
    public static final class02362<class04247, class07151> y = class02362.N_34(class07151::N, class07151::y);

    public Optional<class06513> L() {
        return this.display;
    }

    public boolean M() {
        return this.sendsTelemetryEvent;
    }

    public class07151(Optional<class01894> optional, Optional<class06513> optional2, class07499 class074992, Map<String, class06915<?>> map, class03753 class037532, boolean bl, Optional<class00392> optional3) {
        this.parent = optional;
        this.display = optional2;
        this.rewards = class074992;
        this.criteria = map;
        this.requirements = class037532;
        this.sendsTelemetryEvent = bl;
        this.name = optional3;
    }

    public class07151(Optional<class01894> optional, Optional<class06513> optional2, class07499 class074992, Map<String, class06915<?>> map, class03753 class037532, boolean bl) {
        this(optional, optional2, class074992, Map.copyOf(map), class037532, bl, optional2.map(class07151::N));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07151.class, "parent;display;rewards;criteria;requirements;sendsTelemetryEvent;name", "parent", "display", "rewards", "criteria", "requirements", "sendsTelemetryEvent", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07151.class, "parent;display;rewards;criteria;requirements;sendsTelemetryEvent;name", "parent", "display", "rewards", "criteria", "requirements", "sendsTelemetryEvent", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07151.class, "parent;display;rewards;criteria;requirements;sendsTelemetryEvent;name", "parent", "display", "rewards", "criteria", "requirements", "sendsTelemetryEvent", "name"}, this);
    }

    public Optional<class00392> B() {
        return this.name;
    }

    public Map<String, class06915<?>> i() {
        return this.criteria;
    }

    public class07499 u() {
        return this.rewards;
    }

    private static class07151 y(class04247 class042472) {
        return new class07151(class042472.y(class00667::T), (Optional)class06513.y.N_33(class02389::N).decode((Object)class042472), class07499.y, Map.of(), new class03753((class00667)class042472), class042472.readBoolean());
    }

    public Optional<class01894> y() {
        return this.parent;
    }

    private void N(class04247 class042472) {
        class042472.N_13(this.parent, class00667::N);
        class06513.y.N_33(class02389::N).encode((Object)class042472, this.display);
        this.requirements.N((class00667)class042472);
        class042472.writeBoolean(this.sendsTelemetryEvent);
    }

    private static class00392 N(class06513 class065132) {
        class00392 class003922 = class065132.N();
        class06541 class065412 = class065132.i().N();
        class05216 class052162 = class00390.N((class05216)class003922.L(), (class00405)class00405.N.N(class065412)).i("\n").y(class065132.y());
        return class00390.N((class00392)class003922.L().N(arg_0 -> class07151.N((class00392)class052162, arg_0))).N(class065412);
    }

    public static class00392 N(class03711 class037112) {
        return class037112.y().B().orElseGet(() -> class00392.y((String)class037112.N().toString()));
    }

    public void N(class04490 class044902, class02063 class020632) {
        this.criteria.forEach((string, class069152) -> {
            class04492 class044922 = new class04492(class044902.N_46((class04489)new class10420(string)), class020632);
            class069152.y().N(class044922);
        });
    }

    public boolean N() {
        return this.parent.isEmpty();
    }

    private static /* synthetic */ class00405 N(class00392 class003922, class00405 class004052) {
        return class004052.N((class00395)new class00401(class003922));
    }

    private static DataResult<class07151> N(class07151 class071512) {
        return class071512.R().N(class071512.i().keySet()).map(class037532 -> class071512);
    }

    public class03753 R() {
        return this.requirements;
    }
}

