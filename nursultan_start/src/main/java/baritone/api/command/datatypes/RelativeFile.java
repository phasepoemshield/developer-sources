/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Helper
 *  minecraft.class06202
 */
package baritone.api.command.datatypes;

import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.exception.CommandException;
import baritone.api.utils.Helper;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;
import minecraft.class06202;

public enum RelativeFile implements IDatatypePost<File, File>
{
    INSTANCE;


    @Deprecated
    public static File gameDir() {
        return RelativeFile.gameDir(Helper.mc);
    }

    public static File gameDir(class06202 class062022) {
        File file = ((File)class062022.l_1).getAbsoluteFile();
        if (file.getName().equals(".")) {
            return file.getParentFile();
        }
        return file;
    }

    @Override
    public File apply(IDatatypeContext iDatatypeContext, File file) throws CommandException {
        Path path;
        if (file == null) {
            file = new File("./");
        }
        try {
            path = FileSystems.getDefault().getPath(iDatatypeContext.getConsumer().getString(), new String[0]);
        }
        catch (InvalidPathException invalidPathException) {
            throw new IllegalArgumentException("invalid path");
        }
        return RelativeFile.getCanonicalFileUnchecked(file.toPath().resolve(path).toFile());
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) {
        return Stream.empty();
    }

    public static Stream<String> tabComplete(IArgConsumer iArgConsumer, File file2) throws CommandException {
        File file3 = RelativeFile.getCanonicalFileUnchecked(file2);
        String string3 = iArgConsumer.getString();
        Path path = FileSystems.getDefault().getPath(string3, new String[0]);
        Path path2 = path.isAbsolute() ? path.getRoot() : file3.toPath();
        boolean bl = !string3.isEmpty() && !string3.endsWith(File.separator);
        File file4 = path.isAbsolute() ? path.toFile() : new File(file3, string3);
        return Stream.of(Objects.requireNonNull(RelativeFile.getCanonicalFileUnchecked(bl ? file4.getParentFile() : file4).listFiles())).map(file -> String.valueOf(path.isAbsolute() ? file : path2.relativize(file.toPath()).toString()) + (file.isDirectory() ? File.separator : "")).filter(string2 -> string2.toLowerCase(Locale.US).startsWith(string3.toLowerCase(Locale.US))).filter(string -> !string.contains(" "));
    }

    private static File getCanonicalFileUnchecked(File file) {
        try {
            return file.getCanonicalFile();
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
    }
}

