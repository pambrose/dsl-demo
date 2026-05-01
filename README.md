# dsl-demo

Companion code for the Kotlin DSL section of the kslides talk. The sources walk
through the building blocks used to assemble a type-safe builder DSL in Kotlin —
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
make versioncheck    # report dependency updates
```

## Tooling

- Gradle 9.5.0 (Kotlin DSL).
- Kotlin 2.3.21.
- Versions and plugin coordinates live in `gradle/libs.versions.toml`.
- Tests use `kotlin-test-junit5` + `junit-jupiter-engine` via JUnit Platform.
