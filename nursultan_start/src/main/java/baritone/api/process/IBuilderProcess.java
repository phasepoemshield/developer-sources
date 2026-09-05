/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class06202
 *  minecraft.class07209
 */
package baritone.api.process;

import baritone.api.process.IBaritoneProcess;
import baritone.api.schematic.ISchematic;
import java.io.File;
import java.util.List;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class06202;
import minecraft.class07209;

public interface IBuilderProcess
extends IBaritoneProcess {
    public void resume();

    public void build(String var1, ISchematic var2, class00753 var3);

    @Deprecated
    default public boolean build(String string, class07209 class072092) {
        File file = new File(new File((File)class06202.Nq().l_1, "schematics"), string);
        return this.build(string, file, (class00753)class072092);
    }

    public boolean build(String var1, File var2, class00753 var3);

    public void pause();

    public void clearArea(class07209 var1, class07209 var2);

    public boolean isPaused();

    public void buildOpenLitematic(int var1);

    public Optional<Integer> getMinLayer();

    public Optional<Integer> getMaxLayer();

    public void buildOpenSchematic();

    public List<class00500> getApproxPlaceable();
}

