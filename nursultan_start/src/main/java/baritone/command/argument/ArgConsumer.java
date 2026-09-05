/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.argument.ICommandArgument
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypeContext
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.datatypes.IDatatypePost
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidTypeException
 *  baritone.api.command.exception.CommandNotEnoughArgumentsException
 *  baritone.api.command.exception.CommandTooManyArgumentsException
 *  baritone.api.command.manager.ICommandManager
 */
package baritone.command.argument;

import baritone.Baritone;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.command.exception.CommandNotEnoughArgumentsException;
import baritone.api.command.exception.CommandTooManyArgumentsException;
import baritone.api.command.manager.ICommandManager;
import baritone.command.argument.ArgConsumer$Context;
import baritone.command.argument.CommandArguments;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ArgConsumer
implements IArgConsumer {
    final ICommandManager manager;
    private final IDatatypeContext context;
    private final LinkedList<ICommandArgument> args;
    private final Deque<ICommandArgument> consumed;

    public String getString() throws CommandNotEnoughArgumentsException {
        return this.get().getValue();
    }

    public boolean has(int n) {
        return this.args.size() >= n;
    }

    private ArgConsumer(ICommandManager iCommandManager, Deque<ICommandArgument> deque, Deque<ICommandArgument> deque2) {
        this.manager = iCommandManager;
        this.context = new ArgConsumer$Context(this);
        this.args = new LinkedList<ICommandArgument>(deque);
        this.consumed = new LinkedList<ICommandArgument>(deque2);
    }

    public ArgConsumer(ICommandManager iCommandManager, List<ICommandArgument> list) {
        this(iCommandManager, new LinkedList<ICommandArgument>(list), new LinkedList<ICommandArgument>());
    }

    public ICommandArgument get() throws CommandNotEnoughArgumentsException {
        this.requireMin(1);
        ICommandArgument iCommandArgument = this.args.removeFirst();
        this.consumed.add(iCommandArgument);
        return iCommandArgument;
    }

    public ArgConsumer copy() {
        return new ArgConsumer(this.manager, this.args, this.consumed);
    }

    public boolean is(Class<?> clazz) throws CommandNotEnoughArgumentsException {
        return this.is(clazz, 0);
    }

    public boolean is(Class<?> clazz, int n) throws CommandNotEnoughArgumentsException {
        return this.peek(n).is(clazz);
    }

    public ICommandArgument peek(int n) throws CommandNotEnoughArgumentsException {
        this.requireMin(n + 1);
        return this.args.get(n);
    }

    public ICommandArgument peek() throws CommandNotEnoughArgumentsException {
        return this.peek(0);
    }

    public ICommandArgument consumed() {
        return this.consumed.size() > 0 ? this.consumed.getLast() : CommandArguments.unknown();
    }

    public LinkedList<ICommandArgument> getArgs() {
        return this.args;
    }

    public <E extends Enum<?>> E peekEnum(Class<E> clazz, int n) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return (E)this.peek(n).getEnum(clazz);
    }

    public <E extends Enum<?>> E peekEnum(Class<E> clazz) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return this.peekEnum(clazz, 0);
    }

    public String peekString(int n) throws CommandNotEnoughArgumentsException {
        return this.peek(n).getValue();
    }

    public String peekString() throws CommandNotEnoughArgumentsException {
        return this.peekString(0);
    }

    public void requireMax(int n) throws CommandTooManyArgumentsException {
        if (this.args.size() > n) {
            throw new CommandTooManyArgumentsException(n + this.consumed.size());
        }
    }

    public boolean hasAny() {
        return this.has(1);
    }

    public void requireMin(int n) throws CommandNotEnoughArgumentsException {
        if (this.args.size() < n) {
            throw new CommandNotEnoughArgumentsException(n + this.consumed.size());
        }
    }

    public <T> T peekAs(Class<T> clazz) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return this.peekAs(clazz, 0);
    }

    public <T> T peekAs(Class<T> clazz, int n) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return (T)this.peek(n).getAs(clazz);
    }

    public boolean hasExactly(int n) {
        return this.args.size() == n;
    }

    public boolean hasAtMost(int n) {
        return this.args.size() <= n;
    }

    public <T> T getAs(Class<T> clazz) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return (T)this.get().getAs(clazz);
    }

    public String rawRest() {
        return this.args.size() > 0 ? this.args.getFirst().getRawRest() : "";
    }

    public <E extends Enum<?>> E getEnum(Class<E> clazz) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return (E)this.get().getEnum(clazz);
    }

    public Deque<ICommandArgument> getConsumed() {
        return this.consumed;
    }

    public <T> T peekAsOrDefault(Class<T> clazz, T t, int n) throws CommandNotEnoughArgumentsException {
        try {
            return this.peekAs(clazz, n);
        }
        catch (CommandInvalidTypeException commandInvalidTypeException) {
            return t;
        }
    }

    public <T> T peekAsOrDefault(Class<T> clazz, T t) throws CommandNotEnoughArgumentsException {
        return this.peekAsOrDefault(clazz, t, 0);
    }

    public <T> T peekDatatype(IDatatypeFor<T> iDatatypeFor) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return this.copy().getDatatypeFor(iDatatypeFor);
    }

    public <T, O> T peekDatatype(IDatatypePost<T, O> iDatatypePost, O o) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return this.copy().getDatatypePost(iDatatypePost, o);
    }

    public <T, O> T peekDatatype(IDatatypePost<T, O> iDatatypePost) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return this.peekDatatype(iDatatypePost, null);
    }

    public <T, O> T peekDatatypeOrNull(IDatatypePost<T, O> iDatatypePost) {
        return this.copy().getDatatypePostOrNull(iDatatypePost, null);
    }

    public <T> T peekDatatypeOrNull(IDatatypeFor<T> iDatatypeFor) {
        return this.copy().getDatatypeForOrNull(iDatatypeFor);
    }

    public <T, O, D extends IDatatypePost<T, O>> T peekDatatypePost(D d, O o) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        return this.copy().getDatatypePost(d, o);
    }

    public <T, D extends IDatatypeFor<T>> T peekDatatypeFor(Class<D> clazz) {
        return this.copy().peekDatatypeFor(clazz);
    }

    public <T> T peekAsOrNull(Class<T> clazz) throws CommandNotEnoughArgumentsException {
        return this.peekAsOrNull(clazz, 0);
    }

    public <T> T peekAsOrNull(Class<T> clazz, int n) throws CommandNotEnoughArgumentsException {
        return this.peekAsOrDefault(clazz, null, n);
    }

    public <E extends Enum<?>> E getEnumOrDefault(Class<E> clazz, E e) throws CommandNotEnoughArgumentsException {
        try {
            this.peekEnum(clazz);
            return this.getEnum(clazz);
        }
        catch (CommandInvalidTypeException commandInvalidTypeException) {
            return e;
        }
    }

    public boolean hasAtMostOne() {
        return this.hasAtMost(1);
    }

    public <E extends Enum<?>> E getEnumOrNull(Class<E> clazz) throws CommandNotEnoughArgumentsException {
        return this.getEnumOrDefault(clazz, null);
    }

    public <T> T getAsOrDefault(Class<T> clazz, T t) throws CommandNotEnoughArgumentsException {
        try {
            Object object = this.peek().getAs(clazz);
            this.get();
            return (T)object;
        }
        catch (CommandInvalidTypeException commandInvalidTypeException) {
            return t;
        }
    }

    public <E extends Enum<?>> E peekEnumOrNull(Class<E> clazz) throws CommandNotEnoughArgumentsException {
        return this.peekEnumOrNull(clazz, 0);
    }

    public <E extends Enum<?>> E peekEnumOrNull(Class<E> clazz, int n) throws CommandNotEnoughArgumentsException {
        try {
            return this.peekEnum(clazz, n);
        }
        catch (CommandInvalidTypeException commandInvalidTypeException) {
            return null;
        }
    }

    public boolean hasExactlyOne() {
        return this.hasExactly(1);
    }

    public String consumedString() {
        return this.consumed().getValue();
    }

    public <T, D extends IDatatypeFor<T>> T getDatatypeFor(D d) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        try {
            return (T)d.get(this.context);
        }
        catch (Exception exception) {
            if (((Boolean)Baritone.settings().verboseCommandExceptions.value).booleanValue()) {
                exception.printStackTrace();
            }
            throw new CommandInvalidTypeException(this.hasAny() ? this.peek() : this.consumed(), d.getClass().getSimpleName(), (Throwable)exception);
        }
    }

    public <T> T getAsOrNull(Class<T> clazz) throws CommandNotEnoughArgumentsException {
        return this.getAsOrDefault(clazz, null);
    }

    public boolean hasConsumed() {
        return !this.consumed.isEmpty();
    }

    public <T, O, D extends IDatatypePost<T, O>> T getDatatypePost(D d, O o) throws CommandInvalidTypeException, CommandNotEnoughArgumentsException {
        try {
            return (T)d.apply(this.context, o);
        }
        catch (Exception exception) {
            if (((Boolean)Baritone.settings().verboseCommandExceptions.value).booleanValue()) {
                exception.printStackTrace();
            }
            throw new CommandInvalidTypeException(this.hasAny() ? this.peek() : this.consumed(), d.getClass().getSimpleName(), (Throwable)exception);
        }
    }

    public void requireExactly(int n) throws CommandException {
        this.requireMin(n);
        this.requireMax(n);
    }

    public <T, D extends IDatatypeFor<T>> T peekDatatypeForOrDefault(Class<D> clazz, T t) {
        return this.copy().peekDatatypeForOrDefault(clazz, t);
    }

    public <T, D extends IDatatypeFor<T>> T peekDatatypeForOrNull(Class<D> clazz) {
        return this.peekDatatypeForOrDefault(clazz, null);
    }

    public <T, D extends IDatatypeFor<T>> T getDatatypeForOrDefault(D d, T t) {
        ArrayList<ICommandArgument> arrayList = new ArrayList<ICommandArgument>(this.args);
        ArrayList<ICommandArgument> arrayList2 = new ArrayList<ICommandArgument>(this.consumed);
        try {
            return this.getDatatypeFor(d);
        }
        catch (Exception exception) {
            this.args.clear();
            this.args.addAll(arrayList);
            this.consumed.clear();
            this.consumed.addAll(arrayList2);
            return t;
        }
    }

    public <T, D extends IDatatypeFor<T>> T getDatatypeForOrNull(D d) {
        return this.getDatatypeForOrDefault(d, null);
    }

    public <T, O, D extends IDatatypePost<T, O>> T peekDatatypePostOrNull(D d, O o) {
        return this.peekDatatypePostOrDefault(d, o, null);
    }

    public <T extends IDatatype> Stream<String> tabCompleteDatatype(T t) {
        try {
            return t.tabComplete(this.context);
        }
        catch (CommandException commandException) {
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return Stream.empty();
    }

    public <T, O, D extends IDatatypePost<T, O>> T getDatatypePostOrDefault(D d, O o, T t) {
        ArrayList<ICommandArgument> arrayList = new ArrayList<ICommandArgument>(this.args);
        ArrayList<ICommandArgument> arrayList2 = new ArrayList<ICommandArgument>(this.consumed);
        try {
            return this.getDatatypePost(d, o);
        }
        catch (Exception exception) {
            this.args.clear();
            this.args.addAll(arrayList);
            this.consumed.clear();
            this.consumed.addAll(arrayList2);
            return t;
        }
    }

    public <T, O, D extends IDatatypePost<T, O>> T peekDatatypePostOrDefault(D d, O o, T t) {
        return this.copy().getDatatypePostOrDefault(d, o, t);
    }

    public <T, O, D extends IDatatypePost<T, O>> T getDatatypePostOrNull(D d, O o) {
        return this.getDatatypePostOrDefault(d, o, null);
    }
}

