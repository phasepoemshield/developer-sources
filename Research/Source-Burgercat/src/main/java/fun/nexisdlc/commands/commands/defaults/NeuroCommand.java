package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.modules.impl.combat.aura.rotations.NeuroModel;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class NeuroCommand extends Command {

    public NeuroCommand() {
        super("neuro");
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String action = args.hasAny()
                ? args.getString().toLowerCase(Locale.ROOT)
                : "status";

        switch (action) {
            case "reload" -> {
                args.requireMax(0);

                try {
                    NeuroModel.reload();

                    logDirect(Formatting.GREEN + "Neuro models reloaded.");
                    printStatus();
                } catch (Throwable t) {
                    logDirect(Formatting.RED + "Neuro reload failed: "
                            + t.getClass().getSimpleName()
                            + ": "
                            + t.getMessage());

                    t.printStackTrace();
                }
            }

            case "status" -> {
                args.requireMax(0);
                printStatus();
            }

            default -> printUsage();
        }
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (args.hasExactlyOne()) {
            String prefix = args.peekString(0).toLowerCase(Locale.ROOT);

            return Stream.of("reload", "status")
                    .filter(s -> s.startsWith(prefix))
                    .sorted();
        }

        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Reload/status for Neuro rotation models.";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "Neuro rotation model commands.",
                "",
                "> neuro reload   — reload ONNX models from run/nexis_models",
                "> neuro status   — show loaded model status"
        );
    }

    private void printStatus() {
        logDirect(Formatting.WHITE + "Neuro model status:");

        for (String key : NeuroModel.KEYS) {
            boolean ready = NeuroModel.isReady(key);

            if (ready) {
                logDirect(Formatting.GREEN + "  " + key + ": ready");
            } else {
                logDirect(Formatting.RED + "  " + key + ": missing");
            }
        }
    }

    private void printUsage() {
        logDirect(Formatting.WHITE + "neuro reload / status");
    }
}