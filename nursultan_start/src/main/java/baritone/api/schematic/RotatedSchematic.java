/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class06993
 */
package baritone.api.schematic;

import baritone.api.schematic.ISchematic;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00500;
import minecraft.class06993;

public class RotatedSchematic
implements ISchematic {
    private final ISchematic schematic;
    private final class06993 rotation;
    private final class06993 inverseRotation;

    @Override
    public int lengthZ() {
        return RotatedSchematic.flipsCoordinates(this.rotation) ? this.schematic.widthX() : this.schematic.lengthZ();
    }

    public RotatedSchematic(ISchematic iSchematic, class06993 class069932) {
        this.schematic = iSchematic;
        this.rotation = class069932;
        this.inverseRotation = class069932.N(class069932).N(class069932);
    }

    @Override
    public void reset() {
        this.schematic.reset();
    }

    private static List<class00500> rotate(List<class00500> list, class06993 class069932) {
        if (list == null) {
            return null;
        }
        return list.stream().map(class005002 -> RotatedSchematic.rotate(class005002, class069932)).collect(Collectors.toList());
    }

    private static class00500 rotate(class00500 class005002, class06993 class069932) {
        if (class005002 == null) {
            return null;
        }
        return class005002.N(class069932);
    }

    private static int rotateX(int n, int n2, int n3, int n4, class06993 class069932) {
        switch (class069932) {
            case field_11467: {
                return n;
            }
            case field_11463: {
                return n4 - n2 - 1;
            }
            case field_11464: {
                return n3 - n - 1;
            }
            case field_11465: {
                return n2;
            }
        }
        throw new IllegalArgumentException("Unknown rotation");
    }

    private static int rotateZ(int n, int n2, int n3, int n4, class06993 class069932) {
        switch (class069932) {
            case field_11467: {
                return n2;
            }
            case field_11463: {
                return n;
            }
            case field_11464: {
                return n4 - n2 - 1;
            }
            case field_11465: {
                return n3 - n - 1;
            }
        }
        throw new IllegalArgumentException("Unknown rotation");
    }

    @Override
    public int widthX() {
        return RotatedSchematic.flipsCoordinates(this.rotation) ? this.schematic.lengthZ() : this.schematic.widthX();
    }

    @Override
    public int heightY() {
        return this.schematic.heightY();
    }

    private static boolean flipsCoordinates(class06993 class069932) {
        return class069932 == class06993.field_11463 || class069932 == class06993.field_11465;
    }

    @Override
    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        return RotatedSchematic.rotate(this.schematic.desiredState(RotatedSchematic.rotateX(n, n3, this.widthX(), this.lengthZ(), this.inverseRotation), n2, RotatedSchematic.rotateZ(n, n3, this.widthX(), this.lengthZ(), this.inverseRotation), RotatedSchematic.rotate(class005002, this.inverseRotation), RotatedSchematic.rotate(list, this.inverseRotation)), this.rotation);
    }

    @Override
    public boolean inSchematic(int n, int n2, int n3, class00500 class005002) {
        return this.schematic.inSchematic(RotatedSchematic.rotateX(n, n3, this.widthX(), this.lengthZ(), this.inverseRotation), n2, RotatedSchematic.rotateZ(n, n3, this.widthX(), this.lengthZ(), this.inverseRotation), RotatedSchematic.rotate(class005002, this.inverseRotation));
    }
}

