## Requirement 1
### Add products to the shopping cart.
### Given:
An empty shopping cart.  

And a product, Dove Soap with a unit price of 39.99
### When:
The user adds 5 Dove Soaps to the shopping cart
### Then:
The shopping cart should contain 5 Dove Soaps each with a unit price of 39.99  

And the shopping cart’s total price should equal 199.95

## Requirement 2 
### Add additional products of the same type to the shopping cart.
### Given:
An empty shopping cart  

And a product, Dove Soap with a unit price of 39.99
### When:
The user adds 5 Dove Soaps to the shopping cart  

And then adds another 3 Dove Soaps to the shopping cart
### Then:
The shopping cart should contain 8 Dove Soaps each with a unit price of 39.99  

And the shopping cart’s total price should equal 319.92

## Requirement 3
### Add additional products of different type to the shopping cart.
### Given:
An empty shopping cart  

And a product, Dove Soap with a unit price of 39.99  

And another product, Axe Deo with a unit price of 99.99
### When:
The user adds 2 Dove Soaps to the shopping cart  

And then adds 3 Axe Deo’s to the shopping cart
### Then:
The shopping cart should contain 2 Dove Soaps each with a unit price of 39.99  

And the shopping cart should contain 3 Axe Deo’s each with a unit price of 99.99  

And the shopping cart’s total price should equal 379.95

## Requirement 4
### Calculate the tax rate of the shopping cart with multiple items
### Given:
An empty shopping cart  

And a product, Dove Soap with a unit price of 39.99  

And another product, Axe Deo with a unit price of 99.99  

And a tax rate of 12.5%
### When:
The user adds 2 Dove Soaps to the shopping cart  

And then adds 2 Axe Deo’s to the shopping cart  

### Then:
The shopping cart should contain 2 Dove Soaps each with a unit price of 39.99  

And the shopping cart should contain 2 Axe Deo’s each with a unit price of 99.99  

And the total tax amount should equal 35.00  

And the shopping cart’s total price should equal 314.96