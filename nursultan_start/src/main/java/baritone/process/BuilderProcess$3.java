/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.ISchematic
 *  minecraft.class00500
 */
package baritone.process;

import baritone.api.schematic.ISchematic;
import baritone.process.BuilderProcess;
import java.util.List;
import minecraft.class00500;

class BuilderProcess$3
implements ISchematic {
    final /* synthetic */ ISchematic val$realSchematic;
    final /* synthetic */ int val$minYInclusive;
    final /* synthetic */ int val$maxYInclusive;
    final /* synthetic */ BuilderProcess this$0;

    public int lengthZ() {
        return this.val$realSchematic.lengthZ();
    }

    BuilderProcess$3() {
        this.this$0 = var1_1;
        this.val$realSchematic = var2_2;
        this.val$minYInclusive = n;
        this.val$maxYInclusive = n2;
    }

    public void reset() {
        this.val$realSchematic.reset();
    }

    public int widthX() {
        return this.val$realSchematic.widthX();
    }

    public int heightY() {
        return this.val$realSchematic.heightY();
    }

    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        return this.val$realSchematic.desiredState(n, n2, n3, class005002, this.this$0.approxPlaceable);
    }

    public boolean inSchematic(int n, int n2, int n3, class00500 class005002) {
        return super.inSchematic(n, n2, n3, class005002) && n2 >= this.val$minYInclusive && n2 <= this.val$maxYInclusive && this.val$realSchematic.inSchematic(n, n2, n3, class005002);
    }
}

