listOf("iphoneos", "iphonesimulator").forEach { sdk ->
    tasks.create<Exec>("build${sdk.capitalize()}") {
        group = "build"

        commandLine(
            "xcodebuild",
            "-project", "SocketWrench.xcodeproj",
            "-target", "SocketWrench",
            "-sdk", sdk
        )
        workingDir(projectDir)

        inputs.files(
            fileTree("$projectDir/SocketWrench.xcodeproj") { exclude("**/xcuserdata") },
            fileTree("$projectDir/SocketWrench")
        )
        outputs.files(
            fileTree("$projectDir/build/Release-${sdk}")
        )
    }
}

tasks.create<Delete>("clean") {
    group = "build"

    delete("$projectDir/build")
}
