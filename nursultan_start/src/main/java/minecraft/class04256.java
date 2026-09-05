/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class01180
 *  minecraft.class01188
 *  minecraft.class01226
 *  minecraft.class02221
 *  minecraft.class02242
 *  minecraft.class02245
 *  minecraft.class02484
 *  minecraft.class02562
 *  minecraft.class02758
 *  minecraft.class02795
 *  minecraft.class04832
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class07050
 *  minecraft.class07070
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class08155
 *  minecraft.class08186
 *  minecraft.class08467
 *  minecraft.class08827
 *  minecraft.class08943
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import minecraft.class01180;
import minecraft.class01188;
import minecraft.class01226;
import minecraft.class02221;
import minecraft.class02242;
import minecraft.class02245;
import minecraft.class02484;
import minecraft.class02562;
import minecraft.class02758;
import minecraft.class02795;
import minecraft.class04832;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class08155;
import minecraft.class08186;
import minecraft.class08467;
import minecraft.class08827;
import minecraft.class08943;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;

@Environment(value=EnvType.CLIENT)
public abstract class class04256<T extends class07079, S extends class08467, M extends class01188<S>>
extends class02795<T, S, M> {
    private static class07070 L(class07438 class074382) {
        class07070 class070702 = class074382.method_6068();
        return class074382.fields_0212a028292fd3c078969e3ee4c71d9e8_6 == class07050.field_5808 ? class070702 : class070702.N();
    }

    public class04256(class04832 class048322, M m, float f) {
        this(class048322, m, m, f);
    }

    public class04256(class04832 class048322, M m, M m2, float f, class02221 class022212) {
        super(class048322, m, m2, f);
        this.N((class06249)new class02245((class06252)this, class048322.R(), class048322.U(), class022212));
        this.N((class06249)new class02242((class06252)this, class048322.R(), class048322.B()));
        this.N((class06249)new class02758((class06252)this));
    }

    public class04256(class04832 class048322, M m, M m2, float f) {
        this(class048322, m, m2, f, class02221.N);
    }

    private static boolean N(class06584 class065842, class07085 class070852, Operation operation) {
        return (Boolean)operation.call(new Object[]{class065842, class070852}) != false || ArmorRendererRegistryImpl.get((class06581)class065842.B()) != null;
    }

    public void method_62354(T t, S s, float f) {
        super.method_62354(t, s, f);
        class04256.N(t, s, f, this.L);
        ((class08467)s).NV = this.N(t, class07070.field_6182);
        ((class08467)s).No = this.N(t, class07070.field_6183);
    }

    public class01180 N(T t, class07070 class070702) {
        class06584 class065842 = t.method_61420(class070702);
        class08186 class081862 = (class08186)class065842.method_58694(class02484.a);
        if (class081862 != null && class081862.N() == class08155.field_63400 && ((class07438)t).fields_0212a028292fd3c078969e3ee4c71d9e8_4.booleanValue()) {
            return class01180.field_63543;
        }
        if (class065842.N(class01226.LR)) {
            return class01180.field_63543;
        }
        return class01180.field_3409;
    }

    public static void N(class07438 class074382, class08467 class084672, float f, class08943 class089432) {
        class08827.N((class07438)class074382, (class08827)class084672, (class08943)class089432, (float)f);
        class084672.Z = class074382.method_18276();
        class084672.g = class074382.method_6128();
        class084672.I = class074382.method_20232();
        class084672.J = class074382.method_5765();
        class084672.u = 1.0f;
        if (class084672.g) {
            class084672.u = (float)class074382.method_18798().B();
            class084672.u /= 0.2f;
            class084672.u *= class084672.u * class084672.u;
        }
        if (class084672.u < 1.0f) {
            class084672.u = 1.0f;
        }
        class084672.L = class074382.method_6024(f);
        class084672.M = class04256.L(class074382);
        class084672.B = class074382.method_6058();
        class084672.i = class06593.y((class06584)class074382.method_6030(), (class07438)class074382);
        class084672.R = class074382.method_75120(f);
        class084672.o = class074382.method_6115();
        class084672.q = class074382.fields_5212a028292fd3c078969e3ee4c71d9e8_1.N(f);
        class084672.K = class074382.fields_5212a028292fd3c078969e3ee4c71d9e8_1.y(f);
        class084672.V = class074382.fields_5212a028292fd3c078969e3ee4c71d9e8_1.L(f);
        class084672.e = class04256.N(class074382, class07085.field_6169);
        class084672.H = class04256.N(class074382, class07085.field_6174);
        class084672.c = class04256.N(class074382, class07085.field_6172);
        class084672.X = class04256.N(class074382, class07085.field_6166);
    }

    private static class06584 N(class07438 class074382, class07085 class070852) {
        class06584 class065842 = class074382.method_6118(class070852);
        return class04256.N(class065842, class070852, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_1799, net.minecraft.class_1304]");
            return class02562.N((class06584)((class06584)objectArray[0]), (class07085)((class07085)objectArray[1]));
        }) ? class065842.t() : class06584.E;
    }
}

