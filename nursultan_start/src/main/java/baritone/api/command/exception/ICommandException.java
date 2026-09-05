/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Helper
 *  minecraft.class06541
 */
package baritone.api.command.exception;

import baritone.api.command.ICommand;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.utils.Helper;
import java.util.List;
import minecraft.class06541;

public interface ICommandException {
    public String getMessage();

    default public void handle(ICommand iCommand, List<ICommandArgument> list) {
        Helper.HELPER.logDirect(this.getMessage(), class06541.field_1061);
    }
}

