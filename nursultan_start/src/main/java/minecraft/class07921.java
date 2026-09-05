/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01390
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01434
 *  minecraft.class01686
 *  minecraft.class02862
 *  minecraft.class07311
 *  minecraft.class08098
 *  minecraft.class08874
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.List;
import java.util.Map;
import minecraft.class01390;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01434;
import minecraft.class01686;
import minecraft.class02862;
import minecraft.class07311;
import minecraft.class07937;
import minecraft.class08098;
import minecraft.class08874;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07921 {
    private final class01421 N = new class01421();

    private void N(class07937 class079372, class01422 class014222, class01434 class014342, class01422 class014223, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
        CapturedRenderingState.INSTANCE.setCurrentEntity(0);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
    }

    private void N(class07937 class079372, class01422 class014222, class01434 class014342, class01422 class014223, CallbackInfo callbackInfo, class08098 class080982) {
        ((ModelStorage)class080982).iris$set();
    }

    public void N(class07937 class079372, class01422 class014222, class01434 class014342, class01422 class014223) {
        for (Map.Entry<class07311, List<class08098>> entry : class079372.Z().N.entrySet()) {
            class07311 class073112 = entry.getKey();
            List<class08098> var9 = entry.getValue();
            class01391 class013912 = class014222.method_73477(class073112);
            for (class08098 class080982 : var9) {
                class01391 class013913;
                class01391 class013914 = class080982.i() != null ? (class080982.M() ? class080982.i().method_24108(class02862.N((class01407)class014222, (class07311)class073112, (boolean)class080982.R(), (boolean)true)) : class080982.i().method_24108(class013912)) : (class080982.M() ? class02862.N((class01407)class014222, (class07311)class073112, (boolean)class080982.R(), (boolean)true) : class013912);
                this.N.L().N(class080982.N());
                class01686 class016862 = class080982.y();
                int n = class080982.L();
                int n2 = class080982.u();
                int n3 = class080982.B();
                this.N(class079372, class014222, class014342, class014223, null, class080982);
                class016862.N(this.N, class013914, n, n2, n3);
                if (class080982.z() != 0 && (class073112.method_23289().isPresent() || class073112.method_24295())) {
                    class014342.N(class080982.z());
                    class013913 = class014342.method_73477(class073112);
                    class01686 class016863 = class080982.y();
                    class01391 class013915 = class080982.i() == null ? class013913 : class080982.i().method_24108(class013913);
                    int n4 = class080982.L();
                    int n5 = class080982.u();
                    int n6 = class080982.B();
                    this.N(class079372, class014222, class014342, class014223, null, class080982);
                    class016863.N(this.N, class013915, n4, n5, n6);
                }
                if (class080982.Z() == null) continue;
                class013913 = new class01390(class014223.method_73477((class07311)class08874.m.get(class080982.Z().N())), class080982.Z().y(), 1.0f);
                class01686 class016864 = class080982.y();
                int n7 = class080982.L();
                int n8 = class080982.u();
                int n9 = class080982.B();
                this.N(class079372, class014222, class014342, class014223, null, class080982);
                class016864.N(this.N, class013913, n7, n8, n9);
            }
        }
        this.N(class079372, class014222, class014342, class014223, null);
    }
}

