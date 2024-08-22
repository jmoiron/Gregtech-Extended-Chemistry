
all:
	gradlew build

data:
	rm -rf bin/main
	gradlew runData

clean:
	gradlew clean
