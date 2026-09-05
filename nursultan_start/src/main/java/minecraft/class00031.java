/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.google.common.collect.Table
 *  com.google.common.collect.Tables
 *  minecraft.class00016
 *  minecraft.class04770
 *  minecraft.class07305
 */
package minecraft;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import minecraft.class00016;
import minecraft.class00038;
import minecraft.class00042;
import minecraft.class04770;
import minecraft.class07305;

public class class00031
implements class00016<class00042> {
    private final Set<class00042> N = new HashSet<class00042>();
    private final Set<class04770> y = new HashSet<class04770>();
    private final Table<class04770, class00042, class00038> L = HashBasedTable.create();

    public void L(class04770 class047702) {
        this.L.row((Object)class047702).values().removeIf(class000382 -> {
            class000382.u();
            return true;
        });
        this.L((class00042)class047702);
        this.y.remove(class047702);
    }

    public void L(class00042 class000422) {
        this.L.column((Object)class000422).forEach((class047702, class000382) -> class000382.u());
        Tables.transpose(this.L).row((Object)class000422).clear();
        this.N.remove(class000422);
    }

    public void u(class00042 class000422) {
        for (class04770 class047702 : this.y) {
            this.N(class047702, class000422);
        }
    }

    private static boolean u(class04770 class047702) {
        return (Boolean)class047702.method_51469().method_64395().N(class07305.t);
    }

    public void y(class04770 class047702) {
        Map var2 = this.L.row((Object)class047702);
        Sets.SetView var3 = Sets.difference(this.N, var2.keySet());
        for (Object object : ImmutableSet.copyOf(var2.entrySet())) {
            this.N(class047702, (class00042)object.getKey(), (class00038)object.getValue());
        }
        for (Object object : var3) {
            this.N(class047702, (class00042)object);
        }
    }

    public void y(class00042 class000422) {
        if (!this.N.contains(class000422)) {
            return;
        }
        Map var2 = Tables.transpose(this.L).row((Object)class000422);
        Sets.SetView var3 = Sets.difference(this.y, var2.keySet());
        for (Map.Entry entry : ImmutableSet.copyOf(var2.entrySet())) {
            this.N((class04770)entry.getKey(), class000422, (class00038)entry.getValue());
        }
        for (Map.Entry entry : var3) {
            this.N((class04770)entry, class000422);
        }
    }

    public Set<class00042> y() {
        return this.N;
    }

    public void N(class00042 class000422) {
        this.N.add(class000422);
        for (class04770 class047702 : this.y) {
            this.N(class047702, class000422);
        }
    }

    public void N(class04770 class047702) {
        this.y.add(class047702);
        for (class00042 class000422 : this.N) {
            this.N(class047702, class000422);
        }
        if (class047702.method_70674()) {
            this.N((class00042)class047702);
        }
    }

    public void N() {
        this.L.values().forEach(class00038::u);
        this.L.clear();
    }

    private void N(class04770 class047702, class00042 class000422) {
        if (class047702 == class000422) {
            return;
        }
        if (!class00031.u(class047702)) {
            return;
        }
        class000422.method_70672(class047702).ifPresentOrElse(class000382 -> {
            this.L.put((Object)class047702, (Object)class000422, class000382);
            class000382.L();
        }, () -> {
            class00038 class000382 = (class00038)this.L.remove((Object)class047702, (Object)class000422);
            if (class000382 != null) {
                class000382.u();
            }
        });
    }

    private void N(class04770 class047702, class00042 class000422, class00038 class000383) {
        if (class047702 == class000422) {
            return;
        }
        if (!class00031.u(class047702)) {
            return;
        }
        if (!class000383.y()) {
            class000383.i();
            return;
        }
        class000422.method_70672(class047702).ifPresentOrElse(class000382 -> {
            class000382.L();
            this.L.put((Object)class047702, (Object)class000422, class000382);
        }, () -> {
            class000383.u();
            this.L.remove((Object)class047702, (Object)class000422);
        });
    }
}

