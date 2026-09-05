/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10318
 *  minecraft.class07321
 */
package minecraft;

import Nursultan.class10318;
import java.util.function.Consumer;
import minecraft.class04158;
import minecraft.class07321;

public interface class04157 {
    public static final class04157 N = new class04158();

    default public boolean y(int n, int n2) {
        return this.N(n, n2, false);
    }

    public void N(Consumer<class07321> var1);

    public static boolean N(int n, int n2, int n3, int n4, int n5) {
        return class04157.N(n, n2, n3, n4, n5, false);
    }

    public static boolean N(int n, int n2, int n3, int n4, int n5, boolean bl) {
        int n6 = bl ? 2 : 1;
        long l = Math.max(0, Math.abs(n4 - n) - n6);
        long l2 = Math.max(0, Math.abs(n5 - n2) - n6);
        long l3 = l * l + l2 * l2;
        int n7 = n3 * n3;
        return l3 < (long)n7;
    }

    public static class04157 N(class07321 class073212, int n) {
        return new class10318(class073212, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void N(class04157 class041572, class04157 class041573, Consumer<class07321> consumer, Consumer<class07321> consumer2) {
        class10318 class103182;
        class10318 class103183;
        block8: {
            block7: {
                if (class041572.equals(class041573)) {
                    return;
                }
                if (!(class041572 instanceof class10318)) break block7;
                class103183 = (class10318)class041572;
                if (class041573 instanceof class10318 && class103183.N(class103182 = (class10318)class041573)) break block8;
            }
            class041572.N(consumer2);
            class041573.N(consumer);
            return;
        }
        int n = Math.min(class103183.N(), class103182.N());
        int n2 = Math.min(class103183.y(), class103182.y());
        int n3 = Math.max(class103183.L(), class103182.L());
        int n4 = Math.max(class103183.u(), class103182.u());
        int n5 = n;
        while (n5 <= n3) {
            for (int i = n2; i <= n4; ++i) {
                boolean bl;
                boolean bl2 = class103183.N(n5, i);
                if (bl2 == (bl = class103182.N(n5, i))) continue;
                if (bl) {
                    consumer.accept(new class07321(n5, i));
                    continue;
                }
                consumer2.accept(new class07321(n5, i));
            }
            ++n5;
        }
        return;
    }

    default public boolean N(class07321 class073212) {
        return this.N(class073212.B, class073212.Z);
    }

    default public boolean N(int n, int n2) {
        return this.N(n, n2, true);
    }

    public boolean N(int var1, int var2, boolean var3);
}

