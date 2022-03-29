<h1 align="center">Asiacar Test</h1>

<p align="center">Technical assessment for Europcar</p>

## General design

* *Domain Driven Design* (DDD).
* *Command Query Responsibility Segregation* (CQRS) patterns. Since no infrastructure implementation is required, no
  command nor query buses have been implemented.
* *Test Driven Design* (TDD).
* *Behaviour Driven Design* (BDD).

#### Observations

It is also common now to name the property value accessor methods just with the name of the property, but I prefer to
keep the "get" verb, as I prefer that kind of "legacy" readability. But it is just a personal preference.

For the rest of the code, I just try to keep it as readable and as simple as possible.

## Use cases

* Register vehicle
* Register vehicle device
* Record battery level
* Record fuel level variation
* Record current mileage
* Query battery level
* Query fuel level
* Query mileage

## Testing

Unit tests mainly for the vehicle domain validations. Some testing tools have been made to ease the testing
implementations, such as type mothers. The testing packages do follow the same structure as the source packages.

As no infrastructure implementations are required, there are no integration nor end-to-end tests.

## Deployment

Since Kotlin is fully compatible with Java, a nice way to get this application deployed would be to use Spring Boot,
which would reduce all the boilerplate. Optionally, we could put this Spring Boot application inside a Docker container,
so we do not couple the app infrastructure with the server configurations. This way we would improve the overall
scalability and maintainability.

If we don't want to use Docker, we will need to install the proper JVM in the server, and run the application build.

As it is designed to be a web API, in all cases, we should use a proper gateway.
