/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03708
 *  minecraft.class03723
 *  minecraft.class05096
 *  minecraft.class05220
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03708;
import minecraft.class03723;
import minecraft.class05096;
import minecraft.class05220;
import org.jspecify.annotations.Nullable;

public class class03754 {
    private final class05096 N;
    private final class00392 y;
    private class00392 L = class05220.N;
    private int u = 250;
    private @Nullable class01894 i;
    private final List<class03708> R = new ArrayList<class03708>();
    private @Nullable Runnable M = null;

    public class03754(class05096 class050962, class00392 class003922) {
        this.N = class050962;
        this.y = class003922;
    }

    public class03754 N(class00392 class003922, Consumer<class03723> consumer) {
        this.R.add(new class03708(class003922, consumer));
        return this;
    }

    public class03754 N(Runnable runnable) {
        this.M = runnable;
        return this;
    }

    public class03723 N() {
        if (this.R.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
        }
        return new class03723(this.N, this.u, this.i, this.y, this.L, List.copyOf(this.R), this.M);
    }

    public class03754 N(class00392 class003922) {
        this.L = class003922;
        return this;
    }

    public class03754 N(class01894 class018942) {
        this.i = class018942;
        return this;
    }

    public class03754 N(int n) {
        this.u = n;
        return this;
    }
}

