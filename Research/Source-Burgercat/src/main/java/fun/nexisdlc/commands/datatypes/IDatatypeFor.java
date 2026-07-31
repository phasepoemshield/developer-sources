package fun.nexisdlc.commands.datatypes;

import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.exception.CommandNotEnoughArgumentsException;

public interface IDatatypeFor<T> extends IDatatype  {
    T get(IDatatypeContext datatypeContext) throws CommandException, CommandNotEnoughArgumentsException;
}
