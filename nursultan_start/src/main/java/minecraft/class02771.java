/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01471
 *  minecraft.class01473
 *  minecraft.class02142
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class08071
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00500;
import minecraft.class01471;
import minecraft.class01473;
import minecraft.class02142;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class08071;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class02771
extends class01471 {
    public static final MapCodec<class02771> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01471.N.fieldOf("source").forGetter(class027712 -> class027712.L), (App)Codec.STRING.fieldOf("property").forGetter(class027712 -> class027712.u), (App)class02142.L.fieldOf("values").forGetter(class027712 -> class027712.R)).apply(instance, class02771::new));
    private final class01471 L;
    private final String u;
    private @Nullable class08071 i;
    private final class02142 R;

    public class02771(class01471 class014712, class08071 class080712, class02142 class021422) {
        this.L = class014712;
        this.i = class080712;
        this.u = class080712.R();
        this.R = class021422;
        List list = class080712.N();
        for (int i = class021422.y(); i <= class021422.L(); ++i) {
            if (list.contains(i)) continue;
            throw new IllegalArgumentException("Property value out of range: " + class080712.R() + ": " + i);
        }
    }

    public class02771(class01471 class014712, String string, class02142 class021422) {
        this.L = class014712;
        this.u = string;
        this.R = class021422;
    }

    protected class01473<?> N() {
        return class01473.M;
    }

    private static @Nullable class08071 N(class00500 class005002, String string) {
        return class005002.y().stream().filter(class080922 -> class080922.R().equals(string)).filter(class080922 -> class080922 instanceof class08071).map(class080922 -> (class08071)class080922).findAny().orElse(null);
    }

    public class00500 N(class06069 class060692, class07209 class072092) {
        class00500 class005002 = this.L.N(class060692, class072092);
        if (this.i == null || !class005002.y((class08092)this.i)) {
            class08071 class080712 = class02771.N(class005002, this.u);
            if (class080712 == null) {
                return class005002;
            }
            this.i = class080712;
        }
        return (class00500)class005002.y((class08092)this.i, (Comparable)Integer.valueOf(this.R.N(class060692)));
    }
}

