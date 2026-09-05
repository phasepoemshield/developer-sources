/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05213
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class07536
 *  minecraft.class08394
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.gui.element;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05213;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class07536;
import minecraft.class08394;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.element.IrisObjectSelectionList;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$BaseEntry;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$LabelEntry;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$PinnedEntry;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$ShaderPackEntry;
import net.irisshaders.iris.gui.element.ShaderPackSelectionList$TopButtonRowEntry;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;

public class ShaderPackSelectionList
extends IrisObjectSelectionList<ShaderPackSelectionList$BaseEntry> {
    private static final class00392 PACK_LIST_LABEL = class00392.L((String)"pack.iris.list.label").N(new class06541[]{class06541.field_1056, class06541.field_1080});
    private static final class01894 MENU_LIST_BACKGROUND = class01894.y((String)"textures/gui/menu_background.png");
    final ShaderPackScreen screen;
    private final ShaderPackSelectionList$TopButtonRowEntry topButtonRow;
    private final WatchService watcher;
    private final WatchKey key;
    private final ShaderPackSelectionList$PinnedEntry downloadButton;
    private boolean keyValid;
    private ShaderPackSelectionList$ShaderPackEntry applied = null;

    public void select(String string) {
        for (int i = 0; i < this.method_25340(); ++i) {
            ShaderPackSelectionList$BaseEntry shaderPackSelectionList$BaseEntry = (ShaderPackSelectionList$BaseEntry)((Object)this.method_25396().get(i));
            if (!(shaderPackSelectionList$BaseEntry instanceof ShaderPackSelectionList$ShaderPackEntry) || !((ShaderPackSelectionList$ShaderPackEntry)shaderPackSelectionList$BaseEntry).packName.equals(string)) continue;
            this.method_25313(shaderPackSelectionList$BaseEntry);
            return;
        }
    }

    public ShaderPackSelectionList(ShaderPackScreen shaderPackScreen, class06202 class062022, int n, int n2, int n3, int n4, int n5, int n6) {
        super(class062022, n, n4, n3 + 4, n4, n5, n6, 20);
        WatchKey watchKey;
        WatchService watchService;
        this.screen = shaderPackScreen;
        this.topButtonRow = new ShaderPackSelectionList$TopButtonRowEntry(this, Iris.getIrisConfig().areShadersEnabled());
        this.downloadButton = new ShaderPackSelectionList$PinnedEntry((class00392)class00392.y((String)"Download Shaders"), () -> this.field_22740.N((class05096)new class01321(bl -> {
            if (bl) {
                class07536.m().N("https://modrinth.com/shaders");
            }
            this.field_22740.N((class05096)this.screen);
        }, "https://modrinth.com/shaders", true)), this);
        try {
            watchService = FileSystems.getDefault().newWatchService();
            watchKey = Iris.getShaderpacksDirectory().register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
            this.keyValid = true;
        }
        catch (IOException iOException) {
            Iris.logger.error("Couldn't register file watcher!", (Throwable)iOException);
            watchService = null;
            watchKey = null;
            this.keyValid = false;
        }
        this.key = watchKey;
        this.watcher = watchService;
        this.refresh();
    }

    public void close() throws IOException {
        if (this.key != null) {
            this.key.cancel();
        }
        if (this.watcher != null) {
            this.watcher.close();
        }
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.B() && this.method_25336() == this.method_25396().getFirst()) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void refresh() {
        List list;
        this.method_25339();
        try {
            list = Iris.getShaderpacksDirectoryManager().enumerate();
        }
        catch (Throwable throwable) {
            Iris.logger.error("Error reading files while constructing selection UI", throwable);
            this.addLabelEntries(new class00392[]{class00392.i(), class00392.y((String)"There was an error reading your shaderpacks directory").N(new class06541[]{class06541.field_1061, class06541.field_1067}), class00392.i(), class00392.y((String)"Check your logs for more information."), class00392.y((String)"Please file an issue report including a log file."), class00392.y((String)"If you are able to identify the file causing this, please include it in your report as well."), class00392.y((String)"Note that this might be an issue with folder permissions; ensure those are correct first.")});
            return;
        }
        this.method_25321(this.topButtonRow);
        if (list.isEmpty()) {
            this.method_25321(this.downloadButton);
        }
        this.topButtonRow.allowEnableShadersButton = !list.isEmpty();
        int n = 0;
        for (String string : list) {
            this.addPackEntry(++n, string);
        }
        this.addLabelEntries(PACK_LIST_LABEL);
    }

    public void addLabelEntries(class00392 ... class00392Array) {
        for (class00392 class003922 : class00392Array) {
            this.method_25321(new ShaderPackSelectionList$LabelEntry(class003922));
        }
    }

    public void addPackEntry(int n, String string) {
        ShaderPackSelectionList$ShaderPackEntry shaderPackSelectionList$ShaderPackEntry = new ShaderPackSelectionList$ShaderPackEntry(this, n, this, string);
        Iris.getIrisConfig().getShaderPackName().ifPresent(string2 -> {
            if (string.equals(string2)) {
                this.method_25313(shaderPackSelectionList$ShaderPackEntry);
                this.method_25395((class04654)shaderPackSelectionList$ShaderPackEntry);
                this.method_25324(shaderPackSelectionList$ShaderPackEntry);
                this.setApplied(shaderPackSelectionList$ShaderPackEntry);
            }
        });
        this.method_25321(shaderPackSelectionList$ShaderPackEntry);
    }

    public void setApplied(ShaderPackSelectionList$ShaderPackEntry shaderPackSelectionList$ShaderPackEntry) {
        this.applied = shaderPackSelectionList$ShaderPackEntry;
    }

    public ShaderPackSelectionList$TopButtonRowEntry getTopButtonRow() {
        return this.topButtonRow;
    }

    public ShaderPackSelectionList$ShaderPackEntry getApplied() {
        return this.applied;
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        if (this.keyValid) {
            for (WatchEvent<?> watchEvent : this.key.pollEvents()) {
                if (watchEvent.kind() == StandardWatchEventKinds.OVERFLOW) continue;
                this.refresh();
                break;
            }
            this.keyValid = this.key.reset();
        }
        super.method_48579(class010542, n, n2, f);
    }

    public int method_25322() {
        return Math.min(308, this.field_22758 - 50);
    }

    public void method_57715(class01054 class010542) {
        float f = this.screen.listTransition.getAsFloat();
        if (f < 0.02f) {
            return;
        }
        class010542.N(class08394.Na, MENU_LIST_BACKGROUND, this.method_46426(), this.method_46427(), (float)this.method_55442(), (float)(this.method_55443() + (int)this.method_44387()), this.method_25368(), this.method_25364(), 32, 32);
    }

    public int method_25337(int n) {
        return super.method_25337(n) + 2;
    }

    public void method_57713(class01054 class010542) {
        float f = this.screen.listTransition.getAsFloat();
        if (f < 0.02f) {
            return;
        }
        int n = class02566.N((float)f, (float)1.0f, (float)1.0f, (float)1.0f);
        class010542.N(class08394.Na, class05213.field_49895, this.method_46426(), this.method_46427() - 2, 0.0f, 0.0f, this.method_25368(), 2, 32, 2, n);
        class010542.N(class08394.Na, class05213.field_49896, this.method_46426(), this.method_55443(), 0.0f, 0.0f, this.method_25368(), 2, 32, 2, n);
    }
}

