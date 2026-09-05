/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class01296
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01999
 *  minecraft.class02020
 *  minecraft.class03337
 *  minecraft.class03358
 *  minecraft.class03498
 *  minecraft.class03503
 *  minecraft.class03579
 *  minecraft.class03950
 *  minecraft.class04688
 *  minecraft.class05885
 *  minecraft.class06069
 *  minecraft.class06898
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07331
 *  minecraft.class07835
 *  minecraft.class08743
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class01296;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01999;
import minecraft.class02020;
import minecraft.class02579;
import minecraft.class02586;
import minecraft.class02609;
import minecraft.class03337;
import minecraft.class03358;
import minecraft.class03498;
import minecraft.class03503;
import minecraft.class03579;
import minecraft.class03950;
import minecraft.class04688;
import minecraft.class05885;
import minecraft.class06069;
import minecraft.class06898;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07331;
import minecraft.class07835;
import minecraft.class08743;

public class class02614 {
    private final class01999 N;
    private final class03579 y;

    public class02614(class01999 class019992, class03579 class035792) {
        this.N = class019992;
        this.y = class035792;
    }

    private <E extends class00394> void N(class02586 class025862, E e) {
        class03358 class033582 = this.y.N(e);
        if (class033582 != null && !class033582.t_()) {
            class025862.N.add(e);
        }
    }

    private class07331 N(Map<class08743, class07331> map, class03950 class039502, class08743 class087432) {
        class07331 class073312 = map.get(class087432);
        if (class073312 == null) {
            class02579 class025792 = class039502.N(class087432);
            class073312 = new class07331(class025792, VertexFormat.class_5596.field_27382, class07835.y);
            map.put(class087432, class073312);
        }
        return class073312;
    }

    public class02586 N(class01296 class012962, class03498 class034982, class03337 class033372, class03950 class039502) {
        Object object;
        class00500 class005002;
        class02586 class025862 = new class02586();
        class07209 class072092 = class012962.z();
        class07209 class072093 = class072092.method_10069(15, 15, 15);
        class03503 class035032 = new class03503();
        class01421 class014212 = new class01421();
        class02020.N();
        EnumMap<class08743, class07331> enumMap = new EnumMap<class08743, class07331>(class08743.class);
        class06069 class060692 = class06069.u();
        ObjectArrayList objectArrayList = new ObjectArrayList();
        for (class07209 object2 : class07209.method_10097((class07209)class072092, (class07209)class072093)) {
            class07331 class073312;
            class08743 class087432;
            class005002 = class034982.method_8320(object2);
            if (class005002.t()) {
                class035032.N(object2);
            }
            if (class005002.k() && (object = class034982.method_8321(object2)) != null) {
                this.N(class025862, object);
            }
            if (!(object = class005002.Y()).W()) {
                class087432 = class05885.N((class04688)object);
                class073312 = this.N(enumMap, class039502, class087432);
                this.N.N(object2, (class07295)class034982, (class01391)class073312, class005002, (class04688)object);
            }
            if (class005002.b() != class06898.field_11458) continue;
            class087432 = class05885.N((class00500)class005002);
            class073312 = this.N(enumMap, class039502, class087432);
            class060692.N(class005002.y(object2));
            this.N.N(class005002).method_68513(class060692, (List)objectArrayList);
            class014212.N();
            class014212.N((float)class01296.y((int)object2.method_10263()), (float)class01296.y((int)object2.method_10264()), (float)class01296.y((int)object2.method_10260()));
            this.N.N(class005002, object2, (class07295)class034982, class014212, (class01391)class073312, true, (List)objectArrayList);
            class014212.y();
            objectArrayList.clear();
        }
        for (Map.Entry entry : enumMap.entrySet()) {
            class005002 = (class08743)entry.getKey();
            object = ((class07331)entry.getValue()).N();
            if (object == null) continue;
            if (class005002 == class08743.field_60926) {
                class025862.u = ((class02609)object).N(class039502.N((class08743)class005002), class033372);
            }
            class025862.y.put((class08743)class005002, (class02609)object);
        }
        class02020.y();
        class025862.L = class035032.N();
        return class025862;
    }
}

