# FlexServe

## Overview

This project demonstrates the usage of OpenAPI 3.0 with inheritance and modularization for defining an API specification. It follows best practices for organizing the OpenAPI specification into separate, reusable components to enhance maintainability and reusability.
Key Concepts:

### Inheritance
The API uses the allOf keyword to implement schema inheritance, where specialized types like Car and Truck inherit from a base Vehicle schema.

### Modularization
The OpenAPI specification is split into multiple files. The main file (vehicle-api.yaml) references external schema files using $ref, allowing easy reuse of schemas across different parts of the API or other APIs.