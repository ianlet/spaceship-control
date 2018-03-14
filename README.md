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
