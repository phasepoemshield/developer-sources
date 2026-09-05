/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.command.datatypes;

import baritone.api.command.exception.CommandException;

public interface IDatatypePostFunction<T, O> {
    public T apply(O var1) throws CommandException;
}

