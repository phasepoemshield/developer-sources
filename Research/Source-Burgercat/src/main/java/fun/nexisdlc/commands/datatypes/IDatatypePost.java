package fun.nexisdlc.commands.datatypes;

import fun.nexisdlc.commands.exception.CommandException;

public interface IDatatypePost<T, O> extends IDatatype {
    T apply(IDatatypeContext datatypeContext, O original) throws CommandException;
}
