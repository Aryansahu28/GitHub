temp = int(input("Enter the temperature: "))

scale = input("Choose a scale(C or F): ")

if scale == "C" or scale == "c":
    print(f"The temperature in Celsius is {(temp-32)*(5/9)}")

elif scale == "f" or scale == "F":
    print(f"The temperature in Farenheit is {(temp*(9/5))+32}")

else:
    print("Invalid Input")
