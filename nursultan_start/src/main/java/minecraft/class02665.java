/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class02484
 *  minecraft.class02947
 *  minecraft.class04162
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class08725
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class02484;
import minecraft.class02947;
import minecraft.class04162;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class08725;
import org.jspecify.annotations.Nullable;

public interface class02665 {
    public class06584 method_6118(class07085 var1);

    default public @Nullable class07085 N(class06584 class065842, List<class07085> list) {
        if (class065842.R()) {
            return null;
        }
        class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
        if (class087252 != null) {
            class07085 class070852 = class087252.y();
            if (!list.contains(class070852)) {
                return class070852;
            }
        } else if (!list.contains(class07085.field_6173)) {
            return class07085.field_6173;
        }
        return null;
    }

    default public void N(class05946<class05074> class059462, class04162 class041622, Map<class07085, Float> map) {
        this.N(class059462, class041622, 0L, map);
    }

    default public void N(class05946<class05074> class059462, class04162 class041622, long l, Map<class07085, Float> map) {
        class05074 class050742 = class041622.N().method_8503().yd().N(class059462);
        if (class050742 == class05074.R) {
            return;
        }
        ObjectArrayList var7 = class050742.N(class041622, l);
        ArrayList<class07085> arrayList = new ArrayList<class07085>();
        for (class06584 class065842 : var7) {
            class07085 class070852 = this.N(class065842, arrayList);
            if (class070852 == null) continue;
            class06584 class065843 = class070852.N(class065842);
            this.method_5673(class070852, class065843);
            Float f = map.get(class070852);
            if (f != null) {
                this.N(class070852, f.floatValue());
            }
            arrayList.add(class070852);
        }
    }

    public void N(class07085 var1, float var2);

    default public void N(class02947 class029472, class04162 class041622) {
        this.N((class05946<class05074>)class029472.N(), class041622, class029472.y());
    }

    public void method_5673(class07085 var1, class06584 var2);
}

