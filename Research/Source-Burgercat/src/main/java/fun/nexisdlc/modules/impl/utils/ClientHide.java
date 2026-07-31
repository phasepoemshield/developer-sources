package fun.nexisdlc.modules.impl.utils;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.config.Config;
import fun.nexisdlc.client.utils.config.ConfigStorage;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.StringSetting;
import lombok.Getter;
import ru.sterford.annotations.NativeCall;

import java.io.*;

@FunctionAdd(name = "ClientHide", alias = "Hide Client", category = Category.Utilities, description = "Позволяет скрывать клиент на проверках")
public class ClientHide extends Function {

    private static final String HIDE_CONFIG_NAME = "clienthide_restore";
    private static boolean restoreOnDisable = false;

    public final StringSetting pathToMinecraft = new StringSetting(
            "Путь до майна",
            System.getProperty("user.home").replace("\\", "/") + "/AppData/Roaming/.minecraft"
    );

    public final ModeSetting codeType = new ModeSetting("Тип кода для возврата клиента (что нужно будет написать в чат)", "Логин", "Логин", "Юид");
    public final BooleanSetting block = new BooleanSetting("Блокировать коннекты к серверам FunTime", false);

    @Getter
    private static String code = "1";
    public static boolean unhooked = false;
    public static File resourcePackFolder;

    public ClientHide() {
        addSettings(pathToMinecraft, codeType, block);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        // модуль-настройка: при ВКЛ ничего не делает
    }

    @Override
    public void onDisable() {
        super.onDisable();
        // ничего
    }

    public void applyHide() {
        saveRestoreConfig();

        code = switch (codeType.get()) {
            case "Логин", "Login" -> ClientContainer.getUser();
            case "Юид", "Uid" -> ClientContainer.getUid();
            default -> "pr";
        };

        unhooked = true;
        ClientContainer.setHide(true);
        Nexis.noNeedSounds = true;

        String mcPath = pathToMinecraft.get();
        if (mcPath != null && !mcPath.isEmpty()) {
            resourcePackFolder = new File(mcPath, "resourcepacks");
        }

        if (block.get()) enableGlobalFirewallBlock();

        for (Function function : Nexis.getFunctionManager().getFunctions()) {
            if (!function.getName().equals("ClientHide")) {
                function.setState(false);
            }
        }

        setBaritoneCommandsEnabled(false);
    }

    public void restoreHide() {
        unhooked = false;
        ClientContainer.setHide(false);
        Nexis.noNeedSounds = false;
        code = "1";

        disableGlobalFirewallBlock();

        if (restoreOnDisable) {
            restoreOnDisable = false;
            loadRestoreConfig();
        }

        setBaritoneCommandsEnabled(true);
    }

    public void requestRestoreOnDisable() {
        restoreOnDisable = true;
    }

    @NativeCall
    private void enableGlobalFirewallBlock() {
        try {

            execCommand("netsh advfirewall firewall add rule name=\"Nexis_Block_Map4yk\" "
                    + "dir=out action=block protocol=ANY remoteip=map4yk.tech enable=yes");

            execCommand("netsh advfirewall firewall add rule name=\"Nexis_Block_Map4yk_FQDN\" "
                    + "dir=out action=block protocol=ANY remotefqdn=\"*.map4yk.tech\" enable=yes");

            execCommand("netsh advfirewall firewall add rule name=\"Nexis_Block_IRX\" "
                    + "dir=out action=block program=\"irx.exe\" enable=yes");

            execCommand("netsh advfirewall firewall add rule name=\"Nexis_Block_Map4yk_HTTP\" "
                    + "dir=out action=block protocol=TCP remoteport=80,443 remotefqdn=\"*.map4yk.tech\" enable=yes");

            System.out.println("Блокировка серверов FunTime успешно активирована");

        } catch (Exception e) {
            System.err.println("[ClientHide] Ошибка при создании правил firewall: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @NativeCall
    private void disableGlobalFirewallBlock() {
        try {
            execCommand("netsh advfirewall reset");
            System.out.println("Блокировка серверов FunTime снята");
        } catch (Exception e) {
            System.err.println("[ClientHide] Ошибка при отключении блокировки: " + e.getMessage());
        }
    }


    @NativeCall
    private void execCommand(String command) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", command);
        pb.redirectErrorStream(true);
        Process process = pb.start();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("[netsh] " + line);
            }
        }

        process.waitFor();
    }


    private void loadRestoreConfig() {
        Nexis.getInstance().getConfigStorage().loadConfiguration(HIDE_CONFIG_NAME);
    }

    private void saveRestoreConfig() {
        ConfigStorage.saveConfiguration(HIDE_CONFIG_NAME);

        Config config = new Config(HIDE_CONFIG_NAME);
        if (!config.getFile().exists()) {
            return;
        }

        try (FileReader reader = new FileReader(config.getFile())) {
            JsonObject root = JsonParser.parseReader(reader).getAsJsonObject();
            JsonObject modules = root.has("modules") && root.get("modules").isJsonObject()
                    ? root.getAsJsonObject("modules")
                    : null;
            JsonObject clientHide = modules != null && modules.has("clienthide") && modules.get("clienthide").isJsonObject()
                    ? modules.getAsJsonObject("clienthide")
                    : null;

            if (clientHide == null) {
                return;
            }

            clientHide.addProperty("state", false);

            try (FileWriter writer = new FileWriter(config.getFile())) {
                writer.write(new GsonBuilder().setPrettyPrinting().create().toJson(root));
            }
        } catch (IOException ignored) {
        }
    }

    private void setBaritoneCommandsEnabled(boolean enabled) {
        /*

        try {
            Class.forName("baritone.api.BaritoneAPI");

            var settings = baritone.api.BaritoneAPI.getSettings();

            if (!enabled) {
                settings.prefix.value = "";
                settings.chatControl.value = false;

                baritone.api.BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager().getBaritone().getPathingBehavior().cancelEverything();
            } else {
                settings.prefix.value = "@";
                settings.chatControl.value = true;
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[ClientHide] Baritone API не найден, пропускаем отключение команд.");
        } catch (Exception e) {
            System.err.println("[ClientHide] Ошибка при изменении настроек Baritone: " + e.getMessage());
        }

         */
    }
}