# The-Ledger---A-Capstone-Project

This is my first Capstone Project completed during the Year Up United Software Development Bootcamp.

# Financial Transaction Tracker

A Java-based Command Line Interface (CLI) application for tracking personal or business financial transactions.

## Overview

This application allows users to easily record, manage, and analyze financial transactions through a simple text-based interface. All transactions are stored in a CSV file for persistence between sessions.


## Features

- **Transaction Management**: Add deposits and payments with complete transaction details
- **Comprehensive Ledger**: View all transactions with newest entries displayed first
- **Filtered Views**: Easily filter to see only deposits or payments
- **Detailed Reports**: Generate predefined reports including:
  - Month-to-date transactions
  - Previous month transactions
  - Year-to-date transactions 
  - Previous year transactions
- **Search Functionality**: Find transactions by vendor name
- **Data Persistence**: All transactions are automatically saved to a CSV file (transactions.csv)


## Transaction Format

Each transaction is stored with the following fields:
```
date|time|description|vendor|amount
```

Example:
```
2023-04-15|10:13:25|ergonomic keyboard|Amazon|-89.50
2023-04-15|11:15:00|Invoice 1001 paid|Joe|1500.00
```

## Navigation

The application features an intuitive menu-based navigation system:
- **Home Screen**: Access main functions (add deposit, make payment, view ledger, exit)
- **Ledger Screen**: View transactions and access reporting options
- **Reports Screen**: Generate standard reports or perform custom searches

## Usage

Run the application and follow the on-screen prompts to navigate between screens and perform actions. The application continues running until explicitly exited through the home screen.



## Screenshots

![HomeScreenCode](https://drive.google.com/file/d/1R4vriOmmLJvT9fI5C1_otZIOveYblz7u/view?usp=sharing)
![LedgerScreenCode](https://drive.google.com/file/d/1qWdp9oYAgUQQQrdsjCqBiiLZ6zOQP8bi/view?usp=sharing)
![ReportsScreenCode](https://drive.google.com/file/d/1rN4QsDDkhdzMltELwD0gCQGKipjcSKH4/view?usp=sharing)
![Home,Ledger,andReportsScreens](https://drive.google.com/file/d/1t7qqImyhU0Wb4sy0mukCXEHU63s3GkPD/view?usp=sharing)
![ArrayListCode](https://drive.google.com/file/d/172LZkxI1CZfmAZSeC7IYx3ic4nAQfWI5/view?usp=sharing)
![AddDepositCode](https://drive.google.com/file/d/1RaKw7zrWcVTxxEMEls0md18rzAetj7OM/view?usp=sharing)
![UpdatingFileCode](https://drive.google.com/file/d/17w-CyQndNs5M6_hYyL1RsChvY_oBcV6o/view?usp=sharing)
![FormattingTransactionTextCode](https://drive.google.com/file/d/1jtinxmRPC2rKES0WWXyVS0IzhnDly2Kf/view?usp=sharing)
## License

[MIT](https://choosealicense.com/licenses/mit/)

