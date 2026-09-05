/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09250
 *  Nursultan.class11495
 *  Nursultan.class11519
 */
package Nursultan;

import Nursultan.class09250;
import Nursultan.class11495;
import Nursultan.class11519;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class class10945 {
    public Object N_0;
    public Object N_1;

    public boolean L() {
        return ((Map)this.N_0).isEmpty();
    }

    public Optional<class09250> L(UUID uUID) {
        return Optional.ofNullable((class09250)((Map)this.N_0).get(uUID));
    }

    public void L(class09250 class092502) {
        ((Map)this.N_0).put(class092502.R(), class092502);
        ((AtomicLong)this.N_1).incrementAndGet();
        class11519.y(class11495.class);
    }

    private void M() {
    }

    public class10945() {
        this.M();
        this.N_0 = new LinkedHashMap();
        this.N_1 = new AtomicLong();
    }

    public List<class09250> u() {
        return List.copyOf(((Map)this.N_0).values());
    }

    public void y(UUID uUID) {
        class09250 class092502 = (class09250)((Map)this.N_0).get(uUID);
        if (class092502 == null) {
            return;
        }
        class092502.N(!class092502.y());
        ((AtomicLong)this.N_1).incrementAndGet();
        class11519.y(class11495.class);
    }

    public int y() {
        return ((Map)this.N_0).size();
    }

    public void y(class09250 class092502) {
        ((Map)this.N_0).remove(class092502.R());
        ((AtomicLong)this.N_1).incrementAndGet();
    }

    public void N(UUID uUID) {
        if (((Map)this.N_0).remove(uUID) != null) {
            ((AtomicLong)this.N_1).incrementAndGet();
            class11519.y(class11495.class);
        }
    }

    public long N() {
        return ((AtomicLong)this.N_1).get();
    }

    public void N(class09250 class092502) {
        ((Map)this.N_0).put(class092502.R(), class092502);
        ((AtomicLong)this.N_1).incrementAndGet();
    }
}

