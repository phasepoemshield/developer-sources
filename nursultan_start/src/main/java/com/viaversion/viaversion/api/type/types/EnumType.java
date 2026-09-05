/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.types.EnumType$1
 *  com.viaversion.viaversion.api.type.types.VarIntType
 *  com.viaversion.viaversion.util.MathUtil
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.EnumType;
import com.viaversion.viaversion.api.type.types.VarIntType;
import com.viaversion.viaversion.util.MathUtil;

public final class EnumType
extends VarIntType {
    private final String[] names;
    private final Fallback fallback;

    public String[] names() {
        return this.names;
    }

    public EnumType(String ... names) {
        this(Fallback.ZERO, names);
    }

    public EnumType(Fallback fallback, String ... names) {
        this.names = names;
        this.fallback = fallback;
    }

    public void write(Ops ops, Integer value) {
        Types.STRING.write(ops, this.nameFromId(value));
    }

    public int idFromName(String name) {
        for (int i = 0; i < this.names.length; ++i) {
            if (!this.names[i].equals(name)) continue;
            return i;
        }
        return switch (1.$SwitchMap$com$viaversion$viaversion$api$type$types$EnumType$Fallback[this.fallback.ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1 -> 0;
            case 2 -> Math.floorMod(name.hashCode(), this.names.length);
            case 3 -> this.names.length - 1;
        };
    }

    public String nameFromId(int id) {
        if (id < 0 || id >= this.names.length) {
            return switch (1.$SwitchMap$com$viaversion$viaversion$api$type$types$EnumType$Fallback[this.fallback.ordinal()]) {
                default -> throw new IncompatibleClassChangeError();
                case 1 -> this.names[0];
                case 2 -> this.names[Math.floorMod(id, this.names.length)];
                case 3 -> this.names[MathUtil.clamp((int)id, (int)0, (int)(this.names.length - 1))];
            };
        }
        return this.names[id];
    }

    public static enum Fallback {
        ZERO,
        WRAP,
        CLAMP;

    }
}

