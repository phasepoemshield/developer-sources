/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.command.argument;

import baritone.api.command.exception.CommandInvalidTypeException;

public interface ICommandArgument {
    public String getValue();

    public int getIndex();

    public <T, S> boolean is(Class<T> var1, Class<S> var2, S var3);

    public <T> boolean is(Class<T> var1);

    public String getRawRest();

    public <T> T getAs(Class<T> var1) throws CommandInvalidTypeException;

    public <T, S> T getAs(Class<T> var1, Class<S> var2, S var3) throws CommandInvalidTypeException;

    public <E extends Enum<?>> E getEnum(Class<E> var1) throws CommandInvalidTypeException;
}

