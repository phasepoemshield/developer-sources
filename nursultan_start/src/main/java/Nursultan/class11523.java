/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11535;
import Nursultan.class11536;
import Nursultan.class12018;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class class11523<T extends class11535>
extends class11536<List<T>> {
    public Object N_0;

    public List<T> L() {
        this.M();
        return List.copyOf((List)this.N_0);
    }

    private void M() {
    }

    public class11523(class12018 class120182, List<T> list) {
        super(class120182, null);
        this.M();
        this.N_0 = list;
        this.L(this.R());
        this.y((List)this.i());
    }

    @Override
    public void u() {
        this.M();
        List list = (List)this.U();
        for (class11535 class115352 : (List)this.N_0) {
            class115352.M(false);
            if (!list.contains(class115352)) continue;
            class115352.M(true);
        }
        this.L(this.R());
    }

    @Override
    public void N(List<T> list) {
        throw new UnsupportedOperationException("Use selectEntry instead of setValue");
    }

    public void N(T t, boolean bl) {
        this.M();
        if (t == null || !((List)this.N_0).contains(t)) {
            throw new IllegalArgumentException("Entry is null or not found");
        }
        ((class11535)t).M(bl);
        this.L(this.R());
    }

    private List<T> R() {
        this.M();
        return ((List)this.N_0).stream().filter(class11535::U).collect(Collectors.toList());
    }

    @Override
    public boolean c_() {
        List list = (List)this.i();
        List list2 = (List)this.U();
        if (list.size() != list2.size()) {
            return true;
        }
        return IntStream.range(0, list.size()).anyMatch(n -> !((class11535)list.get(n)).E().N().equals(((class11535)list2.get(n)).E().N()));
    }
}

