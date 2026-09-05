/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01137
 *  minecraft.class01203
 *  minecraft.class01362
 *  minecraft.class05288
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07185
 *  minecraft.class07190
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01137;
import minecraft.class01203;
import minecraft.class01362;
import minecraft.class04853;
import minecraft.class04858;
import minecraft.class05288;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07190;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;

public class class04884
extends class00891
implements class01137,
class07190 {
    public static final MapCodec<class04884> N = class04884.y(class04884::new);
    public static final class08064<class05288> y = class06665.x;

    public static class07211 T(class00500 class005002) {
        return ((class05288)class005002.L(y)).y();
    }

    public class04884(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y(y, (Comparable)class05288.field_23391));
    }

    public static class07211 U(class00500 class005002) {
        return ((class05288)class005002.L(y)).N();
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class04858 && class080362.method_7338()) {
            class080362.method_16354((class04858)class003942);
            return class07082.N;
        }
        return class07082.i;
    }

    public static boolean N(class01203 class012032, class01203 class012033) {
        class07211 class072112 = class04884.U(class012032.N().y());
        class07211 class072113 = class04884.U(class012033.N().y());
        class07211 class072114 = class04884.T(class012032.N().y());
        class07211 class072115 = class04884.T(class012033.N().y());
        boolean bl = class012032.y() == class04853.field_23329;
        return class072112 == class072113.b() && (bl || class072114 == class072115) && class012032.i().equals((Object)class012033.L());
    }

    public MapCodec<class04884> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N().N((class05288)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return (class00500)class005002.y(y, (Comparable)class071112.N().N((class05288)class005002.L(y)));
    }

    public class00500 N(class06942 class069422) {
        class07211 class072112 = class069422.method_8038();
        class07211 class072113 = class072112.z() == class07185.field_11052 ? class069422.method_8042().b() : class07211.field_11036;
        return (class00500)this.W().y(y, (Comparable)class05288.N((class07211)class072112, (class07211)class072113));
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class04858(class072092, class005002);
    }
}

