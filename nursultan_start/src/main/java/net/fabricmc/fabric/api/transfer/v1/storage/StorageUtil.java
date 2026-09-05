/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07080
 *  minecraft.class07455
 *  minecraft.class07878
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.ResourceAmount
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  net.fabricmc.fabric.api.transfer.v1.transaction.Transaction
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.storage;

import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class04995;
import minecraft.class07080;
import minecraft.class07455;
import minecraft.class07878;
import net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StoragePreconditions;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.fabricmc.fabric.api.transfer.v1.storage.base.ResourceAmount;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import org.jspecify.annotations.Nullable;

public final class StorageUtil {
    private StorageUtil() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static <T> long move(@Nullable Storage<T> storage, @Nullable Storage<T> storage2, Predicate<T> predicate, long l, @Nullable TransactionContext transactionContext) {
        Objects.requireNonNull(predicate, "Filter may not be null");
        if (storage == null) return 0L;
        if (storage2 == null) {
            return 0L;
        }
        long l2 = 0L;
        try (Transaction transaction = Transaction.openNested((TransactionContext)transactionContext);){
            for (StorageView<T> storageView : storage.nonEmptyViews()) {
                T t = storageView.getResource();
                if (!predicate.test(t)) continue;
                long l3 = StorageUtil.simulateExtract(storageView, t, l - l2, (TransactionContext)transaction);
                try (Transaction transaction2 = transaction.openNested();){
                    long l4 = storage2.insert(t, l3, (TransactionContext)transaction2);
                    if (storageView.extract(t, l4, (TransactionContext)transaction2) == l4) {
                        l2 += l4;
                        transaction2.commit();
                    }
                }
                if (l != l2) continue;
                transaction.commit();
                long l5 = l2;
                return l5;
            }
            transaction.commit();
            return l2;
        }
        catch (Exception exception) {
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Moving resources between storages");
            class070802.N("Move details").N("Input storage", (class07455)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, toString(), ()Ljava/lang/String;)(storage)).N("Output storage", (class07455)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, toString(), ()Ljava/lang/String;)(storage2)).N("Filter", (class07455)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, toString(), ()Ljava/lang/String;)(predicate)).N("Max amount", (Object)l).N("Transaction", (Object)transactionContext);
            throw new class07878(class070802);
        }
    }

    public static <T> @Nullable T findExtractableResource(@Nullable Storage<T> storage, @Nullable TransactionContext transactionContext) {
        return (T)StorageUtil.findExtractableResource(storage, object -> true, transactionContext);
    }

    public static <T> @Nullable T findExtractableResource(@Nullable Storage<T> storage, Predicate<T> predicate, @Nullable TransactionContext transactionContext) {
        Objects.requireNonNull(predicate, "Filter may not be null");
        if (storage == null) {
            return null;
        }
        try (Transaction transaction = Transaction.openNested((TransactionContext)transactionContext);){
            for (StorageView<T> storageView : storage.nonEmptyViews()) {
                T t = storageView.getResource();
                if (!predicate.test(t) || storageView.extract(t, Long.MAX_VALUE, (TransactionContext)transaction) <= 0L) continue;
                T t2 = t;
                return t2;
            }
        }
        return null;
    }

    public static <T> int calculateComparatorOutput(@Nullable Storage<T> storage) {
        if (storage == null) {
            return 0;
        }
        double d = 0.0;
        int n = 0;
        boolean bl = false;
        for (StorageView<T> storageView : storage) {
            ++n;
            if (storageView.getAmount() <= 0L) continue;
            d += (double)storageView.getAmount() / (double)storageView.getCapacity();
            bl = true;
        }
        return class04995.N((double)(d / (double)n * 14.0)) + (bl ? 1 : 0);
    }

    public static <T> @Nullable ResourceAmount<T> findExtractableContent(@Nullable Storage<T> storage, Predicate<T> predicate, @Nullable TransactionContext transactionContext) {
        long l;
        T t = StorageUtil.findExtractableResource(storage, predicate, transactionContext);
        if (t != null && (l = StorageUtil.simulateExtract(storage, t, Long.MAX_VALUE, transactionContext)) > 0L) {
            return new ResourceAmount(t, l);
        }
        return null;
    }

    public static <T> @Nullable ResourceAmount<T> findExtractableContent(@Nullable Storage<T> storage, @Nullable TransactionContext transactionContext) {
        return StorageUtil.findExtractableContent(storage, object -> true, transactionContext);
    }

    public static <T> @Nullable ResourceAmount<T> extractAny(@Nullable Storage<T> storage, long l, TransactionContext transactionContext) {
        StoragePreconditions.notNegative(l);
        if (storage == null) {
            return null;
        }
        try {
            for (StorageView<T> storageView : storage.nonEmptyViews()) {
                T t;
                long l2 = storageView.extract(t = storageView.getResource(), l, transactionContext);
                if (l2 <= 0L) continue;
                return new ResourceAmount(t, l2);
            }
        }
        catch (Exception exception) {
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Extracting resources from storage");
            class070802.N("Extraction details").N("Storage", (class07455)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, toString(), ()Ljava/lang/String;)(storage)).N("Max amount", (Object)l).N("Transaction", (Object)transactionContext);
            throw new class07878(class070802);
        }
        return null;
    }

    public static <T> long simulateExtract(StorageView<T> storageView, T t, long l, @Nullable TransactionContext transactionContext) {
        try (Transaction transaction = Transaction.openNested((TransactionContext)transactionContext);){
            long l2 = storageView.extract(t, l, (TransactionContext)transaction);
            return l2;
        }
    }

    public static <T, S extends Object & StorageView<T>> long simulateExtract(S s, T t, long l, @Nullable TransactionContext transactionContext) {
        try (Transaction transaction = Transaction.openNested((TransactionContext)transactionContext);){
            long l2 = ((StorageView<T>)s).extract(t, l, (TransactionContext)transaction);
            return l2;
        }
    }

    public static <T> long simulateExtract(Storage<T> storage, T t, long l, @Nullable TransactionContext transactionContext) {
        try (Transaction transaction = Transaction.openNested((TransactionContext)transactionContext);){
            long l2 = storage.extract(t, l, (TransactionContext)transaction);
            return l2;
        }
    }

    public static <T> long simulateInsert(Storage<T> storage, T t, long l, @Nullable TransactionContext transactionContext) {
        try (Transaction transaction = Transaction.openNested((TransactionContext)transactionContext);){
            long l2 = storage.insert(t, l, (TransactionContext)transaction);
            return l2;
        }
    }

    public static <T> long tryInsertStacking(@Nullable Storage<T> storage, T t, long l, TransactionContext transactionContext) {
        StoragePreconditions.notNegative(l);
        try {
            if (storage instanceof SlottedStorage) {
                SlottedStorage slottedStorage = (SlottedStorage)storage;
                return StorageUtil.insertStacking(slottedStorage.getSlots(), t, l, transactionContext);
            }
            if (storage != null) {
                return storage.insert(t, l, transactionContext);
            }
            return 0L;
        }
        catch (Exception exception) {
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Inserting resources into a storage");
            class070802.N("Insertion details").N("Storage", () -> Objects.toString(storage, null)).N("Resource", () -> Objects.toString(t, null)).N("Max amount", (Object)l).N("Transaction", (Object)transactionContext);
            throw new class07878(class070802);
        }
    }

    public static <T> @Nullable T findStoredResource(@Nullable Storage<T> storage, Predicate<T> predicate) {
        Objects.requireNonNull(predicate, "Filter may not be null");
        if (storage == null) {
            return null;
        }
        for (StorageView<T> storageView : storage.nonEmptyViews()) {
            if (!predicate.test(storageView.getResource())) continue;
            return storageView.getResource();
        }
        return null;
    }

    public static <T> @Nullable T findStoredResource(@Nullable Storage<T> storage) {
        return (T)StorageUtil.findStoredResource(storage, object -> true);
    }

    public static <T> long insertStacking(List<? extends SingleSlotStorage<T>> list, T t, long l, TransactionContext transactionContext) {
        StoragePreconditions.notNegative(l);
        long l2 = 0L;
        try {
            for (SingleSlotStorage<T> singleSlotStorage : list) {
                if (singleSlotStorage.isResourceBlank() || (l2 += singleSlotStorage.insert(t, l - l2, transactionContext)) != l) continue;
                return l2;
            }
            for (SingleSlotStorage<T> singleSlotStorage : list) {
                if ((l2 += singleSlotStorage.insert(t, l - l2, transactionContext)) != l) continue;
                return l2;
            }
        }
        catch (Exception exception) {
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Inserting resources into slots");
            class070802.N("Slotted insertion details").N("Slots", () -> Objects.toString(list, null)).N("Resource", () -> Objects.toString(t, null)).N("Max amount", (Object)l).N("Transaction", (Object)transactionContext);
            throw new class07878(class070802);
        }
        return l2;
    }
}

