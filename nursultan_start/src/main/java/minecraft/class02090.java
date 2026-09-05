/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03711
 *  minecraft.class07282
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.time.Duration;
import java.util.UUID;
import minecraft.class01894;
import minecraft.class02097;
import minecraft.class02099;
import minecraft.class02103;
import minecraft.class02104;
import minecraft.class02110;
import minecraft.class02117;
import minecraft.class02120;
import minecraft.class02129;
import minecraft.class03711;
import minecraft.class07282;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class02090 {
    private final UUID N = UUID.randomUUID();
    private final class02097 y;
    private final class02099 L;
    private final class02110 u = new class02110();
    private final class02120 i;
    private final class02103 R;

    public void L() {
        this.L.N(this.y);
        this.i.u();
        this.u.N(this.y);
    }

    public class02090(class02097 class020972, boolean bl, @Nullable Duration duration, @Nullable String string) {
        this.L = new class02099(string);
        this.i = new class02120();
        this.R = new class02103(bl, duration);
        this.y = class020972.N((class02104 class021042) -> {
            this.L.N((class02104)class021042);
            class021042.N(class02117.Z, this.N);
        });
    }

    public void y() {
        if (this.L.N(this.y)) {
            this.R.N(this.y);
            this.i.N();
        }
    }

    public void N() {
        this.i.N(this.y);
    }

    public void N(class07299 class072992, class03711 class037112) {
        class01894 class018942 = class037112.N();
        if (class037112.y().M() && "minecraft".equals(class018942.y())) {
            long l = class072992.N();
            this.y.send(class02129.M, class021042 -> {
                class021042.N(class02117.O, class018942.toString());
                class021042.N(class02117.g, l);
            });
        }
    }

    public void N(class07282 class072822, boolean bl) {
        this.L.N(class072822, bl);
        this.u.N();
        this.y();
    }

    public void N(long l) {
        this.u.N(l);
    }

    public void N(String string) {
        this.L.N(string);
        this.y();
    }
}

