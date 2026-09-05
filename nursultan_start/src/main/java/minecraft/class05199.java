/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class05936
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class05936;
import org.jspecify.annotations.Nullable;

public class class05199 {
    private final List<class05936> N = Lists.newArrayList();

    public void L() {
        this.N.clear();
    }

    public class05936 y() {
        class05936 class059362 = this.N();
        return class059362 != null ? class059362 : class05936.u;
    }

    public void N(class05936 class059362) {
        this.N.add(class059362);
    }

    public @Nullable class05936 N() {
        if (this.N.isEmpty()) {
            return null;
        }
        if (this.N.size() == 1) {
            return this.N.get(0);
        }
        return class05936.N(this.N);
    }
}

