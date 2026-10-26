# AGENTS.md - Frontend Android

## Commands
```bash
# Build debug APK
make build

# Run unit tests
make test

# Run Android lint
make lint

# Launch dev / open project in Android Studio
make dev
```

## Boundaries

### Always do
- Target Android 14+ (minSdk 26, targetSdk 35) using pure Jetpack Compose and Kotlin Coroutines/Flow.
- Model UI state immutably using Kotlin `data class` with `StateFlow`.
- Structure UI cleanly into reusable Compose components.

### Ask first
- Introducing new third-party Android libraries or SDKs.

### Never do
- Use XML-based legacy layouts when Jetpack Compose is available.
- Store credentials, tokens, or private keys in unencrypted `SharedPreferences`.

## Project Structure
```text
app/src/main/java/com/sampleapp/android/
  ├── MainActivity.kt          # Compose ComponentActivity entry point
  ├── ui/theme/                # Theme tokens, typography, and color schemes
  └── components/              # Reusable Compose widgets
```
