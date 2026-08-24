/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.nbt.NbtIo
 *  net.minecraft.nbt.NbtOps
 *  net.minecraft.nbt.NbtSizeTracker
 *  net.minecraft.registry.RegistryOps
 *  net.minecraft.registry.RegistryWrapper$WrapperLookup
 */
package kotakbaz.rain.friend;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.io.Closeable;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotakbaz.rain.ui.inventory.InventoryPreset;
import kotakbaz.rain.ui.inventory.InventorySnapshot;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtIo;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.NbtSizeTracker;
import net.minecraft.registry.RegistryOps;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u0628;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\n\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006H\u0002\u00a2\u0006\u0004\b\u000e\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001b\u0010&J'\u0010*\u001a\u00020#2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b1\u0010.R\u0014\u00103\u001a\u0002028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0099\u0001\u00109\u001a\u0086\u0001\u0012<\u0012:\u0012\u0016\u0012\u0014 8*\t\u0018\u00010\u001e\u00a2\u0006\u0002\b70\u001e\u00a2\u0006\u0002\b7 8*\u001c\u0012\u0016\u0012\u0014 8*\t\u0018\u00010\u001e\u00a2\u0006\u0002\b70\u001e\u00a2\u0006\u0002\b7\u0018\u00010\u000606 8*B\u0012<\u0012:\u0012\u0016\u0012\u0014 8*\t\u0018\u00010\u001e\u00a2\u0006\u0002\b70\u001e\u00a2\u0006\u0002\b7 8*\u001c\u0012\u0016\u0012\u0014 8*\t\u0018\u00010\u001e\u00a2\u0006\u0002\b70\u001e\u00a2\u0006\u0002\b7\u0018\u00010\u000606\u0018\u000105058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010;\u001a\n 8*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<\u00a8\u0006="}, d2={"Loxxxde/\u062e\u062c;", "", "<init>", "()V", "Lnet/minecraft/class_7225$class_7874;", "registries", "", "Loxxxde/\u062f\u064a;", "loadAll", "(Lnet/minecraft/class_7225$class_7874;)Ljava/util/List;", "readAll", "", "name", "Loxxxde/\u0651;", "snapshot", "save", "(Ljava/lang/String;Lkotakbaz/rain/ui/inventory/InventorySnapshot;Lnet/minecraft/class_7225$class_7874;)Lkotakbaz/rain/ui/inventory/InventoryPreset;", "Ljava/util/UUID;", "id", "", "delete", "(Ljava/util/UUID;)Z", "preset", "Lnet/minecraft/class_2487;", "encode", "(Lkotakbaz/rain/ui/inventory/InventoryPreset;Lnet/minecraft/class_7225$class_7874;)Lnet/minecraft/class_2487;", "Ljava/nio/file/Path;", "file", "read", "(Ljava/nio/file/Path;Lnet/minecraft/class_7225$class_7874;)Lkotakbaz/rain/ui/inventory/InventoryPreset;", "Lnet/minecraft/class_1799;", "items", "(Ljava/util/List;)Lkotakbaz/rain/ui/inventory/InventorySnapshot;", "tag", "target", "", "writeAtomically", "(Lnet/minecraft/class_2487;Ljava/nio/file/Path;)V", "(Ljava/util/UUID;)Ljava/nio/file/Path;", "action", "", "error", "report", "(Ljava/lang/String;Ljava/nio/file/Path;Ljava/lang/Throwable;)V", "", "VERSION", "I", "EXTENSION", "Ljava/lang/String;", "ITEM_COUNT", "", "MAX_NBT_SIZE", "J", "Lcom/mojang/serialization/Codec;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "itemsCodec", "Lcom/mojang/serialization/Codec;", "directory", "Ljava/nio/file/Path;", "rain-visuals"})
public final class FriendManager {
    @NotNull
    private static final String EXTENSION = ".nbt";
    private static final long MAX_NBT_SIZE = 0x1000000L;
    @NotNull
    public static final FriendManager INSTANCE = new FriendManager();
    private static final int ITEM_COUNT = 41;
    private static final int VERSION = 1;
    private static final Codec<List<ItemStack>> itemsCodec = ItemStack.OPTIONAL_CODEC.listOf();
    private static final Path directory = FabricLoader.getInstance().getGameDir().resolve("rain").resolve("inventories").normalize();

    private final InventoryPreset read(Path file, RegistryWrapper.WrapperLookup registries) {
        UUID id = UUID.fromString(StringsKt.removeSuffix(((Object)file.getFileName()).toString(), (CharSequence)EXTENSION));
        NbtCompound nbtCompound = NbtIo.readCompressed((Path)file, (NbtSizeTracker)NbtSizeTracker.of((long)0x1000000L));
        Intrinsics.checkNotNullExpressionValue(nbtCompound, "readCompressed(...)");
        NbtCompound root = nbtCompound;
        if (!(root.getInt("version", 0) == 1)) {
            boolean $i$a$-require-InventoryPresetStore$read$42 = false;
            String $i$a$-require-InventoryPresetStore$read$42 = "Unsupported inventory version";
            throw new IllegalArgumentException($i$a$-require-InventoryPresetStore$read$42.toString());
        }
        String string = root.getString("name", "");
        Intrinsics.checkNotNullExpressionValue(string, "getStringOr(...)");
        String name = ((Object)StringsKt.trim((CharSequence)string)).toString();
        if (!(((CharSequence)name).length() > 0)) {
            boolean $i$a$-require-InventoryPresetStore$read$52 = false;
            String $i$a$-require-InventoryPresetStore$read$52 = "Inventory name is empty";
            throw new IllegalArgumentException($i$a$-require-InventoryPresetStore$read$52.toString());
        }
        RegistryOps registryOps = registries.getOps((DynamicOps)NbtOps.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(registryOps, "createSerializationContext(...)");
        RegistryOps ops = registryOps;
        NbtElement nbtElement = root.get("items");
        if (nbtElement == null) {
            boolean bl = false;
            String string2 = "Inventory items are missing";
            throw new IllegalArgumentException(string2.toString());
        }
        NbtElement itemsTag = nbtElement;
        List items = (List)itemsCodec.parse((DynamicOps)ops, (Object)itemsTag).getOrThrow(IllegalArgumentException::new);
        if (!(items.size() == 41)) {
            boolean bl = false;
            String string3 = "Expected 41 items, got " + items.size();
            throw new IllegalArgumentException(string3.toString());
        }
        Intrinsics.checkNotNull(id);
        Intrinsics.checkNotNull(items);
        return new InventoryPreset(id, name, this.snapshot(items), root.getLong("createdAt", Files.getLastModifiedTime(file, new LinkOption[0]).toMillis()));
    }

    private static final List<ItemStack> snapshot$take(List<ItemStack> $items, Ref.IntRef index, int count) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>(count);
        int n = 0;
        while (n < count) {
            int n2 = n++;
            int it = n2;
            ArrayList<ItemStack> arrayList2 = arrayList;
            boolean bl = false;
            int n3 = index.element;
            index.element = n3 + 1;
            arrayList2.add($items.get(n3).copy());
        }
        return arrayList;
    }

    private final void report(String action, Path file, Throwable error) {
        System.err.println("[Rain] Failed to " + action + " inventory '" + file.getFileName() + "': " + error.getMessage());
    }

    /*
     * WARNING - void declaration
     */
    public final boolean delete(@NotNull UUID id) {
        Object object;
        block2: {
            void var5_7;
            Object object2;
            Intrinsics.checkNotNullParameter(id, "id");
            Path file = this.file(id);
            object = this;
            try {
                FriendManager $this$delete_u24lambda_u240 = object;
                boolean bl = false;
                object2 = Result.constructor-impl(Files.deleteIfExists(file));
            }
            catch (Throwable bl) {
                object2 = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object = object2;
            Throwable throwable = Result.exceptionOrNull-impl(object);
            if (throwable == null) break block2;
            Object it = object2 = throwable;
            boolean bl = false;
            INSTANCE.report("delete", file, (Throwable)var5_7);
        }
        return Result.isSuccess-impl(object);
    }

    /*
     * WARNING - void declaration
     */
    private final NbtCompound encode(InventoryPreset preset, RegistryWrapper.WrapperLookup registries) {
        void var3_3;
        NbtCompound root = new NbtCompound();
        RegistryOps registryOps = registries.getOps((DynamicOps)NbtOps.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(registryOps, "createSerializationContext(...)");
        RegistryOps ops = registryOps;
        InventorySnapshot $this$encode_u24lambda_u240 = preset.getSnapshot();
        boolean bl = false;
        List<Iterable> items = CollectionsKt.plus((Collection)CollectionsKt.plus((Collection)CollectionsKt.plus((Collection)$this$encode_u24lambda_u240.getArmor(), $this$encode_u24lambda_u240.getOffhand()), (Iterable)$this$encode_u24lambda_u240.getInventory()), (Iterable)$this$encode_u24lambda_u240.getHotbar());
        root.putInt("version", 1);
        root.putString("name", preset.getName());
        root.putLong("createdAt", preset.getCreatedAt());
        root.put("items", (NbtElement)itemsCodec.encodeStart((DynamicOps)ops, items).getOrThrow(IllegalArgumentException::new));
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final List<InventoryPreset> loadAll(@NotNull RegistryWrapper.WrapperLookup registries) {
        List list;
        Intrinsics.checkNotNullParameter(registries, "registries");
        Object object = this;
        try {
            FriendManager $this$loadAll_u24lambda_u240 = object;
            boolean bl = false;
            list = Result.constructor-impl($this$loadAll_u24lambda_u240.readAll(registries));
        }
        catch (Throwable bl) {
            list = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object = list;
        Throwable throwable = Result.exceptionOrNull-impl(object);
        if (throwable != null) {
            void var4_6;
            list = throwable;
            List it = list;
            boolean bl = false;
            Path path = directory;
            Intrinsics.checkNotNullExpressionValue(path, "directory");
            INSTANCE.report("open", path, (Throwable)var4_6);
        }
        list = CollectionsKt.emptyList();
        return (List)(Result.isFailure-impl(object) ? list : object);
    }

    private final Path file(UUID id) {
        Path path = directory.resolve(id + EXTENSION);
        Intrinsics.checkNotNullExpressionValue(path, "resolve(...)");
        return path;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final InventoryPreset save(@NotNull String name, @NotNull InventorySnapshot snapshot, @NotNull RegistryWrapper.WrapperLookup registries) {
        Object object;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(registries, "registries");
        UUID uUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uUID, "randomUUID(...)");
        InventoryPreset preset = new InventoryPreset(uUID, name, snapshot.deepCopy(), System.currentTimeMillis());
        Path file = this.file(preset.getId());
        Object object2 = this;
        try {
            FriendManager $this$save_u24lambda_u240 = object2;
            boolean bl = false;
            Files.createDirectories(directory, new FileAttribute[0]);
            $this$save_u24lambda_u240.writeAtomically($this$save_u24lambda_u240.encode(preset, registries), file);
            object = Result.constructor-impl(preset);
        }
        catch (Throwable bl) {
            object = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object2 = object;
        Throwable throwable = Result.exceptionOrNull-impl(object2);
        if (throwable != null) {
            void var8_10;
            Object it = object = throwable;
            boolean bl = false;
            INSTANCE.report("save", file, (Throwable)var8_10);
        }
        return (InventoryPreset)(Result.isFailure-impl(object2) ? null : object2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void writeAtomically(NbtCompound tag, Path target) {
        Path temporary = target.resolveSibling(target.getFileName() + ".tmp");
        try {
            NbtIo.writeCompressed((NbtCompound)tag, (Path)temporary);
            try {
                Object object = new CopyOption[2];
                object[0] = StandardCopyOption.ATOMIC_MOVE;
                object[1] = StandardCopyOption.REPLACE_EXISTING;
                object = Files.move(temporary, target, object);
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                Path path = Files.move(temporary, target, copyOptionArray);
            }
        }
        catch (Throwable throwable) {
            void var3_3;
            Files.deleteIfExists((Path)var3_3);
            throw throwable;
        }
        Files.deleteIfExists(temporary);
    }

    private FriendManager() {
    }

    private final InventorySnapshot snapshot(List<ItemStack> items) {
        Ref.IntRef index = new Ref.IntRef();
        List<ItemStack> armor = FriendManager.snapshot$take(items, index, 4);
        int n = index.element;
        index.element = n + 1;
        ItemStack itemStack = items.get(n).copy();
        Intrinsics.checkNotNullExpressionValue(itemStack, "copy(...)");
        ItemStack offhand = itemStack;
        return new InventorySnapshot(armor, offhand, FriendManager.snapshot$take(items, index, 27), FriendManager.snapshot$take(items, index, 9));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final List<InventoryPreset> readAll(RegistryWrapper.WrapperLookup registries) {
        void var6_10;
        Iterator iterator2;
        List presets = new ArrayList();
        Files.createDirectories(directory, new FileAttribute[0]);
        Closeable closeable = Files.newDirectoryStream(directory, "*.nbt");
        Throwable throwable = null;
        try {
            Object files = (DirectoryStream)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(files);
            Iterable $this$forEach$iv = (Iterable)files;
            boolean $i$f$forEach = false;
            iterator2 = $this$forEach$iv.iterator();
            while (iterator2.hasNext()) {
                void var15_23;
                Throwable throwable2;
                Object $this$readAll_u24lambda_u240_u240_u240;
                Object element$iv = iterator2.next();
                Path file = (Path)element$iv;
                boolean bl2 = false;
                Object object = INSTANCE;
                try {
                    $this$readAll_u24lambda_u240_u240_u240 = object;
                    boolean bl3 = false;
                    Intrinsics.checkNotNull(file);
                    $this$readAll_u24lambda_u240_u240_u240 = Result.constructor-impl(super.read(file, registries));
                }
                catch (Throwable bl3) {
                    $this$readAll_u24lambda_u240_u240_u240 = Result.constructor-impl(ResultKt.createFailure(bl3));
                }
                object = $this$readAll_u24lambda_u240_u240_u240;
                if (Result.isSuccess-impl(object)) {
                    InventoryPreset p0 = (InventoryPreset)object;
                    boolean bl4 = false;
                    presets.add(throwable2);
                }
                if (Result.exceptionOrNull-impl(object) == null) continue;
                Throwable it = throwable2;
                boolean bl5 = false;
                Intrinsics.checkNotNull(file);
                INSTANCE.report("load", file, (Throwable)var15_23);
            }
            files = Unit.INSTANCE;
        }
        catch (Throwable bl) {
            throwable = bl;
            throw bl;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
        Iterable $this$sortedBy$iv = presets;
        boolean $i$f$sortedBy = false;
        Iterable $this$distinctBy$iv = CollectionsKt.sortedWith($this$sortedBy$iv, new \u0628\u0628());
        boolean $i$f$distinctBy = false;
        HashSet set$iv = new HashSet();
        ArrayList list$iv = new ArrayList();
        for (Object e$iv : $this$distinctBy$iv) {
            void var8_13;
            String key$iv;
            InventoryPreset it = (InventoryPreset)e$iv;
            boolean bl = false;
            Intrinsics.checkNotNullExpressionValue(((InventoryPreset)((Object)key$iv)).getName().toLowerCase(Locale.ROOT), "toLowerCase(...)");
            if (!set$iv.add(iterator2)) continue;
            var6_10.add(var8_13);
        }
        return (List)var6_10;
    }
}

