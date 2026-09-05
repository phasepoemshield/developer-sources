/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class07079;
import minecraft.class07654;
import org.jspecify.annotations.Nullable;

class class07616
implements Predicate<class07079> {
    class07616() {
    }

    @Override
    public boolean test(@Nullable class07079 class070792) {
        return class070792 != null && class07654.N.containsKey(class070792.method_5864());
    }
}

