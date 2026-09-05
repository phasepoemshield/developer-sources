/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01289
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class06683
 *  minecraft.class07055
 *  minecraft.class07077
 *  minecraft.class07079
 *  minecraft.class08004
 *  minecraft.class08234
 */
package minecraft;

import java.util.Set;
import minecraft.class01289;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class06683;
import minecraft.class07055;
import minecraft.class07077;
import minecraft.class07079;
import minecraft.class08004;
import minecraft.class08234;
import minecraft.class08696;
import minecraft.class08727;

public abstract class class08731
extends Enum<class08731> {
    public static final /* enum */ class08731 field_54080 = new class08696("SINGLE", 0, true);
    public static final /* enum */ class08731 field_54081 = new class08727("SPLIT_ON_DEATH", 1, false);
    private static final Set<class02477<?>> field_60523;
    private final boolean field_54082;
    private static final /* synthetic */ class08731[] field_54083;

    class08731(boolean bl) {
        this.field_54082 = bl;
    }

    static {
        field_54083 = class08731.y();
        field_60523 = Set.of(class02484.B, class02484.y);
    }

    public static class08731[] values() {
        return (class08731[])field_54083.clone();
    }

    public static class08731 valueOf(String string) {
        return Enum.valueOf(class08731.class, string);
    }

    private static /* synthetic */ class08731[] y() {
        return new class08731[]{field_54080, field_54081};
    }

    void y(class07079 class070792, class07079 class070793, class08234 class082342) {
        class06683 class066832;
        class07077 class070772;
        class070793.method_6073(class070792.method_6067());
        for (class07055 class070552 : class070792.method_6026()) {
            class070793.method_6092(new class07055(class070552));
        }
        if (class070792.method_6109()) {
            class070793.y(true);
        }
        if (class070792 instanceof class07077) {
            class070772 = (class07077)class070792;
            if (class070793 instanceof class07077) {
                class07055 class070552;
                class070552 = (class07077)class070793;
                class070552.u(class070772.K());
                class070552.T = class070772.T;
                class070552.b = class070772.b;
            }
        }
        class070772 = class070792.method_18868();
        class01289 var5 = class070793.method_18868();
        if (class070772.N_22(class05378.NW, class05367.field_18458) && class070772.N(class05378.NW)) {
            var5.N(class05378.NW, class070772.L(class05378.NW));
        }
        if (class082342.L()) {
            class070793.L(class070792.method_5936());
        }
        class070793.i(class070792.NG());
        class070793.u(class070792.Nt());
        if (class070792.Nm()) {
            class070793.NW();
        }
        class070793.method_5880(class070792.method_5807());
        class070793.method_33572(class070792.method_5809());
        class070793.method_5684(class070792.method_5655());
        class070793.method_5875(class070792.method_5740());
        class070793.method_51850(class070792.method_51848());
        class070793.method_5803(class070792.method_5701());
        class070792.method_5752().forEach(arg_0 -> ((class07079)class070793).method_5780(arg_0));
        for (class02477<?> var7 : field_60523) {
            class08731.N(class070792, class070793, var7);
        }
        if (class082342.u() != null) {
            class066832 = class070793.method_73183().method_8428();
            class066832.N(class070793.method_5845(), class082342.u());
            if (class070792.method_5781() != null && class070792.method_5781() == class082342.u()) {
                class066832.y(class070792.method_5845(), class070792.method_5781());
            }
        }
        if (class070792 instanceof class08004 && (class066832 = (class08004)class070792).Q() && class070793 instanceof class08004) {
            class08004 class080042 = (class08004)class070793;
            class080042.M(true);
        }
    }

    abstract void N(class07079 var1, class07079 var2, class08234 var3);

    private static <T> void N(class07079 class070792, class07079 class070793, class02477<T> class024772) {
        Object object = class070792.method_58694(class024772);
        if (object != null) {
            class070793.method_66653(class024772, object);
        }
    }

    public boolean N() {
        return this.field_54082;
    }
}

