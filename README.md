🥰 Below are 3 challenges designed to help you break and fix Spring's Dependency Injection.

### Challenge 1: The "Ambiguity" Conflict
Goal: Learn how Spring handles multiple implementations of the same interface.

- Create a second service class named VietnameseGreetingService that implements GreetingService.

- Return "Xin chào từ Spring Boot!" in the getGreeting() method.

- Annotate this class with @Service.

- Try to run your application.

Task: The app will fail to start. Fix it by adding the @Primary annotation to the VietnameseGreetingService class.

Verification: Refresh your browser at localhost:8080/greet and see if the language changes to Vietnamese.

### Challenge 2: Using the @Qualifier Annotation
Goal: Learn how to inject a specific bean without using @Primary.

- Remove the @Primary annotation from the previous challenge.

- In your GreetingController, modify the constructor to use @Qualifier.

Hint: Your constructor should look like this:
public GreetingController(@Qualifier("englishGreetingService") GreetingService service) { ... }

Task: Change the value inside @Qualifier to switch between englishGreetingService and vietnameseGreetingService (Note: Spring bean names are camelCase by default).

Verification: Ensure the controller returns the specific language you requested in the @Qualifier.

### Challenge 3: Injected Properties with @Value
Goal: Learn that DI isn't just for classes, but also for configuration data.

- Open the file src/main/resources/application.properties.

- Add a line: app.custom.message=This is a secret message from properties!.

- In your EnglishGreetingService, create a private String field:
@Value("${app.custom.message}") private String secretMessage;

- Update the getGreeting() method to return this secretMessage.

Task: Change the message in the .properties file and restart the app.

Verification: Check if the API response updates without you changing any Java code.

### Answers are in these branchs: practice1, practice2, practice3