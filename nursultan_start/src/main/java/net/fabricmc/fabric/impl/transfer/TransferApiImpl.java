/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02678
 *  minecraft.class02713
 *  net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.transfer;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import minecraft.class02477;
import minecraft.class02678;
import minecraft.class02713;
import net.fabricmc.fabric.api.transfer.v1.storage.SlottedStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleSlotStorage;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl$1;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl$2;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl$3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransferApiImpl {
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-transfer-api-v1");
    public static final AtomicLong version = new AtomicLong();
    public static final Storage EMPTY_STORAGE = new TransferApiImpl$1();

    public static <T> Iterator<T> singletonIterator(T t) {
        return new TransferApiImpl$2(t);
    }

    public static class02678 mergeChanges(class02678 class026782, class02678 class026783) {
        class02713 class027132 = class02678.N();
        TransferApiImpl.writeChangesTo(class026782, class027132);
        TransferApiImpl.writeChangesTo(class026783, class027132);
        return class027132.N();
    }

    private static void writeChangesTo(class02678 class026782, class02713 class027132) {
        for (Map.Entry entry : class026782.y()) {
            if (((Optional)entry.getValue()).isPresent()) {
                class027132.N((class02477)entry.getKey(), ((Optional)entry.getValue()).get());
                continue;
            }
            class027132.N((class02477)entry.getKey());
        }
    }

    public static <T> List<SingleSlotStorage<T>> makeListView(SlottedStorage<T> slottedStorage) {
        return new TransferApiImpl$3(slottedStorage);
    }
}

