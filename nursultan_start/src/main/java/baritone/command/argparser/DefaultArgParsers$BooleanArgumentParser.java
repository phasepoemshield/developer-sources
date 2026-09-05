/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.argparser.IArgParser$Stateless
 *  baritone.api.command.argument.ICommandArgument
 */
package baritone.command.argparser;

import baritone.api.command.argparser.IArgParser;
import baritone.api.command.argument.ICommandArgument;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class DefaultArgParsers$BooleanArgumentParser
implements IArgParser.Stateless<Boolean> {
    public static final DefaultArgParsers$BooleanArgumentParser INSTANCE = new DefaultArgParsers$BooleanArgumentParser();
    public static final List<String> TRUTHY_VALUES = Arrays.asList("1", "true", "yes", "t", "y", "on", "enable");
    public static final List<String> FALSY_VALUES = Arrays.asList("0", "false", "no", "f", "n", "off", "disable");

    public Class<Boolean> getTarget() {
        return Boolean.class;
    }

    public Boolean parseArg(ICommandArgument iCommandArgument) throws RuntimeException {
        String string = iCommandArgument.getValue();
        if (TRUTHY_VALUES.contains(string.toLowerCase(Locale.US))) {
            return true;
        }
        if (FALSY_VALUES.contains(string.toLowerCase(Locale.US))) {
            return false;
        }
        throw new IllegalArgumentException("invalid boolean");
    }
}

