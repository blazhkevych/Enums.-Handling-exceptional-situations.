# Bank and ATM System

## Task Description

Develop a banking system comprising a Bank class that owns a network of ATMs. The Bank class should have a field to determine the number of ATMs in the network. Define operations for initializing the ATM network, which involves creating ATMs and loading a specified amount of money into them. Implement a method to determine the total amount of money in the ATM network.

### Bank Class

The Bank class should include the following functionalities:

- Initialization of the ATM network.
- Loading a specific amount of money into the ATMs.
- Calculation of the total amount of money in the entire ATM network.

### ATM Class

The ATM class should have the following features:

- The current amount of money available in the ATM, represented by specific denominations of banknotes (1, 2, 5, 10, 20, 50, 100, 200, 500 Ukrainian Hryvnia).
- For each banknote denomination, specify the quantity of banknotes.
- Storage of the minimum withdrawal amount and the maximum number of banknotes that can be dispensed.
- Initialization method for loading money into the ATM.
- Manual input method for a specific sum using the banknote receiver.
- Withdrawal method for dispensing money from the ATM, minimizing the quantity of banknotes.

### Exception Handling

Implement a hierarchy of custom exceptions and generate/ handle the required exceptions as needed.