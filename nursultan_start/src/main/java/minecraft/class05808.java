/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00044
 *  minecraft.class00122
 *  minecraft.class00137
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03836
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07536
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements
 *  net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl
 */
package minecraft;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import minecraft.class00044;
import minecraft.class00122;
import minecraft.class00137;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03836;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class05798;
import minecraft.class05800;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07536;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl;

@Environment(value=EnvType.CLIENT)
public class class05808
implements class00122 {
    private static final long N = 3000L;
    private final class06202 y;
    private final List<class05800> L = Lists.newArrayList();
    private boolean u;
    private final List<class05800> i = new ArrayList<class05800>();

    public class05808(class06202 class062022) {
        this.y = class062022;
    }

    private void y(class01054 class010542) {
        class09033 class090332 = this.y.Nr();
        if (!this.u && ((Boolean)((class05630)this.y.i_7).NU().method_41753()).booleanValue()) {
            class090332.N((class00122)this);
            this.u = true;
        } else if (this.u && !((Boolean)((class05630)this.y.i_7).NU().method_41753()).booleanValue()) {
            class090332.y((class00122)this);
            this.u = false;
        }
        if (!this.u) {
            return;
        }
        class03836 class038362 = class090332.y();
        class06889 class068892 = class038362.y();
        class06889 class068893 = class038362.L();
        class06889 class068894 = class038362.N();
        this.i.clear();
        for (class05800 class058002 : this.L) {
            if (!class058002.L(class068892)) continue;
            this.i.add(class058002);
        }
        if (this.i.isEmpty()) {
            return;
        }
        int n = 0;
        int n2 = 0;
        double d = (Double)((class05630)this.y.i_7).K().method_41753();
        Iterator<class05800> var11 = this.i.iterator();
        while (var11.hasNext()) {
            class05800 class058003 = var11.next();
            class058003.N(3000.0 * d);
            if (!class058003.y()) {
                var11.remove();
                continue;
            }
            n2 = Math.max(n2, ((class01590)this.y.i_3).N((class05936)class058003.N()));
        }
        n2 += ((class01590)this.y.i_3).y("<") + ((class01590)this.y.i_3).y(" ") + ((class01590)this.y.i_3).y(">") + ((class01590)this.y.i_3).y(" ");
        if (!this.i.isEmpty()) {
            class010542.L();
        }
        for (class05800 class058003 : this.i) {
            int n3 = 255;
            class00392 class003922 = class058003.N();
            class05798 class057982 = class058003.N(class068892);
            if (class057982 == null) continue;
            class06889 class068895 = class057982.N().u(class068892).u();
            double d2 = class068894.y(class068895);
            boolean bl = class068893.y(class068895) > 0.5;
            int n4 = n2 / 2;
            Objects.requireNonNull((class01590)this.y.i_3);
            int n5 = 9;
            int n6 = n5 / 2;
            float f = 1.0f;
            int n7 = ((class01590)this.y.i_3).N((class05936)class003922);
            int n8 = class04995.y((float)class04995.y((float)((float)(class07536.L() - class057982.y()) / (float)(3000.0 * d)), (float)255.0f, (float)75.0f));
            class010542.i().pushMatrix();
            class010542.i().translate((float)class010542.N() - (float)n4 * 1.0f - 2.0f, (float)(class010542.y() - 35) - (float)(n * (n5 + 1)) * 1.0f);
            class010542.i().scale(1.0f, 1.0f);
            class010542.N(-n4 - 1, -n6 - 1, n4 + 1, n6 + 1, ((class05630)this.y.i_7).y(0.8f));
            int n9 = class02566.y((int)255, (int)n8, (int)n8, (int)n8);
            if (!bl) {
                if (d2 > 0.0) {
                    class010542.y((class01590)this.y.i_3, ">", n4 - ((class01590)this.y.i_3).y(">"), -n6, n9);
                } else if (d2 < 0.0) {
                    class010542.y((class01590)this.y.i_3, "<", -n4, -n6, n9);
                }
            }
            class010542.y((class01590)this.y.i_3, class003922, -n7 / 2, -n6, n9);
            class010542.i().popMatrix();
            ++n;
        }
    }

    private void N(class01054 class010543, Operation operation) {
        HudElementRegistryImpl.getRoot((class01894)VanillaHudElements.SUBTITLES).render(class010543, class06202.Nq().NK(), (class010542, class022332) -> operation.call(new Object[]{class010542}));
    }

    public void N(class00044 class000442, class00137 class001372, float f) {
        if (class001372.N() == null) {
            return;
        }
        class00392 class003922 = class001372.N();
        if (!this.L.isEmpty()) {
            for (class05800 class058002 : this.L) {
                if (!class058002.N().equals((Object)class003922)) continue;
                class058002.y(new class06889(class000442.z(), class000442.U(), class000442.E()));
                return;
            }
        }
        this.L.add(new class05800(class003922, f, new class06889(class000442.z(), class000442.U(), class000442.E())));
    }

    public void N(class01054 class010542) {
        this.N(class010542, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_332]");
            this.y((class01054)objectArray[0]);
            return null;
        });
    }
}

