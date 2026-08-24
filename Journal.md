# Journal
Phase-1:
For itemValue and itemName is because the data should not be changed from outside the class. Then I used public for constructor and toString methods so other classes can create and access the VaultItem safely. Using private attributes provides the better facts and help prevent accidental changes to objects data.
Phase-2: 
I used the super cell to send the item name and value to the VaultItem constructor. Which then initalize those attributes. Another possible way os to make the attributes in VaultItem protected, which will allow the superclass to directly access them.
Phase-3:
It effects my subclass because FragileItem is calling the VaultItem constructor using super(). If their is a invalid value entered when creating a FragileItem, the InvalidItemValueException will be able to thrown. Its a good way because it prevents the items with a value of $0 or less from entering the system.
Phase-4:
The selection sort has the worst case. This measns that the number of comparisons increased the with the number of items. If we would of doubled the items, the number of the comparisons would increase about four times. The selection sort works by repeating the smallest item and moving it towards the correct position.
