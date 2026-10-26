import SwiftUI
import SampleAppCore

struct ContentView: View {
    var body: some View {
        VStack(spacing: 16) {
            Text("SampleApp")
                .font(.largeTitle)
                .fontWeight(.bold)

            Text("Empty application template.")
                .font(.subheadline)
                .foregroundColor(.secondary)
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
