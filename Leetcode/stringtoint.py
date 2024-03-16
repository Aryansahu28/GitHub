s = "42"
a = s.split(" ")
for s1 in a:
    try:
        if a[len(a)-1].isnumeric()==True:
            print(0)
            break
        else:
         print(int(s1))
    except:
        continue
    


    

    