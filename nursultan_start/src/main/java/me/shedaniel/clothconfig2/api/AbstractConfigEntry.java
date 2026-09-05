/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.gui.AbstractConfigScreen
 *  me.shedaniel.clothconfig2.gui.widget.DynamicElementListWidget$ElementEntry
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 */
package me.shedaniel.clothconfig2.api;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.ReferenceBuildingConfigScreen;
import me.shedaniel.clothconfig2.api.ReferenceProvider;
import me.shedaniel.clothconfig2.api.Tooltip;
import me.shedaniel.clothconfig2.api.ValueHolder;
import me.shedaniel.clothconfig2.gui.AbstractConfigScreen;
import me.shedaniel.clothconfig2.gui.widget.DynamicElementListWidget;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;

public abstract class AbstractConfigEntry<T>
extends DynamicElementListWidget.ElementEntry<AbstractConfigEntry<T>>
implements ReferenceProvider<T>,
ValueHolder<T> {
    private AbstractConfigScreen screen;
    private Supplier<Optional<class00392>> errorSupplier;
    private List<ReferenceProvider<?>> referencableEntries = null;
    protected Consumer<T> saveCallback;
    private int cacheFieldNameHash = -1;
    private List<String> cachedTags = null;
    private Iterable<String> additionalSearchTags = null;

    public void save() {
        if (this.saveCallback != null) {
            this.saveCallback.accept(this.getValue());
        }
    }

    public abstract Optional<T> getDefaultValue();

    public abstract class00392 getFieldName();

    public Optional<class00392> getError() {
        return Optional.empty();
    }

    public final void setScreen(AbstractConfigScreen abstractConfigScreen) {
        this.screen = abstractConfigScreen;
    }

    public final AbstractConfigScreen getConfigScreen() {
        return this.screen;
    }

    public void lateRender(class01054 class010542, int n, int n2, float f) {
    }

    public boolean isEdited() {
        return this.getConfigError().isPresent();
    }

    public final void addTooltip(Tooltip tooltip) {
        this.screen.addTooltip(tooltip);
    }

    protected class01028[] wrapLines(class00392[] class00392Array, int n) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        return (class01028[])Arrays.stream(class00392Array).map(class003922 -> class015902.L((class05936)class003922, n)).flatMap(Collection::stream).toArray(class01028[]::new);
    }

    public final void setReferenceProviderEntries(List<ReferenceProvider<?>> list) {
        this.referencableEntries = list;
    }

    public final List<ReferenceProvider<?>> getReferenceProviderEntries() {
        return this.referencableEntries;
    }

    public abstract void setRequiresRestart(boolean var1);

    public void appendSearchTags(Iterable<String> iterable) {
        this.additionalSearchTags = this.additionalSearchTags == null ? iterable : Iterables.concat(this.additionalSearchTags, iterable);
    }

    public final Optional<class00392> getConfigError() {
        if (this.errorSupplier != null && this.errorSupplier.get().isPresent()) {
            return this.errorSupplier.get();
        }
        return this.getError();
    }

    public void setErrorSupplier(Supplier<Optional<class00392>> supplier) {
        this.errorSupplier = supplier;
    }

    public int getItemHeight() {
        return 24;
    }

    protected class01028[] wrapLinesToScreen(class00392[] class00392Array) {
        return this.wrapLines(class00392Array, this.screen.field_22789);
    }

    public Iterator<String> getSearchTags() {
        String string = this.getFieldName().getString();
        if (string.isEmpty()) {
            this.cacheFieldNameHash = -1;
            this.cachedTags = null;
            return ((Iterable)MoreObjects.firstNonNull(this.additionalSearchTags, Collections.emptyList())).iterator();
        }
        if (string.hashCode() != this.cacheFieldNameHash) {
            this.cacheFieldNameHash = string.hashCode();
            this.cachedTags = Lists.newArrayList((Object[])string.split(" "));
        }
        return Iterators.concat(this.cachedTags.iterator(), ((Iterable)MoreObjects.firstNonNull(this.additionalSearchTags, Collections.emptyList())).iterator());
    }

    public abstract boolean isRequiresRestart();

    public void updateSelected(boolean bl) {
    }

    @Override
    public AbstractConfigEntry<T> provideReferenceEntry() {
        return this;
    }

    public void requestReferenceRebuilding() {
        AbstractConfigScreen abstractConfigScreen = this.getConfigScreen();
        if (abstractConfigScreen instanceof ReferenceBuildingConfigScreen) {
            ((ReferenceBuildingConfigScreen)abstractConfigScreen).requestReferenceRebuilding();
        }
    }

    public class00392 getDisplayedFieldName() {
        class05216 class052162 = this.getFieldName().L();
        boolean bl = this.getConfigError().isPresent();
        boolean bl2 = this.isEdited();
        if (bl) {
            class052162 = class052162.N(class06541.field_1061);
        }
        if (bl2) {
            class052162 = class052162.N(class06541.field_1056);
        }
        if (!bl && !bl2) {
            class052162 = class052162.N(class06541.field_1080);
        }
        if (!this.isEnabled()) {
            class052162 = class052162.N(class06541.field_1063);
        }
        return class052162;
    }

    public int getInitialReferenceOffset() {
        return 0;
    }
}

