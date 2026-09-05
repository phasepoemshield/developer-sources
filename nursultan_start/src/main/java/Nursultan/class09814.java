/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10049
 */
package Nursultan;

import Nursultan.class09798;
import Nursultan.class09807;
import Nursultan.class10049;
import java.util.List;

public final class class09814
extends class09807<class09814> {
    private String N = "";
    private String y = "";

    public class09814 L(String string) {
        this.N = string == null ? "" : string;
        return this;
    }

    @Override
    protected class09814 R() {
        return this;
    }

    class09814() {
    }

    @Override
    public class09798 i() {
        return this.N(class10049.INPUT, List.of(), this.N, this.y, "", null);
    }

    public class09814 i(String string) {
        this.y = string == null ? "" : string;
        return this;
    }

    public class09814 u(String string) {
        return this.L(string);
    }
}

