/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.ShortIterator
 *  it.unimi.dsi.fastutil.shorts.ShortSet
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00667
 *  minecraft.class00891
 *  minecraft.class01296
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;
import minecraft.class00381;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00667;
import minecraft.class00891;
import minecraft.class01296;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07280;

public class class07261
implements class00381<class07280> {
    public static final class02362<class00667, class07261> N = class00381.N(class07261::N, class07261::new);
    private static final int y = 12;
    private final class01296 L;
    private final short[] u;
    private final class00500[] i;

    public class07261(class01296 class012962, ShortSet shortSet, class00554 class005542) {
        this.L = class012962;
        int n = shortSet.size();
        this.u = new short[n];
        this.i = new class00500[n];
        int n2 = 0;
        ShortIterator shortIterator = shortSet.iterator();
        while (shortIterator.hasNext()) {
            short s;
            this.u[n2] = s = ((Short)shortIterator.next()).shortValue();
            this.i[n2] = class005542.N(class01296.N((short)s), class01296.y((short)s), class01296.L((short)s));
            ++n2;
        }
    }

    private class07261(class00667 class006672) {
        this.L = (class01296)class01296.R.decode((Object)class006672);
        int n = class006672.E();
        this.u = new short[n];
        this.i = new class00500[n];
        for (int i = 0; i < n; ++i) {
            long l = class006672.W();
            this.u[i] = (short)(l & 0xFFFL);
            this.i[i] = (class00500)class00891.U.N((int)(l >>> 12));
        }
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class01296.R.encode((Object)class006672, (Object)this.L);
        class006672.L(this.u.length);
        for (int i = 0; i < this.u.length; ++i) {
            class006672.N((long)class00891.W((class00500)this.i[i]) << 12 | (long)this.u[i]);
        }
    }

    public void N(BiConsumer<class07209, class00500> biConsumer) {
        class07218 class072182 = new class07218();
        for (int i = 0; i < this.u.length; ++i) {
            short s = this.u[i];
            class072182.N(this.L.u(s), this.L.i(s), this.L.R(s));
            biConsumer.accept((class07209)class072182, this.i[i]);
        }
    }

    public class02897<class07261> method_65080() {
        return class04248.NG;
    }
}

