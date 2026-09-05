/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09325
 *  Nursultan.class11938
 *  baritone.api.command.ICommand
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandUnhandledException
 *  baritone.api.command.exception.ICommandException
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package baritone.command.manager;

import Nursultan.class09325;
import Nursultan.class11938;
import baritone.api.command.ICommand;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandUnhandledException;
import baritone.api.command.exception.ICommandException;
import baritone.command.argument.ArgConsumer;
import java.util.stream.Stream;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

final class CommandManager$ExecutionWrapper {
    private ICommand command;
    private String label;
    private ArgConsumer args;

    CommandManager$ExecutionWrapper(ICommand iCommand, String string, ArgConsumer argConsumer) {
        this.command = iCommand;
        this.label = string;
        this.args = argConsumer;
    }

    void execute() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$cfm000$nursultan$injectExecute(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        try {
            this.command.execute(this.label, (IArgConsumer)this.args);
        }
        catch (Throwable throwable) {
            ICommandException iCommandException = throwable instanceof ICommandException ? (ICommandException)throwable : new CommandUnhandledException(throwable);
            iCommandException.handle(this.command, this.args.getArgs());
        }
    }

    public void handler$cfm000$nursultan$injectExecute(CallbackInfo callbackInfo) {
        class09325 class093252 = class09325.N((String)this.label, (ArgConsumer)this.args);
        class11938.L().L((Object)class093252);
        if (class093252.y()) {
            callbackInfo.cancel();
        }
    }

    Stream<String> tabComplete() {
        try {
            return this.command.tabComplete(this.label, (IArgConsumer)this.args);
        }
        catch (CommandException commandException) {
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return Stream.empty();
    }
}

