/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  minecraft.class00891
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01235
 *  minecraft.class04206
 *  minecraft.class04922
 *  minecraft.class06202
 *  minecraft.class06318
 *  minecraft.class06570
 *  minecraft.class06581
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import minecraft.class00891;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01235;
import minecraft.class04206;
import minecraft.class04590;
import minecraft.class04592;
import minecraft.class04610;
import minecraft.class04614;
import minecraft.class04628;
import minecraft.class04922;
import minecraft.class06202;
import minecraft.class06318;
import minecraft.class06570;
import minecraft.class06581;
import org.jspecify.annotations.Nullable;

class class04611
extends class06318<class04614> {
    private static final int M = 18;
    private static final int B = 22;
    private static final int Z = 1;
    private static final int z = 0;
    private static final int U = -1;
    private static final int E = 1;
    protected final List<class04922<class00891>> N;
    protected final List<class04922<class06581>> y;
    protected final Comparator<class04590> L;
    protected @Nullable class04922<?> u;
    protected int i;
    final /* synthetic */ class04610 R;

    public class04611(class04610 class046102, class06202 class062022) {
        boolean bl;
        this.R = class046102;
        super(class062022, class046102.field_22789, class046102.M.u(), 33, 22);
        this.L = new class04592(this);
        this.N = Lists.newArrayList();
        this.N.add((class04922<class00891>)class01235.N);
        this.y = Lists.newArrayList((Object[])new class04922[]{class01235.u, class01235.y, class01235.L, class01235.i, class01235.R});
        Set set = Sets.newIdentityHashSet();
        for (class06581 class065812 : class04206.B) {
            bl = false;
            for (class04922<class06581> class049222 : this.y) {
                if (!class049222.N((Object)class065812) || class046102.B.N(class049222.y((Object)class065812)) <= 0) continue;
                bl = true;
            }
            if (!bl) continue;
            set.add(class065812);
        }
        for (class06581 class065812 : class04206.i) {
            bl = false;
            for (class04922<class06581> class049222 : this.N) {
                if (!class049222.N((Object)class065812) || class046102.B.N(class049222.y((Object)class065812)) <= 0) continue;
                bl = true;
            }
            if (!bl) continue;
            set.add(class065812.B());
        }
        set.remove(class06570.N);
        if (!set.isEmpty()) {
            this.method_25321((class01202)new class04628(this));
            for (class06581 class065812 : set) {
                this.method_25321((class01202)new class04590(this, class065812));
            }
        }
    }

    class04922<?> y(int n) {
        return n < this.N.size() ? this.N.get(n) : this.y.get(n - this.N.size());
    }

    protected void y(class04922<?> class049222) {
        if (class049222 != this.u) {
            this.u = class049222;
            this.i = -1;
        } else if (this.i == -1) {
            this.i = 1;
        } else {
            this.u = null;
            this.i = 0;
        }
        this.N(this.L);
    }

    private List<class04590> y() {
        ArrayList<class04590> arrayList = new ArrayList<class04590>();
        this.method_25396().forEach(class046142 -> {
            if (class046142 instanceof class04590) {
                class04590 class045902 = (class04590)((Object)class046142);
                arrayList.add(class045902);
            }
        });
        return arrayList;
    }

    protected void N(Comparator<class04590> comparator) {
        List<class04590> var2 = this.y();
        var2.sort(comparator);
        this.method_73374((class01202)((class04614)((Object)this.method_25396().getFirst())));
        for (class04590 class045902 : var2) {
            this.method_25321((class01202)class045902);
        }
    }

    int N(int n) {
        return 75 + 40 * n;
    }

    int N(class04922<?> class049222) {
        int n = this.N.indexOf(class049222);
        if (n >= 0) {
            return n;
        }
        int n2 = this.y.indexOf(class049222);
        if (n2 >= 0) {
            return n2 + this.N.size();
        }
        return -1;
    }

    static /* synthetic */ class06202 N(class04611 class046112) {
        return class046112.field_22740;
    }

    public int method_25322() {
        return 280;
    }

    protected void method_57715(class01054 class010542) {
    }

    protected void method_57713(class01054 class010542) {
    }
}

