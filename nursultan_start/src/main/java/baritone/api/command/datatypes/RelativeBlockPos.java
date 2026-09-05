/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 */
package baritone.api.command.datatypes;

import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeCoordinate;
import baritone.api.command.exception.CommandException;
import baritone.api.utils.BetterBlockPos;
import java.util.stream.Stream;

public enum RelativeBlockPos implements IDatatypePost<BetterBlockPos, BetterBlockPos>
{
    INSTANCE;


    @Override
    public BetterBlockPos apply(IDatatypeContext iDatatypeContext, BetterBlockPos betterBlockPos) throws CommandException {
        if (betterBlockPos == null) {
            betterBlockPos = BetterBlockPos.ORIGIN;
        }
        IArgConsumer iArgConsumer = iDatatypeContext.getConsumer();
        return new BetterBlockPos(((Double)iArgConsumer.getDatatypePost(RelativeCoordinate.INSTANCE, Double.valueOf(betterBlockPos.x))).doubleValue(), ((Double)iArgConsumer.getDatatypePost(RelativeCoordinate.INSTANCE, Double.valueOf(betterBlockPos.y))).doubleValue(), ((Double)iArgConsumer.getDatatypePost(RelativeCoordinate.INSTANCE, Double.valueOf(betterBlockPos.z))).doubleValue());
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        IArgConsumer iArgConsumer = iDatatypeContext.getConsumer();
        if (iArgConsumer.hasAny() && !iArgConsumer.has(4)) {
            while (iArgConsumer.has(2) && iArgConsumer.peekDatatypeOrNull(RelativeCoordinate.INSTANCE) != null) {
                iArgConsumer.get();
            }
            return iArgConsumer.tabCompleteDatatype(RelativeCoordinate.INSTANCE);
        }
        return Stream.empty();
    }
}

