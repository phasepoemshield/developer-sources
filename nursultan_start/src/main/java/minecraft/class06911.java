/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10685
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03771
 *  minecraft.class03778
 *  minecraft.class04206
 *  minecraft.class05946
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents$ModifyEntries
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents$ModifyEntriesAll
 *  net.fabricmc.fabric.impl.itemgroup.FabricItemGroupImpl
 *  net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl
 *  net.fabricmc.fabric.mixin.itemgroup.CreativeModeTabAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10685;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03771;
import minecraft.class03778;
import minecraft.class04206;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class06909;
import minecraft.class06921;
import minecraft.class06934;
import minecraft.class06936;
import minecraft.class06945;
import minecraft.class06950;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupImpl;
import net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl;
import net.fabricmc.fabric.mixin.itemgroup.CreativeModeTabAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06911
implements FabricItemGroupImpl,
CreativeModeTabAccessor {
    static final class01894 N = class06911.N("items");
    private final class00392 R;
    class01894 y = N;
    boolean L = true;
    boolean u = true;
    boolean i = false;
    private class06909 M;
    private int B;
    private final class06936 Z;
    private @Nullable class06584 z;
    private Collection<class06584> U = class03778.N();
    private Set<class06584> E = class03778.N();
    private final Supplier<class06584> W;
    private final class06950 m;
    private int P = -1;

    public class01894 L() {
        return this.y;
    }

    public class06909 M() {
        return this.M;
    }

    class06911(class06909 class069092, int n, class06936 class069362, class00392 class003922, Supplier<class06584> supplier, class06950 class069502) {
        this.M = class069092;
        this.B = n;
        this.R = class003922;
        this.W = supplier;
        this.m = class069502;
        this.Z = class069362;
    }

    public boolean B() {
        return !this.U.isEmpty();
    }

    public boolean Z() {
        return this.Z != class06936.field_41052 || this.B();
    }

    public boolean i() {
        return this.L;
    }

    public class06936 U() {
        return this.Z;
    }

    public boolean z() {
        return this.i;
    }

    public boolean u() {
        return this.u;
    }

    public class06584 y() {
        if (this.z == null) {
            this.z = this.W.get();
        }
        return this.z;
    }

    public Collection<class06584> E() {
        return this.U;
    }

    public static class06921 N(class06909 class069092, int n) {
        return new class06921(class069092, n);
    }

    public static class01894 N(String string) {
        return class01894.y((String)("textures/gui/container/creative_inventory/tab_" + string + ".png"));
    }

    public void N(class06945 class069452, CallbackInfo callbackInfo) {
        class06911 class069112 = this;
        class05946 var4 = (class05946)class04206.Nz.u((Object)class069112).orElseThrow(() -> new IllegalStateException("Unregistered item group : " + String.valueOf(class069112)));
        if (class069112.z() && var4 != class03771.W) {
            return;
        }
        Objects.requireNonNull(this.U, "displayStacks");
        Objects.requireNonNull(this.E, "searchTabStacks");
        LinkedList<class06584> linkedList = new LinkedList<class06584>(this.U);
        LinkedList<class06584> linkedList2 = new LinkedList<class06584>(this.E);
        FabricItemGroupEntries fabricItemGroupEntries = new FabricItemGroupEntries(class069452, linkedList, linkedList2);
        if (var4 != class03771.W || class069452.y()) {
            Event var8 = ItemGroupEventsImpl.getModifyEntriesEvent((class05946)var4);
            if (var8 != null) {
                ((ItemGroupEvents.ModifyEntries)var8.invoker()).modifyEntries(fabricItemGroupEntries);
            }
            ((ItemGroupEvents.ModifyEntriesAll)ItemGroupEvents.MODIFY_ENTRIES_ALL.invoker()).modifyEntries(class069112, fabricItemGroupEntries);
        }
        this.U.clear();
        this.U.addAll(linkedList);
        this.E.clear();
        this.E.addAll(linkedList2);
    }

    public class00392 N() {
        return this.R;
    }

    public boolean N(class06584 class065842) {
        return this.E.contains(class065842);
    }

    public void N(class06945 class069452) {
        class10685 class106852 = new class10685(this, class069452.N());
        class05946 var3 = (class05946)class04206.Nz.u((Object)this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + String.valueOf(this)));
        this.m.accept(class069452, (class06934)class106852);
        this.U = class106852.N;
        this.E = class106852.y;
        this.N(class069452, null);
    }

    public Collection<class06584> W() {
        return this.E;
    }

    public int R() {
        return this.B;
    }

    public /* synthetic */ void setRow(class06909 class069092) {
        this.M = class069092;
    }

    public /* synthetic */ void setColumn(int n) {
        this.B = n;
    }

    public void fabric_setPage(int n) {
        this.P = n;
    }

    public int fabric_getPage() {
        if (this.P < 0) {
            throw new IllegalStateException("Item group has no page");
        }
        return this.P;
    }
}

