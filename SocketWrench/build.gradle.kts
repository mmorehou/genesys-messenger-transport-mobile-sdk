listOf("iphoneos", "iphonesimulator").forEach { sdk ->
    tasks.create<Exec>("build${sdk.capitalize()}") {
        group = "build"

        commandLine(
            "xcodebuild",
            "-project", "SocketWrench.xcodeproj",
            "-scheme", "SocketWrench",
            "-sdk", sdk,
            "-configuration", "Release",
            "-derivedDataPath", "DerivedData"
        )
        workingDir(projectDir)

        inputs.files(
            fileTree("$projectDir/SocketWrench.xcodeproj") { exclude("**/xcuserdata") },
            fileTree("$projectDir/SocketWrench")
        )
        outputs.files(
            fileTree("$projectDir/DerivedData/Build/Products/Release-${sdk}")
        )
    }
}

tasks.create<Delete>("clean") {
    group = "build"

    delete("$projectDir/DerivedData")
}
