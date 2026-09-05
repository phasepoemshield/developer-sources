/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01390
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01434
 *  minecraft.class06271
 *  minecraft.class07311
 *  minecraft.class07529
 *  minecraft.class07937
 *  minecraft.class08874
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import minecraft.class01390;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01434;
import minecraft.class06271;
import minecraft.class07311;
import minecraft.class07529;
import minecraft.class07937;
import minecraft.class08103;
import minecraft.class08107;
import minecraft.class08108;
import minecraft.class08874;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08135 {
    private final class01421 N = new class01421();

    private void N(class01422 class014222, class01434 class014342, List list, class01422 class014223, CallbackInfo callbackInfo, class08108 class081082) {
        ((ModelStorage)class081082.N()).iris$set();
    }

    private void N(class01422 class014222, class01434 class014342, Map map, class01422 class014223, CallbackInfo callbackInfo, class08107 class081072) {
        ((ModelStorage)class081072).iris$set();
    }

    private void N(class07937 class079372, class01422 class014222, class01434 class014342, class01422 class014223, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
        CapturedRenderingState.INSTANCE.setCurrentEntity(0);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
    }

    public void N(class07937 class079372, class01422 class014222, class01434 class014342, class01422 class014223) {
        class08103 class081032 = class079372.E();
        this.N(class014222, class014342, class081032.N, class014223);
        class081032.y.sort(Comparator.comparingDouble(class081082 -> -class081082.L().lengthSquared()));
        this.N(class014222, class014342, class081032.y, class014223);
        this.N(class079372, class014222, class014342, class014223, null);
    }

    private void N(class01422 class014222, class01434 class014342, List<class08108<?>> list, class01422 class014223) {
        for (class08108<?> class081082 : list) {
            this.N(class014222, class014342, list, class014223, null, class081082);
            this.N(class081082.N(), class081082.y(), class014222.method_73477(class081082.y()), class014342, class014223);
        }
    }

    private void N(class01422 class014222, class01434 class014342, Map<class07311, List<class08107<?>>> map, class01422 class014223) {
        Object object;
        Object object2;
        if (class07529.d) {
            object2 = new ArrayList(map.entrySet());
            Collections.shuffle(object2);
            object = object2;
        } else {
            object = map.entrySet();
        }
        object2 = object.iterator();
        while (object2.hasNext()) {
            Map.Entry entry = (Map.Entry)object2.next();
            class01391 class013912 = class014222.method_73477((class07311)entry.getKey());
            for (class08107 class081072 : (List)entry.getValue()) {
                this.N(class014222, class014342, map, class014223, null, class081072);
                this.N(class081072, (class07311)entry.getKey(), class013912, class014342, class014223);
            }
        }
    }

    private <S> void N(class08107<S> class081072, class07311 class073112, class01391 class013912, class01434 class014342, class01422 class014222) {
        class01391 class013913;
        this.N.N();
        this.N.L().N(class081072.N());
        class06271 class062712 = class081072.y();
        class01391 class013914 = class081072.M() == null ? class013912 : class081072.M().method_24108(class013912);
        class062712.method_2819(class081072.L());
        class062712.method_62100(this.N, class013914, class081072.u(), class081072.i(), class081072.R());
        if (class081072.B() != 0 && (class073112.method_23289().isPresent() || class073112.method_24295())) {
            class014342.N(class081072.B());
            class013913 = class014342.method_73477(class073112);
            class062712.method_62100(this.N, class081072.M() == null ? class013913 : class081072.M().method_24108(class013913), class081072.u(), class081072.i(), class081072.R());
        }
        if (class081072.Z() != null && class073112.method_23037()) {
            class013913 = new class01390(class014222.method_73477((class07311)class08874.m.get(class081072.Z().N())), class081072.Z().y(), 1.0f);
            class062712.method_62100(this.N, class081072.M() == null ? class013913 : class081072.M().method_24108(class013913), class081072.u(), class081072.i(), class081072.R());
        }
        this.N.y();
    }
}

