/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01593
 *  minecraft.class01894
 *  minecraft.class03652
 */
package net.fabricmc.fabric.impl.resource.pack;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import minecraft.class01593;
import minecraft.class01894;
import minecraft.class03652;
import net.fabricmc.fabric.impl.resource.pack.ModNioPackResources;

class ModNioPackResources$1
extends SimpleFileVisitor<Path> {
    final /* synthetic */ Path val$nsPath;
    final /* synthetic */ String val$separator;
    final /* synthetic */ String val$namespace;
    final /* synthetic */ class01593 val$visitor;
    final /* synthetic */ ModNioPackResources this$0;

    ModNioPackResources$1(ModNioPackResources modNioPackResources, Path path, String string, String string2, class01593 class015932) {
        this.this$0 = modNioPackResources;
        this.val$nsPath = path;
        this.val$separator = string;
        this.val$namespace = string2;
        this.val$visitor = class015932;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        String string = this.val$nsPath.relativize(path).toString().replace(this.val$separator, "/");
        class01894 class018942 = class01894.y((String)this.val$namespace, (String)string);
        if (class018942 == null) {
            ModNioPackResources.LOGGER.error("Invalid path in mod resource-pack {}: {}:{}, ignoring", new Object[]{this.this$0.id, this.val$namespace, string});
        } else {
            this.val$visitor.accept((Object)class018942, (Object)class03652.N((Path)path));
        }
        return FileVisitResult.CONTINUE;
    }
}

