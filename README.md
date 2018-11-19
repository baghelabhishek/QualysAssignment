# QualysAssignment
problem statement 

The service will be accepting requests from multiple self-­service terminals.
• Customers can select one or more Pizzas from the menu and then customize them with
available options.

• Customers should be able to select a type of crust and add extra toppings.

• Customers should be able to verify their order, check the amount and place the order Once
the order is received service will verify the business rules and confirm the order. Payment
/order processing workflow is intentionally skipped here to keep it simple.

• Customers can also place side orders along with the pizza order.

• The “PizzaFactory” ensures that appropriate inventory is available before allowing
customers to proceed with their orders. It also makes best efforts to utilize inventory in an
optimal manner to fulfill maximum orders.

• Customers can’t cancel the order once it is placed.

• The vendor can restock inventory through “PizzaFactory” service.

• The vendor should be able to add new pizzas, toppings, sides and also change prices.

• The design should require minimal changes in the code while adding new business rules.



The menu:

Vegetarian Pizza:


Ø Deluxe Veggie:
(Regular: Rs. 150 Medium: Rs. 200 Large: Rs. 325)
Ø Cheese and corn: 
(Regular: Rs. 175 Medium: Rs. 375 Large: Rs. 475)
Ø Paneer Tikka: 
(Regular: Rs. 160 Medium: Rs. 290 Large: Rs. 340)


Non-­Vegetarian:
Ø Non-­Veg Supreme: (Regular: Rs 190 Medium: Rs 325 Large: Rs 425)
Ø Chicken Tikka: (Regular: Rs 210 Medium: Rs 370 Large: Rs 500)
Ø Pepper Barbecue Chicken (Regular: Rs 220 Medium: Rs 380 Large: Rs 525)


Type of crust:

Ø New hand tossed
Ø Wheat thin crust
Ø Cheese Burst
Ø Fresh pan pizza

Extra toppings:

Veg toppings:

Ø Black olive (Rs 20)
Ø Capsicum (Rs 25)
Ø Paneer (Rs 35)
Ø Mushroom (Rs 30)
Ø Fresh tomato (Rs 10)

Non-­Veg toppings:

Ø Chicken tikka (Rs 35)
Ø Barbeque chicken (Rs 45)
Ø Grilled chicken (Rs 40)

Extra cheese: (Rs 35)

Sides:

Ø Cold drink (Rs 55)
Ø Mousse cake (Rs. 90)

Business rules:

● Vegetarian pizza cannot have a non-­vegetarian topping.

● Non-­vegetarian pizza cannot have paneer topping.

● Only one type of crust can be selected for any pizza.

● You can add only one of the non-­veg toppings in non-­vegetarian pizza.

● Large size pizzas come with any 2 toppings of customers choice with no additional cost.
