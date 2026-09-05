/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00754
 *  minecraft.class02796
 *  minecraft.class05474
 *  minecraft.class07074
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class08074
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00754;
import minecraft.class02796;
import minecraft.class05207;
import minecraft.class05474;
import minecraft.class07074;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class08074;
import org.jspecify.annotations.Nullable;

public interface class05212
extends class05207 {
    public void L(int var1);

    public void L(boolean var1);

    public int M();

    @Deprecated
    public Optional<class08074> P();

    public int Z();

    public int i();

    public void i(int var1);

    public class00754<class02796> b();

    public @Nullable UUID n();

    public class07305 m();

    public int v();

    public int j();

    public class07282 z();

    public String u();

    public void u(int var1);

    public void y(int var1);

    public void y(long var1);

    public boolean E();

    public void N(class07282 var1);

    public void N(long var1);

    default public void N(class07074 class070742, class05474 class054742) {
        class05207.super.N(class070742, class054742);
        class070742.N("Level name", this::u);
        class070742.N("Level game mode", () -> String.format(Locale.ROOT, "Game mode: %s (ID %d). Hardcore: %b. Commands: %b", this.z().y(), this.z().N(), this.U(), this.E()));
        class070742.N("Level weather", () -> String.format(Locale.ROOT, "Rain time: %d (now: %b), thunder time: %d (now: %b)", this.Z(), this.B(), this.M(), this.R()));
    }

    public void N(boolean var1);

    public void N(UUID var1);

    @Deprecated
    public void N(Optional<class08074> var1);

    public void N(int var1);

    public boolean W();
}

