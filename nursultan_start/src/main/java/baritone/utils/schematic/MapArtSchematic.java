/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.ISchematic
 *  baritone.api.schematic.IStaticSchematic
 *  baritone.api.schematic.MaskSchematic
 *  minecraft.class00500
 *  minecraft.class07662
 */
package baritone.utils.schematic;

import baritone.api.schematic.ISchematic;
import baritone.api.schematic.IStaticSchematic;
import baritone.api.schematic.MaskSchematic;
import java.util.OptionalInt;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class07662;

public class MapArtSchematic
extends MaskSchematic {
    private final int[][] heightMap;

    public MapArtSchematic(IStaticSchematic iStaticSchematic) {
        super((ISchematic)iStaticSchematic);
        this.heightMap = MapArtSchematic.generateHeightMap(iStaticSchematic);
    }

    public boolean partOfMask(int n, int n2, int n3, class00500 class005002) {
        return n2 >= this.heightMap[n][n3];
    }

    private static <T> OptionalInt lastIndexMatching(T[] TArray, Predicate<? super T> predicate) {
        for (int i = TArray.length - 1; i >= 0; --i) {
            if (!predicate.test(TArray[i])) continue;
            return OptionalInt.of(i);
        }
        return OptionalInt.empty();
    }

    private static int[][] generateHeightMap(IStaticSchematic iStaticSchematic) {
        int[][] nArray = new int[iStaticSchematic.widthX()][iStaticSchematic.lengthZ()];
        int n = 0;
        for (int i = 0; i < iStaticSchematic.widthX(); ++i) {
            for (int j = 0; j < iStaticSchematic.lengthZ(); ++j) {
                class00500[] class00500Array = iStaticSchematic.getColumn(i, j);
                OptionalInt optionalInt = MapArtSchematic.lastIndexMatching(class00500Array, class005002 -> !(class005002.i() instanceof class07662));
                if (optionalInt.isPresent()) {
                    nArray[i][j] = optionalInt.getAsInt();
                    continue;
                }
                ++n;
                nArray[i][j] = Integer.MAX_VALUE;
            }
        }
        if (n != 0) {
            System.out.println(n + " columns had no block despite being in a map art, letting them be whatever");
        }
        return nArray;
    }
}

