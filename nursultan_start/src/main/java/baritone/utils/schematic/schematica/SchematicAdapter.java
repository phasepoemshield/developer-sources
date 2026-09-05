/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.IStaticSchematic
 *  com.github.lunatrius.schematica.client.world.SchematicWorld
 *  minecraft.class00500
 *  minecraft.class07209
 */
package baritone.utils.schematic.schematica;

import baritone.api.schematic.IStaticSchematic;
import com.github.lunatrius.schematica.client.world.SchematicWorld;
import java.util.List;
import minecraft.class00500;
import minecraft.class07209;

public final class SchematicAdapter
implements IStaticSchematic {
    private final SchematicWorld schematic;

    public int lengthZ() {
        return this.schematic.getSchematic().getLength();
    }

    public SchematicAdapter(SchematicWorld schematicWorld) {
        this.schematic = schematicWorld;
    }

    public class00500 getDirect(int n, int n2, int n3) {
        return this.schematic.getSchematic().getBlockState(new class07209(n, n2, n3));
    }

    public int widthX() {
        return this.schematic.getSchematic().getWidth();
    }

    public int heightY() {
        return this.schematic.getSchematic().getHeight();
    }

    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        return this.getDirect(n, n2, n3);
    }
}

