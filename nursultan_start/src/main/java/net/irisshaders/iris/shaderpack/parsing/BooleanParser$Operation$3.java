/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.parsing;

import java.util.Stack;
import net.irisshaders.iris.shaderpack.parsing.BooleanParser$Operation;

final class BooleanParser$Operation$3
extends BooleanParser$Operation {
    @Override
    boolean compute(boolean bl, Stack<Boolean> stack) {
        return !bl;
    }
}

