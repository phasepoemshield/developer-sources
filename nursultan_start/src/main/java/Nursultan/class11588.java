/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  org.joml.Vector3i
 */
package Nursultan;

import Nursultan.class11547;
import Nursultan.class11556;
import java.util.Iterator;
import java.util.List;
import minecraft.class07209;
import org.joml.Vector3i;

public class class11588
extends class11547 {
    public class11588(String string, int n) {
        super(string, n);
    }

    private boolean N(List<class11556> list, Vector3i vector3i, int n, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        for (int i = 0; i <= n2; ++i) {
            for (int j = 0; j <= n; ++j) {
                int n7 = vector3i.x + i * n4 + n3;
                int n8 = vector3i.y + j;
                int n9 = vector3i.z + i;
                int n10 = n9 + n5;
                Iterator<class11556> iterator = list.iterator();
                while (iterator.hasNext()) {
                    class07209 class072092 = iterator.next().N();
                    if (class072092.method_10263() != n7 || class072092.method_10264() != n8 || class072092.method_10260() != n9 && class072092.method_10260() != n10) continue;
                    ++n6;
                }
            }
        }
        return n6 == list.size();
    }

    @Override
    public boolean N(List<class11556> list, Vector3i vector3i, Vector3i vector3i2) {
        return this.N(list, vector3i, vector3i2.y, vector3i2.x, vector3i2.x, -1, 1) || this.N(list, vector3i, vector3i2.y, vector3i2.x, 0, 1, 1) || this.N(list, vector3i, vector3i2.y, vector3i2.x, vector3i2.x, -1, -1) || this.N(list, vector3i, vector3i2.y, vector3i2.x, 0, 1, -1);
    }
}

