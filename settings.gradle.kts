import java.io.File

rootProject.name = "spring-ioc-di-architecture"

include(":app")

val projectPath: String = File(System.getProperty("user.dir")).absolutePath
val subsystemPath = "$projectPath/subsystem"
val buildDirectory = listOf("build", "out", "bin")

val subsystems = File(subsystemPath).listFiles()
  ?.filter { it.isDirectory && !buildDirectory.contains(it.name) && !it.name.startsWith(".") }
  ?.map { it.name }

subsystems?.forEach { subsystem ->
  println("Loaded $subsystem subsystem.")

  include(":subsystem:$subsystem:concept")
  project(":subsystem:$subsystem:concept").name = "$subsystem-concept"
  include(":subsystem:$subsystem:implementation")
  project(":subsystem:$subsystem:implementation").name = "$subsystem-implementation"
}
