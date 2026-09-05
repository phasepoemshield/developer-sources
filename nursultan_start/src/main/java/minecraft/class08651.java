/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03255
 *  minecraft.class07529
 *  minecraft.class08320
 *  minecraft.class08394
 *  minecraft.class08669
 *  minecraft.class08675
 *  minecraft.class08677
 *  minecraft.class08679
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class03255;
import minecraft.class07529;
import minecraft.class08320;
import minecraft.class08394;
import minecraft.class08647;
import minecraft.class08650;
import minecraft.class08652;
import minecraft.class08656;
import minecraft.class08661;
import minecraft.class08669;
import minecraft.class08675;
import minecraft.class08677;
import minecraft.class08679;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public class class08651 {
    private static final int N = 0x774444FF;
    private final List<class08675> y = new ArrayList<class08675>();
    private int L = Integer.MAX_VALUE;
    private class08675 u;
    private final Set<Object> i = new HashSet<Object>();
    private @Nullable class03255 R;

    public void L(Consumer<class08647> consumer) {
        class08675 class086753 = this.u;
        this.y((class08675 class086752) -> {
            if (class086752.M != null) {
                this.u = class086752;
                for (class08647 class086472 : class086752.M) {
                    consumer.accept(class086472);
                }
            }
        }, class08677.field_60315);
        this.u = class086753;
    }

    public void L() {
        if (this.u.y == null) {
            this.u.y = new class08675(this.u);
        }
        this.u = this.u.y;
    }

    public class08651() {
        this.N();
    }

    public void i() {
        this.i.clear();
        this.y.clear();
        this.L = Integer.MAX_VALUE;
        this.N();
    }

    public Set<Object> u() {
        return this.i;
    }

    private void y(class03255 class032552) {
        class08675 class086752 = (class08675)this.y.getLast();
        while (class086752.y != null) {
            class086752 = class086752.y;
        }
        boolean bl = false;
        while (!bl) {
            boolean bl2 = bl = this.N(class032552, class086752.L) || this.N(class032552, class086752.i) || this.N(class032552, class086752.R) || this.N(class032552, class086752.M);
            if (class086752.N == null) break;
            if (bl) continue;
            class086752 = class086752.N;
        }
        this.u = class086752;
        if (bl) {
            this.L();
        }
    }

    public void y(class08669 class086692) {
        this.u.y(class086692);
    }

    private void y(Consumer<class08675> consumer, class08677 class086772) {
        int n = 0;
        int n2 = this.y.size();
        if (class086772 == class08677.field_60316) {
            n2 = Math.min(this.L, this.y.size());
        } else if (class086772 == class08677.field_60317) {
            n = this.L;
        }
        for (int i = n; i < n2; ++i) {
            class08675 class086752 = this.y.get(i);
            this.N(class086752, consumer);
        }
    }

    public void y(Consumer<class08652> consumer) {
        class08675 class086753 = this.u;
        this.y((class08675 class086752) -> {
            if (class086752.R != null) {
                for (class08652 class086522 : class086752.R) {
                    this.u = class086752;
                    consumer.accept(class086522);
                }
            }
        }, class08677.field_60315);
        this.u = class086753;
    }

    public void y() {
        if (this.L != Integer.MAX_VALUE) {
            throw new IllegalStateException("Can only blur once per frame");
        }
        this.L = this.y.size() - 1;
    }

    public void N(class08650 class086502) {
        if (!this.N((class08320)class086502)) {
            return;
        }
        this.i.add(class086502.L().Z());
        this.u.N(class086502);
        this.N(class086502.comp_4274());
    }

    private void N(class08675 class086752, Consumer<class08675> consumer) {
        consumer.accept(class086752);
        if (class086752.y != null) {
            this.N(class086752.y, consumer);
        }
    }

    public void N(Comparator<class08669> comparator) {
        this.y((class08675 class086752) -> {
            if (class086752.L != null) {
                if (class07529.l) {
                    Collections.shuffle(class086752.L);
                }
                class086752.L.sort(comparator);
            }
        }, class08677.field_60315);
    }

    public void N() {
        this.u = new class08675(null);
        this.y.add(this.u);
    }

    public void N(class08647 class086472) {
        if (!this.N((class08320)class086472)) {
            return;
        }
        this.u.N(class086472);
        this.N(class086472.comp_4274());
    }

    public void N(class08661 class086612) {
        this.u.N((class08669)class086612);
    }

    private boolean N(class03255 class032552, @Nullable List<? extends class08320> list) {
        if (list != null) {
            Iterator<? extends class08320> iterator = list.iterator();
            while (iterator.hasNext()) {
                class03255 class032553 = iterator.next().comp_4274();
                if (class032553 == null || !class032553.L(class032552)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean N(class08320 class083202) {
        class03255 class032552 = class083202.comp_4274();
        if (class032552 == null) {
            return false;
        }
        if (this.R != null && this.R.u(class032552)) {
            this.L();
        } else {
            this.y(class032552);
        }
        this.R = class032552;
        return true;
    }

    private void N(@Nullable class03255 class032552) {
        if (!class07529.w || class032552 == null) {
            return;
        }
        this.L();
        this.u.N((class08669)new class08656(class08394.NH, class08679.N(), (Matrix3x2fc)new Matrix3x2f(), 0, 0, 10000, 10000, 0x774444FF, 0x774444FF, class032552));
    }

    public void N(class08652 class086522) {
        if (!this.N((class08320)class086522)) {
            return;
        }
        this.u.N(class086522);
        this.N(class086522.comp_4274());
    }

    public void N(class08669 class086692) {
        if (!this.N((class08320)class086692)) {
            return;
        }
        this.u.N(class086692);
        this.N(class086692.comp_4274());
    }

    public void N(Consumer<class08650> consumer) {
        class08675 class086753 = this.u;
        this.y((class08675 class086752) -> {
            if (class086752.i != null) {
                this.u = class086752;
                for (class08650 class086502 : class086752.i) {
                    consumer.accept(class086502);
                }
            }
        }, class08677.field_60315);
        this.u = class086753;
    }

    public void N(Consumer<class08669> consumer, class08677 class086772) {
        this.y((class08675 class086752) -> {
            if (class086752.L == null && class086752.u == null) {
                return;
            }
            if (class086752.L != null) {
                for (class08669 class086692 : class086752.L) {
                    consumer.accept(class086692);
                }
            }
            if (class086752.u != null) {
                for (class08669 class086692 : class086752.u) {
                    consumer.accept(class086692);
                }
            }
        }, class086772);
    }
}

