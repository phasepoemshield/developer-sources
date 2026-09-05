/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11938
 *  minecraft.class06570
 *  minecraft.class07209
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 *  org.joml.Vector3i
 *  org.joml.Vector3ic
 */
package Nursultan;

import Nursultan.class11556;
import Nursultan.class11557;
import Nursultan.class11563;
import Nursultan.class11565;
import Nursultan.class11576;
import Nursultan.class11579;
import Nursultan.class11938;
import java.util.List;
import minecraft.class06570;
import minecraft.class07209;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.joml.Vector3i;
import org.joml.Vector3ic;

public class class11577 {
    public Object N_0;

    private void L() {
    }

    public class11577(class11576 class115762) {
        this.L();
        this.N_0 = class115762;
    }

    static {
        class11577.N();
    }

    private boolean y(List<class11556> list, Vector3i vector3i, Vector3i vector3i2) {
        int n = vector3i2.x + vector3i.x / 2;
        int n2 = vector3i2.y + vector3i.y / 2;
        int n3 = vector3i2.z + vector3i.z / 2;
        return list.stream().filter(class115562 -> {
            class07209 class072092 = class115562.N();
            return class072092.method_10263() == n && class072092.method_10264() == n2 && class072092.method_10260() == n3;
        }).anyMatch(class115562 -> !class115562.y().P());
    }

    public void N(List<class11556> list, Vector3i vector3i, Vector3i vector3i2) {
        for (class11565 class115652 : (List)class11557.L_0) {
            if (!class115652.N(list)) continue;
            this.N(list, class115652, vector3i, vector3i2);
            break;
        }
    }

    private void N(List<class11556> list, class11579 class115792, Vector3i vector3i, Vector3i vector3i2) {
        Vector3i vector3i3 = vector3i2.sub((Vector3ic)vector3i, new Vector3i());
        if (vector3i3.x != vector3i3.z || vector3i3.y < 3 || this.y(list, vector3i3, vector3i)) {
            return;
        }
        Vector3d vector3d = new Vector3d((Vector3ic)vector3i3);
        Vector3d vector3d2 = new Vector3d((Vector3ic)vector3i);
        Vector3d vector3d3 = vector3d.mul(0.5).add((Vector3dc)vector3d2).add(0.5, 0.5, 0.5);
        ((class11576)this.N_0).N(new class11563(class06570.TW.E(), class115792, new Vector3d(vector3d3.x, vector3d3.y, vector3d3.z), class11938.j().y() + class115792.y()));
    }

    private static void N() {
    }
}

