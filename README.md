# Banking Application

## Overview
The **Banking Application** is a RESTful API project built with Java 17 and the Spring Framework. It allows users to perform essential banking operations, including creating bank accounts, viewing account details, depositing and withdrawing funds, transferring money between accounts, and viewing transaction histories.

## Features
- **Account Management**: Create, retrieve, update, and delete bank accounts.
- **Deposits and Withdrawals**: Securely deposit and withdraw funds from accounts, with transaction records.
- **Fund Transfers**: Transfer funds between accounts with transaction history.
- **Transaction History**: View detailed transaction histories for each account.

## Technologies Used
- **Java 17**: Backend development language.
- **Spring Framework**: For building the RESTful API.
- **Maven**: Dependency management tool.

## Getting Started

### Prerequisites
- Ensure **Java 17** and **Maven** are installed on your machine.
- Clone the repository:
  ```bash
  git clone https://github.com/sanjaysamsoth/banking-app.git
- Navigate to the project directory:
  ```bash
  cd banking-app
## Running the Application
1. Build the project using Maven:
   ```bash
   mvn clean install
2. Run the application:
   ```bash
   mvn spring-boot:run
3. Access the API at http://localhost:8080.
## API Endpoints

| Method | Endpoint                           | Description                           |
|--------|------------------------------------|---------------------------------------|
| POST   | `/api/accounts`                    | Create a new bank account             |
| GET    | `/api/accounts/{id}`               | Retrieve account details by ID        |
| PUT    | `/api/accounts/{id}/deposit`       | Deposit funds into an account         |
| PUT    | `/api/accounts/{id}/withdraw`      | Withdraw funds from an account        |
| GET    | `/api/accounts`                    | Retrieve a list of all accounts       |
| DELETE | `/api/accounts/{id}`               | Delete an account                     |
| POST   | `/api/accounts/transfer`           | Transfer funds between accounts       |
| GET    | `/api/accounts/{id}/transactions`  | Retrieve transaction history          |
## Example Requests

### Create a New Account
- **Method**: POST
- **Endpoint**: `/api/accounts`
- **Body**:
    ```json
    {
      "accountHolderName": "Sandeep",
      "balance": 20000
    }
    ```

### Deposit Funds
- **Method**: PUT
- **Endpoint**: `/api/accounts/{id}/deposit`
- **Body**:
    ```json
    {
      "amount": 5000
    }
    ```

### Withdraw Funds
- **Method**: PUT
- **Endpoint**: `/api/accounts/{id}/withdraw`
- **Body**:
    ```json
    {
      "amount": 200
    }
    ```

### Transfer Funds
- **Method**: POST
- **Endpoint**: `/api/accounts/transfer`
- **Body**:
    ```json
    {
      "fromAccountId": 1,
      "toAccountId": 2,
      "amount": 150
    }
    ```
## How to Test the API Using Postman
1. **Install Postman**: Download and install Postman from postman.com.
2. **Import Endpoints**: Add the endpoints manually or import them if you have a collection file.
3. **Testing API Endpoints**:
   - Select the desired endpoint.
   - Set the request type (GET, POST, etc.), and input the required parameters or request body.
   - Click **Send** to make the request and view the response.
## Acknowledgments
- Inspired by various banking systems and APIs.
- Special thanks to the Spring Framework developers for their amazing tools.



       
  



   
  

