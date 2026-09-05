/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11938
 *  minecraft.class06570
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 *  org.joml.Vector3i
 *  org.joml.Vector3ic
 */
package Nursultan;

import Nursultan.class11547;
import Nursultan.class11556;
import Nursultan.class11563;
import Nursultan.class11576;
import Nursultan.class11578;
import Nursultan.class11579;
import Nursultan.class11938;
import java.util.List;
import minecraft.class06570;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.joml.Vector3i;
import org.joml.Vector3ic;

public class class11586 {
    public Object N_0;

    public class11586(class11576 class115762) {
        this.y();
        this.N_0 = class115762;
    }

    private void y() {
    }

    private Vector3d N(List<class11556> list, class11547 class115472, Vector3i vector3i, Vector3i vector3i2) {
        Vector3i vector3i3 = vector3i2.sub((Vector3ic)vector3i, new Vector3i());
        if (class115472.N(list, vector3i, vector3i3)) {
            Vector3d vector3d = new Vector3d((Vector3ic)vector3i3);
            Vector3d vector3d2 = new Vector3d((Vector3ic)vector3i);
            return vector3d.mul(0.5).add((Vector3dc)vector3d2).add(0.5, 0.5, 0.5);
        }
        return null;
    }

    private void N(class11579 class115792, Vector3d vector3d) {
        ((class11576)this.N_0).N(new class11563(class06570.ny.E(), class115792, new Vector3d(vector3d.x, vector3d.y, vector3d.z), class11938.j().y() + class115792.y()));
    }

    public void N(List<class11556> list, Vector3i vector3i, Vector3i vector3i2) {
        for (class11547 class115472 : (List)class11578.N_0) {
            Vector3d vector3d;
            if (!class115472.N(list) || (vector3d = this.N(list, class115472, vector3i, vector3i2)) == null) continue;
            this.N(class115472, vector3d);
        }
    }
}

