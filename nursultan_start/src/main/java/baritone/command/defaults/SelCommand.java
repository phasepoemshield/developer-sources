/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.ForAxis
 *  baritone.api.command.datatypes.ForBlockOptionalMeta
 *  baritone.api.command.datatypes.ForDirection
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.datatypes.IDatatypePost
 *  baritone.api.command.datatypes.RelativeBlockPos
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.command.exception.CommandInvalidTypeException
 *  baritone.api.command.helpers.TabCompleteHelper
 *  baritone.api.event.listener.IGameEventListener
 *  baritone.api.schematic.CompositeSchematic
 *  baritone.api.schematic.FillSchematic
 *  baritone.api.schematic.ISchematic
 *  baritone.api.schematic.MaskSchematic
 *  baritone.api.schematic.ReplaceSchematic
 *  baritone.api.schematic.ShellSchematic
 *  baritone.api.schematic.WallsSchematic
 *  baritone.api.schematic.mask.Mask
 *  baritone.api.schematic.mask.shape.CylinderMask
 *  baritone.api.schematic.mask.shape.SphereMask
 *  baritone.api.selection.ISelection
 *  baritone.api.selection.ISelectionManager
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.BlockOptionalMeta
 *  baritone.api.utils.BlockOptionalMetaLookup
 *  baritone.utils.BlockStateInterface
 *  baritone.utils.schematic.StaticSchematic
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class07185
 *  minecraft.class07211
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.ForAxis;
import baritone.api.command.datatypes.ForBlockOptionalMeta;
import baritone.api.command.datatypes.ForDirection;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeBlockPos;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.event.listener.IGameEventListener;
import baritone.api.schematic.CompositeSchematic;
import baritone.api.schematic.FillSchematic;
import baritone.api.schematic.ISchematic;
import baritone.api.schematic.MaskSchematic;
import baritone.api.schematic.ReplaceSchematic;
import baritone.api.schematic.ShellSchematic;
import baritone.api.schematic.WallsSchematic;
import baritone.api.schematic.mask.Mask;
import baritone.api.schematic.mask.shape.CylinderMask;
import baritone.api.schematic.mask.shape.SphereMask;
import baritone.api.selection.ISelection;
import baritone.api.selection.ISelectionManager;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.BlockOptionalMeta;
import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.command.defaults.SelCommand$1;
import baritone.command.defaults.SelCommand$Action;
import baritone.command.defaults.SelCommand$TransformTarget;
import baritone.utils.BlockStateInterface;
import baritone.utils.schematic.StaticSchematic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class07185;
import minecraft.class07211;

public class SelCommand
extends Command {
    private ISelectionManager manager;
    BetterBlockPos pos1;
    private ISchematic clipboard;
    private class00753 clipboardOffset;

    public SelCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"sel", "selection", "s"});
        this.manager = this.baritone.getSelectionManager();
        this.pos1 = null;
        this.clipboard = null;
        this.clipboardOffset = null;
        iBaritone.getGameEventHandler().registerEventListener((IGameEventListener)new SelCommand$1(this));
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        SelCommand$Action selCommand$Action = SelCommand$Action.getByName(iArgConsumer.getString());
        if (selCommand$Action == null) {
            throw new CommandInvalidTypeException(iArgConsumer.consumed(), "an action");
        }
        if (selCommand$Action == SelCommand$Action.POS1 || selCommand$Action == SelCommand$Action.POS2) {
            if (selCommand$Action == SelCommand$Action.POS2 && this.pos1 == null) {
                throw new CommandInvalidStateException("Set pos1 first before using pos2");
            }
            BetterBlockPos betterBlockPos = this.ctx.viewerPos();
            BetterBlockPos betterBlockPos2 = iArgConsumer.hasAny() ? (BetterBlockPos)iArgConsumer.getDatatypePost((IDatatypePost)RelativeBlockPos.INSTANCE, (Object)betterBlockPos) : betterBlockPos;
            iArgConsumer.requireMax(0);
            if (selCommand$Action == SelCommand$Action.POS1) {
                this.pos1 = betterBlockPos2;
                this.logDirect("Position 1 has been set");
            } else {
                this.manager.addSelection(this.pos1, betterBlockPos2);
                this.pos1 = null;
                this.logDirect("Selection added");
            }
        } else if (selCommand$Action == SelCommand$Action.CLEAR) {
            iArgConsumer.requireMax(0);
            this.pos1 = null;
            this.logDirect(String.format("Removed %d selections", this.manager.removeAllSelections().length));
        } else if (selCommand$Action == SelCommand$Action.UNDO) {
            iArgConsumer.requireMax(0);
            if (this.pos1 != null) {
                this.pos1 = null;
                this.logDirect("Undid pos1");
            } else {
                ISelection[] iSelectionArray = this.manager.getSelections();
                if (iSelectionArray.length < 1) {
                    throw new CommandInvalidStateException("Nothing to undo!");
                }
                this.pos1 = this.manager.removeSelection(iSelectionArray[iSelectionArray.length - 1]).pos1();
                this.logDirect("Undid pos2");
            }
        } else if (selCommand$Action.isFillAction()) {
            BetterBlockPos betterBlockPos;
            class07185 class071852;
            BlockOptionalMetaLookup blockOptionalMetaLookup;
            ISelection[] iSelectionArray;
            BlockOptionalMeta blockOptionalMeta;
            BlockOptionalMeta blockOptionalMeta2 = blockOptionalMeta = selCommand$Action == SelCommand$Action.CLEARAREA ? new BlockOptionalMeta(class00869.N) : (BlockOptionalMeta)iArgConsumer.getDatatypeFor((IDatatypeFor)ForBlockOptionalMeta.INSTANCE);
            if (selCommand$Action == SelCommand$Action.REPLACE) {
                iArgConsumer.requireMin(1);
                iSelectionArray = new ArrayList();
                iSelectionArray.add(blockOptionalMeta);
                while (iArgConsumer.has(2)) {
                    iSelectionArray.add((BlockOptionalMeta)iArgConsumer.getDatatypeFor((IDatatypeFor)ForBlockOptionalMeta.INSTANCE));
                }
                blockOptionalMeta = (BlockOptionalMeta)iArgConsumer.getDatatypeFor((IDatatypeFor)ForBlockOptionalMeta.INSTANCE);
                blockOptionalMetaLookup = new BlockOptionalMetaLookup(iSelectionArray.toArray(new BlockOptionalMeta[0]));
                class071852 = null;
            } else if (selCommand$Action == SelCommand$Action.CYLINDER || selCommand$Action == SelCommand$Action.HCYLINDER) {
                iArgConsumer.requireMax(1);
                class071852 = iArgConsumer.hasAny() ? (class07185)iArgConsumer.getDatatypeFor((IDatatypeFor)ForAxis.INSTANCE) : class07185.field_11052;
                blockOptionalMetaLookup = null;
            } else {
                iArgConsumer.requireMax(0);
                blockOptionalMetaLookup = null;
                class071852 = null;
            }
            iSelectionArray = this.manager.getSelections();
            if (iSelectionArray.length == 0) {
                throw new CommandInvalidStateException("No selections");
            }
            BetterBlockPos betterBlockPos3 = iSelectionArray[0].min();
            CompositeSchematic compositeSchematic = new CompositeSchematic(0, 0, 0);
            for (ISelection iSelection : iSelectionArray) {
                betterBlockPos = iSelection.min();
                betterBlockPos3 = new BetterBlockPos(Math.min(betterBlockPos3.x, betterBlockPos.x), Math.min(betterBlockPos3.y, betterBlockPos.y), Math.min(betterBlockPos3.z, betterBlockPos.z));
            }
            for (ISelection iSelection : iSelectionArray) {
                betterBlockPos = iSelection.size();
                BetterBlockPos betterBlockPos4 = iSelection.min();
                UnaryOperator unaryOperator = iSchematic -> {
                    int n = iSchematic.widthX();
                    int n2 = iSchematic.heightY();
                    int n3 = iSchematic.lengthZ();
                    switch (selCommand$Action.ordinal()) {
                        case 5: {
                            return new WallsSchematic(iSchematic);
                        }
                        case 6: {
                            return new ShellSchematic(iSchematic);
                        }
                        case 12: {
                            return new ReplaceSchematic(iSchematic, blockOptionalMetaLookup);
                        }
                        case 7: {
                            return MaskSchematic.create((ISchematic)iSchematic, (Mask)new SphereMask(n, n2, n3, true).compute());
                        }
                        case 8: {
                            return MaskSchematic.create((ISchematic)iSchematic, (Mask)new SphereMask(n, n2, n3, false).compute());
                        }
                        case 9: {
                            return MaskSchematic.create((ISchematic)iSchematic, (Mask)new CylinderMask(n, n2, n3, true, class071852).compute());
                        }
                        case 10: {
                            return MaskSchematic.create((ISchematic)iSchematic, (Mask)new CylinderMask(n, n2, n3, false, class071852).compute());
                        }
                    }
                    return iSchematic;
                };
                ISchematic iSchematic2 = (ISchematic)unaryOperator.apply(new FillSchematic(betterBlockPos.method_10263(), betterBlockPos.method_10264(), betterBlockPos.method_10260(), blockOptionalMeta));
                compositeSchematic.put(iSchematic2, betterBlockPos4.x - betterBlockPos3.x, betterBlockPos4.y - betterBlockPos3.y, betterBlockPos4.z - betterBlockPos3.z);
            }
            this.baritone.getBuilderProcess().build("Fill", (ISchematic)compositeSchematic, (class00753)betterBlockPos3);
            this.logDirect("Filling now");
        } else if (selCommand$Action == SelCommand$Action.COPY) {
            BetterBlockPos betterBlockPos;
            BetterBlockPos betterBlockPos5 = this.ctx.viewerPos();
            BetterBlockPos betterBlockPos6 = iArgConsumer.hasAny() ? (BetterBlockPos)iArgConsumer.getDatatypePost((IDatatypePost)RelativeBlockPos.INSTANCE, (Object)betterBlockPos5) : betterBlockPos5;
            iArgConsumer.requireMax(0);
            ISelection[] iSelectionArray = this.manager.getSelections();
            if (iSelectionArray.length < 1) {
                throw new CommandInvalidStateException("No selections");
            }
            BlockStateInterface blockStateInterface = new BlockStateInterface(this.ctx);
            BetterBlockPos betterBlockPos7 = iSelectionArray[0].min();
            CompositeSchematic compositeSchematic = new CompositeSchematic(0, 0, 0);
            for (ISelection iSelection : iSelectionArray) {
                betterBlockPos = iSelection.min();
                betterBlockPos7 = new BetterBlockPos(Math.min(betterBlockPos7.x, betterBlockPos.x), Math.min(betterBlockPos7.y, betterBlockPos.y), Math.min(betterBlockPos7.z, betterBlockPos.z));
            }
            for (ISelection iSelection : iSelectionArray) {
                betterBlockPos = iSelection.size();
                BetterBlockPos betterBlockPos8 = iSelection.min();
                class00500[][][] class00500Array = new class00500[betterBlockPos.method_10263()][betterBlockPos.method_10260()][betterBlockPos.method_10264()];
                for (int i = 0; i < betterBlockPos.method_10263(); ++i) {
                    for (int j = 0; j < betterBlockPos.method_10264(); ++j) {
                        for (int k = 0; k < betterBlockPos.method_10260(); ++k) {
                            class00500Array[i][k][j] = blockStateInterface.get0(betterBlockPos8.x + i, betterBlockPos8.y + j, betterBlockPos8.z + k);
                        }
                    }
                }
                StaticSchematic staticSchematic = new StaticSchematic(class00500Array);
                compositeSchematic.put((ISchematic)staticSchematic, betterBlockPos8.x - betterBlockPos7.x, betterBlockPos8.y - betterBlockPos7.y, betterBlockPos8.z - betterBlockPos7.z);
            }
            this.clipboard = compositeSchematic;
            this.clipboardOffset = betterBlockPos7.method_10059((class00753)betterBlockPos6);
            this.logDirect("Selection copied");
        } else if (selCommand$Action == SelCommand$Action.PASTE) {
            BetterBlockPos betterBlockPos = this.ctx.viewerPos();
            BetterBlockPos betterBlockPos9 = iArgConsumer.hasAny() ? (BetterBlockPos)iArgConsumer.getDatatypePost((IDatatypePost)RelativeBlockPos.INSTANCE, (Object)betterBlockPos) : betterBlockPos;
            iArgConsumer.requireMax(0);
            if (this.clipboard == null) {
                throw new CommandInvalidStateException("You need to copy a selection first");
            }
            this.baritone.getBuilderProcess().build("Fill", this.clipboard, (class00753)betterBlockPos9.method_10081(this.clipboardOffset));
            this.logDirect("Building now");
        } else if (selCommand$Action == SelCommand$Action.EXPAND || selCommand$Action == SelCommand$Action.CONTRACT || selCommand$Action == SelCommand$Action.SHIFT) {
            iArgConsumer.requireExactly(3);
            SelCommand$TransformTarget selCommand$TransformTarget = SelCommand$TransformTarget.getByName(iArgConsumer.getString());
            if (selCommand$TransformTarget == null) {
                throw new CommandInvalidStateException("Invalid transform type");
            }
            class07211 class072112 = (class07211)iArgConsumer.getDatatypeFor((IDatatypeFor)ForDirection.INSTANCE);
            int n = (Integer)iArgConsumer.getAs(Integer.class);
            ISelection[] iSelectionArray = this.manager.getSelections();
            if (iSelectionArray.length < 1) {
                throw new CommandInvalidStateException("No selections found");
            }
            for (ISelection iSelection : iSelectionArray = selCommand$TransformTarget.transform(iSelectionArray)) {
                if (selCommand$Action == SelCommand$Action.EXPAND) {
                    this.manager.expand(iSelection, class072112, n);
                    continue;
                }
                if (selCommand$Action == SelCommand$Action.CONTRACT) {
                    this.manager.contract(iSelection, class072112, n);
                    continue;
                }
                this.manager.shift(iSelection, class072112, n);
            }
            this.logDirect(String.format("Transformed %d selections", iSelectionArray.length));
        }
    }

    public String getShortDesc() {
        return "WorldEdit-like commands";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The sel command allows you to manipulate Baritone's selections, similarly to WorldEdit.", "", "Using these selections, you can clear areas, fill them with blocks, or something else.", "", "The expand/contract/shift commands use a kind of selector to choose which selections to target. Supported ones are a/all, n/newest, and o/oldest.", "", "Usage:", "> sel pos1/p1/1 - Set position 1 to your current position.", "> sel pos1/p1/1 <x> <y> <z> - Set position 1 to a relative position.", "> sel pos2/p2/2 - Set position 2 to your current position.", "> sel pos2/p2/2 <x> <y> <z> - Set position 2 to a relative position.", "", "> sel clear/c - Clear the selection.", "> sel undo/u - Undo the last action (setting positions, creating selections, etc.)", "> sel set/fill/s/f [block] - Completely fill all selections with a block.", "> sel walls/w [block] - Fill in the walls of the selection with a specified block.", "> sel shell/shl [block] - The same as walls, but fills in a ceiling and floor too.", "> sel sphere/sph [block] - Fills the selection with a sphere bounded by the sides.", "> sel hsphere/hsph [block] - The same as sphere, but hollow.", "> sel cylinder/cyl [block] <axis> - Fills the selection with a cylinder bounded by the sides, oriented about the given axis. (default=y)", "> sel hcylinder/hcyl [block] <axis> - The same as cylinder, but hollow.", "> sel cleararea/ca - Basically 'set air'.", "> sel replace/r <blocks...> <with> - Replaces blocks with another block.", "> sel copy/cp <x> <y> <z> - Copy the selected area relative to the specified or your position.", "> sel paste/p <x> <y> <z> - Build the copied area relative to the specified or your position.", "", "> sel expand <target> <direction> <blocks> - Expand the targets.", "> sel contract <target> <direction> <blocks> - Contract the targets.", "> sel shift <target> <direction> <blocks> - Shift the targets (does not resize).");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        if (iArgConsumer.hasExactlyOne()) {
            return new TabCompleteHelper().append(SelCommand$Action.getAllNames()).filterPrefix(iArgConsumer.getString()).sortAlphabetically().stream();
        }
        SelCommand$Action selCommand$Action = SelCommand$Action.getByName(iArgConsumer.getString());
        if (selCommand$Action != null) {
            if (selCommand$Action == SelCommand$Action.POS1 || selCommand$Action == SelCommand$Action.POS2) {
                if (iArgConsumer.hasAtMost(3)) {
                    return iArgConsumer.tabCompleteDatatype((IDatatype)RelativeBlockPos.INSTANCE);
                }
            } else if (selCommand$Action.isFillAction()) {
                if (iArgConsumer.hasExactlyOne() || selCommand$Action == SelCommand$Action.REPLACE) {
                    while (iArgConsumer.has(2)) {
                        iArgConsumer.get();
                    }
                    return iArgConsumer.tabCompleteDatatype((IDatatype)ForBlockOptionalMeta.INSTANCE);
                }
                if (iArgConsumer.hasExactly(2) && (selCommand$Action == SelCommand$Action.CYLINDER || selCommand$Action == SelCommand$Action.HCYLINDER)) {
                    iArgConsumer.get();
                    return iArgConsumer.tabCompleteDatatype((IDatatype)ForAxis.INSTANCE);
                }
            } else if (selCommand$Action == SelCommand$Action.EXPAND || selCommand$Action == SelCommand$Action.CONTRACT || selCommand$Action == SelCommand$Action.SHIFT) {
                if (iArgConsumer.hasExactlyOne()) {
                    return new TabCompleteHelper().append(SelCommand$TransformTarget.getAllNames()).filterPrefix(iArgConsumer.getString()).sortAlphabetically().stream();
                }
                SelCommand$TransformTarget selCommand$TransformTarget = SelCommand$TransformTarget.getByName(iArgConsumer.getString());
                if (selCommand$TransformTarget != null && iArgConsumer.hasExactlyOne()) {
                    return iArgConsumer.tabCompleteDatatype((IDatatype)ForDirection.INSTANCE);
                }
            }
        }
        return Stream.empty();
    }
}

