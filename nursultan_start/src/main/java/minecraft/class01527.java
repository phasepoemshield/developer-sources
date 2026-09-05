/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class02484
 *  minecraft.class02820
 *  minecraft.class04782
 *  minecraft.class04854
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05751
 *  minecraft.class05765
 *  minecraft.class06293
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07172
 *  minecraft.class07438
 *  minecraft.class08038
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01503;
import minecraft.class02484;
import minecraft.class02820;
import minecraft.class04782;
import minecraft.class04854;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05765;
import minecraft.class06293;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07172;
import minecraft.class07438;
import minecraft.class08038;

public class class01527<E extends class07079, T extends class07438>
extends class05765<E> {
    private static final int N = 1200;
    private int y;
    private class01503 L = class01503.field_22295;

    protected void L(class04782 class047822, E e, long l) {
        if (e.method_6115()) {
            e.method_6021();
        }
        if (e.method_24518(class06570.dw)) {
            ((class04854)e).N(false);
            e.method_6030().N(class02484.x, (Object)class02820.N);
        }
    }

    public class01527() {
        super((Map)ImmutableMap.of((Object)class05378.P, (Object)class05367.field_18458, (Object)class05378.s, (Object)class05367.field_18456), 1200);
    }

    private void y(class07079 class070792, class07438 class074382) {
        class070792.method_18868().N(class05378.P, (Object)new class05751((class07049)class074382, true));
    }

    private static class07438 y(class07438 class074382) {
        return (class07438)class074382.method_18868().L(class05378.s).get();
    }

    protected void y(class04782 class047822, E e, long l) {
        class07438 class074382 = class01527.y(e);
        this.y((class07079)e, class074382);
        this.N(e, class074382);
    }

    protected boolean N(class04782 class047822, E e, long l) {
        return e.method_18868().N(class05378.s) && this.N(class047822, e);
    }

    protected boolean N(class04782 class047822, E e) {
        class07438 class074382 = class01527.y(e);
        return e.method_24518(class06570.dw) && class06293.y(e, (class07438)class074382) && class06293.N(e, (class07438)class074382, (int)0);
    }

    private void N(E e, class07438 class074382) {
        if (this.L == class01503.field_22295) {
            e.method_6019(class08038.N(e, (class06581)class06570.dw));
            this.L = class01503.field_22296;
            ((class04854)e).N(true);
        } else if (this.L == class01503.field_22296) {
            class06584 class065842;
            int n;
            if (!e.method_6115()) {
                this.L = class01503.field_22295;
            }
            if ((n = e.method_6048()) >= class06593.y((class06584)(class065842 = e.method_6030()), e)) {
                e.method_6075();
                this.L = class01503.field_22297;
                this.y = 20 + e.method_59922().y(20);
                ((class04854)e).N(false);
            }
        } else if (this.L == class01503.field_22297) {
            --this.y;
            if (this.y == 0) {
                this.L = class01503.field_22298;
            }
        } else if (this.L == class01503.field_22298) {
            ((class07172)e).N(class074382, 1.0f);
            this.L = class01503.field_22295;
        }
    }
}

