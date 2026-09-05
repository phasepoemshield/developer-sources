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

public enum DefaultArgParsers$IntArgumentParser implements IArgParser.Stateless<Integer>
{
    INSTANCE;


    public Class<Integer> getTarget() {
        return Integer.class;
    }

    public Integer parseArg(ICommandArgument iCommandArgument) throws RuntimeException {
        return Integer.parseInt(iCommandArgument.getValue());
    }
}

