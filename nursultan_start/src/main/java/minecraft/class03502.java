/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class01194
 *  minecraft.class03508
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class07536
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;
import minecraft.class01194;
import minecraft.class03481;
import minecraft.class03508;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class07536;

public interface class03502 {
    public static final List<class05946<class01194>> B = List.of(class01194.f.B(), class01194.C.B(), class01194.S.B(), class01194.x.B(), class01194.D.B(), class01194.h.B(), class01194.r.B(), class01194.NN.B(), class01194.Ny.B(), class01194.NL.B(), class01194.Nu.B(), class01194.Ni.B(), class01194.NR.B(), class01194.NM.B(), class01194.NB.B());
    public static final int Z = 0;
    public static final ToIntFunction<class05946<class01194>> w_ = (ToIntFunction)class07536.N((Object)new Reference2IntOpenHashMap(), reference2IntOpenHashMap -> {
        reference2IntOpenHashMap.defaultReturnValue(0);
        reference2IntOpenHashMap.put((Object)class01194.a.B(), 1);
        reference2IntOpenHashMap.put((Object)class01194.p.B(), 1);
        reference2IntOpenHashMap.put((Object)class01194.l.B(), 1);
        reference2IntOpenHashMap.put((Object)class01194.K.B(), 2);
        reference2IntOpenHashMap.put((Object)class01194.k.B(), 2);
        reference2IntOpenHashMap.put((Object)class01194.X.B(), 2);
        reference2IntOpenHashMap.put((Object)class01194.Q.B(), 3);
        reference2IntOpenHashMap.put((Object)class01194.V.B(), 3);
        reference2IntOpenHashMap.put((Object)class01194.Y.B(), 3);
        reference2IntOpenHashMap.put((Object)class01194.n.B(), 4);
        reference2IntOpenHashMap.put((Object)class01194.m.B(), 4);
        reference2IntOpenHashMap.put((Object)class01194.A.B(), 4);
        reference2IntOpenHashMap.put((Object)class01194.T.B(), 5);
        reference2IntOpenHashMap.put((Object)class01194.t.B(), 5);
        reference2IntOpenHashMap.put((Object)class01194.b.B(), 6);
        reference2IntOpenHashMap.put((Object)class01194.H.B(), 6);
        reference2IntOpenHashMap.put((Object)class01194.j.B(), 6);
        reference2IntOpenHashMap.put((Object)class01194.P.B(), 7);
        reference2IntOpenHashMap.put((Object)class01194.E.B(), 8);
        reference2IntOpenHashMap.put((Object)class01194.W.B(), 8);
        reference2IntOpenHashMap.put((Object)class01194.z.B(), 9);
        reference2IntOpenHashMap.put((Object)class01194.u.B(), 9);
        reference2IntOpenHashMap.put((Object)class01194.i.B(), 9);
        reference2IntOpenHashMap.put((Object)class01194.M.B(), 9);
        reference2IntOpenHashMap.put((Object)class01194.U.B(), 10);
        reference2IntOpenHashMap.put((Object)class01194.B.B(), 10);
        reference2IntOpenHashMap.put((Object)class01194.N.B(), 10);
        reference2IntOpenHashMap.put((Object)class01194.y.B(), 10);
        reference2IntOpenHashMap.put((Object)class01194.q.B(), 10);
        reference2IntOpenHashMap.put((Object)class01194.o.B(), 10);
        reference2IntOpenHashMap.put((Object)class01194.L.B(), 11);
        reference2IntOpenHashMap.put((Object)class01194.R.B(), 12);
        reference2IntOpenHashMap.put((Object)class01194.d.B(), 12);
        reference2IntOpenHashMap.put((Object)class01194.Z.B(), 13);
        reference2IntOpenHashMap.put((Object)class01194.w.B(), 13);
        reference2IntOpenHashMap.put((Object)class01194.v.B(), 14);
        reference2IntOpenHashMap.put((Object)class01194.J.B(), 14);
        reference2IntOpenHashMap.put((Object)class01194.F.B(), 14);
        reference2IntOpenHashMap.put((Object)class01194.s.B(), 15);
        reference2IntOpenHashMap.put((Object)class01194.G.B(), 15);
        for (int i = 1; i <= 15; ++i) {
            reference2IntOpenHashMap.put(class03502.y(i), i);
        }
    });

    public class03508 L();

    public class03481 u();

    public static class05946<class01194> y(int n) {
        return B.get(n - 1);
    }

    public static int N(class03556<class01194> class035562) {
        return class035562.i().map(class03502::N).orElse(0);
    }

    public static int N(float f, int n) {
        double d = 15.0 / (double)n;
        return Math.max(1, 15 - class04995.N((double)(d * (double)f)));
    }

    public static int N(class05946<class01194> class059462) {
        return w_.applyAsInt(class059462);
    }
}

