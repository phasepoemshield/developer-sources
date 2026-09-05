/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07185
 */
package baritone.api.schematic;

import java.util.List;
import minecraft.class00500;
import minecraft.class07185;

public interface ISchematic {
    public int lengthZ();

    default public int size(class07185 class071852) {
        switch (class071852) {
            case field_11048: {
                return this.widthX();
            }
            case field_11052: {
                return this.heightY();
            }
            case field_11051: {
                return this.lengthZ();
            }
        }
        throw new UnsupportedOperationException(String.valueOf(class071852));
    }

    default public void reset() {
    }

    public int widthX();

    public int heightY();

    public class00500 desiredState(int var1, int var2, int var3, class00500 var4, List<class00500> var5);

    default public boolean inSchematic(int n, int n2, int n3, class00500 class005002) {
        return n >= 0 && n < this.widthX() && n2 >= 0 && n2 < this.heightY() && n3 >= 0 && n3 < this.lengthZ();
    }
}

