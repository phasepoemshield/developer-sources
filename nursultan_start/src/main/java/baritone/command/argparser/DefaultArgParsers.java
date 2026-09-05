/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.argparser.IArgParser
 */
package baritone.command.argparser;

import baritone.api.command.argparser.IArgParser;
import baritone.command.argparser.DefaultArgParsers$BooleanArgumentParser;
import baritone.command.argparser.DefaultArgParsers$DoubleArgumentParser;
import baritone.command.argparser.DefaultArgParsers$FloatArgumentParser;
import baritone.command.argparser.DefaultArgParsers$IntArgumentParser;
import baritone.command.argparser.DefaultArgParsers$LongArgumentParser;
import java.util.Arrays;
import java.util.List;

public class DefaultArgParsers {
    public static final List<IArgParser<?>> ALL = Arrays.asList(new IArgParser[]{DefaultArgParsers$IntArgumentParser.INSTANCE, DefaultArgParsers$LongArgumentParser.INSTANCE, DefaultArgParsers$FloatArgumentParser.INSTANCE, DefaultArgParsers$DoubleArgumentParser.INSTANCE, DefaultArgParsers$BooleanArgumentParser.INSTANCE});
}

