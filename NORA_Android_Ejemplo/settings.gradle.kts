pluginManagement {
    repositories {
        maven {
            url = uri("http://192.168.111.185:8081/repository/nora-mobile/")
            isAllowInsecureProtocol = true
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        maven {
            url = uri("http://192.168.111.185:8081/repository/nora-mobile/")
            isAllowInsecureProtocol = true
        }
    }
}

rootProject.name = "NexusPoc"
include(":app")