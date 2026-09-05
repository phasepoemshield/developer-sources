/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.cache.IWorldData
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07007
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07299
 */
package baritone.api.utils;

import baritone.api.cache.IWorldData;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerController;
import baritone.api.utils.Rotation;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07007;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07299;

public interface IPlayerContext {
    public class06202 minecraft();

    @Deprecated
    public static double eyeHeight(boolean bl) {
        return bl ? 1.27 : 1.62;
    }

    default public Iterable<class07049> entities() {
        return ((class03448)this.world()).M();
    }

    public class04453 player();

    public class07299 world();

    public IWorldData worldData();

    default public BetterBlockPos playerFeet() {
        BetterBlockPos betterBlockPos = new BetterBlockPos(this.player().method_73189().M, this.player().method_73189().B + 0.1251, this.player().method_73189().Z);
        try {
            if (this.world().method_8320((class07209)betterBlockPos).i() instanceof class07007) {
                return betterBlockPos.above();
            }
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        return betterBlockPos;
    }

    public BetterBlockPos viewerPos();

    default public class06889 playerHead() {
        return new class06889(this.player().method_73189().M, this.player().method_73189().B + (double)this.player().method_5751(), this.player().method_73189().Z);
    }

    public class07089 objectMouseOver();

    default public class06889 playerMotion() {
        return this.player().method_18798();
    }

    default public Optional<class07209> getSelectedBlock() {
        class07089 class070892 = this.objectMouseOver();
        if (class070892 != null && class070892.N() == class07113.field_1332) {
            return Optional.of(((class06183)class070892).u());
        }
        return Optional.empty();
    }

    default public boolean isLookingAt(class07209 class072092) {
        return this.getSelectedBlock().equals(Optional.of(class072092));
    }

    default public Stream<class07049> entitiesStream() {
        return StreamSupport.stream(this.entities().spliterator(), false);
    }

    default public Rotation playerRotations() {
        return new Rotation(this.player().method_36454(), this.player().method_36455());
    }

    default public class06889 playerFeetAsVec() {
        return new class06889(this.player().method_73189().M, this.player().method_73189().B, this.player().method_73189().Z);
    }

    public IPlayerController playerController();
}

