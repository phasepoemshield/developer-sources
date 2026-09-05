/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.ISchematic
 *  baritone.api.schematic.IStaticSchematic
 *  fi.dy.masa.litematica.Litematica
 *  fi.dy.masa.litematica.data.DataManager
 *  fi.dy.masa.litematica.schematic.placement.SchematicPlacement
 *  fi.dy.masa.litematica.schematic.placement.SubRegionPlacement
 *  fi.dy.masa.litematica.world.SchematicWorldHandler
 *  fi.dy.masa.litematica.world.WorldSchematic
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class05034
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 */
package baritone.utils.schematic.litematica;

import baritone.api.schematic.ISchematic;
import baritone.api.schematic.IStaticSchematic;
import baritone.utils.schematic.StaticSchematic;
import baritone.utils.schematic.litematica.LitematicaHelper$LitematicaPlacementSchematic;
import fi.dy.masa.litematica.Litematica;
import fi.dy.masa.litematica.data.DataManager;
import fi.dy.masa.litematica.schematic.placement.SchematicPlacement;
import fi.dy.masa.litematica.schematic.placement.SubRegionPlacement;
import fi.dy.masa.litematica.world.SchematicWorldHandler;
import fi.dy.masa.litematica.world.WorldSchematic;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class05034;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;

public final class LitematicaHelper {
    private static class00753 transform(class00753 class007532, class07111 class071112, class06993 class069932) {
        int n = class007532.method_10263();
        int n2 = class007532.method_10260();
        if (class071112 == class07111.field_11300) {
            n2 = -n2;
        } else if (class071112 == class07111.field_11301) {
            n = -n;
        }
        switch (class069932) {
            case field_11463: {
                return new class00753(-n2, class007532.method_10264(), n);
            }
            case field_11464: {
                return new class00753(-n, class007532.method_10264(), -n2);
            }
            case field_11465: {
                return new class00753(n2, class007532.method_10264(), -n);
            }
        }
        return new class00753(n, class007532.method_10264(), n2);
    }

    public static boolean isLitematicaPresent() {
        try {
            Class.forName(Litematica.class.getName());
            return true;
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {
            return false;
        }
    }

    public static class05034<IStaticSchematic, class00753> getSchematic(int n) {
        class00753 class007532;
        SchematicPlacement schematicPlacement = LitematicaHelper.getPlacement(n);
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MAX_VALUE;
        HashMap<class00753, StaticSchematic> hashMap = new HashMap<class00753, StaticSchematic>();
        WorldSchematic worldSchematic = SchematicWorldHandler.getSchematicWorld();
        for (Object object : schematicPlacement.getEnabledRelativeSubRegionPlacements().entrySet()) {
            SubRegionPlacement object2 = (SubRegionPlacement)object.getValue();
            class007532 = LitematicaHelper.transform((class00753)object2.getPos(), schematicPlacement.getMirror(), schematicPlacement.getRotation());
            class07209 class072092 = schematicPlacement.getSchematic().getAreaSize((String)object.getKey());
            class072092 = LitematicaHelper.transform((class00753)class072092, schematicPlacement.getMirror(), schematicPlacement.getRotation());
            class072092 = LitematicaHelper.transform((class00753)class072092, object2.getMirror(), object2.getRotation());
            int n5 = Math.min(class072092.method_10263() + 1, 0);
            int n6 = Math.min(class072092.method_10264() + 1, 0);
            int n7 = Math.min(class072092.method_10260() + 1, 0);
            n2 = Math.min(n2, class007532.method_10263() + n5);
            n3 = Math.min(n3, class007532.method_10264() + n6);
            n4 = Math.min(n4, class007532.method_10260() + n7);
            class07209 class072093 = schematicPlacement.getOrigin().method_10081(class007532).method_10069(n5, n6, n7);
            class00500[][][] class00500Array = new class00500[Math.abs(class072092.method_10263())][Math.abs(class072092.method_10260())][Math.abs(class072092.method_10264())];
            for (int i = 0; i < class00500Array.length; ++i) {
                for (int j = 0; j < class00500Array[i].length; ++j) {
                    for (int k = 0; k < class00500Array[i][j].length; ++k) {
                        class00500Array[i][j][k] = worldSchematic.method_8320(class072093.method_10069(i, k, j));
                    }
                }
            }
            StaticSchematic staticSchematic = new StaticSchematic(class00500Array);
            hashMap.put(class007532.method_34592(n5, n6, n7), staticSchematic);
        }
        Object object = new LitematicaHelper$LitematicaPlacementSchematic(schematicPlacement.getName());
        for (Map.Entry entry : hashMap.entrySet()) {
            class007532 = ((class00753)entry.getKey()).method_34592(-n2, -n3, -n4);
            object.put((ISchematic)entry.getValue(), class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
        }
        return new class05034(object, (Object)schematicPlacement.getOrigin().method_10069(n2, n3, n4));
    }

    public static boolean hasLoadedSchematic(int n) {
        return 0 <= n && n < DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().size();
    }

    private static SchematicPlacement getPlacement(int n) {
        return (SchematicPlacement)DataManager.getSchematicPlacementManager().getAllSchematicsPlacements().get(n);
    }
}

