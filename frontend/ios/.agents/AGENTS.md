# AGENTS.md - Frontend iOS

## Commands
```bash
# Compile Swift package and modules
make build

# Run mobile unit tests
make test

# Run Swift static analysis / lint
make lint

# Launch dev / open project in Xcode
make dev
```

## Boundaries

### Always do
- Target iOS 17.0+ using pure SwiftUI and Swift Concurrency (`async`/`await`, `@MainActor`).
- Ensure all business models conform to `Codable`, `Sendable`, and `Identifiable` where applicable.
- Structure views cleanly into reusable modular components.

### Ask first
- Introducing new third-party Swift Package dependencies.

### Never do
- Use UIKit wrappers when native SwiftUI equivalents are available in iOS 17+.
- Store credentials, tokens, or private keys in unencrypted `UserDefaults`.

## Project Structure
```text
App/                    # @main SwiftUI App entry point and primary screens
Sources/SampleAppCore/  # Shared Swift module
  ├── DesignSystem/     # Reusable design tokens and UI components
  └── Models/           # Shared domain models
```
