# Team Software Engineering - Spaceship Control

### Usage

Create the containers with docker-compose. It creates an image mounted with
your sources so you don't have to rebuild it everytime and it links it with a
container running MongoDB.

```sh
docker-compose up -d
```

Then run the acceptance tests to verify your progress with the following
command:

```sh
docker start -a spaceship-control
```

You may want to change the `TEAM_TOKEN` defined in `spaceship.env`.

If you already have a running MongoDB on your machine with default
host (localhost) and port (27017) and you want to use it, you can simply
execute the following command to run the acceptance tests:

```sh
./gradlew accept -DteamToken=YOUR_TOKEN
```

Or you can also start a standalone container running MongoDB so you can use
your preferred IDE to run/debug the gradle `accept` task. The following command
will run a MongoDB container listening on `127.0.0.1:27017`:

```sh
docker run --name mongo -d -p 27017:27017 mongo
```

_Note: Mongo is only used to run the acceptance tests. You might not have to use
it in the `spaceship-control`._

### Development

The entry point of the `spaceship-control` is `src/main/java/org/csgames/spaceship/control/app/EventAppService.java`.
This is where you will have to rewrite the core features of our spaceship.

Good luck! :penguin: :rocket:
