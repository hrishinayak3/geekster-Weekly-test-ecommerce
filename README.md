# Read Me First

# Ecommerce API Spring Project

This project is an Ecommerce API built using Spring Framework with a MySQL database. It provides endpoints to manage users, products, addresses, and orders.

### properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update


spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true


# Models
###  User
* Id: Integer (auto-generated)
* name: String
* email: String
* password: String
* phoneNumber: String
### Product

- `id`: Integer (auto-generated)
- `name`: String
- `price`: Integer
- `description`: String
- `category`: String
- `brand`: String

### Address

- `id`: Integer (auto-generated)
- `name`: String
- `landmark`: String
- `phoneNumber`: String
- `zipcode`: String
- `state`: String
- `UserID`: Integer (foreign key mapping)

### Order

- `id`: Integer (auto-generated)
- `userID`: Integer (foreign key mapping)
- `productID`: Integer (foreign key mapping)
- `addressID`: Integer (foreign key mapping)
- `productQuantity`: Integer

## Create

### Create Product

- **Endpoint**: `POST /products`

- **Request Body**:
    ```json
    {
      "name": "Product Name",
      "price": 100,
      "description": "Product Description",
      "category": "Category",
      "brand": "Brand"
    }
    ```

- **Response**:
    ```json
    {
      "id": 1,
      "name": "Product Name",
      "price": 100,
      "description": "Product Description",
      "category": "Category",
      "brand": "Brand"
    }
    ```

### Create Address

- **Endpoint**: `POST /addresses`

- **Request Body**:
    ```json
    {
      "name": "John Doe",
      "landmark": "Landmark",
      "phoneNumber": "1234567890",
      "zipcode": "12345",
      "state": "State",
      "UserID": 1
    }
    ```

- **Response**:
    ```json
    {
      "id": 1,
      "name": "John Doe",
      "landmark": "Landmark",
      "phoneNumber": "1234567890",
      "zipcode": "12345",
      "state": "State",
      "UserID": 1
    }
    ```
---

## Create

### Create Address

- **Endpoint**: `POST /addresses`

- **Request Body**:
    ```json
    {
      "name": "John Doe",
      "landmark": "Landmark",
      "phoneNumber": "1234567890",
      "zipcode": "12345",
      "state": "State",
      "UserID": 1
    }
    ```

- **Response**:
    ```json
    {
      "id": 1,
      "name": "John Doe",
      "landmark": "Landmark",
      "phoneNumber": "1234567890",
      "zipcode": "12345",
      "state": "State",
      "UserID": 1
    }
    ```

### Create Order

- **Endpoint**: `POST /orders`

- **Request Body**:
    ```json
    {
      "userID": 1,
      "productID": 1,
      "addressID": 1,
      "productQuantity": 2
    }
    ```

- **Response**:
    ```json
    {
      "id": 1,
      "userID": 1,
      "productID": 1,
      "addressID": 1,
      "productQuantity": 2
    }
    ```

## Get

### Get Order by Order ID

- **Endpoint**: `GET /orders/{orderId}`

### Get User by User ID

- **Endpoint**: `GET /users/{userId}`

### Get All Products

- **Endpoint**: `GET /products`

### Get Products by Category

- **Endpoint**: `GET /products?category={category}`

## Delete

### Delete Product by Product ID

- **Endpoint**: `DELETE /products/{productId}`

## How to Use

### Create

#### Create Address

To create an address, make a POST request to `/addresses` with the following request body:

```json
{
  "name": "John Doe",
  "landmark": "Landmark",
  "phoneNumber": "1234567890",
  "zipcode": "12345",
  "state": "State",
  "UserID": 1
}
```

## Thank you


