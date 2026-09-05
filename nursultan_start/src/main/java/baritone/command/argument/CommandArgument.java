/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.argument.ICommandArgument
 *  baritone.api.command.exception.CommandInvalidTypeException
 */
package baritone.command.argument;

import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.command.argparser.ArgParserManager;
import java.util.stream.Stream;

class CommandArgument
implements ICommandArgument {
    private final int index;
    private final String value;
    private final String rawRest;

    CommandArgument(int n, String string, String string2) {
        this.index = n;
        this.value = string;
        this.rawRest = string2;
    }

    public String getValue() {
        return this.value;
    }

    public int getIndex() {
        return this.index;
    }

    public <T, S> boolean is(Class<T> clazz, Class<S> clazz2, S s) {
        try {
            this.getAs(clazz, clazz2, s);
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public <T> boolean is(Class<T> clazz) {
        try {
            this.getAs(clazz);
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public String getRawRest() {
        return this.rawRest;
    }

    public <T, S> T getAs(Class<T> clazz, Class<S> clazz2, S s) throws CommandInvalidTypeException {
        return ArgParserManager.INSTANCE.parseStated(clazz, clazz2, this, s);
    }

    public <T> T getAs(Class<T> clazz) throws CommandInvalidTypeException {
        return ArgParserManager.INSTANCE.parseStateless(clazz, this);
    }

    public <E extends Enum<?>> E getEnum(Class<E> clazz) throws CommandInvalidTypeException {
        return (E)Stream.of((Enum[])clazz.getEnumConstants()).filter(enum_ -> enum_.name().equalsIgnoreCase(this.value)).findFirst().orElseThrow(() -> new CommandInvalidTypeException((ICommandArgument)this, clazz.getSimpleName()));
    }
}

