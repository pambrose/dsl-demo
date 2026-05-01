.PHONY: default clean stop build versioncheck upgrade-wrapper

default: versioncheck

clean:
	./gradlew clean

stop:
	./gradlew --stop

build:
	./gradlew build -xtest

versioncheck:
	./gradlew dependencyUpdates --no-configuration-cache --no-parallel

upgrade-wrapper:
	./gradlew wrapper --gradle-version=9.5.0 --distribution-type=bin
