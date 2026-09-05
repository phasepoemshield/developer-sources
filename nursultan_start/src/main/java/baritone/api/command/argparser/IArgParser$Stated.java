/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.command.argparser;

import baritone.api.command.argparser.IArgParser;
import baritone.api.command.argument.ICommandArgument;

public interface IArgParser$Stated<T, S>
extends IArgParser<T> {
    public T parseArg(ICommandArgument var1, S var2) throws Exception;

    public Class<S> getStateType();
}

