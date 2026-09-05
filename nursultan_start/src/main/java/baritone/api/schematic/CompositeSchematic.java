/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic;

import baritone.api.schematic.AbstractSchematic;
import baritone.api.schematic.CompositeSchematicEntry;
import baritone.api.schematic.ISchematic;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00500;

public class CompositeSchematic
extends AbstractSchematic {
    private final List<CompositeSchematicEntry> schematics = new ArrayList<CompositeSchematicEntry>();
    private CompositeSchematicEntry[] schematicArr;

    public CompositeSchematic(int n, int n2, int n3) {
        super(n, n2, n3);
        this.recalcArr();
    }

    @Override
    public void reset() {
        for (CompositeSchematicEntry compositeSchematicEntry : this.schematicArr) {
            compositeSchematicEntry.schematic.reset();
        }
    }

    public void put(ISchematic iSchematic, int n, int n2, int n3) {
        this.schematics.add(new CompositeSchematicEntry(iSchematic, n, n2, n3));
        this.recalcArr();
    }

    private void recalcArr() {
        for (CompositeSchematicEntry compositeSchematicEntry : this.schematicArr = this.schematics.toArray(new CompositeSchematicEntry[0])) {
            this.x = Math.max(this.x, compositeSchematicEntry.x + compositeSchematicEntry.schematic.widthX());
            this.y = Math.max(this.y, compositeSchematicEntry.y + compositeSchematicEntry.schematic.heightY());
            this.z = Math.max(this.z, compositeSchematicEntry.z + compositeSchematicEntry.schematic.lengthZ());
        }
    }

    @Override
    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        CompositeSchematicEntry compositeSchematicEntry = this.getSchematic(n, n2, n3, class005002);
        if (compositeSchematicEntry == null) {
            throw new IllegalStateException("couldn't find schematic for this position");
        }
        return compositeSchematicEntry.schematic.desiredState(n - compositeSchematicEntry.x, n2 - compositeSchematicEntry.y, n3 - compositeSchematicEntry.z, class005002, list);
    }

    private CompositeSchematicEntry getSchematic(int n, int n2, int n3, class00500 class005002) {
        for (CompositeSchematicEntry compositeSchematicEntry : this.schematicArr) {
            if (n < compositeSchematicEntry.x || n2 < compositeSchematicEntry.y || n3 < compositeSchematicEntry.z || !compositeSchematicEntry.schematic.inSchematic(n - compositeSchematicEntry.x, n2 - compositeSchematicEntry.y, n3 - compositeSchematicEntry.z, class005002)) continue;
            return compositeSchematicEntry;
        }
        return null;
    }

    @Override
    public boolean inSchematic(int n, int n2, int n3, class00500 class005002) {
        CompositeSchematicEntry compositeSchematicEntry = this.getSchematic(n, n2, n3, class005002);
        return compositeSchematicEntry != null && compositeSchematicEntry.schematic.inSchematic(n - compositeSchematicEntry.x, n2 - compositeSchematicEntry.y, n3 - compositeSchematicEntry.z, class005002);
    }
}

