# Telco Promo – Visitor Pattern Demo

A simple Java application demonstrating the **Visitor Design Pattern** to handle different telecommunication promotions and unlimited call/text offers from three providers: **Smart**, **Globe**, and **Ditto**.

## Problem Description

Three telco providers offer the following plans:

- **Smart**  
  ₱500/month → 15 GB data  
  No unlimited calls or texts (charged per use)

- **Globe**  
  ₱450/month → 10 GB data  
  Unlimited calls & texts **within Globe/TM network** only

- **Ditto**  
  ₱400/month → 8 GB data  
  Unlimited calls & texts **to all networks**

The program uses the **Visitor pattern** to:
- Display data allowance offers and prices
- Show unlimited calls & texts package details

without modifying the `Telco` class structure when adding new promotion types.

## Project Structure

```
.
├── TelcoPromo.java           # Main class with demo
├── Telco.java                # Concrete element (telco subscription)
├── TelcoSubscription.java    # Element interface
├── UsagePromo.java           # Visitor interface – data allowance
├── UnliCallTextOffer.java    # Visitor interface – unli calls/texts
├── TelcoAllowance.java       # Concrete visitor – shows data promos
└── UnliCallTextPackage.java  # Concrete visitor – shows unli offers
```

## Features

- Clean separation of concerns using Visitor pattern
- Double-dispatch via `accept()` methods
- Easy to extend with new promotion types (add new Visitor)
- No modification needed to existing telco plan classes when adding features

## Sample Output

```
Smart Data Usage Offer and price: Smart offers 15GB for ₱500 per month
Globe Data Usage Offer and priceGlobe offers 10GB for ₱450 per month
Ditto Data Usage Offer and priceDitto offers 8GB for ₱400 per month

Smart unlimited calls and text package: Smart - No unlimited calls & texts package
Globe unlimited calls and text package: Globe - Unlimited calls & texts to Globe/TM network only
Ditto unlimited calls and text package: Ditto - Unlimited calls & texts to all networks
```

## How to Run

1. Make sure you have **Java 8 or higher** installed
2. Compile all `.java` files:

```bash
javac *.java
```

3. Run the main class:

```bash
java TelcoPromo
```

## Design Notes

- **Telco** acts as the **Element**
- `UsagePromo` and `UnliCallTextOffer` are **Visitor** interfaces
- `TelcoAllowance` and `UnliCallTextPackage` are concrete visitors
- Each telco plan accepts visitors and delegates the behavior

This structure follows the class diagram commonly used in academic exercises to teach the Visitor pattern.

## Possible Extensions

- Add more telco providers
- Add new promotion types (e.g. `RoamingPromo`, `StreamingPromo`)
- Add discount calculation visitor
- Support yearly subscription pricing
- Add unit tests (JUnit)

## License

Feel free to use for learning, assignments, or personal projects.

Happy coding! 🚀
```

You can copy-paste this directly into a file named `README.md`.

Let me know if you'd like to add sections like:
- UML diagram (text-based or link)
- Prerequisites / Java version
- Class diagram image
- Contribution guidelines
- etc.

Just tell me what style or additional info you want! 😄