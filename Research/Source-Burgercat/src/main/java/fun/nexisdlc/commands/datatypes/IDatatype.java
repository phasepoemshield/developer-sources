package fun.nexisdlc.commands.datatypes;

import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.exception.CommandNotEnoughArgumentsException;

import java.util.stream.Stream;

public interface IDatatype extends ILogger {
    Stream<String> tabComplete(IDatatypeContext ctx) throws CommandException, CommandNotEnoughArgumentsException;
}
