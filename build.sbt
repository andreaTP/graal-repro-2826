libraryDependencies += "org.wvlet.airframe" %% "airframe-log" % "20.10.0"

fork in run := true
run / javaOptions += "-agentlib:native-image-agent=config-output-dir=./tmp"

enablePlugins(GraalVMNativeImagePlugin)
