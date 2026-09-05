/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02012
 *  minecraft.class02022
 *  minecraft.class02028
 *  minecraft.class02067
 *  minecraft.class02081
 *  minecraft.class04120
 *  minecraft.class04198
 *  minecraft.class04673
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08838
 *  org.joml.Matrix4fc
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import minecraft.class02012;
import minecraft.class02022;
import minecraft.class02028;
import minecraft.class02067;
import minecraft.class02081;
import minecraft.class04120;
import minecraft.class04198;
import minecraft.class04673;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08496;
import minecraft.class08512;
import minecraft.class08514;
import minecraft.class08534;
import minecraft.class08838;
import org.joml.Matrix4fc;
import org.joml.Vector3fc;

public final class class08505
extends Record
implements class08534 {
    private final List<class02081> elements;

    public class08505(List<class02081> list) {
        this.elements = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08505.class, "elements", "elements"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08505.class, "elements", "elements"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08505.class, "elements", "elements"}, this);
    }

    public List<class02081> N() {
        return this.elements;
    }

    public static class08496 N(List<class02081> list, class08838 class088382, class02028 class020282, class04673 class046732, class08512 class085122) {
        class08514 class085142 = new class08514();
        for (class02081 class020812 : list) {
            boolean bl = true;
            boolean bl2 = true;
            boolean bl3 = true;
            Vector3fc vector3fc = class020812.N();
            Vector3fc vector3fc2 = class020812.y();
            if (vector3fc.x() == vector3fc2.x()) {
                bl2 = false;
                bl3 = false;
            }
            if (vector3fc.y() == vector3fc2.y()) {
                bl = false;
                bl3 = false;
            }
            if (vector3fc.z() == vector3fc2.z()) {
                bl = false;
                bl2 = false;
            }
            if (!bl && !bl2 && !bl3) continue;
            for (Map.Entry entry : class020812.L().entrySet()) {
                class07211 class072112 = (class07211)entry.getKey();
                class02067 class020672 = (class02067)entry.getValue();
                if (!(switch (class072112.z()) {
                    default -> throw new MatchException(null, null);
                    case class07185.field_11048 -> bl;
                    case class07185.field_11052 -> bl2;
                    case class07185.field_11051 -> bl3;
                })) continue;
                class08388 class083882 = class020282.y().N(class088382, class020672.L(), class085122);
                class02022 class020222 = class04198.N((class02012)class020282.L(), (Vector3fc)vector3fc, (Vector3fc)vector3fc2, (class02067)class020672, (class08388)class083882, (class07211)class072112, (class04673)class046732, (class04120)class020812.u(), (boolean)class020812.i(), (int)class020812.R());
                if (class020672.N() == null) {
                    class085142.N(class020222);
                    continue;
                }
                class085142.N(class07211.N((Matrix4fc)class046732.method_3509().L(), (class07211)class020672.N()), class020222);
            }
        }
        return class085142.N();
    }

    @Override
    public class08496 bake(class08838 class088382, class02028 class020282, class04673 class046732, class08512 class085122) {
        return class08505.N(this.elements, class088382, class020282, class046732, class085122);
    }
}

