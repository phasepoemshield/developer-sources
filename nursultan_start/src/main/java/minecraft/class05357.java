/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class01885
 *  minecraft.class01896
 *  minecraft.class02071
 *  minecraft.class02102
 *  minecraft.class03556
 *  minecraft.class03686
 *  minecraft.class04227
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 */
package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class01885;
import minecraft.class01896;
import minecraft.class02071;
import minecraft.class02102;
import minecraft.class03556;
import minecraft.class03686;
import minecraft.class04227;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05350;
import minecraft.class05362;
import minecraft.class05371;

public class class05357
extends class05096 {
    private static final class00392 u = class00392.L((String)"createWorld.customize.buffet.search").L(class04927.field_62466);
    private static final int i = 3;
    private static final int R = 15;
    final class03686 N;
    private final class05096 M;
    private final Consumer<class03556<class00780>> B;
    final class00751<class00780> y;
    private class05371 Z;
    class03556<class00780> L;
    private class05362 z;

    public class05357(class05096 class050962, class01896 class018962, Consumer<class03556<class00780>> consumer) {
        super((class00392)class00392.L((String)"createWorld.customize.buffet.title"));
        this.M = class050962;
        this.B = consumer;
        Objects.requireNonNull(this.field_22793);
        this.N = new class03686((class05096)this, 13 + 9 + 3 + 15, 33);
        this.y = class018962.N().L(class04227.NA);
        class03556 var4 = (class03556)this.y.N(class00795.y).or(() -> this.y.z().findAny()).orElseThrow();
        this.L = class018962.i().N().u().L().stream().findFirst().orElse(var4);
    }

    void N() {
        this.z.field_22763 = this.Z.method_25334() != null;
    }

    public void method_25426() {
        class01885 class018852 = (class01885)this.N.N((class02102)class01885.u().N(3));
        class018852.L().y();
        class018852.N((class02102)new class02071(this.method_25440(), this.field_22793));
        class04927 class049272 = (class04927)class018852.N((class02102)new class04927(this.field_22793, 200, 15, (class00392)class00392.i()));
        class05371 class053712 = new class05371(this);
        class049272.method_47404(u);
        class049272.method_1863(class053712::N);
        this.Z = (class05371)this.N.L((class02102)class053712);
        class01885 class018853 = (class01885)this.N.y((class02102)class01885.i().N(8));
        this.z = (class05362)class018853.N((class02102)class05362.method_46430(class05220.u, class053622 -> {
            this.B.accept(this.L);
            this.method_25419();
        }).N());
        class018853.N((class02102)class05362.method_46430(class05220.i, class053622 -> this.method_25419()).N());
        this.Z.method_25313((class05350)this.Z.method_25396().stream().filter(class053502 -> Objects.equals(class053502.N, this.L)).findFirst().orElse(null));
        this.N.method_48206(arg_0 -> ((class05357)this).method_37063(arg_0));
        this.method_48640();
    }

    public void method_48640() {
        this.N.N();
        this.Z.method_57712(this.field_22789, this.N);
    }

    public void method_25419() {
        this.field_22787.N(this.M);
    }
}

