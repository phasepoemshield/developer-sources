/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.MatchException
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class01929
 *  minecraft.class02733
 *  minecraft.class02903
 *  minecraft.class02950
 *  minecraft.class03110
 *  minecraft.class03145
 *  minecraft.class03729
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05288
 *  minecraft.class05857
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06695
 *  minecraft.class06704
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07206
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07234
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemStorage
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemVariant
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class01713;
import minecraft.class01929;
import minecraft.class02733;
import minecraft.class02903;
import minecraft.class02950;
import minecraft.class03110;
import minecraft.class03145;
import minecraft.class03729;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05288;
import minecraft.class05857;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06695;
import minecraft.class06704;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07234;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01748
extends class07796 {
    public static final MapCodec<class01748> N = class01748.y(class01748::new);
    public static final class06667 y = class06665.yQ;
    public static final class06667 L = class06665.J;
    private static final class08064<class05288> u = class06665.x;
    private static final int i = 6;
    private static final int R = 4;
    private static final class01713 M = new class01713(10);
    private static final int B = 17;

    public class01748(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(u, (Comparable)class05288.field_23391)).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    private void N(class04782 class047822, class07209 class072092, class03145 class031452, class06584 class065842, class00500 class005002, class03729<?> class037292) {
        class06889 class068892;
        class06889 class068893;
        class07211 class072112 = ((class05288)class005002.L(u)).N();
        class06695 class066952 = class07234.N((class07299)class047822, (class07209)class072092.method_10093(class072112));
        class06584 class065843 = class065842.t();
        if (class066952 != null && (class066952 instanceof class03145 || class065842.c() > class066952.a_(class065842))) {
            while (true) {
                this.N(class047822, class072092, class031452, class065842, class005002, class037292, null, class072112, class066952, class065843);
                if (!class065843.R()) {
                    class068893 = class065843.L(1);
                    class068892 = class07234.N((class06695)class031452, (class06695)class066952, (class06584)class068893, (class07211)class072112.b());
                    this.N(class047822, class072092, class031452, class065842, class005002, class037292, null, class072112, class066952, class065843);
                    if (class068892.R()) {
                        class065843.B(1);
                        continue;
                    }
                }
                break;
            }
        } else if (class066952 != null) {
            int n;
            do {
                this.N(class047822, class072092, class031452, class065842, class005002, class037292, null, class072112, class066952, class065843);
            } while (!class065843.R() && (n = class065843.c()) != (class065843 = class07234.N((class06695)class031452, (class06695)class066952, (class06584)class065843, (class07211)class072112.b())).c());
        }
        this.N(class047822, class072092, class031452, class065842, class005002, class037292, null, class072112, class066952, class065843);
        if (!class065843.R()) {
            class068893 = class06889.y((class00753)class072092);
            class068892 = class068893.N(class072112, 0.7);
            class07206.N((class07299)class047822, (class06584)class065843, (int)6, (class07211)class072112, (class00737)class068892);
            for (class04770 class047702 : class047822.N(class04770.class, class00734.N((class06889)class068893, (double)17.0, (double)17.0, (double)17.0))) {
                class06912.NR.N(class047702, class037292.N(), (List)class031452.aC_());
            }
            class047822.N(1049, class072092, 0);
            class047822.N(2010, class072092, class072112.L());
        }
    }

    public static Optional<class03729<class05857>> N(class04782 class047822, class02903 class029032) {
        return M.N(class047822, class029032);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092) {
        class00394 class003942 = class047822.method_8321(class072092);
        if (!(class003942 instanceof class03145)) {
            return;
        }
        class03145 class031452 = (class03145)class003942;
        class003942 = class031452.u();
        Optional<class03729<class05857>> var6 = class01748.N(class047822, (class02903)class003942);
        if (var6.isEmpty()) {
            class047822.N(1050, class072092, 0);
            return;
        }
        class03729<class05857> var7 = var6.get();
        class06584 class065843 = ((class05857)var7.y()).method_8116((class02950)class003942, (class01929)class047822.method_30349());
        if (class065843.R()) {
            class047822.N(1050, class072092, 0);
            return;
        }
        class031452.y(6);
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true)), 2);
        class065843.N((class07299)class047822);
        this.N(class047822, class072092, class031452, class065843, class005002, var7);
        for (class06584 class065844 : ((class05857)var7.y()).N((class02903)class003942)) {
            if (class065844.R()) continue;
            this.N(class047822, class072092, class031452, class065844, class005002, var7);
        }
        class031452.aC_().forEach(class065842 -> {
            if (class065842.R()) {
                return;
            }
            class065842.B(1);
        });
        class031452.method_5431();
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942;
        if (!class072992.method_8608() && (class003942 = class072992.method_8321(class072092)) instanceof class03145) {
            class03145 class031452 = (class03145)class003942;
            class080362.method_17355((class06237)class031452);
        }
        return class07082.N;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }

    private void N(class04782 class047822, class07209 class072092, class03145 class031452, class06584 class065842, class00500 class005002, class03729 class037292, CallbackInfo callbackInfo, class07211 class072112, class06695 class066952, class06584 class065843) {
        if (class066952 != null) {
            return;
        }
        if (class065843.R()) {
            return;
        }
        Storage var11 = (Storage)ItemStorage.SIDED.find((class07299)class047822, class072092.method_10093(class072112), (Object)class072112.b());
        if (var11 != null) {
            try (Transaction transaction = Transaction.openOuter();){
                long l = var11.insert((Object)ItemVariant.of((class06584)class065843), (long)class065842.c(), (TransactionContext)transaction);
                if (l > 0L) {
                    class065843.B((int)l);
                    transaction.commit();
                }
            }
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{u, L, y});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return (class00500)class005002.y(u, (Comparable)class071112.N().N((class05288)class005002.L(u)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(u, (Comparable)class069932.N().N((class05288)class005002.L(u)));
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        this.N(class005002, class047822, class072092);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        boolean bl2 = class072992.W(class072092);
        boolean bl3 = (Boolean)class005002.L((class08092)L);
        class00394 class003942 = class072992.method_8321(class072092);
        if (bl2 && !bl3) {
            class072992.N(class072092, (class00891)this, 4);
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(true)), 2);
            this.N(class003942, true);
        } else if (!bl2 && bl3) {
            class072992.method_8652(class072092, (class00500)((class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)y, (Comparable)Boolean.valueOf(false)), 2);
            this.N(class003942, false);
        }
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class03145) {
            return ((class03145)class003942).U();
        }
        return 0;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected MapCodec<class01748> N() {
        return N;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class072992.N(class072092, (class00891)this, 4);
        }
    }

    public class00500 N(class06942 class069422) {
        class07211 class072112 = class069422.L().b();
        class07211 class072113 = switch (class03110.N[class072112.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> class069422.method_8042().b();
            case 2 -> class069422.method_8042();
            case 3, 4, 5, 6 -> class07211.field_11036;
        };
        return (class00500)((class00500)this.W().y(u, (Comparable)class05288.N((class07211)class072112, (class07211)class072113))).y((class08092)L, (Comparable)Boolean.valueOf(class069422.method_8045().W(class069422.method_8037())));
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        class03145 class031452 = new class03145(class072092, class005002);
        class031452.N(class005002.y((class08092)L) && (Boolean)class005002.L((class08092)L) != false);
        return class031452;
    }

    private void N(@Nullable class00394 class003942, boolean bl) {
        if (class003942 instanceof class03145) {
            ((class03145)class003942).N(bl);
        }
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class072992.method_8608() ? null : class01748.N(class004042, (class00404)class00404.field_46808, class03145::N);
    }
}

