/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 */
package net.irisshaders.iris.gui;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.irisshaders.iris.gui.FileDialogUtil$DialogType;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public final class FileDialogUtil {
    private static final ExecutorService FILE_DIALOG_EXECUTOR = Executors.newSingleThreadExecutor();

    private FileDialogUtil() {
    }

    public static CompletableFuture<Optional<Path>> fileSelectDialog(FileDialogUtil$DialogType fileDialogUtil$DialogType, String string, Path path, String string2, String ... stringArray) {
        CompletableFuture<Optional<Path>> completableFuture = new CompletableFuture<Optional<Path>>();
        FILE_DIALOG_EXECUTOR.submit(() -> {
            String string4 = null;
            try (MemoryStack memoryStack = MemoryStack.stackPush();){
                PointerBuffer pointerBuffer = memoryStack.mallocPointer(stringArray.length);
                String[] stringArray2 = stringArray;
                int n = stringArray2.length;
                for (int i = 0; i < n; ++i) {
                    String string5 = stringArray2[i];
                    pointerBuffer.put(memoryStack.UTF8((CharSequence)string5));
                }
                pointerBuffer.flip();
                String[] stringArray3 = stringArray2 = path != null ? path.toAbsolutePath().toString() : null;
                if (fileDialogUtil$DialogType == FileDialogUtil$DialogType.SAVE) {
                    string4 = TinyFileDialogs.tinyfd_saveFileDialog((CharSequence)string, (CharSequence)stringArray2, (PointerBuffer)pointerBuffer, (CharSequence)string2);
                } else if (fileDialogUtil$DialogType == FileDialogUtil$DialogType.OPEN) {
                    string4 = TinyFileDialogs.tinyfd_openFileDialog((CharSequence)string, (CharSequence)stringArray2, (PointerBuffer)pointerBuffer, (CharSequence)string2, (boolean)false);
                }
            }
            completableFuture.complete(Optional.ofNullable(string4).map(string -> Paths.get(string, new String[0])));
        });
        return completableFuture;
    }
}

