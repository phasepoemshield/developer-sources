/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  minecraft.class00429
 *  minecraft.class00454
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00429;
import minecraft.class00454;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01155;
import minecraft.class01159;
import minecraft.class01164;
import minecraft.class01166;
import minecraft.class01169;
import minecraft.class01177;
import minecraft.class01187;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;

public class class01145
implements class01166 {
    private final List<class01187> y = Lists.newArrayList();
    private final Set<class01187> L = Sets.newHashSet();
    private final List<class01187> u = Lists.newArrayList();
    private boolean i;
    private final class04782 R;
    private final int M;
    private final class01169 B;

    public class01145(class04782 class047822, int n, class01169 class011692) {
        this.R = class047822;
        this.M = n;
        this.B = class011692;
    }

    @Override
    public void y(class01187 class011872) {
        if (this.i) {
            this.L.add(class011872);
        } else {
            this.y.remove(class011872);
        }
        if (this.y.isEmpty()) {
            this.B.apply(this.M);
        }
    }

    private static Optional<class06889> N(class04782 class047822, class06889 class068892, class01187 class011872) {
        int n;
        Optional<class06889> var3 = class011872.N().N((class07299)class047822);
        if (var3.isEmpty()) {
            return Optional.empty();
        }
        double d = class07209.method_49638((class00737)((class00737)var3.get())).method_10262((class00753)class07209.method_49638((class00737)class068892));
        if (d > (double)(n = class011872.y() * class011872.y())) {
            return Optional.empty();
        }
        return var3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean N(class03556<class01194> class035562, class06889 class068892, class01164 class011642, class01159 class011592) {
        this.i = true;
        boolean bl = false;
        try {
            Iterator<class01187> var6 = this.y.iterator();
            while (var6.hasNext()) {
                class01187 class011872 = var6.next();
                if (this.L.remove(class011872)) {
                    var6.remove();
                    continue;
                }
                Optional<class06889> var8 = class01145.N(this.R, class068892, class011872);
                if (!var8.isPresent()) continue;
                class011592.visit(class011872, var8.get());
                bl = true;
            }
        }
        finally {
            this.i = false;
        }
        if (!this.u.isEmpty()) {
            this.y.addAll(this.u);
            this.u.clear();
        }
        if (!this.L.isEmpty()) {
            this.y.removeAll(this.L);
            this.L.clear();
        }
        return bl;
    }

    private static void N(class04782 class047822, class01187 class011872) {
        class01177 class011772;
        class07049 class070492;
        if (!class047822.method_74535().y(class00429.m)) {
            return;
        }
        class00454 class004542 = new class00454(class011872.y());
        class01190 class011902 = class011872.N();
        if (class011902 instanceof class01155) {
            class01155 class011552 = (class01155)class011902;
            class047822.method_74535().N(class011552.y(), class00429.m, (Object)class004542);
        } else if (class011902 instanceof class01177 && (class070492 = class047822.method_66347((class011772 = (class01177)class011902).y())) != null) {
            class047822.method_74535().N(class070492, class00429.m, (Object)class004542);
        }
    }

    @Override
    public void N(class01187 class011872) {
        if (this.i) {
            this.u.add(class011872);
        } else {
            this.y.add(class011872);
        }
        class01145.N(this.R, class011872);
    }

    @Override
    public boolean N() {
        return this.y.isEmpty();
    }
}

