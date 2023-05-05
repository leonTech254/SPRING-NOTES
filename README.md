# SPRING-NOTES

## API LAYER

Spring Boot-popular framework for building web applications and RESTful APIs. It comes with a lot of built-in features and tools that make it easy to develop and deploy APIs quickly.

Steps to build an API layer

<ul>
<li>Define your API endpoints-Define the endpoints that your API will expose. This includes the URL paths and HTTP methods that clients can use to interact with your API.</li>
<li>Create a controller-a <b>controller</b>  is a class that handles incoming requests and sends back responses. You can annotate your controller class with @RestController to indicate that it will handle RESTful requests.</li>
<li>  Define your API methods-Within your controller class, define methods that will handle each API endpoint. Use annotations such as <b>@GetMapping, @PostMapping, @PutMapping, or @DeleteMapping</b> to map your methods to specific HTTP methods and URL paths.</li>
<li>Define request and response objects-Create Java classes to represent the request and response objects that your API will use. These classes should include any necessary fields, getters, and setters.</li>
</ul>

### Example

<pre>
<code>
@RestController
@RequestMapping("/api")
public class MyController {
 
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Leonteqsecurity!";
    }
}
</code>
</pre>

## SERVICE/BUSINESS LOGIC LAYER
