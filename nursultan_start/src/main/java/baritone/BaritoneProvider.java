/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.ISchematicSystem
 *  baritone.cache.FasterWorldScanner
 *  baritone.command.CommandSystem
 *  baritone.command.ExampleBaritoneControl
 *  baritone.utils.schematic.SchematicSystem
 *  minecraft.class06202
 */
package baritone;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.IBaritoneProvider;
import baritone.api.cache.IWorldScanner;
import baritone.api.command.ICommandSystem;
import baritone.api.schematic.ISchematicSystem;
import baritone.cache.FasterWorldScanner;
import baritone.command.CommandSystem;
import baritone.command.ExampleBaritoneControl;
import baritone.utils.schematic.SchematicSystem;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import minecraft.class06202;

public final class BaritoneProvider
implements IBaritoneProvider {
    private final List<IBaritone> all = new CopyOnWriteArrayList<IBaritone>();
    private final List<IBaritone> allView = Collections.unmodifiableList(this.all);

    public BaritoneProvider() {
        Baritone baritone = (Baritone)this.createBaritone(class06202.Nq());
        baritone.registerBehavior(ExampleBaritoneControl::new);
    }

    @Override
    public IBaritone getPrimaryBaritone() {
        return this.all.get(0);
    }

    @Override
    public List<IBaritone> getAllBaritones() {
        return this.allView;
    }

    @Override
    public synchronized IBaritone createBaritone(class06202 class062022) {
        IBaritone iBaritone = this.getBaritoneForMinecraft(class062022);
        if (iBaritone == null) {
            iBaritone = new Baritone(class062022);
            this.all.add(iBaritone);
        }
        return iBaritone;
    }

    @Override
    public ICommandSystem getCommandSystem() {
        return CommandSystem.INSTANCE;
    }

    @Override
    public ISchematicSystem getSchematicSystem() {
        return SchematicSystem.INSTANCE;
    }

    @Override
    public synchronized boolean destroyBaritone(IBaritone iBaritone) {
        return iBaritone != this.getPrimaryBaritone() && this.all.remove(iBaritone);
    }

    @Override
    public IWorldScanner getWorldScanner() {
        return FasterWorldScanner.INSTANCE;
    }
}

