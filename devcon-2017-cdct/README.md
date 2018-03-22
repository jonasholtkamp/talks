# Testing the consumer
1. C: `mvn test`                → failure
1. P: `mvn install -DskipTests` → success, stubs installed
1. C: `mvn test`                → success

# Testing the provider
1. P: `mvn test`                → success

# Altering the results...
1. Change contract
1. P: `mvn test`                → failure
1. P: `mvn install -DskipTests` → success, stubs installed
1. C: `mvn test`                → failure