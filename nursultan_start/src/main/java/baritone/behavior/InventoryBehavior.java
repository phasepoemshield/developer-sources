/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.event.events.TickEvent$Type
 *  baritone.utils.ToolSet
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02484
 *  minecraft.class04453
 *  minecraft.class06183
 *  minecraft.class06501
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06918
 *  minecraft.class06942
 *  minecraft.class07050
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class08036
 */
package baritone.behavior;

import baritone.Baritone;
import baritone.api.event.events.TickEvent;
import baritone.api.utils.Helper;
import baritone.behavior.Behavior;
import baritone.behavior.InventoryBehavior$1;
import baritone.utils.ToolSet;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06501;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class08036;

public final class InventoryBehavior
extends Behavior
implements Helper {
    int ticksSinceLastInventoryMove;
    int[] lastTickRequestedMove;

    public InventoryBehavior(Baritone baritone) {
        super(baritone);
    }

    public void onTick(TickEvent tickEvent) {
        int n;
        if (!((Boolean)Baritone.settings().allowInventory.value).booleanValue()) {
            return;
        }
        if (tickEvent.getType() == TickEvent.Type.OUT) {
            return;
        }
        if ((class07482)this.ctx.player().fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != this.ctx.player().fields_07fa3311b0e9d3e9b883d09222919bf5a_2) {
            return;
        }
        ++this.ticksSinceLastInventoryMove;
        if (this.firstValidThrowaway() >= 9) {
            this.requestSwapWithHotBar(this.firstValidThrowaway(), 8);
        }
        if ((n = this.bestToolAgainst(class00869.y)) >= 9) {
            this.requestSwapWithHotBar(n, 0);
        }
        if (this.lastTickRequestedMove != null) {
            this.logDebug("Remembering to move " + this.lastTickRequestedMove[0] + " " + this.lastTickRequestedMove[1] + " from a previous tick");
            this.requestSwapWithHotBar(this.lastTickRequestedMove[0], this.lastTickRequestedMove[1]);
        }
    }

    public boolean throwaway(boolean bl, Predicate<? super class06584> predicate) {
        return this.throwaway(bl, predicate, (Boolean)Baritone.settings().allowInventory.value);
    }

    public boolean throwaway(boolean bl, Predicate<? super class06584> predicate, boolean bl2) {
        class06584 class065842;
        int n;
        class04453 class044532 = this.ctx.player();
        class00743 class007432 = class044532.method_31548().u();
        for (n = 0; n < 9; ++n) {
            class065842 = (class06584)class007432.get(n);
            if (!predicate.test((class06584)class065842)) continue;
            if (bl) {
                class044532.method_31548().N(n);
            }
            return true;
        }
        if (predicate.test((class06584)class044532.method_6118(class07085.field_6171))) {
            for (n = 0; n < 9; ++n) {
                class065842 = (class06584)class007432.get(n);
                if (!class065842.R() && !class065842.B().R().N(class02484.O)) continue;
                if (bl) {
                    class044532.method_31548().N(n);
                }
                return true;
            }
        }
        if (bl2) {
            for (n = 9; n < 36; ++n) {
                if (!predicate.test((class06584)class007432.get(n))) continue;
                if (bl) {
                    this.requestSwapWithHotBar(n, 7);
                    class044532.method_31548().N(7);
                }
                return true;
            }
        }
        return false;
    }

    private int bestToolAgainst(class00891 class008912) {
        class00743 class007432 = this.ctx.player().method_31548().u();
        int n = -1;
        double d = -1.0;
        for (int i = 0; i < class007432.size(); ++i) {
            double d2;
            class06584 class065842 = (class06584)class007432.get(i);
            if (class065842.R() || ((Boolean)Baritone.settings().itemSaver.value).booleanValue() && class065842.P() + (Integer)Baritone.settings().itemSaverThreshold.value >= class065842.s() && class065842.s() > 1 || !class065842.B().R().N(class02484.O) || !((d2 = ToolSet.calculateSpeedVsBlock((class06584)class065842, (class00500)class008912.W())) > d)) continue;
            d = d2;
            n = i;
        }
        return n;
    }

    public OptionalInt getTempHotbarSlot(Predicate<Integer> predicate) {
        int n;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (n = 1; n < 8; ++n) {
            if (!((class06584)this.ctx.player().method_31548().u().get(n)).R() || predicate.test(n)) continue;
            arrayList.add(n);
        }
        if (arrayList.isEmpty()) {
            for (n = 1; n < 8; ++n) {
                if (predicate.test(n)) continue;
                arrayList.add(n);
            }
        }
        if (arrayList.isEmpty()) {
            return OptionalInt.empty();
        }
        return OptionalInt.of((Integer)arrayList.get(new Random().nextInt(arrayList.size())));
    }

    public boolean selectThrowawayForLocation(boolean bl, int n, int n2, int n3) {
        class00500 class005002 = this.baritone.getBuilderProcess().placeAt(n, n2, n3, this.baritone.bsi.get0(n, n2, n3));
        if (class005002 != null && this.throwaway(bl, class065842 -> class065842.B() instanceof class06918 && class005002.equals((Object)((class06918)class065842.B()).L().N(new class06942((class06501)new InventoryBehavior$1(this, this.ctx.world(), (class08036)this.ctx.player(), class07050.field_5808, (class06584)class065842, new class06183(new class06889(this.ctx.player().method_73189().M, this.ctx.player().method_73189().B, this.ctx.player().method_73189().Z), class07211.field_11036, (class07209)this.ctx.playerFeet(), false))))))) {
            return true;
        }
        if (class005002 != null && this.throwaway(bl, class065842 -> class065842.B() instanceof class06918 && ((class06918)class065842.B()).L().equals(class005002.i()))) {
            return true;
        }
        for (class06581 class065812 : (List)Baritone.settings().acceptableThrowawayItems.value) {
            if (!this.throwaway(bl, class065842 -> class065812.equals(class065842.B()))) continue;
            return true;
        }
        return false;
    }

    private int firstValidThrowaway() {
        class00743 class007432 = this.ctx.player().method_31548().u();
        for (int i = 0; i < class007432.size(); ++i) {
            if (!((List)Baritone.settings().acceptableThrowawayItems.value).contains(((class06584)class007432.get(i)).B())) continue;
            return i;
        }
        return -1;
    }

    public boolean attemptToPutOnHotbar(int n, Predicate<Integer> predicate) {
        OptionalInt optionalInt = this.getTempHotbarSlot(predicate);
        return !optionalInt.isPresent() || this.requestSwapWithHotBar(n, optionalInt.getAsInt());
    }

    private boolean requestSwapWithHotBar(int n, int n2) {
        this.lastTickRequestedMove = new int[]{n, n2};
        if (this.ticksSinceLastInventoryMove < (Integer)Baritone.settings().ticksBetweenInventoryMoves.value) {
            this.logDebug("Inventory move requested but delaying " + this.ticksSinceLastInventoryMove + " " + String.valueOf(Baritone.settings().ticksBetweenInventoryMoves.value));
            return false;
        }
        if (((Boolean)Baritone.settings().inventoryMoveOnlyIfStationary.value).booleanValue() && !this.baritone.getInventoryPauserProcess().stationaryForInventoryMove()) {
            this.logDebug("Inventory move requested but delaying until stationary");
            return false;
        }
        this.ctx.playerController().windowClick(this.ctx.player().fields_07fa3311b0e9d3e9b883d09222919bf5a_2.b, n < 9 ? n + 36 : n, n2, class07510.field_7791, (class08036)this.ctx.player());
        this.ticksSinceLastInventoryMove = 0;
        this.lastTickRequestedMove = null;
        return true;
    }

    public boolean hasGenericThrowaway() {
        for (class06581 class065812 : (List)Baritone.settings().acceptableThrowawayItems.value) {
            if (!this.throwaway(false, class065842 -> class065812.equals(class065842.B()))) continue;
            return true;
        }
        return false;
    }
}

