/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class04003
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06338
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class04003;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06338;
import minecraft.class06889;
import minecraft.class07209;

public class class03982 {
    public static final Codec<class03982> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.fieldOf("ticks_since_last_warning").orElse((Object)0).forGetter(class039822 -> class039822.M), (App)class06338.T.fieldOf("warning_level").orElse((Object)0).forGetter(class039822 -> class039822.B), (App)class06338.T.fieldOf("cooldown_ticks").orElse((Object)0).forGetter(class039822 -> class039822.Z)).apply(instance, class03982::new));
    public static final int y = 4;
    private static final double L = 16.0;
    private static final int u = 48;
    private static final int i = 12000;
    private static final int R = 200;
    private int M;
    private int B;
    private int Z;

    public int L() {
        return this.B;
    }

    public class03982(int n, int n2, int n3) {
        this.M = n;
        this.B = n2;
        this.Z = n3;
    }

    public class03982() {
        this(0, 0, 0);
    }

    private void i() {
        if (!this.u()) {
            this.M = 0;
            this.Z = 200;
            this.N(this.L() + 1);
        }
    }

    private boolean u() {
        return this.Z > 0;
    }

    public void y() {
        this.M = 0;
        this.B = 0;
        this.Z = 0;
    }

    private static List<class04770> y(class04782 class047822, class07209 class072092) {
        class06889 class068892 = class06889.y((class00753)class072092);
        return class047822.method_18766(class047702 -> !class047702.method_7325() && class047702.method_73189().N((class00737)class068892, 16.0) && class047702.method_5805());
    }

    private static boolean N(class04782 class047822, class07209 class072092) {
        class00734 class007342 = class00734.N((class06889)class06889.y((class00753)class072092), (double)48.0, (double)48.0, (double)48.0);
        return !class047822.N(class04003.class, class007342).isEmpty();
    }

    public static OptionalInt N(class04782 class047822, class07209 class072092, class04770 class047703) {
        if (class03982.N(class047822, class072092)) {
            return OptionalInt.empty();
        }
        List<class04770> var3 = class03982.y(class047822, class072092);
        if (!var3.contains(class047703)) {
            var3.add(class047703);
        }
        if (var3.stream().anyMatch(class047702 -> class047702.method_42272().map(class03982::u).orElse(false))) {
            return OptionalInt.empty();
        }
        Optional<class03982> optional = var3.stream().flatMap(class047702 -> class047702.method_42272().stream()).max(Comparator.comparingInt(class03982::L));
        if (optional.isPresent()) {
            class03982 class039822 = optional.get();
            class039822.i();
            var3.forEach(class047702 -> class047702.method_42272().ifPresent(class039823 -> class039823.N(class039822)));
            return OptionalInt.of(class039822.B);
        }
        return OptionalInt.empty();
    }

    public void N() {
        if (this.M >= 12000) {
            this.R();
            this.M = 0;
        } else {
            ++this.M;
        }
        if (this.Z > 0) {
            --this.Z;
        }
    }

    private void N(class03982 class039822) {
        this.B = class039822.B;
        this.Z = class039822.Z;
        this.M = class039822.M;
    }

    public void N(int n) {
        this.B = class04995.N((int)n, (int)0, (int)4);
    }

    private void R() {
        this.N(this.L() - 1);
    }
}

