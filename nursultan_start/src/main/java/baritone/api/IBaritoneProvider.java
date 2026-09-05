/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.ISchematicSystem
 *  minecraft.class01683
 *  minecraft.class04453
 *  minecraft.class06202
 */
package baritone.api;

import baritone.api.IBaritone;
import baritone.api.cache.IWorldScanner;
import baritone.api.command.ICommandSystem;
import baritone.api.schematic.ISchematicSystem;
import java.util.List;
import java.util.Objects;
import minecraft.class01683;
import minecraft.class04453;
import minecraft.class06202;

public interface IBaritoneProvider {
    public IBaritone getPrimaryBaritone();

    default public IBaritone getBaritoneForPlayer(class04453 class044532) {
        for (IBaritone iBaritone : this.getAllBaritones()) {
            if (!Objects.equals(class044532, iBaritone.getPlayerContext().player())) continue;
            return iBaritone;
        }
        return null;
    }

    public List<IBaritone> getAllBaritones();

    default public IBaritone getBaritoneForConnection(class01683 class016832) {
        for (IBaritone iBaritone : this.getAllBaritones()) {
            class04453 class044532 = iBaritone.getPlayerContext().player();
            if (class044532 == null || (class01683)class044532.y_0 != class016832) continue;
            return iBaritone;
        }
        return null;
    }

    public IBaritone createBaritone(class06202 var1);

    public ICommandSystem getCommandSystem();

    public ISchematicSystem getSchematicSystem();

    public boolean destroyBaritone(IBaritone var1);

    public IWorldScanner getWorldScanner();

    default public IBaritone getBaritoneForMinecraft(class06202 class062022) {
        for (IBaritone iBaritone : this.getAllBaritones()) {
            if (!Objects.equals(class062022, iBaritone.getPlayerContext().minecraft())) continue;
            return iBaritone;
        }
        return null;
    }
}

