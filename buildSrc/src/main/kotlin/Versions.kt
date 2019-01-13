import kotlin.String

/**
 * Find which updates are available by running
 *     `$ ./gradlew syncLibs`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val com_diffplug_gradle_spotless_gradle_plugin: String = "3.16.0" 

    const val com_github_johnrengelman_shadow_gradle_plugin: String = "4.0.3" 

    const val io_pixeloutlaw_gradle_buildconfigkt_gradle_plugin: String =
            "0.1.2" // exceed the version found: 0.1.1

    const val jmfayard_github_io_gradle_kotlin_dsl_libs_gradle_plugin: String = "0.2.6" 

    const val nebula_project_gradle_plugin: String = "5.2.1" 

    const val org_jetbrains_kotlin_jvm_gradle_plugin: String = "1.3.11" 

    const val org_jetbrains_kotlin: String = "1.3.11" 

    const val plugin_annotations: String = "1.2.2-SNAPSHOT" 
            /* Could not find any version that matches org.spigotmc:plugin-annotations:+.
            Versions rejected by component selection rules:
              - 1.2.2-SNAPSHOT
              - 1.2.1-SNAPSHOT 
            .... */

    const val spigot_api: String = "1.13.2-R0.1-SNAPSHOT" 
            /* Could not find any version that matches org.spigotmc:spigot-api:+.
            Versions rejected by component selection rules:
              - 1.13.2-R0.1-SNAPSHOT
              - 1.13.1-R0.1-SNAPSHOT 
            .... */

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "4.10.2"

        const val currentVersion: String = "5.0"

        const val nightlyVersion: String = "5.2-20181216000032+0000"

        const val releaseCandidate: String = "5.1-rc-1"
    }
}