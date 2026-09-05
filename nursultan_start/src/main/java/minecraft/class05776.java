/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00143
 *  minecraft.class01289
 *  minecraft.class03556
 *  minecraft.class03927
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class05946
 *  minecraft.class06289
 *  minecraft.class06293
 *  minecraft.class07049
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08041
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00143;
import minecraft.class01289;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class06293;
import minecraft.class07049;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08041;

public class class05776
extends class05765<class08041> {
    private long N;

    @Override
    protected void L(class04782 class047822, class08041 class080412, long l) {
        class08041 class080413 = (class08041)class080412.method_18868().L(class05378.j).get();
        if (class080412.method_5858((class07049)class080413) > 5.0) {
            return;
        }
        class06293.N((class07438)class080412, (class07438)class080413, (float)0.5f, (int)2);
        if (l >= this.N) {
            class080412.d();
            class080413.d();
            this.N(class047822, class080412, class080413);
        } else if (class080412.method_59922().y(35) == 0) {
            class047822.method_8421((class07049)class080413, (byte)12);
            class047822.method_8421((class07049)class080412, (byte)12);
        }
    }

    public class05776() {
        super((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.j, (Object)class05367.field_18456, (Object)class05378.B, (Object)class05367.field_18456), 350, 350);
    }

    @Override
    protected void u(class04782 class047822, class08041 class080412, long l) {
        class080412.method_18868().y(class05378.j);
    }

    private Optional<class07209> y(class04782 class047822, class08041 class080412) {
        return class047822.method_19494().N(class035562 -> class035562.N(class03927.m), (class035562, class072092) -> this.N(class080412, (class07209)class072092, (class03556<class05369>)class035562), class080412.method_24515(), 48);
    }

    private Optional<class08041> y(class04782 class047822, class08041 class080412, class08041 class080413) {
        class08041 class080414 = class080412.y(class047822, (class07077)class080413);
        if (class080414 == null) {
            return Optional.empty();
        }
        class080412.u(6000);
        class080413.u(6000);
        class080414.u(-24000);
        class080414.method_5808(class080412.method_23317(), class080412.method_23318(), class080412.method_23321(), 0.0f, 0.0f);
        class047822.y((class07049)class080414);
        class047822.method_8421((class07049)class080414, (byte)12);
        return Optional.of(class080414);
    }

    @Override
    protected void y(class04782 class047822, class08041 class080412, long l) {
        class07077 class070772 = (class07077)class080412.method_18868().L(class05378.j).get();
        class06293.N((class07438)class080412, (class07438)class070772, (float)0.5f, (int)2);
        class047822.method_8421((class07049)class070772, (byte)18);
        class047822.method_8421((class07049)class080412, (byte)18);
        int n = 275 + class080412.method_59922().y(50);
        this.N = l + (long)n;
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412) {
        return this.N(class080412);
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412, long l) {
        return l <= this.N && this.N(class080412);
    }

    private boolean N(class08041 class080412) {
        class01289 var2 = class080412.method_18868();
        Optional<class07077> var3 = var2.L(class05378.j).filter(class070772 -> class070772.method_5864() == class07078.ye);
        if (var3.isEmpty()) {
            return false;
        }
        return class06293.N((class01289)var2, (class05378)class05378.j, (class07078)class07078.ye) && class080412.q() && var3.get().q();
    }

    private boolean N(class08041 class080412, class07209 class072092, class03556<class05369> class035562) {
        class00143 class001432 = class080412.f().N(class072092, ((class05369)class035562.N()).L());
        return class001432 != null && class001432.z();
    }

    private void N(class04782 class047822, class08041 class080412, class08041 class080413) {
        Optional<class07209> var4 = this.y(class047822, class080412);
        if (var4.isEmpty()) {
            class047822.method_8421((class07049)class080413, (byte)13);
            class047822.method_8421((class07049)class080412, (byte)13);
        } else {
            Optional<class08041> var5 = this.y(class047822, class080412, class080413);
            if (var5.isPresent()) {
                this.N(class047822, var5.get(), var4.get());
            } else {
                class047822.method_19494().y(var4.get());
                class047822.method_74535().y(var4.get());
            }
        }
    }

    private void N(class04782 class047822, class08041 class080412, class07209 class072092) {
        class06289 class062892 = class06289.N((class05946)class047822.method_27983(), (class07209)class072092);
        class080412.method_18868().N(class05378.y, (Object)class062892);
    }
}

