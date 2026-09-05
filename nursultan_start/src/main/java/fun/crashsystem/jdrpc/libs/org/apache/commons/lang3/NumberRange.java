/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.org.apache.commons.lang3;

import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.Range;
import java.util.Comparator;

public class NumberRange<N extends Number>
extends Range<N> {
    private static final long serialVersionUID = 1L;

    public NumberRange(N number1, N number2, Comparator<N> comp) {
        super(number1, number2, comp);
    }
}

