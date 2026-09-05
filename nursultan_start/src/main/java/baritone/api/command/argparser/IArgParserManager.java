/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.command.argparser;

import baritone.api.command.argparser.IArgParser;
import baritone.api.command.argparser.IArgParser$Stated;
import baritone.api.command.argparser.IArgParser$Stateless;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.command.registry.Registry;

public interface IArgParserManager {
    public Registry<IArgParser> getRegistry();

    public <T, S> IArgParser$Stated<T, S> getParserStated(Class<T> var1, Class<S> var2);

    public <T> IArgParser$Stateless<T> getParserStateless(Class<T> var1);

    public <T> T parseStateless(Class<T> var1, ICommandArgument var2) throws CommandInvalidTypeException;

    public <T, S> T parseStated(Class<T> var1, Class<S> var2, ICommandArgument var3, S var4) throws CommandInvalidTypeException;
}

