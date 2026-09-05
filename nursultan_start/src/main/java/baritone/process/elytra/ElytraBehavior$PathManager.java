/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.SettingsUtil
 *  minecraft.class00753
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07321
 */
package baritone.process.elytra;

import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.SettingsUtil;
import baritone.process.ElytraProcess$State;
import baritone.process.elytra.ElytraBehavior;
import baritone.process.elytra.NetherPath;
import baritone.process.elytra.PathCalculationException;
import baritone.process.elytra.UnpackedSegment;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import minecraft.class00753;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07321;

public final class ElytraBehavior$PathManager {
    public NetherPath path;
    private boolean completePath;
    private boolean recalculating;
    private int maxPlayerNear;
    private int ticksNearUnchanged;
    private int playerNear;
    final /* synthetic */ ElytraBehavior this$0;

    public boolean isComplete() {
        return this.completePath;
    }

    public void tick() {
        this.updatePlayerNear();
        int n = this.maxPlayerNear;
        this.maxPlayerNear = Math.max(this.maxPlayerNear, this.playerNear);
        this.ticksNearUnchanged = this.maxPlayerNear == n && this.this$0.ctx.player().method_6128() ? ++this.ticksNearUnchanged : 0;
        this.pathfindAroundObstacles();
        this.attemptNextSegment();
    }

    public ElytraBehavior$PathManager(ElytraBehavior elytraBehavior) {
        this.this$0 = elytraBehavior;
        this.clear();
    }

    public void clear() {
        this.path = NetherPath.emptyPath();
        this.completePath = true;
        this.recalculating = false;
        this.playerNear = 0;
        this.ticksNearUnchanged = 0;
        this.maxPlayerNear = 0;
    }

    public NetherPath getPath() {
        return this.path;
    }

    private void setPath(UnpackedSegment unpackedSegment) {
        List<BetterBlockPos> list = unpackedSegment.collect();
        if (this.this$0.appendDestination) {
            class07209 class072092;
            BetterBlockPos betterBlockPos = this.this$0.destination;
            class07209 class072093 = class072092 = !list.isEmpty() ? (class07209)list.get(list.size() - 1) : null;
            if (class072092 != null && this.this$0.clearView(class06889.N((class00753)betterBlockPos), class06889.N((class00753)class072092), false)) {
                list.add(new BetterBlockPos((class07209)betterBlockPos));
            } else {
                this.this$0.logDirect("unable to land at " + String.valueOf(this.this$0.destination));
                this.this$0.process.landingSpotIsBad(new BetterBlockPos((class07209)this.this$0.destination));
            }
        }
        this.path = new NetherPath(list);
        this.completePath = unpackedSegment.isFinished();
        this.playerNear = 0;
        this.ticksNearUnchanged = 0;
        this.maxPlayerNear = 0;
    }

    private CompletableFuture<Void> path0(class07209 class072092, class07209 class072093, UnaryOperator<UnpackedSegment> unaryOperator) {
        return ((CompletableFuture)((CompletableFuture)this.this$0.context.pathFindAsync(class072092, class072093).thenApply(UnpackedSegment::from)).thenApply(unaryOperator)).thenAcceptAsync(this::setPath, arg_0 -> ((class06202)this.this$0.ctx.minecraft()).execute(arg_0));
    }

    public int getNear() {
        return this.playerNear;
    }

    private void pathfindAroundObstacles() {
        int n;
        if (this.recalculating) {
            return;
        }
        int n2 = this.playerNear;
        for (n = this.playerNear; n < this.path.size() && this.this$0.context.hasChunk(new class07321((class07209)this.path.get(n))); ++n) {
        }
        if (n2 >= n) {
            return;
        }
        BetterBlockPos betterBlockPos = this.path.get(n2);
        if (!this.this$0.passable(betterBlockPos.x, betterBlockPos.y, betterBlockPos.z, false)) {
            return;
        }
        if (this.this$0.process.state != ElytraProcess$State.LANDING && this.ticksNearUnchanged > 100) {
            this.pathRecalcSegment(OptionalInt.of(n - 1)).thenRun(() -> this.this$0.logVerbose("Recalculating segment, no progress in last 100 ticks"));
            this.ticksNearUnchanged = 0;
            return;
        }
        boolean bl = false;
        for (int i = n2; i < n - 1; ++i) {
            if (this.this$0.clearView(this.this$0.ctx.playerFeetAsVec(), this.path.getVec(i), false) || this.this$0.clearView(this.this$0.ctx.playerHead(), this.path.getVec(i), false)) {
                bl = true;
            }
            if (this.this$0.clearView(this.path.getVec(i), this.path.getVec(i + 1), false)) continue;
            OptionalInt optionalInt = this.path.get(n - 1).distanceSq(this.this$0.destination) < this.this$0.ctx.playerFeet().distanceSq(this.this$0.destination) ? OptionalInt.of(n - 1) : OptionalInt.empty();
            BetterBlockPos betterBlockPos2 = this.path.get(i);
            double d = this.this$0.ctx.playerFeet().distanceTo(this.path.get(optionalInt.orElse(this.path.size() - 1)));
            long l = System.nanoTime();
            this.pathRecalcSegment(optionalInt).thenRun(() -> this.this$0.logVerbose(String.format("Recalculated segment around path blockage near %s %s %s (next %.1f blocks in %.4f seconds)", SettingsUtil.maybeCensor((int)betterBlockPos.x), SettingsUtil.maybeCensor((int)betterBlockPos.y), SettingsUtil.maybeCensor((int)betterBlockPos.z), d, (double)(System.nanoTime() - l) / 1.0E9)));
            return;
        }
        if (!bl && n2 < n - 2 && this.this$0.process.state != ElytraProcess$State.GET_TO_JUMP) {
            this.pathRecalcSegment(OptionalInt.of(n - 1)).thenRun(() -> this.this$0.logVerbose("Recalculated segment since no path points were visible"));
        }
    }

    public void updatePlayerNear() {
        int n;
        if (this.path.isEmpty()) {
            return;
        }
        int n2 = this.playerNear;
        BetterBlockPos betterBlockPos = this.this$0.ctx.playerFeet();
        for (n = n2; n >= Math.max(n2 - 1000, 0); n -= 10) {
            if (!(this.path.get(n).distanceSq(betterBlockPos) < this.path.get(n2).distanceSq(betterBlockPos))) continue;
            n2 = n;
        }
        for (n = n2; n < Math.min(n2 + 1000, this.path.size()); n += 10) {
            if (!(this.path.get(n).distanceSq(betterBlockPos) < this.path.get(n2).distanceSq(betterBlockPos))) continue;
            n2 = n;
        }
        for (n = n2; n >= Math.max(n2 - 50, 0); --n) {
            if (!(this.path.get(n).distanceSq(betterBlockPos) < this.path.get(n2).distanceSq(betterBlockPos))) continue;
            n2 = n;
        }
        for (n = n2; n < Math.min(n2 + 50, this.path.size()); ++n) {
            if (!(this.path.get(n).distanceSq(betterBlockPos) < this.path.get(n2).distanceSq(betterBlockPos))) continue;
            n2 = n;
        }
        this.playerNear = n2;
    }

    private void attemptNextSegment() {
        if (this.recalculating) {
            return;
        }
        int n = this.path.size() - 1;
        if (!this.completePath && this.this$0.ctx.world().method_8477((class07209)this.path.get(n))) {
            this.pathNextSegment(n);
        }
    }

    public CompletableFuture<Void> pathToDestination() {
        return this.pathToDestination((class07209)this.this$0.ctx.playerFeet());
    }

    public CompletableFuture<Void> pathToDestination(class07209 class072092) {
        long l = System.nanoTime();
        return ((CompletableFuture)this.path0(class072092, (class07209)this.this$0.destination, UnaryOperator.identity()).thenRun(() -> {
            double d = this.path.get(0).distanceTo(this.path.get(this.path.size() - 1));
            if (this.completePath) {
                this.this$0.logVerbose(String.format("Computed path (%.1f blocks in %.4f seconds)", d, (double)(System.nanoTime() - l) / 1.0E9));
            } else {
                this.this$0.logVerbose(String.format("Computed segment (Next %.1f blocks in %.4f seconds)", d, (double)(System.nanoTime() - l) / 1.0E9));
            }
        })).whenComplete((void_, throwable) -> {
            this.recalculating = false;
            if (throwable != null) {
                Throwable throwable2 = throwable.getCause();
                if (throwable2 instanceof PathCalculationException) {
                    this.this$0.logDirect("Failed to compute path to destination");
                } else {
                    this.this$0.logUnhandledException(throwable2);
                }
            }
        });
    }

    public void pathNextSegment(int n) {
        if (this.recalculating) {
            return;
        }
        this.recalculating = true;
        List list = this.path.subList(0, n + 1);
        long l = System.nanoTime();
        BetterBlockPos betterBlockPos = this.path.get(n);
        ((CompletableFuture)this.path0((class07209)betterBlockPos, (class07209)this.this$0.destination, unpackedSegment -> unpackedSegment.prepend(list.stream())).thenRun(() -> {
            int n = this.path.size() - list.size() - 1;
            double d = this.path.get(0).distanceTo(this.path.get(n));
            if (this.completePath) {
                this.this$0.logVerbose(String.format("Computed path (%.1f blocks in %.4f seconds)", d, (double)(System.nanoTime() - l) / 1.0E9));
            } else {
                this.this$0.logVerbose(String.format("Computed segment (Next %.1f blocks in %.4f seconds)", d, (double)(System.nanoTime() - l) / 1.0E9));
            }
        })).whenComplete((void_, throwable) -> {
            this.recalculating = false;
            if (throwable != null) {
                Throwable throwable2 = throwable.getCause();
                if (throwable2 instanceof PathCalculationException) {
                    this.this$0.logDirect("Failed to compute next segment");
                    if (this.this$0.ctx.player().method_5707(betterBlockPos.method_46558()) < 256.0) {
                        this.this$0.logVerbose("Player is near the segment start, therefore repeating this calculation is pointless. Marking as complete");
                        this.completePath = true;
                    }
                } else {
                    this.this$0.logUnhandledException(throwable2);
                }
            }
        });
    }

    public CompletableFuture<Void> pathRecalcSegment(OptionalInt optionalInt) {
        if (this.recalculating) {
            throw new IllegalStateException("already recalculating");
        }
        this.recalculating = true;
        List list = optionalInt.isPresent() ? this.path.subList(optionalInt.getAsInt() + 1, this.path.size()) : Collections.emptyList();
        boolean bl = this.completePath;
        return this.path0((class07209)this.this$0.ctx.playerFeet(), (class07209)(optionalInt.isPresent() ? this.path.get(optionalInt.getAsInt()) : this.this$0.destination), unpackedSegment -> unpackedSegment.append(list.stream(), bl || unpackedSegment.isFinished() && !optionalInt.isPresent())).whenComplete((void_, throwable) -> {
            this.recalculating = false;
            if (throwable != null) {
                Throwable throwable2 = throwable.getCause();
                if (throwable2 instanceof PathCalculationException) {
                    this.this$0.logDirect("Failed to recompute segment");
                } else {
                    this.this$0.logUnhandledException(throwable2);
                }
            }
        });
    }
}

