/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Suppliers
 *  minecraft.class00731
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class01894
 *  minecraft.class02819
 *  minecraft.class03929
 *  minecraft.class04227
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext
 *  net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext
 *  net.fabricmc.fabric.api.biome.v1.ModificationPhase
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.biome.modification;

import com.google.common.base.Stopwatch;
import com.google.common.base.Suppliers;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class01894;
import minecraft.class02819;
import minecraft.class03929;
import minecraft.class04227;
import minecraft.class05946;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationImpl$ModifierRecord;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationMarker;
import net.fabricmc.fabric.impl.biome.modification.BiomeSelectionContextImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiomeModificationImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(BiomeModificationImpl.class);
    private static final Comparator<BiomeModificationImpl$ModifierRecord> MODIFIER_ORDER_COMPARATOR = Comparator.comparingInt(biomeModificationImpl$ModifierRecord -> biomeModificationImpl$ModifierRecord.phase.ordinal()).thenComparingInt(biomeModificationImpl$ModifierRecord -> biomeModificationImpl$ModifierRecord.order).thenComparing(biomeModificationImpl$ModifierRecord -> biomeModificationImpl$ModifierRecord.id);
    public static final BiomeModificationImpl INSTANCE = new BiomeModificationImpl();
    private final List<BiomeModificationImpl$ModifierRecord> modifiers = new ArrayList<BiomeModificationImpl$ModifierRecord>();
    private boolean modifiersUnsorted = true;

    private BiomeModificationImpl() {
    }

    void clearModifiers() {
        this.modifiers.clear();
        this.modifiersUnsorted = true;
    }

    private List<BiomeModificationImpl$ModifierRecord> getSortedModifiers() {
        if (this.modifiersUnsorted) {
            this.modifiers.sort(MODIFIER_ORDER_COMPARATOR);
            this.modifiersUnsorted = false;
        }
        return this.modifiers;
    }

    void changeOrder(class01894 class018942, int n) {
        this.modifiersUnsorted = true;
        for (BiomeModificationImpl$ModifierRecord biomeModificationImpl$ModifierRecord : this.modifiers) {
            if (!class018942.equals((Object)biomeModificationImpl$ModifierRecord.id)) continue;
            biomeModificationImpl$ModifierRecord.setOrder(n);
        }
    }

    public void finalizeWorldGen(class01042 class010422) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        BiomeModificationMarker biomeModificationMarker = (BiomeModificationMarker)class010422;
        biomeModificationMarker.fabric_markModified();
        class00751 class007512 = class010422.L(class04227.NA);
        List list = class007512.Z().stream().map(Map.Entry::getKey).sorted(Comparator.comparingInt(class059462 -> class007512.N((Object)((class00780)class007512.B(class059462))))).toList();
        List<BiomeModificationImpl$ModifierRecord> list2 = this.getSortedModifiers();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (class05946 class059463 : list) {
            BiomeModificationImpl$ModifierRecord biomeModificationImpl$ModifierRecord2;
            class00780 class007802 = (class00780)class007512.B(class059463);
            ++n2;
            BiomeSelectionContextImpl biomeSelectionContextImpl = new BiomeSelectionContextImpl(class010422, (class05946<class00780>)class059463, class007802);
            BiomeModificationContextImpl biomeModificationContextImpl = null;
            for (BiomeModificationImpl$ModifierRecord biomeModificationImpl$ModifierRecord2 : list2) {
                if (!biomeModificationImpl$ModifierRecord2.selector.test(biomeSelectionContextImpl)) continue;
                LOGGER.trace("Applying modifier {} to {}", (Object)biomeModificationImpl$ModifierRecord2, (Object)class059463.N());
                if (biomeModificationContextImpl == null) {
                    ++n;
                    biomeModificationContextImpl = new BiomeModificationContextImpl(class010422, class007802);
                }
                biomeModificationImpl$ModifierRecord2.apply(biomeSelectionContextImpl, biomeModificationContextImpl);
                ++n3;
            }
            if (biomeModificationContextImpl == null) continue;
            biomeModificationContextImpl.freeze();
            if (biomeModificationContextImpl.shouldRebuildFeatures()) {
                class010422.L(class04227.yI).j().forEach(class012552 -> {
                    class012552.y().L = Suppliers.memoize(() -> class03929.N(List.copyOf(class012552.y().u().L()), class035562 -> class012552.y().N(class035562).L(), (boolean)true));
                });
            }
            if (!(class007512 instanceof class00731)) continue;
            class00731 class007312 = (class00731)class007512;
            biomeModificationImpl$ModifierRecord2 = (class02819)class007312.y.get(class059463);
            class02819 class028192 = new class02819(Optional.empty(), biomeModificationImpl$ModifierRecord2.y());
            class007312.y.put(class059463, class028192);
        }
        if (n2 > 0) {
            LOGGER.info("Applied {} biome modifications to {} of {} new biomes in {}", new Object[]{n3, n, n2, stopwatch});
        }
    }

    public void addModifier(class01894 class018942, ModificationPhase modificationPhase, Predicate<BiomeSelectionContext> predicate, BiConsumer<BiomeSelectionContext, BiomeModificationContext> biConsumer) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(biConsumer);
        this.modifiers.add(new BiomeModificationImpl$ModifierRecord(modificationPhase, class018942, predicate, biConsumer));
        this.modifiersUnsorted = true;
    }

    public void addModifier(class01894 class018942, ModificationPhase modificationPhase, Predicate<BiomeSelectionContext> predicate, Consumer<BiomeModificationContext> consumer) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(consumer);
        this.modifiers.add(new BiomeModificationImpl$ModifierRecord(modificationPhase, class018942, predicate, consumer));
        this.modifiersUnsorted = true;
    }
}

