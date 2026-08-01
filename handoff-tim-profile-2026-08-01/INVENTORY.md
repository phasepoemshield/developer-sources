# Handoff: macOS profile `tim` → Max takeover (2026-08-01)

Donor mess on account short name `tim`. Owner after wipe of Timur content: Max Vilchevskiy.  
This folder documents what was on the machine for Timur to restore elsewhere. **No secret values** are stored here.

## Remotes (verified synced before local delete)

| Local path | Remote | Local HEAD | Status |
|------------|--------|------------|--------|
| `~/Developer/FluxVisuals` | `git@github.com:phasepoemshield/FluxVisuals-dev.git` | `c2ce6d0` | clean vs `origin/main` (ignore untracked `.claude/settings.local.json`) |
| `~/Developer/figmapro` | `https://github.com/phasepoemshield/figmapro.git` | `c52c863` | clean vs `origin/main` |
| `~/Developer/developer-sources` | `https://github.com/phasepoemshield/developer-sources.git` | this commit | handoff added then pushed |
| `~/Developer/CodexPro` | `https://github.com/rebel0789/codexpro.git` | see `projects/CodexPro-STATE.md` | **behind origin — do not push**; local discarded |

## SSH (Timur)

- Active GitHub SSH for Timur was `~/.ssh/phasepoemshield-GitHub` (ed25519).
- After Maxim key install, Timur copies live in `~/.ssh/timur-handoff-backup-20260801/` on this Mac until wiped.
- Maxim default key is `~/.ssh/id_rsa` (from iCloud Technical); `ssh -T` → `vil4max`.

## Secrets (names only — rotate)

See `shell/SECRET-NAMES.md`. Values were in plaintext `~/.zshrc` / `~/.env` — **treat as compromised**.

## Home hidden junk (counts)

At handoff: **104** hidden entries in `~` (78 dirs + 26 files). Large deletes planned on this profile (not archived into git): `.Trash`, `.codex` (~5.9G), `.vscode`, `.cache`, `.npm-global`, `.lunarclient`, Minecraft/AI zoo, etc. Full classification lives in the Cursor migrate plan on Max’s side.

## Apps to remove on this profile (Timur / non-Max)

Antigravity, Sourcetree (optional), X Minecraft Launcher, Prism, Modrinth + their Library data.

## What Timur should do on another Mac

1. `gh auth login` as `phasepoemshield`.
2. Clone the three remotes above (+ pull this `developer-sources` for archive trees + this handoff).
3. Restore SSH from `timur-handoff-backup` or regenerate.
4. Rotate every name in `shell/SECRET-NAMES.md`.
