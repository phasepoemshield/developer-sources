/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00455
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class07529
 *  minecraft.class08774
 */
package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class00381;
import minecraft.class00455;
import minecraft.class02796;
import minecraft.class04770;
import minecraft.class07529;
import minecraft.class08774;

public class class06954 {
    private final class02796 N;
    private final Map<class00455<?>, List<class04770>> y = new HashMap();

    public class06954(class02796 class027962) {
        this.N = class027962;
    }

    private List<class04770> y(class00455<?> class004552) {
        return this.y.getOrDefault(class004552, List.of());
    }

    public Set<class00455<?>> y() {
        return Set.copyOf(this.y.keySet());
    }

    public void N() {
        this.y.values().forEach(List::clear);
        for (class04770 class047702 : this.N.Nm().v()) {
            for (class00455 var4 : class047702.method_74538()) {
                this.y.computeIfAbsent(var4, class004552 -> new ArrayList()).add(class047702);
            }
        }
        this.y.values().removeIf(List::isEmpty);
    }

    public boolean N(class04770 class047702) {
        class08774 class087742 = class047702.method_72498();
        if (class07529.ND && this.N.N(class087742)) {
            return true;
        }
        return this.N.Nm().R(class087742);
    }

    public boolean N(class00455<?> class004552) {
        return !this.y(class004552).isEmpty();
    }

    public void N(class00455<?> class004552, class00381<?> class003812) {
        Iterator<class04770> var3 = this.y(class004552).iterator();
        while (var3.hasNext()) {
            var3.next().field_13987.method_14364(class003812);
        }
    }
}

