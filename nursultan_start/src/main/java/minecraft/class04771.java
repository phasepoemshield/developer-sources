/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.util.UndashedUuid
 */
package minecraft;

import com.mojang.util.UndashedUuid;
import java.util.Optional;
import java.util.UUID;

public class class04771 {
    private final String N;
    private final UUID y;
    private final String L;
    private final Optional<String> u;
    private final Optional<String> i;

    public String L() {
        return this.N;
    }

    public class04771(String string, UUID uUID, String string2, Optional<String> optional, Optional<String> optional2) {
        this.N = string;
        this.y = uUID;
        this.L = string2;
        this.u = optional;
        this.i = optional2;
    }

    public Optional<String> i() {
        return this.i;
    }

    public String u() {
        return this.L;
    }

    public UUID y() {
        return this.y;
    }

    public String N() {
        return "token:" + this.L + ":" + UndashedUuid.toString((UUID)this.y);
    }

    public Optional<String> R() {
        return this.u;
    }
}

