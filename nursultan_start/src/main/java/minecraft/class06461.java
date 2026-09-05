/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class06069
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class06069;
import minecraft.class06445;
import minecraft.class06454;
import minecraft.class06471;
import minecraft.class07001;
import org.jspecify.annotations.Nullable;

public class class06461
extends class06445 {
    @Nullable class06471 N;
    final List<class06471> y = new ArrayList<class06471>();
    final List<class06471> L = new ArrayList<class06471>();
    public final List<class04890> u = Lists.newArrayList();

    public class06461(class06069 class060692, int n, int n2) {
        super(n, n2, class06461.y((class06069)class060692));
        for (class06471 class064712 : class06454.y) {
            class064712.L = 0;
            this.y.add(class064712);
        }
        for (class06471 class064712 : class06454.L) {
            class064712.L = 0;
            this.L.add(class064712);
        }
    }

    public class06461(class07001 class070012) {
        super(class04878.j, class070012);
    }
}

