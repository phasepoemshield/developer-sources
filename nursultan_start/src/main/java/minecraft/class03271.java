/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class03241
 *  minecraft.class03255
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class06202
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class03241;
import minecraft.class03255;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class06202;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

public class class03271 {
    private final Consumer<class06478> N;
    private final Consumer<class06478> y;
    private final Consumer<class03241> L;
    private final Consumer<class03241> u;
    private @Nullable class03241 i;
    private @Nullable class03255 R;

    public class03271(Consumer<class06478> consumer, Consumer<class06478> consumer2) {
        this(consumer, consumer2, class032412 -> {}, class032412 -> {});
    }

    public class03271(Consumer<class06478> consumer, Consumer<class06478> consumer2, Consumer<class03241> consumer3, Consumer<class03241> consumer4) {
        this.N = consumer;
        this.y = consumer2;
        this.L = consumer3;
        this.u = consumer4;
    }

    public void N(class03241 class032412, boolean bl) {
        if (!Objects.equals(this.i, class032412)) {
            if (this.i != null) {
                this.i.method_48612(this.y);
            }
            class03241 class032413 = this.i;
            this.i = class032412;
            class032412.method_48612(this.N);
            if (this.R != null) {
                class032412.method_48611(this.R);
            }
            if (bl) {
                class06202.Nq().Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            }
            this.u.accept(class032413);
            this.L.accept(this.i);
        }
    }

    public @Nullable class03241 N() {
        return this.i;
    }

    public void N(class03255 class032552) {
        this.R = class032552;
        class03241 class032412 = this.N();
        if (class032412 != null) {
            class032412.method_48611(class032552);
        }
    }
}

