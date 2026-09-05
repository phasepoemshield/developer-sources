/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class05220
 *  minecraft.class05936
 *  minecraft.class07018
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01028;
import minecraft.class01590;
import minecraft.class05220;
import minecraft.class05468;
import minecraft.class05482;
import minecraft.class05936;
import minecraft.class07018;
import org.jspecify.annotations.Nullable;

class class05478
implements class05482 {
    private @Nullable List<class05468> R;
    private @Nullable class07018 M;
    final /* synthetic */ class00392[] y;
    final /* synthetic */ class01590 L;
    final /* synthetic */ int u;
    final /* synthetic */ int i;

    private List<class05468> L() {
        class00392 class003922;
        int n;
        class07018 class070182 = class07018.y();
        if (this.R != null && class070182 == this.M) {
            return this.R;
        }
        this.M = class070182;
        ArrayList arrayList = new ArrayList();
        class00392[] class00392Array = this.y;
        int n2 = class00392Array.length;
        for (n = 0; n < n2; ++n) {
            class003922 = class00392Array[n];
            arrayList.addAll(this.L.u((class05936)class003922, this.u));
        }
        this.R = new ArrayList<class05468>();
        int n3 = Math.min(arrayList.size(), this.i);
        List list = arrayList.subList(0, n3);
        for (n = 0; n < list.size(); ++n) {
            class003922 = (class05936)list.get(n);
            class01028 class010282 = class07018.y().N((class05936)class003922);
            if (n == list.size() - 1 && n3 == this.i && n3 != arrayList.size()) {
                class05936 class059362 = this.L.N((class05936)class003922, this.L.N((class05936)class003922) - this.L.N((class05936)class05220.G));
                class05936 class059363 = class05936.N((class05936[])new class05936[]{class059362, class05220.G.L().L(this.y[this.y.length - 1].method_10866())});
                this.R.add(new class05468(class07018.y().N(class059363), this.L.N(class059363)));
                continue;
            }
            this.R.add(new class05468(class010282, this.L.N(class010282)));
        }
        return this.R;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05478(class00392[] class00392Array, class01590 class015902, int n, int n2) {
        this.y = class00392Array;
        this.L = class015902;
        this.u = n;
        this.i = n2;
    }

    @Override
    public int y() {
        return Math.min(this.u, this.L().stream().mapToInt(class05468::y).max().orElse(0));
    }

    @Override
    public int N() {
        return this.L().size();
    }

    @Override
    public int N(class00937 class009372, int n, int n2, int n3, class00580 class005802) {
        int n4 = n2;
        for (class05468 class054682 : this.L()) {
            int n5 = class009372.N(n, class054682.y());
            class005802.N(n5, n4, class054682.N());
            n4 += n3;
        }
        return n4;
    }
}

