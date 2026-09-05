/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07111
 */
package baritone.api.schematic;

import baritone.api.schematic.ISchematic;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00500;
import minecraft.class07111;

public class MirroredSchematic
implements ISchematic {
    private final ISchematic schematic;
    private final class07111 mirror;

    @Override
    public int lengthZ() {
        return this.schematic.lengthZ();
    }

    public MirroredSchematic(ISchematic iSchematic, class07111 class071112) {
        this.schematic = iSchematic;
        this.mirror = class071112;
    }

    @Override
    public void reset() {
        this.schematic.reset();
    }

    private static List<class00500> mirror(List<class00500> list, class07111 class071112) {
        if (list == null) {
            return null;
        }
        return list.stream().map(class005002 -> MirroredSchematic.mirror(class005002, class071112)).collect(Collectors.toList());
    }

    private static class00500 mirror(class00500 class005002, class07111 class071112) {
        if (class005002 == null) {
            return null;
        }
        return class005002.N(class071112);
    }

    private static int mirrorX(int n, int n2, class07111 class071112) {
        switch (class071112) {
            case field_11302: 
            case field_11300: {
                return n;
            }
            case field_11301: {
                return n2 - n - 1;
            }
        }
        throw new IllegalArgumentException("Unknown mirror");
    }

    @Override
    public int widthX() {
        return this.schematic.widthX();
    }

    private static int mirrorZ(int n, int n2, class07111 class071112) {
        switch (class071112) {
            case field_11302: 
            case field_11301: {
                return n;
            }
            case field_11300: {
                return n2 - n - 1;
            }
        }
        throw new IllegalArgumentException("Unknown mirror");
    }

    @Override
    public int heightY() {
        return this.schematic.heightY();
    }

    @Override
    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        return MirroredSchematic.mirror(this.schematic.desiredState(MirroredSchematic.mirrorX(n, this.widthX(), this.mirror), n2, MirroredSchematic.mirrorZ(n3, this.lengthZ(), this.mirror), MirroredSchematic.mirror(class005002, this.mirror), MirroredSchematic.mirror(list, this.mirror)), this.mirror);
    }

    @Override
    public boolean inSchematic(int n, int n2, int n3, class00500 class005002) {
        return this.schematic.inSchematic(MirroredSchematic.mirrorX(n, this.widthX(), this.mirror), n2, MirroredSchematic.mirrorZ(n3, this.lengthZ(), this.mirror), MirroredSchematic.mirror(class005002, this.mirror));
    }
}

