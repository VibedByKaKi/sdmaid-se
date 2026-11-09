# VibedByKaKi/sdmaid-se

Personal fork of [SD Maid 2/SE](https://github.com/d4rken-org/sdmaid-se). Pro tools are unlocked; no Play purchase or GitHub Sponsors hop required.

The upstream project README is still in [README.md](../README.md) at the repository root.

| [![](assets/get-it-on-github.png)](https://github.com/VibedByKaKi/sdmaid-se/actions/workflows/code-checks.yml) |
| --- |

Debug APKs are built by CI on every push and pull request. Grab the latest from [Actions → Code tests & eval](https://github.com/VibedByKaKi/sdmaid-se/actions/workflows/code-checks.yml): `apk-app-FossDebug` and `apk-app-GplayDebug`.

## What this fork changes

- **Pro unlocked** — AppCleaner deletion, Deduplicator, Media Squeeze, Scheduler, backups, and the rest of the paid surface are available without an upgrade.
- **Swiper** — Free session cap removed.
- **Upgrade CI** — Emulator upgrade tests pull the FOSS baseline APK and tags from upstream (`d4rken-org/sdmaid-se`), since this fork does not publish its own releases.

## CI

- **Code tests & eval** — lint, unit tests, module builds; uploads Foss/Gplay debug APKs.
- **Emulator tests** — instrumented, minified, and upgrade suites.

## Credits

SD Maid SE is built by [darken](https://github.com/d4rken) and [contributors](https://github.com/d4rken-org/sdmaid-se/graphs/contributors). This repository remains a fork of that work.
