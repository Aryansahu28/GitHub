x =int(input("Enter the 1st number: "))
y = int(input("Enter the 2nd number: "))
def checking_size():
    if x%2==0 and y%2==0:
        if x>y:
            print(f"{y}")
        else:
            print(f"{x}")

    elif (x%2==0 and y%2!=0) or (y%2==0 and x%2!=0) :
        print("You enter one odd and one even so please enter either both even or both odd")


    else:
        if x<y:
            print(f"{y}")

        else:
            print(f"{x}") 
