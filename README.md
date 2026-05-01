# dsl-demo

Companion code for the Kotlin DSL section of the
[kslides talk](https://github.com/pambrose/myslides). The sources walk through
the building blocks used to assemble a type-safe builder DSL in Kotlin —
lambdas, extension functions, function-typed receivers, and `@DslMarker`.

## Layout

- `org.athenian.slides.lambdas` — basic lambda + extension function examples.
- `org.athenian.slides.nonlambda` — the same `Person` model expressed without
  builders, to contrast with the DSL versions.
- `org.athenian.slides.receiver` — function-typed receiver examples that
  motivate the DSL form.
- `PersonDsl.kt` — the final builder DSL, scoped with `@PersonDslMarker`.
  Runnable via `./gradlew run` (the `application` plugin's `mainClass` is
  `PersonDslKt`).

## Build

Toolchain: JDK 17 (resolved via the foojay convention plugin).

```sh
./gradlew build      # compile + test
./gradlew run        # run PersonDsl main()
./gradlew test       # run the unit tests
```

The `Makefile` wraps the most common Gradle invocations:

```sh
make build           # ./gradlew build -x test
make stop            # ./gradlew --stop
make versioncheck    # ./gradlew dependencyUpdates (config-cache disabled)
make upgrade-wrapper # bump the Gradle wrapper to 9.5.0
```

## Tooling

- Gradle 9.5.0 (Kotlin DSL).
- Kotlin 2.3.21.
- Versions and plugin coordinates live in `gradle/libs.versions.toml`; the
  test deps are exposed as the `junit5` bundle.
- Tests use `kotlin-test-junit5` + `junit-jupiter-engine` via JUnit Platform.
- `settings.gradle.kts` mirrors the parent project: `gradlePluginPortal()` +
  `mavenCentral()` for plugins, `mavenCentral()` only for dependencies (with
  `FAIL_ON_PROJECT_REPOS`), and the foojay toolchain resolver for JDK
  provisioning.
