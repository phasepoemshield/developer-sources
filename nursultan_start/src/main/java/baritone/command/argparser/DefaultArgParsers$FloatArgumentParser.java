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

public enum DefaultArgParsers$FloatArgumentParser implements IArgParser.Stateless<Float>
{
    INSTANCE;


    public Class<Float> getTarget() {
        return Float.class;
    }

    public Float parseArg(ICommandArgument iCommandArgument) throws RuntimeException {
        String string = iCommandArgument.getValue();
        if (!string.matches("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$")) {
            throw new IllegalArgumentException("failed float format check");
        }
        return Float.valueOf(Float.parseFloat(string));
    }
}

