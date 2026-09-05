/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06584;
import minecraft.class07324;
import org.jspecify.annotations.Nullable;

public class class07316
extends ArrayList<class07324> {
    public static final Codec<class07316> N = class07324.N.listOf().optionalFieldOf("Recipes", List.of()).xmap(class07316::new, Function.identity()).codec();
    public static final class02362<class04247, class07316> y = class07324.y.N_33(class02389.N(class07316::new));

    private class07316(Collection<class07324> collection) {
        super(collection);
    }

    private class07316(int n) {
        super(n);
    }

    public class07316() {
    }

    public class07316 N() {
        class07316 class073162 = new class07316(this.size());
        for (class07324 class073242 : this) {
            class073162.add(class073242.t());
        }
        return class073162;
    }

    public @Nullable class07324 N(class06584 class065842, class06584 class065843, int n) {
        if (n > 0 && n < this.size()) {
            class07324 class073242 = (class07324)this.get(n);
            if (class073242.N(class065842, class065843)) {
                return class073242;
            }
            return null;
        }
        for (int i = 0; i < this.size(); ++i) {
            class07324 class073243 = (class07324)this.get(i);
            if (!class073243.N(class065842, class065843)) continue;
            return class073243;
        }
        return null;
    }
}

