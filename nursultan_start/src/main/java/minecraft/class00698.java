/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00753
 *  minecraft.class01042
 *  minecraft.class01599
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04446
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07276
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08577
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00693;
import minecraft.class00710;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01042;
import minecraft.class01599;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04446;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07276;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08577;
import org.jspecify.annotations.Nullable;

public class class00698
extends class00710 {
    private static final class02131<class03556<class00693>> L = class03289.N(class00698.class, (class04383)class02154.g);
    public static final float N = 0.0625f;

    @Override
    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (L.equals(class021312)) {
            this.N();
        }
    }

    public class06889 method_43390() {
        return class06889.N((class00753)this.y);
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        this.y(class07211.N((int)class072762.W()));
    }

    public class06584 method_31480() {
        return new class06584((class07310)class06570.bK);
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NC);
        super.method_66649(class026662);
    }

    public class00381<class07280> method_18002(class01599 class015992) {
        return new class07276((class07049)this, this.method_5735().L(), this.s());
    }

    @Override
    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)class08577.y((class01042)this.method_56673(), (class05946)class04227.ym));
    }

    public void method_5808(double d, double d2, double d3, float f, float f2) {
        this.method_5814(d, d2, d3);
    }

    protected void method_5652(class08329 class083292) {
        class083292.N("facing", class07211.field_57038, (Object)this.method_5735());
        super.method_5652(class083292);
        class08577.N((class08329)class083292, this.R());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NC) {
            return (T)class00698.method_66651(class024772, this.R());
        }
        return (T)super.method_58694(class024772);
    }

    protected void method_5749(class08299 class082992) {
        class07211 class072112 = class082992.N("facing", class07211.field_57038).orElse(class07211.field_11035);
        super.method_5749(class082992);
        this.y(class072112);
        class08577.N((class08299)class082992, (class05946)class04227.ym).ifPresent(this::N);
    }

    public class00698(class07078<? extends class00698> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class00698(class07299 class072992, class07209 class072092, class07211 class072112, class03556<class00693> class035562) {
        this(class072992, class072092);
        this.N(class035562);
        this.y(class072112);
    }

    private class00698(class07299 class072992, class07209 class072092) {
        super((class07078<? extends class00710>)class07078.NF, class072992, class072092);
    }

    @Override
    public void i() {
        this.method_5783(class04909.nS, 1.0f, 1.0f);
    }

    private static int y(class03556<class00693> class035562) {
        return ((class00693)((Object)class035562.N())).N();
    }

    public static Optional<class00698> N(class07299 class072992, class07209 class072092, class07211 class072112) {
        class00698 class006982 = new class00698(class072992, class072092);
        ArrayList<class03556> arrayList = new ArrayList<class03556>();
        class072992.method_30349().L(class04227.ym).u(class04446.N).forEach(arrayList::add);
        if (arrayList.isEmpty()) {
            return Optional.empty();
        }
        class006982.y(class072112);
        arrayList.removeIf(class035562 -> {
            class006982.N((class03556<class00693>)class035562);
            return !class006982.y();
        });
        if (arrayList.isEmpty()) {
            return Optional.empty();
        }
        int n = arrayList.stream().mapToInt(class00698::y).max().orElse(0);
        arrayList.removeIf(class035562 -> class00698.y((class03556<class00693>)class035562) < n);
        Optional optional = class07536.y_9(arrayList, (class06069)class006982.field_5974);
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        class006982.N((class03556<class00693>)((class03556)optional.get()));
        class006982.y(class072112);
        return Optional.of(class006982);
    }

    private void N(class03556<class00693> class035562) {
        this.field_6011.N(L, class035562);
    }

    public void N(class04782 class047822, @Nullable class07049 class070492) {
        if (!((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
            return;
        }
        this.method_5783(class04909.nC, 1.0f, 1.0f);
        if (class070492 instanceof class08036 && ((class08036)class070492).method_56992()) {
            return;
        }
        this.method_5706(class047822, (class07310)class06570.bK);
    }

    @Override
    protected class00734 N(class07209 class072092, class07211 class072112) {
        float f = 0.46875f;
        class06889 class068892 = class06889.y((class00753)class072092).N(class072112, -0.46875);
        class00693 class006932 = (class00693)((Object)this.R().N());
        double d = this.N(class006932.y());
        double d2 = this.N(class006932.L());
        class07211 class072113 = class072112.M();
        class06889 class068893 = class068892.N(class072113, d).N(class07211.field_11036, d2);
        class07185 class071852 = class072112.z();
        double d3 = class071852 == class07185.field_11048 ? 0.0625 : (double)class006932.y();
        double d4 = class006932.L();
        double d5 = class071852 == class07185.field_11051 ? 0.0625 : (double)class006932.y();
        return class00734.N(class068893, d3, d4, d5);
    }

    private double N(int n) {
        return n % 2 == 0 ? 0.5 : 0.0;
    }

    public class03556<class00693> R() {
        return (class03556)this.field_6011.N(L);
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NC) {
            this.N((class03556<class00693>)((class03556)class00698.method_66651((class02477)class02484.NC, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }
}

