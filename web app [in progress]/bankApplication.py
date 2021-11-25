



class BankAccount:
    def __init__(self) -> None:
        self.balance = 0
        self.previousTransaction = 0
        self.customerName = ''
        self.customerId = ''


    def account(self, cname, cid):
        self.customerName, self.customerId = cname, cid
    
    def deposit(self, amount):
        # if the amount is a positive integer
        if amount != 0:
            self.balance += 1
            self.previousTransaction = amount 
    
    def withdraw(self, amount):
        # if the amount is a positive integer
        if amount != 0:
            self.balance -= amount
            self.previousTransaction = -amount
    
    def getPreviousTransaction(self):
        if self.previousTransaction > 0:
            # if account holder deposited
            return 'Amount deposited: ' + self.previousTransaction
        elif self.previousTransaction < 0:
            # if account holder withdrew
            return 'Amount withdrawn: ' + abs(self.previousTransaction)
        else:
            # if there is no transaction
            return 'There was no transaction.'
    
    def showMenu(self):
        print('Welcome ' + self.customerName)
        print('Your ID is ' + self.customerId)
        print('\n')
        print('A. Check Balance.')
        print('B. Deposit.')
        print('C. Withdraw.')
        print('D. Previous Transaction.')
        print('E. Exit.')
        print('=============================================================')
        option = input('Enter an option: ').upper()
        print('=============================================================')
        print('\n')

        while option != 'E':
            # Check Balance
            if option == 'A':
                print('-----------------------------------------------------')
                print('Account balance: ' + self.balance)
                print('-----------------------------------------------------')


        return 'Thank you for using our services!'