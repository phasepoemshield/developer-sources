/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04952
 *  minecraft.class04981
 *  minecraft.class06202
 */
package minecraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import minecraft.class04952;
import minecraft.class04981;
import minecraft.class06202;

public class class03410
implements Iterable<class04981> {
    private final class06202 N;
    private final Set<class04981> y = new HashSet<class04981>();
    private List<class04981> L = List.of();

    public class03410(class06202 class062022) {
        this.N = class062022;
    }

    @Override
    public Iterator<class04981> iterator() {
        return this.L.iterator();
    }

    public boolean N() {
        return this.L.isEmpty();
    }

    public void N(class04981 class049812) {
        this.L.remove(class049812);
        this.y.add(class049812);
    }

    public void N(List<class04981> list) {
        ArrayList<class04981> arrayList = new ArrayList<class04981>(list);
        arrayList.sort((Comparator<class04981>)new class04952(this.N.Ny().L()));
        if (!arrayList.removeAll(this.y)) {
            this.y.clear();
        }
        this.L = arrayList;
    }
}

