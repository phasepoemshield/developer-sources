/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03504
 *  minecraft.class05237
 *  minecraft.class05247
 *  minecraft.class05250
 *  minecraft.class05272
 *  minecraft.class08627
 *  minecraft.class08918
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class01894;
import minecraft.class03504;
import minecraft.class05237;
import minecraft.class05247;
import minecraft.class05250;
import minecraft.class05272;
import minecraft.class08627;
import minecraft.class08918;
import org.jspecify.annotations.Nullable;

public class class04690
implements AutoCloseable {
    private final class08627 y;
    public final class01894 N;
    private final List<class05250> L = new ArrayList<class05250>();

    public class04690(class08627 class086272, class01894 class018942) {
        this.y = class086272;
        this.N = class018942;
    }

    @Override
    public void close() {
        this.N();
    }

    public void N() {
        int n = this.L.size();
        this.L.clear();
        for (int i = 0; i < n; ++i) {
            this.y.L(this.N(i));
        }
    }

    public @Nullable class05272 N(class05247 class052472, class05237 class052372) {
        class05250 class0525022;
        for (class05250 class0525022 : this.L) {
            class05272 class052722 = class0525022.N(class052472, class052372);
            if (class052722 == null) continue;
            return class052722;
        }
        int n = this.L.size();
        class0525022 = this.N(n);
        boolean bl = class052372.method_2033();
        class03504 class035042 = bl ? class03504.y((class01894)class0525022) : class03504.N((class01894)class0525022);
        class05250 class052503 = new class05250(() -> ((class01894)class0525022).toString(), class035042, bl);
        this.L.add(class052503);
        this.y.N((class01894)class0525022, (class08918)class052503);
        return class052503.N(class052472, class052372);
    }

    private class01894 N(int n) {
        return this.N.M("/" + n);
    }
}

