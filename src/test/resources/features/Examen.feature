@login2
  Feature: Carrito de Compras

  Scenario Outline: Validar que los productos sean agregados correctamente al carrito de compras
    Given que estoy en la aplicación de SauceLabs
    And valido que los productos carguen correctamente en la galería
    When agrego "<UNIDADES>" del producto "<PRODUCTO>"
    Then valido que el carrito de compra se actualice correctamente
    Examples:
      | UNIDADES | PRODUCTO |
      | 1        | Sauce Labs Backpack|
      | 1        | Sauce Labs Bolt T-Shirt|
      | 2        | Sauce Labs Bike Light  |