Problem#1 : Add a “IPad Pro” to a Cart

Problem#2: Add a “Hero ink Pen” to a Cart

Problem#3: Add 2 qty of  “ GM Cricket bat” to Cart.

Problem#4: Remove already added Item “IPad Pro”( with all quantities)  from cart.

Problem#5: As a business User I would like to know which Products (product name) were removed from Cart.

Problem#6: As a business User, I would like to differentiate between two Carts.
*  Two carts where items are same, equality on Carts should return false

Cart cart1 = new Cart()

Cart cart2 =  new Cart()


Item item1 = new Item((Product("Ipad"), 1))

Item item2 = new  Item((Product("Ipad"), 1))

cart1.add(item1)

cart2.add(item2)


cart1.equals(cart2)  should be false*

Problem#7  Add Price to a Product . We need support for only one currency, say - USD.

Note – 
 For modelling currency - Please use java.util.Currency (Currency.getInstance("USD"))  or what your programming language provides, if none just use String for now.
 new Product("Apple Pencil", new Price(...));
 
 Problem #8 - As a Business User I would like price my product 10% below competitor price (competitor price is available for product) .
Assume that HashMap of Competitor Product Name and price is available. Competitor name matches 1 to 1 with our Product Name
new Product( "name", Price(discountedPrice, "USD")) new Product( "name", Price(10, "USD"))

