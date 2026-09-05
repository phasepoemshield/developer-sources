/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10340
 *  Nursultan.class10343
 *  Nursultan.class10344
 *  Nursultan.class10345
 *  Nursultan.class10346
 *  com.mojang.logging.LogUtils
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class02733
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10340;
import Nursultan.class10343;
import Nursultan.class10344;
import Nursultan.class10345;
import Nursultan.class10346;
import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04358
implements class04376 {
    private static final Logger y = LogUtils.getLogger();
    private final class07299 L;
    private final int u;
    private final ArrayDeque<class10340> i = new ArrayDeque();
    private final List<class10340> R = new ArrayList<class10340>();
    private int M = 0;
    private @Nullable Consumer<class07209> B;

    public class04358(class07299 class072992, int n) {
        this.L = class072992;
        this.u = n;
    }

    @Override
    public void N(class07209 class072092, class00891 class008912, @Nullable class07211 class072112, @Nullable class02733 class027332) {
        this.N(class072092, (class10340)new class10343(class072092.method_10062(), class008912, class027332, class072112));
    }

    private void N(class07209 class072092, class10340 class103402) {
        boolean bl = this.M > 0;
        boolean bl2 = this.u >= 0 && this.M >= this.u;
        ++this.M;
        if (!bl2) {
            if (bl) {
                this.R.add(class103402);
            } else {
                this.i.push(class103402);
            }
        } else if (this.M - 1 == this.u) {
            y.error("Too many chained neighbor updates. Skipping the rest. First skipped position: {}", (Object)class072092.method_23854());
        }
        if (!bl) {
            this.N();
        }
    }

    private void N() {
        try {
            block3: while (!this.i.isEmpty() || !this.R.isEmpty()) {
                for (int i = this.R.size() - 1; i >= 0; --i) {
                    this.i.push(this.R.get(i));
                }
                this.R.clear();
                class10340 class103402 = this.i.peek();
                if (this.B != null) {
                    class103402.N(this.B);
                }
                while (this.R.isEmpty()) {
                    if (class103402.N(this.L)) continue;
                    this.i.pop();
                    continue block3;
                }
            }
        }
        finally {
            this.i.clear();
            this.R.clear();
            this.M = 0;
        }
    }

    @Override
    public void N(class00500 class005002, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        this.N(class072092, (class10340)new class10346(class005002, class072092.method_10062(), class008912, class027332, bl));
    }

    public void N(@Nullable Consumer<class07209> consumer) {
        this.B = consumer;
    }

    @Override
    public void N(class07209 class072092, class00891 class008912, @Nullable class02733 class027332) {
        this.N(class072092, (class10340)new class10344(class072092, class008912, class027332));
    }

    @Override
    public void N(class07211 class072112, class00500 class005002, class07209 class072092, class07209 class072093, int n, int n2) {
        this.N(class072092, (class10340)new class10345(class072112, class005002, class072092.method_10062(), class072093.method_10062(), n, n2));
    }
}

