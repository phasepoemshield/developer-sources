/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07299
 *  minecraft.class07760
 *  minecraft.class08080
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07299;
import minecraft.class07760;
import minecraft.class08080;
import org.jspecify.annotations.Nullable;

public class class06897 {
    private final class07299 N;
    private final class07209 y;
    private final class07760 L;
    private class00500 u;
    private final boolean i;
    private final List<class07209> R = Lists.newArrayList();

    private void L(class06897 class068972) {
        this.R.add(class068972.y);
        class07209 class072092 = this.y.method_10095();
        class07209 class072093 = this.y.method_10072();
        class07209 class072094 = this.y.method_10067();
        class07209 class072095 = this.y.method_10078();
        boolean bl = this.L(class072092);
        boolean bl2 = this.L(class072093);
        boolean bl3 = this.L(class072094);
        boolean bl4 = this.L(class072095);
        class08080 class080802 = null;
        if (bl || bl2) {
            class080802 = class08080.field_12665;
        }
        if (bl3 || bl4) {
            class080802 = class08080.field_12674;
        }
        if (!this.i) {
            if (bl2 && bl4 && !bl && !bl3) {
                class080802 = class08080.field_12664;
            }
            if (bl2 && bl3 && !bl && !bl4) {
                class080802 = class08080.field_12671;
            }
            if (bl && bl3 && !bl2 && !bl4) {
                class080802 = class08080.field_12672;
            }
            if (bl && bl4 && !bl2 && !bl3) {
                class080802 = class08080.field_12663;
            }
        }
        if (class080802 == class08080.field_12665) {
            if (class07760.N((class07299)this.N, (class07209)class072092.method_10084())) {
                class080802 = class08080.field_12670;
            }
            if (class07760.N((class07299)this.N, (class07209)class072093.method_10084())) {
                class080802 = class08080.field_12668;
            }
        }
        if (class080802 == class08080.field_12674) {
            if (class07760.N((class07299)this.N, (class07209)class072095.method_10084())) {
                class080802 = class08080.field_12667;
            }
            if (class07760.N((class07299)this.N, (class07209)class072094.method_10084())) {
                class080802 = class08080.field_12666;
            }
        }
        if (class080802 == null) {
            class080802 = class08080.field_12665;
        }
        this.u = (class00500)this.u.y(this.L.L(), (Comparable)class080802);
        this.N.method_8652(this.y, this.u, 3);
    }

    public class00500 L() {
        return this.u;
    }

    private boolean L(class07209 class072092) {
        for (int i = 0; i < this.R.size(); ++i) {
            class07209 class072093 = this.R.get(i);
            if (class072093.method_10263() != class072092.method_10263() || class072093.method_10260() != class072092.method_10260()) continue;
            return true;
        }
        return false;
    }

    public class06897(class07299 class072992, class07209 class072092, class00500 class005002) {
        this.N = class072992;
        this.y = class072092;
        this.u = class005002;
        this.L = (class07760)class005002.i();
        class08080 class080802 = (class08080)class005002.L(this.L.L());
        this.i = this.L.y();
        this.N(class080802);
    }

    private boolean u(class07209 class072092) {
        class06897 class068972 = this.y(class072092);
        if (class068972 == null) {
            return false;
        }
        class068972.u();
        return class068972.y(this);
    }

    private void u() {
        for (int i = 0; i < this.R.size(); ++i) {
            class06897 class068972 = this.y(this.R.get(i));
            if (class068972 == null || !class068972.N(this)) {
                this.R.remove(i--);
                continue;
            }
            this.R.set(i, class068972.y);
        }
    }

    public int y() {
        int n = 0;
        for (class07211 class072112 : class07221.field_11062) {
            if (!this.N(this.y.method_10093(class072112))) continue;
            ++n;
        }
        return n;
    }

    private boolean y(class06897 class068972) {
        return this.N(class068972) || this.R.size() != 2;
    }

    private @Nullable class06897 y(class07209 class072092) {
        class07209 class072093 = class072092;
        class00500 class005002 = this.N.method_8320(class072093);
        if (class07760.U((class00500)class005002)) {
            return new class06897(this.N, class072093, class005002);
        }
        class072093 = class072092.method_10084();
        class005002 = this.N.method_8320(class072093);
        if (class07760.U((class00500)class005002)) {
            return new class06897(this.N, class072093, class005002);
        }
        class072093 = class072092.method_10074();
        class005002 = this.N.method_8320(class072093);
        if (class07760.U((class00500)class005002)) {
            return new class06897(this.N, class072093, class005002);
        }
        return null;
    }

    private boolean N(class07209 class072092) {
        return class07760.N((class07299)this.N, (class07209)class072092) || class07760.N((class07299)this.N, (class07209)class072092.method_10084()) || class07760.N((class07299)this.N, (class07209)class072092.method_10074());
    }

    private void N(class08080 class080802) {
        this.R.clear();
        switch (class080802) {
            case field_12665: {
                this.R.add(this.y.method_10095());
                this.R.add(this.y.method_10072());
                break;
            }
            case field_12674: {
                this.R.add(this.y.method_10067());
                this.R.add(this.y.method_10078());
                break;
            }
            case field_12667: {
                this.R.add(this.y.method_10067());
                this.R.add(this.y.method_10078().method_10084());
                break;
            }
            case field_12666: {
                this.R.add(this.y.method_10067().method_10084());
                this.R.add(this.y.method_10078());
                break;
            }
            case field_12670: {
                this.R.add(this.y.method_10095().method_10084());
                this.R.add(this.y.method_10072());
                break;
            }
            case field_12668: {
                this.R.add(this.y.method_10095());
                this.R.add(this.y.method_10072().method_10084());
                break;
            }
            case field_12664: {
                this.R.add(this.y.method_10078());
                this.R.add(this.y.method_10072());
                break;
            }
            case field_12671: {
                this.R.add(this.y.method_10067());
                this.R.add(this.y.method_10072());
                break;
            }
            case field_12672: {
                this.R.add(this.y.method_10067());
                this.R.add(this.y.method_10095());
                break;
            }
            case field_12663: {
                this.R.add(this.y.method_10078());
                this.R.add(this.y.method_10095());
            }
        }
    }

    public class06897 N(boolean bl, boolean bl2, class08080 class080802) {
        boolean bl3;
        boolean bl4;
        class07209 class072092 = this.y.method_10095();
        class07209 class072093 = this.y.method_10072();
        class07209 class072094 = this.y.method_10067();
        class07209 class072095 = this.y.method_10078();
        boolean bl5 = this.u(class072092);
        boolean bl6 = this.u(class072093);
        boolean bl7 = this.u(class072094);
        boolean bl8 = this.u(class072095);
        class08080 class080803 = null;
        boolean bl9 = bl5 || bl6;
        boolean bl10 = bl4 = bl7 || bl8;
        if (bl9 && !bl4) {
            class080803 = class08080.field_12665;
        }
        if (bl4 && !bl9) {
            class080803 = class08080.field_12674;
        }
        boolean bl11 = bl6 && bl8;
        boolean bl12 = bl6 && bl7;
        boolean bl13 = bl5 && bl8;
        boolean bl14 = bl3 = bl5 && bl7;
        if (!this.i) {
            if (bl11 && !bl5 && !bl7) {
                class080803 = class08080.field_12664;
            }
            if (bl12 && !bl5 && !bl8) {
                class080803 = class08080.field_12671;
            }
            if (bl3 && !bl6 && !bl8) {
                class080803 = class08080.field_12672;
            }
            if (bl13 && !bl6 && !bl7) {
                class080803 = class08080.field_12663;
            }
        }
        if (class080803 == null) {
            if (bl9 && bl4) {
                class080803 = class080802;
            } else if (bl9) {
                class080803 = class08080.field_12665;
            } else if (bl4) {
                class080803 = class08080.field_12674;
            }
            if (!this.i) {
                if (bl) {
                    if (bl11) {
                        class080803 = class08080.field_12664;
                    }
                    if (bl12) {
                        class080803 = class08080.field_12671;
                    }
                    if (bl13) {
                        class080803 = class08080.field_12663;
                    }
                    if (bl3) {
                        class080803 = class08080.field_12672;
                    }
                } else {
                    if (bl3) {
                        class080803 = class08080.field_12672;
                    }
                    if (bl13) {
                        class080803 = class08080.field_12663;
                    }
                    if (bl12) {
                        class080803 = class08080.field_12671;
                    }
                    if (bl11) {
                        class080803 = class08080.field_12664;
                    }
                }
            }
        }
        if (class080803 == class08080.field_12665) {
            if (class07760.N((class07299)this.N, (class07209)class072092.method_10084())) {
                class080803 = class08080.field_12670;
            }
            if (class07760.N((class07299)this.N, (class07209)class072093.method_10084())) {
                class080803 = class08080.field_12668;
            }
        }
        if (class080803 == class08080.field_12674) {
            if (class07760.N((class07299)this.N, (class07209)class072095.method_10084())) {
                class080803 = class08080.field_12667;
            }
            if (class07760.N((class07299)this.N, (class07209)class072094.method_10084())) {
                class080803 = class08080.field_12666;
            }
        }
        if (class080803 == null) {
            class080803 = class080802;
        }
        this.N(class080803);
        this.u = (class00500)this.u.y(this.L.L(), (Comparable)class080803);
        if (bl2 || this.N.method_8320(this.y) != this.u) {
            this.N.method_8652(this.y, this.u, 3);
            for (int i = 0; i < this.R.size(); ++i) {
                class06897 class068972 = this.y(this.R.get(i));
                if (class068972 == null) continue;
                class068972.u();
                if (!class068972.y(this)) continue;
                class068972.L(this);
            }
        }
        return this;
    }

    private boolean N(class06897 class068972) {
        return this.L(class068972.y);
    }

    public List<class07209> N() {
        return this.R;
    }
}

