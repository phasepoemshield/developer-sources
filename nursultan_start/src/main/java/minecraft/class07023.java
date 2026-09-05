/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10706
 *  minecraft.class07709
 *  minecraft.class07741
 *  minecraft.class07757
 */
package minecraft;

import Nursultan.class10706;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class06995;
import minecraft.class07029;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class07757;

public sealed interface class07023
extends class07709,
Iterable<class07709>
permits class07741, class07029, class06995, class07757 {
    public class07709 get(int var1);

    public int size();

    public void clear();

    default public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    default public Iterator<class07709> iterator() {
        return new class10706(this);
    }

    default public Stream<class07709> stream() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    public class07709 remove(int var1);

    public boolean y(int var1, class07709 var2);

    public boolean N(int var1, class07709 var2);
}

