package eu.darken.sdmse.common.upgrade

import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

// Locks disabled: Pro feature gates always pass in this fork.
suspend fun UpgradeRepo.isPro(): Boolean = true // upgradeInfo.first().isPro

/**
 * Pro check for backend safety-net gates (e.g. a tool's task-submit boundary).
 *
 * Locks disabled in this fork — always allows.
 */
@Suppress("UNUSED_PARAMETER")
suspend fun UpgradeRepo.isProSettled(timeout: Duration = 5.seconds): Boolean = true
// Original lock logic retained below for reference:
// suspend fun UpgradeRepo.isProSettled(timeout: Duration = 5.seconds): Boolean = try {
//     if (upgradeInfo.first().isPro) {
//         true
//     } else {
//         val proAppeared = withTimeoutOrNull(timeout) {
//             refresh()
//             upgradeInfo.first { it.isPro }
//             true
//         } == true
//         if (proAppeared) {
//             true
//         } else {
//             val current = upgradeInfo.first()
//             when {
//                 current.isPro -> true
//                 current.error != null -> true
//                 current.isSettled -> false
//                 else -> true
//             }
//         }
//     }
// } catch (e: CancellationException) {
//     throw e
// } catch (e: Exception) {
//     true
// }

/**
 * Pro check for UI gates: tap handlers that route between a gated action and the upgrade screen.
 *
 * Locks disabled in this fork — always allows.
 */
@Suppress("UNUSED_PARAMETER")
suspend fun UpgradeRepo.isProForUi(timeout: Duration = 3.seconds): Boolean = true
// Original lock logic retained below for reference:
// suspend fun UpgradeRepo.isProForUi(timeout: Duration = 3.seconds): Boolean = try {
//     val current = upgradeInfo.first()
//     when {
//         current.isPro -> true
//         current.isSettled -> false
//         else -> {
//             val settled = withTimeoutOrNull(timeout) { upgradeInfo.first { it.isSettled } }
//             (settled ?: upgradeInfo.first()).isPro
//         }
//     }
// } catch (e: CancellationException) {
//     throw e
// } catch (e: Exception) {
//     true
// }
