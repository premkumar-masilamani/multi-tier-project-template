// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "mobile",
    platforms: [
        .iOS(.v17),
        .macOS(.v14)
    ],
    products: [
        .library(
            name: "SampleAppCore",
            targets: ["SampleAppCore"]
        )
    ],
    dependencies: [],
    targets: [
        .target(
            name: "SampleAppCore",
            dependencies: [],
            path: "Sources/SampleAppCore"
        )
    ]
)
