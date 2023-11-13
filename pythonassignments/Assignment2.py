x = input("Enter a two letter string: ")

separated_letter = x.split(" ")

if separated_letter[0][0].upper() == separated_letter[1][0].upper():
    print(True)

else:
    print(False)