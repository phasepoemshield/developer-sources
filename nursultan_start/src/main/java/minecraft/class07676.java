/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 */
package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import minecraft.class00392;

public class class07676
implements BuiltInExceptionProvider {
    private static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.double.low", (Object[])new Object[]{object2, object}));
    private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.double.big", (Object[])new Object[]{object2, object}));
    private static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.float.low", (Object[])new Object[]{object2, object}));
    private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.float.big", (Object[])new Object[]{object2, object}));
    private static final Dynamic2CommandExceptionType i = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.integer.low", (Object[])new Object[]{object2, object}));
    private static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.integer.big", (Object[])new Object[]{object2, object}));
    private static final Dynamic2CommandExceptionType M = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.long.low", (Object[])new Object[]{object2, object}));
    private static final Dynamic2CommandExceptionType B = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.long.big", (Object[])new Object[]{object2, object}));
    private static final DynamicCommandExceptionType Z = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.literal.incorrect", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType z = new SimpleCommandExceptionType((Message)class00392.L((String)"parsing.quote.expected.start"));
    private static final SimpleCommandExceptionType U = new SimpleCommandExceptionType((Message)class00392.L((String)"parsing.quote.expected.end"));
    private static final DynamicCommandExceptionType E = new DynamicCommandExceptionType(object -> class00392.y((String)"parsing.quote.escape", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType W = new DynamicCommandExceptionType(object -> class00392.y((String)"parsing.bool.invalid", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType m = new DynamicCommandExceptionType(object -> class00392.y((String)"parsing.int.invalid", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType P = new SimpleCommandExceptionType((Message)class00392.L((String)"parsing.int.expected"));
    private static final DynamicCommandExceptionType s = new DynamicCommandExceptionType(object -> class00392.y((String)"parsing.long.invalid", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType T = new SimpleCommandExceptionType((Message)class00392.L((String)"parsing.long.expected"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType(object -> class00392.y((String)"parsing.double.invalid", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType((Message)class00392.L((String)"parsing.double.expected"));
    private static final DynamicCommandExceptionType v = new DynamicCommandExceptionType(object -> class00392.y((String)"parsing.float.invalid", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType n = new SimpleCommandExceptionType((Message)class00392.L((String)"parsing.float.expected"));
    private static final SimpleCommandExceptionType t = new SimpleCommandExceptionType((Message)class00392.L((String)"parsing.bool.expected"));
    private static final DynamicCommandExceptionType G = new DynamicCommandExceptionType(object -> class00392.y((String)"parsing.expected", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType((Message)class00392.L((String)"command.unknown.command"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)class00392.L((String)"command.unknown.argument"));
    private static final SimpleCommandExceptionType w = new SimpleCommandExceptionType((Message)class00392.L((String)"command.expected.separator"));
    private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType(object -> class00392.y((String)"command.exception", (Object[])new Object[]{object}));

    public Dynamic2CommandExceptionType longTooLow() {
        return M;
    }

    public DynamicCommandExceptionType readerInvalidEscape() {
        return E;
    }

    public DynamicCommandExceptionType readerExpectedSymbol() {
        return G;
    }

    public SimpleCommandExceptionType readerExpectedDouble() {
        return j;
    }

    public DynamicCommandExceptionType dispatcherParseException() {
        return k;
    }

    public DynamicCommandExceptionType readerInvalidDouble() {
        return b;
    }

    public SimpleCommandExceptionType readerExpectedFloat() {
        return n;
    }

    public SimpleCommandExceptionType readerExpectedStartOfQuote() {
        return z;
    }

    public SimpleCommandExceptionType readerExpectedEndOfQuote() {
        return U;
    }

    public SimpleCommandExceptionType dispatcherUnknownCommand() {
        return l;
    }

    public SimpleCommandExceptionType dispatcherUnknownArgument() {
        return d;
    }

    public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
        return w;
    }

    public DynamicCommandExceptionType literalIncorrect() {
        return Z;
    }

    public Dynamic2CommandExceptionType doubleTooLow() {
        return N;
    }

    public Dynamic2CommandExceptionType longTooHigh() {
        return B;
    }

    public DynamicCommandExceptionType readerInvalidLong() {
        return s;
    }

    public SimpleCommandExceptionType readerExpectedLong() {
        return T;
    }

    public DynamicCommandExceptionType readerInvalidFloat() {
        return v;
    }

    public Dynamic2CommandExceptionType integerTooHigh() {
        return R;
    }

    public SimpleCommandExceptionType readerExpectedInt() {
        return P;
    }

    public SimpleCommandExceptionType readerExpectedBool() {
        return t;
    }

    public Dynamic2CommandExceptionType doubleTooHigh() {
        return y;
    }

    public Dynamic2CommandExceptionType floatTooLow() {
        return L;
    }

    public Dynamic2CommandExceptionType floatTooHigh() {
        return u;
    }

    public Dynamic2CommandExceptionType integerTooLow() {
        return i;
    }

    public DynamicCommandExceptionType readerInvalidBool() {
        return W;
    }

    public DynamicCommandExceptionType readerInvalidInt() {
        return m;
    }
}

