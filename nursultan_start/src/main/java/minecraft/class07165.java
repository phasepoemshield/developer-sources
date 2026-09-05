/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03711
 *  minecraft.class03741
 *  minecraft.class03753
 *  minecraft.class06513
 *  minecraft.class06584
 *  minecraft.class06915
 *  minecraft.class06953
 *  minecraft.class07296
 *  minecraft.class07310
 *  minecraft.class07499
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10758;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03711;
import minecraft.class03741;
import minecraft.class03753;
import minecraft.class06513;
import minecraft.class06584;
import minecraft.class06915;
import minecraft.class06953;
import minecraft.class07151;
import minecraft.class07296;
import minecraft.class07310;
import minecraft.class07499;
import org.jspecify.annotations.Nullable;

public class class07165 {
    private Optional<class01894> N = Optional.empty();
    private Optional<class06513> y = Optional.empty();
    private class07499 L = class07499.y;
    private final ImmutableMap.Builder<String, class06915<?>> u = ImmutableMap.builder();
    private Optional<class03753> i = Optional.empty();
    private class03741 R = class03741.N;
    private boolean M;

    public class07165 L() {
        this.M = true;
        return this;
    }

    public class03711 y(class01894 class018942) {
        ImmutableMap var2 = this.u.buildOrThrow();
        class03753 class037532 = this.i.orElseGet(() -> this.N((Map)var2));
        return new class03711(class018942, new class07151(this.N, this.y, this.L, (Map<String, class06915<?>>)var2, class037532, this.M));
    }

    public static class07165 y() {
        return new class07165();
    }

    public class07165 N(class03741 class037412) {
        this.R = class037412;
        return this;
    }

    public class07165 N(String string, class06915<?> class069152) {
        this.u.put((Object)string, class069152);
        return this;
    }

    public class07165 N(class07499 class074992) {
        this.L = class074992;
        return this;
    }

    public class07165 N(class03753 class037532) {
        this.i = Optional.of(class037532);
        return this;
    }

    private /* synthetic */ class03753 N(Map map) {
        return this.R.create(map.keySet());
    }

    public class03711 N(Consumer<class03711> consumer, String string) {
        class03711 class037112 = this.y(class01894.N((String)string));
        consumer.accept(class037112);
        return class037112;
    }

    public class07165 N(class06584 class065842, class00392 class003922, class00392 class003923, @Nullable class01894 class018942, class07296 class072962, boolean bl, boolean bl2, boolean bl3) {
        return this.N(new class06513(class065842, class003922, class003923, Optional.ofNullable(class018942).map(class06953::new), class072962, bl, bl2, bl3));
    }

    @Deprecated(forRemoval=true)
    public class07165 N(class01894 class018942) {
        this.N = Optional.of(class018942);
        return this;
    }

    public class07165 N(class03711 class037112) {
        this.N = Optional.of(class037112.N());
        return this;
    }

    public static class07165 N() {
        return new class07165().L();
    }

    public class07165 N(class07310 class073102, class00392 class003922, class00392 class003923, @Nullable class01894 class018942, class07296 class072962, boolean bl, boolean bl2, boolean bl3) {
        return this.N(new class06513(new class06584((class07310)class073102.B()), class003922, class003923, Optional.ofNullable(class018942).map(class06953::new), class072962, bl, bl2, bl3));
    }

    public class07165 N(class06513 class065132) {
        this.y = Optional.of(class065132);
        return this;
    }

    public class07165 N(class10758 class107582) {
        return this.N(class107582.N());
    }
}

