/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.argparser.IArgParser
 *  baritone.api.command.argparser.IArgParser$Stated
 *  baritone.api.command.argparser.IArgParser$Stateless
 *  baritone.api.command.argparser.IArgParserManager
 *  baritone.api.command.argument.ICommandArgument
 *  baritone.api.command.exception.CommandInvalidTypeException
 *  baritone.api.command.exception.CommandNoParserForTypeException
 *  baritone.api.command.registry.Registry
 */
package baritone.command.argparser;

import baritone.api.command.argparser.IArgParser;
import baritone.api.command.argparser.IArgParserManager;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.command.exception.CommandNoParserForTypeException;
import baritone.api.command.registry.Registry;
import baritone.command.argparser.DefaultArgParsers;

public enum ArgParserManager implements IArgParserManager
{
    INSTANCE;

    public final Registry<IArgParser> registry = new Registry();

    private ArgParserManager() {
        DefaultArgParsers.ALL.forEach(arg_0 -> this.registry.register(arg_0));
    }

    public Registry<IArgParser> getRegistry() {
        return this.registry;
    }

    public <T, S> IArgParser.Stated<T, S> getParserStated(Class<T> clazz, Class<S> clazz2) {
        return this.registry.descendingStream().filter(IArgParser.Stated.class::isInstance).map(IArgParser.Stated.class::cast).filter(stated -> stated.getTarget().isAssignableFrom(clazz)).filter(stated -> stated.getStateType().isAssignableFrom(clazz2)).map(IArgParser.Stated.class::cast).findFirst().orElse(null);
    }

    public <T> IArgParser.Stateless<T> getParserStateless(Class<T> clazz) {
        return this.registry.descendingStream().filter(IArgParser.Stateless.class::isInstance).map(IArgParser.Stateless.class::cast).filter(stateless -> stateless.getTarget().isAssignableFrom(clazz)).findFirst().orElse(null);
    }

    public <T> T parseStateless(Class<T> clazz, ICommandArgument iCommandArgument) throws CommandInvalidTypeException {
        IArgParser.Stateless<T> stateless = this.getParserStateless(clazz);
        if (stateless == null) {
            throw new CommandNoParserForTypeException(clazz);
        }
        try {
            return (T)stateless.parseArg(iCommandArgument);
        }
        catch (Exception exception) {
            throw new CommandInvalidTypeException(iCommandArgument, clazz.getSimpleName());
        }
    }

    public <T, S> T parseStated(Class<T> clazz, Class<S> clazz2, ICommandArgument iCommandArgument, S s) throws CommandInvalidTypeException {
        IArgParser.Stated<T, S> stated = this.getParserStated(clazz, clazz2);
        if (stated == null) {
            throw new CommandNoParserForTypeException(clazz);
        }
        try {
            return (T)stated.parseArg(iCommandArgument, s);
        }
        catch (Exception exception) {
            throw new CommandInvalidTypeException(iCommandArgument, clazz.getSimpleName());
        }
    }
}

