# Runtime smoke test

- Date: 2026-08-24 (Europe/Kiev)
- Command: `JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home gradle runClient --no-daemon`
- Minecraft: 1.21.11
- Fabric Loader: 0.19.3
- Result: client reached a rendered world and remained alive after both repaired interaction paths were exercised.
- Rain evidence: `rain-visuals`, nested Figura and nested IAS loaded; Rain runtime resource pack, textures and ChromaRenderer initialized.
- Custom Sky: the mode selector switched `sky -> cinematic -> nightfall -> themed` without the former `ModeSetting.render` null-pointer crash. The final run loaded `sky` again successfully.
- Accounts: the main-menu button opened the IAS account screen; an offline login request was accepted and flushed, with no `ClassNotFoundException`.
- Visual confirmation: the IAS account screen and its offline-account dialog were rendered; the client then continued into a rendered world.
- Models (latest restart): the restored signed Social API request loaded manifest version 1 with 16 avatars. All 16 archives were downloaded, SHA-256 checked, unpacked and installed; all 16 live Figura previews reached `READY`, rendered a 360x522 GPU snapshot and were persisted to the rendered-preview cache. No preview preparation or snapshot-render failure was logged.
- Models apply: at least nine selections were observed applying successfully through Figura's local-avatar loader: `miku`, `Neil (Seals from Alex's mobs separate variant)`, `Repo`, `Aria`, `robloxman`, `Bee`, `demongirl`, `Elaina` and `Mita`. The active client remained alive in a rendered world.

Runtime repair applied:

- `tools/RuntimeAccessPatch.java` promotes bundled Kotlin implementation classes to public for runtime linkage and repairs JUnixSocket inner constructors.
- The two empty animation-map lookups in `ModeSetting.render` now lazily create animation objects, fixing Custom Sky mode changes.
- The matching official IAS `9.0.7+1.21.11-fabric` JAR is nested in the recovered Rain JAR, fixing the missing Accounts-screen dependency.
- The leak wrapper's unrelated Telegram auto-open and console advertisement were removed; it now delegates directly to the Rain client initializer.
- The Models/Figura remote catalog's nine disabled network methods and empty startup hook were restored. Requests reuse Rain's original HMAC signer, verify signed responses, enforce origin/path/size/SHA-256 constraints and atomically cache validated content.

Non-fatal issue observed:

- Bundled Discord/JUnixSocket background thread raised a `NoSuchMethodError`; the render thread and integrated server continued.

The final console is saved in `reports/run_client.log`. The client was intentionally left running after verification.
