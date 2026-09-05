/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.command.datatypes;

import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.exception.CommandException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public enum RelativeCoordinate implements IDatatypePost<Double, Double>
{
    INSTANCE;

    private static String ScalesAliasRegex;
    private static Pattern PATTERN;

    static {
        ScalesAliasRegex = "[kKmM]";
        PATTERN = Pattern.compile("^(~?)([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)(" + ScalesAliasRegex + "?)|)$");
    }

    @Override
    public Double apply(IDatatypeContext iDatatypeContext, Double d) throws CommandException {
        double d2;
        Matcher matcher;
        if (d == null) {
            d = 0.0;
        }
        if (!(matcher = PATTERN.matcher(iDatatypeContext.getConsumer().getString())).matches()) {
            throw new IllegalArgumentException("pattern doesn't match");
        }
        boolean bl = !matcher.group(1).isEmpty();
        double d3 = d2 = matcher.group(2).isEmpty() ? 0.0 : Double.parseDouble(matcher.group(2).replaceAll(ScalesAliasRegex, ""));
        if (matcher.group(2).toLowerCase().contains("k")) {
            d2 *= 1000.0;
        }
        if (matcher.group(2).toLowerCase().contains("m")) {
            d2 *= 1000000.0;
        }
        if (bl) {
            return d + d2;
        }
        return d2;
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        IArgConsumer iArgConsumer = iDatatypeContext.getConsumer();
        if (!iArgConsumer.has(2) && iArgConsumer.getString().matches("^(~|$)")) {
            return Stream.of("~");
        }
        return Stream.empty();
    }
}

