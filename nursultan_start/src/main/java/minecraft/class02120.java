/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 *  minecraft.class05630
 *  minecraft.class06202
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import minecraft.class02097;
import minecraft.class02105;
import minecraft.class02117;
import minecraft.class02129;
import minecraft.class05630;
import minecraft.class06202;

public final class class02120
extends class02105 {
    private static final long N = class02120.N(Runtime.getRuntime().maxMemory());
    private final LongList y = new LongArrayList();
    private final LongList L = new LongArrayList();
    private final LongList u = new LongArrayList();

    private void M() {
        this.y.clear();
        this.L.clear();
        this.u.clear();
    }

    private void B() {
        long l = Runtime.getRuntime().totalMemory();
        long l2 = Runtime.getRuntime().freeMemory();
        long l3 = l - l2;
        this.u.add(class02120.N(l3));
    }

    @Override
    public void y(class02097 class020972) {
        class020972.send(class02129.u, class021042 -> {
            class021042.N(class02117.b, new LongArrayList(this.y));
            class021042.N(class02117.j, new LongArrayList(this.L));
            class021042.N(class02117.v, new LongArrayList(this.u));
            class021042.N(class02117.n, this.i());
            class021042.N(class02117.t, ((class05630)class06202.Nq().i_7).Nh());
            class021042.N(class02117.G, (int)N);
        });
        this.M();
    }

    private static long N(long l) {
        return l / 1000L;
    }

    @Override
    public void N(class02097 class020972) {
        if (class06202.Nq().yz()) {
            super.N(class020972);
        }
    }

    @Override
    public void R() {
        this.y.add((long)class06202.Nq().Nx());
        this.B();
        this.L.add(class06202.Nq().W());
    }
}

