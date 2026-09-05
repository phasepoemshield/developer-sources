/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00143
 *  minecraft.class01312
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06293
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class00143;
import minecraft.class01312;
import minecraft.class04067;
import minecraft.class04102;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06293;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07438;

public class class04079
extends class05765<class04067> {
    public static final int N = 100;
    public static final int y = 6;
    public static final int L = 10;
    private static final float R = 1.75f;
    private static final float Z = 0.75f;
    public static final int u = 100;
    public static final int i = 5;
    private int z;
    private int U;
    private final class04891 E;
    private final class04891 W;
    private class04102 m = class04102.field_37494;

    protected void L(class04782 class047822, class04067 class040672, long l) {
        class040672.method_18868().y(class05378.s);
        class040672.B();
        class040672.method_18380(class01312.field_18076);
    }

    public class04079(class04891 class048912, class04891 class048913) {
        super((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18457, (Object)class05378.P, (Object)class05367.field_18458, (Object)class05378.s, (Object)class05367.field_18456, (Object)class05378.NN, (Object)class05367.field_18457), 100);
        this.E = class048912;
        this.W = class048913;
    }

    protected void u(class04782 class047822, class04067 class040672, long l) {
        class07438 class074382 = (class07438)class040672.method_18868().L(class05378.s).get();
        class040672.L((class07049)class074382);
        switch (this.m.ordinal()) {
            case 0: {
                if (class074382.method_5739((class07049)class040672) < 1.75f) {
                    class047822.method_43129(null, (class07049)class040672, this.E, class04911.field_15254, 2.0f, 1.0f);
                    class040672.method_18380(class01312.field_37423);
                    class074382.method_18799(class074382.method_73189().N(class040672.method_73189()).u().L(0.75));
                    this.z = 0;
                    this.m = class04102.field_38415;
                    break;
                }
                if (this.U <= 0) {
                    class040672.method_18868().N(class05378.m, (Object)new class05352(class074382.method_73189(), 2.0f, 0));
                    this.U = 10;
                    break;
                }
                --this.U;
                break;
            }
            case 1: {
                if (this.z++ < 6) break;
                this.m = class04102.field_37493;
                this.y(class047822, class040672);
                break;
            }
            case 2: {
                if (this.z >= 10) {
                    this.m = class04102.field_37494;
                    break;
                }
                ++this.z;
                break;
            }
        }
    }

    private void y(class04067 class040672, class07438 class074382) {
        boolean bl;
        List var3 = class040672.method_18868().L(class05378.Ny).orElseGet(ArrayList::new);
        boolean bl2 = bl = !var3.contains(class074382.method_5667());
        if (var3.size() == 5 && bl) {
            var3.remove(0);
        }
        if (bl) {
            var3.add(class074382.method_5667());
        }
        class040672.method_18868().N(class05378.Ny, (Object)var3, 100L);
    }

    private void y(class04782 class047822, class04067 class040672) {
        class07049 class070492;
        class047822.method_43129(null, (class07049)class040672, this.W, class04911.field_15254, 2.0f, 1.0f);
        Optional<class07049> var3 = class040672.W();
        if (var3.isPresent() && (class070492 = var3.get()).method_5805()) {
            class040672.method_6121(class047822, class070492);
            if (!class070492.method_5805()) {
                class070492.method_5650(class07062.field_26998);
            }
        }
    }

    protected void y(class04782 class047822, class04067 class040672, long l) {
        class07438 class074382 = (class07438)class040672.method_18868().L(class05378.s).get();
        class06293.N((class07438)class040672, (class07438)class074382);
        class040672.L((class07049)class074382);
        class040672.method_18868().N(class05378.m, (Object)new class05352(class074382.method_73189(), 2.0f, 0));
        this.U = 10;
        this.m = class04102.field_37492;
    }

    private boolean N(class04067 class040672, class07438 class074382) {
        class00143 class001432 = class040672.f().N((class07049)class074382, 0);
        return class001432 != null && class001432.W() < 1.75f;
    }

    protected boolean N(class04782 class047822, class04067 class040672) {
        class07438 class074382 = (class07438)class040672.method_18868().L(class05378.s).get();
        boolean bl = this.N(class040672, class074382);
        if (!bl) {
            class040672.method_18868().y(class05378.s);
            this.y(class040672, class074382);
        }
        return bl && class040672.method_18376() != class01312.field_37422 && class04067.N(class074382);
    }

    protected boolean N(class04782 class047822, class04067 class040672, long l) {
        return class040672.method_18868().N(class05378.s) && this.m != class04102.field_37494 && !class040672.method_18868().N(class05378.NN);
    }
}

