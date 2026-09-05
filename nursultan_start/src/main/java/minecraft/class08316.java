/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10413
 *  com.google.common.collect.Streams
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class07001
 *  minecraft.class08296
 *  minecraft.class08299
 */
package minecraft;

import Nursultan.class10413;
import com.google.common.collect.Streams;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class07001;
import minecraft.class08296;
import minecraft.class08299;
import minecraft.class08308;
import minecraft.class08319;
import minecraft.class08323;

class class08316
implements class08319 {
    private final class04490 N;
    private final class08296 y;
    private final List<class07001> L;

    public class08316(class04490 class044902, class08296 class082962, List<class07001> list) {
        this.N = class044902;
        this.y = class082962;
        this.L = list;
    }

    @Override
    public Iterator<class08299> iterator() {
        ListIterator<class07001> var1 = this.L.listIterator();
        return new class08323(this, var1);
    }

    @Override
    public Stream<class08299> y() {
        return Streams.mapWithIndex(this.L.stream(), (class070012, l) -> this.N((int)l, (class07001)class070012));
    }

    @Override
    public boolean N() {
        return this.L.isEmpty();
    }

    class08299 N(int n, class07001 class070012) {
        return class08308.N(this.N.N_46((class04489)new class10413(n)), this.y, class070012);
    }
}

