//pluginManagement {
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//        maven{
//            url 'https://jitpack.io'
//        }
//    }
//}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
        maven{
            setUrl("https://jitpack.io")
        }
    }
}

rootProject.name = "DecoradorNullLib"
include(":app")
include(":DecoradorLib")