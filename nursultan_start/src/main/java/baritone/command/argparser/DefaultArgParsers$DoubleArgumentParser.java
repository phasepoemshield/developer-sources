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

public enum DefaultArgParsers$DoubleArgumentParser implements IArgParser.Stateless<Double>
{
    INSTANCE;


    public Class<Double> getTarget() {
        return Double.class;
    }

    public Double parseArg(ICommandArgument iCommandArgument) throws RuntimeException {
        String string = iCommandArgument.getValue();
        if (!string.matches("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$")) {
            throw new IllegalArgumentException("failed double format check");
        }
        return Double.parseDouble(string);
    }
}

