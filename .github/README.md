# VibedByKaKi/sdmaid-se

Personal fork of [SD Maid 2/SE](https://github.com/d4rken-org/sdmaid-se). Pro tools are unlocked; no Play purchase or GitHub Sponsors hop required.

The upstream project README is still in [README.md](../README.md) at the repository root.

| [![](assets/get-it-on-github.png)](https://github.com/VibedByKaKi/sdmaid-se/releases/tag/latest) | [![](assets/badge_obtainium.png)](https://apps.obtainium.imranr.dev/redirect?r=obtainium%3A%2F%2Fapp%2F%257B%2522id%2522%253A%2522eu.darken.sdmse%2522%252C%2522url%2522%253A%2522https%253A%252F%252Fgithub.com%252FVibedByKaKi%252Fsdmaid-se%2522%252C%2522author%2522%253A%2522VibedByKaKi%2522%252C%2522name%2522%253A%2522SD%2520Maid%2520SE%2520%2528VibedByKaKi%2520fork%2529%2522%252C%2522preferredApkIndex%2522%253A0%252C%2522additionalSettings%2522%253A%2522%257B%255C%2522includePrereleases%255C%2522%253A%2520true%252C%2520%255C%2522fallbackToOlderReleases%255C%2522%253A%2520true%252C%2520%255C%2522apkFilterRegEx%255C%2522%253A%2520%255C%2522.%252A%255C%255C%255C%255C.apk%2524%255C%2522%257D%2522%257D) |
| --- | --- |

Debug APKs ship as a rolling GitHub prerelease on the [`latest`](https://github.com/VibedByKaKi/sdmaid-se/releases/tag/latest) tag (`sdmaid-se-foss-debug.apk`). In Obtainium, keep **Include pre-releases** on if you added the repo by hand.

CI still uploads Foss/Gplay debug artifacts under [Actions → Code tests & eval](https://github.com/VibedByKaKi/sdmaid-se/actions/workflows/code-checks.yml) as well.

## What this fork changes

- **Pro unlocked** — AppCleaner deletion, Deduplicator, Media Squeeze, Scheduler, backups, and the rest of the paid surface are available without an upgrade.
- **Swiper** — Free session cap removed.
- **Upgrade CI** — Emulator upgrade tests pull the FOSS baseline APK and tags from upstream (`d4rken-org/sdmaid-se`), since this fork does not publish versioned releases of its own.

## CI

- **Release latest APK** — on every push to `main` (and manual dispatch); rebuilds the FOSS debug APK and replaces the `latest` prerelease.
- **Code tests & eval** — lint, unit tests, module builds; uploads Foss/Gplay debug APKs as Actions artifacts.
- **Emulator tests** — instrumented, minified, and upgrade suites.

## Credits

SD Maid SE is built by [darken](https://github.com/d4rken) and [contributors](https://github.com/d4rken-org/sdmaid-se/graphs/contributors). This repository remains a fork of that work.
