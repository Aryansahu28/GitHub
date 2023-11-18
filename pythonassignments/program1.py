import datetime

current_time = datetime.datetime.now().year

year_of_birth = int(input("Enter your year of birth: "))


age = current_time - year_of_birth

print("Your age is ",age)

