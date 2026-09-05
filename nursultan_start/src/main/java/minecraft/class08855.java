/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00500
 *  minecraft.class02006
 *  minecraft.class02028
 *  minecraft.class08350
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import minecraft.class00500;
import minecraft.class02006;
import minecraft.class02028;
import minecraft.class08350;
import minecraft.class08866;
import minecraft.class08868;
import minecraft.class08873;
import minecraft.class08875;
import minecraft.class08880;
import minecraft.class08885;
import minecraft.class08887;
import minecraft.class08889;

public class class08855
implements class08889 {
    final List<class08866<class08880>> N;
    private final class02006<class08875> y = new class08873(this);

    public class08855(List<class08866<class08880>> list) {
        this.N = list;
    }

    @Override
    public class08887 method_65542(class00500 class005002, class02028 class020282) {
        class08875 class088752 = (class08875)class020282.N(this.y);
        return new class08885(class088752, class005002);
    }

    public void method_62326(class08350 class083502) {
        this.N.forEach(class088662 -> ((class08880)class088662.y()).method_62326(class083502));
    }

    @Override
    public Object method_62332(class00500 class005002) {
        IntArrayList intArrayList = new IntArrayList();
        for (int i = 0; i < this.N.size(); ++i) {
            if (!this.N.get(i).N().test(class005002)) continue;
            intArrayList.add(i);
        }
        return new class08868(this, (IntList)intArrayList);
    }
}

