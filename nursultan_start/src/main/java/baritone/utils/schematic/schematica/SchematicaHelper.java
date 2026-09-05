/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.IStaticSchematic
 *  com.github.lunatrius.schematica.Schematica
 *  com.github.lunatrius.schematica.client.world.SchematicWorld
 *  com.github.lunatrius.schematica.proxy.ClientProxy
 *  minecraft.class05034
 *  minecraft.class07209
 */
package baritone.utils.schematic.schematica;

import baritone.api.schematic.IStaticSchematic;
import baritone.utils.schematic.schematica.SchematicAdapter;
import com.github.lunatrius.schematica.Schematica;
import com.github.lunatrius.schematica.client.world.SchematicWorld;
import com.github.lunatrius.schematica.proxy.ClientProxy;
import java.util.Optional;
import minecraft.class05034;
import minecraft.class07209;

public final class SchematicaHelper
extends Enum<SchematicaHelper> {
    private static final /* synthetic */ SchematicaHelper[] $VALUES;

    static {
        $VALUES = SchematicaHelper.$values();
    }

    public static SchematicaHelper[] values() {
        return (SchematicaHelper[])$VALUES.clone();
    }

    public static SchematicaHelper valueOf(String string) {
        return Enum.valueOf(SchematicaHelper.class, string);
    }

    private static /* synthetic */ SchematicaHelper[] $values() {
        return new SchematicaHelper[0];
    }

    public static boolean isSchematicaPresent() {
        try {
            Class.forName(Schematica.class.getName());
            return true;
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {
            return false;
        }
    }

    public static Optional<class05034<IStaticSchematic, class07209>> getOpenSchematic() {
        return Optional.ofNullable(ClientProxy.schematic).map(schematicWorld -> new class05034((Object)new SchematicAdapter((SchematicWorld)schematicWorld), (Object)schematicWorld.position));
    }
}

