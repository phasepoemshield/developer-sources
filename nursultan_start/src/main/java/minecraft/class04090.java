/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10305
 *  minecraft.class00500
 *  minecraft.class05543
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 */
package minecraft;

import Nursultan.class10305;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class04072;
import minecraft.class04082;
import minecraft.class04089;
import minecraft.class04099;
import minecraft.class05543;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;

public class class04090 {
    public static final class04072[] N = new class04072[]{class04072.field_37598, class04072.field_37599, class04072.field_37600};
    private final class04099 y;

    public class04090(class05543 class055432) {
        this(new class04082(class055432));
    }

    public class04090(class04099 class040992) {
        this.y = class040992;
    }

    public Optional<class04089> N(class07284 class072842, class04089 class040892, boolean bl) {
        class00500 class005002 = class072842.method_8320(class040892.N());
        if (this.y.N(class072842, class040892, class005002, bl)) {
            return Optional.of(class040892);
        }
        return Optional.empty();
    }

    private long N(class00500 class005002, class07284 class072842, class07209 class072092, class07211 class072112, boolean bl) {
        return class07211.N().map(class072113 -> this.N(class005002, class072842, class072092, class072112, (class07211)class072113, bl)).filter(Optional::isPresent).count();
    }

    public Optional<class04089> N(class00500 class005002, class07284 class072842, class07209 class072092, class07211 class072112, class06069 class060692, boolean bl) {
        return class07211.N((class06069)class060692).stream().map(class072113 -> this.N(class005002, class072842, class072092, class072112, (class07211)class072113, bl)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
    }

    public long N(class00500 class005002, class07284 class072842, class07209 class072092, boolean bl) {
        return class07211.N().filter(class072112 -> this.y.y(class005002, (class07211)class072112)).map(class072112 -> this.N(class005002, class072842, class072092, (class07211)class072112, bl)).reduce(0L, Long::sum);
    }

    public Optional<class04089> N(class00500 class005002, class07284 class072842, class07209 class072092, class06069 class060692) {
        return class07211.N((class06069)class060692).stream().filter(class072112 -> this.y.y(class005002, (class07211)class072112)).map(class072112 -> this.N(class005002, class072842, class072092, (class07211)class072112, class060692, false)).filter(Optional::isPresent).findFirst().orElse(Optional.empty());
    }

    public boolean N(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return class07211.N().anyMatch(class072113 -> this.N(class005002, class072902, class072092, class072112, (class07211)class072113, this.y::N).isPresent());
    }

    public Optional<class04089> N(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112, class07211 class072113, class10305 class103052) {
        if (class072113.z() == class072112.z()) {
            return Optional.empty();
        }
        if (!(this.y.N(class005002) || this.y.N(class005002, class072112) && !this.y.N(class005002, class072113))) {
            return Optional.empty();
        }
        class04072[] class04072Array = this.y.N();
        int n = class04072Array.length;
        for (int i = 0; i < n; ++i) {
            class04089 class040892 = class04072Array[i].N(class072092, class072113, class072112);
            if (!class103052.test(class072902, class072092, class040892)) continue;
            return Optional.of(class040892);
        }
        return Optional.empty();
    }

    public Optional<class04089> N(class00500 class005002, class07284 class072842, class07209 class072092, class07211 class072112, class07211 class072113, boolean bl) {
        return this.N(class005002, (class07290)class072842, class072092, class072112, class072113, this.y::N).flatMap(class040892 -> this.N(class072842, (class04089)((Object)class040892), bl));
    }
}

