/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02042
 *  minecraft.class06069
 *  minecraft.class07536
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Stream;
import minecraft.class02042;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class06069;
import minecraft.class07536;

public abstract class class03550<T>
implements class03543<T> {
    protected abstract List<class03556<T>> M();

    @Override
    public Iterator<class03556<T>> iterator() {
        return this.M().iterator();
    }

    @Override
    public Spliterator<class03556<T>> spliterator() {
        return this.M().spliterator();
    }

    @Override
    public int y() {
        return this.M().size();
    }

    @Override
    public class03556<T> N(int n) {
        return this.M().get(n);
    }

    @Override
    public boolean N(class02042<T> class020422) {
        return true;
    }

    @Override
    public Optional<class03556<T>> N(class06069 class060692) {
        return class07536.y_9(this.M(), (class06069)class060692);
    }

    @Override
    public Stream<class03556<T>> N() {
        return this.M().stream();
    }
}

