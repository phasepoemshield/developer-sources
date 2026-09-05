/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09736
 *  Nursultan.class09904
 */
package Nursultan;

import Nursultan.class09736;
import Nursultan.class09860;
import Nursultan.class09867;
import Nursultan.class09904;
import java.util.Objects;

public final class class09842
extends class09860 {
    private final class09736 N;
    private final boolean y;

    public class09842(class09904 class099042, class09736 class097362, boolean bl) {
        super(class09867.TRANSITION_END, class099042);
        this.N = Objects.requireNonNull(class097362, "property");
        this.y = bl;
    }

    public boolean y() {
        return this.y;
    }

    public class09736 N() {
        return this.N;
    }
}

