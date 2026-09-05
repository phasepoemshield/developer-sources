/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class04918;
import minecraft.class04921;
import minecraft.class04937;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class04898
extends class04921 {
    public @Nullable class04918 N;
    public @Nullable class04937 y;
    public final List<class04890> L = Lists.newArrayList();

    public class04898(class06069 class060692, int n, int n2) {
        super(class04878.O, 0, n, n2, class04898.y(class060692));
    }

    public class04898(class07001 class070012) {
        super(class04878.O, class070012);
    }

    @Override
    public class07209 av_() {
        if (this.y != null) {
            return this.y.av_();
        }
        return super.av_();
    }
}

