Feature: E2E adding product to cart
  Scenario:  Adding a product to Cart
    Given Landing on home page
    When filter for laptop
		 And Add the laptop to cart
    Then Validating if its added or not
    

 