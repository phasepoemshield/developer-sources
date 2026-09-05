/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.argparser.IArgParser$Stateless
 *  baritone.api.command.argument.ICommandArgument
 */
package baritone.command.argparser;

import baritone.api.command.argparser.IArgParser;
import baritone.api.command.argument.ICommandArgument;

public enum DefaultArgParsers$LongArgumentParser implements IArgParser.Stateless<Long>
{
    INSTANCE;


    public Class<Long> getTarget() {
        return Long.class;
    }

    public Long parseArg(ICommandArgument iCommandArgument) throws RuntimeException {
        return Long.parseLong(iCommandArgument.getValue());
    }
}

