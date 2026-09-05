/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.argument.ICommandArgument
 */
package baritone.command.argument;

import baritone.api.command.argument.ICommandArgument;
import baritone.command.argument.CommandArgument;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CommandArguments {
    private static final Pattern ARG_PATTERN = Pattern.compile("\\S+");

    private CommandArguments() {
    }

    public static List<ICommandArgument> from(String string, boolean bl) {
        ArrayList<ICommandArgument> arrayList = new ArrayList<ICommandArgument>();
        Matcher matcher = ARG_PATTERN.matcher(string);
        int n = -1;
        while (matcher.find()) {
            arrayList.add(new CommandArgument(arrayList.size(), matcher.group(), string.substring(matcher.start())));
            n = matcher.end();
        }
        if (bl && n < string.length()) {
            arrayList.add(new CommandArgument(arrayList.size(), "", ""));
        }
        return arrayList;
    }

    public static List<ICommandArgument> from(String string) {
        return CommandArguments.from(string, false);
    }

    public static CommandArgument unknown() {
        return new CommandArgument(-1, "<unknown>", "");
    }
}

